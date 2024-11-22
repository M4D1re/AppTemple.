plugins {
    alias(libs.plugins.androidApplication)
    alias(libs.plugins.jetbrainsKotlinAndroid)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.apptemple"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.apptemple"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures{
        viewBinding = true
    }
}

dependencies {
//    implementation (libs.material.v190)
//    implementation (libs.androidx.cardview)
//    implementation ("org.jsoup:jsoup:1.18.1")

    implementation (libs.kotlinx.coroutines.android)
    implementation(libs.koin.core)
    implementation(libs.koin.android)

    kapt(libs.androidx.room.compiler)
    implementation (libs.androidx.room.ktx)
    implementation(libs.androidx.room.runtime)

    implementation(libs.kotlinx.serialization.json)
    implementation (libs.okhttp)
    implementation (libs.logging.interceptor)
    implementation(libs.glide)


    implementation(libs.retrofit)
    implementation(libs.converter.gson)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}