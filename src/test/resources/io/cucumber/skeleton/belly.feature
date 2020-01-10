Feature: Belly

  Scenario: MAS - Choose your doctor page
    Given I navigate to "https://mydoctor.kaiserpermanente.org/mas/mdo/choose-your-doctor/"
    When I wait 1 hour
    Then my belly should growl
