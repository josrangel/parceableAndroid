package com.josrangel.parceable.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Alumno implements Parcelable {
    private String nombre;
    private String edad;
    private String grado;

    public Alumno(String nombre, String edad, String grado) {
        this.nombre = nombre;
        this.edad = edad;
        this.grado = grado;
    }

    public Alumno(Parcel in){
        this.nombre = in.readString();
        this.edad = in.readString();
        this.grado = in.readString();
    }

    public Alumno(){
    }

    public static final Creator<Alumno> CREATOR = new Creator<Alumno>() {
        @Override
        public Alumno createFromParcel(Parcel in) {
            return new Alumno(in);
        }

        @Override
        public Alumno[] newArray(int size) {
            return new Alumno[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nombre);
        parcel.writeString(edad);
        parcel.writeString(grado);
    }


}
