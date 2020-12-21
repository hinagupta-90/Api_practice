Feature: User list
  Scenario Outline: Get uer list
    When Request user api is hit
    Then Validate the "<responsecode>" and assert "<Expfile>"

    Examples:
    |responsecode | Expfile |
    |200          |test/Resources/Expected/UserList.json

  Scenario Outline: Create user
    When Create user with "<username>" and "<job>"
    Then Validate the "<responsecode>" and assert "<Expfile>"

    Examples:
      |responsecode | Expfile |
      |201          |test/Resources/Expected/NewUser.json