package Test;

import java.time.LocalDate;


import Modelo.Sistema;

public class TestSistema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sistema sistema = new Sistema();
		
		
		
		
		
		
		System.out.println("Caso de uso 1 : ");
		try {
			//System.out.println());
			sistema.agregarFestival("Camp Rock", "Verano","Rock", LocalDate.of(2026,02,26), LocalDate.of(2026, 03, 26));
			System.out.println(sistema.traerFestival("Camp Rock"));
			System.out.println(sistema.traerFestival(1));
			System.out.println(sistema.eliminarFestival(1));
			System.out.println(sistema.traerFestival(1));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		/*
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Caso de uso : ");
		try {
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		*/
	}

}
