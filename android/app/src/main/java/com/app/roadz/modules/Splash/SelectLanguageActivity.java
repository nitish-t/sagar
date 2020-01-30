package com.app.roadz.modules.Splash;

import android.content.Intent;
import android.widget.LinearLayout;

import com.app.roadz.R;
import com.app.roadz.app.MainApplication;
import com.app.roadz.modules.AdsSlider.ImageSliderActivity_;
import com.app.roadz.modules.base.BaseActivity;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;


@EActivity(R.layout.activity_select_language)
public class SelectLanguageActivity extends BaseActivity {

    @ViewById(R.id.languageLayout)
    protected LinearLayout languageLayout;



    @AfterViews
    protected void AfterViews() {

    }

    private void NextScreenAction() {
        this.finish();
        ImageSliderActivity_.intent(SelectLanguageActivity.this).
                flags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK  ).start();
    }

    @Click(R.id.englishBtn)
    protected void englishBtn() {
        MainApplication.sMyPrefs.SelectLanguage().put(true);
        if (MainApplication.ISlocaleArabic(this)) {

            MainApplication.changeLanguage(this, "en", ImageSliderActivity_.class);

        } else {
            NextScreenAction();
        }
    }


    @Click(R.id.arabicBtn)
    protected void arabicBtn() {
        MainApplication.sMyPrefs.SelectLanguage().put(true);
        if (!MainApplication.ISlocaleArabic(this)) {
            MainApplication.changeLanguage(this, "ar", ImageSliderActivity_.class);

        } else {
            NextScreenAction();
        }

    }

}
