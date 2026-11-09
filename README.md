# Order contract

[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat)](https://dev.java/)
[![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=springboot&logoColor=white)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apachemaven&logoColor=white)](https://maven.apache.org/)
[![GitHub Actions](https://img.shields.io/badge/GitHub_Actions-2088FF?style=flat&logo=githubactions&logoColor=white)](https://github.com/features/actions)

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
