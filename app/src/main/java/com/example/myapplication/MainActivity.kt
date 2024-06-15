package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val StartRoute: Button = findViewById(R.id.start_route)
        StartRoute.setOnClickListener {
            showDialogStart()
        }

        val SaveRoute: Button = findViewById(R.id.save_route)
        SaveRoute.setOnClickListener {
            showDialogSave()
        }

        val SelectionRoute: Button = findViewById(R.id.selection_route)
        SelectionRoute.setOnClickListener {
            showDialogSelection()
        }

    }
    private fun showDialogStart() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.fragment_push_start, null)

        val builder = AlertDialog.Builder(this)
            .setView(dialogView)
            .setCancelable(false) // Нельзя закрыть кнопкой "назад"

        val alertDialog = builder.create()

        val button1: Button = dialogView.findViewById(R.id.btn_exit)
        button1.setOnClickListener {
            // Действие при нажатии на кнопку 1
            alertDialog.dismiss() // Закрыть диалог
        }

        val button2: Button = dialogView.findViewById(R.id.btn_start)
        button2.setOnClickListener {
            // Действие при нажатии на кнопку 2
            //alertDialog.dismiss() // Закрыть диалог
        }

        alertDialog.show()
    }

    private fun showDialogSave() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.fragment_push_save, null)

        val builder = AlertDialog.Builder(this)
            .setView(dialogView)
            .setCancelable(false) // Нельзя закрыть кнопкой "назад"

        val alertDialog = builder.create()

        val button1: Button = dialogView.findViewById(R.id.btn_exit)
        button1.setOnClickListener {
            // Действие при нажатии на кнопку 1
            alertDialog.dismiss() // Закрыть диалог
        }

        val button2: Button = dialogView.findViewById(R.id.btn_save)
        button2.setOnClickListener {
            showDialogSave2()
            alertDialog.dismiss() // Закрыть диалог
        }

        alertDialog.show()
    }

    private fun showDialogSave2(){
        val dialogView = LayoutInflater.from(this).inflate(R.layout.fragment_push_save2, null)

        val builder = AlertDialog.Builder(this)
            .setView(dialogView)
            .setCancelable(false) // Нельзя закрыть кнопкой "назад"

        val alertDialog = builder.create()

        val button1: Button = dialogView.findViewById(R.id.btn_exit)
        button1.setOnClickListener {
            // Действие при нажатии на кнопку 1
            alertDialog.dismiss() // Закрыть диалог
        }

        alertDialog.show()
    }

    private fun showDialogSelection() {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.fragment_push_selection, null)

        val builder = AlertDialog.Builder(this)
            .setView(dialogView)
            .setCancelable(false) // Нельзя закрыть кнопкой "назад"

        val alertDialog = builder.create()

        val button1: Button = dialogView.findViewById(R.id.btn_exit)
        button1.setOnClickListener {
            // Действие при нажатии на кнопку 1
            alertDialog.dismiss() // Закрыть диалог
        }

        alertDialog.show()
    }
}