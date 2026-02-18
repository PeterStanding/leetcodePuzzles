Select Person.firstName, Person.lastName, Address.city, Address.state
from Person
LEFT Join Address on Person.personId = Address.personId
