package com.greatlearning.Question1;

import java.util.ArrayList;
import java.util.Scanner;

public class ConstructionSequence {
	public static void main(String[] args) {
		int numfloors;
		int day = 1;
		int floorSize;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		numfloors = sc.nextInt();
		ArrayList<Integer> arr = new ArrayList<> (); // marked as new ArrayList 
		while (day <= numfloors) {
			System.out.println("enter the floor size given on day :" + day);
			floorSize = sc.nextInt();
			if (floorSize <= numfloors && !arr .contains(floorSize) ) {
				arr.add(floorSize);
				
			}
			else {
				System.out.println("Invalid Input");
				break;
				
			}
			day++;
			
		}  
		//End of Input//
		if(arr.size()==numfloors) {
			System.out.println("The order of construction is as follows");
			ConstructionOrder(numfloors, arr);
			
			
		}
		
	}

	private static void ConstructionOrder(int numfloors, ArrayList<Integer> arr) {
		
		int day =1;
		int reqfloorSize;
		int max = 0;
		reqfloorSize = max;
		while(day <= max) {
			System.out.println("Day: "+day);
			while(arr.subList(0,day).contains(reqfloorSize)) {
				System.out.println(reqfloorSize-- + " " );
			}
			System.out.println("");
			day++;
			}
			
		}
		
		
	}
