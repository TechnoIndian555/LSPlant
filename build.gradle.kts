plugins {
    alias(libs.plugins.lsplugin.publish)
}

val androidTargetSdkVersion by extra(35)
val androidMinSdkVersion by extra(21)
val androidBuildToolsVersion by extra("35.0.0")
val androidCompileSdkVersion by extra(35)
val androidNdkVersion by extra(libs.versions.ndk.get())
val androidCmakeVersion by extra("3.28.0+")

// Test ke liye bhi extra variables available karao
extra["androidTargetSdkVersion"] = androidTargetSdkVersion
extra["androidMinSdkVersion"] = androidMinSdkVersion
extra["androidBuildToolsVersion"] = androidBuildToolsVersion
extra["androidCompileSdkVersion"] = androidCompileSdkVersion
extra["androidNdkVersion"] = androidNdkVersion
extra["androidCmakeVersion"] = androidCmakeVersion
