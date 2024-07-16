package com.soaq.cameldrive.routes

import org.apache.camel.builder.RouteBuilder
import org.springframework.stereotype.Component

@Component
class GoogleDriveRoute extends RouteBuilder {

  @Override
  void configure() throws Exception{
    from("google-drive://drive-files/list?clientId=&clientSecret=&delay=10000&scopes=['https://www.googleapis.com/auth/drive']")
    // from("https://www.googleapis.com/drive/v3/files")
    // .transform(simple("${body.toString()}"))
    .log("HI")
  }
}
