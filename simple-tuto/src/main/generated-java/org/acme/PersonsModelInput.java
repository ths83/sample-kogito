/*
 * Copyright 2020 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.acme;

import org.kie.kogito.MapInput;
import org.kie.kogito.MapInputId;
import org.kie.kogito.MapOutput;
import java.util.Map;
import java.util.HashMap;
import org.kie.kogito.MappableToModel;
import org.kie.kogito.Model;

@org.kie.kogito.codegen.Generated(value = "kogito-codegen", reference = "persons", name = "Persons", hidden = true)
public class PersonsModelInput implements Model, MapInput, MapInputId, MapOutput, MappableToModel<PersonsModel> {

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "person")
    @javax.validation.Valid()
    private org.acme.Person person;

    public org.acme.Person getPerson() {
        return person;
    }

    public void setPerson(org.acme.Person person) {
        this.person = person;
    }

    @org.kie.kogito.codegen.VariableInfo(tags = "")
    @com.fasterxml.jackson.annotation.JsonProperty(value = "isAdult")
    @javax.validation.Valid()
    private java.lang.Boolean isAdult;

    public java.lang.Boolean getIsAdult() {
        return isAdult;
    }

    public void setIsAdult(java.lang.Boolean isAdult) {
        this.isAdult = isAdult;
    }

    @Override()
    public PersonsModel toModel() {
        PersonsModel result = new PersonsModel();
        result.setPerson(getPerson());
        result.setIsAdult(getIsAdult());
        return result;
    }
}
