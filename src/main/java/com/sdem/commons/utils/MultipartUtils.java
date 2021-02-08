package com.sdem.commons.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItem;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.client.MultipartBodyBuilder;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class MultipartUtils {

	private static final Logger logger = LoggerFactory.getLogger(MultipartUtils.class);

	private MultipartUtils() {
		// Utility class
	}

	public static void addMultipartToBody(byte[] file, MultipartBodyBuilder body, String partName, String fileName) {
		if (file != null) {
			ByteArrayResource resource = new ByteArrayResource(file) {
				@Override
				public String getFilename() {
					return fileName;
				}
			};

			body.part(partName, resource);
		}
	}

	public static void addMultipartToBody(MultipartFile multipartFile, MultipartBodyBuilder body, String partName) {
		try {
			if (multipartFile != null) {
				addMultipartToBody(multipartFile.getBytes(), body, partName, multipartFile.getOriginalFilename());
			}
		} catch (IOException e) {
			logger.error("Problem adding multipart to body", e);
		}
	}

	public static MultipartFile buildMultipartFile(String fileId, String filePath, InputStream fileFromObjectStorage) {
		try {
			String fileExtension = FilenameUtils.getExtension(filePath);

			File tmpFile = File.createTempFile(fileId + "_medicalfile_",
					StringUtils.isBlank(fileExtension) ? "tmp" : fileExtension);
			FileUtils.copyInputStreamToFile(fileFromObjectStorage, tmpFile);

			return convertFileToMultipart(filePath, tmpFile);
		} catch (Exception e) {
			logger.error("Problem creating a multipart file", e);
		}

		return null;
	}

	private static CommonsMultipartFile convertFileToMultipart(String filePath, File tmpFile) {
		try (InputStream fis = new FileInputStream(tmpFile)) {
			FileItem fileItem = new DiskFileItem("medical_field", Files.probeContentType(tmpFile.toPath()), false,
					FilenameUtils.getName(filePath), (int) tmpFile.length(), tmpFile.getParentFile());

			IOUtils.copy(fis, fileItem.getOutputStream());

			return new CommonsMultipartFile(fileItem);
		} catch (IOException e) {
			logger.error("Problem creating a multipart file", e);
		}

		return null;
	}

}
