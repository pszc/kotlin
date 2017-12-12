/*
 * Copyright 2000-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.idea.facet

import com.intellij.facet.Facet
import com.intellij.facet.FacetType
import com.intellij.facet.FacetTypeId
import com.intellij.openapi.module.JavaModuleType
import com.intellij.openapi.module.ModuleType
import org.jetbrains.kotlin.idea.KotlinIcons
import javax.swing.Icon

abstract class AbstractKotlinFacetType<C : FacetConfigurationWithKotlinSettings> :
    FacetType<Facet<FacetConfigurationWithKotlinSettings>, C>(TYPE_ID, ID, NAME) {
    companion object {
        const val DEBUG_NAME = "kotlin-language"
        val TYPE_ID = FacetTypeId<Facet<FacetConfigurationWithKotlinSettings>>(DEBUG_NAME)
        const val ID = "kotlin-language"
        const val NAME = "Kotlin"
    }

    override fun isSuitableModuleType(moduleType: ModuleType<*>) = moduleType is JavaModuleType

    override fun getIcon(): Icon = KotlinIcons.SMALL_LOGO
}