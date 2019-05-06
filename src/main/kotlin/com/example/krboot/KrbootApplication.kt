package com.example.krboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KrbootApplication

fun main(args: Array<String>) {
    runApplication<KrbootApplication>(*args)
}
