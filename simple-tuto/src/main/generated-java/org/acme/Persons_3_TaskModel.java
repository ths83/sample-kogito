/*
 * Copyright 2021 Red Hat, Inc. and/or its affiliates.
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

import org.kie.kogito.process.workitem.TaskModel;

public class Persons_3_TaskModel implements TaskModel<org.acme.Persons_3_TaskInput, org.acme.Persons_3_TaskOutput> {

    private String id;

    private String name;

    private int state;

    private String phase;

    private String phaseStatus;

    private org.acme.Persons_3_TaskInput parameters;

    private org.acme.Persons_3_TaskOutput results;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getPhaseStatus() {
        return phaseStatus;
    }

    public void setPhaseStatus(String phaseStatus) {
        this.phaseStatus = phaseStatus;
    }

    public org.acme.Persons_3_TaskInput getParameters() {
        return parameters;
    }

    public void setParameters(org.acme.Persons_3_TaskInput parameters) {
        this.parameters = parameters;
    }

    public org.acme.Persons_3_TaskOutput getResults() {
        return results;
    }

    public void setParams(org.acme.Persons_3_TaskOutput results) {
        this.results = results;
    }

    public static org.acme.Persons_3_TaskModel from(org.kie.kogito.process.WorkItem workItem) {
        org.acme.Persons_3_TaskModel taskModel = new org.acme.Persons_3_TaskModel();
        taskModel.id = workItem.getId();
        taskModel.name = workItem.getName();
        taskModel.state = workItem.getState();
        taskModel.phaseStatus = workItem.getPhaseStatus();
        taskModel.phase = workItem.getPhase();
        taskModel.parameters = org.acme.Persons_3_TaskInput.fromMap(workItem.getParameters());
        taskModel.results = org.acme.Persons_3_TaskOutput.fromMap(workItem.getResults());
        return taskModel;
    }
}
// Task model for user task 'Special handling for children' in process 'persons'
