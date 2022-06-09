def call (String StageName) {
    if( "${StageName}" == "mvn-Build") {
        sh "mvm clean package"
    }
    else if ( "${StageName}" == "mvn-Quality") {
        sh "mvm clean sonar:sonar"
    }
    else if ( "${StageName}" == "mvn-Artifacts") {
        sh "mvm clean deploy"
    } 
}

