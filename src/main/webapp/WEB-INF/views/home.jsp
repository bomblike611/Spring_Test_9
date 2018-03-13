<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<!-- 	<a href="notice/noticeWrite?id=iu">글쓰기</a> -->
	<a href="ajax/view">View</a>
	<a href="board/notice/1">Notice</a>
	<a href="board/qna/2">Qna</a>
</body>
</html>
