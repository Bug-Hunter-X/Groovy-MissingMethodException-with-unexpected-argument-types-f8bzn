```groovy
def myMethod(param) {
  if (param == null) {
    println "Param is null"
    return
  }
  // ... rest of the method
}

myMethod(null)
myMethod([:]) //This will throw a MissingMethodException
```