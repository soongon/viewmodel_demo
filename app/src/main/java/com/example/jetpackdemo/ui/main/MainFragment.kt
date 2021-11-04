package com.example.jetpackdemo.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import com.example.jetpackdemo.R
import com.example.jetpackdemo.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    lateinit var binding: MainFragmentBinding

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = MainFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        binding.buttonConvert.setOnClickListener {
            val dollarValue = binding.editTextDollar.text.toString()
            viewModel.setAmount(dollarValue)

            binding.textResult.text = viewModel.getResult().toString()
        }
    }
}