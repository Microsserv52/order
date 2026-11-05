# Order contract

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
