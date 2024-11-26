pipeline {
    agent any

    environment {
        EC2_USER = 'ec2-user'
        EC2_HOST = 'ec2-3-84-14-179.compute-1.amazonaws.com'
        PEM_FILE_PATH = 'C:/Users/Anuj/Downloads/SDA.pem'
        JAR_NAME = 'devops-0.0.1-SNAPSHOT.jar'
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/anujshrivastava1/SDA_StudentManagement.git'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Deploy') {
            steps {
                script {
                    // Copy JAR to EC2
                    bat """
                        "C:/Program Files/Git/usr/bin/scp" -o StrictHostKeyChecking=no -i "${PEM_FILE_PATH}" target/${JAR_NAME} ${EC2_USER}@${EC2_HOST}:/home/ec2-user/
                    """
                    
                    // Start the JAR in the background
                    bat """
                        "C:/Program Files/Git/usr/bin/ssh" -o StrictHostKeyChecking=no -i "${PEM_FILE_PATH}" ${EC2_USER}@${EC2_HOST} "nohup java -jar /home/ec2-user/${JAR_NAME} > /home/ec2-user/app.log 2>&1 &"
                    """
                    
                    // Optional: Verify the application is running
                    bat """
                        "C:/Program Files/Git/usr/bin/ssh" -o StrictHostKeyChecking=no -i "${PEM_FILE_PATH}" ${EC2_USER}@${EC2_HOST} "curl -f http://localhost:9988/devops || exit 1"
                    """
                }
            }
        }
    }

    post {
        success {
            echo 'Pipeline execution succeeded!'
        }
        failure {
            echo 'Pipeline execution failed!'
        }
    }
}
