package com.example.cheat_quiz

object setData {

    const val name: String= "name"
    const val score: String="score"

    fun getQuestion():ArrayList<QuestionData>{
        var que: ArrayList<QuestionData> = arrayListOf()
        var question1 = QuestionData(
            1,
            "Which is India’s first large state to record 100 per cent first-dose vaccinations?",

            "Telangana",
            "Odisha",
            "Tamil Nadu",
            "Karnataka",
            1
        )
        var question2 = QuestionData(
            2,
            "The GST Council has decided to defer the increase in GST Rate on which product?",

            "Textile",
            "Automobile",
            "Mobile Phones",
            "Cotton",
            1
        )
        var question3 = QuestionData(
            3,
            "What is the deadline for KYC updation for bank accounts, as per the recent notification of RBI?",

            "January 31, 2022",
            "March 31, 2022",
            "June 30, 2022",
            "September 30, 2022",
            2
        )
        var question4 = QuestionData(
            4,
            "Which is the parent company of GitHub, an open-source software developer, which was seen in the news recently?",

            "Google",
            "Twitter",
            "Microsoft",
            "Meta",
            3
        )

        var question5 = QuestionData(
            5,
            "What is the full form of 'YAHOO'?",

            "Yet Another Hierarchically Organized Oracle",
            "Yet Again Hierarchically Organized Organization",
            "Yahoo And Hierarchy Organization Organized",
            "Yes Against Highest Organized Oracle",
            1
        )

        var question6 = QuestionData(
            6,
            "Which is the biggest Ocean in the world?",

            "Indian Ocean",
            "Atlantic Ocean",
            "The Pacific Ocean",
            "Southern Ocean",
            3
        )

        var question7 = QuestionData(
            7,
            "Who is the CEO of Facebook?",

            "Susan Wojcicki",
            "Mark Zuckerberg",
            "Dennis Troper",
            "Sundar Pichai",
            2
        )

        var question8 = QuestionData(
            8,
            "When Corona Virus came in India?",

            "January 30,2020",
            "November 29,2019",
            "February 30,2020",
            "December 26,2019",
            1
        )

        var question9 = QuestionData(
            9,
            "What is the name of first web series of Bhuvan Bam at Youtube?",

            "Titu Mama Talks",
            "Ajnabee",
            "Bhuvan Bam Bencho",
            "Dhindhora",
            4
        )

        var question10 = QuestionData(
            10,
            "Who planned the Royal Mint Heist at web series 'Money Heist'?",

            "Alicia Sierra",
            "Professor",
            "Berlin",
            "Tatiana",
            3
        )

        que.add(question1)
        que.add(question2)
        que.add(question3)
        que.add(question4)
        que.add(question5)
        que.add(question6)
        que.add(question7)
        que.add(question8)
        que.add(question9)
        que.add(question10)
        return que
    }
}