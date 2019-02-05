/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2019 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.sys.api.model;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

class ScaleTwoDecimalTest {

    @Test
    void divideTest() {
        BigDecimal op1 = new ScaleTwoDecimal(100).bigDecimalValue();
        BigDecimal op2 = new ScaleTwoDecimal(365).bigDecimalValue();
        Assertions.assertEquals(new ScaleTwoDecimal(op1.divide(op2, RoundingMode.HALF_UP)),new ScaleTwoDecimal(100d/365d));
    }

    @Test
    void percentageTest() {
        ScaleTwoDecimal op1 = new ScaleTwoDecimal(39);
        ScaleTwoDecimal op2 = new ScaleTwoDecimal(9);
        Assertions.assertEquals(op1.percentage(op2),new ScaleTwoDecimal(3.51));
    }
    @Test
    void divide1Test() {
        BigDecimal op1 = new ScaleTwoDecimal(100).bigDecimalValue();
        BigDecimal op2 = new ScaleTwoDecimal(3).bigDecimalValue();
        Assertions.assertEquals(new ScaleTwoDecimal(op1.divide(op2, RoundingMode.HALF_UP)),new ScaleTwoDecimal(100d/3d));
    }
}
