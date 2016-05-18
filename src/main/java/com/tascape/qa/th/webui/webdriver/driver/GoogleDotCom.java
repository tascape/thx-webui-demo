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
package com.tascape.qa.th.webui.webdriver.driver;

import com.tascape.qa.th.exception.EntityCommunicationException;
import com.tascape.qa.th.webui.driver.WebApp;

/**
 *
 * @author linsong wang
 */
public class GoogleDotCom extends WebApp {

    @Override
    public String getName() {
        return "google.com";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    public SearchPage openSearch() throws EntityCommunicationException {
        return super.open(SearchPage.class);
    }

    public GoogleAds openAds() throws EntityCommunicationException {
        return this.open(GoogleAds.class);
    }

    @Override
    public void reset() throws Exception {
    }

    @Override
    public int getLaunchDelayMillis() {
        return 5000;
    }
}
