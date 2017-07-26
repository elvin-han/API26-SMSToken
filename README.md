Examples for
- [Android O: Phone Number Verification With SMS Tokens](https://code.tutsplus.com/tutorials/android-o-phone-number-verification-with-sms-token--cms-29141)

# What Is an SMS Token?
- SMS Token이나 one-time password는 사용자를 확인하는 보안 매커니즘임
- 토큰은 만료되지 않지만, 새로 generate되면 만료됨.

# Why Use Android O's SMS Token?
- 사용자 경험을 향상시킴
  - SMS Client 로부터 copy and paste 할 필요 없음
  - 사용자 폰으로 전송된 토큰을 자동 디텍팅해서 PendingIntent를 실행함
- READ_SMS 권한이 필요 없음
- SMS Client에 메시지가 남지 않음

# Using a Server
- [앱] SMS Token Generation
- [앱] 서버로 phoneNumber, SMS Token 전송
- [서버] phoneNumber로 SMS 전송 (내용에 SMS Token 포함)
- [앱] 자동 detect되어 pendingIntent 실행