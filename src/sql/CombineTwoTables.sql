SELECT
  Person.FirstName,
  Person.LastName, 
  Address.City,
  Address.State
FROM Person
LEFT JOIN Address USING (PersonID)