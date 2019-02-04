
package org.kuali.coeus.common.budget.api.personnel;

import org.kuali.coeus.sys.api.model.Coded;
import org.kuali.coeus.sys.api.model.Describable;
import org.kuali.coeus.sys.api.model.ScaleTwoDecimal;

public interface AppointmentTypeContract extends Coded, Describable {

    ScaleTwoDecimal getDuration();
}
