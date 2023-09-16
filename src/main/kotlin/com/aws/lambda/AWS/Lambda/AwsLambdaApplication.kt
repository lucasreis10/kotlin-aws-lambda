package com.aws.lambda.AWS.Lambda

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AwsLambdaApplication

fun main(args: Array<String>) {
	runApplication<AwsLambdaApplication>(*args)
}
