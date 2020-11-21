# discount

[microservices-sample](https://github.com/n-ono/microservices-sample) の割引を計算するサービス

## ドメインモデル

![割引](https://user-images.githubusercontent.com/58995947/99875543-f0cf3e00-2c33-11eb-9307-77f3f354151b.png)

## 各種コマンド

下記コマンドは全てプロジェクトのルートディレクトリで実行する

### ビルド

```
$ ./gradlew clean build
```

### Docker イメージ生成

```
$ docker build -t <image-name>:<tag> -f docs/docker/Dockerfile . 
```

`<image-name>` と `<tag>` は任意の値を指定する
