//Jenkins first pipeline SCM
pipeline{


  agent any

  stages{
          stage("Build"){
            steps{
              echo "Build Process..."
            }
          }

          stage("Test"){
            steps{
              echo "Test Process..."
            }
          }

          stage("Deploy"){
            steps{
              echo "Deploy Process..."
            }
          }
}

}
