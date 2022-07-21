

pipelineJob('customer-app-deploy') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/tiggomark/customer-app.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob('pipelineJobXXX') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}

pipelineJob('pipelineJob 2') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob2.groovy'))
            sandbox()
        }
    }
}

