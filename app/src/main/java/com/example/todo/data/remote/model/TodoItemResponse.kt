package com.example.todo.data.remote.model

import com.example.todo.data.model.TodoItem
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TodoItemResponse(
    @SerialName("element") val task: TodoItem,
    @SerialName("revision") val revision: String,
    @SerialName("status") val status: String
)
