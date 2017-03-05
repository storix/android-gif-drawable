#!/usr/bin/env bash

set -e

os=linux
if [[ `uname` == 'Darwin' ]]; then
    os=darwin
fi

ANDROID_NDK_VERSION=r14
INSTALLER_DIR=$HOME/.android-ndk

cd
wget -q https://dl.google.com/android/repository/android-ndk-${ANDROID_NDK_VERSION}-${os}-x86_64.zip
unzip -q android-ndk-${ANDROID_NDK_VERSION}-${os}-x86_64.zip
mv android-ndk-${ANDROID_NDK_VERSION} ${ANDROID_NDK_HOME}
cat ${ANDROID_NDK_HOME}/source.properties
