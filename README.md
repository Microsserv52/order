# Order contract

**Application stack**

[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat)](https://dev.java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Bean Validation](https://img.shields.io/badge/Bean_Validation-6DB33F?style=flat)](https://jakarta.ee/specifications/bean-validation/)
[![Lombok](https://img.shields.io/badge/Lombok-BC4521?style=flat)](https://projectlombok.org/)
[![OpenFeign](https://img.shields.io/badge/OpenFeign-6DB33F?style=flat&logo=spring&logoColor=white)](https://spring.io/projects/spring-cloud-openfeign)

**Build, checks and delivery**

[![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-25A162?style=flat&logo=junit5&logoColor=white)](https://junit.org/)
[![Git](https://img.shields.io/badge/Git-F05032?style=flat&logo=git&logoColor=white)](https://git-scm.com/)
[![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=flat&logo=githubactions&logoColor=white)](https://github.com/features/actions)
[![CodeQL](https://img.shields.io/badge/CodeQL-181717?style=flat&logo=github&logoColor=white)](https://codeql.github.com/)

Reusable Java API contract for the Order microservice. It defines request and
response records and the controller interface consumed by
[`order-service`](../order-service/).

## Build

```bash
./mvnw test
./mvnw install
```

This contract has no runtime configuration and requires no GitHub Actions
secrets.

The contract workflow validates formatting, Maven compilation, tests, quality,
and CodeQL. It does not publish a container because it is a reusable Java
library rather than a runnable service.
