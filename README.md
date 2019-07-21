# json-databinding-json-demo

Dependencies: Spring MVC, jackson-databind, Servlet-ap, servlet.jsp and maven-war-plugin if we use pure java configuration.

Basics about JSON Data Binding:

1. Spring and Jackson provide support when building Spring REST applications. 

2. Spring will handle Jackson Integration automatically behind the scene. 

3. JSON data being passed to REST Controller is converted to POJO and Java Object being returned from REST Controller is converted to JSON automatically.


	//create object mapper
	ObjectMapper mapper = new ObjectMapper();

	// read JSON file and map/convert to Java POJO
	// data/ sample-lite.json
	
        Student theStudent = 
                     mapper.readValue(new File("data/sample-lite.json"), Student.class);

	//now write JSON  to output file
	mapper.enable(SerializationFeature.INDENT_OUTPUT);
	mapper.writeValue(new File("data/output.json"), theStudent);

More details about this project:
http://www.zhangpeng-chen.com/2019/07/21/spring-rest-json-data-binding/
