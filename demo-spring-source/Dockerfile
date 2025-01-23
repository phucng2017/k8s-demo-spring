# FROM --platform=linux/amd64 node:11.15
# FROM --platform=linux/amd64 node:lts-alpine

# Sử dụng hình ảnh base Java
FROM openjdk:17-jdk-slim

# Đặt thư mục làm việc
WORKDIR /app

# Copy file JAR vào container
COPY target/k8s-demo-0.0.1-SNAPSHOT.jar app.jar

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "app.jar"]
