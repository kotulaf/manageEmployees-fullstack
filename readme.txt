SPRING BOOT FULL STACK EMPLOYEE MANAGEMENT APP PROJECT
- in this app we are going to utilize Spring Boot capabilities and front-end as well, specifically ReactJS to build an employee management app

For front-end we will be using:	
	React, JavaScript, NodeJS and NPM, Bootstrap and Axios HTTP Library

For back-end we will be using:
	Spring Boot, SpringData JPA, Maven, postgreSQL

IMPORTANT NOTE!!! if you want the table to be created in postgres the files/their packages must be in the same package as the main application

1) Configurating the application.properties file and rename it to an application.yml file
	- it probably doesn't matter which type of file is used, but we don't want to use both, as the application.properties file
	  as it will overwrite the properties set in our .yml file, also the properties are written a little differently
	- we will set ddl-auto to update, therefore the tables won't get deleted whenever we stop the program execution

2) Creating packages (folders) for our "modules" (?) - repository, model, exception and controller

3) Next, we create our entity, we always create the file that represents the table first, and do all the shanigans
	- annotate with entity and table, id and columns

4) Now let's create a repo, don't forget it always extends the JpaRepository and that must include our values, and ofc annotate
   with @Repository

5) The ResourceNotFoundException class is created and it extends RuntimeException, which implements serialversionUID
	- we will create a constructor that will refer to the superclass with a message, which is the class its created in

6) Create our Controller, annotate it with @RestController and @RequestMapping
	- our repo variable will be created but we have to put @Autowired of course, it makes it work for us
	- first function we create is get all data from the database, which is pretty straightforward, we basically return
	  a list of in this case employees from the repo, which we initialized and has the basic functions built in,
	  no need for query here, also we have to use @GetMapping annotation, Get because we are getting data and we are mapping
	  an url to it

7) We can add rows into the table by hand in postgreSQL terminal

8) Test whether our we put the rows into our table and whether we established a connection, with Thunder client using the GET method

9) We create a React app, using a new window and folder in VS Code and google how to create a react project and follow the instructions
	- we create the project with the command "npx create-react-app my-app" 
	- then we change to the directory that's been created and run the app with the command "npm start", the window will open automatically
