plugins {
    id("java-library")
}

group = "org.vitya0717"
version = "1.0-SNAPSHOT"

repositories {
    maven {
        name = "MySQLConnectionHelper" //  optional target repository name
        url = uri("https://my.org.server/repo/mysqlconnectionhelper")
        credentials {
            username = "alice"
            password = "my-password"
        }
    }
}

