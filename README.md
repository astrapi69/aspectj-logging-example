# Aspect-Oriented Logging in Java with AspectJ

This repository contains the source code for the tutorial **Aspect-Oriented Logging in Java: A Step-by-Step Guide with AspectJ**, which demonstrates how to use **AspectJ** to apply logging as a cross-cutting concern in Java applications.

### Overview

Aspect-Oriented Programming (AOP) allows us to separate concerns like logging from the main business logic, making the code cleaner and more maintainable. This project implements logging in Java using **AspectJ** for method interception and demonstrates how to configure **load-time weaving** with an `aop.xml` configuration file.

### Key Features
- **AspectJ Weaving**: Dynamically intercept method calls and apply logging.
- **Load-Time Weaving (LTW)**: Use `aop.xml` for weaving aspects at runtime.
- **SLF4J Logging**: Unified logging with **SLF4J** and **Logback**.
- **Fat JAR Generation**: Custom Gradle task for building a fat JAR with all dependencies.
- **Example Classes**: Sample services and aspects to demonstrate method interception and logging.

### Steps Covered in the Article
The project is based on the tutorial available [here on Medium](https://asterios-raptis.medium.com/aspect-oriented-logging-in-java-a-step-by-step-guide-with-aspectj-aa8f8865b026). The article walks through the following steps:
1. Setting up a Gradle project with AspectJ.
2. Creating aspects for logging.
3. Using the `aop.xml` file for load-time weaving.
4. Building a fat JAR with dependencies using Gradle.
5. Configuring IntelliJ IDEA for running with AspectJ.

### How to Run the Project

1. Clone the repository:
```bash
   git clone https://github.com/astrapi69/aspectj-logging-example.git
   cd aspectj-logging-example
```

Build the project and create the fat JAR:

```bash
gradle withAllDependendiesJar
```

Run the application with the AspectJ weaver:

```bash
java -javaagent:/path/to/aspectjweaver-1.9.19.jar -Daj.weaving.verbose=true -jar build/libs/app-all.jar
```

If using IntelliJ IDEA, configure the VM options as described in the tutorial to run the application directly from the IDE.

Example Code Structure
```graphql

src
├── main
│   ├── java
│   │   └── com
│   │       └── example
│   │           ├── LoggingAspect.java  # Aspect for logging method calls
│   │           ├── SampleService.java  # Sample service with methods to intercept
│   │           └── MainApp.java        # Main application class
│   └── resources
│       └── META-INF
│           └── aop.xml                 # AspectJ load-time weaving configuration

```
## Dependencies

* AspectJ (1.9.19): For aspect-oriented programming.
* SLF4J API (2.0.9): For logging.
* Logback (1.4.11): SLF4J implementation for logging.
* Gradle: Build tool.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Article Link
For a detailed step-by-step guide, visit the article: [Aspect-Oriented Logging in Java: A Step-by-Step Guide with AspectJ](https://asterios-raptis.medium.com/aspect-oriented-logging-in-java-a-step-by-step-guide-with-aspectj-aa8f8865b026) 
