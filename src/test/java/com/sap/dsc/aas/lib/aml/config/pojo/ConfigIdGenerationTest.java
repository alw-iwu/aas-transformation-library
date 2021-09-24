/* 
  SPDX-FileCopyrightText: (C)2021 SAP SE or an affiliate company and aas-transformation-library contributors. All rights reserved. 

  SPDX-License-Identifier: Apache-2.0 
 */
package com.sap.dsc.aas.lib.aml.config.pojo;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sap.dsc.aas.lib.aml.exceptions.MissingConfigException;

public class ConfigIdGenerationTest {

    private ConfigIdGeneration classUnderTest;

    @BeforeEach
    void setup() {
        this.classUnderTest = new ConfigIdGeneration();
    }

    @Test
    void invalidNoParameters() {
        assertThrows(MissingConfigException.class, () -> this.classUnderTest.setParameters(new ArrayList<>()));
    }

}
