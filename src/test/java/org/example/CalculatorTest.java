/*      . B211202055
        • İrem Nur Güldal
        • SWE 202 SOFTWARE VERIFICATION AND VALIDATION
                    2023-2024 SPRING SEMESTER
                             HOMEWORK 1
        • https://github.com/iremnurguldal/TDDExample2

*/

package org.example;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @ParameterizedTest
    @CsvSource({
            "10, 2, 5",
            "10, 4, 2.5",
            "12.5, 2.5, 5",
            "10, 2.5, 4",
            "12.5, 5, 2.5",

    })
    void testDivision(float dividend_number, float divisor_number, float expectedQuotient) {

        assertEquals(expectedQuotient, Calculator.divide(dividend_number, divisor_number), 0.0001f);

    }
}
