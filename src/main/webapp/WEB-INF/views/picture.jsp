<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    <div class="smenu" id="smenu_1">
                        <div class="item_list">
                        <c:forEach var="boardMap" items="${homepage}">
						    <div class="card">
                                <div class="img">
                                    <a href="#"><img src="${boardMap.url}"></a>
                                </div>
                                <div class='text'>
                                    <h2><c:out value="${boardMap.title}" /></h2>
                                    <p><c:out value="${boardMap.subtitle}" /></p>
                                </div>
                            </div>
						
						</c:forEach>
                        </div>
                    </div>

                    <div class="smenu" id="smenu_2">
                        <div class="item_list">
                        <c:forEach var="boardMap" items="${shop}">
						    <div class="card">
                                <div class="img">
                                    <a href="#"><img src="${boardMap.url}"></a>
                                </div>
                                <div class='text'>
                                    <h2><c:out value="${boardMap.title}" /></h2>
                                    <p><c:out value="${boardMap.subtitle}" /></p>
                                </div>
                            </div>
						
						</c:forEach>
                        </div>
                    </div>

                    <div class="smenu" id="smenu_3">
                        <div class="item_list">
                        <c:forEach var="boardMap" items="${design}">
						    <div class="card">
                                <div class="img">
                                    <a href="#"><img src="${boardMap.url}"></a>
                                </div>
                                <div class='text'>
                                    <h2><c:out value="${boardMap.title}" /></h2>
                                    <p><c:out value="${boardMap.subtitle}" /></p>
                                </div>
                            </div>
						
						</c:forEach>
                        </div>
                    </div>

                    <div class="smenu" id="smenu_4">
                        <div class="item_list">
                        <c:forEach var="boardMap" items="${web}">
						    <div class="card">
                                <div class="img">
                                    <a href="#"><img src="${boardMap.url}"></a>
                                </div>
                                <div class='text'>
                                    <h2><c:out value="${boardMap.title}" /></h2>
                                    <p><c:out value="${boardMap.subtitle}" /></p>
                                </div>
                            </div>
						
						</c:forEach>
                        </div>
                    </div>