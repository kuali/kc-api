/*
 * Kuali Coeus, a comprehensive research administration system for higher education.
 * 
 * Copyright 2005-2015 Kuali, Inc.
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
package org.kuali.coeus.common.api.rolodex;

import org.kuali.coeus.sys.api.model.Inactivatable;

public interface RolodexContract extends Inactivatable {
    
    Integer getRolodexId();

    String getAddressLine1();

    String getAddressLine2();

    String getAddressLine3();

    String getCity();

    String getComments();

    String getCountryCode();

    String getCounty();

    Boolean getDeleteFlag();

    String getEmailAddress();

    String getFaxNumber();

    String getFirstName();

    String getLastName();

    String getMiddleName();

    String getOrganization();

    String getOwnedByUnit();

    String getPhoneNumber();

    String getPostalCode();

    String getPrefix();

    boolean getSponsorAddressFlag();

    String getSponsorCode();

    String getState();

    String getSuffix();

    String getTitle();

    String getCreateUser();

    String getFullName();
}
