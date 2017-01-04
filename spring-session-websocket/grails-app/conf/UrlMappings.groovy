class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/messages"(controller: 'home', action: 'messages')

        "/"(view:"/index")
        "500"(view:'/error')
	}
}
