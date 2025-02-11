```groovy
def myMethod(param) {
  if (param == null) {
    println "Param is null"
    return
  }
  if (!(param instanceof Map)) {
    println "Param is not a Map"
    return
  } 
  //If you need the Map, process it here
  param.each { key, value ->
    println "Key: $key, Value: $value"
  }
}

myMethod(null)
myMethod([name:'John', age:30])
myMethod([:])
```