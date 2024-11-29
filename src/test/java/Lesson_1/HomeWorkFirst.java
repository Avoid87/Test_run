package Lesson_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class HomeWorkFirst {
        private String getIMTResult(Float heightCm, Float weightKg)
        {
            var userIndex = Math.round(weightKg / Math.pow((heightCm / 100), 2));
            String userResult = null;
            if (userIndex <= 16) {
                userResult = "выраженному дефициту массы тела";
            } else if (userIndex > 16 && userIndex < 19)  {
                userResult = "недостаточной массе тела";
            } else if (userIndex > 19 && userIndex < 25) {
                userResult = "нормальной массе тела";
            } else if (userIndex > 25) {
                userResult = "избыточной массе тела";
            }
            if (heightCm.equals(0.0f)) userResult = "указан некорректный рост";
            return userResult;
    }
    @Test
    public void testWeightLow(){
        String actualResult = getIMTResult(180f,50f);
        Assertions.assertEquals("выраженному дефициту массы тела",actualResult);
    }
    @Test
    public void testWeightHigh(){
        String actualResult = getIMTResult(170f,100f);
        Assertions.assertEquals("избыточной массе тела",actualResult);
    }
    @Test
    public void testWeightIncorrect(){
        String actualResult = getIMTResult(0f,0f);
        Assertions.assertEquals("указан некорректный рост",actualResult);
    }
    @Test
    public void testWeightNormal(){
        String actualResult = getIMTResult(180f,75f);
        Assertions.assertEquals("нормальной массе тела",actualResult);
    }
    @Test
    public void testWeightMiddle(){
        String actualResult = getIMTResult(180f,55f);
        Assertions.assertEquals("недостаточной массе тела",actualResult);
    }

}
