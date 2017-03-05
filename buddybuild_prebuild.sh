#!/usr/bin/env bash

set -e

os=linux
if [[ `uname` == 'Darwin' ]]; then
    os=darwin
fi

ANDROID_NDK_VERSION=r14
INSTALLER_DIR=$HOME/.android-ndk

cd
wget https://dl.google.com/android/repository/android-ndk-${ANDROID_NDK_VERSION}-${os}-x86_64.zip
unzip -q android-ndk-${ANDROID_NDK_VERSION}-${os}-x86_64.zip
mv android-ndk-${ANDROID_NDK_VERSION} .android-ndk
env
