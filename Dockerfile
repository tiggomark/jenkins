FROM jenkins/jenkins:latest-jdk11

USER root
RUN curl -sSL https://get.docker.com/ | sh
USER jenkins
COPY --chown=jenkins:jenkins plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/plugins.txt
COPY seedJob.xml /usr/share/jenkins/ref/jobs/seed-job/config.xml


ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false