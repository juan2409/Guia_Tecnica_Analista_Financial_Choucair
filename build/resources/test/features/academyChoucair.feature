#Autor: Juan David Camacho Guevara
@stories
  Feature: Aademy Choucair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
    @scenario1
    Scenario Outline: Search for a automation course
      Given that Brandon wants to learn automation at the academy Choucair
        |strUser  |strPassword  |
        |<strUser>|<strPassword>|
      When he searches for the course on the Choucair academy platform
        |strCourse  |
        |<strCourse>|
      Then he finds the course called
        |strCourse  |
        |<strCourse>|

      Examples:
        |strUser   |strPassword  |strCourse                  |
        |1000589749|Choucair2021*|Advanced Level Test Manager|