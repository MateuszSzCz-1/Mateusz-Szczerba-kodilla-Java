package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSuiteArrayOperations {
    @Test
    void testGetAverage() {
        //Given
        int[] numbers = {1,2,3,4,5};
        ArrayOperations operations = new Operations();
        //When
        double averageValue = operations.getAverage(numbers);

        //Then
        assertEquals(3, averageValue);
    }
}
