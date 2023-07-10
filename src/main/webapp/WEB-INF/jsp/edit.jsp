<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@include file ="view/header.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div>
    <h1>게시글 수정</h1>

    <div class="col-md-12">
        <div class="col-md-4">
            <form>
                <div>
                    <input type="hidden" id="id" value="${todo.id}">
                </div>
                <div class="form-group">
                    <label for="title">제목</label>
                    <input type="text" class="form-control" id="title" value="${todo.title}">
                </div>

                <div class="form-group">
                    <label for="content"> 내용 </label>
                    <textarea class="form-control" id="content" value="${todo.content}"></textarea>
                </div>
            </form>
            <button type="button" class="btn btn-primary" id="btn-update"> 수정 </button>
            <a href="/todo"  role="button" class="btn btn-secondary"> 취소 </a>
            <button type="button" class="btn btn-danger" id="btn-delete">삭제</button>
        </div>
    </div>
</div>
<%@include file ="view/footer.jsp" %>