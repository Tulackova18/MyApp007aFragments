package com.example.myapp007afragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapp007afragments.databinding.FragmentABinding

class FragmentA : Fragment() {

    private var _binding: FragmentABinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentABinding.inflate(
            inflater, container, false
        )
        return binding.root
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnMoreInfo.setOnClickListener {

            if (binding.tvMoreInfo.visibility == View.GONE) {
                binding.tvMoreInfo.visibility = View.VISIBLE
                binding.btnMoreInfo.text = "Skrýt informace"
            } else {
                binding.tvMoreInfo.visibility = View.GONE
                binding.btnMoreInfo.text = "Více informací"
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
