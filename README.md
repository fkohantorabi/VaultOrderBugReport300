This repository reproduces the problem reported in https://github.com/spring-cloud/spring-cloud-consul/issues/693.

In order to start a local Vault and initialize it with data, run `docker-compose -d` which initializes local vault with two secrets at secret/dev/vault-app and secret/dev/application both which have `test.message` secret initialized with `this is the expected message` and `this is NOT the expected message` respectively.

The applications looks up and prints the value of `test.message` at startup and the expectation is to see `this is the expected message` since `secret/dev/vault-app` should have a higher precedence to `secret/dev/application` but `this is NOT the expected message` is shown instead.