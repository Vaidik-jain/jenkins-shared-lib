def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials([usernamePassword(credentialsId: 'DockerHubCred', passwordVariable: 'dockerHubpass', usernameVariable: 'dockerHubuser')]) {
      
      sh "docker login -u ${dockerHubuser} -p ${dockerHubpass}"
       sh "docker push ${dockerHubuser}/${Project}:${ImageTag}"
  }
 
}
