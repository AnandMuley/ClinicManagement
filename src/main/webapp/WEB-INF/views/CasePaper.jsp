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
		<form action="opdpaper/save" method="post">
			<input type="hidden" name="id" value="${patient.id}"/>
			<div class="row">
				<div class="col-md-2"></div>
				<div class="col-md-5">
					<div class="row">
						<div class="col-md-3">Name :</div>
						<div class="col-md-9">${patient.name}</div>
					</div>
					<div class="row">
						<div class="col-md-3">Age :</div>
						<div class="col-md-9">${patient.age} yrs</div>
					</div>
					<div class="row">
						<div class="col-md-3">Sex :</div>
						<div class="col-md-9">${patient.sex}</div>
					</div>
					<div class="row">
						<div class="col-md-3">VisitNo :</div>
						<div class="col-md-9">3</div>
					</div>
				</div>
				<div class="col-md-5">
					<div class="row">
						<div class="col-md-3">Address :</div>
						<div class="col-md-9">${patient.address}</div>
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
							<h4>Left Eye</h4>
						</div>
						<div class="col-md-4" align="center">
							<h4>Right Eye</h4>
						</div>
					</div>
					<div class="row">
						<div class="col-md-4" align="right">Vision</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[0].vision"/>
						</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[1].vision"/>
						</div>
					</div>
					<br/>
					<div class="row">
						<div class="col-md-4" align="right">With pin hole</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[0].pinHole"/>
						</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[1].pinHole"/>
						</div>
					</div>
					<br/>
					<div class="row">
						<div class="col-md-4" align="right">V/A near</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[0].vaNear"/>
						</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[1].vaNear"/>
						</div>
					</div>
					<br/>
					<div class="row">
						<div class="col-md-4" align="right">IOT</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[0].iot"/>
						</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[1].iot"/>
						</div>
					</div>
					<br/>
					<div class="row">
						<div class="col-md-4" align="right">NCT</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[0].nct"/>
						</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[1].nct"/>
						</div>
					</div>
					<br/>
					<div class="row">
						<div class="col-md-4" align="right">SAC</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[0].sac"/>
						</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[1].sac"/>
						</div>
					</div>
					<br/>
					<div class="row">
						<div class="col-md-4" align="right">SLE</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[0].sle"/>
						</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[1].sle"/>
						</div>
					</div>
					<br/>
					<div class="row">
						<div class="col-md-4" align="right">FUNDUS</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[0].fundus"/>
						</div>
						<div class="col-md-4">
							<input class="form-control input-lg" name="opdCasePaperDtos[1].fundus"/>
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
					<input class="form-control input-lg" name="opdCasePaperDtos[0].diagnosis"/>
				</div>
				<div class="col-md-2">
					<input class="form-control input-lg" name="opdCasePaperDtos[1].diagnosis"/>
				</div>
			</div>
			<br/>
			<div class="row" align="center">
				<div class="col-md-4"></div>
				<div class="col-md-4">
					<button class="btn btn-md btn-primary" type="submit">SAVE</button>
				</div>
			</div>
		</form>
	</div>
</body>
</html>