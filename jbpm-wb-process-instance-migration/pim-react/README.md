# React GUI for Process Instance Migration application 


## version information
react 16.8.6

npm 6.8.0

patternfly-react: 3

for details, check package.json

# PIM React GUI can run in two modes

## Full function mode
This mode needs PIM-GUi and PIM-Service build together in parent folder though maven. 

Please note Thorntail configuration file need to have "kieserversids" defined. For more details see PIM-Service/README.md

### GUI URL
http://localhost:8080/

It used the authentication defined in PIM-Service, the default admin username/password is kermit/thefrog

## Mock up mode
Local mode without backend, for testing GUI function with mockup data, no need to start PIM-Service or KIE servers. 

Steps: 

Update src/component/common/PimConstants.js, change the USE_MOCK_DATA from "false" to "true"

```
$ cd pim-react

$ npm install

$ npm start
```

### GUI URL
http://localhost:3000
no username/password

