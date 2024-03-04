pipeline {
    agent any
    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-21'
        MAVEN_HOME = 'C:\\Program Files\\apache-maven-3.8.8-bin\\apache-maven-3.8.8'
    }
    
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/veikkope/FarToCel.git'
            }
        }
        
        stage('Build') {
            steps {
                withMaven(maven: 'Maven') {
                    bat 'mvn clean install'
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
