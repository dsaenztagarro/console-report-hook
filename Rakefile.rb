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