pipeline{
agent any
tools { 
        maven 'Maven 3.3.1' 
        jdk 'jdk8' 
    }
stages 
{
stage('Clean') 
{
steps{ 
echo "Cleaning.........."
bat "mvn clean" 
}
}
stage('Compile') 
{
steps{
echo "Compile the Code.........."
bat "mvn compile"
}
}
stage('Test') 
{
steps{
echo "Running  the Tests and creating SNASHOT Jar.........."
bat "mvn test"
}
}
stage('Deploy') 
{
steps{
echo "Deploying the Project.........."
}
}
}
}
