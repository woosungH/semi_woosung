function check(){
	if(!order_frm.receiver_name.value){
		alert("이름을 작성해주세요");
		order_frm.receiver_name.focus();
		return;
	}
	if(!order_frm.receiver_phone2.value){
		alert("전화번호를 작성해주세요");
		order_frm.receiver_phone.focus();
		return;
	}
	if(!order_frm.receiver_phone3.value){
		alert("전화번호를 작성해주세요");
		order_frm.receiver_phone.focus();
		return;
	}
	if(!order_frm.receiver_pcode.value){
		alert("주소를 작성해주세요");
		order_frm.receiver_pcode.focus();
		return;
	}
	if(!order_frm.receiver_raddr.value){
		alert("주소를 작성해주세요");
		order_frm.receiver_raddr.focus();
		return;
	}
	if(!order_frm.receiver_jibun.value){
		alert("주소를 작성해주세요");
		order_frm.receiver_jibun.focus();
		return;
	}
	document.order_frm.submit();
}



function sample4_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('sample4_postcode').value = data.zonecode;
            document.getElementById("sample4_roadAddress").value = roadAddr;
            document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
            
            // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
            if(roadAddr !== ''){
                document.getElementById("sample4_extraAddress").value = extraRoadAddr;
            } else {
                document.getElementById("sample4_extraAddress").value = '';
            }

            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
            if(data.autoRoadAddress) {
                var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';

            } else if(data.autoJibunAddress) {
                var expJibunAddr = data.autoJibunAddress;
                guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
        }
    }).open();
}

function exitCheck(a) {
	var deleted = "delete"+a;
	var href = document.getElementById(deleted).value;
    var checking = Swal.fire({
					   title: '해당 회원을 탈퇴 시키겠습니까?',
					   text: '한번 탈퇴시킨 회원의 정보는 복구할 수 없습니다.',
					   icon: 'warning',
					   
					   showCancelButton: true, // cancel버튼 보이기. 기본은 원래 없음
					   confirmButtonColor: '#3085d6', // confrim 버튼 색깔 지정
					   cancelButtonColor: '#d33', // cancel 버튼 색깔 지정
					   confirmButtonText: '승인', // confirm 버튼 텍스트 지정
					   cancelButtonText: '취소', // cancel 버튼 텍스트 지정
					   
					   reverseButtons: true, // 버튼 순서 거꾸로
					   
					}).then(result => {
					   // 만약 Promise리턴을 받으면,
					   if (result.isConfirmed) { // 만약 모달창에서 confirm 버튼을 눌렀다면
					      Swal.fire(
							'승인이 완료되었습니다.',
							'해당 회원은 탈퇴 되었습니다.',
							'success'
						  );
						  setTimeout(function() {
						  	location.href=href;
						  }, 3000);
					   }
					});
}
function refundCheck(a) {
	var refunded = "refund"+a;
	var href = document.getElementById(refunded).value;
    var checking = Swal.fire({
					   title: '해당 주문을 환불하시겠습니까?',
					   text: '환불 후 주문 상태를 변경할 수 없습니다.',
					   icon: 'warning',
					   
					   showCancelButton: true, // cancel버튼 보이기. 기본은 원래 없음
					   confirmButtonColor: '#3085d6', // confrim 버튼 색깔 지정
					   cancelButtonColor: '#d33', // cancel 버튼 색깔 지정
					   confirmButtonText: '승인', // confirm 버튼 텍스트 지정
					   cancelButtonText: '취소', // cancel 버튼 텍스트 지정
					   
					   reverseButtons: true, // 버튼 순서 거꾸로
					   
					}).then(result => {
					   // 만약 Promise리턴을 받으면,
					   if (result.isConfirmed) { // 만약 모달창에서 confirm 버튼을 눌렀다면
					      Swal.fire(
							'승인이 완료되었습니다.',
							'해당 주문은 환불 되었습니다.',
							'success'
						  );
						  setTimeout(function() {
						  	location.href=href;
						  }, 3000);
					   }
					});
}
function delCheck(a) {
	var deleted = "delete"+a;
	var href = document.getElementById(deleted).value;
    var checking = Swal.fire({
					   title: '해당 상품을 삭제 하겠습니까?',
					   text: '한번 삭제한 상품의 정보는 복구할 수 없습니다.',
					   icon: 'warning',
					   
					   showCancelButton: true, // cancel버튼 보이기. 기본은 원래 없음
					   confirmButtonColor: '#3085d6', // confrim 버튼 색깔 지정
					   cancelButtonColor: '#d33', // cancel 버튼 색깔 지정
					   confirmButtonText: '승인', // confirm 버튼 텍스트 지정
					   cancelButtonText: '취소', // cancel 버튼 텍스트 지정
					   
					   reverseButtons: true, // 버튼 순서 거꾸로
					   
					}).then(result => {
					   // 만약 Promise리턴을 받으면,
					   if (result.isConfirmed) { // 만약 모달창에서 confirm 버튼을 눌렀다면
					      Swal.fire(
							'승인이 완료되었습니다.',
							'해당 상품은 삭제 되었습니다.',
							'success'
						  );
						  setTimeout(function() {
						  	location.href=href;
						  }, 3000);
					   }
					});
}

function onclick_ok(){
    if(!wrt_frm.n_title.value){
        alert("제목을 써주세요.");
        wrt_frm.n_title,focus();
        return;
    } else if(!wrt_frm.n_pwd.value){
        alert("암호을 써주세요.");
        wrt_frm.n_pwd,focus();
        return;
    }
	const element = document.getElementsByClassName("ql-editor")[0];
	
	document.getElementById("content").value = element.innerHTML;
	
    document.wrt_frm.submit();
}

function delete_ok(){
    if(!del_frm.n_pwd.value){
        alert("암호을 써주세요.");
        del_frm.n_pwd,focus();
        return;
    }
    document.del_frm.submit();
}
