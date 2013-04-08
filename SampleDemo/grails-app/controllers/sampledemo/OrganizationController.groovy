package sampledemo

class OrganizationController {

    def index() { 
		redirect(action: addOrganization);
	}
	
	def addOrganization = {
		
		def organization = params.organization;
		if((params.organization != " "))
		{
			new Organization(organization:organization).save();
		}
		[organization:organization]
		
	}
}
