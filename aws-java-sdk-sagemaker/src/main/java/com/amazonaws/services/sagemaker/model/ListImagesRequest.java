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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListImages" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListImagesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter that returns only images created on or after the specified time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * A filter that returns only images created on or before the specified time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * A filter that returns only images modified on or after the specified time.
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;
    /**
     * <p>
     * A filter that returns only images modified on or before the specified time.
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;
    /**
     * <p>
     * The maximum number of images to return in the response. The default value is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A filter that returns only images whose name contains the specified string.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * If the previous call to <code>ListImages</code> didn't return the full set of images, the call returns a token
     * for getting the next set of images.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The property used to sort results. The default value is <code>CREATION_TIME</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order. The default value is <code>DESCENDING</code>.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * A filter that returns only images created on or after the specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only images created on or after the specified time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only images created on or after the specified time.
     * </p>
     * 
     * @return A filter that returns only images created on or after the specified time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only images created on or after the specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only images created on or after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only images created on or before the specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only images created on or before the specified time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only images created on or before the specified time.
     * </p>
     * 
     * @return A filter that returns only images created on or before the specified time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only images created on or before the specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only images created on or before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * A filter that returns only images modified on or after the specified time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        A filter that returns only images modified on or after the specified time.
     */

    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only images modified on or after the specified time.
     * </p>
     * 
     * @return A filter that returns only images modified on or after the specified time.
     */

    public java.util.Date getLastModifiedTimeAfter() {
        return this.lastModifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only images modified on or after the specified time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        A filter that returns only images modified on or after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        setLastModifiedTimeAfter(lastModifiedTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only images modified on or before the specified time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        A filter that returns only images modified on or before the specified time.
     */

    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only images modified on or before the specified time.
     * </p>
     * 
     * @return A filter that returns only images modified on or before the specified time.
     */

    public java.util.Date getLastModifiedTimeBefore() {
        return this.lastModifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only images modified on or before the specified time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        A filter that returns only images modified on or before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        setLastModifiedTimeBefore(lastModifiedTimeBefore);
        return this;
    }

    /**
     * <p>
     * The maximum number of images to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of images to return in the response. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of images to return in the response. The default value is 10.
     * </p>
     * 
     * @return The maximum number of images to return in the response. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of images to return in the response. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of images to return in the response. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A filter that returns only images whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        A filter that returns only images whose name contains the specified string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A filter that returns only images whose name contains the specified string.
     * </p>
     * 
     * @return A filter that returns only images whose name contains the specified string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * A filter that returns only images whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        A filter that returns only images whose name contains the specified string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * If the previous call to <code>ListImages</code> didn't return the full set of images, the call returns a token
     * for getting the next set of images.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListImages</code> didn't return the full set of images, the call returns a
     *        token for getting the next set of images.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListImages</code> didn't return the full set of images, the call returns a token
     * for getting the next set of images.
     * </p>
     * 
     * @return If the previous call to <code>ListImages</code> didn't return the full set of images, the call returns a
     *         token for getting the next set of images.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous call to <code>ListImages</code> didn't return the full set of images, the call returns a token
     * for getting the next set of images.
     * </p>
     * 
     * @param nextToken
     *        If the previous call to <code>ListImages</code> didn't return the full set of images, the call returns a
     *        token for getting the next set of images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListImagesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CREATION_TIME</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CREATION_TIME</code>.
     * @see ImageSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CREATION_TIME</code>.
     * </p>
     * 
     * @return The property used to sort results. The default value is <code>CREATION_TIME</code>.
     * @see ImageSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CREATION_TIME</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CREATION_TIME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSortBy
     */

    public ListImagesRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The property used to sort results. The default value is <code>CREATION_TIME</code>.
     * </p>
     * 
     * @param sortBy
     *        The property used to sort results. The default value is <code>CREATION_TIME</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSortBy
     */

    public ListImagesRequest withSortBy(ImageSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order. The default value is <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>DESCENDING</code>.
     * @see ImageSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order. The default value is <code>DESCENDING</code>.
     * </p>
     * 
     * @return The sort order. The default value is <code>DESCENDING</code>.
     * @see ImageSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order. The default value is <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>DESCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSortOrder
     */

    public ListImagesRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order. The default value is <code>DESCENDING</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order. The default value is <code>DESCENDING</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageSortOrder
     */

    public ListImagesRequest withSortOrder(ImageSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getLastModifiedTimeAfter() != null)
            sb.append("LastModifiedTimeAfter: ").append(getLastModifiedTimeAfter()).append(",");
        if (getLastModifiedTimeBefore() != null)
            sb.append("LastModifiedTimeBefore: ").append(getLastModifiedTimeBefore()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListImagesRequest == false)
            return false;
        ListImagesRequest other = (ListImagesRequest) obj;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getLastModifiedTimeAfter() == null ^ this.getLastModifiedTimeAfter() == null)
            return false;
        if (other.getLastModifiedTimeAfter() != null && other.getLastModifiedTimeAfter().equals(this.getLastModifiedTimeAfter()) == false)
            return false;
        if (other.getLastModifiedTimeBefore() == null ^ this.getLastModifiedTimeBefore() == null)
            return false;
        if (other.getLastModifiedTimeBefore() != null && other.getLastModifiedTimeBefore().equals(this.getLastModifiedTimeBefore()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeAfter() == null) ? 0 : getLastModifiedTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeBefore() == null) ? 0 : getLastModifiedTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListImagesRequest clone() {
        return (ListImagesRequest) super.clone();
    }

}
