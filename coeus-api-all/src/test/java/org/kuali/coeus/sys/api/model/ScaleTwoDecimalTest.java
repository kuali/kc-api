/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.sys.api.model;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ScaleTwoDecimalTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
    @Test
    public void divideTest() throws Exception{
        BigDecimal op1 = new ScaleTwoDecimal(100).bigDecimalValue();
        BigDecimal op2 = new ScaleTwoDecimal(365).bigDecimalValue();
        Assert.assertEquals(new ScaleTwoDecimal(op1.divide(op2, RoundingMode.HALF_UP)),new ScaleTwoDecimal(100d/365d));
    }

    @Test
    public void percentageTest() throws Exception{
        ScaleTwoDecimal op1 = new ScaleTwoDecimal(39);
        ScaleTwoDecimal op2 = new ScaleTwoDecimal(9);
        Assert.assertEquals(op1.percentage(op2),new ScaleTwoDecimal(3.51));
    }
    @Test
    public void divide1Test() throws Exception{
        BigDecimal op1 = new ScaleTwoDecimal(100).bigDecimalValue();
        BigDecimal op2 = new ScaleTwoDecimal(3).bigDecimalValue();
        Assert.assertEquals(new ScaleTwoDecimal(op1.divide(op2, RoundingMode.HALF_UP)),new ScaleTwoDecimal(100d/3d));
    }
}
