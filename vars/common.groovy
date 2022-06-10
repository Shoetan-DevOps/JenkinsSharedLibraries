def call (String StageName) {
    if( "${StageName}" == "mvn-Build") 
    {
        sh "mvn clean package"
    }
    else if ( "${StageName}" == "mvn-QualityScans") 
    {
        sh "mvn clean sonar:sonar"
    }
    else if ( "${StageName}" == "mvn-Artifactory") 
    {
        sh "mvn clean deploy"
    } 
}

