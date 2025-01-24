# FROM --platform=linux/amd64 node:11.15
# FROM --platform=linux/amd64 node:lts-alpine

# Sử dụng hình ảnh base Java
# FROM openjdk:17-jdk-slim
FROM eclipse-temurin:17-jdk

# Đặt thư mục làm việc
WORKDIR /app

# Copy file JAR vào container
COPY target/demo-spring-backend-0.0.1-SNAPSHOT.jar app.jar

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
