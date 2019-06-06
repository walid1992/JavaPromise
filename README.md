# Java Promise

-----

Java Promise 方式。

## Usage

在项目根目录 build.gradle 中加入：

```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

在工程目录 build.gradle 中加入：

```
dependencies {
    implementation 'com.github.walid1992:JavaPromise:v1.0.0'
}
```

## 示例

```
        Promise<String, Integer> promise = new Promise<>((resolve, reject) -> {
            System.out.println("BEGIN");
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("END");
                    resolve.run("walid =>");
                }
            }, 2000);
        });
        promise.then(s -> {
            System.out.println("then 1 : " + s);
            return s + s;
        }).then(s -> {
            System.out.println("then 2 : " + s);
            return s + s;
        }).then(s -> {
            System.out.println("then 3 : " + s);
            promise.reject.run(-1);
        }).fail(integer -> System.out.println("main fail"));
```

## License

This project is licensed under the terms of the MIT license.
