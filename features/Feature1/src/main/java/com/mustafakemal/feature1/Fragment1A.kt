package com.mustafakemal.feature1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mustafakemal.core.navigation.AppRoutes
import com.mustafakemal.feature1.databinding.Fragment1aBinding

/**
 * Created by Mustafa Kemal Özdemir on 11/28/2021.
 */
class Fragment1A: Fragment() {

    lateinit var binding: Fragment1aBinding
    private val navController by lazy {
        findNavController()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_1a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = Fragment1aBinding.bind(view)

        with(binding) {
            buttonFragment1b.setOnClickListener {
                navController.navigate(R.id.action_fragment1A_to_fragment1B)
            }
            buttonFeature2.setOnClickListener {
               navController.navigate(AppRoutes.Feature2.Entry)
            }
            buttonFragment2a.setOnClickListener {
                navController.navigate(AppRoutes.Feature2.Deeplink.FRAGMENT_2A)
            }
            buttonFragment2b.setOnClickListener {
                navController.navigate(AppRoutes.Feature2.Deeplink.FRAGMENT_2B)
            }
        }
    }

}