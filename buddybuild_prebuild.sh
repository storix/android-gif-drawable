#!/usr/bin/env bash

set -e

rm -rf ${ANDROID_NDK_HOME}
${ANDROID_HOME}/tools/bin/sdkmanager --update
${ANDROID_HOME}/tools/bin/sdkmanager ndk-bundle
ln -s ${ANDROID_HOME}/ndk-bundle ${ANDROID_NDK_HOME}
