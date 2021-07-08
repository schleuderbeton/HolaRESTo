# HolaRESTo
simple RESTful service

##OK
- Payara5
- TomEE 8 with modified system.properties ``tomee.mp.scan = all``
- Docker FROM tomee:8-jre-8.0.6-plume with modified system.properties ``tomee.mp.scan = all``
- Docker FROM tomee:8-jre-8.0.6-microprofile without modifications

##NOK
- TomEE 8 default setup
- Docker FROM tomee:8-jre-7.1.2-plume with and without modified system.properties ``tomee.mp.scan = all``

##How to test REST with JSON response and JWT - SAP HR BAPI
1. Run app
1. curl test - SAP calls using curl and JWT
- ``curl -i -H"Authorization: Bearer <JWT>" <URI>``
- ``curl -i -H"Authorization: Bearer <token>" http://localhost:8080/holaresto/resources/ping``

###JWT (Json Web Token)

#### linkz
- https://github.com/AdamBien/jwtenizr
- https://www.eclipse.org/community/eclipse_newsletter/2017/september/article2.php
- https://jwt.io/

###create token
1. setup token configuration file jwt-token.json
    - expiration date = "exp": <date-in-millis>
1. run jwtenizr
   ``java -jar jwtenizr.json``
