# utils - really - utils
#### Purpose of this repository is
1. How to use a git repository directly in a java gradle or maven project
2. How to use enable a git repository so that gradle or maven can get it globally
3. Introduce JitPack.io ... 
4. Simplest way to get your java library all over the world

#### Gradle 
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

Step 2. Add the dependency
```
dependencies {
    compile 'com.github.javagrails:utils:v1.0'
}

```

#### Maven 
Step 1. Add the JitPack repository to your build file 
```
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>	
```

Step 2. Add the dependency
```
<dependency>
    <groupId>com.github.javagrails</groupId>
    <artifactId>utils</artifactId>
    <version>v1.0</version>
</dependency>
```
