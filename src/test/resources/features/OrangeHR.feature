#Author: sgaleanom@choucairtesting.com


Feature: New employee registration process
  As a user of the OrangeHR platform
  I want to register a new employee

  @RegistroEmpleado
  Scenario: Register new employee
	Given Juan needs to create an employee in the OrageHR
	When access the add employee menu
  And he performs employee registration
	Then the visualization of the new employee in the application



