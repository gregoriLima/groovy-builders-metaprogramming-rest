package features

// false | null | empty strings | empty collections = false
if ( false )
    println "value is false"

// for in list
def list = [1,2,3,4]
for (i in list) {
    println i
}

// closure
def list2 = [1,2,3,4]
list2.each { println it}