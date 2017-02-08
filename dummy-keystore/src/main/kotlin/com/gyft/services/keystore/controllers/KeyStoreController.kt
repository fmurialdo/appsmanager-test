package com.gyft.services.keystore.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/keystore")
open class KeyStoreController constructor() {

	@PostMapping("/post")
	open fun post(): String {
		return "Hello World"
	}

	@GetMapping("/get")
	open fun get(): String {
		return "Hello World"
	}
}
