job('Job-DSL-SFDX-Sample-Job') {
    scm {
        git('git://github.com/forcedotcom/sfdx-jenkins-package')
    }
    triggers {
        scm('H/15 * * * *')
    }
    steps {
        shell('echo START')
		shell('sfdx --version')
		shell('sfdx force:source:convert -d src')
		shell('ls -l ')
		shell('ls src/ -l ')
    }
}
