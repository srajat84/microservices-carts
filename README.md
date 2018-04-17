# cart
A microservices-demo service that provides shopping carts for users.

This build is built, tested and released by travis.

# API Spec

Checkout the API Spec [here](http://microservices-demo.github.io/api/index?url=https://raw.githubusercontent.com/microservices-demo/carts/master/api-spec/cart.json)

# Build

## Java

`mvn -DskipTests package`

## Docker

`GROUP=tw_workshop COMMIT=latest ./scripts/build.sh`

# Test

`./test/test.sh < python testing file >`. For example: `./test/test.sh unit.py`

# Run

`mvn spring-boot:run`

# Check

`curl http://localhost:8088/health`

# Use

`curl http://localhost:8088`

# Push

`GROUP=tw_workshop COMMIT=latest ./scripts/push.sh`
