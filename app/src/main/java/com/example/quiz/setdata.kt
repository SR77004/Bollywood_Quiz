package com.example.quiz

object setdata {

    fun getQuestion(): ArrayList<Questiondata>
    {
        var que:ArrayList<Questiondata> = arrayListOf();
        var que1= Questiondata(
            "Name the first Hindi Movie that received the national award..",
            1,
            "Mirza Ghalib",
            "Do Aankhen Barah Haath",
            1
        )

        var que2= Questiondata(
            "Select the film which was Ashutosh Gowariker's directorial debut.",
            2,
            "Lagaan",
            "Pehla Nasha",
            2
        )

        var que3= Questiondata(
            "In which year did Amitabh Bachchan debut in Hindi cinema?",
            3,
            "1969",
            "1972",
            2
        )

        var que4= Questiondata(
            "Which of these actors had never appeared in television advertisements until 2015?",
            4,
            "Anil Kapoor",
            "Govinda",
            1
        )

        var que5= Questiondata(
            "\"Jaise gadhi ke gihra se,\n" +
                    "Waqt kahin pe gira ho,\n" +
                    "Jaise roshni subah se,\n" +
                    "Ho jaaye judaa...\"\n" +
                    "Which song are these lyrics part of?",
            5,
            "Jab Mila Tu",
            "Bahara",
            1
        )

        var que6= Questiondata(
            "The following lyrics are from which song?\n" +
                    "\"Ab se koi khushi nahi,\n" +
                    "Jiski tum wajah nahi,\n" +
                    "Ab se koi din nahi,\n" +
                    "Jiski tum subah nahi,\n" +
                    "Ab se koi baat nahi,\n" +
                    "Jo tumse na hogi shuru,\n" +
                    "Ab se koi raah nahi,\n" +
                    "Jo tum sang main mudhoon.\"",
            6,
            "Tumse Hi Tumse",
            "Hairat",
            1
        )
        que.add(que1)
        que.add(que2)
        que.add(que3)
        que.add(que4)
        que.add(que5)
        que.add(que6)
        return que
    }
}