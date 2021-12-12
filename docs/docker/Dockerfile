FROM tomcat:9.0
COPY ./build/libs/discount_calculation.war webapps

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH
WORKDIR $CATALINA_HOME

HEALTHCHECK --interval=15s --timeout=10s CMD curl -f http://localhost:8080/discount_calculation/health || exit 1
