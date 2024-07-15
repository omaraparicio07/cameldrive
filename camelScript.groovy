//@Grab('org.apache.camel:camel-core:4.7.0')
//@Grab('org.slf4j:slf4j-simple:1.6.6')
@Grapes([
    @Grab(group='org.slf4j', module='slf4j-simple', version='2.0.13', scope='test'),
		@Grab('org.apache.camel:camel-core:4.7.0')
])

import org.apache.camel.*
import org.apache.camel.impl.*
import org.apache.camel.builder.*

def camelContext = new DefaultCamelContext()

camelContext.addRoutes(new RouteBuilder() {

def void configure() {
	from("timer://jdkTimer?period=3000")
	.to("log://camelLogger?level=INFO")}
})
camelContext.start()
addShutdownHook{ camelContext.stop() }
synchronized(this){ this.wait() }


