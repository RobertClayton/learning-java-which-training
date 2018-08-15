
### Day 2

`view, tools window, structure`
`refactor, extract, method`

- Exceptions
- src/ console.ExceptionHandling
1. You can easily surround a test with a try catch structure in IntelliJ with `alt + enter` and choose try catch
2. `refactor, extract, Method`. on the line `Connection connection = DriverManager.getConnection("");` extracts this line into is own psv below.
3. catch blocks can be chained like in ExceptionHanding. But also can put two catches in the same clause using an or: `catch (SQLException | NumberFormatException e)`
4. a finally block will always be executed.
- src/ console.AutocloseableExample
1. The basic example of an exception in the commented code can be refactored as seen at the bottom of this class by passing the arguments into trys ()
- src/ transport.Car
1. we can see a more immediate example of this is car when setting speed `if (speed > 150) { throw new IllegalArgumentException("Speed is to high") }`

- Collection Frameworks / Interfaces
- src/ examples.ProductRepository
1.  alt enter import/override methods

- jar tool to extract file.
