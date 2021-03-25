[![Build Status](https://travis-ci.org/sogis/av2ch.svg?branch=master)](https://travis-ci.org/sogis/av2ch)
# av2ch
Converts a cadastral INTERLIS dataset (itf) from the cantonal model to the federal model.

It supports german and italian transfer files. Only LV95 is supported. Originally written for the canton of Solothurn, it actually should work for canton of Glarus and Tessin.

```
./gradle clean build
```

Github Action deploys library to Maven Central.

Library is used in GRETL.

TODO:
- More tests (failures)
- GRETL-Task
