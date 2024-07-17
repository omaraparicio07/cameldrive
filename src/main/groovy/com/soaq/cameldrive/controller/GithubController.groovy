package com.soaq.cameldrive.controller

import org.apache.camel.Produce;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@Controller
@RequestMapping("/say")
class GithubController {

    @Autowired
    // @Qualifier("myCamelContextID")
    private CamelContext camelContext;

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    @ResponseBody
    def sayHello() throws ExecutionException, InterruptedException {
        println "DENTRO WS"
        // Future future = template.asyncSendBody(template.getDefaultEndpoint(), value);
        println camelContext.startRoute("Github_commits")
        return 200
    }
}
