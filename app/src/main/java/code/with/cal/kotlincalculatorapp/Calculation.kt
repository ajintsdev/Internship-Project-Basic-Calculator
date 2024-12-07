package code.with.cal.kotlincalculatorapp

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "calculation_history")
data class Calculation(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val expression: String,
    val result: String
)
