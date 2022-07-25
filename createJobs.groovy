CLUSTER_COMMON_FOLDER = "CLUSTER-COMMON"

folder("$CLUSTER_COMMON_FOLDER") {
    description('Pasta com todos os jobs comuns do cluster')
}
pipelineJob("$CLUSTER_COMMON_FOLDER/config-app-deploy") {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/tiggomark/app-config-server.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob("$CLUSTER_COMMON_FOLDER/api-gateway-app-deploy") {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/tiggomark/api-gateway-app.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob("$CLUSTER_COMMON_FOLDER/eureka-server-app-deploy") {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/tiggomark/eureka-server-app.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob("$CLUSTER_COMMON_FOLDER/database-app-deploy") {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/tiggomark/database-app.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}


pipelineJob('infra-up') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials 'github'
                        url 'https://github.com/tiggomark/infra-jobs.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}



pipelineJob('customer-app-deploy') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        credentials 'github'
                        url 'https://github.com/tiggomark/customer-app.git'
                    }
                    branch 'master'
                }
            }

        }
        scriptPath("jenkisTest")
    }
}





