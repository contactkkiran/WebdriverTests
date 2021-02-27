pipeline{
agent any
stages 
{
stage('Clean') 
{
steps{
echo "Cleaning.........."
bat "clean"
}
}
stage('Compile') 
{
steps{
echo "Compile the Code.........."
bat "compile"
}
}
stage('Test') 
{
steps{
echo "Running  the Tests and creating SNASHOT Jar.........."
bat "test"
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
