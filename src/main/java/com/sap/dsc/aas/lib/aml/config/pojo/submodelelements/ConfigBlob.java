/* 
  SPDX-FileCopyrightText: (C)2021 SAP SE or an affiliate company and aas-transformation-library contributors. All rights reserved. 

  SPDX-License-Identifier: Apache-2.0 
 */
package com.sap.dsc.aas.lib.aml.config.pojo.submodelelements;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sap.dsc.aas.lib.aml.config.pojo.AbstractConfigSubmodelElement;

public class ConfigBlob extends AbstractConfigSubmodelElement implements ConfigDataElement {

    private String mimeTypeXPath;
    private String valueXPath;

    public ConfigBlob() {}

    @JsonCreator
    public ConfigBlob(@JsonProperty(required = true, value = "mimeTypeXPath") String mimeTypeXPath) {
        this.mimeTypeXPath = mimeTypeXPath;
    }

    public String getMimeTypeXPath() {
        return mimeTypeXPath;
    }

    public void setMimeTypeXPath(String mimeTypeXPath) {
        this.mimeTypeXPath = mimeTypeXPath;
    }

    public String getValueXPath() {
        return valueXPath;
    }

    public void setValueXPath(String valueXPath) {
        this.valueXPath = valueXPath;
    }
}
