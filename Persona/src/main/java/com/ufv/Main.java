package com.ufv;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        PersonaList personas = new PersonaList();


//        System.out.println("Hello world!")
//
//        ;
        Scanner lectura = new Scanner (System.in);
        Persona person = new Persona();
        Persona person2 = new Persona();
        Profesor profesor = new Profesor();
        person.setNombre("Nacho");
        person.setApellido("Serrano");
        person.setDni("55555555A");
        person.setSexo(Sexo.sexo.v);

//        Persona person2 = new Persona();
        String Nombre;


        //System.out.println("Lectura fichero");
        //ArrayList<Persona> miLista = ReadFile.readFile();
        //System.out.println(miLista.toString());
        System.out.println("-------------------------");
        System.out.println("DATOS DEL PROFESOR");
        profesor.setNombre("EL GRAN NACHO");
        profesor.setApellido("AL QUE AMAMOS");
        profesor.setDireccion("NOS VA A APROBAR A TODOS");
        profesor.setDni("Y NOS VA A PONER MUY BUENA NOTA");
        profesor.setID_Profesor("10");
        System.out.println(profesor.toString());
        personas.personaList.add(person);
        personas.personaList.add(person2);
        System.out.println(personas.personaList.toString());
        System.out.println(personas.personaList.size());
    }
}