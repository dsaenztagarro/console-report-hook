command = com.liferay.portal.kernel.bean.PortletBeanLocatorUtil.locate(
	"script-utils-1.0.0-SNAPSHOT", "com.liferay.challenge.command.InstallerCommand")

println(command.run())
