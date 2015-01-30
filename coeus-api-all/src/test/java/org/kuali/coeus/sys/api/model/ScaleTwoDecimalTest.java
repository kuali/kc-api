/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 The Kuali, Inc.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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
