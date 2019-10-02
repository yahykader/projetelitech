pipeline{
  agent any  
    stages{
       stage('Build lot2 '){
         steps{ 
            sh 'C:/ProgramData/chocolatey/lib/maven/apache-maven-3.6.1/bin/mvn verify'
         }}
       stage('Test lot2'){
         steps{ 
            sh 'C:/ProgramData/chocolatey/lib/maven/apache-maven-3.6.1/bin/mvn test'
         }}  
    }
}
