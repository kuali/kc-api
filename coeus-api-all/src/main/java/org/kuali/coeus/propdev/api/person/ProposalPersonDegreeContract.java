/* Copyright © 2005-2018 Kuali, Inc. - All Rights Reserved
 * You may use and modify this code under the terms of the Kuali, Inc.
 * Pre-Release License Agreement. You may not distribute it.
 *
 * You should have received a copy of the Kuali, Inc. Pre-Release License
 * Agreement with this file. If not, please write to license@kuali.co.
 */
package org.kuali.coeus.propdev.api.person;

import org.kuali.coeus.common.api.person.attr.DegreeTypeContract;

public interface ProposalPersonDegreeContract extends ProposalPersonLink {

    Integer getDegreeSequenceNumber();

    String getGraduationYear();

    String getDegree();

    String getFieldOfStudy();

    String getSpecialization();

    String getSchool();

    String getSchoolIdCode();

    String getSchoolId();

    DegreeTypeContract getDegreeType();
}
