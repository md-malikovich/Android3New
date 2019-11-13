package com.e.android3new.ui.onboard;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.e.android3new.R;
import com.e.android3new.data.entity.OnBoardEntity;
import com.e.android3new.ui.main.MainActivity;
import java.util.ArrayList;
import me.relex.circleindicator.CircleIndicator;

public class OnBoardActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private ViewPager viewPager;
    //private CircleIndicator circleIndicator; //TODO:
    private OnBoardAdapter boardAdapter;
    private Button btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_board);
        initViews();
        setupViewPager();
        setupClickListeners();
        onNextClick();
    }

    private void setupClickListeners() {
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
            }
        });
    }

    private void setupViewPager() {
        boardAdapter = new OnBoardAdapter(getResource());
        //circleIndicator.setViewPager(viewPager); //TODO:
        viewPager.setAdapter(boardAdapter);
    }

    public void initViews() {
        btnNext = findViewById(R.id.btn_next);
        viewPager = findViewById(R.id.view_pager);
        //circleIndicator = findViewById(R.id.circle); //TODO:
        toolbar = findViewById(R.id.toolbarTransparent);
        setSupportActionBar(toolbar);
    }

    private ArrayList<OnBoardEntity> getResource() {
    ArrayList<OnBoardEntity> list = new ArrayList<>();
        list.add(new OnBoardEntity("Here you are may learn!", R.drawable.hi));
        list.add(new OnBoardEntity("Here you are may delete!", R.drawable.delete));
        list.add(new OnBoardEntity("Here you are may update!", R.drawable.update));
        list.add(new OnBoardEntity("Thanks that you are with us!", R.drawable.thankyou));
        return list;
}

    public static void start(Context context) {
        context.startActivity(new Intent(context, OnBoardActivity.class));
    }

    @Override
    public void overridePendingTransition(int enterAnim, int exitAnim) {
        super.overridePendingTransition(enterAnim, exitAnim);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.skip:
                MainActivity.start(this);
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    public void onNextClick() {
        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                //
            }

            @Override
            public void onPageSelected(int position) {
                if (viewPager.getCurrentItem() == 3) {
                    btnNext.setText("Finish");
                    btnNext.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            MainActivity.start(OnBoardActivity.this);
                        }
                    });
                } else {
                    btnNext.setText("Next");
                    btnNext.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            //&&&
                        }
                    });
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {
                //
            }
        });
    }
}
