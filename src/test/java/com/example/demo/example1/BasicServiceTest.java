package com.example.demo.example1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BasicServiceTest {

    @Test
    public void testBasicMethod(){
        BasicService basicService = new BasicService();
        String actualResult = basicService.basicMethod();
        String expectedResult = "BasicString";
                assertEquals(expectedResult,actualResult);

    }
    @Test
    public void testSecondBasicMethod(){
        BasicService basicService = new BasicService();
        String pirmasPaduotasStringas = "vardas";
        String antrasPaduotasStringas = "pavarde";
        String actualResult = basicService.secondBasicMethod(pirmasPaduotasStringas,antrasPaduotasStringas);
        String expectedResult = "vardaspavarde";
        assertEquals(expectedResult,actualResult);

        actualResult=basicService.secondBasicMethod(null,antrasPaduotasStringas);
        expectedResult = "pavarde";
        assertEquals(expectedResult,actualResult);

        actualResult=basicService.secondBasicMethod(pirmasPaduotasStringas, null);
        expectedResult = "vardas";
        assertEquals(expectedResult,actualResult);

        actualResult=basicService.secondBasicMethod(null,null);
        expectedResult = "";
        assertEquals(expectedResult,actualResult);



    }





}
