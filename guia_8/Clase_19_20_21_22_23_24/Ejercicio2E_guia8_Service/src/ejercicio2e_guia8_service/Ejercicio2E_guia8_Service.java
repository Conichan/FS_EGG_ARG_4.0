package ejercicio2e_guia8_service;

import Service.NIFService;

public class Ejercicio2E_guia8_Service {

   public static void main(String[] args) {
        NIFService p = new NIFService();
        
        p.crearNif();
        
        System.out.println("********************************");
        
        p.mostrar();
    }
    
}
