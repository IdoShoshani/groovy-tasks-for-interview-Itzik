/**
 * Task: Practice creating and iterating through lists in Groovy.
 * 1. Create a new file named lists_example.groovy.
 * 2. Create a list containing 5 animal names.
 * 3. Use a loop to print each animal name from the list.
 */


// 1. Create a list containing 5 animal names.
def animals = ["Dog", "Cat", "Elephant", "Lion", "Giraffe"]

// 2. Use a loop to print each animal name from the list.
for (animal in animals){
    println "Animal name is: ${animal}"
}
