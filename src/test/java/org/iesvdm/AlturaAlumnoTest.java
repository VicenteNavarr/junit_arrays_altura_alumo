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




}
