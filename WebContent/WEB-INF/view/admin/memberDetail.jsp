<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
<jsp:include page="../common/head.jsp"/>
<body>
	<div id="wrapper">
		<div id="header">
			<jsp:include page="../common/title_box.jsp"/>
			<jsp:include page="menu_box.jsp"/>
		</div> 
		<div id="mypage_content_box">
			<table>
			<colgroup>
			<col style="width: 15%">
			<col style="width: 15%">
			<col style="width: 70%">
			</colgroup>
			  <tr>
			    <th colspan="3">
			    	<p>WELCOM ADMIN HOMEPAGE</p>
			    	<p> 현재 회원수 : <mark><%-- ${count} --%></mark>명</p>
			    </th>
			  </tr>
			  <tr>
			    <td colspan="2">이미지</td>
			    <td rowspan="2" style="text-align: center;">
					<img src="resources/img/home/test.jpg" alt="이미지">
				</td>
			  </tr>
			  <tr>
			    <td>
			    	<ul id="mypage_info_list">
						<li>아이디 : <br/></li>
						<li>비밀번호 : <br/></li>
						<li>이름 : <br/></li>
						<li>주민등록번호 : <br/></li>
						<li>성별 : <br/></li>
						<li>나이 : <br/></li>
						<li>팀명 : <br/></li>
						<li>역할 : <br/></li>
						<li>과목 : <br/></li>
					</ul>
				</td>
			    <td>
					<ul id="mypage_info_list">
						<li>${id.memId}<br/></li>
						<li>**** <br/></li>
						<li>${id.name}<br/></li>
						<li>${id.ssn}<br/></li>
						<li>${id.gender}<br/></li>
						<li>${id.age}<br/></li>
						<li>${id.teamId}<br/></li>
						<li>${id.roll}<br/></li>
						<li>${id.subject}<br/></li>
					</ul>
				</td>
			  </tr>
			</table>
		</div>
		<div id="footer">
			<jsp:include page="../common/footer_box.jsp"/>
		</div>
	</div>
	<script>

	</script>
</body>
</html>