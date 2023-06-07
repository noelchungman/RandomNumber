# RandomNumber
Random Number from 1 to 100

app -> java -> com.xxx.xxx -> MainActivity.kt
   fun generateNextNum(v: View){
        var luckyNumberTV = findViewById<TextView>(R.id.luckyNumberTV)
        var luckyNumber = Random.nextInt(1,99)
        luckyNumberTV.text = luckyNumber.toString()
    }
  
  app -> res -> layout -> activity_main.xml
  <TextView
        android:id="@+id/luckyNumberTV"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="\?"
        android:textColor="#CC0000"
        android:textSize="150sp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />

    <Button
        android:id="@+id/button"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:layout_marginStart="8dp"
        android:layout_marginEnd="8dp"
        android:layout_marginBottom="8dp"
        android:onClick="generateNextNum"
        android:text="Next Lucky Number"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />
