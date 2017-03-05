#!/usr/bin/env bash

set -e

OS=linux
if [[ `uname` == 'Darwin' ]]; then
    OS=darwin
fi

ANDROID_NDK_VERSION=r14

cd
wget -q https://dl.google.com/android/repository/android-ndk-${ANDROID_NDK_VERSION}-${OS}-x86_64.zip
unzip -q android-ndk-${ANDROID_NDK_VERSION}-${OS}-x86_64.zip
rm -rf ${ANDROID_NDK_HOME}
mv android-ndk-${ANDROID_NDK_VERSION} ${ANDROID_NDK_HOME}
cat ${ANDROID_NDK_HOME}/source.properties
