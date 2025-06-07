# Ciclone Tamacat Demo - Project Guidelines

## Project Overview

Ciclone Tamacat Demo is a Spring Boot application that serves as a demonstration platform for various Java web development features and best practices. The project showcases form validation implementation along with other essential web application functionalities.

### Key Features

1. **Form Validation**
   - Spring Boot Validation implementation
   - Real-time form validation with comprehensive error handling
   - Age and name field validation with specific rules
   - Internationalized validation messages

2. **Technical Stack**
   - Java 17+
   - Spring Boot 3.1.4
   - Thymeleaf template engine
   - Gradle build system

3. **Internationalization**
   - Full support for Japanese and English
   - Language-specific validation messages
   - Browser-based language detection

4. **Testing Infrastructure**
   - Selenium-based E2E testing
   - Comprehensive unit tests
   - Integration tests for controllers

5. **Additional Features**
   - FizzBuzz implementation as a coding example
   - Static resource handling
   - RESTful endpoints

## Project Structure

```
src/
├── main/
│   ├── java/
│   │   ├── com.example.validationtest/    # Validation demo
│   │   │   ├── PersonForm.java            # Form validation model
│   │   │   ├── ValidationTestApplication.java
│   │   │   └── WebController.java         # Web controller
│   │   └── com.samuraism.fizzbuzz/        # FizzBuzz implementation
│   └── resources/
│       ├── static/                        # Static resources
│       ├── templates/                     # Thymeleaf templates
│       ├── messages.properties            # i18n messages (English)
│       └── messages_ja.properties         # Japanese messages
└── test/
    └── java/
        ├── com.example.validationtest/    # Test cases
        └── com.samuraism.fizzbuzz/        # FizzBuzz tests
```

## Development Guidelines

### Code Style
- Follow Java standard naming conventions
- Use proper JavaDoc documentation for public APIs
- Implement comprehensive error handling
- Include unit tests for new features

### Testing Requirements
- Maintain test coverage for new code
- Include both unit and integration tests
- E2E tests for critical user paths
- Test both English and Japanese language scenarios

### Internationalization
- All user-facing strings should be externalized
- Support both English and Japanese languages
- Use message properties files for translations

## Build and Deployment

### Prerequisites
- Java 17 or higher
- Gradle (wrapper included)

### Build Commands
```bash
# Build the project
./gradlew build

# Run the application
./gradlew bootRun

# Run tests
./gradlew test
```

### Development Workflow
1. Clone the repository
2. Build the project locally
3. Run tests to ensure everything works
4. Make changes following the guidelines
5. Submit changes through pull requests

## License

This project is licensed under CC0. For more details, visit [samuraism.com](https://samuraism.com).

---

# Ciclone Tamacat デモ - プロジェクトガイドライン

## プロジェクト概要

Ciclone Tamacat デモは、Javaウェブ開発の様々な機能とベストプラクティスを実演するSpring Bootアプリケーションです。フォームバリデーションの実装と他の重要なウェブアプリケーション機能を紹介しています。

### 主な機能

1. **フォームバリデーション**
   - Spring Boot Validationの実装
   - リアルタイムフォームバリデーションと包括的なエラー処理
   - 年齢と名前フィールドの特定のルールによる検証
   - 国際化されたバリデーションメッセージ

2. **技術スタック**
   - Java 17以上
   - Spring Boot 3.1.4
   - Thymeleafテンプレートエンジン
   - Gradleビルドシステム

3. **国際化対応**
   - 日本語と英語の完全サポート
   - 言語別のバリデーションメッセージ
   - ブラウザベースの言語検出

4. **テストインフラストラクチャ**
   - SeleniumによるE2Eテスト
   - 包括的な単体テスト
   - コントローラーの統合テスト

5. **追加機能**
   - FizzBuzzの実装例
   - 静的リソース処理
   - RESTfulエンドポイント

## 開発ガイドライン

### コードスタイル
- Java標準の命名規則に従う
- 公開APIには適切なJavaDocドキュメントを付ける
- 包括的なエラー処理を実装する
- 新機能には単体テストを含める

### テスト要件
- 新規コードのテストカバレッジを維持する
- 単体テストと統合テストの両方を含める
- 重要なユーザーパスのE2Eテスト
- 日本語と英語の両方のシナリオをテスト

### 国際化
- すべてのユーザー向け文字列を外部化する
- 日本語と英語の両方をサポート
- 翻訳にメッセージプロパティファイルを使用

## ビルドとデプロイメント

### 前提条件
- Java 17以上
- Gradle（ラッパー included）

### ビルドコマンド
```bash
# プロジェクトのビルド
./gradlew build

# アプリケーションの実行
./gradlew bootRun

# テストの実行
./gradlew test
```

### 開発ワークフロー
1. リポジトリのクローン
2. ローカルでのプロジェクトビルド
3. テスト実行で動作確認
4. ガイドラインに従って変更を加える
5. プルリクエストで変更を提出

## ライセンス

このプロジェクトはCC0でライセンスされています。詳細は [samuraism.com](https://samuraism.com) をご覧ください。

Junieがデベロッパーに表示する自然言語は原則日本語で返すようにします。
