<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AddNotes</title>
<%@include file="all_js_css.jsp"%>
</head>
<body>

	<div class="container-fluid p-0 m-0">
		<%@include file="navbar.jsp"%>
		<br>
		<h1>Add your Notes Here...</h1>
		<br>

		<!-- This is ADD-FORM -->
		<form action="saveNoteServlet" method="post">
			<div class="form-group">
				<label for="title" class="form-label">Note Title</label> <input
					name="title" required type="text" class="form-control" id="title"
					name="title" placeholder="Enter Here.." />
			</div>

			<div class="mb-3">
				<label for="content" class="form-label">Note Content..</label>
				<textarea name="content" required id="content" name="content"
					placeholder="Enter Your Content here" class="form-control"
					style="height: 300px;"></textarea>
			</div>

			<div class="container text-center">

				<button type="submit" class="btn btn-outline-success">Add
					Note</button>
					
			</div>
		</form>
	</div>

</body>
</html>
