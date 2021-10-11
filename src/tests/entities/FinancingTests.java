package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Financing;

public class FinancingTests {

	@Test
	public void contructorShouldCreatedObjectWhenValidData() {
			
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(100000.0, f.getTotalAmount());
		Assertions.assertEquals(2000.0, f.getIncome());
		Assertions.assertEquals(80, f.getMonths());
	}
	
	@Test
	public void constructorShouldThrowExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
		});
	}
	
	@Test
	public void setTotalAmountShouldUpdateValueWhenDataIsValid() {
		
		// Arrange
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		// Action
		f.setTotalAmount(900000.0);
		
		// Assert
		Assertions.assertEquals(900000.0, f.getTotalAmount());
	}
	
	@Test
	public void setTotalAmountShouldThrowExceptionWhenInvalidData() {
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(1000000.0, 2000.0, 80);
			f.setTotalAmount(110000.0);
		});
	}
	
	@Test
	public void setIncomeShouldUpdateValueWhenDataIsValid() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		f.setIncome(2100.0);
		
		Assertions.assertEquals(2100.0, f.getIncome());
	}
	@Test
	public void setIncomeShouldThrowIllegalArgumentExceptionWhenDataInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 80);
			f.setIncome(1900.0);
		});
	}
	
	@Test
	public void setMonthsShouldUpdateValueWhenDataIsValid() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		f.setMonths(90);
		
		Assertions.assertEquals(90, f.getMonths());
	}
	@Test
	public void setMonthsShouldThrowIllegalArgumentExceptionWhenDataInvalid() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			Financing f = new Financing(100000.0, 2000.0, 20);
			f.setMonths(90);
		});
	}
	
	@Test
	public void entryShouldCorrectlyCalculateTheInputValue() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(2000.0, f.entry());
	}
	
	@Test
	public void quotaShouldCorrectlyCalculateTheInputValue() {
		
		Financing f = new Financing(100000.0, 2000.0, 80);
		
		Assertions.assertEquals(1225.0, f.quotal());
	}
}
