package com.demo.domain;

import static java.util.Arrays.asList;
import static org.junit.Assert.*;
import static com.demo.domain.BusinessComponent.*;

import org.junit.Test;

public class BusinessComponentTest {

	BusinessComponent service = new BusinessComponent();
	@Test
	public void findTransactionsIn2011Test() {
		assertTrue(asList(transactions.get(0), transactions.get(2)).equals(service.findTransactionsIn2011()));
	}
	@Test
	public void getUniqueCitiesOfTradersTest() {
		assertTrue(asList(raoul.getCity(), mario.getCity()).equals(service.getUniqueCitiesOfTraders()));
	}
	@Test
	public void getTradersFromCambridgeTest() {
		assertTrue(asList(alan, brian, raoul).equals(service.getTradersFromCambridge()));
	}
	@Test
	public void getTraderNamesAsStringTest() {
		assertEquals("Alan,Brian,Mario,Raoul", service.getTraderNamesAsString() );
	}
	@Test
	public void areTradersInMilanTest() {
		assertTrue(service.areTradersInMilan());
	}
	@Test
	public void getTransactionsValuesFromTradersInCambridgeTest() {
		assertTrue(asList(300, 400, 950, 1000).equals(service.getTransactionsValuesFromTradersInCambridge()));	
	}
	@Test
	public void findMaxTransactionValueTest() {
		assertEquals(1000, service.findMaxTransactionValue());	
		
	}

}
