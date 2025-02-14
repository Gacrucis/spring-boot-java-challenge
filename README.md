<img align="right" src="https://github.com/ada-school/module-template/blob/main/ada.png">

## How to Run
`docker compose up --build`

## How to Test
Using Postman, import the `./postman` file `Challenge.postman_collection`, I recommend creating a fixed ID booking for ease of testing and replacing {{root}} for `http://127.0.0.1:8080`

The maven app itself has defined unit tests, but these were for myself and just call the service as the already defined API would, proper unit tests should use Mockito or related methods.

## Spring Boot and Java/Kotlin Backend Mentor 👩‍💻 👨‍💻 Code Challenge

Thank you 🙏 for taking the time to implement this coding challenge to build a fast microservice REST API using *Java/Kotlin* and *Spring Boot*.

## Conditions

* Take 2-4 hours to implement your project.
* Use coding best practices.
* Create a fork of this repo and share your solution when finished.


## Coding Challenge  💻 

A bus company wants to start using technology and allow their users to book online tickets. Please help them build a [REST API Level 2](https://martinfowler.com/articles/richardsonMaturityModel.html#level2)(pereferible) that lets them control their trip bookings, supporting the following operations:
* Create a new booking with the following information: name, email, origin, destination, departure date and time and duration.
* Update an existing booking
* Find a booking using its ID.
* Delete an existing booking.

# Expected Quality Attributes:
* Using coding best practices.
* SOLID principles.
* Clear usage of Depdencies injection.
* Correct ussage of Spring Boot annotations.
* Correct connection with a persistance layer.

# Desired technology stack:
* Java / Kotlin 
* Spring Boot
* MongoDB

## Submit your solution

Once you're done, please send us an email to [tech@ada-school.org](mailto:tech@ada-school.org) with the subject: TECH_CHALLENGE_[YOUR NAME] and do not forget to include the link to your repository with the solution. After you submit your code, we will review it and contact you to discuss next steps. 

Good luck! 💪
