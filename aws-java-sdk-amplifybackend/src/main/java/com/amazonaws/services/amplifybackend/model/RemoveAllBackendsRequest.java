/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body for RemoveAllBackends.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/RemoveAllBackends" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveAllBackendsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * Cleans up the Amplify Console app if this value is set to true.
     * </p>
     */
    private Boolean cleanAmplifyApp;

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @return The app ID.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAllBackendsRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * Cleans up the Amplify Console app if this value is set to true.
     * </p>
     * 
     * @param cleanAmplifyApp
     *        Cleans up the Amplify Console app if this value is set to true.
     */

    public void setCleanAmplifyApp(Boolean cleanAmplifyApp) {
        this.cleanAmplifyApp = cleanAmplifyApp;
    }

    /**
     * <p>
     * Cleans up the Amplify Console app if this value is set to true.
     * </p>
     * 
     * @return Cleans up the Amplify Console app if this value is set to true.
     */

    public Boolean getCleanAmplifyApp() {
        return this.cleanAmplifyApp;
    }

    /**
     * <p>
     * Cleans up the Amplify Console app if this value is set to true.
     * </p>
     * 
     * @param cleanAmplifyApp
     *        Cleans up the Amplify Console app if this value is set to true.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveAllBackendsRequest withCleanAmplifyApp(Boolean cleanAmplifyApp) {
        setCleanAmplifyApp(cleanAmplifyApp);
        return this;
    }

    /**
     * <p>
     * Cleans up the Amplify Console app if this value is set to true.
     * </p>
     * 
     * @return Cleans up the Amplify Console app if this value is set to true.
     */

    public Boolean isCleanAmplifyApp() {
        return this.cleanAmplifyApp;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getCleanAmplifyApp() != null)
            sb.append("CleanAmplifyApp: ").append(getCleanAmplifyApp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RemoveAllBackendsRequest == false)
            return false;
        RemoveAllBackendsRequest other = (RemoveAllBackendsRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getCleanAmplifyApp() == null ^ this.getCleanAmplifyApp() == null)
            return false;
        if (other.getCleanAmplifyApp() != null && other.getCleanAmplifyApp().equals(this.getCleanAmplifyApp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getCleanAmplifyApp() == null) ? 0 : getCleanAmplifyApp().hashCode());
        return hashCode;
    }

    @Override
    public RemoveAllBackendsRequest clone() {
        return (RemoveAllBackendsRequest) super.clone();
    }

}
