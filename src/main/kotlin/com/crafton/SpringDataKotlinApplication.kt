package com.crafton

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class SpringDataKotlinApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringDataKotlinApplication::class.java, *args)
}
