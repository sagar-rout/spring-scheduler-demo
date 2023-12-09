# Spring scheduler demo

```bash
docker run -d --name postgres13 \
    -v postgres_data:/var/lib/postgresql/data \
    -e POSTGRES_USER=postgres \
    -e POSTGRES_PASSWORD=postgres \
    -p 5432:5432 \
    postgres:latest
```

```bash
./gradlew bootRun --args='--spring.port=8080'
```
