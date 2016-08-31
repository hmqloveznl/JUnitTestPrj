package com.example.hemq.junittestprj;

import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by hemq on 16-8-31.
 */
public class CalculatorTest {


    @Test
    public void testSum2() throws Exception {
        Calculator cal=new Calculator();
        assertThat(cal.sum(2,4),equalTo(26));}
    @Test
    public void testSum() throws Exception {
        Calculator cal=new Calculator();
        assertThat(cal.sum(2,4),equalTo(6));
    }
}


