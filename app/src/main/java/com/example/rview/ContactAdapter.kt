package com.example.rview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactAdapter(private val contatos: List<Contato>) : RecyclerView.Adapter<ContactAdapter.ContatoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_contato, parent, false)
        return ContatoViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContatoViewHolder, position: Int) {
        val contato = contatos[position]
        holder.bind(contato)
    }

    override fun getItemCount(): Int {
        return contatos.size
    }

    inner class ContatoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nomeTextView: TextView = itemView.findViewById(R.id.textViewNome)
        private val telefoneTextView: TextView = itemView.findViewById(R.id.textViewTelefone)

        fun bind(contato: Contato) {
            nomeTextView.text = contato.nome
            telefoneTextView.text = contato.telefone
        }
    }
}
