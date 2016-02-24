/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2016 Kuali, Inc.
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

import java.math.BigDecimal;

/**
 * This class is a wrapper around {@link java.math.BigDecimal}. It exposes the only the
 * needed functionality of {@link java.math.BigDecimal}, uses a standard
 * {@link java.math.RoundingMode} of {@link java.math.RoundingMode#HALF_UP}
 * and uses a standard SCALE of 3.
 *
 * This class is, like {@link java.math.BigDecimal}, immutable; even methods which
 * might be expected to change the value actually just return a new instance
 * with the new value.
 */
public final class ScaleThreeDecimal extends AbstractDecimal<ScaleThreeDecimal> {

    private static final long serialVersionUID = -1132481837308782665L;
    
    public static final int SCALE = 3;

    public static final ScaleThreeDecimal ZERO = new ScaleThreeDecimal(0.000);
    public static final ScaleThreeDecimal ONE_HUNDRED = new ScaleThreeDecimal(100);

    /**
     * This constructor should never be called except during JAXB unmarshalling.
     */
    private ScaleThreeDecimal() {
        super();
    }

    public ScaleThreeDecimal(String value) {
        super(value, SCALE);
    }

    public ScaleThreeDecimal(int value) {
        super(value, SCALE);
    }

    public ScaleThreeDecimal(double value) {
        super(value, SCALE);
    }

    public ScaleThreeDecimal(BigDecimal value) {
        super(value, SCALE);
    }

    private ScaleThreeDecimal(String value, int scale) {
        super(value, scale);
    }

    private ScaleThreeDecimal(int value, int scale) {
        super(value, scale);
    }

    private ScaleThreeDecimal(double value, int scale) {
        super(value, scale);
    }

    private ScaleThreeDecimal(BigDecimal value, int scale) {
        super(value, scale);
    }

    @Override
    protected ScaleThreeDecimal newInstance(int value) {
        return new ScaleThreeDecimal(value);
    }

    @Override
    protected ScaleThreeDecimal newInstance(BigDecimal value, int scale) {
        return new ScaleThreeDecimal(value, scale);
    }

    @Override
    protected ScaleThreeDecimal zero() {
        return ZERO;
    }

    @Override
    protected ScaleThreeDecimal oneHundred() {return ONE_HUNDRED; }
}
