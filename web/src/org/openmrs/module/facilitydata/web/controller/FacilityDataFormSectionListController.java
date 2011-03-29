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
package org.openmrs.module.facilitydata.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.openmrs.web.WebConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/module/facilitydata/section.list")
public class FacilityDataFormSectionListController {

    @RequestMapping(method = RequestMethod.GET)
    public String homepage(ModelMap map) {
        return "/module/facilitydata/sectionList";
    }


    @RequestMapping(method = RequestMethod.POST)
    public String deleteFormSection(@RequestParam Integer id, ModelMap map, HttpServletRequest request) {
        // TODO: The delete here
        request.getSession().setAttribute(WebConstants.OPENMRS_MSG_ATTR, "facilitydata.deleted-form-section");
        return "/module/facilitydata/sectionList";
    }

}
