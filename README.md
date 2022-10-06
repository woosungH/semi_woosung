## 사용방법

사용한 프로그램 : 이클립스(20년 6월 버전), JAVA 11,  톰캣(9.0버전),  sql developer, 오라클 11xe
설치 방법 
  - 이클립스 :  https://www.eclipse.org/downloads/packages/release/2020-06
  - JAVA :  https://www.oracle.com/java/technologies/downloads/
  - 톰캣 : https://tomcat.apache.org/download-90.cgi
  - sql developer : https://www.oracle.com/database/sqldeveloper/technologies/download/
  - 오라클 11xe : https://www.oracle.com/database/technologies/xe-prior-release-downloads.html
  
프로젝트 진행하며 사용한 라이브러리 :  cos.jar, thumbnailator.jar
 - cos.jar : 서버로 파일을 업로드하기 위해서 사용
 - thumbnailator.jar : 이미지 업로드 후 썸네일 형식으로 크기 수정, 파일 크기 수정을 위해 사용
추가 작업(DB 연결)
  - server.xml :  oracle과 연동하기 위해 하단부의 context 태그 사이에 아래의 내용을 입력
  <Resource auth="Container" driverClassName="oracle.jdbc.driver.OracleDriver" maxActive="100" maxIdle="30" maxWait="10000" name="jdbc/oracle" password="1234 (접속 비밀번호)"/> " type="javax.sql.DataSource" url="jdbc:oracle:thin:@192.168.200.153:1521:xe(url)" username="green(접속 아이디)"/>
  
톰캣 서버로 배포 하는 방법 
1. 프로젝트를 WAR파일로 export해 톰캣이 설치된 경로에서 webapps 파일에 넣어준다.(파일이름 ROOT)
2. sql 서버와 연동을 해야할 경우 톰캣 설치 경로에서 conf 폴더의 context.xml파일에 resource를 추가해준다.
3. 톰캣 설치 경로의 bin 파일에서 startup.bat(윈도우)를 실행해 서버를 실행 시킨다.
4. 서버의 url은 ip주소 : 톰캣서버 포트번호 / 첫화면 파일이름 이다.
    ex ) 192.000.000.000:8080/index.html
    단, ROOT파일이 먼저 실행되므로 파일이름이 ROOT가 아닌경우 따로 설정이 필요하다.
    
-----
## 작업내용

22/09/16
- 고객센터
  1:1 문의(상품문의 통합) > 로그인 후 이용가능 (ID 세션 없으면 로그인 페이지 이동)
  게시글 번호, 아이디, 게시글 카테고리
  답글(관리자만 이용 가능)
  글삭제(작성자, 관리자 이용 가능)
  문의글 작성 시 ID 이용해 회원정보 불러오기(이름,전화번호,이메일)
  QnA 게시판을 위한 jsp 파일 및 자바빈 파일 생성
  
22/09/19
- 파일 업로드 > 이름 바뀌게
  type 제한 (이미지만 업로드 해야하니까) > input 태그에 accept 속성으로 제한할 수 있지만
  확장자를 모든 파일로 변경하면 다른 파일도 업로드 가능
  > 스크립트 제어 필요	// 보류
- 관리자 페이지 화면 구현
  >jsp include 이용 
  질문 삭제 시 답글도 삭제되게 구현
  > 쿼리문 변경
- 관리자 페이지 > 주문 관리 > 주문 목록 > 주문 수정, 환불
- 공지사항 >> 관리자만 글 작성, 수정, 삭제 가능

22/09/20 
- 주문관리 페이지에서 수정 부분은 완료
- 환불관리는 결제와 연동되야 해서 현재는 불가능

22/09/21
- 부트스트랩 적용

22/09/22
- 문의사항 답변/수정시 카테고리 넘어오게
- 답변글이 없는 게시글 답변 단 후에 게시글 숫자 오류 - 페이징 방식 변경
- 스타일 통일감을 위해 관리자 게시판 및 고객센터 CSS 수정

22/09/23
- 상품 수정(삭제) 시 기존 이미지 삭제
- 상품 수정 시 기존 사진 보여주는 곳 디자인
- 상품 삭제 시 한번에 삭제 안되게 하기
- 주문관리 / 환불 관리 테스트
- 관리자 메인 페이지 디자인
- 주문관리 / 환불관리 페이징 변경

22/09/24
- 관리자 페이지 경로 수정 완료
- 관리자 페이지 레이아웃 완료
- 운송장 번호 입력 시 주문 상태 배송중으로 변경, 제품 재고 감소 메소드 추가
- 환불 승인 시 주문 상태 환불 완료로 변경, 제품 재고 증가 메소드 추가
- 섬네일 관련 코드 수정 및 라이브러리 변경

22/09/25
- 카카오페이 결제 기능 추가
- 결제 시 데이터베이스 연동 확인
- 단, 카카오페이 결제 시 QR 코드로 진행하면 가끔 오류로 종료된 결제라는 메시지가 뜨고 팝업창이 남아있음.

22/09/26
- 삭제 > 이미지 삭제 - 아직 안함
- 수정 파일
  product_detail.jsp
  buy_body.jsp>order.jsp
  kakao.jsp
  qnaReply.jsp
- board.js > 없어져서 다시 추가
- 구매 시 재고 줄어드는지 확인
- 재고없는 제품 구매시 오류 뜨는지 확인

22/09/27
- product 삭제 시 경고창 뜨게하기
- admin_body 신규 주문 오늘 주문일자만 나오게 수정
- admin.js > confirm창 꾸미기
- 회원 등급 > 관리자 등급
  등급별 권한 설정
- 관리자 페이지에 그냥 접속 시 페이지 이동
- 페이지별 이동되는 주소 재확인

22/09/28
- 팀원 작업물 합친 후 경로 수정
- 톰캣으로 서버 배포후 작동 테스트
- 각종 오류 확인 후 수정

----
## 참고사항

- src파일의 주석들의 한글이 깨져있음. -> 한글 수정 필요
- 참고한 부트스트랩
 1. https://themewagon.com/themes/free-responsive-bootstrap-4-html5-admin-template-tinydash/
 2. https://technext.github.io/amado/product-details.html
