pipeline {
	agent any
	stages {
		stage('Entering') {
			steps {
				echo 'Hi, this is Disruptive Events team from IBM'
			}
		}

		stage('Permission') {
			steps {
				input('Do you want to proceed?')
			}
		}

		stage('Build') {
            steps {
                bat './gradlew build'
            }
        }

        stage('SonarQube') {
                    steps {
//                     script {
//                         def scannerHome = tool 'SonarQubeScanner1'
//                         withSonarQubeEnv('SonarQube') {
//                             sh "${scannerHome}/bin/sonar-scanner"
//                         }
//                         }

                        bat './gradlew sonarqube -Dsonar.host.url=http://localhost:9000 -Dsonar.analysis.mode=publish'
                    }
        }

        stage('Test') {
            steps {
                bat './gradlew test'
            }
        }

        stage('Check') {
            steps {
                bat './gradlew check'
            }
        }

		stage('Exiting') {
			steps {
				echo 'Finished'
			}
		}
	}

	 // Post can be used both on individual stages and for the entire build.
            post {

                always {
                            // Let's wipe out the workspace before we finish!

                    echo "Pipeline run ended..."
                }
                success {
                    echo "Pipeline run completed successfully."

                }
                failure {
                    echo "Pipeline run failed."

                }

        }


}