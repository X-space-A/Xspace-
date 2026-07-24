// ============================================================
//  Xspace — root build script
//  Plugins are declared once (apply false) so their versions
//  resolve from the catalog; each module applies what it needs.
// ============================================================
plugins {
    alias(libs.plugins.androidApplication) apply false
    alias(libs.plugins.kotlinAndroid) apply false
}
