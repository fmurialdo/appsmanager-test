package com.gyft.services.keystore

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

fun main(vararg args: String) {
	SpringApplication.run(KeyStoreApplication::class.java, *args)
}

@SpringBootApplication
open class KeyStoreApplication
