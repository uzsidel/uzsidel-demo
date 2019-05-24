package com.training.java.uzsideldemo.services;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonGreeterTest {

    @Test
    public void sayHello_personWithFirstNameLastName_shouldReturnPersonGreeting() {
        //setup
        Person person = new Person("Uzsidel","De");
        PersonGreeter personGreeter = new PersonGreeter(person);

        //Test
        String result= personGreeter.sayHello();

        //Verify
        assertNotNull("Greeting should not be null", result);
        assertEquals("Greeting white unexperectec value", "Hello Uzsidel De", result);

    }
}