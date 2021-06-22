pipeline {
	environment {
		registry = "devaraj1234/microservice-registry"
		registryCredential = 'docker_hub_id'
		dockerImage = ''
	}	
    agent any
    stages {
        stage ('build'){
        	steps {
             	sh 'mvn clean package spring-boot:repackage'
             	}
        	}
        stage('Publish Tests Results'){
      		steps {
          		echo "Publish junit Tests Results"
		  		junit '**/target/surefire-reports/TEST-*.xml'
		  		archive 'target/*.jar'
        	}
    	}
    	stage('Building image') {
			steps{
			script {
				dockerImage = docker build -t registry+ ":$BUILD_NUMBER"
			}
		}
	}
    
    
    }
}