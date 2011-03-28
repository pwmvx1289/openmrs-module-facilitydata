/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.module.facilitydata.model;

import org.openmrs.module.facilitydata.model.enums.AggregationMethod;

/**
 * The base class for all question types.
 */
public abstract class FacilityDataQuestion extends BaseFacilityMetaData {

	//***** PROPERTIES *****
	
    private AggregationMethod aggregationMethod;

    //***** CONSTRUCTORS *****
    
    public FacilityDataQuestion() {}
    
    //***** PROPERTY ACCESS *****

    /**
	 * @return the aggregationMethod
	 */
	public AggregationMethod getAggregationMethod() {
		return aggregationMethod;
	}

	/**
	 * @param aggregationMethod the aggregationMethod to set
	 */
	public void setAggregationMethod(AggregationMethod aggregationMethod) {
		this.aggregationMethod = aggregationMethod;
	}
}