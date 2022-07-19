package com.github.shanglt.bees.services

import com.intellij.openapi.project.Project
import com.github.shanglt.bees.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
