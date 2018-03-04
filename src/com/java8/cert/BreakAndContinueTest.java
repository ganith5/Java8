package com.java8.cert;

public class BreakAndContinueTest {
	
	public static void main(String[] args) {
		unlabelledBreak();
		labelledBreak();
		labelledContinue();
		
	}
	
	private static void labelledContinue() {
		compare:
			for (int rowNum = 0; rowNum < 3; rowNum++) {
				
			    for (int colNum = 0; colNum < 4; colNum++) {
			        if (colNum == 3) {
			        	
			            continue compare;
			        }
			        System.out.println("colNum = " + colNum);
			       
			    }
				
			}
		
	
	}

	
	private static void labelledBreak() {
		compare:
			for (int rowNum = 0; rowNum < 3; rowNum++) {
				
			    for (int colNum = 0; colNum < 4; colNum++) {
			        if (rowNum == 1 && colNum == 3) {
			            break compare;
			        }
			       
			    }
				
			}
		System.out.println("rowNum = ");
	
	}

	private static void unlabelledBreak() {
		for(int i=0; i<5; i++) {
			if(i==3) {
				break;
			}
		}
	}

}
