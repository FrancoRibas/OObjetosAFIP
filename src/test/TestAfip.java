package test;

import model.Contribuyente;
import model.Ceta;
import model.Rodado;

public class TestAfip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Contribuyente c1 = new Contribuyente(1, "Ribas", "Franco", 39060113, 'm', "20390601132");
			System.out.println(c1.toString());
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		};
		
		try {
			Contribuyente c1 = new Contribuyente(1, "Ribas", "Franco", 39060113, 'P', "20390601132");
			System.out.println(c1.toString());
		} catch (Exception e) {
			System.out.println("Exception " + e.getMessage());
		};
	}

}
