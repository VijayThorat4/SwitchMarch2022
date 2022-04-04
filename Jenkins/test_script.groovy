def fun1 (){
    python Jenkins/helper.py
}



pipeline {
    agent any
    
    parameters{
        string(name: 'PERSON', defaultValue: 'Mr Kohli')
    }
    
    stages {
        stage('Build') {
            steps {
                echo "Clonning the Build ISO for"
            }
        }
        stage('Deploy'){
            steps{
                echo "Code Deployed & informed to "
            }
        }
        stage('Release'){
            steps{
                echo 'Product ready to release'
                fun1()
            }
        }        
    }
}
