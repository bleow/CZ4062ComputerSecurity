#FROM tomcat:8.0.36-jre8
#
#RUN rm -rf /usr/local/tomcat/webapps/*
#ADD target/log4shell-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
#EXPOSE 8080
#CMD ["catalina.sh", "run"]
#

# Use a Maven 3.8.3 image as the base
FROM maven:3.8.3-openjdk-17-slim AS build

# Copy the project source code to the container
COPY .. /app

# Set the working directory to the root of the project
WORKDIR /app

# Run Maven to compile the code and create a WAR file
RUN mvn clean package

# Use the official Tomcat 9.0 image as the base for our container
FROM tomcat:9.0-jdk17-openjdk-slim

# Remove the default Tomcat webapp and copy the WAR file to the webapps directory
RUN rm -rf /usr/local/tomcat/webapps/*
COPY --from=build /app/target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose port 8080
EXPOSE 8080

# Start Tomcat and run the application
CMD ["catalina.sh", "run"]
