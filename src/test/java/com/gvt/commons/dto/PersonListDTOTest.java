package com.gvt.commons.dto;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gvt.commons.dto.v1.person.PersonListDTO;

public class PersonListDTOTest {

//	@ClassRule
//	public static Timeout globalTimeout = Timeout.millis(1500);

	private static final Logger logger = LoggerFactory.getLogger(PersonListDTOTest.class);

	@Test
	public void should_pass_all_pojo_tests() {
		// given
		final Class<?> personListHolder = PersonListDTO.class;

		// when

		// then
		assertPojoMethodsFor(personListHolder).areWellImplemented();
	}

}
