package features

//groovy is 100% Objct Oriented

int intUsingWrapper = 10

println(intUsingWrapper.getClass()) // java.lang.Integer

println(10.getClass()) // java.lang.Integer

println(70000009999.getClass()) // java.lang.Long

println(10.1.class) // java.lang.BigDecimal

// declaring variable
// variable without declared type
def x = 10 // Integer
x = "otherString" // Ok todo this

int xx = 10
xx = "anotherString" // cannot cast!

def y = "string" // String
def z = 10.1  // BigDecimal


