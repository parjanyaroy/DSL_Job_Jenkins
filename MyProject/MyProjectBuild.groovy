def giturl = 'https://github.com/quidryan/aws-sdk-test.git'
for(i in 0..10) {
    job("DSL-Tutorial-1-Test-${i}") {
        scm {
            git(giturl)
        }
        steps {
            maven("test -Dtest.suite=${i}")
        }
    }
}
