package net.bluepoet.citest;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by bluepoet on 2018. 3. 24..
 */
public class CalculatorTest {
    @Test
    public void 숫자2개를_더한값이_반환된다() {
        //given
         long num1 = 1;
         long num2 = 2;

         //when
         long sum = Calculator.sum(num1, num2);

         //then
         assertThat(sum).isEqualTo(3); }
    }
