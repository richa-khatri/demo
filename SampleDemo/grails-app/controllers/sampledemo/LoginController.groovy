package sampledemo

class LoginController {

    def index() { 
		redirect(action: log)
	}
	def log ={
	
	}
	
	
	def logindetails = {
		def user = params.userName
		def pass = params.password
		def msg = "checking"
		println "message ="+msg
		println "params : "+params
		def myUser = AddUsers.findByUserName(user);
		if((user == myUser?.userName) && (pass == myUser?.password ))
		{
			redirect(action: success , params:[myId:myUser.id])
		}
		else
		{
			msg="fail"
		}
		
		
		//[name:user, password:pass]
	
		render(view:"fail",model:[name:user, password:pass])
		}
	
	def success = {
		
		def udata = AddUsers.get(params.myId)
		def odata = udata.organization
		
		[user:udata , org:odata ]
	}
	
}

