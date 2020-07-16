package com.company.Modelos;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alumno {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private String DNI;

    public Alumno(String nombre, String apellido, Date fechaNacimiento, String DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", DNI='" + DNI + '\'' +
                '}';
    }

    public int calcular() {

        Calendar fechaActual = Calendar.getInstance();
        Calendar c = new GregorianCalendar();
        c.setTime(this.fechaNacimiento);
        // Cálculo de las diferencias.
        int years = fechaActual.get(Calendar.YEAR) - c.get(Calendar.YEAR);
        int months = fechaActual.get(Calendar.MONTH) - c.get(Calendar.MONTH);
        int days = fechaActual.get(Calendar.DAY_OF_MONTH) - c.get(Calendar.DAY_OF_MONTH);

        if (months < 0) years = 1;

        if (months == 0);

        if (days<0) years=1;


            // Hay que comprobar si el día de su cumpleaños es posterior
            // a la fecha actual, para restar 1 a la diferencia de años,
            // pues aún no ha sido su cumpleaños.


            System.out.println("Tu edad es: ");
        return years;
    }
}
