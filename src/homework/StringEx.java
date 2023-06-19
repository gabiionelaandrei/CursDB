package homework;

import java.util.StringTokenizer;

public class StringEx {

	public static void main(String[] args) {
		String propozitie ="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam consectetur odio ac quam commodo, eu eleifend felis imperdiet. Integer bibendum nunc quis sem faucibus, vitae laoreet mi dignissim. Praesent eget ligula nec lorem varius malesuada. Nulla neque lacus, euismod quis erat nec, convallis vestibulum augue. Nullam et aliquet justo. Aliquam erat volutpat. Nulla elementum urna in dolor viverra, in efficitur lectus mattis.";
		cautareNulla(propozitie);
		numarPropozitii(propozitie);
		stergeCaracter(propozitie);
		inlocuiesteCaracter(propozitie);
		
	}
	
	
	
	public static void cautareNulla(String propozitie) {
		String cuvant ="Nulla";
		int numar=0;
		while(propozitie.indexOf(cuvant)>0) {
			numar++;
			propozitie=propozitie.substring(propozitie.indexOf(cuvant) + cuvant.length());
		}
System.out.println(numar);
	
	}
	
	public static void numarPropozitii(String propozitie) {
		StringTokenizer st = new StringTokenizer(propozitie,".");
		for (int i = 1; st.hasMoreTokens(); i++)
	         System.out.println(st.nextToken().trim() + ".");
	
	}
	
	public static void stergeCaracter(String propozitie) {
		StringBuilder sb =  new StringBuilder(propozitie);
		char litera = 'a';
		
		while(propozitie.indexOf(litera)>0) {
			sb.deleteCharAt(propozitie.indexOf(litera));
			propozitie =sb.toString();
			
		}
		
		System.out.println(sb);	
		
	}
	
	public static void inlocuiesteCaracter(String propozitie) {
		char caracter ='o';
		StringBuilder sb =  new StringBuilder(propozitie);

		while(propozitie.indexOf(caracter)>0) {
			
			sb.replace(propozitie.indexOf(caracter),propozitie.indexOf(caracter)+1, "#");
			propozitie =sb.toString();
		}
		System.out.println(sb);
	
	}
}
