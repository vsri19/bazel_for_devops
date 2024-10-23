pipeline {
  agent any
  stages {
    stage('verify bazel is installed') {
      steps {
        sh 'bazel version'
      }
    }
    stage('Build the project') {
      steps {
        sh 'bazel build //...'
      }
    }
  }
}
