# Ciclone Tamacat デモ

このプロジェクトは、フォームバリデーションを実演するSpring Bootアプリケーションで、FizzBuzzの実装も含まれています。Spring Bootアプリケーションでの様々な機能の実装例として機能します。

## 機能

- Spring Boot Validationを使用したフォームバリデーション
- Thymeleafテンプレートエンジンの統合
- 国際化対応（日本語・英語）
- FizzBuzz実装
- Seleniumを使用したE2Eテスト
- 包括的な単体テスト

## 必要条件

- Java 17以上
- Gradle（ラッパー included）

## 始め方

1. リポジトリのクローン:
```bash
git clone https://github.com/yourusername/ciclone-tamacat-demo.git
cd ciclone-tamacat-demo
```

2. プロジェクトのビルド:
```bash
./gradlew build
```

3. アプリケーションの実行:
```bash
./gradlew bootRun
```

アプリケーションは `http://localhost:8080` で利用可能になります。

## 使い方

### フォームバリデーションデモ

このアプリケーションは以下の機能を持つフォームバリデーションデモを提供します：

1. `http://localhost:8080/` でフォームにアクセス
2. フォームの検証ルール:
   - 名前フィールド:
     - 必須入力
     - 2文字から30文字の間
   - 年齢フィールド:
     - 必須入力
     - 20歳以上

3. 検証成功時は結果ページにリダイレクト
4. 検証失敗時はエラーメッセージを表示（ブラウザの言語設定に応じて日本語または英語）

デモでは、バリデーションエラーを示すために「寿限無」の長い文章と年齢10歳があらかじめ入力されています。

### 国際化対応

アプリケーションは日本語と英語に対応しています。エラーメッセージやバリデーションルールは、ブラウザの言語設定に応じて表示されます。

### FizzBuzz実装

クラシックなFizzBuzzの実装が含まれています：
- 0から100までの数字を出力
- 3で割り切れる数字の場合は "Fizz" を出力
- 5で割り切れる数字の場合は "Buzz" を出力
- 3と5の両方で割り切れる数字の場合は "FizzBuzz" を出力
- それ以外の場合は数字をそのまま出力

FizzBuzzプログラムは以下のコマンドで実行できます：
```bash
./gradlew run -PmainClass=com.samuraism.fizzbuzz.FizzBuzz
```

## プロジェクト構成

```
src/
├── main/
│   ├── java/
│   │   ├── com.example.validationtest/    # バリデーションデモ
│   │   │   ├── PersonForm.java            # フォームバリデーションモデル
│   │   │   ├── ValidationTestApplication.java
│   │   │   └── WebController.java         # Webコントローラー
│   │   └── com.samuraism.fizzbuzz/        # FizzBuzz実装
│   └── resources/
│       ├── static/                        # 静的リソース
│       ├── templates/                     # Thymeleafテンプレート
│       ├── messages.properties            # i18nメッセージ（英語）
│       └── messages_ja.properties         # 日本語メッセージ
└── test/
    └── java/
        ├── com.example.validationtest/    # テストケース
        │   ├── E2ETest.java              # E2Eテスト
        │   ├── PersonFormTest.java       # フォームバリデーションテスト
        │   └── UserControllerTest.java   # コントローラーテスト
        └── com.samuraism.fizzbuzz/       # FizzBuzzテスト
```

## 依存関係

- Spring Boot 3.1.4
  - spring-boot-starter-web
  - spring-boot-starter-validation
  - spring-boot-starter-thymeleaf
- テスト
  - spring-boot-starter-test
  - selenium-java 4.21.0

## テストの実行

テストを実行するには：
```bash
./gradlew test
```

## ライセンス

このプロジェクトはCC0でライセンスされています - 詳細は [samuraism.com](https://samuraism.com) をご覧ください。