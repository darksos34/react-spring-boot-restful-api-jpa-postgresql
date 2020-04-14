# React and Spring Boot RESTful API JPA PostgreSQL Setup

_Created on: 12-04-2019_<br />
_Last updated on: 13-04-2019_

**Contributors:**<br />
Jeffrey Spaan (Full Stack Developer @ CodeBean)<br />
Jordy Hamwijk (Full Stack Developer @ CodeBean)<br />
<br />

Welcome developer. This is the second tutorial in developing your React and Spring Boot Web Application.
We will continue the apllications based on the foundation (link)
Moving forward, we will use this repository as starting point for further repositories which include JPA PostgresQL connectivity and RESTful API services.

In this tutorial we will connect the database, for which we will use a SQL database called PostgresQL. The connectivity is done via Spring Boot JPA.
HTTP requests will be handled via the RESTful API service.

### What is JPA?\*\*

**JPA**
The Java Persistence API (JPA) is a Java specification for accessing, persisting, and managing data between Java objects / classes and a relational database. JPA was defined as part of the EJB 3.0 specification as a replacement for the EJB 2 CMP Entity Beans specification.

### What is PostgreSQL

**PostgreSQL**

(pronounced "post-gress-Q-L") is an open source relational database management system ( DBMS ) developed by a worldwide team of volunteers. PostgreSQL is not controlled by any corporation or other private entity and the source code is available free of charge.

### What is Lombok?

**Lombok**

Project Lombok. Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your java. Never write another getter or equals method again, with one annotation your class has a fully featured builder, Automate your logging variables, and much more.

## Getting started In your browser, open: [https://start.spring.io](https://start.spring.io)

- **Project:** `Maven Project`
- **Language:** `Java`
- **Spring Boot (version):** We will use the latest stable version: `2.2.6`
- **Group:** this is your internet domain, backwards. For CodeBean we will use: `nl.codebean`
- **Artifact:** this is the name of your project. For this project we will use: `react-spring-boot-restful-api-jpa-postgresql`
- **Description:** this is a short description about your project. For this project we will use: `React and Spring Boot RESTful API JPA PostgreSQL Tutorial`
- **Packaging:** `JAR`
- **Java:** version `8`
- **Dependencies:** `Spring Data JPA` `Spring Web` `PostgreSQL Driver` `Lombok`

To create a pre-generated backend, click: GENERATE

![Spring Boot Dependency Selection](https://github.com/codebean-university/react-spring-boot-restful-api-jpa-postgresql/blob/master/images/spring-boot-dependency-selection.png)

<br /><br />
A ZIP file is downloaded on your hard-drive. Open the ZIP file and extract the project folder.<br />
Open the project folder in your favorite IDE.<br />
<br />

### POM.xml

A Project Object Model or POM is the fundamental unit of work in Maven.<br />
It is an XML file that contains information about the project and configuration details used by Maven to build the project.<br />
<br />
The following listing shows the `POM.xml` file that is created when you choose a Maven project:

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
		 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
		 xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.2.6.RELEASE</version>
		<relativePath /> <!-- lookup parent from repository -->
	</parent>
	<groupId>com.Novi</groupId>
	<artifactId>spring-boot-security-jwt</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<name>spring-boot-security-jwt</name>
	<description>Demo project for Spring Boot Security - JWT</description>

	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>
	</properties>


	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

		<dependency>
			<groupId>org.postgresql</groupId>
			<artifactId>postgresql</artifactId>
			<scope>runtime</scope>
		</dependency>

		<dependency>
			<groupId>io.jsonwebtoken</groupId>
			<artifactId>jjwt</artifactId>
			<version>0.9.1</version>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>


		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
	</dependencies>

	<build>
		<plugins>
			<plugin>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-maven-plugin</artifactId>
			</plugin>
		</plugins>
	</build>

</project>
```

<Strong>Configuring PostgreSQL</Strong>
<br />
Go to https://www.pgadmin.org/download/
Download pgAdmin latest version and Install pgAdmin
<br />

pgAdmin is the most popular and feature rich Open Source administration and development platform for PostgreSQL, the most advanced Open Source database in the world.

pgAdmin may be used on Linux, Unix, Mac OS X and Windows to manage PostgreSQL 9.2 and above.

`# Choose your username and password when installing PgAdmin4`<br />
<br />
<Strong>Properties to connect Spring Boot with PostgreSQL</Strong>

`# Datasource Login in to your DataBase`<br />
`spring.datasource.url= jdbc:postgresql://localhost:5432/username`<br />

`# Choose a password that is easy to remember, only if you are still working local!`<br />
`spring.datasource.password=password`

`# PostgreSQL Properties`<br />
`spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation= true`<br />
`spring.jpa.properties.hibernate.dialect= org.hibernate.dialect.PostgreSQLDialect`

`# Hibernate ddl auto (create, create-drop, validate, update)`<br />
`spring.jpa.hibernate.ddl-auto= update`

`# Register OpenEntityManagerInViewInterceptor.`<br />
`# Binds a JPA EntityManager to the thread for the entire processing of the request.`<br />
`# Warning gone Open jpa`<br />
`spring.jpa.open-in-view=false`

#Future
This tutorial is still underconstruction!
