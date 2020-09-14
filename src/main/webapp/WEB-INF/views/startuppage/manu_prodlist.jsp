<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
 <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />


<%
  request.setCharacterEncoding("UTF-8");
%>    


<html>
<head>
<meta charset=UTF-8">
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Lora:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700&display=swap" rel="stylesheet">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

    <link rel="stylesheet" href="${contextPath}/resources/css/animate.css">
    
    <link rel="stylesheet" href="${contextPath}/resources/css/owl.carousel.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/owl.theme.default.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/magnific-popup.css">
    <style>
        .table{
            margin-top: 20px;
            margin-bottom: -30px;
            text-align: center;
        }
        body > div.row.mt-5 > div > div > ul{
            margin-bottom: 150px;
        }
        #thead-c{
            background-color:#95adbe;
            
            color: white;
        }
        body > div > a{
           float : right;
        }
        .container{
         margin-bottom: 80px;
        }
        
    </style>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-select/1.13.1/css/bootstrap-select.min.css">
    
    <link rel="stylesheet" href="${contextPath}/resources/css/flaticon.css">
    <link rel="stylesheet" href="${contextPath}/resources/css/style.css">
    
<title>스타트업 페이지 제조업체 제조 현황</title>
</head>

<body>
   
   <div class="container">
   <h3>대기중</h3>
      <table class="table">
          <thead id="thead-c">
            <tr>        
                <th>제조업체명</th>
                <th>발주 신청 날짜</th>
                <th></th>
            </tr>
          </thead>

       <tbody>
          <c:forEach var="manu_prod" begin="0" end="2" items="${prodlist}" >     
               <tr align="center">
               <c:if test = "${manu_prod.orderstatus==0}">
               <td>${manu_prod.manuname}</td>
               <td><fmt:formatDate value="${manu_prod.reqorder}" pattern="yy-MM-dd  kk:MM"/></td>
               <td><button type="button" class="btn btn-outline-secondary">철회</button></td>
               </c:if>
          </tr>
        </c:forEach>   
   </table>
   <a href = "#">더보기</a>
</div>
 
  <div class="container">
   <h3>진행중인 발주</h3>
      <table class="table">
          <thead id="thead-c">
            <tr>        
                <th>제조업체명</th>
                <th>발주 신청 날짜</th>
                <th></th>
            </tr>
          </thead>

       <tbody>
          <c:forEach var="manu_prod" begin="0" end="2" items="${prodlist}" >     
               <tr align="center">
               <c:if test = "${manu_prod.orderstatus==1}">
               <td>${manu_prod.manuname}</td>
               <td><fmt:formatDate value="${manu_prod.reqorder}" pattern="yy-MM-dd  kk:MM"/></td>
               <td><button type="button" class="btn btn-outline-secondary">철회</button></td>
               </c:if>
          </tr>
        </c:forEach>   
   </table>
   <a href = "#">더보기</a>
</div>
 <div class="container">
   <h3>제작완료</h3>
      <table class="table">
          <thead id="thead-c">
            <tr>        
                <th>제조업체명</th>
                <th>발주 신청 날짜</th>
                <th></th>
            </tr>
          </thead>

       <tbody>
          <c:forEach var="manu_prod" begin="0" end="2" items="${prodlist}" >     
               <tr align="center">
               <c:if test = "${manu_prod.orderstatus==2}">
               <td>${manu_prod.manuname}</td>
               <td><fmt:formatDate value="${manu_prod.reqorder}" pattern="yy-MM-dd  kk:MM"/></td>
               <td><button type="button" class="btn btn-outline-secondary">철회</button></td>
               </c:if>
          </tr>
        </c:forEach>   
   </table>
   <a href = "#">더보기</a>
</div>


 <div class="container">
   <h3>배송진행 중</h3>
      <table class="table">
          <thead id="thead-c">
            <tr>        
                <th>제조업체명</th>
                <th>발주 신청 날짜</th>
                <th></th>
            </tr>
          </thead>

       <tbody>
          <c:forEach var="manu_prod" begin="0" end="2" items="${prodlist}" >     
               <tr align="center">
               <c:if test = "${manu_prod.orderstatus==3}">
               <td>${manu_prod.manuname}</td>
               <td><fmt:formatDate value="${manu_prod.reqorder}" pattern="yy-MM-dd  kk:MM"/></td>
               <td><button type="button" class="btn btn-outline-secondary">철회</button></td>
               </c:if>
          </tr>
        </c:forEach>   
   </table>
   <a href = "#">더보기</a>
</div>
 <div class="container">
   <h3>거절된 발주</h3>
      <table class="table">
          <thead id="thead-c">
            <tr>        
                <th>제조업체명</th>
                <th>발주 신청 날짜</th>
                <th></th>
            </tr>
          </thead>

       <tbody>
          <c:forEach var="manu_prod" begin="0" end="2" items="${prodlist}" >     
               <tr align="center">
               <c:if test = "${manu_prod.orderstatus==5}">
               <td>${manu_prod.manuname}</td>
               <td><fmt:formatDate value="${manu_prod.reqorder}" pattern="yy-MM-dd  kk:MM"/></td>
               <td><button type="button" class="btn btn-outline-secondary">삭제</button></td>
               </c:if>
          </tr>
        </c:forEach>   
   </table>
   <a href = "#">더보기</a>
</div>

     <script src="${contextPath}/resources/js/jquery.min.js"></script>
       <script src="${contextPath}/resources/js/jquery-migrate-3.0.1.min.js"></script>
       <script src="${contextPath}/resources/js/popper.min.js"></script>
     <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
     <script src="${contextPath}/resources/js/jquery.easing.1.3.js"></script>
     <script src="${contextPath}/resources/js/jquery.waypoints.min.js"></script>
     <script src="${contextPath}/resources/js/jquery.stellar.min.js"></script>
     <script src="${contextPath}/resources/js/owl.carousel.min.js"></script>
     <script src="${contextPath}/resources/js/jquery.magnific-popup.min.js"></script>
     <script src="${contextPath}/resources/js/jquery.animateNumber.min.js"></script>
     <script src="${contextPath}/resources/js/scrollax.min.js"></script>
     <script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false"></script>
     <script src="${contextPath}/resources/js/google-map.js"></script>
     <script src="${contextPath}/resources/js/main.js"></script>
</body>
</html>