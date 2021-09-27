/*
 * Copyright 2019 Red Hat, Inc. and/or its affiliates.
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

import java.util.Map;
import org.kie.kogito.UserTask;
import org.kie.kogito.UserTaskParam.ParamType;
import org.kie.kogito.UserTaskParam;

@UserTask(taskName = "ChildrenHandling", processName = "persons")
public class Persons_3_TaskInput {

    public static Persons_3_TaskInput fromMap(Map<String, Object> params) {
        Persons_3_TaskInput item = new Persons_3_TaskInput();
        item.person = (org.acme.Person) params.get("person");
        return item;
    }

    @UserTaskParam(value = ParamType.INPUT)
    private org.acme.Person person;

    public org.acme.Person getPerson() {
        return person;
    }

    public void setPerson(org.acme.Person person) {
        this.person = person;
    }
}
// Task input for user task 'Special handling for children' in process 'persons'
