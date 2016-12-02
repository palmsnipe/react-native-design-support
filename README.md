# react-native-design-support



## Installation

- Run `npm install palmsnipe/react-native-design-support --save` to install using npm.

- Add the following two lines to `android/settings.gradle`:

```gradle
include ':react-native-design-support'
project(':react-native-design-support').projectDir = new File(rootProject.projectDir, '../node_modules/react-native-design-support')
```

- Edit `android/app/build.gradle` and add the annoated lines as below:

```gradle
...

dependencies {
    compile fileTree(dir: "libs", include: ["*.jar"])
    compile "com.android.support:appcompat-v7:25.0.1"
    compile "com.facebook.react:react-native:+"
    compile project(':react-native-design-support')  // <- Add this line
}
```
