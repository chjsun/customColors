package com.github.chjsun.customcolors.services

import com.intellij.openapi.project.Project
import com.github.chjsun.customcolors.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
