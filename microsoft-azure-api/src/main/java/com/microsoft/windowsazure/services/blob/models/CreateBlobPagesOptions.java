/**
 * Copyright 2011 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.microsoft.windowsazure.services.blob.models;

public class CreateBlobPagesOptions extends BlobServiceOptions {
    private String leaseId;
    private String contentMD5;
    private AccessCondition accessCondition;

    /**
     * Sets the optional server request timeout value associated with this {@link CreateBlobPagesOptions} instance.
     * <p>
     * The <em>timeout</em> value only affects calls made on methods where this {@link CreateBlobPagesOptions} instance
     * is passed as a parameter.
     * 
     * @param timeout
     *            The server request timeout value to set in milliseconds.
     * @return
     *         A reference to this {@link CreateBlobPagesOptions} instance.
     */
    @Override
    public CreateBlobPagesOptions setTimeout(Integer timeout) {
        super.setTimeout(timeout);
        return this;
    }

    public String getLeaseId() {
        return leaseId;
    }

    public CreateBlobPagesOptions setLeaseId(String leaseId) {
        this.leaseId = leaseId;
        return this;
    }

    public String getContentMD5() {
        return contentMD5;
    }

    public CreateBlobPagesOptions setContentMD5(String contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    public AccessCondition getAccessCondition() {
        return accessCondition;
    }

    public CreateBlobPagesOptions setAccessCondition(AccessCondition accessCondition) {
        this.accessCondition = accessCondition;
        return this;
    }
}
