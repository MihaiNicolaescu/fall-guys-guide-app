package com.nicolaescu.fallguysguide;

import android.transition.*;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Scene scene_main;
    private Scene scene_see_saw;
    private Scene scene_roll;
    private Scene scene_hit_parade;
    private Scene scene_block_party;
    private Scene scene_rock;
    private Scene scene_egg_scramble;
    private Scene scene_dizzy_heights;
    private Scene scene_hoopsie_daisy;
    private Scene scene_whirlygig;
    private Scene scene_slime_climb;
    private Scene scene_fruit_chute;
    private Scene scene_jump_club;
    private Scene scene_hoarders;
    private Scene scene_fall_ball;
    private Scene scene_jinxed;
    private Scene scene_tip_toe;
    private Scene scene_tail_tag;
    private Scene scene_team_tail_tag;
    private Scene scene_royal_fumble;
    private Scene scene_fall_mountain;
    private Scene scene_hex_a_gone;
    private Scene scene_jump_showdown;
    private Scene scene_door_dash;
    private Scene scene_gate_crash;
    private Scene scene_perfect_match;
    private int scene_nr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //hide title bar
        try{
            this.getSupportActionBar().hide();
        }catch(NullPointerException e){};

        setContentView(R.layout.activity_main);
        ViewGroup root = findViewById(R.id.main);
        //scenes for all tips for all levels
        scene_main = Scene.getSceneForLayout(root, R.layout.activity_main, this);
        scene_see_saw = Scene.getSceneForLayout(root, R.layout.see_saw, this);
        scene_roll = Scene.getSceneForLayout(root, R.layout.roll_out, this);
        scene_hit_parade = Scene.getSceneForLayout(root, R.layout.hit_parade, this);
        scene_block_party = Scene.getSceneForLayout(root, R.layout.block_party, this);
        scene_rock = Scene.getSceneForLayout(root, R.layout.rock, this);
        scene_egg_scramble = Scene.getSceneForLayout(root, R.layout.egg_scramble, this);
        scene_dizzy_heights = Scene.getSceneForLayout(root, R.layout.dizzy_heights, this);
        scene_hoopsie_daisy = Scene.getSceneForLayout(root, R.layout.hoopsie_daisy, this);
        scene_whirlygig = Scene.getSceneForLayout(root, R.layout.whirlygig, this);
        scene_slime_climb = Scene.getSceneForLayout(root, R.layout.slime_climb, this);
        scene_fruit_chute = Scene.getSceneForLayout(root, R.layout.fruit_chute, this);
        scene_jump_club = Scene.getSceneForLayout(root, R.layout.jump_club, this);
        scene_hoarders = Scene.getSceneForLayout(root, R.layout.hoarders, this);
        scene_fall_ball = Scene.getSceneForLayout(root, R.layout.fall_ball, this);
        scene_jinxed = Scene.getSceneForLayout(root, R.layout.jinxed, this);
        scene_tip_toe = Scene.getSceneForLayout(root, R.layout.tip_toe, this);
        scene_tail_tag = Scene.getSceneForLayout(root, R.layout.tail_tag, this);
        scene_team_tail_tag = Scene.getSceneForLayout(root, R.layout.tail_tag, this);
        scene_royal_fumble = Scene.getSceneForLayout(root, R.layout.royal_famble, this);
        scene_fall_mountain = Scene.getSceneForLayout(root, R.layout.fall_mountain, this);
        scene_hex_a_gone = Scene.getSceneForLayout(root, R.layout.hex_a_gone, this);
        scene_jump_showdown = Scene.getSceneForLayout(root, R.layout.jump_showdown, this);
        scene_door_dash = Scene.getSceneForLayout(root, R.layout.door_dash, this);
        scene_gate_crash = Scene.getSceneForLayout(root, R.layout.gate_crash, this);
        scene_perfect_match = Scene.getSceneForLayout(root, R.layout.perfect_match, this);

        scene_nr = 0;

        scene_main.enter(); // start with main scene, will be re-writed with a meniu (tips / rate_us / buy game = open browser to steam)
    }
    public Transition slide = new Slide(Gravity.RIGHT);
    public void roll_func(View view){ TransitionManager.go(scene_roll, slide); scene_nr = 1;}
    public void see_saw(View view){ TransitionManager.go(scene_see_saw, slide); scene_nr = 1;}
    public void hit_parade(View view){ TransitionManager.go(scene_hit_parade, slide);  scene_nr = 1;}
    public void block_party(View view){ TransitionManager.go(scene_block_party, slide);  scene_nr = 1;}
    public void rock(View view){ TransitionManager.go(scene_rock, slide); scene_nr = 1; }
    public void egg_scramble(View view){ TransitionManager.go(scene_egg_scramble, slide);  scene_nr = 1;}
    public void dizzy_heights(View view){ TransitionManager.go(scene_dizzy_heights, slide);  scene_nr = 1;}
    public void hoopsie_daisy(View view){ TransitionManager.go(scene_hoopsie_daisy, slide); scene_nr = 1;}
    public void whirlygig(View view){ TransitionManager.go(scene_whirlygig, slide); scene_nr = 1;}
    public void slime_climb(View view){ TransitionManager.go(scene_slime_climb, slide); scene_nr = 1; }
    public void fruit_chute(View view){ TransitionManager.go(scene_fruit_chute, slide); scene_nr = 1;}
    public void jump_club(View view){ TransitionManager.go(scene_jump_club, slide);  scene_nr = 1;}
    public void hoarders(View view){ TransitionManager.go(scene_hoarders, slide); scene_nr = 1;}
    public void fall_ball(View view){ TransitionManager.go(scene_fall_ball, slide);  scene_nr = 1;}
    public void jinxed(View view){ TransitionManager.go(scene_jinxed, slide);  scene_nr = 1;}
    public void tip_toe(View view){ TransitionManager.go(scene_tip_toe, slide);  scene_nr = 1;}
    public void tail_tag(View view){ TransitionManager.go(scene_tail_tag, slide);  scene_nr = 1;}
    public void team_tail_tag(View view){ TransitionManager.go(scene_team_tail_tag, slide);  scene_nr = 1;}
    public void royal_fumble(View view){ TransitionManager.go(scene_royal_fumble, slide);  scene_nr = 1;}
    public void fall_mountain(View view){ TransitionManager.go(scene_fall_mountain, slide);  scene_nr = 1;}
    public void hex_a_gone(View view){ TransitionManager.go(scene_hex_a_gone, slide);  scene_nr = 1;}
    public void jump_showdown(View view){ TransitionManager.go(scene_jump_showdown, slide);  scene_nr = 1;}
    public void door_dash(View view){ TransitionManager.go(scene_door_dash, slide);  scene_nr = 1;}
    public void gate_crash(View view){ TransitionManager.go(scene_gate_crash, slide);  scene_nr = 1;}
    public void perfect_match(View view){ TransitionManager.go(scene_perfect_match, slide);  scene_nr = 1;}
//  function to go in tips menu
    public void back(View view){ TransitionManager.go(scene_main, slide); }
//
    @Override
    public void onBackPressed() {
        if (scene_nr == 1) {
            back(null);
            scene_nr = 0;
        }else if(scene_nr == 0){
            this.finish();
        }
    }
}