package com.bernardo.aboutme_bernardo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_second_scren.*

class SecondScren : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_scren)

        button2.setOnClickListener {
            GoingToEducationScreen()
        }
        button3.setOnClickListener {
            GoingToSkillsScreen()
        }
        button4.setOnClickListener {
            GoingToHobbiesScreen()
        }
        button5.setOnClickListener {
            GoingToAchievementsScreen()
        }


    }

    private fun GoingToEducationScreen() {

        val educationScreen = Intent(this, EducationScreen::class.java)
        startActivity(educationScreen)

    }

    private fun GoingToSkillsScreen() {

        val skillsScreen = Intent(this, SkillsScreen::class.java)
        startActivity(skillsScreen)
    }
    private fun GoingToHobbiesScreen() {

        val hobbiesScreen = Intent(this, HobbiesScreen::class.java)
        startActivity(hobbiesScreen)
    }
    private fun GoingToAchievementsScreen() {

        val achievementsScreen = Intent(this, AchievementsScreen::class.java)
        startActivity(achievementsScreen)
    }
}




