```groovy
def myMethod(a, b) {
  if (a instanceof Integer && b instanceof Integer) { // Explicit type checking
    if (a > b) {
      return a
    } else {
      return b
    }
  } else {
    println "Error: Inputs must be integers" 
    return null
  }
}

println myMethod(5, 2) // Output: 5
println myMethod(2, 5) // Output: 2
println myMethod(5, "2") // Output: Error: Inputs must be integers
```