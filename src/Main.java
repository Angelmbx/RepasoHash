import model.Persona;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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

    public static void personasListToFile(HashMap<Integer, Persona> listaPersonas) throws IOException {
        String ruta = "listaUsers.txt";

        BufferedWriter bw=new BufferedWriter(new FileWriter(ruta));

        for (Map.Entry<Integer, Persona> entry : listaPersonas.entrySet()) {
            bw.write(entry.getKey().toString() + "=" + entry.getValue());
            bw.newLine();
        }
        bw.close();
        System.out.println(listaPersonas);
        System.out.println("---------------------------------");
        System.out.println("Datos del HashMap copiados en el archivo : " + ruta);



    }

    public static void main(String[] args) throws IOException {
        personasListToFile(createListaPersonas());
    }
}