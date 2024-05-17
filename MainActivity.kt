<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/MinhaPlanilha"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Minha Planilha."
        android:textColorLink="#D51818"
        android:textSize="30sp"
        android:textStyle="bold"
        android:typeface="monospace"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintHorizontal_bias="0.497"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:layout_constraintVertical_bias="0.099" />

    <Button
        android:id="@+id/Entrar"
        android:layout_width="131dp"
        android:layout_height="63dp"
        android:text="Entrar"
        tools:layout_editor_absoluteX="140dp"
        tools:layout_editor_absoluteY="344dp" />

</androidx.constraintlayout.widget.ConstraintLayout>
