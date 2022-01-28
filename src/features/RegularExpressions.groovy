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