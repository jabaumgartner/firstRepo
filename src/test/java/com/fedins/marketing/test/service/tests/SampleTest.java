package com.fedins.marketing.test.service.tests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.test.annotation.Rollback;

@ContextConfiguration(locations = "classpath:tests-context.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@Rollback(false)
@ActiveProfiles("test")
public class SampleTest {

	// @Autowired
	// WhateverService whateverService;

	public SampleTest() {
		// TODO Auto-generated constructor stub
	}

	@Test
	@Transactional
	public void testTheUnit() throws Exception {
		// whateverService.getAllOfThem();
	}

	@Test
	@Transactional
	public void testUpdate() throws Exception {
		// Whatever myWhatever = whateverService.getWhatever("sparky");
		// myWhatever.setCity("Sparkyville");
	}

}
