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

  - Tunning memory args for fixing outOfMemoryErrors: `-Xms2048m -Xmx2048m -XX:MaxPermSize=1024m`


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
        <rebel.workspace.path>${user.home}/Development/workspace_liferay</rebel.workspace.path>
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


Problems
--------

- Unable to solve problem. See log entry:

<pre>
1:02:47,089 INFO  [http-bio-8080-exec-19][David:11] run#begin
21:02:47,093 INFO  [http-bio-8080-exec-19][David:11] organizationCount: 2
21:02:47,099 INFO  [http-bio-8080-exec-19][David:11] trace1
21:02:47,103 ERROR [http-bio-8080-exec-19][PortletBeanLocatorUtil:42] BeanLocator is null for servlet context script-utils
21:02:47,104 ERROR [http-bio-8080-exec-19][EditServerAction:523] SanitizerLogWrapper warning: Following message contains CRLF characters
BeanLocator has not been set for servlet context script-utils
Line 1: command = com.liferay.portal.kernel.bean.PortletBeanLocatorUtil.locate("script-utils-1.0.0-SNAPSHOT", "com.liferay.challenge.command.CatastropheReportCommand")
Line 2: 
Line 3: success = command.run()
Line 4: 
Line 5: if (success) {
Line 6: 	out.println("Success!")
Line 7: } else {
Line 8: 	out.println("Error!")
Line 9: }
</pre>

Details implementation
----------------------

In order to run report with high performance from script admin console, it was
intended to create previously a table `UsersCatastropheOrgs` to provide a unique
relation between a user and an organization since a user can belong to multiple 
organizations.

It was required a `Strategy` pattern to choose the organization the user is going
to belong to once a catastrophe take place ` to provide a unique
relation between a user and an organization since a user can belong to multiple 
organizations.

It is not implemented, but it is clear that it is required to override some methods
from `UserLocalServiceUtil` to update state in `UsersCatastropheOrgs` every time
there is a change related to organizations of a user.


Installation 
------------

As the implementation is not finished you should take this as a reference.

Once the hook plugin is deployed, you should run (hipothetically) the script
`installer.groovy` in order to populate with data the `UsersCatastrophe` table.

That's all! Supposed there is a catastrophe run and execute the script `report.groovy`.
