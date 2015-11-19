/*
 * Copyright (c) 2015 IBM Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */

package com.cloudant.sync.replication;

import java.util.List;

/**
 * Created by tomblench on 14/10/15.
 */

/**
 * Represents a bulk GET request for documents
 *
 * This is in the format which the replicator understands, (also the format used for querying docs
 * with open_revs and for the _revs_diff endpoint) where a list of rev ids is given for each
 * doc id
 */
public class BulkGetRequest {
    String id;
    List<String> revs;
    List<String> atts_since;

    public BulkGetRequest(String id, List<String> revs, List<String> atts_since) {
        this.atts_since = atts_since;
        this.id = id;
        this.revs = revs;
    }

    @Override
    public String toString() {
        return "BulkGetRequest{" +
                "id='" + id + '\'' +
                ", revs=" + revs +
                ", atts_since=" + atts_since +
                '}';
    }
}