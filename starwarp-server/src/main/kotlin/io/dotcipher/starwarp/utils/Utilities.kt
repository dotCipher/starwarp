package io.dotcipher.starwarp.utils

import java.io.File
import java.util.*

class Utilities {
    companion object Files {
        fun find(directory: java.io.File, fileName: String) : Optional<File> {
            if (directory.isDirectory.not()) {
                throw IllegalArgumentException("$directory must be a directory")
            }
            directory.walk(FileWalkDirection.BOTTOM_UP)
                    .filter { it.name == fileName }
                    .forEach { return Optional.of(it) }
            return Optional.empty()
        }
    }
}

