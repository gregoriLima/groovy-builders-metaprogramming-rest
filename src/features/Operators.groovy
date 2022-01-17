package features

String s = ""
def arr = null

// Elvis operator
String displayName = s ? s : "empty"
String displayName2 = s ?: "empty"

println displayName2 // prints "empty"

println arr?.get(3) // prints "null"

