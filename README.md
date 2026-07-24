# 🌌 Xspace
### *Brand new day* 🌿🍪

**Xspace** is a from-scratch **Minecraft: Java Edition launcher for Android**,
built around a brand-new renderer backend (**XVL**), a brand-new library
system (**LIBERTY**), and a fully themable UI — written original, end to end. 🦋

> **No impossible. Only "takes time." We are the best team.** 🪼🫎

---

## 🛡️ The Promise (originality)
- The **launcher, the renderer backend, the UI, every kernel** = **100% original Xspace code**.
- We **never copy, paraphrase, or "rename-and-ship"** code from PojavLauncher,
  Zalith, Mojo, or any copyleft project (their code is GPL/LGPL and legally
  contested; renaming does not remove copyleft).
- We **do** stand on the open world: the **OpenJDK** JVM, the **LWJGL** API
  specification, **Mojang's** `piston-meta` servers, and **Modrinth's** API.
  Using an open standard is not copying an implementation.

## 🧠 Architecture in one breath
Minecraft's Java runs on an **OpenJDK** build for `aarch64`/android (upstream).
On top of it, **XVL** (our C/C++ + Java backend) gives LWJGL a real home on
Android (EGL/GLES + touch→input). On top of that, **SPACE** + the kernels
(accounts, downloads, mods, UI) make it a launcher.

## 🗂️ Repository structure
> Folders are **not** pre-created empty. Each appears when its first real
> file lands. 📍 marks what exists today.

```text
Xspace/
├── .github/                # workflows/ (CI) + templates
├── gradle/                 # wrapper + version catalog
├── scripts/                # our build/helper tools
├── docs/                   # charter / roadmap / architecture / provenance
├── SPACE/                  # HULL KERNEL    – Android app shell
├── UI/                     # CANVAS SYSTEM  – themable screens + theme engine
├── ACCOUNT/                # IDENTITY KERNEL – offline + Microsoft
├── XVL/                    # XVL ENGINE     – our renderer backend (cpp+java)
├── LIBERTY/                # FORGE SYSTEM   – libs + lwjgl-android + wrappers
├── Minecraft/              # PISTON KERNEL  – versions + assets + launch
├── ANIMATION/              # STAGE SYSTEM   – splash + ambient animations
├── NOTIFICATION/           # HERALD SYSTEM  – circular notices
├── DI/                     # ORACLE SYSTEM  – in-launcher AI assistant
├── DISCORD/                # BEACON SYSTEM  – community deep-link
├── build.gradle.kts        # (Stop 1)
├── settings.gradle.kts     # (Stop 1)
├── gradle.properties       # (Stop 1)
├── README.md               # 📍 exists
├── .gitignore              # 📍 exists
└── LICENSE                 # (Stop 1 – decision pending)
```

## 🔧 Toolchain
- **Platform:** **GitHub + GitHub Actions only.** (No Codespaces.)
- **Local dev:** anywhere you like; the cloud only *builds*.
- **CI:** GitHub-hosted `ubuntu-latest` runners install **JDK 21 + Android SDK + NDK**,
  run Gradle build/test/lint, and can assemble the APK as a downloadable artifact.
- **Build:** Gradle (Kotlin DSL) + Android Gradle Plugin + **NDK** (for XVL C/C++).
- **Languages:** Kotlin (app/UI), Java (launcher core), C/C++ (XVL native).
- **LWJGL target:** `3.4.1` (current stable).

## 🌐 External services we speak to
| Service | URL | Notes |
|---|---|---|
| Mojang versions | `https://piston-meta.mojang.com/mc/game/version_manifest_v2.json` | auto-update source |
| Modrinth API | `https://api.modrinth.com/v2` | **requires a descriptive `User-Agent`** |
| Discord | `https://discord.gg/edaKPNcuN` | community / support |

## ⚖️ License
**Decision pending — finalized at Stop 1.** We write original code, so we are
free to choose; we will pick consciously, not by accident.

## 🤝 Working contract
Original-only · no placeholders · one coherent stop at a time · explain-the-why ·
full-file updates · verify-together (CI green + on-device) · study-before-writing.
Full charter: `docs/CHARTER.md` (Stop 1).

## 💬 Community
Join the trip: **https://discord.gg/edaKPNcuN** 🐙
