package com.ufv;

public class Profesor extends Persona{
    private int ID_Profesor;

    public Profesor(String nombre, String apellidos, String dni, int ID_Profesor) {
        super(nombre, apellidos, dni);
        this.ID_Profesor = ID_Profesor;
    }

    public Profesor() {
        super();
    }

    public int getID_Profesor() {
        return ID_Profesor;
    }

    public void setID_Profesor(int ID_Profesor) {
        this.ID_Profesor = ID_Profesor;
    }
    @Override
    public String toString() {

        return super().toString() +
                ", ID Profesor= " + ID_Profesor + '\n' +
                '}';
    }
}
