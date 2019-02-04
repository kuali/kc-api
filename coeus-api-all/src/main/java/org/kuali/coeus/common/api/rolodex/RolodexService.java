
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
