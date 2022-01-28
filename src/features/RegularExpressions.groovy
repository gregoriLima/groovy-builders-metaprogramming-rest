package features

// Java Sample Pattern
import java.util.regex.*
Pattern pat = Pattern.compile("a\\\\b")
println pat
println pat.class // java.util.regex.Pattern


// Groovy Pattern
// no need scape carachteres
String slashyPattern = /a\b/
println slashyPattern

// ~ means same as line 5 and '/ ... /' is the same done at line 12
def pattern = ~/a\b/
println pattern.class // java.util.regex.Pattern


// Find | Match
def text = "Being a Cleveland Sports Fan is no way to go through life"
pattern = ~/Cleveland Sports Fan/
def finder = text =~ pattern
def matcher = text ==~ pattern

println finder // java.util.regex.Matcher[pattern=Cleveland Sports Fan region=0,57 lastmatch=]
println finder.size() // 1

println matcher // false

text = "Cleveland Sports Fan"
matcher = text ==~ pattern

println matcher // true



text = text.replaceFirst(pattern, "Buffalo Fan")
println text // Buffalo Fan