package arrayList;

import java.util.*;

public class MetodosGenericos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombres[] = {"Jose", "Maria", "Pepe", "Ana"};
		
		System.out.println(MisMatrices.getMenor(nombres));
		
		GregorianCalendar fechas[]={new GregorianCalendar(2015, 07, 12), 
				new GregorianCalendar(2016, 06, 02), 
				new GregorianCalendar(2010, 01, 01), 
		};
		
		System.out.println(MisMatrices.getMenor(fechas));
		

		
	}

}


class MisMatrices{
	
	public static <T extends Comparable> T getMenor(T[]a){
		if(a==null || a.length==0){
			return null;
		}
		T elementoMenor=a[0];
		for(int i=1; i<a.length; i++){
			if(elementoMenor.compareTo(a[i])>0){
				elementoMenor=a[i];
			}
		}
		return elementoMenor;
	}
	
}