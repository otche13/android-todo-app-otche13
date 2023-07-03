package com.example.todo.data.remote.model

import com.example.todo.data.model.TodoItem
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TodoItemRequest(
    @SerialName("element") val element: TodoItem
)