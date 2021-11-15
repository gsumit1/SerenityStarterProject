@Registration
Feature: Register

  @Smoke
  Scenario: Register with username & passowrd
    Given I am on travel portal
    When I register with details
      | UserName         | Sumit   |
      | Password         | IBM@123 |
      | Confirm Password | IBM@123 |
    Then I should be successfully register

  @BookingFlight
  Scenario: Booking Flight
    Given I am on travel portal
    When I am searching flight
      | TripType | OneWay    |
      | Date     | November-15    |
      | From     | London    |
      | To       | Frankfurt |
    Then I should be successfully booked flight
