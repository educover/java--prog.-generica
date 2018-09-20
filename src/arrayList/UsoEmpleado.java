package arrayList;
import java.util.*;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado listaEmpleados[] = new Empleado[3];
		listaEmpleados[0] = new Empleado("Edu", 28, 25000);
		listaEmpleados[1] = new Empleado("Ana", 30, 30000);
		listaEmpleados[2] = new Empleado("Pepe", 35, 15000);*/
		
		ArrayList <Empleado> listaEmpleados = new ArrayList <Empleado>();
		listaEmpleados.ensureCapacity(11);
		listaEmpleados.add(new Empleado("Edu", 28, 25000));
		listaEmpleados.add(new Empleado ("Ana", 30, 30000));
		listaEmpleados.add(new Empleado ("Pepe", 35, 15000));
		listaEmpleados.add(new Empleado ("Pepe", 35, 15000));
		listaEmpleados.add(new Empleado ("Pepe", 30, 15000));
		
		listaEmpleados.add(new Empleado("Edu", 28, 25000));
		listaEmpleados.add(new Empleado ("Ana", 30, 30000));
		listaEmpleados.add(new Empleado ("Pepe", 35, 15000));
		listaEmpleados.add(new Empleado ("Pepe", 35, 15000));
		listaEmpleados.add(new Empleado ("Pepe", 35, 15000));
		
		listaEmpleados.add(new Empleado("Edu", 28, 25000));
		listaEmpleados.add(new Empleado ("Ana", 30, 30000));
		
		listaEmpleados.add(new Empleado("Edu", 28, 25000));
		listaEmpleados.add(new Empleado ("Ana", 30, 30000));
		listaEmpleados.add(new Empleado ("Pepe", 35, 15000));
		listaEmpleados.add(new Empleado ("Pepe", 48, 15000));
		//listaEmpleados.add(new Empleado ("Olga", 35, 15000));
		listaEmpleados.add(1, new Empleado ("Olga", 35, 15000));
		
		listaEmpleados.trimToSize();
		
		//System.out.println(listaEmpleados.get(4).dameDatos());
		
		
		
		//System.out.println(listaEmpleados.size());
		
		/*for (Empleado e : listaEmpleados){
			System.out.println(e.dameDatos());
		}*/
		
		Iterator<Empleado> miIterador = listaEmpleados.iterator();
		while(miIterador.hasNext()){
			System.out.println(miIterador.next().dameDatos());
		}
		
		/*for (int i=0; i<listaEmpleados.size(); i++){
			Empleado e = listaEmpleados.get(i);
			System.out.println(e.dameDatos());
		}*/
		
		/*Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
		listaEmpleados.toArray(arrayEmpleados);
		for (int i=0; i<arrayEmpleados.length; i++){
			System.out.println(arrayEmpleados[i].dameDatos());
		}*/

	}

}


class Empleado{
	private String nombre;
	private int edad;
	private double salario;
	public Empleado(String nombre, int edad, double salario){
		this.nombre=nombre;
		this.edad=edad;
		this.salario=salario;
	}
	
	public String dameDatos(){
		return "El empleado se llama: "+nombre+" tiene: "+edad+" años, y tiene un salario de: "+salario;
	}
	
	/*public String toString(){
		return "El empleado se llama: "+nombre+" tiene: "+edad+" años, y tiene un salario de: "+salario;
	}*/
}

