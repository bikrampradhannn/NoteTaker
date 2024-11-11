<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import='com.helper.*,org.hibernate.*,com.entities.*'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>NoteTaker : EditPage</title>
<%@include file="all_js_css.jsp"%>

</head>
<body>
	<div class="container-fluid p-0 m-0">
		<%@include file="navbar.jsp"%>
		<h1>Edit Your Note.</h1>
		<br>
		<%
		int noteId = Integer.parseInt(request.getParameter("note_id").trim());

		Session s = FactoryProvider.getFactory().openSession();
		Transaction tx = s.beginTransaction();
		Note note = (Note) s.get(Note.class, noteId);
		%>

		<form action="UpdateServlet" method="post">

			<input value="<%=note.getID()%>" name="noteId" type="hidden" />


			<div class="form-group">
				<label for="title" class="form-label">Note Title</label> <input
					name="title" required type="text" class="form-control" id="title"
					name="title" placeholder="Enter Here.."
					value="<%=note.getTitle()%>" />
			</div>

			<div class="mb-3">
				<label for="content" class="form-label">Note Content..</label>
				<textarea name="content" required id="content" name="content"
					placeholder="Enter Your Content here" class="form-control"
					style="height: 300px;"><%=note.getContent()%>
					</textarea>
			</div>

			<div class="container text-center">

				<button type="submit" class="btn btn-outline-success">Update
					Note</button>

			</div>
		</form>

	</div>
</body>
</html>