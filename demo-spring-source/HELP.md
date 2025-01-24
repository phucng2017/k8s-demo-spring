--> chỉnh cách chạy docker:


docker tag demo-spring-backend demo-spring-backend:latest
(DE THAM THAO THOI)
docker buildx build --platform linux/arm64 -t demo-spring-backend .
Thu lại voi 
docker buildx build --platform linux/amd64 -t demo-spring-backend .


HOAC: (CÂU LỆNH NÀY CHẠY NHÉ)
docker buildx build -t dockerphucnnd/demo-spring-backend:v4.0 --push .

docker buildx build -t dockerphucnnd/demo-spring-backend:v2.0 --platform linux/amd64  --push .
--> NO OK

docker buildx build -t dockerphucnnd/demo-spring-backend:v3.0 --platform linux/amd64  --push .


Deploy lên k8s:
kubectl apply -f https://raw.githubusercontent.com/phucng2017/k8s-demo-spring/refs/heads/master/backend/backend-deployment_v2.yaml

# Read Me First
The following was discovered as part of building this project:

* The original package name 'phn.com.vn.k8s-demo' is invalid and this project uses 'phn.com.vn.k8s_demo' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.1/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.1/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.1/reference/web/servlet.html)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/3.4.1/reference/actuator/index.html)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)

### Maven Parent overrides

Due to Maven's design, elements are inherited from the parent POM to the project POM.
While most of the inheritance is fine, it also inherits unwanted elements like `<license>` and `<developers>` from the parent.
To prevent this, the project POM contains empty overrides for these elements.
If you manually switch to a different parent and actually want the inheritance, you need to remove those overrides.

