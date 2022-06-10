def call (String StageName) {
    if( "${StageName}" == "mvn-Build") 
    {
        sh "mvn clean package"
    }
    else if ( "${StageName}" == "mvn-Quality") 
    {
        sh "mvn clean sonar:sonar"
    }
    else if ( "${StageName}" == "mvn-Artifacts") 
    {
        sh "mvn clean deploy"
    } 
}

