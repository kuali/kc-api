/*-
 * #%L
 * %%
 * Copyright (C) 2014 - 2020 Kuali, Inc. - All Rights Reserved
 * %%
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 * 
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 * #L%
 */

package org.kuali.coeus.common.api.rolodex;


/**
 * This service provides methods for working with Rolodex objects.
 *
 * @author Kuali Research Administration Team
 *
 */
public interface RolodexService {

    /**
     * This method will retrieves a {@link RolodexContract} by rolodexId.  The rolodexId cannot be null.
     * @param rolodexId the rolodexId.  Cannot be null.
     * @return the {@link RolodexContract} or null if not found.
     * @throws java.lang.IllegalArgumentException if the rolodexId is null
     */
    RolodexContract getRolodex(Integer rolodexId);
}
