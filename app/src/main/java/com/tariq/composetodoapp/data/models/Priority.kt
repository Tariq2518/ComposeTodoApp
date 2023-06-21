package com.tariq.composetodoapp.data.models

import androidx.compose.ui.graphics.Color
import com.tariq.composetodoapp.ui.theme.HighPriorityColor
import com.tariq.composetodoapp.ui.theme.LowPriorityColor
import com.tariq.composetodoapp.ui.theme.MediumPriorityColor
import com.tariq.composetodoapp.ui.theme.NonePriorityColor


enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor)
}