<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>findPw</title>
    <link href="https://fonts.googleapis.com/css2?family=Overpass:ital,wght@0,100;0,200;0,300;0,400;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="../css/simplebar.css">
    <link rel="stylesheet" href="../css/feather.css">
    <link rel="stylesheet" href="../css/daterangepicker.css">
    <link rel="stylesheet" href="../css/app-light.css" id="lightTheme">
  </head>
  <style>
    .phoneNum{display: flex; justify-content: space-between;}
    .phoneNum #phone1{width: 25%; }
    .phoneNum #phone1::placeholder {font-size: 10px; text-align: center;}
    .phoneNum #phone2::placeholder {font-size: 10px; text-align: center;}
    .phoneNum #phone3::placeholder {font-size: 10px; text-align: center;}
    .phoneNum #phone2{width: 35%; }
    .phoneNum #phone3{width: 35%; }
  </style>
  <body class="light">
    <div class="wrapper vh-100">
      <div class="row align-items-center h-100">
        <form class="col-lg-3 col-md-4 col-10 mx-auto text-center" name="i_frm" method="post" action="main.jsp?pages=../user_log/findPwResult">
          <a class="navbar-brand mx-auto mt-2 flex-fill text-center" href="./index.html">
            <svg version="1.1" id="logo" class="navbar-brand-img brand-md" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" viewBox="0 0 120 120" xml:space="preserve">
              <g>
                <polygon class="st0" points="78,105 15,105 24,87 87,87 	" />
                <polygon class="st0" points="96,69 33,69 42,51 105,51 	" />
                <polygon class="st0" points="78,33 15,33 24,15 87,15 	" />
              </g>
            </svg>
          </a>
          <h1 class="h6 mb-3">Find Password</h1>
          <div class="form-group">
            <label for="inputID" class="sr-only">ID</label>
            <input type="text" id="inputID" class="form-control form-control-lg" placeholder="ID" required="" autofocus="" name="id">
          </div>
          <div class="form-group">
            <label for="inputEmail" class="sr-only">Name</label>
            <input type="text" id="inputName" class="form-control form-control-lg" placeholder="Name" required="" autofocus="" name="name">
          </div>
          <div class="form-group">
            <label for="inputEmail" class="sr-only">Email address</label>
            <input type="text" id="inputEmail" class="form-control form-control-lg" placeholder="Email address" required="" autofocus="" name="email">
          </div>
          <button class="btn btn-lg btn-primary btn-block" type="submit">이메일 인증번호 발급(추후 예정)</button>
          <button class="btn btn-lg btn-primary btn-block" type="submit">임시 비밀번호 발급</button>
          <p class="mt-5 mb-3 text-muted">© 2022</p>
        </form>
      </div>
    </div>
    <script src="../js/jquery.min.js"></script>
    <script src="../js/popper.min.js"></script>
    <script src="../js/moment.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
    <script src="../js/simplebar.min.js"></script>
    <script src='../js/daterangepicker.js'></script>
    <script src='../js/jquery.stickOnScroll.js'></script>
    <script src="../js/tinycolor-min.js"></script>
    <script src="../js/config.js"></script>
    <script src="../js/apps.js"></script>
    <script async src="https://www.googletagmanager.com/gtag/js?id=UA-56159088-1"></script>
    <script>
      window.dataLayer = window.dataLayer || [];

      function gtag()
      {
        dataLayer.push(arguments);
      }
      gtag('js', new Date());
      gtag('config', 'UA-56159088-1');
    </script>
  </body>
</html>
</body>
</html>