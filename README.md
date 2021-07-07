# HolaRESTo
simple RESTful service

##How to test REST with JSON response and JWT - SAP HR BAPI
1. Run app
1. curl test - SAP calls using curl and JWT
   ``curl -i -H"Authorization: Bearer <JWT>" <URI>``

###JWT (Json Web Token)

#### linkz
- https://github.com/AdamBien/jwtenizr
- https://www.eclipse.org/community/eclipse_newsletter/2017/september/article2.php

###create token
1. setup token configuration file jwt-token.json
    - expiration date = "exp": <date-in-millis>
1. run jwtenizr
   ``java -jar jwtenizr.json``
