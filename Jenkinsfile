pipeline {
    agent any
    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-21'
    }
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/veikkope/FarToCel.git'
            }
        }
        
        stage('Build') {
            steps {
                withMaven(maven: 'Maven3') {
                    sh 'mvn clean install'
                }
            }
        }
    }
    
    post {
        always {
            cleanWs()
        }
    }
}
