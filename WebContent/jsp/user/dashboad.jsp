<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
	<div class="container">
		<h2>Equal-width</h2>
		<div class="row">
		    <div class="col">
		      	<div class="alert alert-primary" role="alert">
				  	A simple primary alert—check it out!
				</div>
		    </div>
		    <div class="col">
		      	<div class="alert alert-secondary" role="alert">
					A simple secondary alert—check it out!
				</div>
		    </div>
		</div>
		<div class="row">
		    <div class="col">
		      	<div class="alert alert-primary" role="alert">
				  	A simple primary alert—check it out!
				</div>
		    </div>
		    <div class="col">
		      	<div class="alert alert-secondary" role="alert">
					A simple secondary alert—check it out!
				</div>
		    </div>
		    <div class="col">
		      	<div class="alert alert-success" role="alert">
				  A simple success alert—check it out!
				</div>
		    </div>
		</div>
	</div>
	
	<div class="container">
		<h2>Setting one column width</h2>
	  <div class="row">
	    <div class="col">
	      	<div class="alert alert-danger" role="alert">
			  A simple danger alert—check it out!
			</div>
	    </div>
	    <div class="col-6">
	      	<div class="alert alert-warning" role="alert">
			  A simple warning alert—check it out!
			</div>
	    </div>
	    <div class="col">
	      	<div class="alert alert-info" role="alert">
			  A simple info alert—check it out!
			</div>
	    </div>
	  </div>
	  <div class="row">
	    <div class="col">
	      	<div class="alert alert-warning" role="alert">
			  A simple light alert—check it out!
			</div>
	    </div>
	    <div class="col-5">
	      	<div class="alert alert-dark" role="alert">
			  A simple dark alert—check it out!
			</div>
	    </div>
	    <div class="col">
	      	<div class="alert alert-primary" role="alert">
			  A simple primary alert—check it out!
			</div>
	    </div>
	  </div>
	</div>
	
	<div class="container">
		<h2>Variable width content</h2>
	  <div class="row justify-content-md-center">
	    <div class="col col-lg-2">
	      	<div class="alert alert-warning" role="alert">
			  A simple light alert—check it out!
			</div>
	    </div>
	    <div class="col-md-auto">
	      	<div class="alert alert-danger" role="alert">
			  A simple danger alert—check it out!
			</div>
	    </div>
	    <div class="col col-lg-2">
	      <div class="alert alert-info" role="alert">
			  A simple info alert—check it out!
			</div>
	    </div>
	  </div>
	  <div class="row">
	    <div class="col">
	      	<div class="alert alert-secondary" role="alert">
				A simple secondary alert—check it out!
			</div>
	    </div>
	    <div class="col-md-auto">
	      	<div class="alert alert-danger" role="alert">
			  A simple danger alert—check it out!
			</div>
	    </div>
	    <div class="col col-lg-2">
	      	<div class="alert alert-info" role="alert">
			  A simple info alert—check it out!
			</div>
	    </div>
	  </div>
	</div>
</body>
</html>