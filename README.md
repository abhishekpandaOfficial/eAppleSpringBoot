
## eAppleSpringBoot Microservice Architecture 

![image](https://github.com/abhishekpandaOfficial/eAppleSpringBoot/assets/64636317/93953df7-a621-4625-b681-3a05e1fd44dd)

##  eAppleSpringBoot Microservice Logical Flow for Services . 

![image](https://github.com/abhishekpandaOfficial/eAppleSpringBoot/assets/64636317/111a9b5f-8fd0-426e-9330-7543566b50d1)

## Testcontainers for Integration Test
--------------------------------------
    •	Testcontainers is a library that provides easy and lightweight APIs for bootstrapping local development and test dependencies with real services wrapped in Docker containers.
 
    •	Using Testcontainers, you can write tests that depend on the same services you use in production without mocks or in-memory services.

    ### What problems does Testcontainers solve?
  ------------------------------------------------
  ![image](https://github.com/abhishekpandaOfficial/eAppleSpringBoot/assets/64636317/d6a9c5a9-0b20-4c0c-a89d-bc6257238330)

   ### Testcontainers workflow
   --------------------------
     • You can use Testcontainers with any testing library you are already familiar with. A typical Testcontainers-based integration test works as follows:
![image](https://github.com/abhishekpandaOfficial/eAppleSpringBoot/assets/64636317/314fb3fc-8c31-46b8-a869-5f608d82f0f7)

    •	Before Test execution: Start your required services (databases, messaging systems etc.) as Docker containers using the Testcontainers API. Once the required containers start, configure or update your application configuration to use these containerized services             and optionally initialize data needed for the test.
    •	During Test execution: Your tests run using these containerized services.
    •	After Test execution: Testcontainers takes care of destroying containers irrespective of whether tests are executed successfully or there were any failures.




