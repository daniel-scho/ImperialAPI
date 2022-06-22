package com.example.imperialapi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ConverterControllerTest {

    ConverterController converterController = new ConverterController();
    @Test
    void ounceTest(){
        // Arrange
        double input = 1;
        double expected = 28.35;
        // Act
        double output = converterController.convertOunce(input);
        // Assert
        assertEquals(expected, output);
    }

    @Test
    void stoneTest(){
        // Arrange
        double input = 1;
        double expected = 6.35;
        // Act
        double output = converterController.convertStone(input);
        // Assert
        assertEquals(expected, output);
    }

}