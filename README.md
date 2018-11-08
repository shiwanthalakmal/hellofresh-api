# Hellofresh-Api-Test (Without Framework)

### Prerequisite Setup Instructions:

1 Clone testNg reporting project and build local machine:
> - https://github.com/shiwanthalakmal/testng-reporter-Maven-Plugin.git
> - Build this reporting project using ```mvn clean install``` command

### Setup HelloFresh-Api Project

1 clone hellofresh-api project and follow below steps
> - https://github.com/shiwanthalakmal/hellofresh-api.git
> - Execute ```mvn idea:clean idea:idea``` command to clean project and convert into .idea type project to open using InteliJIdea.
> - Open **hellofresh-api** project using InteliJIdea tool and resolve all required external dependencies.
> - Run individual test level, class level and suite level(using testng.xml) with InterliJIdea.

```**Note: Loggers and Reporter files only generate through the command line execution**```

### Execute HelloFresh-Api Project (Command line)

1 clone and hellofresh-api project and follow below steps (*above prerequisite needed)
> - Run ```mvn clean install -Pdemo``` to execute configure demo test suite with maven profile
> - Generate real time log under ```c:->log``` dir as well as ```console``` out put.
> - End of the execution comprehensive report will generate under project target dir ```taeget```

```**Note: Possible to manage test suites using maven profile easily**```

### Assignment Criteria and Status

- [x] Get all countries and validate that US, DE and GB were returned in the response
- [x] Get each country (US, DE and GB) individually and validate the response
- [x] Try to get information for inexistent countries and validate the response
- [x] This API has not a POST method at the moment, but it is being developed. Write a test that would validate new country addition using POST(it will not work now, but no worries).