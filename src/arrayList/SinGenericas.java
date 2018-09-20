package arrayList;

import java.awt.*;
import java.io.*;

public class SinGenericas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreaArray<File> archivos = new CreaArray<File>(2);
		archivos.meteDato(new File("hola"));
		archivos.meteDato(new File("Adios"));
		//archivos.meteDato(new File("aa"));
		
	}

}

class CreaArray<T>{
	private Object miarray[];
	int a = 0;
	
	public CreaArray(int tamagno){
		 miarray =  new Object[tamagno];
	}
	
	public void meteDato(T i){
		miarray[a]=i;
		a++;
	}
	
	public T get(int i){
		return (T)miarray[i];
	}
}
