# Webhook Buffer Engine

This project is a helper for webhooks. Sometimes, other apps send too many webhooks at once and can crash your server. This engine catches those webhooks, holds them safely, and sends them to your server one by one so nothing breaks.

## What this project does
* Catches everything: It picks up webhooks very fast so the sender doesn't get an error.
* Holds the data: It keeps the webhooks in a list so they don't get lost.
* Sends slowly: It sends the webhooks to your main app at a speed your app can handle.

## Tools used
* Java 21: The main programming language.
* Spring Boot: The framework that makes the app run.
* Gradle: The tool that builds the code.

## How to run it on your computer

### What you need
* Java 21 installed on your computer.

### Steps to run
1. Get the code:
git clone https://github.com/vrangerps-oss/webhook-buffer-engine.git
cd webhook-buffer-engine

2. Build the code:
./gradlew clean build

3. Start the app:
./gradlew bootRun

## Automatic Code Check (Sonar)
We use a tool called SonarCloud. Every time you try to merge new code, this tool automatically checks it to make sure there are no bugs, the code is easy to read, and there are no security holes.