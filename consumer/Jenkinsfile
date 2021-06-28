node{
      
    echo "checkout code from github account"
      
   stage 'checkout'
         
   checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '8f78f1e6-e341-429d-b77e-86d25ec06159', url: 'https://github.com/ganeshm681/proc-proj.git']]])
echo "build completed"

}
