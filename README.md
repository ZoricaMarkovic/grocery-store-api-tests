# API Automation Test Framework

## Introduction

This is an API Automation Test Framework developed for testing [Grocery Store APIs](https://github.com/vdespa/Postman-Complete-Guide-API-Testing/blob/main/simple-grocery-store-api.md)


## Overview

Framework is built using Java, Maven, TestNG and RestAssured. 

## Setup

Prerequisites: 

* JDK 
* Maven
* IDE: IntelliJ IDEA
* Plugins: RoboPojoGenerator

Steps:

* Clone the Repository from: https://github.com/ZoricaMarkovic/grocery-store-api-tests.git
* Run mvn clean install

## Framework structure

GroceryStore - class with the simple and readable methods for execution API requests. It relies on RestAssured library 

Tests are organized into multiple packages, each corresponding to a specific group of Grocery Store APIs. 
* carts - all the tests related to carts, adding/removing/updating
* products - all the tests related to getting product details
* orders - all the tests related to Orders

All the support code is located under src/main/java/org.example directory organized into several packages:
* requests - classes for creating request body
* responses - classes for parsing responses
* assertions - classes that contain assertion methods
* models - classes for preparing expected responses for validation

JSON Serialization and Deserialization is used to prepare and read JSON data for API requests and responses. 

Built with:

* [Rest-Assured] (https://rest-assured.io/) - Intuitive library for testing Rest APIs
* [TestNG] (https://testng.org/) - Test runner for Java
* [Jackson] (https://github.com/FasterXML/jackson) - Library of choice when it comes to (de)serialization of JSON
* [AssertJ] (https://assertj.github.io/doc/) - assertion library

## Running tests


The whole suite can be run using suite.xml.