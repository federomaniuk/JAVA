package ui;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entidades.Empleado;
import entidades.Vendedor;
import entidades.Administrativo;

// import javax.swing.JOptionPane;

public class Ej5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Empleado[] empleados = new Empleado[2];
		
		int dni, tipoEmpleado;
		String nombre, apellido, email;
		float sueldoBase;

		for (int i = 0; i < empleados.length; i++) {
			System.out.println("Empleado: "+ (i+1));
			
			System.out.print("Ingrese el DNI: ");
			dni = Integer.parseInt(sc.nextLine());
			
			System.out.print("Ingrese el Apellido: ");
			apellido = sc.nextLine();
			
			System.out.print("Ingrese el Nombre: ");
			nombre = sc.nextLine();
			
			System.out.print("Ingrese el Email: ");
			email = sc.nextLine();
			
			System.out.print("Ingrese el Sueldo base: ");
			sueldoBase = Float.parseFloat(sc.nextLine());
	        
	        System.out.print("Ingrese '1' Si es administrativo, '2' Si es vendedor: ");
	        tipoEmpleado = Integer.parseInt(sc.nextLine());
	        if (tipoEmpleado == 1) {
	        	float hsExtra, hsMes;
	        	System.out.println("Administrativo: ");
	        	System.out.print("Horas mes: ");
				hsMes = Float.parseFloat(sc.nextLine());
	        	System.out.print("Horas extra: ");
				hsExtra = Float.parseFloat(sc.nextLine());
				
	        	empleados[i] = new Administrativo();
		        empleados[i].setDni(dni);
		        empleados[i].setApellido(apellido);
		        empleados[i].setNombre(nombre);
		        empleados[i].setEmail(email);
		        empleados[i].setSueldoBase(sueldoBase);
		        ((Administrativo)empleados[i]).setHsMes(hsMes);
		        ((Administrativo)empleados[i]).setHsExtra(hsExtra);
		        getSueldo(((Administrativo)empleados[i]));
	        } else {
	        	int totalVentas, porcenComision;
	        	System.out.println("Vendedor: ");
	        	System.out.print("Porcentaje de comision: ");
				totalVentas = Integer.parseInt(sc.nextLine());
	        	System.out.print("Total de ventas: ");
	        	porcenComision = Integer.parseInt(sc.nextLine());
				
	        	empleados[i] = new Vendedor();
		        empleados[i].setDni(dni);
		        empleados[i].setApellido(apellido);
		        empleados[i].setNombre(nombre);
		        empleados[i].setEmail(email);
		        empleados[i].setSueldoBase(sueldoBase);
		        ((Vendedor)empleados[i]).setTotalVentas(totalVentas);
		        ((Vendedor)empleados[i]).setPorcenComision(porcenComision);
		        getSueldo(((Vendedor)empleados[i]));
	        }
		}
		
		// System.out.println(empleados[0].getNombre());
	}

	private static double getSueldo(Vendedor vendedor) {
		float sueldoBase = vendedor.getSueldoBase(),
				porcenComision = vendedor.getPorcenComision(),
				totalVentas = vendedor.getTotalVentas();
		System.out.println(sueldoBase + (porcenComision*totalVentas/100));
		return sueldoBase + (porcenComision*totalVentas/100);
	}

	private static double getSueldo(Administrativo administrativo) {
		float sueldoBase = administrativo.getSueldoBase(),
				hsExtra = administrativo.getHsExtra(),
				hsMes = administrativo.getHsMes();
		System.out.println(sueldoBase * ((hsExtra * 1.5)+hsMes)/hsMes);
		return sueldoBase * ((hsExtra * 1.5)+hsMes)/hsMes;
	}

	/*
	private static double getSueldo(float sueldoBase, float hsMes, float hsExtra) {
		return sueldoBase * ((hsExtra * 1.5)+hsMes)/hsMes;
	}
	*/
}
