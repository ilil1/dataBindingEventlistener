package com.project.databindingeventlistener

import android.content.Context
import android.view.View
import android.widget.Toast

class Presenter(val context : Context) {
    fun onSaveClick(task: Task) {
        Toast
            .makeText(context, "${task.firstName}, ${task.lastName}" , Toast.LENGTH_SHORT)
            .show()
    }
}