/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteTableVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteTableVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
     * </p>
     */
    private String catalogId;
    /**
     * <p>
     * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
     * </p>
     */
    private String databaseName;
    /**
     * <p>
     * The name of the table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     */
    private String tableName;
    /**
     * <p>
     * A list of the IDs of versions to be deleted. A <code>VersionId</code> is a string representation of an integer.
     * Each version is incremented by 1.
     * </p>
     */
    private java.util.List<String> versionIds;

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by
     *        default.
     */

    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
     * </p>
     * 
     * @return The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by
     *         default.
     */

    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * <p>
     * The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by default.
     * </p>
     * 
     * @param catalogId
     *        The ID of the Data Catalog where the tables reside. If none is supplied, the AWS account ID is used by
     *        default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableVersionRequest withCatalogId(String catalogId) {
        setCatalogId(catalogId);
        return this;
    }

    /**
     * <p>
     * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param databaseName
     *        The database in the catalog in which the table resides. For Hive compatibility, this name is entirely
     *        lowercase.
     */

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    /**
     * <p>
     * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @return The database in the catalog in which the table resides. For Hive compatibility, this name is entirely
     *         lowercase.
     */

    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * <p>
     * The database in the catalog in which the table resides. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param databaseName
     *        The database in the catalog in which the table resides. For Hive compatibility, this name is entirely
     *        lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableVersionRequest withDatabaseName(String databaseName) {
        setDatabaseName(databaseName);
        return this;
    }

    /**
     * <p>
     * The name of the table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param tableName
     *        The name of the table. For Hive compatibility, this name is entirely lowercase.
     */

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    /**
     * <p>
     * The name of the table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @return The name of the table. For Hive compatibility, this name is entirely lowercase.
     */

    public String getTableName() {
        return this.tableName;
    }

    /**
     * <p>
     * The name of the table. For Hive compatibility, this name is entirely lowercase.
     * </p>
     * 
     * @param tableName
     *        The name of the table. For Hive compatibility, this name is entirely lowercase.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableVersionRequest withTableName(String tableName) {
        setTableName(tableName);
        return this;
    }

    /**
     * <p>
     * A list of the IDs of versions to be deleted. A <code>VersionId</code> is a string representation of an integer.
     * Each version is incremented by 1.
     * </p>
     * 
     * @return A list of the IDs of versions to be deleted. A <code>VersionId</code> is a string representation of an
     *         integer. Each version is incremented by 1.
     */

    public java.util.List<String> getVersionIds() {
        return versionIds;
    }

    /**
     * <p>
     * A list of the IDs of versions to be deleted. A <code>VersionId</code> is a string representation of an integer.
     * Each version is incremented by 1.
     * </p>
     * 
     * @param versionIds
     *        A list of the IDs of versions to be deleted. A <code>VersionId</code> is a string representation of an
     *        integer. Each version is incremented by 1.
     */

    public void setVersionIds(java.util.Collection<String> versionIds) {
        if (versionIds == null) {
            this.versionIds = null;
            return;
        }

        this.versionIds = new java.util.ArrayList<String>(versionIds);
    }

    /**
     * <p>
     * A list of the IDs of versions to be deleted. A <code>VersionId</code> is a string representation of an integer.
     * Each version is incremented by 1.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setVersionIds(java.util.Collection)} or {@link #withVersionIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param versionIds
     *        A list of the IDs of versions to be deleted. A <code>VersionId</code> is a string representation of an
     *        integer. Each version is incremented by 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableVersionRequest withVersionIds(String... versionIds) {
        if (this.versionIds == null) {
            setVersionIds(new java.util.ArrayList<String>(versionIds.length));
        }
        for (String ele : versionIds) {
            this.versionIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the IDs of versions to be deleted. A <code>VersionId</code> is a string representation of an integer.
     * Each version is incremented by 1.
     * </p>
     * 
     * @param versionIds
     *        A list of the IDs of versions to be deleted. A <code>VersionId</code> is a string representation of an
     *        integer. Each version is incremented by 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableVersionRequest withVersionIds(java.util.Collection<String> versionIds) {
        setVersionIds(versionIds);
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
        if (getCatalogId() != null)
            sb.append("CatalogId: ").append(getCatalogId()).append(",");
        if (getDatabaseName() != null)
            sb.append("DatabaseName: ").append(getDatabaseName()).append(",");
        if (getTableName() != null)
            sb.append("TableName: ").append(getTableName()).append(",");
        if (getVersionIds() != null)
            sb.append("VersionIds: ").append(getVersionIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteTableVersionRequest == false)
            return false;
        BatchDeleteTableVersionRequest other = (BatchDeleteTableVersionRequest) obj;
        if (other.getCatalogId() == null ^ this.getCatalogId() == null)
            return false;
        if (other.getCatalogId() != null && other.getCatalogId().equals(this.getCatalogId()) == false)
            return false;
        if (other.getDatabaseName() == null ^ this.getDatabaseName() == null)
            return false;
        if (other.getDatabaseName() != null && other.getDatabaseName().equals(this.getDatabaseName()) == false)
            return false;
        if (other.getTableName() == null ^ this.getTableName() == null)
            return false;
        if (other.getTableName() != null && other.getTableName().equals(this.getTableName()) == false)
            return false;
        if (other.getVersionIds() == null ^ this.getVersionIds() == null)
            return false;
        if (other.getVersionIds() != null && other.getVersionIds().equals(this.getVersionIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCatalogId() == null) ? 0 : getCatalogId().hashCode());
        hashCode = prime * hashCode + ((getDatabaseName() == null) ? 0 : getDatabaseName().hashCode());
        hashCode = prime * hashCode + ((getTableName() == null) ? 0 : getTableName().hashCode());
        hashCode = prime * hashCode + ((getVersionIds() == null) ? 0 : getVersionIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteTableVersionRequest clone() {
        return (BatchDeleteTableVersionRequest) super.clone();
    }

}
