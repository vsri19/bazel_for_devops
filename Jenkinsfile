pipeline {
  agent any
  stages {
    stage('verify bazel is installed') {
      steps {
        bat 'bazel version'
      }
    }
    stage('Build the project') {
      steps {
        bat 'bazel build //...'
      }
    }
  }
}
