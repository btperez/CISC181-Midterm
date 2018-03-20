package com.cisc181.core;

import static org.junit.Assert.*;



import java.util.ArrayList;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	static ArrayList<Staff> listOfStaff = new ArrayList<Staff>();
	
	@BeforeClass
	public static void setup() {
		listOfStaff.add(new Staff("Brandon", "Thomas", "Perez", new Date(1990,1,1) , "0 University Way", "(626)-626-6262",
				"highmynamesB@aol.com", "3-3", 3, 100000, new Date(2011, 1, 1), eTitle.MR));

		listOfStaff.add(new Staff("Bert", "Code God", "Gibbons", new Date(1998, 4, 28), "1 Codeman Street", "(123)-456-7890",
				"thisbert?@udel.com", "12-3", 1, 1000000, new Date(2012, 2, 2), eTitle.MR));

		listOfStaff.add(new Staff("what", "the", "heck", new Date(1945, 7, 17), "What Street", "(666)-666-666",
				"qwertyuiop@asdfg.com", "10-11", 3, 44000, new Date(2013, 3, 3), eTitle.MRS));

		listOfStaff.add(new Staff("Mister", "Doctor", "Professor", new Date(1987, 2, 13), "Rock Circle", "(000)111-8008","thisispatrick@star.com", "7-8", 4, 200, new Date(2014, 4, 4), eTitle.MR));

		listOfStaff.add(new Staff("The", "Spidey", "Professor", new Date(1972, 5, 29), "S", "(302)302-3023", "notpeterparker@hotmail.com", "12-12", 5, 25000, new Date(2015, 5, 5), eTitle.MR));
	}

	
	@Test
	public void test() {
		assertEquals(1,1);
	}	

}