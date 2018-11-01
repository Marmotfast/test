package com.lxlx.gwy.base.invoke;

import java.io.Console;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class MshTest {
	public static void main(String[] args) {
			LocalDate date = LocalDate.now();
			int month = date.getMonthValue();
			int today =date.getDayOfMonth();
			
			date = date.minusDays(today -1);
			DayOfWeek weekday = date.getDayOfWeek();
			int value =weekday.getValue();
			
			System.out.println("周一     周二     周三   周四    周五   周六   周日");
			for (int i = 1; i < value; i++) {
				System.out.print("  ");
			}
				while(date.getMonthValue()==month){
					System.out.printf("%3d",date.getDayOfMonth());
					if(date.getDayOfMonth()==today)
						System.out.print("*");
					else
						System.out.print(" ");
					date = date.plusDays(1);
					if(date.getDayOfWeek().getValue()==1)System.out.println();
					
				}
				if(date.getDayOfWeek().getValue() !=1)System.out.println();
				
	}
}
