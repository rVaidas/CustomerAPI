# CustomerAPI
Spring Boot Rest API.
Project contains:
  -Customer object class with object fields, setters, getters and constructors.
  -CustomerController class for comunicationg between Customer class and CustomerService. It contains posting geting functions and validation for post functions. 
  -CustomerService class for managing customers. Customer service is wired (@Autowired) to CustomerData class.
  -CustomerData class is used instead of database. There is created ArrayList and loaded with data of Customer objects.
  -DemoApplication with main method to run application.
Navigate to 'http://localhost:8080/api/v1/customer' via Postman or simillar application for posting and getting Json object.
Front end part for this project can be found here: https://github.com/rVaidas/customerFrontAngular.
  
