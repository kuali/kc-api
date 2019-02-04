
package org.kuali.coeus.common.api.state;

import org.kuali.coeus.sys.api.model.Coded;
import org.kuali.coeus.sys.api.model.Named;

public interface StateContract extends Coded, Named {

    String getCountryCode();
}
