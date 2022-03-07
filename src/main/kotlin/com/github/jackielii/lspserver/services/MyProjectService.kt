package com.github.jackielii.lspserver.services

import com.intellij.openapi.project.Project
import com.github.jackielii.lspserver.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
