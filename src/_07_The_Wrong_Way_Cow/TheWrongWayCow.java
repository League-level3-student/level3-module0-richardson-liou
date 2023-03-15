/*
 * https://www.codewars.com/kata/the-wrong-way-cow
 * 
 * Task
 * Given a field of cows find which one is the Wrong-Way Cow and return her
 * position.
 * 
 * Notes:
 * 
 * There are always at least 3 cows in a herd
 * There is only 1 Wrong-Way Cow!
 * Fields are rectangular
 * The cow position is zero-based [col,row] of her head (i.e. the letter c)
 * Examples
 * Ex1
 * 
 * cow.cow.cow.cow.cow
 * cow.cow.cow.cow.cow
 * cow.woc.cow.cow.cow
 * cow.cow.cow.cow.cow
 * Answer: [6,2]
 * 
 * Ex2
 * 
 * c..........
 * o...c......
 * w...o.c....
 * ....w.o....
 * ......w.cow
 * Answer: [8,4]
 * 
 * Notes
 * The test cases will NOT test any situations where there are "imaginary" cows,
 * so your solution does not need to worry about such things!
 * 
 * To explain - Yes, I recognize that there are certain configurations where an
 * "imaginary" cow may appear that in fact is just made of three other "real" cows.
 * 
 * In the following field you can see there are 4 real cows (3 are facing south and
 * 1 is facing north). There are also 2 imaginary cows (facing east and west).
 * 
 * ...w...
 * ..cow..
 * .woco..
 * .ow.c..
 * .c.....
*/

package _07_The_Wrong_Way_Cow;

public class TheWrongWayCow {

    public static int[] findWrongWayCow(final char[][] field) {
        // Fill in the code to return the [col, row] coordinate position of the
        // head (letter 'c') of the wrong way cow!
    	int upCow = 0;
    	int downCow = 0;
    	int rightCow = 0;
    	int leftCow = 0;
        for (int i = 0; i<field.length; i++) {
        	for(int k = 0; k<field.length; k++) {
        		//checks for cow down
        		if (field[i][k] == 'c') {
        			if(field[i+1][k]=='o') {
        				System.out.println("found down o");
        				if(field[i+2][k]=='w') {
        					downCow +=1;
        				}
        			}
        		}
        		//upCow
        		else if(field[i][k] =='w') {
        			if (field[i+1][k]=='o') {
        				System.out.println("found up o");
        				if(field[i+2][k]=='c') {
        					upCow +=1;
        				}
        			}
        		}
        		//rightCow
        		else if(field[i][k] =='c') {
        			if (field[i][k+1]=='o') {
        				System.out.println("found right o");
        			
        				if(field[i][k+2]=='w') {
        					rightCow +=1;
        				}
        				}
        			
        		}
        		else if(field[i][k] =='w') {
        			if (field[i][k+1]=='o') {
        				System.out.println("found left o");
        			
        				if(field[i][k+2]=='c') {
        					leftCow +=1;
        				}
        				}
        			}
        		

        	}
        if(upCow == 1) {
        	
        }
        if(downCow == 1) {
        	
        }
        if(rightCow == 1) {
	
        }
        if(leftCow == 1) {
        	
        }
        }
        System.out.println(upCow);
        System.out.println(downCow);
        System.out.println(rightCow);
        System.out.println(leftCow);
        return null;
    }
}
