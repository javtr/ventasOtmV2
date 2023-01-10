FROM eclipse-temurin:17-alpine

RUN mkdir /app

WORKDIR /app

COPY target/ventas-otm-v3-0.0.1-SNAPSHOT.jar /app/ventas.jar

EXPOSE 8080

CMD java -Xmx64m -jar ventas.jar