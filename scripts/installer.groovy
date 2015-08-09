command = com.liferay.portal.kernel.bean.PortletBeanLocatorUtil.locate(
	"script-utils-1.0.0-SNAPSHOT", "com.liferay.challenge.command.InstallerCommand")

success = command.run())

if (success) {
	out.println("Success!")
} else {
	out.println("Error!")
}
