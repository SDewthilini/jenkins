pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                echo 'Hello World'
                sh 'mkdir -p /mnt/c/Users/ASUS/devops/new_file'
                sh 'python3 hello_world.py'
            }
        }
    }
}