#! groovy

void debug(String mes) {
    println "Debug: ${mes}"
}

void info(String mes) {
    println "Info: ${mes}"
}

def call(String name = 'human') {
    echo "Hello, ${name}."
}