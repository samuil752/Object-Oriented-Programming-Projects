package lab4;

///////////////////////////////////////////////////////////////////////////
//Full Name : Samuil Mohammad Yazdani
//Yorku Email : Samuil@my.yorku.ca
//Date : 2024/03/02
//Authenticity Declaration:
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider. This submitted
//piece of work is entirely of my own creation.
///////////////////////////////////////////////////////////////////////////

public class Lab4 {
	public static int longestSeq (int[] array) {
		if (array.length == 0) {
			return 0;
		}
		
		int curr = 1;
		int answer = 1;
		for (int i = 1; i < array.length; i++){
			if (array[i] == array[i - 1]) {
				continue;
			}
			else if (array[i] == array[i - 1] + 1){
				curr++;	
			}
			else {
				answer = Math.max(curr, answer);
				curr = 1;
			}
			
		}
		if (curr > answer){
			return curr;
			
		}
		else {
			return answer;
		}
	}

	public static String countArray (int[] array) {
		if (array.length == 0) {
			return "";
		}
		
		int[] answer = new int[100];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i]>= 2 && array[i] < 100 ) {
				answer[array[i]]++;
				
			}
		}
		String temp = "";
		for (int i = 0; i < answer.length; i++) {
			if (answer[i] > 0) {
				temp += ((i) + ": " + answer[i] + "\n");
				}
			}
		if (temp.length()>0) temp = temp.substring(0,temp.length()-1);
	    return temp;
	}
	
	public static boolean validString (String str1, String str2) {
		String copyString = "";
		int i = 0;
		int j = i;
		for (; i<str2.length(); i++) {
			for(;j<str1.length();j++) {
				if (str2.substring(i,i+1).equals(str1.substring(j,j+1))) {
					copyString += str1.substring(j,j+1);
					j++;
					break;
				}
			}
		}
		if (copyString.equals(str2)) return true; else return false;
	}
	
	public static String arrayResult(int[][] array) {
		if (array.length==0) return ("");
		if (array.length==1) return String.format("Sum:%d, Product:0", array[0][0]);
		
		int sum = 0;
		int product = 1;
		for (int r = 0; r<array.length; r++) {
			for (int c = 0; c<array[r].length; c++) {
				if ((c%2==0 && r%2==0) || (c%2!=0 && r%2!=0)) {
					sum += array[r][c];
				} else {
					product *= array[r][c];
				}
			}
		}
						
		return String.format("Sum:%d, Product:%d", sum, product);
	}
	
	public static boolean magicSquare(int[][] array) {
		for (int i = 0; i<array.length; i++) {
			if (array.length==array[i].length) {
			} else {
				return false;
			}
		}
		int[] tempArr = new int[2*array.length+2];
		for (int i = 0; i<array.length; i++) {
			for (int k = 0; k<array[i].length; k++) {
				tempArr[i] += array[i][k];
				tempArr[array.length + i] += array[k][i];
			}
			tempArr[2*array.length] += array[i][i];
			tempArr[2*array.length+1] += array[i][array.length-1-i];
		}
		boolean flag = true;
		for (int i=0; i<tempArr.length-1; i++) {
			if (tempArr[i]==tempArr[i+1]) {
				continue;
			} else {
				flag = false;
				break;
			}
		}
		return flag;
	}
}