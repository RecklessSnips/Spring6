FROM openjdk:17
#从ubuntu的路径下开始执行
ADD target/spring6-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]