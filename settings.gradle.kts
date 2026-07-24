// ============================================================
//  Xspace — Gradle settings (the module map)
//  Modules are included HERE, one line at a time, ONLY when the
//  module's own build file lands (Rule 12 — no empty modules).
// ============================================================

pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Xspace"

// ── Modules ────────────────────────────────────────────────
// (none yet) — the first module, :SPACE (HULL KERNEL), is
// included here the moment its build file is created.
// include(":SPACE")
