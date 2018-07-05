pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
		bat 'mvn clean package docker:build'
            }
	    post{
		always{
                     withSonarQubeEnv('sonarQube') {
                     // requires SonarQube Scanner for Maven 3.2+
                     bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
                     }
                }
	    }
        }
    	stage('Deploy') {
            steps {
                echo 'Deploying....'
		bat 'docker run -d -p 9999:8080 hello'
            }
    	}
    	stage('Test') {
            steps {
                echo 'Testing..'
		dir("$WORKSPACE/hellocucumber") {
			bat 'mvn test'
		}
	    }
        }
    	stage('Create JIRA') {
	    steps {
                echo 'Creting JIRA....'
		sh './CICDscript.sh -s  -d test -e UAT2 -c WCS'
            }
    	}
    }
}
