[![Build Status](https://travis-ci.org/dsaenztagarro/console-report-hook.svg)](https://travis-ci.org/dsaenztagarro/console-report-hook)

# liferay-challenge-hook


Environment
-----------

- Mac OS X 10.10.4
- Liferay v6.2 CE Server (Tomcat 7)
- mysql Ver 14.14 Distrib 5.6.25, for osx10.10 (x86_64) using  EditLine wrapper
- maven 3.3.3
- Liferay IDE: Eclipse Luna Release 4.4.0
  Build id: 20140612-0600


Book log
--------
- In order to run server from IDE, remember to update `Liferay settings` with `User timezone:`
  An invalid config doesn't play well with JRebel in order to monitor changes! :(

- Unable to select plugin project when creating service builder
  Liferay IDE: IDE-1843 (Again?)
  => Solved generating manually `service.xml` and running `mvn liferay:build-service`


Running tests
-------------

Execute `mvn test`


Maven configuration
-------------------

Add these profiles to your maven `settings.xml` in order to initialize
all variables of `pom.xml`. 

```xml
<profile>
    <id>jrebel</id>
    <activation>
        <activeByDefault>true</activeByDefault>
    </activation>
    <properties>
        <rebel.workspace.path>/Users/dst/Development/workspace_liferay</rebel.workspace.path>
    </properties>
</profile>

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
        <liferay.auto.deploy.dir>${liferay.portal.dir}/deploy</liferay.auto.deploy.dir>
        <liferay.app.server.deploy.dir>${liferay.app.server.dir}/webapps</liferay.app.server.deploy.dir>
        <liferay.app.server.lib.global.dir>${liferay.app.server.dir}/lib/ext</liferay.app.server.lib.global.dir>
        <liferay.app.server.portal.dir>${liferay.app.server.dir}/webapps/ROOT</liferay.app.server.portal.dir>
    </properties>
</profile>
```

If you are a Mac OS X user and you installed `maven` with `brew` you should 
search inside a path like this one, depending on you maven version:

`/usr/local/Cellar/maven/3.3.3/libexec/conf/settings.xml`


Eclipse IDE config
------------------

[Liferay IDE Java Code Style Formatter profile](http://www.liferay.com/es/community/wiki/-/wiki/Main/Liferay+IDE+Java+Code+Style+Formatter+profile/maximized)

- Project -> Properties -> Project Facets

  - Java: `1.7`

- Preferences -> Maven -> Installations -> Add..

  - Installation home: `/usr/local/Cellar/maven/3.3.3/libexec`
  - Installation name: `maven-3.3.3`

- Preferences -> Maven -> User Settings

  - `/usr/local/Cellar/maven/3.3.3/libexec/conf/settings.xml`

- Project -> Properties -> Maven -> Active Maven Profiles

  - `liferay-dev, jrebel`

- Project -> Build Automatically (checked)

Documentation
-------------

- [Tips to improve usage of the liferay script console](http://www.liferay.com/web/sebastien.lemarchand/blog/-/blogs/5-tips-to-improve-usage-of-the-liferay-script-console)
- [Database Views](http://www.liferay.com/es/community/wiki/-/wiki/Main/Working+with+Database+Views+in+Liferay)
- [Upgrade Process](https://www.liferay.com/web/ryan.park/blog/-/blogs/implementing-upgradingprocess-for-your-liferay-portlets!)


Pending Tasks
-------------

- [ ] Localization
- [ ] Run installer script throw UpgradeProcess
- [ ] Parallelization throw MessageBus
