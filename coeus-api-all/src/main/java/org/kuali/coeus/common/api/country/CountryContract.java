
package org.kuali.coeus.common.api.country;

import org.kuali.coeus.sys.api.model.Coded;
import org.kuali.coeus.sys.api.model.Named;

public interface CountryContract extends Coded, Named {

    String getAlternateCode();
}
