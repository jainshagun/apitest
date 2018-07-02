pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
<<<<<<< HEAD
		bat 'cd githubproject'
=======
>>>>>>> e34a15e858771873b39786efdb722c77d5919733
		bat 'mvn package'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
		bat 'java -cp target/my-app-1.0-SNAPSHOT.jar com.mycompany.app.App '
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
}
