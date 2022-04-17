pipeline {
	agent any
	stages {
		stage('One') {
			steps {
				echo 'Hi, this is Disruptive Events team from IBM'
			}
		}

		stage('Two') {
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

		stage('Five') {
			steps {
				echo 'Finished'
			}
		}
	}
}