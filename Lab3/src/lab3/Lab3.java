package lab3;
//You are NOT allowed to add any "import" statement other than 
//the ones already in the starter files. 

///////////////////////////////////////////////////////////////////////////
//Full Name : Samuil Mohammad Yazdani
//Yorku Email : Samuil@my.yorku.ca
//Date : 2024-02-11
//Authenticity Declaration :
//I declare this submission is the result of my own work and has not been
//shared with any other student or 3rd party content provider.This submitted
//piece of work is entirely of my own creation.
//////////////////////////////

public class Lab3 {

	public static String printStars(int n) {
		String x = "";
		for (int i=0; i<n; i++) {
			 for (int k=0; k<i; k++) {
				 x += "-";
				 }
			 for (int j=0; j<(n-i); j++) {
				 x += "*";
				 if (j==(n-i-1) && i<(n-1)) {
					 x += "\n";
				 } 
			 }
		}
		return x;
	}
	
	public static String expand (int num, int d) {
		if (num<0) {
			return "Invalid";
		} else if (d<=0) {
			return "Invalid";
		}
		String x = "";
		String NUM = Integer.toString(num);
		for (int i=0; i<d; i++) {
			x += NUM.substring(0,1);
			NUM = NUM.substring(1);
			if ((d-i)>1) {
				x += "*";
				x += "1";
				for (int k=0; k<(d-i-1); k++) {
					x+="0";
				}
				x += " + ";
			}	
		}
		return x;
	}
	
	public static String getSeqStat(int ft, int d, int n) {
		String x = "{";
		for (int i =0; i<n; i++) {
			x += "[<";
			for (int k=-1; k<i; k++) {
				if (k==-1) {
					x += Integer.toString(ft);
				} else {
					x += ", " + Integer.toString(ft+(k+1)*d);
				}
			}
			x += ">: ";
			int s = ft;
			int p = ft;
			for (int k=-1; k<i; k++) {
					if (k!=-1) {
						s += ft+(k+1)*d;
						p *= ft+(k+1)*d;
					}
				}
			if (i==(n-1)) {
				x += s + ", " + p + "]";
			} else {
				x += s + ", " + p + "]; ";
			}
		}
		x += "}";
		return x;
	}
	
	public static String seqInterleaving(int ft1, int d1, int n1, int ft2, int d2, int n2) {
		String x = "<";
		int j = 0;
		int k = 0;
		int count1 = 0;
		int count2 = 0;
		for (int i=1; i<=(n1+n2); i++) {
		if (i%2==0 && count2<n2 || count1>=n1 && count2<n2) {
			if (j==0) {
				if (i==2) {
					x += Integer.toString(ft2);
				} else {
					x += Integer.toString(ft2) + ", ";
				}
				j++;
				count2 += 1;
			} else {
				x += ", " + Integer.toString(ft2+(j)*d2);
				j++;
				count2 += 1;
			}
		}
		else if (count1<n1) {
			if (k==0) {
				if (i==2) {
					x += Integer.toString(ft1);
				} else {
					x += Integer.toString(ft1) + ", ";
				}
				k++;
				count1 += 1;
			} else {
				x += ", " + Integer.toString(ft1+(k)*d1);
				k++;
				count1 += 1;
			}
		}
		}
		x += ">";
		
		return x;
	}	
	
}
