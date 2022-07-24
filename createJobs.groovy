
pipelineJob('config-app-deploy') {
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

pipelineJob('api-gateway-app-deploy') {
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

pipelineJob('eureka-server-app-deploy') {
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
    }
}

pipelineJob('database-app-deploy') {
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



