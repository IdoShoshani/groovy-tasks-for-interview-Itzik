/**
 * Task: Final practice to summarize basic Groovy concepts.
 * 1. Ask the user for their name.
 * 2. Print "Hello, <your name>!". V
 * 3. Print all numbers from 1 to 10, indicating whether each is even or odd. V
 * 4. Create a list of 3 fruits and print their names.
 * This exercise consolidates the following Groovy basics:
 * - Printing (println) 
 * - Variables
 * - Loops and conditions
 * - Functions
 * - Lists
 */

// 1. Ask the user for their name
println "What is your name?"
def name = System.console().readLine()  // Reads input from the console

// 2. Print a personalized greeting
println "Hello, ${name}!"

// 3. Print numbers from 1 to 10 with even/odd indication
println "\nNumbers from 1 to 10 and their parity:"
(1..10).each { number ->
    def parity = (number % 2 == 0) ? "even" : "odd"
    println "${number} is ${parity}"
}

// 4. Create a list of 3 fruits and print their names
println "\nHere are 3 fruits I like:"
def fruits = ["Apple", "Banana", "Cherry"]
fruits.each { fruit ->
    println fruit
}