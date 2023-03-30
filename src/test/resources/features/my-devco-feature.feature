#Author: Haider Fabian Tique
#Fecha:  30-03-2023

@DevcoPrueba
Feature: Se requiere realizar tres scenarios

  @scenario1
  Scenario: Se crear una nota de texto enriquecido con letra en negrita
    Given Se ingresa a la URL de notepad
    When Se ingresa el texto de ejemplo
    Then Cumple las condiciones solicitadas