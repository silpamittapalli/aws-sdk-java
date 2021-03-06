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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/GetChannelMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetChannelMessageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The details of and content in the message.
     * </p>
     */
    private ChannelMessage channelMessage;

    /**
     * <p>
     * The details of and content in the message.
     * </p>
     * 
     * @param channelMessage
     *        The details of and content in the message.
     */

    public void setChannelMessage(ChannelMessage channelMessage) {
        this.channelMessage = channelMessage;
    }

    /**
     * <p>
     * The details of and content in the message.
     * </p>
     * 
     * @return The details of and content in the message.
     */

    public ChannelMessage getChannelMessage() {
        return this.channelMessage;
    }

    /**
     * <p>
     * The details of and content in the message.
     * </p>
     * 
     * @param channelMessage
     *        The details of and content in the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetChannelMessageResult withChannelMessage(ChannelMessage channelMessage) {
        setChannelMessage(channelMessage);
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
        if (getChannelMessage() != null)
            sb.append("ChannelMessage: ").append(getChannelMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetChannelMessageResult == false)
            return false;
        GetChannelMessageResult other = (GetChannelMessageResult) obj;
        if (other.getChannelMessage() == null ^ this.getChannelMessage() == null)
            return false;
        if (other.getChannelMessage() != null && other.getChannelMessage().equals(this.getChannelMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelMessage() == null) ? 0 : getChannelMessage().hashCode());
        return hashCode;
    }

    @Override
    public GetChannelMessageResult clone() {
        try {
            return (GetChannelMessageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
