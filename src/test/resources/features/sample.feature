@notreallyimportant
Feature: Hand On Labs feature

	Background: Setup PaaS REST client
		Given I save '1' in environment variable 'SECS'

	Scenario: Dummy scenario
      And I wait '!{SECS}' seconds
      Given I wait '1' seconds