Feature: CRUD API

  Scenario: Efetuando CRUD
    Given que for acessado o endpoint "https://reqres.in/api/users/1"
    When seja efetuado o CREATE
    And seja efetuado o UPDATED
    Then seja efetuado o DELETE