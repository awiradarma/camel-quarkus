package test.andre;

//import org.apache.camel.builder.RouteBuilder;

public class Timer //extends RouteBuilder {
{
    //@Override
    public void configure() throws Exception {
        //from("timer:whatever?period=2000")
        //    .log("Hello there..");
        
        //from("rest:get:hello:/{me}")
        //    .transform().simple("Hi ${header.me}");
          
        //from("rest:get:hello:/french/{me}")
        //    .transform().simple("Bonjour ${header.me}");

        //from("rest:get:hello:/{me}")
        //    .to("bean:myNamedBean?method=hello(${header.me})")
        //    .to("file:///tmp/destination?fileName=${header.me}.txt")
        //    .log("Invoked with the argument of ${header.me}");

        //from("file:///tmp/destination?noop=true")
        //    .log("In the destination folder, received ${header.CamelFileName} ${header.CamelFileLength}");

        //from("file-watch:///tmp/destination")
        //    .log("File event: ${header.CamelFileEventType} occured on file ${header.CamelFileName} ");

        //from("file:///tmp/source?delete=true")
            //.process(new FileProcessor())
        //    .to("file:///tmp/destination");

        
    }
    
}
