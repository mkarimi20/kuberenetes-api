@Library('jenkins-global-library@feature/kube-slave') _
def common = new JenkinsCommonDockerBuildPipeline()
common.runPipeline()
