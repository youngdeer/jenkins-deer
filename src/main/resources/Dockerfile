FROM tomcat

MAINTAINER "youngdeer <young_deer@sina.com>"  

ENV DIR_WEBAPP /usr/local/tomcat/webapps/ 

RUN  rm -rf $DIR_WEBAPP/*   

ADD jenkins-deer-0.0.1-SNAPSHOT.war $DIR_WEBAPP/jenkins-deer.war 

RUN  unzip $DIR_WEBAPP/jenkins-deer.war  -d  $DIR_WEBAPP/jenkins-deer/

CMD ["catalina.sh", "run"]