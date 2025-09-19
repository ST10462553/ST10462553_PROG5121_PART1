# ST10462553_PROG5121_PART1
## TABLE OF CONTENTS:
- **Main objectives**
- **Installed Dependencies**
- **Methods, Classes and other Object oriented programming constructs used**
- **Decisions used**
- **Expected user Inputs and outputs**
- **LoginTests conducted**
- **Final program results**
- **Reference List**
## PROG5121 POE PART 1 MAIN OBJECTIVES :memo:

1. Create a program with login and registration features
2. The login features must enable users to accept user inputs to capture username, password and South african cell number
3. Add conditions to accept *username, password and cellphone number* in a certain formatting e.g, the accepted format of a **username** is taken only when a user meets the condition for the **username to contain an underscore and is no longer than 5 characters long**, whereas a **password must meet complexity rules ranging from it being atleast 8 characters long, contain a capital letter, a number and a special character**. Furthermore, The **cell phone number contains the international country code followed by the number, which is no more than ten characters long.** 



### Installed Dependencies and additional necessities to create our maven project:package:
The necessary dependencies and necessities needed to run the program included:
- To create the maven project we had to select the maven-archetype-quickstart.
- Then set the groupId as za.ac.iie.prog5121 and the artifactId as quickchat, resulting in the package namely za.ac.iie.prog5121.quickchat.
-  The project structure includes pom.xml - for dependencies and property management, src/main/java - for the main.java file which contains a main class enabling us to run the entire project and the login.java file to write the project's methods and classes for the login and registration features in the app.
-  We had to edit pom.xml and replace junit 4 with junit-jupiter (JUnit 5) as well as adding a maven surefire plugin to ensure that Maven uses jUnit 5 whenever the project runs.





### Methods, Classes and other Object oriented programming constructs used :package:

<img width="600" height="300" alt="java methods" src="https://github.com/user-attachments/assets/9ab338b0-89bb-4079-8e0d-b395cda54fc6" />


> [!NOTE]
> These are used to store registration states:
> private String registeredUsername;
> private String registeredPassword;
> private String registeredCell. More methods were created to use regex patterns to determine the factors necessary in inputting your username and password,etc - these methods utilized regex patterns to allow special characters, digits, capital letters and the length of the username and passwords.



### Decisions used



### Expected user Inputs and outputs :shipit:




### LoginTests conducted




### Final program results



### Reference List
