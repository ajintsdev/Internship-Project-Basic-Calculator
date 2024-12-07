package code.with.cal.kotlincalculatorapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_calculation.view.*

class HistoryAdapter(private var history: List<Calculation>) :
    RecyclerView.Adapter<HistoryAdapter.HistoryViewHolder>() {

    inner class HistoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_calculation, parent, false)
        return HistoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: HistoryViewHolder, position: Int) {
        val calculation = history[position]
        holder.itemView.expressionTV.text = calculation.expression
        holder.itemView.resultTV.text = calculation.result
    }

    override fun getItemCount(): Int = history.size

    fun updateHistory(newHistory: List<Calculation>) {
        history = newHistory
        notifyDataSetChanged()
    }
}
