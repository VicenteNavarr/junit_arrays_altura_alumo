package org.iesvdm;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AlturaAlumnoTest {


    @Test
    void verdadero() {
        assertTrue(1 == 1);

    }

    @Test
    void aniadeNombreTest1() {

        final String[] array = new String[0];
        int longitudInicial = array.length;
        String nombre = "Maria";
        String[] arrayActual = AlturaAlumno.aniadeNombre(array, nombre);

        String[] expectedArray = Arrays.copyOf(array, array.length + 1);
        expectedArray[expectedArray.length - 1] = nombre;


        assertEquals(longitudInicial + 1, arrayActual.length);
        assertEquals(nombre, arrayActual[arrayActual.length - 1]);
        assertArrayEquals(expectedArray, arrayActual);


    }


    @Test
    void modificaAlturaTest1() {

        //when(cuando)

        double[] array = {1.6, 1.8, 1.7};
        double[] arrayAux = Arrays.copyOf(array, array.length);
        int posicion = 1;
        double nuevaAltura = 1.2;

        //do(hacer)

        AlturaAlumno.modificaAltura(array, posicion, nuevaAltura);


        //then(entonces)

        //altura nuieva esta en la posición
        assertTrue(nuevaAltura == array[posicion]);

        //todos los demas elementos del arry no cambian
        for (int i = 0; i < array.length; i++) {

            if (i != posicion) {
                assertEquals(array[i], arrayAux[i]);

            }

        }

    }

    @Test
    void modificaAlturaPosicionFueradeRangoTest() {

        //when

        double[] array = {1.6, 1.8, 1.7};
        double[] arrayAux = Arrays.copyOf(array, array.length);
        int posicion = array.length+2;
        double nuevaAltura = 1.2;

        //do(hacer)

        AlturaAlumno.modificaAltura(array, posicion, nuevaAltura);


        //then

        //altura nuieva esta en la posición
        //assertTrue(nuevaAltura == array[posicion]);

        assertArrayEquals(arrayAux, array);

        }

    @Test
    void aniadeAlturaTest1() {

        //when
        final double[] array = new double[0];
        double alturaPorDefecto=1.5;
        int longitudInicial = array.length;

        //do
        double [] arrayActual = AlturaAlumno.aniadeAltura(array);
        double [] arrayEsperado = Arrays.copyOf(array,array.length+1);
        arrayEsperado[arrayEsperado.length-1]=alturaPorDefecto;

        //then
        assertEquals(longitudInicial + 1, arrayActual.length);
        assertArrayEquals(arrayEsperado, arrayActual);
        assertEquals(alturaPorDefecto, arrayActual[arrayActual.length - 1]);

    }

    @Test
    void buscaNombreTest1() {

        //when
        int posicionEncontrada = -1;
        int index = 0;

        //do



    }





    }


