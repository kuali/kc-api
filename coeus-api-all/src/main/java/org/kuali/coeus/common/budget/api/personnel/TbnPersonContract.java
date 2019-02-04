
package org.kuali.coeus.common.budget.api.personnel;

import org.kuali.coeus.sys.api.model.Identifiable;
import org.kuali.coeus.sys.api.model.Inactivatable;

public interface TbnPersonContract extends Identifiable, Inactivatable {
    String getPersonName();
    JobCodeContract getJobCodeReference();
}
