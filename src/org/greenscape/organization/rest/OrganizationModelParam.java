package org.greenscape.organization.rest;

import org.greenscape.organization.OrganizationModel;

public class OrganizationModelParam implements OrganizationModel {

	/*
	 * TODO: primitive type used because of swagger bug. using wrapper types
	 * causes infinite recursion.
	 */
	private long organizationId;
	private String name;
	private String homeURL;
	private long logoId;
	private int maxUsers;
	private boolean isActive;

	@Override
	public Long getOrganizationId() {
		return organizationId;
	}

	@Override
	public OrganizationModelParam setOrganizationId(Long organizationId) {
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

}
