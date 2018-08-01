<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">
<jsp:include page="../common/head.jsp"/>
<body>
	<div id="wrapper">
		<div id="header">
			<jsp:include page="../common/title_box.jsp"/>
			<jsp:include page="../admin/menu_box.jsp"/>
		</div> 
		<div id="content">
			<form id="search_id_form_box">
				<p>아이디 : 
					<input type="text" name="search_id"/>
					<button id="search_id_form_but" type="button">검색</button>
				</p>
			</form>
		</div>
		<div id="footer">
			<jsp:include page="../common/footer_box.jsp"/>
		</div>
	</div>
	<script>
		document.getElementById('search_id_form_but').addEventListener('click', function(){
			var form = document.getElementById('search_id_form_box');
			var arr = [{type : 'hidden', name : 'action', value : 'retrive'},
						{type : 'hidden', name : 'page', value : 'search_id_result'}];
			
			form.action = '${context}/member.do';
			form.method = 'get';
			
			
			for(var i=0; i<2; i++){
				var node = document.createElement('input');
				node.setAttribute('type', arr[i].type);
				node.setAttribute('name', arr[i].name);
				node.setAttribute('value', arr[i].value);
				form.appendChild(node);
			}
			
			form.submit();
		});
	</script>
</body>
</html>