<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Opd Case Paper</title>
<%@include file="Include.jsp"%>
</head>
<body>
	<div class="container">
		<%@include file="Header.jsp"%>
		<br>
		<div align="center">
			<h2>O.P.D Case Paper</h2>
		</div>
		<hr/>
		<div class="row">
			<div class="col-md-2"></div>
			<div class="col-md-5">
				<div class="row">
					<div class="col-md-3">Name :</div>
					<div class="col-md-9">Aaron Smith</div>
				</div>
				<div class="row">
					<div class="col-md-3">Age :</div>
					<div class="col-md-9">27 yrs</div>
				</div>
				<div class="row">
					<div class="col-md-3">Sex :</div>
					<div class="col-md-9">Male</div>
				</div>
				<div class="row">
					<div class="col-md-3">VisitNo :</div>
					<div class="col-md-9">3</div>
				</div>
			</div>
			<div class="col-md-5">
				<div class="row">
					<div class="col-md-3">Address :</div>
					<div class="col-md-9">1 Main Street</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-9">Boston, Massachusetts</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-9">SL1 4DX</div>
				</div>
				<div class="row">
					<div class="col-md-3"></div>
					<div class="col-md-9">Tel.(617) 262-2020</div>
				</div>
			</div>
		</div>
		<hr/>
		<div class="row" align="center">
			<h3>Ocular Examination</h3>
		</div>
		<div class="row">
			<div class="col-md-1"></div>
			<div class="col-md-7">
				<div class="row">
					<div class="col-md-4"></div>
					<div class="col-md-4" align="center">
						<h4>Right Eye</h4>
					</div>
					<div class="col-md-4" align="center">
						<h4>Left Eye</h4>
					</div>
				</div>
				<div class="row">
					<div class="col-md-4" align="right">Vision</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>5/60</option>
						</select>
					</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>6/9P</option>
						</select>
					</div>
				</div>
				<br/>
				<div class="row">
					<div class="col-md-4" align="right">With pin hole</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
				</div>
				<br/>
				<div class="row">
					<div class="col-md-4" align="right">V/A near</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
				</div>
				<br/>
				<div class="row">
					<div class="col-md-4" align="right">IOT</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
				</div>
				<br/>
				<div class="row">
					<div class="col-md-4" align="right">NCT</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>5/60</option>
						</select>
					</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
				</div>
				<br/>
				<div class="row">
					<div class="col-md-4" align="right">SAC</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
				</div>
				<br/>
				<div class="row">
					<div class="col-md-4" align="right">SLE</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
				</div>
				<br/>
				<div class="row">
					<div class="col-md-4" align="right">FUNDUS</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
					<div class="col-md-4">
						<select class="form-control">
							<option>Select</option>
						</select>
					</div>
				</div>
			</div>
		</div>
		<div class="row" align="center">
			<h3>Diagnosis</h3>
		</div>
		<div class="row" align="center">
			<div class="col-md-4"></div>
			<div class="col-md-2">RE</div>
			<div class="col-md-2">LE</div>
		</div>
		<div class="row" align="center">
			<div class="col-md-4"></div>
			<div class="col-md-2">
				<select class="form-control">
					<option>Select</option>
				</select>
			</div>
			<div class="col-md-2">
				<select class="form-control">
					<option>Select</option>
				</select>
			</div>
		</div>
	</div>
</body>
</html>