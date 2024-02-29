pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "maven"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/khangar-harish/cicd-demo']])

                // Run Maven on a Unix agent.
                sh "mvn clean install"

            }

        }
        stage('Docker image') {
            steps {
                script{
                    sh 'docker build -t khanhash1992/cicd-demo .'
                }
            }

        }
        stage('Push image') {
            steps {
                script{
                    withCredentials([string(credentialsId: 'DockeHub', variable: 'dockerpwd')]) {
                        sh 'docker login -u khanhash1992 -p ${dockerpwd}'
                    }
                    sh 'docker push khanhash1992/cicd-demo'
                }
            }

        }
    }
}
