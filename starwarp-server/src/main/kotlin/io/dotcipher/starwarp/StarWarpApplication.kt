package io.dotcipher.starwarp

import com.fasterxml.jackson.module.kotlin.KotlinModule
import io.dotcipher.starwarp.resources.StarboundResource
import io.dotcipher.starwarp.starbound.StarboundServer
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class StarWarpApplication : Application<StarWarpConfiguration>() {

    companion object {
        @Throws(Exception::class)
        @JvmStatic fun main(args: Array<String>) {
            StarWarpApplication().run(*args)
        }
    }

    override fun initialize(bootstrap: Bootstrap<StarWarpConfiguration>) {
        bootstrap.objectMapper.registerModule(KotlinModule())
    }

    override fun run(configuration: StarWarpConfiguration, environment: Environment) {
        val starboundServer = StarboundServer(configuration.starboundDirectory, environment.objectMapper)

        environment.jersey().register(StarboundResource(starboundServer))
    }

}
