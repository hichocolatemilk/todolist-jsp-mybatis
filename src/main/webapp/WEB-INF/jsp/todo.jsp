<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file ="view/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="board-button">
    <a href="/todo/post">
            <button type="button" class="btn btn-primary">게시글 쓰기</button>
    </a>
</div>
<div class="con">
    <c:forEach items="${todos}" var="todo">
        <section>
            <a href="/todo/${todo.id}">
                번호 :${todo.id}
            </a>
            제목:${todo.title}
        </section>
        <hr>
    </c:forEach>
</div>

<%@include file ="view/footer.jsp" %>