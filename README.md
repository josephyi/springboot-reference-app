# springboot-reference-app
Personal reference app for trying out things.

## Quickstart

As of writing, the app will run directly, and infra resources will run in Docker. 

```
# set Java environment via SDK 
sdk env install

# spin up infra
docker-compose up

# run app
./gradlew bootRun
```


## API Examples
These are not RESTful and will likely change a lot over time:

```
# Basic JSON parsing of Java Record
curl -X GET http://localhost:8080/echo | jq

# Send message to kafka (consumes to System.out)
curl -X POST "http://localhost:8080/send?topic=test-topic" \
     -H "Content-Type: text/plain" \
     -d "Hello Kafka!"


```