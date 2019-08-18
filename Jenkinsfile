pipeline{
  agent any  
    stages{
       stage('Build Develop '){
         steps{ 
            sh 'C:/ProgramData/chocolatey/lib/maven/apache-maven-3.6.1/bin/mvn verify'
         }}
       stage('Test Develop'){
         steps{ 
            sh 'C:/ProgramData/chocolatey/lib/maven/apache-maven-3.6.1/bin/mvn test'
         }}  
    }
}
