package org.wanjiku.letsPlay.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.wanjiku.letsPlay.persistence.user.UserAccount;

import javax.ws.rs.Path;

@Path("users")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(value ={MediaType.APPLICATION_JSON,MediaType.TEXT_XML})
public class UserAccountResource {
	private UserAccountResource userAccountService = new UserAccountResource();
	
	@GET
	public List<UserAccount> getUsers(){
		return userAccountService.getUsers();
	}

}
