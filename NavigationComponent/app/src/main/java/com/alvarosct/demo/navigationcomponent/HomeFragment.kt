package com.alvarosct.demo.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        Get params
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.bt_sample_fragment).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_sampleFragment)
        }
        view.findViewById<Button>(R.id.bt_sample_dialog_fragment).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_sampleDialogFragment)
        }
        view.findViewById<Button>(R.id.bt_sample_bottom_sheet_fragment).setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_sampleBottomSheetFragment)
        }
        view.findViewById<Button>(R.id.bt_sample_bottom_sheet_fragment_2).setOnClickListener {
            val menuFragment = SampleBottomSheetFragment2()
            menuFragment.show(childFragmentManager, menuFragment.tag)
        }
    }

}