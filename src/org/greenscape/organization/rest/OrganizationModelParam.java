package org.greenscape.organization.rest;

import java.util.Collection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import org.greenscape.organization.OrganizationModel;
import org.greenscape.persistence.AuditedModel;
import org.greenscape.persistence.DocumentModel;

public class OrganizationModelParam implements OrganizationModel {

	/*
	 * TODO: primitive type used because of swagger bug. using wrapper types
	 * causes infinite recursion.
	 */
	private String organizationId;
	private String name;
	private String homeURL;
	private long logoId;
	private int maxUsers;
	private boolean isActive;

	@Override
	public String getOrganizationId() {
		return organizationId;
	}

	@Override
	public OrganizationModelParam setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		return this;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public OrganizationModelParam setName(String name) {
		this.name = name;
		return this;
	}

	@Override
	public String getHomeURL() {
		return homeURL;
	}

	@Override
	public OrganizationModelParam setHomeURL(String homeURL) {
		this.homeURL = homeURL;
		return this;
	}

	@Override
	public Long getLogoId() {
		return logoId;
	}

	@Override
	public OrganizationModelParam setLogoId(Long logoId) {
		this.logoId = logoId;
		return this;
	}

	@Override
	public Integer getMaxUsers() {
		return maxUsers;
	}

	@Override
	public OrganizationModelParam setMaxUsers(Integer maxUsers) {
		this.maxUsers = maxUsers;
		return this;
	}

	@Override
	public Boolean isActive() {
		return isActive;
	}

	@Override
	public OrganizationModelParam setActive(Boolean isActive) {
		this.isActive = isActive;
		return this;
	}

	@Override
	public Object getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentModel setId(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getModelId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentModel setModelId(String modelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getProperty(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T getProperty(Class<T> clazz, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DocumentModel setProperty(String name, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getPropertySize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Map<String, Object> getProperties() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> getPropertyNames() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Object> getPropertyValues() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getCreatedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuditedModel setCreatedDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Date getModifiedDate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuditedModel setModifiedDate(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
