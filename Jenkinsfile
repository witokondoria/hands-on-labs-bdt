@Library('libpipelines@master') _

hose {
    EMAIL = 'qa'
    MODULE = 'bdt-hol'
    SLACKTEAM = 'stratioqa'
    REPOSITORY = 'hands-on-labs-bdt' 

    ATTIMEOUT = 60

    ATPARAMETERS = ''
    
    ATSERVICES = [
        ['CHROME':  ['image':   'stratio/selenium-chrome:48',
                     'volumes': ['/dev/shm:/dev/shm'],
                     'env':     ['SELENIUM_GRID=selenium.cd','ID=%%JUID']]]
    ]
    
    DEV = { config ->
        doAT(conf: config)
     }
}
