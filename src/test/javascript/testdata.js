function initializeCoreMod() {
    var data = Java.type('ml.cloudmc.coremod.api.ASMAPI').loadData('testdata.json')
    print('Loaded JSON: ' + JSON.stringify(data))
    return {}
}
