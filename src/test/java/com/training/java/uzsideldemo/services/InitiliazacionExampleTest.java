package com.training.java.uzsideldemo.services;

import org.junit.*;

import static org.junit.Assert.*;

public class InitiliazacionExampleTest {
    @BeforeClass
    public static void antesClase(){
        System.out.println("antes clase");
    }
    @AfterClass
    public static void despuesClase(){
        System.out.println("Despues clase");
    }


    @Before
    public void setUp() throws Exception {
        System.out.println("Antes de test");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("despuesde test");
    }
    @Test
    public void primeraPrueba(){
        System.out.println("primera prueba");
    }
    @Test
    public void segundaPrueba(){
        System.out.println("segunda prueba");

    }
}