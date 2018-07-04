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
		bat 'docker run -d -p 9999:8090 hello'
            }
    }
        stage('Test') {
            steps {
                echo 'Testing..'
	    }
        }
    }
}
