FROM registry.cn-shanghai.aliyuncs.com/edas/edas-container:3.4.4

#RUN echo "Asia/shanghai" > /etc/timezone


ADD ./target/app.jar  /gts/app.jar


ENV LANG zh_CN.UTF-8
ENV LANGUAGE zh_CN
ENV LC_ALL zh_CN.UTF-8

EXPOSE 8888 

CMD $JAVA_HOME/bin/java -Dfile.encoding=utf-8 -Duser.timezone=Asia/Shanghai -jar /gts/app.jar
