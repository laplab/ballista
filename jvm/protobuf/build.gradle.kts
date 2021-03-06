description = "Ballista protocol buffer format"

plugins {
    java
    id("com.google.protobuf") version "0.8.11"
    id("idea")
}


sourceSets {
    main {
        proto {
            srcDir("../../proto")
        }
    }
}

dependencies {

    implementation(project(":datatypes"))
    implementation(project(":datasource"))
    implementation(project(":logical-plan"))

    implementation("org.apache.arrow:arrow-memory:1.0.0")
    implementation("org.apache.arrow:arrow-vector:1.0.0")
    implementation("com.google.protobuf:protobuf-java:3.11.4")
    testImplementation("junit:junit:4.13")
}
