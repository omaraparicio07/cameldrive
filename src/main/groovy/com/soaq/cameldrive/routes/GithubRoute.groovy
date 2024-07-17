package com.soaq.cameldrive.routes

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class GithubRoute extends RouteBuilder {

  @Override
  void configure() throws Exception{
    from("github:COMMIT/main?repoName=bc_python&repoOwner=omaraparicio07&oauthToken=<GITHUB_TOKEN>")
    .routeId("Github_commits")
    .log("Se ejecuto github call")
    // .to()
  }
}
