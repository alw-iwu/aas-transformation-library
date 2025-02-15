/* 
  SPDX-FileCopyrightText: (C)2021 SAP SE or an affiliate company and aas-transformation-library contributors. All rights reserved. 

  SPDX-License-Identifier: Apache-2.0 
 */
package com.sap.dsc.aas.lib.aml.config.pojo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConfigAmlToAasTest {

    @Test
    @DisplayName("Load config JSON from string")
    void loadFromString() throws JsonMappingException, JsonProcessingException {
        String json = "{ \"version\" : \"1.0.0\", \"aasVersion\" : \"3.0RC01\", \"configMappings\": [] }";
        ObjectMapper objectMapper = new ObjectMapper();
        ConfigAmlToAas config = objectMapper.readValue(json, ConfigAmlToAas.class);

        assertEquals("1.0.0", config.getVersion());
        assertEquals("3.0RC01", config.getAasVersion());
    }

}
