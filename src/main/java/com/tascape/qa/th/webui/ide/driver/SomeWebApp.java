/*
 * Copyright 2015 - 2016 Nebula Bay.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tascape.qa.th.webui.ide.driver;

import com.tascape.qa.th.driver.EntityDriver;

/**
 *
 * @author linsong wang
 */
public class SomeWebApp extends EntityDriver {

    public static final String SYSPROP_URL = "qa.driver.somewebapp.url";

    private String url;

    @Override
    public String getName() {
        return "Some Web App";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public void reset() throws Exception {
        // do nothing
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
