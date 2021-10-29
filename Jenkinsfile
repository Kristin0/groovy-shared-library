@Library('groovy-shared-library@main') 
// src/example/first ***
import io.example.first.*
info 'Kris'
info()
info.info "Info"
info.debug "Debug"


pipeline {
    agent any
    stages {
        stage('Chekout') {
            steps   {
                script {
                    def repo = new Chekout()
                    repo.chekOutFrom 'aws-rds-java'
                }
            }
        }

        stage('Build') {
            steps {
                
                echo "Test Person class"
                script {
                    def person = new Person('Kris', 100)
                    echo person.personAbout()
                }
                
            }
        }

        stage('Test')
            {
                steps {
                    script {
                        info.info "Info"
                        info.debug "Debug"
                    }
                }
            }

        stage('Scrpit to workspace')    {
            steps {
                script  {
                    def script_content = libraryResource resource: "org/scripts/script.sh"
                    writeFile file: "./script.sh", text: script_content
                    sh 'bash ./script.sh'
                }
            }

        }

        }
    
}
