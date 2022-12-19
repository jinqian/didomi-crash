plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {
    namespace = "com.example.didomiplayground"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.didomiplayground"
        minSdk = 23
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("debug") {
            // The deprecated `isTestCoverageEnabled` is provoking the crash
            // by replacing it with `enableUnitTestCoverage = true` we can fix the crash
            // WARNING: but enableAndroidTestCoverage = true will crash with Didomi too
            isTestCoverageEnabled = true
        }

        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility(JavaVersion.VERSION_11)
        targetCompatibility(JavaVersion.VERSION_11)
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {
    implementation("io.didomi.sdk:android:1.71.0")
}