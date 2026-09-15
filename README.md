# Fold8 iOS 27 Inspired Icon Pack

Galaxy Fold8용으로 만든 **iOS 27의 글래스/라운드 디자인 언어에서 영감을 받은 독자 아이콘팩**입니다. Apple 공식 아이콘 복제본은 아닙니다.

## 포함
- 30개 512x512 PNG 아이콘
- Samsung/Google/카카오톡/YouTube/Instagram/NAVER/Spotify/ChatGPT 등 appfilter 매핑
- Nova/ADW 계열 아이콘팩 메타데이터
- Android Studio에서 바로 열 수 있는 프로젝트

## 빌드
1. Android Studio에서 이 폴더를 엽니다.
2. Gradle Sync를 실행합니다.
3. Build > Build APK(s).
4. 생성 APK를 Fold8에 설치합니다.

## 삼성 One UI 적용
Good Lock > Theme Park > 아이콘 메뉴에서 설치된 아이콘팩을 선택해 적용합니다. Theme Park/One UI 버전에 따라 서드파티 아이콘팩 인식 범위가 다를 수 있습니다.

## 미지원 앱
Android 런처의 아이콘팩 규격상 `appfilter.xml`에 없는 앱을 이 APK가 임의로 완전히 새 디자인으로 변환할 수는 없습니다. 런처의 adaptive icon/masking 처리에 따라 모양이 통일되며, 완전한 통일을 원하면 해당 앱의 component를 appfilter.xml에 추가하고 전용 아이콘을 추가하세요.
