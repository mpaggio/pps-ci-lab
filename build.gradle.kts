plugins {
    java
    scala
}

repositories {
    mavenCentral()
}

dependencies {
    compileOnly("org.scala-lang:scala3-compiler_3:3.7.4")
    implementation("org.scala-lang:scala3-library_3:3.7.4")
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}