package sampledemo

class FilterController {

    def index() {
		redirect(action: filter)
	}
	
	def filter = {
		
		def  org =  Organization.findAll();
		[org:org]
	}
	
	def resultSet = {
		
		def gender = params.gender;
		def fromAge = params.fromAge;
		def toAge = params.toAge;
		def  org =  Organization.get(params.orgid)
		
		def c = AddUsers.createCriteria()
		def r = c.list{
			between ("age", fromAge.toInteger(), toAge.toInteger())
			and{
				eq("gender", gender)
			}
			and{
				eq("organization",org)
		
			}
			
			
							    
			}
		println "rrrrrrrrr" + r;
		[r:r]
	}
}

