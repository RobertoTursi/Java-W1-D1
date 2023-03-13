package it.epicode.be;

import java.util.Arrays;
import java.util.Scanner;
public class Helloworld {

public static void main (String[] args)
	{
		// Stampa a console  la frase
		System.out.println("This is my first Epicode Java Project!");
		
		//esercizio #2
		System.out.println(Moltiplica(5,4));
		System.out.println(Concatena("Ciao", "CCiao"));
		String arrayOfString[] = new String[5];
		arrayOfString[0] = "ciao";
		arrayOfString[1] = "sono";
		arrayOfString[2] = "Roberto";
		arrayOfString[3] = "frew";
		arrayOfString[4] = ".";
		System.out.println(addToArray(arrayOfString, "grandissimo"));
		System.out.println(dinamicAddToArray(arrayOfString, "dinamico"));
		
		//esercizio #3
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Inserisci la prima stringa");
		String firstStr = myScanner.nextLine();
		System.out.print("Inserisci la seconda stringa");
		String secondStr = myScanner.nextLine();
		System.out.print("Inserisci la terza stringa");
		String thirdStr = myScanner.nextLine();
		
		System.out.println(stringJoin(firstStr, secondStr, thirdStr));
		
		//esercizio #4
		System.out.println(rPerimeter(3.453f, 2.544f));
		System.out.println(pariDispari(4));
		System.out.println(tPerimeter(15.424f, 20.32f, 25.321f));
	}


	public static int Moltiplica(int n1, int n2) {
		return n1*n2;
	}
	public static String Concatena(String str1, String str2) {
		return str1+str2;
	}
	public static String addToArray(String[] arr, String str1 ) {
		
		String arr2[] = new String[arr.length+1];
		arr2[0] = arr[0];
		arr2[1] = arr[1];
		arr2[2] = arr[2];
		arr2[3] = str1;
		arr2[4] = arr[3];
		arr2[5] = arr[4];
		return Arrays.toString(arr2);
	}
	//rendiamolo dinamico:
	public static String dinamicAddToArray(String[] arr, String str1) {
		String arr2[] = new String[arr.length+1];
		for(int i=0; i<=arr.length; i++) {
			if(i==arr.length-2) {
				arr2[i] = str1;
			}else if(i>arr.length-2){
				arr2[i] = arr[i-1];
			}else {
				arr2[i] = arr[i];
			}
			
		}
		return Arrays.toString(arr2);
	}
	
	public static String stringJoin(String str1, String str2, String str3) {
		String arr = str1 + " " + str2 + " " + str3;
		String reverseArr = str3 + " " + str2 + " " + str1;
		String joinedArray[] = new String [2];
		joinedArray[0] = arr;
		joinedArray[1] = reverseArr;
		
		return Arrays.toString(joinedArray);
	}
	public static float rPerimeter(float base, float altezza) {
		return (base + altezza)*2;
	}
	public static int pariDispari(int n) {
		if(n%2 == 0) {
			return 0;
		} else {
			return 1;
		}
	}
	public static float tPerimeter(float l1, float l2, float l3) {
		float semiPerimeter = (l1+l2+l3) / 2;
		float result = semiPerimeter * (semiPerimeter-l1)*(semiPerimeter-l2)*(semiPerimeter-l3);
		return (float) Math.sqrt(result);
	}
}




