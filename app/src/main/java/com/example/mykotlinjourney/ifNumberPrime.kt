package com.example.mykotlinjourney

import java.security.KeyStore.TrustedCertificateEntry

fun checkNumberPrime(input:Int):Boolean {
    if (input<=1) return false
    for (i in 2 until input){
        
        if (input % i == 0) return false

           
    }
    return true
}
fun main(){
    println(checkNumberPrime(5))
    println(checkNumberPrime(10))
}