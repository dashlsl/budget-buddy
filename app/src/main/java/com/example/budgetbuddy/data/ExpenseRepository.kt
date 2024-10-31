package com.example.budgetbuddy.data

import kotlinx.coroutines.flow.Flow

class ExpenseRepository(private val expenseDao:ExpenseDao){
    suspend fun addExpense(expense: Expense){
        expenseDao.addExpense(expense)
    }

    fun getAllExpense(): Flow<List<Expense>> = expenseDao.getAllExpense()
    fun getAllExpenseFilter(filter:String): Flow<List<Expense>> = expenseDao.getAllExpenseFilter(filter)

    suspend fun updateExpense(expense: Expense){
        expenseDao.updateExpense(expense)
    }
    suspend fun deleteExpense(expense: Expense){
        expenseDao.deleteExpense(expense)
    }
}