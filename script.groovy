myUtil = com.liferay.portal.kernel.bean.PortletBeanLocatorUtil.locate(
	"script-utils-1.0.0-SNAPSHOT", "com.liferay.challenge.ScriptUtil")

println(myUtil.operationOne())

println(myUtil.operationTwo("Joe Bloggs"))