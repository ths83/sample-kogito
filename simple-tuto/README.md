# simple-tuto Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Kogito

Kogito is a Cloud-Native Business Automation tool: https://kogito.kie.org

This project is based on the following tutorial (2021-09-26): https://docs.kogito.kie.org/latest/html_single

## Commands

### Generating POJO's and controllers

```bash
mvn compile kogito:scaffold -Dkogito.codegen.sources.directory=src/main/generated-java
```

### Run app in dev mode

```bash
mvn clean compile quarkus:dev
```

### Swagger UI

http://localhost:8080/q/swagger-ui
