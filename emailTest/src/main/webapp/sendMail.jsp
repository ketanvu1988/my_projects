<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${emailmsg}
	<div class="container-fluid">
		<form action="sendEmail" method="post">
			<div class="form-group">
				<label> TO </label>
				<input type="text" name="to" class="form-control">
			</div>
		
			<div class="form-group">
				<label> Subject </label>
				<input type="text" name="subject" class="form-control">
			</div>
		
			<div class="form-group">
				<label> Message </label>
				<textarea rows="3" cols="3" class="form-control" name="message"></textarea>
			</div>
			
			<div class="form-group">
				<button class="btn btn-success" type="submit">Send Email</button>
			</div>
		</form>
	</div>
	<div class="row">
		<div class="col-6">
		<input type="file" name="ufile" id="ufile" class="ufile">
		</div>
		<div class="col-6">
		<button onclick="uploadFile()">upload file</button>
		</div>
	
	</div>
	<script>
	function uploadFile()
	{ var formData = new FormData();
	formData.append('file', document.getElementById('ufile').files[0]);
	$.ajax({
		url: "uploadFile",
		data: formData, 
		cache: false,
	    contentType: false,
	    processData: false,
		type:'POST',
		success: function(resp){
			console.log("resp;;;;mona");
		}});
	/* 	$.post('uploadFile',
		{formData},
		function(data, status){
			
		});		 */
		
	}
	</script>
</body>
</html>