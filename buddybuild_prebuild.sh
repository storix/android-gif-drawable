#!/usr/bin/env bash

set -e

${ANDROID_HOME}/tools/bin/sdkmanager --update
${ANDROID_HOME}/tools/bin/sdkmanager ndk-bundle
