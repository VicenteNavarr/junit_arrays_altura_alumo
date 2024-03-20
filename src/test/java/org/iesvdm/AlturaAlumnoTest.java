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
    void buscaNombreTest1encuentra() {

        //when
        String [] array = {"uno", "dos", "tres"};
        String nombre= "uno";

        //do - then
        assertEquals(0, AlturaAlumno.buscaNombre(array, nombre));

    }

    @Test
    void buscaNombreTest2NoEncuentra() {

        //when
        String [] array = {"uno", "dos", "tres"};
        String nombre= "cuatro";

        //do - then
        assertEquals(-1, AlturaAlumno.buscaNombre(array, nombre));

    }

    @Test
    void buscaNombreTest3ArrayVacio() {

        //when
        String [] array = {};
        String nombre= "cuatro";

        //do - then
        assertEquals(-1, AlturaAlumno.buscaNombre(array, nombre));

    }

    @Test
    void buscaNombreTest4NombreVacio() {

        //when
        String [] array = {"uno", "dos", "tres"};
        String nombre= "";
        String nombre2= null;

        //do - then
        assertEquals(-1, AlturaAlumno.buscaNombre(array, nombre));
        assertEquals(-1, AlturaAlumno.buscaNombre(array, nombre2));

    }


    @Test
    void mostrarTest1Ok() {

        //when
        String [] arrayNombre = {"uno", "dos", "tres"};
        double[] arrayAltura = {1.6, 1.8, 1.7};

        //do - then
        assertDoesNotThrow(() -> {AlturaAlumno.mostrar(arrayNombre, arrayAltura);});

    }

    @Test
    void mostrarTest2NotOk() {

        //when
        String [] arrayNombre = {"uno", "dos", "tres"};
        double[] arrayAltura = {1.6, 1.8};

        //do - then
        assertThrows(ArrayIndexOutOfBoundsException.class, () ->{AlturaAlumno.mostrar(arrayNombre, arrayAltura);});

    }


    @Test
    void calculaMaximoTest1() {

        //when
        double[] arrayMax = {1.0,2.0,3.0};
        double maximo=4.0;

        //do
        double [] resultado = AlturaAlumno.calculaMaximo(arrayMax);

        //then
        assertEquals(2, resultado[0]);
        assertEquals(3.0, resultado[1]);

    }

    @Test
    void calculaMaximoTest2Vacio() {

        //when
        double[] arrayMax = new double[0];
        double maximo=4.0;

        //do
        double [] resultado = AlturaAlumno.calculaMaximo(arrayMax);

        //then
        assertEquals(0.0, resultado[0]);
        assertEquals(0.0, resultado[1]);

    }


    @Test
    void calculaMaximoTest3Vacio() {

        //when
        double[] arrayMax = {0.0, -1, -2};


        //do
        double [] resultado = AlturaAlumno.calculaMaximo(arrayMax);

        //then
        assertEquals(0.0, resultado[0]);
        assertEquals(0.0, resultado[1]);

    }




    @Test
    void calculaMediaTest1() {

        //when
        double[] arrayMed = {1.0,2.0,3.0};
        double media = 2.0;

        //do
        double resultMedia = AlturaAlumno.calculaMedia(arrayMed);

        //then
        assertEquals(2.0, resultMedia);


    }



    @Test
    void calculaMediaArrayVacioTest2() {

        //when
        double[] arrayMed = new double[0];


        //do
        double resultMedia = AlturaAlumno.calculaMedia(arrayMed);

        //then
        assertEquals(0.0, resultMedia);


    }


    @Test
    void calculaMediaNegativoTest3() {

        //when
        double[] arrayMed = {0.0,-3.0,0.0};


        //do
        double resultMedia = AlturaAlumno.calculaMedia(arrayMed);

        //then
        assertEquals(-1.0, resultMedia);


    }



    }


