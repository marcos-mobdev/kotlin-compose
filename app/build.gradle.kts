plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    id("kotlin-kapt")
    id("com.google.dagger.hilt.android")
}

android {
    namespace = "br.com.appforge.kotlincompose"
    compileSdk = 35

    defaultConfig {
        applicationId = "br.com.appforge.kotlincompose"
        minSdk = 24
        targetSdk = 34
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
    buildFeatures {
        compose = true
    }

}

dependencies {
    val lifecycle_version = "2.8.7"
    val fragment_version = "1.8.3"



    // ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    // ViewModel utilities for Compose (viewModel)
    implementation(libs.androidx.lifecycle.viewmodel.compose)
    // LiveData (observe)
    implementation(libs.androidx.lifecycle.livedata.ktx)
    //Live Data for Compose (observeAsState)
    implementation(libs.androidx.runtime.livedata)
    // Fragment KTX (byViewModels)
    implementation(libs.androidx.fragment.ktx)

    //Retrofit (API Consumption)
    implementation(libs.retrofit2.retrofit)
    implementation(libs.converter.gson)
    //Hilt (DI)
    implementation(libs.hilt.android)
    kapt(libs.hilt.android.compiler)
    //Coil (image loading)
    implementation(libs.coil.compose)
    implementation(libs.coil.network.okhttp)


    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)
}

kapt {
    correctErrorTypes = true
}