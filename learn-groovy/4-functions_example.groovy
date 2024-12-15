/**
 * Task: Practice defining and using functions in Groovy.
 * 1. Create a new file named functions_example.groovy.
 * 2. Define a function that takes a number as input and returns its square.
 * 3. Call the function with different inputs and print the results.
 */


// Define a function to calculate the square of a number
def squareNumber(number) {
    number ** 2
}

// Define a list of numbers
def numbers = [1, 2, 3, 4, 5]

// Using a loop to calculate and print the square of each number
numbers.each { number ->
    def result = squareNumber(number)
    println "The power of ${number} is: ${result}"
}
