package com.example.mykotlinjourney

fun countVowels(input: String): Int {
    val lower = input.lowercase()
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    var count = 0

    for (char in lower) {
        if (char in vowels) {
            count++
        }
    }

    return count
}

fun main(){
    println(countVowels("madam"))
}