@Library('CommonLib@feature/kube-slave') _
def common = new com.lib.JenkinsCommonDockerBuildPipeline()
common.runPipeline()

##this is calling the builder pipline
