package com.eks.todoapp.data.models

import androidx.compose.ui.graphics.Color
import com.eks.todoapp.ui.theme.HighPriorityColor
import com.eks.todoapp.ui.theme.LowPriorityColor
import com.eks.todoapp.ui.theme.MediumPriorityColor
import com.eks.todoapp.ui.theme.NonePriorityColor


enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}