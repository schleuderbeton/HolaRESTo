# base docker image
#FROM tomee:8-jre-7.1.2-plume
#FROM tomee:8-jre-8.0.6-plume
FROM tomee:8-jre-8.0.6-microprofile

#COPY system.properties conf/
# copy war file to webapps/ROOT.war
#COPY ${project.artifactId}.${project.packaging} webapps/ROOT.${project.packaging}
COPY target/holaresto.war webapps/holaresto.war
