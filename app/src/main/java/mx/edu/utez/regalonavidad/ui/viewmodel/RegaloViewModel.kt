package mx.edu.utez.regalonavidad.ui.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class RegaloViewModel: ViewModel() {
    private val _isEnvuelto = MutableStateFlow(value = true)
    val isEnvuelto = _isEnvuelto.asStateFlow()

    fun abrirCaja() {
        _isEnvuelto.value = false
    }

    fun envolverCaja() {

        _isEnvuelto.value = true
    }
}