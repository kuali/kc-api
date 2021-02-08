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

package org.kuali.coeus.common.api.custom.attr;

import org.kuali.coeus.sys.api.model.DocumentTyped;
import org.kuali.coeus.sys.api.model.IdentifiableNumeric;
import org.kuali.coeus.sys.api.model.Inactivatable;

public interface CustomAttributeDocumentContract extends IdentifiableNumeric, DocumentTyped, Inactivatable {

    boolean isRequired();
    String getTypeName();
    CustomAttributeContract getCustomAttribute();
}
