pipeline{
  agent any
    stages{
    stage('Hello World'){
      steps{
        script{
        echo 'Running Hello world'
          sh 'javac HelloWorld.java && java HelloWorld'
          }
    }
  }
stage('Hello Wipro'){
  steps{
    script{
    echo 'Running HEllo wipro'
      sh 'javac HelloWipro.java && java HelloWipro'
      }
}
}
stage('Hello Jenkins'){
  steps{
    script{
    echo 'Running Hello Jenkins'
      sh 'javac HelloJenkins.java && java HelloJenkins'
      }
}
}
