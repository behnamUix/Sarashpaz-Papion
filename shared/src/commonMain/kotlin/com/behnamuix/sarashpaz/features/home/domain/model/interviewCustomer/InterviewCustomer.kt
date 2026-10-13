package com.behnamuix.sarashpaz.features.home.domain.model.interviewCustomer

data class InterviewCustomer(
    val id: String,
    val name: String,
    val imageUrl: String? = null,
    val jobTitle: String? = null,
    val questionsAndAnswers: List<InterviewQuestionAnswer>
)

data class InterviewQuestionAnswer(
    val question: String,
    val answer: String
)
