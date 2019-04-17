/*
 * Copyright 2018 Red Hat, Inc. and/or its affiliates.
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

package org.kie.processmigration.service;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.spi.Bean;

import org.jboss.weld.junit.MockBean;
import org.kie.processmigration.model.KieServerConfig;

public abstract class AbstractBeanBasedTest {

    public static final String MOCK_KIESERVER_ID = "mock-kieserver";

    protected static Bean<?> createMockBean(Class<?> clazz) {
        return MockBean.of(mock(clazz), clazz);
    }

    protected void addMockConfigs(KieService mock) {
        Map<String, KieServerConfig> configs = new HashMap<>();
        configs.put(MOCK_KIESERVER_ID, new KieServerConfig());
        when(mock.getConfigs()).thenReturn(configs);
    }
}
