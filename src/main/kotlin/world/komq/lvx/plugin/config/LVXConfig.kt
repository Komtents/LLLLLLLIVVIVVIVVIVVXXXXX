/*
 * Copyright (c) 2021 Komtents Dev Team
 *
 *  Licensed under the General Public License, Version 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/gpl-3.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package world.komq.lvx.plugin.config

import io.github.monun.tap.config.Config
import io.github.monun.tap.config.ConfigSupport
import java.io.File

/**
 * @author ContentManager
 */

object LVXConfig {
    @Config
    var debugMode = false

    @Config
    var monsterDamage = 3

    @Config
    var jagangDucheon = true

    @Config
    var playerUuid = arrayListOf(
        "389c4c9b-6342-42fc-beb3-922a7d7a72f9",
        "5082c832-7f7c-4b04-b0c7-2825062b7638"
    )

    fun load(configFile: File) {
        ConfigSupport.compute(this, configFile)
    }
}