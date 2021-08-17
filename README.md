```
~/git/github/quarkus-mybatis-issue-114 > ./gradlew quarkusDev

> Task :quarkusDev
Listening for transport dt_socket at address: 5005
Press [h] for more options>
2021-08-17 10:51:26,381 ERROR [io.qua.run.boo.StartupActionImpl] (Quarkus Main Thread) Error running Quarkus: java.lang.reflect.InvocationTargetException
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.base/java.lang.reflect.Method.invoke(Method.java:566)
        at io.quarkus.runner.bootstrap.StartupActionImpl$1.run(StartupActionImpl.java:98)
        at java.base/java.lang.Thread.run(Thread.java:829)
Caused by: java.lang.ExceptionInInitializerError
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
        at java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)
        at java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
        at java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)
        at java.base/java.lang.Class.newInstance(Class.java:584)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:65)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:42)
        at io.quarkus.runtime.Quarkus.run(Quarkus.java:119)
        at io.quarkus.runner.GeneratedMain.main(GeneratedMain.zig:29)
        ... 6 more
Caused by: java.lang.RuntimeException: Failed to start quarkus
        at io.quarkus.runner.ApplicationImpl.<clinit>(ApplicationImpl.zig:215)
        ... 15 more
Caused by: org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. The XML location is 'org/acme/project/mapper/MyMapper.xml'. Cause: org.apache.ibatis.builder.BuilderException: Error resolving class. Cause: org.apache.ibatis.type.TypeException: Could not resolve type alias 'MyEntity'.  Cause: java.lang.ClassNotFoundException: Cannot find class: MyEntity
        at org.apache.ibatis.builder.xml.XMLMapperBuilder.configurationElement(XMLMapperBuilder.java:123)
        at org.apache.ibatis.builder.xml.XMLMapperBuilder.parse(XMLMapperBuilder.java:95)
        at org.apache.ibatis.builder.annotation.MapperAnnotationBuilder.loadXmlResource(MapperAnnotationBuilder.java:179)
        at org.apache.ibatis.builder.annotation.MapperAnnotationBuilder.parse(MapperAnnotationBuilder.java:118)
        at org.apache.ibatis.binding.MapperRegistry.addMapper(MapperRegistry.java:72)
        at org.apache.ibatis.session.Configuration.addMapper(Configuration.java:841)
        at io.quarkiverse.mybatis.runtime.MyBatisRecorder.addMappers(MyBatisRecorder.java:96)
        at io.quarkiverse.mybatis.runtime.MyBatisRecorder.createSqlSessionFactory(MyBatisRecorder.java:70)
        at io.quarkus.deployment.steps.MyBatisProcessor$generateSqlSessionFactory-687538554.deploy_0(MyBatisProcessor$generateSqlSessionFactory-687538554.zig:158)
        at io.quarkus.deployment.steps.MyBatisProcessor$generateSqlSessionFactory-687538554.deploy(MyBatisProcessor$generateSqlSessionFactory-687538554.zig:40)
        at io.quarkus.runner.ApplicationImpl.<clinit>(ApplicationImpl.zig:151)
        ... 15 more
Caused by: org.apache.ibatis.builder.BuilderException: Error resolving class. Cause: org.apache.ibatis.type.TypeException: Could not resolve type alias 'MyEntity'.  Cause: java.lang.ClassNotFoundException: Cannot find class: MyEntity
        at org.apache.ibatis.builder.BaseBuilder.resolveClass(BaseBuilder.java:118)
        at org.apache.ibatis.builder.xml.XMLStatementBuilder.parseStatementNode(XMLStatementBuilder.java:102)
        at org.apache.ibatis.builder.xml.XMLMapperBuilder.buildStatementFromContext(XMLMapperBuilder.java:138)
        at org.apache.ibatis.builder.xml.XMLMapperBuilder.buildStatementFromContext(XMLMapperBuilder.java:131)
        at org.apache.ibatis.builder.xml.XMLMapperBuilder.configurationElement(XMLMapperBuilder.java:121)
        ... 25 more
Caused by: org.apache.ibatis.type.TypeException: Could not resolve type alias 'MyEntity'.  Cause: java.lang.ClassNotFoundException: Cannot find class: MyEntity
        at org.apache.ibatis.type.TypeAliasRegistry.resolveAlias(TypeAliasRegistry.java:120)
        at org.apache.ibatis.builder.BaseBuilder.resolveAlias(BaseBuilder.java:149)
        at org.apache.ibatis.builder.BaseBuilder.resolveClass(BaseBuilder.java:116)
        ... 29 more
Caused by: java.lang.ClassNotFoundException: Cannot find class: MyEntity
        at org.apache.ibatis.io.ClassLoaderWrapper.classForName(ClassLoaderWrapper.java:196)
        at org.apache.ibatis.io.ClassLoaderWrapper.classForName(ClassLoaderWrapper.java:89)
        at org.apache.ibatis.io.Resources.classForName(Resources.java:261)
        at org.apache.ibatis.type.TypeAliasRegistry.resolveAlias(TypeAliasRegistry.java:116)
        ... 31 more
```
