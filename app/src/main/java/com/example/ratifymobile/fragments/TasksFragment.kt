package com.example.ratifymobile.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentContainer
import com.example.ratifymobile.R
import com.example.ratifymobile.databinding.FragmentTasksBinding


private var _binding: FragmentTasksBinding? = null
private val binding get() = _binding!!

class TasksFragment : Fragment(R.layout.fragment_tasks) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTasksBinding.inflate(inflater, container, false)
        val view = binding.root

        return view
    }

    override fun onStart() {
        super.onStart()
        binding.snrRecentlyAssigned.onItemSelectedListener =
            object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    adapterView: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {

                    val selected = adapterView?.getItemAtPosition(position).toString()
                    Toast.makeText(context, "$selected was selected",
                    Toast.LENGTH_SHORT).show()
                }

                override fun onNothingSelected(adapterView: AdapterView<*>?) {
                }

            }

    }


    override fun onDestroyView() {
        super.onDestroyView()

    }
}
