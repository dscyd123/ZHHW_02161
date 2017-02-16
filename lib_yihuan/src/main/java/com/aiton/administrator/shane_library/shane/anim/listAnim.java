package com.aiton.administrator.shane_library.shane.anim;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.aiton.administrator.shane_library.R;

/**
 * Created  on 2016/11/17.
 */

public class listAnim {
    private static int mLastPosition = -1;
    private static final int DELAY = 138;
    public static void showItemAnim(final View view, final int position) {
        final Context context = view.getContext();
        if (position > mLastPosition) {
            view.setAlpha(0);
            view.postDelayed(
                    new Runnable() {
                        @Override
                        public void run() {
                            Animation animation = AnimationUtils.loadAnimation(context,
                                    R.anim.slide_in_right);
                            animation.setAnimationListener(new Animation.AnimationListener() {
                                @Override
                                public void onAnimationStart(Animation animation) {
                                    view.setAlpha(1);
                                }


                                @Override
                                public void onAnimationEnd(Animation animation) {
                                }


                                @Override
                                public void onAnimationRepeat(Animation animation) {
                                }

                            });
                            view.startAnimation(animation);
                        }
                    }
                    , DELAY * position);
            mLastPosition = position;
        }
    }
}
