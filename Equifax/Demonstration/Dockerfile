# base image with maven and jdk
FROM maven:3-jdk-8-alpine

# scaffolding. cve-2017-5638 will contain our files needed, temp will be a temporary folder to build our app
RUN mkdir -p /cve-2017-5638/exploit && \
	mkdir -p /temp && \
    mkdir -p /cve-2017-5638/etc

ADD ./pom.xml               /temp/pom.xml
ADD ./src                   /temp/src
ADD ./docker/entry-point.sh /cve-2017-5638/entry-point.sh
ADD ./exploit.py            /cve-2017-5638/exploit/exploit.py
ADD ./etc/passwd.txt        /cve-2017-5638/etc/passwd

# make entry-point.sh executable
    # synchronise the file system buffers
    # enter temp and package the app into a .jar
    # move the .jar file to our main cve-2017-5638
    # delete our temp folder
RUN chmod +x /cve-2017-5638/entry-point.sh && \
	sync && \
	cd /temp && \
	mvn package && \
	cp /temp/target/*.jar /cve-2017-5638/cve-2017-5638-example.jar && \
	rm -Rf /temp

WORKDIR /cve-2017-5638

ENTRYPOINT ["./entry-point.sh"]

EXPOSE 8080

VOLUME ["/cve-2017-5638/exploit/"]
