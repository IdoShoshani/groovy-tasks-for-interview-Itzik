// if/else:
// def age = 18
// if (age <= 18) {
//     println "You are an adult"
// } else {
//     println "You are a miner"
// }


// For loop:
// for (i in 1..5) {
//     println "Number: ${i}"
// }


/**
 * Task: Practice writing loops and conditions in Groovy.
 * 1. Create a new file named loops_example.groovy.
 * 2. Write a loop that prints the numbers from 1 to 10.
 * 3. Add a condition inside the loop to check whether each number is even or odd,
 *    and print the appropriate message for each number.
 */

for (i in 1..10){
    if (i % 2 == 0){
        println "number ${i} is Even number!"
    }
    else {
        println "number ${i} is Odd number!"
    }
}

def fruits = ["Apple", "Banana", "Cherry"]

fruits.eachWithIndex { fruit, index ->
    println("Index ${index}: ${fruit}")
}



// // Define variables with numbers 1-5
// def numbers = [1, 2, 3, 4, 5]

// // Loop on every number in the list and print.
// for (num in numbers){
//     println "Number is: ${num}"
// }

// def age = 30
// def result = age * 2
// println("Result is: ${result}")
// def isEqual = result == 30
// println("isEqual is: ${isEqual}")
