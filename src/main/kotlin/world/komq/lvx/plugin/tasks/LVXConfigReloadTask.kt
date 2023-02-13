/*
 * Copyright (c) 2022 Komtents Dev Team
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

package world.komq.lvx.plugin.tasks

import world.komq.lvx.plugin.objects.LVXObject.getInstance
import java.io.File

/**
 * @author ContentManager
 */

class LVXConfigReloadTask: Runnable {
    private val configFile = File(getInstance().dataFolder, "config.yml")

    private var configFileLastModified = configFile.lastModified()

    override fun run() {
        // Live Config Reloading

        if (configFileLastModified != configFile.lastModified()) {
            getInstance().logger.info("Config Reloaded.")
            getInstance().reloadConfig()
            getInstance().saveConfig()

            configFileLastModified = configFile.lastModified()
        }
    }
}