package test;

import implementation.SingletonExample;

public class TestSingleton {

	 public static void main(String[] args) {
		 
		 
		 SingletonExample s1 = SingletonExample.getInstance();
		 
		 System.out.println(s1.getNombre()); 
		 System.out.println(s1.getDni()); 
		 System.out.println(s1.getSaldo()); 

		 SingletonExample s2 = SingletonExample.getInstance();
		 
		 System.out.println(s2.getNombre()); 
		 System.out.println(s2.getDni()); 
		 System.out.println(s2.getSaldo()); 
		 System.out.println("---"); 
		 
		 s1.setDni(99090332);
		 s1.setNombre("Marcelo Gonzalez");
		 s1.setSaldo(555.66);
		 
		 // s2 tiene la info actualizada		 
		 System.out.println(s2.getNombre()); 
		 System.out.println(s2.getDni()); 
		 System.out.println(s2.getSaldo()); 
		 System.out.println("---");
		 
		 s2.setDni(7777777);
		 s2.setNombre("Dario Abrahm");
		 s2.setSaldo(33.44);
		 
		 System.out.println(s1.getNombre()); 
		 System.out.println(s1.getDni()); 
		 System.out.println(s1.getSaldo()); 
		 
		 System.out.println(s2.getNombre()); 
		 System.out.println(s2.getDni()); 
		 System.out.println(s2.getSaldo()); 
		 System.out.println("---");
		 
		 
		 
		 System.out.println("s1 == s2.: " + (s1 == s2));
		 
	 }
	
}
