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

    	int upCowNum = 0;
    	int downCowNum = 0;
    	int rightCowNum = 0;
    	int leftCowNum = 0;
    	int[][] upCow = new int [field.length][field[0].length];
    	int[][] downCow= new int [field.length][field[0].length];
    	int[][] rightCow= new int [field.length][field[0].length];
    	int[][] leftCow= new int [field.length][field[0].length];
        for (int i = 0; i<field.length; i++) {
        	for(int k = 0; k<field[0].length; k++) {
        		//checks for cow down
        		if (field[i][k] == 'c') {
        			if(field[i+1][k]=='o') {
        				
        				if(field[i+2][k]=='w') {
        					System.out.println("found down cow");
        					downCow[i][k]= {i,k};
        					downCowNum +=1;
        				}
        			}
        			else if (field[i][k+1]=='o') {
        				
        			
        				if(field[i][k+2]=='w') {
        					System.out.println("found right cow");
        					rightCow[i][k]= field[i][k];
        					rightCowNum +=1;
        				}
        				}
        		}
        		//upCow
        		if(field[i][k] =='w') {
        			if (field[i+1][k]=='o') {
        				
        				if(field[i+2][k]=='c') {
        					System.out.println("found up cow");
        					upCow[i][k]= field[i][k];
        					upCowNum +=1;
        				}
        			}
        			else if (field[i][k+1]=='o') {
        				
        			
        				if(field[i][k+2]=='c') {
        					System.out.println("found left cow");
        					leftCow[i][k]= field[i][k];
        					leftCowNum +=1;
        				}
        				}
        		}
        		//rightCow

        	}
        }
        if(upCowNum == 1) {
        	return upCow[0][0];
        }
        else if(downCowNum == 1) {
        	return downCow[0][0]; 
        }
        else if(rightCowNum == 1) {
        	return rightCow;
        }
        else if(leftCowNum == 1) {
        	return leftCow;
        }
        
        System.out.println(upCowNum);
        System.out.println(downCowNum);
        System.out.println(rightCowNum);
        System.out.println(leftCowNum);
        return null;
    }
}
