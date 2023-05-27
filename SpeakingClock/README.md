# Speaking clock

## How to Use
run mvn clean install
execute jar
open postman and hit below end point:
http://localhost:8080/myclock/getimeinwords
Inside Post Body specify the data:

{
    "time":"08:00"
}
Access swagger UI:

http://localhost:8080/myclock/swagger-ui/#/speaking-clock-controller

## Specification
- A 24 hour clock convert the current time into words, e.g. "08:34" should be converted to "It's eight thirty four"
- Return Midday and Midnight as "It's Midday" and "It's Midnight"
- Zero hours example: 00:01 should convert to "It's zero one"
- Zero minutes example: 01:00 should convert to "It's one zero"
- There is no a command line input or any kind or an app so there is no option for any kind of a user input. just a test class.

