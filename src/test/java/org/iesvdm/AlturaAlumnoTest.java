package org.iesvdm;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AlturaAlumnoTest {



    @Test
    void verdadero(){
       assertTrue(1 == 1);

    }

    @Test
    void aniadeNombreTest1(){

        final String [] array = new String [0];
        int longitudInicial = array.length;
        String nombre="Maria";
        String [] arrayActual = AlturaAlumno.aniadeNombre(array, nombre);

        String[] expectedArray = Arrays.copyOf(array, array.length+1);
        expectedArray[expectedArray.length-1]=nombre;


        assertEquals(longitudInicial+1, arrayActual.length);
        assertEquals(nombre, arrayActual[arrayActual.length-1]);
        assertArrayEquals(expectedArray, arrayActual);


    }


    @Test
    void aniadeAlturaTest1(){

        final double [] array = new double [0];
        int longitudInicial = array.length;
        double altura=1.90;
        double [] arrayActual = AlturaAlumno.aniadeNombre(array, altura);

        double[] expectedArray = Arrays.copyOf(array, array.length+1);
        expectedArray[expectedArray.length-1]=altura;


        assertEquals(longitudInicial+1, arrayActual.length);
        assertEquals(altura, arrayActual[arrayActual.length-1]);
        assertArrayEquals(expectedArray, arrayActual);




}
