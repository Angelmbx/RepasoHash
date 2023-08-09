import model.Persona;

import java.util.HashMap;
import java.util.Scanner;

public class Main {


    public static HashMap<Integer, Persona> createListaPersonas(){
        Scanner sc = new Scanner(System.in);
        CustomMap<Integer, Persona> listaPersonas = new CustomMap<>();

        for (int i=1; i<3; i++) {

            Persona p= new Persona();

            System.out.println("Nombre:");
            p.setName(sc.next());

            System.out.println("Edad");
            p.setEdad(sc.nextInt());

            System.out.println("Dinero");
            p.setMoney(sc.nextFloat());


            listaPersonas.put(i, p);
        }
        return listaPersonas;
    }


    public static void main(String[] args) {
        System.out.println(createListaPersonas());
    }
}