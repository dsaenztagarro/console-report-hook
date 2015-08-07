desc 'Clean target'
task :clean do
  sh 'mvn clean'
end

desc 'Package your plugin'
task :package => :clean do
  sh 'mvn package'
end

desc 'Deploy Liferay plugin'
task :deploy => :package do
  sh 'mvn liferay:deploy'
end

namespace :log do
  desc 'Show JRebel log'
  task :jrebel do
    sh 'tail -f ~/Development/liferay/bundles/liferay-portal-6.2-ce-ga4/tomcat-7.0.42/bin/catalina.out | grep JRebel'
  end
end