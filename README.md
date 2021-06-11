# Server
---
### Co-ARi
도메인 주소 : http://www.co-ari.o-r.kr:8080/
 - Web : 정보 등록
    - 호실 정보 등록
    - 알림 등록
    - 졸업 명예의 전당 등록

 - **클라이언트 요청**시, 그에 맞는 정보 API 제공

### API 명세서
- http://co-ari.o-r.kr:8080/swagger-ui.html
  - 알림 API [Alarms]
  - 호실 정보 (앵커) API [Anchors]
  - 졸업 명예의 전당 API [Graduates]
  - 공지사항 API [Notices]
  - 학과소식 API [News]
  - 사용자 API [Users]
<img src="restAPI.PNG">

### 서버 아키텍처 구조
- MVC 패턴을 적용하여 서버를 구축하였다. 
<img src="server.png">
