
package org.kuali.coeus.propdev.api.s2s;

import org.kuali.coeus.sys.api.model.Identifiable;
import org.kuali.coeus.sys.api.model.Inactivatable;

public interface S2sFormConfigurationContract extends Identifiable, Inactivatable {

    String getFormName();
    String getInactiveMessage();
}
