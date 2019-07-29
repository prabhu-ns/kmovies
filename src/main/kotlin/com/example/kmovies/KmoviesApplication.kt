package com.example.kmovies

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KmoviesApplication

fun main(args: Array<String>) {
	runApplication<KmoviesApplication>(*args)
}
