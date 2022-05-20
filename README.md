# CustomerAPI
Spring Boot Rest API.
Project contains:
  -Customer object class with object fields, setters, getters and constructors.
  -CustomerController class for comunicationg between Customer class and CustomerService. It contains posting geting funkctions and validation for post functions. 
  -CustomerService class for managing customers. Customer service is wired (@Autowired) to CustomerData class.
  -CustomerData class is used instead of database. There is created ArrayList and loaded with data of Customer objects.
  -DemoApplication with main method tu run application.
API cal be run on (http://localhost:8080/api/v1/customer) Postman or simillar application for posting and getting Jason object.
Front end part for this project can be found here: https://github.com/rVaidas/customerFrontAngular.
  
