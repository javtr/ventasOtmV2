FROM ibmjava:jre

RUN mkdir /app

WORKDIR /app

COPY target/ventas-otm-v3-0.0.1-SNAPSHOT.jar /app/ventas.jar

EXPOSE 8080

CMD java -Xmx64m -XX:MaxRAM=128m -jar ventas.jar