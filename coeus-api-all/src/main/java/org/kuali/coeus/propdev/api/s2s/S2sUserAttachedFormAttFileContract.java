/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2021 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.propdev.api.s2s;

import org.kuali.coeus.sys.api.model.IdentifiableNumeric;

public interface S2sUserAttachedFormAttFileContract extends IdentifiableNumeric {
	
    Long getS2sUserAttachedFormAttId();
    
    byte[] getAttachment();
}
