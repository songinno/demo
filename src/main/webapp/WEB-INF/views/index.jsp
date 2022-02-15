<%@ page contentType="text/html; charset=UTF-8" language="java" %> <%@ taglib
prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> <%@ taglib prefix="fmt"
uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

    <style>
        .wrap {
            padding-top: 100px;
            background: rgb(177, 232, 241);
            height: 300px;
        }
        .wrap h1.init1 {
            color: rgb(255, 110, 110);
            width: 50%;
            margin: 0 auto;
            /* border: 1px solid #000; */
            text-align: center;
        }

        .wrap h1.init2 {
            color: rgb(255, 0, 0);
            width: 50%;
            margin: 70px auto;
            /* border: 1px solid #000; */
            text-align: center;
            font-size: 80px;
        }

        .wrap .img-box {
          width: 10%;
          margin: 30px auto 0;
        }
        .wrap .img-box img {
          width: 100%;
        }

        .wrap #direction {
          font-size: 30px;
          position: relative;
          left: 30%;
          color: blue;
          
          bottom: 70px;
        }

        .final {
          display: none;
        }
    </style>
</head>
<body>
    <div class="wrap">
        <h1 class="init1">♥ 김 해 인 ♥</h1>
        
        <div class="img-box">
            <img src="/img/hi.jpg" alt="loveu">
        </div>

        <span id="direction">click! ===></span>

        <h1 class="final">♥ I LOVE U ♥</h1>
    </div>
</body>

<script>
  const $img = document.querySelector('img');
  console.log($img);

  $img.addEventListener('click', function(e) {
    const $final = document.querySelector('.final');
    $final.classList.replace('final', 'init2');
  });
  
  

</script>
</html>
