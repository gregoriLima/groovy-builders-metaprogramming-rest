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
//xx = "anotherString" // cannot cast!

def y = "string" // String
def z = 10.1  // BigDecimal


//  :: CONVERTING DATA TYPES ::
// Explicit
def myFloat = (float) 1.0


// :: RULES FOR + - / *

Float f = 5.5
Double d = 10
def result = f / d // results in goove are always Double
println(result.class)

def g = 5.5
def h = 10
result = g / h
println(result.class) // BigDecimal

// If either operand is a BigInteger the result is a BigInteger
// If either operand is a Long the result is a Long
// If either operand is a Integer the result is a Integer

// DOUBLE DIVISION
println 5.0d - 4.1d // Double 0.9000000004
println 5.0 - 4.1 // BigDecimal 0.9

// INTEGER DIVISION
def intDiv = 1 / 2
println intDiv // 0.5 result. This is much different than Java where we would get 0


// GKD Methods
assert 2 == 2.5.toInteger() // conversion
assert 2 == 2.5 as Integer // enforced coercion
assert 2 == (int) 2.5 // cast

assert "5.5".isNumber()
assert 5 == "5".toInteger()

println ('5.5' + 3) // 5.53
println 3 + "5.5" // 35.5


// :: UP | TO | DOWNTO | STEP

20.times{ print ' - '} println()
1.upto(10){ num -> print " $num "} println()
10.downto(1) { num -> print " $num "} println()
10.downto(1) { num -> print " $num "} println()
0.step(1,0.1) { num -> print " $num "} println()

println ()