22/09/20 
- 관리자 페이지 구현
- 주문관리 페이지에서 수정 부분은 완료
- 환불관리는 결제와 연동되야 해서 현재는 불가능

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
