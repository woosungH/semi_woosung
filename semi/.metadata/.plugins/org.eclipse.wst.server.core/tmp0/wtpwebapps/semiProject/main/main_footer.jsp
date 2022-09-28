<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<style>
    * {
        margin: 0;
        padding: 0;
        list-style: none;
    }

    ul.main_banner {
        display: flex;
        justify-content: space-around;
    }

    ul.main_banner li a {
        width: 16%;
    }

    a {
        color: black;
        text-decoration: none;
    }

    ul.menu1 {
        display: flex;
        justify-content: space-around;
        margin-top: 30px;
    }

    ul.menuList {
        display: flex;
        justify-content: space-between;
    }

    ul.menuList li {
        width: 23%;
        text-align: center;
    }

    li.foot_menu_d1 {
        width: 27%;
    }

    li.foot_menu_d2 {
        width: 15%;
    }

    li.foot_menu_d3 {
        width: 26%;
    }

    li.foot_menu_d4 {
        width: 28%;
    }

    h4.title {
        font-size: 20px;
        margin-bottom: 10px;
    }

    li.compay_phone {
        font-size: 45px;
        font-weight: bold;
        margin-bottom: 10px;
    }

    a.btn_resp {
        border: 1px solid silver;
        padding: 3px;
    }

    ul.menu2 {
        display: flex;
    }

    ul.menu2 li {
        margin-right: 50px;
    }

    ul.menu3 {
        display: flex;
        flex-wrap: wrap;
        justify-content: space-between;
    }

    ul.menu3 li {
        margin-bottom: 3px;
    }

    span.pcolor {
        font-weight: bold;
    }
    .margin_con {
    	margin-left: 1.25rem;
    }
    .margin_con .main_banner li img {
    	width:50%;
    }
</style>

