package com.github.jackielii.intellijlspserver.services

import com.intellij.openapi.project.Project
import com.github.jackielii.intellijlspserver.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
