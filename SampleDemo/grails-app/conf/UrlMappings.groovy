class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(controller:"AddUsers", action:"/addUser")
		"500"(view:'/error')
	}
}
