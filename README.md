# script-utils-hook

# Environment

- maven 3.3.3
- IDE: Eclipse Luna Release 4.4.0

# Maven configuration

Add a section like this to your maven `settings.xml` in order to initialize
variables of `pom.xml`. 

```
<profile>
    <id>liferay-dev</id>
    <activation>
        <activeByDefault>true</activeByDefault>
    </activation>
    <properties>
        <!-- local config BEGIN -->
        <liferay.bundle.dir>${user.home}/Development/liferay/bundles/liferay-portal-6.2-ce-ga4</liferay.bundle.dir>
        <liferay.app.server.dir>${liferay.bundle.dir}/tomcat-7.0.42</liferay.app.server.dir>
        <!-- local config END -->

        <plugin.type>portlet</plugin.type>
        <liferay.version>6.2.0-ga1</liferay.version>
        <liferay.maven.plugin.version>6.2.0-ga1</liferay.maven.plugin.version>
        <liferay.auto.deploy.dir>{liferay.portal.dir}/deploy</liferay.auto.deploy.dir>
        <liferay.app.server.deploy.dir>${liferay.app.server.dir}/webapps</liferay.app.server.deploy.dir>
        <liferay.app.server.lib.global.dir>${liferay.app.server.dir}/lib/ext</liferay.app.server.lib.global.dir>
        <liferay.app.server.portal.dir>${liferay.app.server.dir}/webapps/ROOT</liferay.app.server.portal.dir>
    </properties>
</profile>
```

If you are a Mac OS X user and you installed `maven` with `brew` you should 
search inside a path like this one, depending on you maven version:

`/usr/local/Cellar/maven/3.3.3/libexec/conf/settings.xml`

# Eclipse IDE config

- Preferences -> Maven -> Installations -> Add..
  ```
  Installation home: /usr/local/Cellar/maven/3.3.3/libexec
  Installation name: maven-3.3.3
  ```
- Preferences -> Maven -> User Settings
  `/usr/local/Cellar/maven/3.3.3/libexec/conf/settings.xml`

# Project config

- Project -> Properties -> Maven -> Active Maven Profiles
  `liferay-dev`