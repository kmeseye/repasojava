package com.company;

import com.company.Modelos.Alumno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        SimpleDateFormat objSDF=new SimpleDateFormat("dd-mm-yyyy");

        Date fechanacimiento=null;
        try {
            fechanacimiento=objSDF.parse("28-02-1985");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Alumno alumno=new Alumno("juan","Rodrigues",fechanacimiento,"36157889h");
        System.out.println(alumno.toString());

        LocalDate fHoy= LocalDate.now();
        LocalDate cumple= LocalDate.of(1985, Month.FEBRUARY, 28);
        long edad= ChronoUnit.YEARS.between(cumple, fHoy);
        System.out.println("Tu edad es: "+edad);



        // Mostramos el resultado de llamar a la función calcular pasando
        // como parametro la fecha de nacimiento YYYY-MM-DD

    }


    }

