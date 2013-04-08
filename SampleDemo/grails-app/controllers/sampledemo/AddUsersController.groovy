package sampledemo

class AddUsersController {

    def index() { 
		
		redirect(action: addUser)
	}
	
	def addUser = 
	{
		def user = params.userName;
		def pass = params.password;
		def gender = params.gender;
		def age = params.age;
		def org1 = Organization.findAll();
		if((params.userName != " ") && (params.password != " ") && (params.gender !=" ") &&( params.age != " " ))
		{
			def u = new AddUsers(userName:user, password:pass, gender:gender, age:age)
			def  org =  Organization.get(params.orgid)
			u.organization = org;
			u.save();
			
		}
		[org1:org1]
	
	
}
}