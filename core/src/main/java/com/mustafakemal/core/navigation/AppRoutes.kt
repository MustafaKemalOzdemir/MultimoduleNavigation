package com.mustafakemal.core.navigation

import androidx.core.net.toUri
import com.mustafakemal.core.R

/**
 * Created by Mustafa Kemal Özdemir on 11/28/2021.
 */
object AppRoutes {

    object Feature1 {
        val Entry = R.id.actionFeature1
        object Deeplink {
            val FRAGMENT_1A = "modulenavigationapp://feature1/fragment1a".toUri()
            val FRAGMENT_1B = "modulenavigationapp://feature1/fragment1B".toUri()
        }
    }

    object Feature2 {
        val Entry = R.id.actionFeature2
        object Deeplink {
            val FRAGMENT_2A = "modulenavigationapp://feature2/fragment2a".toUri()
            val FRAGMENT_2B = "modulenavigationapp://feature2/fragment2B".toUri()
        }

    }

}