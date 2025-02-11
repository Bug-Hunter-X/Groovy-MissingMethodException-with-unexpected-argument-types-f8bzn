# Groovy MissingMethodException with Unexpected Argument Types

This example demonstrates a common, yet subtle, error in Groovy:  a `MissingMethodException` arising from unexpected argument types, even when null checks are in place.

The `myMethod` is designed to handle a `null` parameter. However, if called with an empty map (`:`) it fails, highlighting that Groovy's dynamic typing doesn't always implicitly handle type mismatches in the way you might expect.

## How to Reproduce

1.  Run the `bug.groovy` script.
2.  Observe the `MissingMethodException` when `myMethod` is called with an empty map.

## Solution

See `bugSolution.groovy` for a fix.