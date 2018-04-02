package com.vinti.testapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_quiz.*

class QuizActivity : AppCompatActivity() {

    var counter = 0
    lateinit var questionsArray : Array<String>
    lateinit var optionsArray : Array<String>
    lateinit var answerArray: Array<String>

    var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        var intent = intent

        val userSelection = intent.getStringExtra("userchoice")

        when(userSelection){
            "c" ->{
                questionsArray = resources.getStringArray(R.array.cQuestions)
                optionsArray = resources.getStringArray(R.array.cOptions)
                answerArray = resources.getStringArray(R.array.canswers)
            }
            "c++"->{
                questionsArray = resources.getStringArray(R.array.cPlusQuestions)
                optionsArray = resources.getStringArray(R.array.cPlusOptions)
                answerArray = resources.getStringArray(R.array.cPlusanswers)
            }
        }

        nextButton.setOnClickListener {
            checkScore()
            counter++       //2
            radioGroup.clearCheck()
            //4<=4
            if(counter<questionsArray.size){

                displayQuestions()
            } else{
                // switch to new screen with score
            }
        }

        displayQuestions()
    }

    private fun displayQuestions()
    {
        questionTextView.text = questionsArray[counter] // 2
        option1.text = optionsArray[counter * 4]        // 8    4-7/8-11
        option2.text = optionsArray[counter * 4 + 1]    // 9
        option3.text = optionsArray[counter  * 4 + 2]   // 10
        option4.text = optionsArray[counter * 4 + 3]    // 11
    }

    fun checkScore(){
        var radioButton = findViewById<RadioButton>(radioGroup.checkedRadioButtonId)
        if(radioButton.text== answerArray[counter]){
            score++
            Log.i("Score","" + score)
        }
    }
}