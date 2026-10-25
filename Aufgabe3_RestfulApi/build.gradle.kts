plugins {
    id("POS-exam-java-conventions")
}

description = "aufgabe3_restfulapi"

dependencies {
    implementation(libs.spring.boot.starter.webmvc)
    implementation(libs.spring.boot.starter.hateoas)
    implementation(libs.spring.boot.starter.data.jpa)

    testImplementation(libs.spring.boot.starter.webmvc.test)
    testImplementation(libs.spring.boot.starter.hateoas.test)
    testImplementation(libs.spring.boot.starter.data.jpa.test)

    runtimeOnly(libs.h2)
}
