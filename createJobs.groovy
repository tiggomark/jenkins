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