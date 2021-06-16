pipeline{
agent any
tools { 
        maven 'Maven 3.8.1' 
    
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
