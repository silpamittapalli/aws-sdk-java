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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/ListAccountIntegrations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAccountIntegrationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of ListAccountIntegration instances.
     * </p>
     */
    private java.util.List<ListIntegrationItem> items;
    /**
     * <p>
     * The pagination token from the previous ListAccountIntegrations API call.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of ListAccountIntegration instances.
     * </p>
     * 
     * @return The list of ListAccountIntegration instances.
     */

    public java.util.List<ListIntegrationItem> getItems() {
        return items;
    }

    /**
     * <p>
     * The list of ListAccountIntegration instances.
     * </p>
     * 
     * @param items
     *        The list of ListAccountIntegration instances.
     */

    public void setItems(java.util.Collection<ListIntegrationItem> items) {
        if (items == null) {
            this.items = null;
            return;
        }

        this.items = new java.util.ArrayList<ListIntegrationItem>(items);
    }

    /**
     * <p>
     * The list of ListAccountIntegration instances.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setItems(java.util.Collection)} or {@link #withItems(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param items
     *        The list of ListAccountIntegration instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountIntegrationsResult withItems(ListIntegrationItem... items) {
        if (this.items == null) {
            setItems(new java.util.ArrayList<ListIntegrationItem>(items.length));
        }
        for (ListIntegrationItem ele : items) {
            this.items.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of ListAccountIntegration instances.
     * </p>
     * 
     * @param items
     *        The list of ListAccountIntegration instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountIntegrationsResult withItems(java.util.Collection<ListIntegrationItem> items) {
        setItems(items);
        return this;
    }

    /**
     * <p>
     * The pagination token from the previous ListAccountIntegrations API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous ListAccountIntegrations API call.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous ListAccountIntegrations API call.
     * </p>
     * 
     * @return The pagination token from the previous ListAccountIntegrations API call.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token from the previous ListAccountIntegrations API call.
     * </p>
     * 
     * @param nextToken
     *        The pagination token from the previous ListAccountIntegrations API call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAccountIntegrationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
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
        if (getItems() != null)
            sb.append("Items: ").append(getItems()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAccountIntegrationsResult == false)
            return false;
        ListAccountIntegrationsResult other = (ListAccountIntegrationsResult) obj;
        if (other.getItems() == null ^ this.getItems() == null)
            return false;
        if (other.getItems() != null && other.getItems().equals(this.getItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItems() == null) ? 0 : getItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAccountIntegrationsResult clone() {
        try {
            return (ListAccountIntegrationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
