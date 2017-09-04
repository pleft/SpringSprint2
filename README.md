# Spring Sprint 2

## Spring Framework Experimenting Sprints #2

### Description
Simple Spring application demonstrating two ways of initializing the Web Application Context. Either by implementing the `WebApplicationInitializer` interface and registering an DispatcherServlet or by implementing the `AbstractAnnotationConfigDispatcherServletInitializer`. The second approach is in a separate branch named: `DispatcherServletInitializer`.

This example also shows the two contexts created, one is the rootContext in which we register beans like `service`s, `DAO`s etc (`RootContextConfiguration`)and the other is the servlet context in which we register our `Controllers` (`ServletContextConfiguration`)

### How to run
run the command: `mvn clean package tomcat7:run`
Accessible through: `http://localhost:8080/SpringSprint2/`
