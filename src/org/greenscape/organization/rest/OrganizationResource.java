package org.greenscape.organization.rest;

import java.util.Collection;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.amdatu.web.rest.doc.Description;
import org.greenscape.organization.OrganizationEntity;
import org.greenscape.organization.OrganizationModel;
import org.greenscape.organization.service.OrganizationService;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Path("organization")
@Component(service = Object.class)
public class OrganizationResource {

	private static final String PARAM_DEF_ORG_ID = "{orgId:\\d+}";
	private OrganizationService organizationService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Description("List of Organization")
	public Collection<OrganizationEntity> listOrganizations() {
		Collection<OrganizationEntity> list = null;
		try {
			list = organizationService.findAll();
		} catch (Exception e) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND).entity("Server error").build());
		}
		return list;
	}

	/**
	 * 
	 * @param param
	 * @return
	 */
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Description("Add Organization")
	public String addOrganization(OrganizationModelParam param) {
		OrganizationEntity entity = new OrganizationEntity();
		copy(entity, param);
		OrganizationModel model = organizationService.save(entity);
		return model.getOrganizationId() + "";
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path(PARAM_DEF_ORG_ID)
	@Description("Get Organization Details")
	public OrganizationModel getOrganization(@PathParam("orgId") long orgId) {
		OrganizationModel model = null;
		model = organizationService.findByOrganizationId(orgId);

		if (model == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND)
					.entity("No organization with id " + orgId + " exists").build());
		}
		return model;
	}

	@POST
	@Path(PARAM_DEF_ORG_ID)
	@Consumes(MediaType.APPLICATION_JSON)
	@Description("Update Organization Details")
	public String updateOrganization(@PathParam("orgId") long orgId, OrganizationModelParam param) {
		OrganizationEntity entity = organizationService.findByOrganizationId(orgId);
		if (entity == null) {
			throw new WebApplicationException(Response.status(Status.NOT_FOUND)
					.entity("No organization with id " + orgId + " exists").build());
		}
		copy(entity, param);
		organizationService.save(entity);
		return "OK";
	}

	@DELETE
	@Path(PARAM_DEF_ORG_ID)
	@Description("Delete Organization")
	public String deleteOrganization(@PathParam("orgId") long orgId) {
		organizationService.deleteByOrganizationId(orgId);
		return "OK";
	}

	@Reference
	public void setOrganizationService(OrganizationService service) {
		this.organizationService = service;
	}

	public void unsetOrganizationService(OrganizationService service) {
		this.organizationService = null;
	}

	private void copy(OrganizationEntity entity, OrganizationModelParam param) {
		entity.setName(param.getName());
		entity.setHomeURL(param.getHomeURL());
	}

}
