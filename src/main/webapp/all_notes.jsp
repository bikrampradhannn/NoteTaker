<%@page import="org.hibernate.query.Query"%>
<!-- Use the updated import for Query -->
<%@page import="org.hibernate.Session"%>
<%@page import="java.util.List"%>
<%@ page import="com.helper.FactoryProvider"%>
<%@ page import="com.entities.Note"%>

<!-- Ensure that Note class is correctly imported -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Notes : NoteTaker</title>
<%@include file='all_js_css.jsp'%>
</head>
<body>

	<div class="container-fluid p-0 m-0">
		<%@include file="navbar.jsp"%>
		<br>
		<h1 class>All Notes :</h1>

		<div class="row">
			<div class="col-12">


				<%
				Session s = FactoryProvider.getFactory().openSession();

				// Use the correct Query interface
				Query<Note> q = s.createQuery("from Note", Note.class);

				List<Note> list = q.list(); // Corrected list assignment

				for (Note note : list) { // Ensure that Note class has getId() and getTitle() methods
				%>

				<div class="card mt-3">
					<img class="card-img-top m-4" style="height: 40px; width: 40px;"
						src="img/notes.png" alt="Card image cap">
					<div class="card-body PX-5">
						<h5 class="card-title"><%=note.getTitle()%></h5>



						<p class="card-text">
							<%=note.getContent()%>
						</p>

						<div class="container text-center mt-4">
							<a href="DeleteServlet?note_id=<%=note.getID()%>"
								class="btn btn-danger">Delete</a> <a
								href="edit.jsp?note_id=<%=note.getID()%>"
								class="btn btn-primary">Update</a>
						</div>
					</div>
				</div>


				<%
				}

				s.close();
				%>










			</div>
		</div>




	</div>
</body>
</html>
