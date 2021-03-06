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
package com.amazonaws.services.mediaconvert.model;

import javax.annotation.Generated;

/**
 * Specify this setting only when your output will be consumed by a downstream repackaging workflow that is sensitive to
 * very small duration differences between video and audio. For this situation, choose Match video duration
 * (MATCH_VIDEO_DURATION). In all other cases, keep the default value, Default codec duration (DEFAULT_CODEC_DURATION).
 * When you choose Match video duration, MediaConvert pads the output audio streams with silence or trims them to ensure
 * that the total duration of each audio stream is at least as long as the total duration of the video stream. After
 * padding or trimming, the audio stream duration is no more than one frame longer than the video stream. MediaConvert
 * applies audio padding or trimming only to the end of the last segment of the output. For unsegmented outputs,
 * MediaConvert adds padding only to the end of the file. When you keep the default value, any minor discrepancies
 * between audio and video duration will depend on your output audio codec.
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum MpdAudioDuration {

    DEFAULT_CODEC_DURATION("DEFAULT_CODEC_DURATION"),
    MATCH_VIDEO_DURATION("MATCH_VIDEO_DURATION");

    private String value;

    private MpdAudioDuration(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return MpdAudioDuration corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static MpdAudioDuration fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (MpdAudioDuration enumEntry : MpdAudioDuration.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
