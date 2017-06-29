package io.dotcipher.starwarp.starbound.config

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import java.net.InetAddress
import java.util.*

/**
 * @see <a href="http://starbound.gamepedia.com/Starbound.config">Starbound Config Wiki Documentation</a>
 * @see <a href="http://starbounder.org/Guide:Setting_Up_Multiplayer">Starbounder Config Documenation</a>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class StarboundServerConfig constructor(
        /**
         * Allows the usage of administrator commands on the server.
         */
        @get:JsonGetter @JsonProperty val allowAdminCommands: Boolean,

        /**
         * Allows anyone logged into the server to have access to the administrator console.
         */
        @get:JsonGetter @JsonProperty val allowAdminCommandsFromAnyone: Boolean,

        /**
         * Allows users who are not identified in serverUsers to log in.
         */
        @get:JsonGetter @JsonProperty val allowAnonymousConnections: Boolean,

        /**
         * Allow users with different assets or plugins to connect to the server.
         */
        @get:JsonGetter @JsonProperty val allowAssetsMismatch: Boolean,

        /**
         * Allow anyone who logs in anonymously to become a server admin.
         */
        @get:JsonGetter @JsonProperty val anonymousConnectionsAreAdmin: Boolean,

        /**
         * Prevent any connection from an IP Address.
         */
        @get:JsonGetter @JsonProperty val bannedIPs: List<BannedReference<InetAddress>>,

        /**
         * Prevent any connection from a UUID.
         */
        @get:JsonGetter @JsonProperty val bannedUuids: List<BannedReference<UUID>>,

        /**
         * Forces players to have matching assets pack.
         */
        @get:JsonGetter @JsonProperty val checkAssetsDigest: Boolean,

        /**
         * Forces players to use new characters or to have no gear or tech.
         */
        @get:JsonGetter @JsonProperty val clearPlayerFiles: Boolean,

        /**
         * Forces player characters to use fresh universe data and navigation maps.
         */
        @get:JsonGetter @JsonProperty val clearUniverseFiles: Boolean,

        /**
         * If true clients can connect over IP.
         */
        @get:JsonGetter @JsonProperty val clientIPJoinable: Boolean,

        /**
         * If true clients can connect using P2P.
         */
        @get:JsonGetter @JsonProperty val clientP2PJoinable: Boolean,

        /**
         * Version number of the config file.
         */
        @get:JsonGetter @JsonProperty val configurationVersion: Map<String, Int>,

        /**
         * Map of crafting properties.
         *
         * <b>Known keys:</b>
         *
         * filterHaveMaterials - Forces server to make sure players have materials when crafting an item.
         */
        @get:JsonGetter @JsonProperty val crafting: Map<String, Boolean>,

        /**
         * Binding used by connecting clients.
         */
        @get:JsonGetter @JsonProperty val gameServerBind: String,

        /**
         * The port of the server.
         */
        @get:JsonGetter @JsonProperty val gameServerPort: Int,

        /**
         * Enables interactive highlighting.
         */
        @get:JsonGetter @JsonProperty val interactiveHighlight: Boolean,

        /**
         * Map of inventory properties.
         *
         * <b>Known keys:</b>
         *
         * pickupToActionBar - Automatically fill action bar when new items are picked up.
         */
        @get:JsonGetter @JsonProperty val inventory: Map<String, Boolean>,


        /**
         * The maximum number of players that can be connected to the server at the same time.
         */
        @get:JsonGetter @JsonProperty val maxPlayers: Int,

        /**
         * The maximum number of players that can be in a specific team.
         */
        @get:JsonGetter @JsonProperty val maxTeamSize: Int,

        /**
         * Number of backups made of player save files.
         */
        @get:JsonGetter @JsonProperty val playerBackupFileCount: Int,

        /**
         * Binding used by querying clients.
         * @see <a href="https://developer.valvesoftware.com/wiki/Server_queries>Server Query Protocol</a>
         */
        @get:JsonGetter @JsonProperty val queryServerBind: String,

        /**
         * Binding used by querying clients.
         * @see <a href="https://developer.valvesoftware.com/wiki/Server_queries>Server Query Protocol</a>
         */
        @get:JsonGetter @JsonProperty val queryServerPort: Int,

        /**
         * Binding used by RCON clients.
         * @see <a href="https://developer.valvesoftware.com/wiki/Source_RCON_Protocol">Source RCON Protocol</a>
         */
        @get:JsonGetter @JsonProperty val rconServerBind: String,

        /**
         * Password for RCON client connections.
         * @see <a href="https://developer.valvesoftware.com/wiki/Source_RCON_Protocol">Source RCON Protocol</a>
         */
        @get:JsonGetter @JsonProperty val rconServerPassword: String,

        /**
         * Port used by RCON client connections.
         * @see <a href="https://developer.valvesoftware.com/wiki/Source_RCON_Protocol">Source RCON Protocol</a>
         */
        @get:JsonGetter @JsonProperty val rconServerPort: Int,

        /**
         * Timeout for RCON client connections in seconds.
         * @see <a href="https://developer.valvesoftware.com/wiki/Source_RCON_Protocol">Source RCON Protocol</a>
         */
        @get:JsonGetter @JsonProperty val rconServerTimeout: Int,

        /**
         * Enables query connections.
         * @see <a href="https://developer.valvesoftware.com/wiki/Server_queries>Server Query Protocol</a>
         */
        @get:JsonGetter @JsonProperty val runQueryServer: Boolean,

        /**
         * Enables RCON connections.
         * @see <a href="https://developer.valvesoftware.com/wiki/Source_RCON_Protocol">Source RCON Protocol</a>
         */
        @get:JsonGetter @JsonProperty val runRconServer: Boolean,

        /**
         * Enables script safety precautions, which are defined as properties prefixed by script*.
         */
        @get:JsonGetter @JsonProperty val safeScripts: Boolean,

        /**
         * Maximum Number of instructions in a script.
         */
        @get:JsonGetter @JsonProperty val scriptInstructionLimit: Int,

        /**
         * Interval in which script instructions are counted.
         */
        @get:JsonGetter @JsonProperty val scriptInstructionMeasureInterval: Int,

        /**
         * TODO: Unknown? Fill out.
         */
        @get:JsonGetter @JsonProperty val scriptProfilingEnabled: Boolean,

        /**
         * Maximum number of times a script can run sequentially.
         */
        @get:JsonGetter @JsonProperty val scriptRecursionLimit: Int,

        /**
         * "on", "off" or "automatic"
         */
        @get:JsonGetter @JsonProperty val serverFidelity: String,

        /**
         * The name of the Starbound server.
         */
        @get:JsonGetter @JsonProperty val serverName: String,

        /**
         * TODO: Unknown
         */
        @get:JsonGetter @JsonProperty val serverOverrideAssetsDigest: Boolean?,

        /**
         * Username and password structure.
         */
        @get:JsonGetter @JsonProperty val serverUsers: Map<String, UserMetadata>,

        /**
         * Enables tutorial messages from the in-game "AI".
         */
        @get:JsonGetter @JsonProperty val tutorialMessages: Boolean

)
