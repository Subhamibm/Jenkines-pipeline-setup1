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
}