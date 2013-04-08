package sampledemo

class AddUsers {
	
	String userName
	String password
	String gender
	int  age
	static belongsTo = [organization:Organization]
	 

    static constraints = {
    }
}
