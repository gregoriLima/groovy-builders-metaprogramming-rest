package features

 // :: JAVA

char c = 'c'
println c.class // class java.lang.Character

String s = "this is a string"
println s.class // class java.lang.String


// :: Groovy
// By default, everything in groovy is a String

def s2 = 's'
println s2.class // java.lang.String

def s3 = 'this is a string using simple quotes'
println s3.class // java.lang.String

// String Interpolation (used only with double quotes)
// java
String name = "Dan"
String hello = "Hello " + name + "..."
println hello // Hello Dan...

//groovy
String hello2 = "Hello ${name}..."
println hello2 // Hello Dan...


// Multiline Strings
def multiLineSring = '''
teste
abcd
efgh
'''

def multilineInterpolationStrig = """
result
of
operation = ${1+2+3}
"""

// Dollar Slashy

def pathInJava = "C:\\folder1\\folder2"
println pathInJava // C:\folder1\folder2

//using dollar slashy
def pathInGroovy = $/C:\folder1\folder2/$
println pathInGroovy // C:\folder1\folder2
