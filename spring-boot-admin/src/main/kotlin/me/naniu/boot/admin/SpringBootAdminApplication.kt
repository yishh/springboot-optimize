package me.naniu.boot.admin

import de.codecentric.boot.admin.server.config.EnableAdminServer
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.scheduling.annotation.EnableScheduling

@Configuration
@EnableAutoConfiguration
@EnableAdminServer
@EnableScheduling
class SpringBootAdminApplication

fun main(args: Array<String>) {
    println("Hello world v2")
    SpringApplication.run(SpringBootAdminApplication::class.java, *args)
}