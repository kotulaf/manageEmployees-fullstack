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
	- in src are all the files that create the app, first we modify App.js by putting in an h1 "Hello World" just to test the function

10) Files in our directory and what are they for:
	- package.json : contains dependencies
	- readme.md : contains the commands and all things necessary to create a React application
	- node_modules folder : where all the dependencies are installed
	- public folder : containing our index.html file, where all of our code will be loaded into this file dynamically
	  thanks to the div by id root 
	- App.js : our root component, we write code into it, it contains jsx code, which is basically HTML inside JavaScript
	- index.js : whenever we run our application the index.html will get served this file will get executed, further commentary in file

11) Let's integrate Bootstrap into our application
	- there are two ways to integrate bootstrap: through a cdn link that we can add into our header in the index.html file
						     through the terminal with a command found on the website
	- i installed bootstrap through the terminal and it appeared in our package.json as a dependency
	- make sure you import bootstrap into your application, you can use either way to do it
	- now we can use Bootstrap CSS classes to do what we need to do

12) Next we will create a React component to display a list of users on our webpage
	- create a "components" folder in the "src" folder and a new file "ListEmployeeComponent.jsx", it can also have the
	  ".js" suffix, just know we will be writing jsx code in too as is standard in React
	- download Reactjs code snippets from the VS Code marketplace

13) Let's create a React class component
	- with the "rcc" code, which will generate it
	- there we have a render method, inside it a return statement where we will be writing out jsx code
	- in this.state we initialize our employees array
	- in render we can write basically html-like code

14) Next we'll create a table to display our employees
	- and use bootstrap classes to make it look a certain way
	- in the table body we write JavaScript code to display our table dynamically
	- we are going leverage a jsx feature, .map() to iterate our array of employees
	- inside the method we write html code and assign each table cell one value

15) Now we have to connect the React app with our Rest API
	- to make a call to the Rest API we have to use a third party http library, for example axios library, which we install with the terminal
	  command npm intall axios --save
	- we might be prompted to fix some issues that are present within the program, which we can do by typing npm audit fix --force in the terminal
	- then we can see the axios dependency in our package.json

