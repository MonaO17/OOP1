package methods;

import java.util.Arrays;

public class Wetterstation {

	public static void main(String[] args) {
		// variables
		int[]tag= {1,2,3,4,5,6,7,8,9,10};
		int[]temp= {12,14,9,12,15,16,15,15,11,8};

		//call methods
		System.out.println("Durchschnittstemperatur: "+durchschnitt(temp));
		System.out.println("Minimale Temperatur: "+min(temp)+"\nMaximaleTemperatur: "+max(temp));


		//Umschwung
		//variables
		int[] dif= new int [10];
		int differenz=0;
		int derTag=0;
		//2 Tage bei denen der größte Temperaturumschwung stattgefunden hat
		for(int i=0; i<temp.length-1; i++) {
			differenz = temp[i]-temp[i+1];
			if (differenz < 0) {
				differenz = differenz * (-1);
			}
			dif[i] = differenz;
		}	

		int gross= dif[0];

		for (int i = 0; i < dif.length; i++) {
			if (gross<dif[i]) {
				derTag = tag[i];
				gross = dif[i];
			}
		}
		System.out.println("Die größte Differenz ist am "+derTag+". Tag mit "+gross+"° Unterschied");
		//Tabelle
		System.out.println("Tag\tTemperatur");
		for(int i=0; i<tag.length; i++) {
			System.out.println(tag[i]+"\t"+temp[i]);
		}

	}
	public static int durchschnitt(int[]temp) {
		//variables
		int sum=0, durchschnitt=0;

		//durchschnitt berechnen
		for(int i=0; i<temp.length; i++) {
			sum+=temp[i];
		}
		durchschnitt=sum/temp.length;
		return durchschnitt;
	}
	public static int max(int[]temp) {
		//get Maximum
		Arrays.sort(temp);
		int [] rev=new int[temp.length];
		for(int i=0; i<temp.length; i++) {
			rev[temp.length-1-i]=temp[i];
		}
		return rev[0];
	}
	public static int min(int[]temp) {
		//get Minimum
		Arrays.sort(temp);
		return temp[0];
	}
}
