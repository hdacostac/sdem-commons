package com.gvt.commons.dto.v1.patient;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.gvt.commons.annotations.ExtendedEmailValidator;
import com.gvt.core.domain.types.Identificable;
import com.gvt.core.domain.types.VersionableDTO;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PatientDTO implements Identificable, VersionableDTO, Serializable {

	private static final long serialVersionUID = -8293952137314357678L;

	private Long id;

	@Size(max = 16)
	private String code;

	@NotNull
	@Size(max = 64)
	private String name;

	@NotNull
	@Size(max = 64)
	private String lastName;

	@NotNull
	private Long identityDocumentTypeId;

	@NotNull
	@Size(max = 64)
	private String identityDocument;

	@Size(max = 64)
	private String sanitaryDocument;

	@NotNull
	@Size(max = 32)
	private String mobilePhone;

	@Size(max = 32)
	private String homePhone;

	@ExtendedEmailValidator
	@Size(max = 64)
	private String email;

	@NotNull
	private String addressLine1;
	private String addressLine2;

//	@NotNull
	private Long provinceId;
//	@NotNull
	private Long municipalityId;
	@NotNull
	private Long postalCodeId;

	@Past
	private LocalDate birthDate;

	@Min(0)
	private Float age;

	private String url1FileName;

	private Long sexId;
	private Long bloodGroupId;
	private Long professionId;
	private Long countryBirthId;

	private List<FamilyRelationshipDTO> familyRelationships;

	private Long version;

//	public boolean hasBloodGroupId() {
//		return bloodGroupId != null && bloodGroupId != 0L ? true : false;
//	}
//
//	public boolean hasProfessionId() {
//		return professionId != null && professionId != 0L ? true : false;
//	}
//
//	public boolean hasCountryBirthId() {
//		return countryBirthId != null && countryBirthId != 0L ? true : false;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityDocument() {
		return identityDocument;
	}

	public void setIdentityDocument(String identityDocument) {
		this.identityDocument = identityDocument;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getHomePhone() {
		return homePhone;
	}

	public void setHomePhone(String homePhone) {
		this.homePhone = homePhone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Float getAge() {
		return age;
	}

	public void setAge(Float age) {
		this.age = age;
	}

	public String getUrl1FileName() {
		return url1FileName;
	}

	public void setUrl1FileName(String url1FileName) {
		this.url1FileName = url1FileName;
	}

	public Long getSexId() {
		return sexId;
	}

	public void setSexId(Long sexId) {
		this.sexId = sexId;
	}

	public Long getBloodGroupId() {
		return bloodGroupId;
	}

	public void setBloodGroupId(Long bloodGroupId) {
		this.bloodGroupId = bloodGroupId;
	}

	public Long getProfessionId() {
		return professionId;
	}

	public void setProfessionId(Long professionId) {
		this.professionId = professionId;
	}

	public String getSanitaryDocument() {
		return sanitaryDocument;
	}

	public void setSanitaryDocument(String sanitaryDocument) {
		this.sanitaryDocument = sanitaryDocument;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public Long getMunicipalityId() {
		return municipalityId;
	}

	public void setMunicipalityId(Long municipalityId) {
		this.municipalityId = municipalityId;
	}

	public Long getPostalCodeId() {
		return postalCodeId;
	}

	public void setPostalCodeId(Long postalCodeId) {
		this.postalCodeId = postalCodeId;
	}

	public Long getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	public Long getCountryBirthId() {
		return countryBirthId;
	}

	public void setCountryBirthId(Long countryBirthId) {
		this.countryBirthId = countryBirthId;
	}

	public Long getIdentityDocumentTypeId() {
		return identityDocumentTypeId;
	}

	public void setIdentityDocumentTypeId(Long identityDocumentTypeId) {
		this.identityDocumentTypeId = identityDocumentTypeId;
	}

	public List<FamilyRelationshipDTO> getFamilyRelationships() {
		return familyRelationships;
	}

	public void setFamilyRelationships(List<FamilyRelationshipDTO> familyRelationships) {
		this.familyRelationships = familyRelationships;
	}

	@Override
	public Long getVersion() {
		return version;
	}

	@Override
	public void setVersion(Long version) {
		this.version = version;
	}

	@Override
	public boolean isExternalDataSource() {
		return false;
	}

	@Override
	public void setExternalDataSource(boolean value) {

	}

	@Override
	public int hashCode() {
		return Objects.hash(addressLine1, addressLine2, age, birthDate, bloodGroupId, code, countryBirthId, email,
				familyRelationships, homePhone, id, identityDocument, identityDocumentTypeId, lastName, mobilePhone,
				municipalityId, name, postalCodeId, professionId, provinceId, sanitaryDocument, sexId, url1FileName,
				version);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientDTO other = (PatientDTO) obj;
		return Objects.equals(addressLine1, other.addressLine1) && Objects.equals(addressLine2, other.addressLine2)
				&& Objects.equals(age, other.age) && Objects.equals(birthDate, other.birthDate)
				&& Objects.equals(bloodGroupId, other.bloodGroupId) && Objects.equals(code, other.code)
				&& Objects.equals(countryBirthId, other.countryBirthId) && Objects.equals(email, other.email)
				&& Objects.equals(familyRelationships, other.familyRelationships)
				&& Objects.equals(homePhone, other.homePhone) && Objects.equals(id, other.id)
				&& Objects.equals(identityDocument, other.identityDocument)
				&& Objects.equals(identityDocumentTypeId, other.identityDocumentTypeId)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(mobilePhone, other.mobilePhone)
				&& Objects.equals(municipalityId, other.municipalityId) && Objects.equals(name, other.name)
				&& Objects.equals(postalCodeId, other.postalCodeId) && Objects.equals(professionId, other.professionId)
				&& Objects.equals(provinceId, other.provinceId)
				&& Objects.equals(sanitaryDocument, other.sanitaryDocument) && Objects.equals(sexId, other.sexId)
				&& Objects.equals(url1FileName, other.url1FileName) && Objects.equals(version, other.version);
	}

	@Override
	public String toString() {
		return "PatientDTO [id=" + id + ", code=" + code + ", name=" + name + ", lastName=" + lastName
				+ ", identityDocumentTypeId=" + identityDocumentTypeId + ", identityDocument=" + identityDocument
				+ ", sanitaryDocument=" + sanitaryDocument + ", mobilePhone=" + mobilePhone + ", homePhone=" + homePhone
				+ ", email=" + email + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", provinceId=" + provinceId + ", municipalityId=" + municipalityId + ", postalCodeId=" + postalCodeId
				+ ", birthDate=" + birthDate + ", age=" + age + ", url1FileName=" + url1FileName + ", sexId=" + sexId
				+ ", bloodGroupId=" + bloodGroupId + ", professionId=" + professionId + ", countryBirthId="
				+ countryBirthId + ", familyRelationships=" + familyRelationships + ", version=" + version + "]";
	}

}
