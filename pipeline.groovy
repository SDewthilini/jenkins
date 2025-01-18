pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                sh '/mnt/c/Users/ASUS/devops'
            }
        }
    }
}