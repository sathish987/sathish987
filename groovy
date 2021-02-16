def Floraa_Intent = "clientAdmin.war:1.2,clientAdminService.war:1.3"
def intentmap = [:]

intentmap = Floraa_Intent.tokenize(",").collectEntries {
   it.tokenize(":").with {
    [(it[0]):it[1]]
   }
  }
println("Flora artifacts ")
println(intentmap)
println("intentmap")
println(intentmap.keySet())

import groovy.json.JsonSlurper

def cp_group = '''{"clientAdmin.war": {        "aid": "clientAdmin", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "clientAdminService.war": {
        "aid": "clientAdminService", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "clientProfile.war": {
        "aid": "clientProfile", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "clientProfileService.war": {
        "aid": "clientProfileService", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    },
    "muvDeltaService.war": {
        "aid": "muvDeltaService", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "ipde-publisher-app.ear": {
        "aid": "ipde-publisher-app", 
        "gid": "com.ihealth.ipde", 
        "pkg": "ear", 
        "version": ""
    }, 
    "ipp-portal.war": {
        "aid": "ipp-portal", 
        "gid": "com.ihealth.ippportal", 
        "pkg": "war", 
        "version": "3.1.9"
    }, 
    "login-service.war": {
        "aid": "login-service", 
        "gid": "com.ihealth.ippportal", 
        "pkg": "war", 
        "version": ""
    }, 
    "muvDashboard.war": {
        "aid": "muvDashboard", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "muvDashboardService.war": {
        "aid": "muvDashboardService", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "muvDerivationEngine.war": {
        "aid": "muvDerivationEngine", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "notificationService.war": {
        "aid": "notificationService", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "payerState.war": {
        "aid": "payerState", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "payerStateService.war": {
        "aid": "payerStateService", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    },
    "policyrelease.war": {
        "aid": "policyrelease",
        "gid": "com.cotiviti",
        "pkg": "war",
        "version": "",
        "action": "redeploy"
    },
    "publisher-app.ear": {
        "aid": "publisher-app", 
        "gid": "com.ihealth.jbpm", 
        "pkg": "ear", 
        "version": ""
    }, 
    "stateMedicaid.war": {
        "aid": "stateMedicaid", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "stateMedicaidService.war": {
        "aid": "stateMedicaidService", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "teamAssignment.war": {
        "aid": "teamAssignment", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    }, 
    "teamAssignmentService.war": {
        "aid": "teamAssignmentService", 
        "gid": "com.ihealth", 
        "pkg": "war", 
        "version": ""
    },
    "RuleFilter.war": {
        "aid": "RuleFilter", 
        "gid": "com.ihealth.RuleFilter", 
        "pkg": "war", 
        "version": ""
    },
    "cpDataload.war": {
        "aid": "cpDataload", 
        "gid": "com.cotiviti", 
        "pkg": "war", 
        "version": ""
    },
    "cpDataLoadService.war": {
        "aid": "cpDataLoadService", 
        "gid": "com.cotiviti", 
        "pkg": "war", 
        "version": ""

    }'''

 
def jsonSlurper = new JsonSlurper()
artifact = jsonSlurper.parseText(cp_group)
println("cp-group artifacts:")
println(artifact.keySet())  
artf = artifact.keySet()

/*key=intentmap
artf=json24*/
for (key in intentmap.keySet()) {
    if (key in artf) {
        println("True")
        println(key)
    }
}
