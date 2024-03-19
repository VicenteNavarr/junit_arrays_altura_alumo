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
    void aniadeAlturaTest1() {


        final double[] array = new double[0];
        int longitudInicial = array.length;
        double altura = 1.90;
        double[] arrayActual = AlturaAlumno.aniadeNombre(array, altura);

        double[] expectedArray = Arrays.copyOf(array, array.length + 1);
        expectedArray[expectedArray.length - 1] = altura;


        assertEquals(longitudInicial + 1, arrayActual.length);
        assertEquals(altura, arrayActual[arrayActual.length - 1]);
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

        //when(cuando)

        double[] array = {1.6, 1.8, 1.7};
        double[] arrayAux = Arrays.copyOf(array, array.length);
        int posicion = array.length+2;
        double nuevaAltura = 1.2;

        //do(hacer)

        AlturaAlumno.modificaAltura(array, posicion, nuevaAltura);


        //then(entonces)

        //altura nuieva esta en la posición
        //assertTrue(nuevaAltura == array[posicion]);

        assertArrayEquals(arrayAux, array);

        }




    }
}
