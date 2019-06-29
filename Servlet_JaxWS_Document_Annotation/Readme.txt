/**
	To generate Style.Document Webservice related files use below steps.
	
	Step1:
		|- Go to "target/classes/" folder in command prompt on this project
	Step2: 
		|- type "wsgen -verbose -keep -cp . com.webservice.jaxws.service.PersonServiceImpl"	 
	Step3:
		|- now you can see few files got generated under "./com/webservice/jaxws/service" folder
	Step4:
		|- Copy those files under "./src/main/java/com/webservice/jaxws/service/jaxws" folder
	Step5:
		|- Start the server.			



	Note:
		-verbose - show additional information

		-keep - don't remove generated stuff
		
		-cp . -classpatch is in current location


**/