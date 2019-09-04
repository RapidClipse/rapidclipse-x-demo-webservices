# Using REST webservices within a project

This demo project shows how to configure a RapidClipse-X project to use webservices. 

### See the following detailed informations:
1. Send a simple string to the application itself by a get request
2. Send the same string but with authentication
3. Send the ID of a customer and get the whole entity

### Get the project running 
1. Clone the GIT reporsitory or use the import function of RapiClipse
2. File -> Import -> RapidClipse -> Demo Projects -> "rapidclipse-x-demo-webservices"
3. Maybe do some Maven updates to remove project errors
4. The project needs the H2Northwind database. The entities in the project should be syncronized with the database.
5. Add the following line of code to your tomcat-user.xml in your workspace/server/tomcat... `<user username="admin" password="admin" roles="restconsumer"/>)`
6. Start the project