<body>
<div class="margin_con">
    <ul class="main_banner">
        <li><a class="slink" href="#"><img class="simg" src="../images/1.png"></a></li>
        <li><a class="slink" href="#"><img class="simg" src="../images/2.png"></a></li>
        <li><a class="slink" href="#"><img class="simg" src="../images/3.png"></a></li>
        <li><a class="slink" href="#"><img class="simg" src="../images/4.png"></a></li>
        <li><a class="slink" href="#"><img class="simg" src="../images/5.png"></a></li>
        <li><a class="slink" href="#"><img class="simg" src="../images/6.png"></a></li>
    </ul>
    <hr>
    <div id="layout_footer" class="layout_footer">
        <div class="footer_a">
            <div class="resp_wrap">
                <ul class="menu1">
                    <li class="foot_menu_d1">
                        <h4 class="title"><a href="/service/cs" designelement="text" textindex="1"
                                texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">CS CENTER</a></h4>
                        <ul class="list v4">
                            <li class="compay_phone">
                                <a href="tel:02-535-6100"><img src="/data/skin/20201008/images/common/icon_call_02.png"
                                        class="img_call" alt="">02-535-6100</a>
                            </li>
                            <li>
                                <p designelement="text" textindex="2"
                                    texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">OPEN : AM 09:30
                                    - PM 06:30 / SAT, SUN, HOLIDAY OFF</p>
                                <p designelement="text" textindex="3"
                                    texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">영업시간외 문의는 카카오톡
                                    채널로 부탁드립니다</p>
                            </li>
                        </ul>
                        <!-- //고객센터 -->
                    </li>
                    <li class="foot_menu_d2">
                        <h4 class="title"><span designelement="text" textindex="4"
                                texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">BANK INFO</span>
                        </h4>
                        <ul class="list v3 gray_03">
                            <li>
                                <p>신한 110-450-551224</p>
                                <p><span class="gray_06" designelement="text" textindex="5"
                                        texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">예금주 :</span>
                                    그린샵</p>
                            </li>
                        </ul>
                        <!-- //무통장 입금계좌 -->
                    </li>
                    <li class="foot_menu_d3">
                        <h4 class="title"><span designelement="text" textindex="6"
                                texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">SHOP MENU</span>
                        </h4>
                        <ul class="menuList">
                            <li>
                                <a href="main.jsp?pages=../user_log/mypage" ><img src="../images/2-1.png" alt="">
                                <p class="desc" designelement="text" textindex="7"
                                    texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">마이페이지</p>
                                </a>
                            </li>
                            <li>
                                <a href="main.jsp?pages=../cart/cartList"><img src="../images/2-2.png" alt="">
                                <p class="desc" designelement="text" textindex="8"
                                    texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">CART</p>
                                </a>
                            </li>
                            <li>
                                <a href="main.jsp?pages=../cs/cs_main"><img src="../images/2-3.png" alt="">
                                <p class="desc" designelement="text" textindex="9"
                                    texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">CS CENTER</p>
                                </a>
                            </li>
                            <li>
                                <a href="main.jsp?pages=../product/likeList"><img src="../images/2-4.png" alt="">
                                <p class="desc" designelement="text" textindex="10"
                                    texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">찜목록</p>
                                </a>
                            </li>
                        </ul>
                        <!-- //게시판 -->
                    </li>
                    <li class="foot_menu_d4">
                        <h4 class="title"><span designelement="text" textindex="11"
                                texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">DELIVERY INFO</span>
                        </h4>
                        <ul class="list v5">
                            <li><span designelement="text" textindex="12"
                                    texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">반품주소 :</span>
                                서울특별시 서초구 동광로10길 27 그린촬영시스템(주)</li>
                            <li style="text-indent:0; padding-left:0;">
                                <span designelement="text" textindex="13"
                                    texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">배송조회 : 로젠택배
                                    1588-9988</span>&nbsp;
                                <a href="https://www.ilogen.com/web/personal/tkSearch" target="_blank" title="새창"
                                    class="btn_resp" designelement="text" textindex="14"
                                    texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s"
                                    alt="택배사 배송추적 주소를 입력하세요.">배송추적</a>
                            </li>
                        </ul>
                        <!-- //배송 정보 -->
                    </li>
                </ul>
            </div>
        </div>
        <hr>
        <div class="footer_b">
            <div class="resp_wrap">
                <ul class="menu2">
                    <li><a href="/" designelement="text" textindex="15"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">HOME</a></li>
                    <li><a href="/service/company" designelement="text" textindex="16"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">COMPANY</a></li>
                    <li><a href="/service/agreement" designelement="text" textindex="17"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">AGREEMENT</a></li>
                    <li class="bold"><a href="/service/privacy" designelement="text" textindex="18"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">PRIVACY POLICY</a></li>
                    <li><a href="/service/guide" designelement="text" textindex="19"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">GUIDE</a></li>
                    <li><a href="/service/partnership" designelement="text" textindex="20"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">PARTNER</a></li>
                    <li class="bold"><a href="http://nisifilters.co.kr/main/index" designelement="text" textindex="21"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">
                            <p style="color:#fcaf15;">NISI FILTERS KOREA</p>
                        </a></li>
                </ul>
                <!-- //회사 링크 -->
            </div>
        </div>
        <hr>
        <div class="footer_c">
            <div class="resp_wrap">
                <ul class="menu3">
                    <li><span designelement="text" textindex="22"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">회사명 :</span> <span
                            class="pcolor">그린샵(주)</span></li>
                    <li><span designelement="text" textindex="23"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">대표자 :</span> <span
                            class="pcolor">이홍섭 </span></li>
                    <li><span designelement="text" textindex="24"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">주소 :</span> <span
                            class="pcolor">서울특별시 서초구 동광로10길 27 그린샵(주)</span></li>
                    <li><span designelement="text" textindex="25"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">전화 :</span> <a
                            href="tel:02-535-6100" class="pcolor">02-535-6100</a></li>
                    <li><span designelement="text" textindex="26"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">팩스 :</span> <span
                            class="pcolor">02-535-6230</span></li>
                    <li><span designelement="text" textindex="27"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">사업자등록번호 :</span> <span
                            class="pcolor">111-82-32270 <a href="javascript:;"
                                onclick="window.open('https://www.ftc.go.kr/bizCommPop.do?wrkr_no=1148637270','communicationViewPopup','width=750,height=700,scrollbars=yes')">[사업자정보확인]</a></span>
                    </li>
                    <li><span designelement="text" textindex="28"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">통신판매업신고번호 :</span> <span
                            class="pcolor">2009-서울서초1176호</span></li>
                    <li><span designelement="text" textindex="29"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">개인정보보호책임자 : </span>이홍섭
                    </li>
                    <li><span designelement="text" textindex="30"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">회사 이메일 : </span><span
                            class="pcolor"><a class="pcolor"
                                href="mailto:green@greenshop.co.kr">green@greenshop.co.kr</a></span></li>
                    <li><span designelement="text" textindex="31"
                            texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">호스팅 제공자 :</span> <span
                            class="pcolor">(주)가비아씨엔에스</span></li>
                </ul>
                <p class="copyright" designelement="text" textindex="32"
                    texttemplatepath="MjAyMDEwMDgvbGF5b3V0X2Zvb3Rlci9zdGFuZGFyZC5odG1s">COPYRIGHT (c) <span
                        class="pcolor">그린샵(주)</span> ALL RIGHTS RESERVED.</p>
                <div class="escrow"></div>
                <!-- //회사 정보 -->
            </div>
        </div>
    </div>
    </div>
</body>

</html>