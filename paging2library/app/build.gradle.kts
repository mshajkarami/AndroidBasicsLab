plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "ir.hajkarami.paging2libraryoverview"
    compileSdk = 35

    defaultConfig {
        applicationId = "ir.hajkarami.paging2libraryoverview"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)


    // Add Paging
    val paging_version = "2.1.2"

    implementation("androidx.paging:paging-runtime:$paging_version") // For Kotlin use paging-runtime-ktx

    // alternatively - without Android dependencies for testing
    testImplementation("androidx.paging:paging-common:$paging_version") // For Kotlin use paging-common-ktx

    // optional - RxJava support
    implementation("androidx.paging:paging-rxjava2:$paging_version") // For Kotlin use paging-rxjava2-ktx

}