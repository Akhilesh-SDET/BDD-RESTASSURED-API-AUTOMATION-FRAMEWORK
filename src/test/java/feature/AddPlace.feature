Feature: Validate API

  @AddPlace @Regression
  Scenario Outline: Verify The Place is being successfuly added
    Given payload of AddPlace API with "<name>" "<language>","<address>"
    When user calls "AddPLaceAPI" with  http request "post"
    And "scope" in response body is "APP"
    And verify place_Id created in map  to "name" using "GetPlaceAPI"

    Examples:
      | name        | language | address |
      | smith house | English  | Austria |

  # | smit house2 | English&franch | france  |
  @deleteResource @Regression
  Scenario: verify the Delete functionalityo of API
    Given pre condition of delete API
    When user calls "DeletePlaceAPI" with  http request "delete"
    Then the API call is success with status code 200
    And "status" in response body is "OK"
