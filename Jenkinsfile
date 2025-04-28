pipeline {
    agent any

    tools {
        jdk 'JDK'          // Matches the name you configured
        maven 'Maven'      // Matches the name you configured
    }

    environment {
        // No deployment needed here since your app is console-based
    }

    stages {
        stage('Checkout Code') {
            steps {
                git branch: 'master', url: 'https://github.com/imsudeeppatil/guavamaven.git'
            }
        }

        stage('Build Project') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Run Application') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }

    post {
        success {
            echo 'Build and execution successful!'
        }
        failure {
            echo 'Something went wrong!'
        }
    }
}
