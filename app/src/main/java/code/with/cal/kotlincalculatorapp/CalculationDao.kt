package code.with.cal.kotlincalculatorapp

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CalculationDao {
    @Insert
    suspend fun insert(calculation: Calculation)

    @Query("SELECT * FROM calculation_history ORDER BY id DESC")
    suspend fun getAllCalculations(): List<Calculation>
}
