package br.senac.aula08examples.materialcomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.senac.aula08examples.databinding.ActivityMaterialComponentsBinding

class MaterialComponentsActivity : AppCompatActivity() {
    lateinit var binding: ActivityMaterialComponentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMaterialComponentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}