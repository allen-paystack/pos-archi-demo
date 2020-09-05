package com.paystack.architecturedemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.database.Transaction
import com.paystack.poscontract.Hardware
import com.paystack.poscontract.Processor
import com.paystack.poscontract.models.TransactionType
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment(), Hardware.Callback, Processor.Callback {
    lateinit var hardware: Hardware
    lateinit var processor: Processor
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hardware = HardwareModule().getHardwareModule()
        processor = ProcessorModule().getProcessorModule()
        hardware.init(requireContext(), this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        hardware.readCard("reference", 2)
    }

    override fun cardReadSuccessful() {
        TODO("Not yet implemented")
    }

    override fun cardReadError() {
        TODO("Not yet implemented")
    }

    override fun emvTransactionError(errorCode: Int) {
        TODO("Not yet implemented")
    }

    override fun onWrongPinEntered(numberOfTries: Int) {
        TODO("Not yet implemented")
    }

    override fun processComplete(transaction: Transaction) {
        processor.doTransaction(TransactionType.PURCHASE, transaction, this)
    }

    override fun onTransactionResponse(message: String) {
        TODO("Not yet implemented")
    }
}