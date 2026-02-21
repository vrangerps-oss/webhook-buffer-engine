# Contributing to vrangerps-oss

First off, thank you for being here! We want to make contributing to the **Webhook Buffer Engine** as productive and transparent as possible. 

By contributing to this project, you agree to abide by our **Code of Conduct**.

---

## 🛠 Development Environment
To ensure your code is compatible with our engine, please use the following stack:
* **JDK:** 21 (Eclipse Temurin recommended)
* **Build Tool:** Gradle 8.x+ (Kotlin DSL)
* **IDE:** IntelliJ IDEA (preferred) or VS Code

---

## 🌿 Branching Strategy
We use a structured branching model. All work must start from a branch off `main`.

* **Format:** `<type>/<issue-number>-<short-description>`
* **Types:** `feat`, `fix`, `docs`, `style`, `refactor`, `test`, `ci`, `build`, `chore`
* **Example:** `feat/12-add-salesforce-auth`

---

## 📝 Commit Message Standards
We strictly follow [Conventional Commits](https://www.conventionalcommits.org/). This allows our automated release bots to generate changelogs and version the project correctly.

### The Format
`<type>(<scope>): <description> (<Keyword> #<issue-number>)`

### Supported Automation Keywords
To automatically link and close issues upon merging, please use any of the following keywords followed by the issue number:
* **Closing:** `Closes`, `Fixes`, `Resolves`
* **Ongoing:** `Ref` (Use this if the PR only partially addresses an issue)

### Examples
* **Feature:** `feat(api): add inbound rest controller (Closes #12)`
* **Bug Fix:** `fix(parser): resolve null pointer on empty payload (Fixes #45)`
* **Infrastructure:** `ci(sonar): update quality gate thresholds (Resolves #4)`

> **Note:** Use the imperative, present tense: "change" not "changed" nor "changes".

---

## 🚀 The Pull Request Process
1. **Fork & Branch:** Create your branch using the naming convention above.
2. **Implement & Test:** Ensure your code compiles and all tests pass locally:
   ```bash
   ./gradlew clean build