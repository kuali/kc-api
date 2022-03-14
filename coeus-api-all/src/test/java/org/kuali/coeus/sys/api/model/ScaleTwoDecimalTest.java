/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2022 Kuali, Inc. - All Rights Reserved
 * %%
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
        var op1 = new ScaleTwoDecimal(100).bigDecimalValue();
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
