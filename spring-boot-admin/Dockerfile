FROM openjdk:11.0.5-stretch as builder

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

VOLUME /tmp
WORKDIR /target
ADD target/*.jar app.jar
RUN jar xf app.jar



FROM openjdk:11.0.5-stretch
VOLUME /tmp
WORKDIR /app
COPY --from=builder target/BOOT-INF/lib ./lib
COPY --from=builder target/org/ ./org
COPY --from=builder target/META-INF/ ./META-INF
COPY --from=builder target/BOOT-INF/classes ./classes
CMD ["/bin/bash", "-c", "java -cp .:./classes/:./lib/* -server org.springframework.boot.loader.JarLauncher"]

EXPOSE 8080