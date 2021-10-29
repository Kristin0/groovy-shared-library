package io.example.first

def chekOutFrom(repo) {
    checkout([$class: 'GitSCM', branches: [[name: '*/main']], extensions: [], 
              userRemoteConfigs: [[url: "https://github.com/Kristin0/${repo}.git"]]])
}

return this