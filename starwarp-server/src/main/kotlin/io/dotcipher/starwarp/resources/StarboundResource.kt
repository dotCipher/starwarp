package io.dotcipher.starwarp.resources

import io.dotcipher.starwarp.starbound.StarboundServer
import io.dotcipher.starwarp.starbound.config.StarboundInitConfig
import io.dotcipher.starwarp.starbound.config.StarboundServerConfig
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/starbound")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class StarboundResource(private val starboundServer: StarboundServer) {

    @GET
    @Path("/config")
    fun config() : StarboundServerConfig {
        return starboundServer.config
    }

    @GET
    @Path("/init-config")
    fun initConfig() : StarboundInitConfig {
        return starboundServer.initConfig
    }

}
