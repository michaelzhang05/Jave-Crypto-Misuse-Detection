package com.mbridge.msdk.video.dynview.j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBTextView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private String f22149a = "mbridge_top_play_bg";

    /* renamed from: b, reason: collision with root package name */
    private String f22150b = "mbridge_top_finger_bg";

    /* renamed from: c, reason: collision with root package name */
    private String f22151c = "mbridge_bottom_play_bg";

    /* renamed from: d, reason: collision with root package name */
    private String f22152d = "mbridge_bottom_finger_bg";

    /* renamed from: e, reason: collision with root package name */
    private String f22153e = "mbridge_tv_count";

    /* renamed from: f, reason: collision with root package name */
    private String f22154f = "mbridge_sound_switch";

    /* renamed from: g, reason: collision with root package name */
    private String f22155g = "mbridge_top_control";

    /* renamed from: h, reason: collision with root package name */
    private String f22156h = "mbridge_tv_title";

    /* renamed from: i, reason: collision with root package name */
    private String f22157i = "mbridge_tv_desc";

    /* renamed from: j, reason: collision with root package name */
    private String f22158j = "mbridge_tv_install";

    /* renamed from: k, reason: collision with root package name */
    private String f22159k = "mbridge_sv_starlevel";

    /* renamed from: l, reason: collision with root package name */
    private String f22160l = "mbridge_sv_heat_count_level";

    /* renamed from: m, reason: collision with root package name */
    private String f22161m = "mbridge_tv_cta";

    /* renamed from: n, reason: collision with root package name */
    private String f22162n = "mbridge_native_ec_controller";

    /* renamed from: o, reason: collision with root package name */
    private String f22163o = "mbridge_reward_shape_choice_rl";

    /* renamed from: p, reason: collision with root package name */
    private String f22164p = "#FFFFFF";

    /* renamed from: q, reason: collision with root package name */
    private String f22165q = "#FF000000";

    /* renamed from: r, reason: collision with root package name */
    private String f22166r = "#40000000";

    /* renamed from: s, reason: collision with root package name */
    private String f22167s = "#CAEF79";

    /* renamed from: t, reason: collision with root package name */
    private String f22168t = "#2196F3";

    /* renamed from: u, reason: collision with root package name */
    private String f22169u = "#402196F3";

    /* renamed from: v, reason: collision with root package name */
    private String f22170v = "#8FC31F";

    /* renamed from: w, reason: collision with root package name */
    private String f22171w = "#03A9F4";

    /* renamed from: x, reason: collision with root package name */
    private String f22172x = "#FF89C120";

    /* renamed from: y, reason: collision with root package name */
    private String f22173y = "#FF2BAE5D";

    /* renamed from: z, reason: collision with root package name */
    private boolean f22174z = false;

    public final void a(View view, Map<String, Object> map) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (view == null || !(view instanceof MBridgeFramLayout)) {
            return;
        }
        MBridgeFramLayout mBridgeFramLayout = (MBridgeFramLayout) view;
        AnimatorSet animatorSet = new AnimatorSet();
        if (view.getContext() != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f22174z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f22174z) {
                imageView = (ImageView) view.findViewById(b(this.f22149a));
                imageView2 = (ImageView) view.findViewById(b(this.f22150b));
                imageView3 = (ImageView) view.findViewById(b(this.f22151c));
                imageView4 = (ImageView) view.findViewById(b(this.f22152d));
            } else {
                imageView = (ImageView) view.findViewById(a(this.f22149a));
                imageView2 = (ImageView) view.findViewById(a(this.f22150b));
                imageView3 = (ImageView) view.findViewById(a(this.f22151c));
                imageView4 = (ImageView) view.findViewById(a(this.f22152d));
            }
            ObjectAnimator a8 = imageView != null ? new com.mbridge.msdk.video.dynview.h.b().a(imageView) : null;
            ObjectAnimator b8 = imageView2 != null ? new com.mbridge.msdk.video.dynview.h.b().b(imageView2) : null;
            ObjectAnimator a9 = imageView3 != null ? new com.mbridge.msdk.video.dynview.h.b().a(imageView3) : null;
            ObjectAnimator b9 = imageView4 != null ? new com.mbridge.msdk.video.dynview.h.b().b(imageView4) : null;
            if (a8 == null || a9 == null || b8 == null || b9 == null) {
                return;
            }
            animatorSet.playTogether(a8, a9, b8, b9);
            mBridgeFramLayout.setAnimatorSet(animatorSet);
        }
    }

    public final void b(View view, com.mbridge.msdk.video.dynview.c cVar, Map<String, Object> map) {
        LinearLayout linearLayout;
        View findViewById;
        if (view == null || cVar == null) {
            return;
        }
        if (view.getContext() != null) {
            if (map != null && map.containsKey("is_dy_success")) {
                this.f22174z = ((Boolean) map.get("is_dy_success")).booleanValue();
            }
            if (this.f22174z) {
                linearLayout = (LinearLayout) view.findViewById(b(this.f22159k));
                findViewById = view.findViewById(b(this.f22161m));
            } else {
                linearLayout = (LinearLayout) view.findViewById(a(this.f22159k));
                findViewById = view.findViewById(a(this.f22161m));
            }
            View view2 = findViewById;
            if (linearLayout != null && (linearLayout instanceof MBridgeLevelLayoutView)) {
                if (cVar.e() == 1) {
                    linearLayout.setOrientation(1);
                } else {
                    linearLayout.setOrientation(0);
                }
            }
            if (linearLayout != null && (linearLayout instanceof MBStarLevelLayoutView)) {
                linearLayout.setOrientation(0);
            }
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(a(this.f22162n));
            if (relativeLayout != null) {
                if (cVar.e() == 1) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams.setMargins(layoutParams.leftMargin + com.mbridge.msdk.video.dynview.a.a.f21993a, layoutParams.topMargin + com.mbridge.msdk.video.dynview.a.a.f21995c, layoutParams.rightMargin + com.mbridge.msdk.video.dynview.a.a.f21994b, layoutParams.bottomMargin + com.mbridge.msdk.video.dynview.a.a.f21996d);
                    relativeLayout.setLayoutParams(layoutParams);
                } else {
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams2.setMargins(layoutParams2.leftMargin + com.mbridge.msdk.video.dynview.a.a.f21993a, layoutParams2.topMargin + com.mbridge.msdk.video.dynview.a.a.f21995c, layoutParams2.rightMargin + com.mbridge.msdk.video.dynview.a.a.f21994b, layoutParams2.bottomMargin + com.mbridge.msdk.video.dynview.a.a.f21996d);
                    relativeLayout.setLayoutParams(layoutParams2);
                }
            }
            if (view2 != null) {
                if (view2 instanceof TextView) {
                    TextView textView = (TextView) view2;
                    textView.setTextColor(Color.parseColor(this.f22164p));
                    textView.setTextSize(22.0f);
                    com.mbridge.msdk.video.dynview.i.b.a.a(view2, 1.0f, cVar.i() == 1302 ? 25 : 5, this.f22167s, new String[]{this.f22172x, this.f22173y}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                int i8 = cVar.i();
                if (i8 == 404 || i8 == 704 || i8 == 1402) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new com.mbridge.msdk.video.dynview.h.b().c(view2));
                    animatorSet.addListener(new Animator.AnimatorListener() { // from class: com.mbridge.msdk.video.dynview.j.b.1
                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationCancel(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        @Override // android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                        }
                    });
                    if (view instanceof MBFrameLayout) {
                        ((MBFrameLayout) view).setAnimator(animatorSet);
                    }
                    if (view instanceof MBridgeFramLayout) {
                        ((MBridgeFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof MBridgeRelativeLayout) {
                        ((MBridgeRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                }
            }
        }
        new com.mbridge.msdk.video.dynview.h.b().c(view, 500L);
    }

    public final void a(View view, com.mbridge.msdk.video.dynview.c cVar, Map<String, Object> map) {
        TextView textView;
        TextView textView2;
        String str;
        String str2;
        RelativeLayout relativeLayout;
        Context context = view != null ? view.getContext() : null;
        if (context == null || cVar == null) {
            return;
        }
        if (map != null && map.containsKey("is_dy_success")) {
            boolean booleanValue = ((Boolean) map.get("is_dy_success")).booleanValue();
            this.f22174z = booleanValue;
            if (booleanValue) {
                textView = (TextView) view.findViewById(b(this.f22153e));
                textView2 = (TextView) view.findViewById(b("mbridge_reward_click_tv"));
            } else {
                textView = (TextView) view.findViewById(a(this.f22153e));
                textView2 = (TextView) view.findViewById(a("mbridge_reward_click_tv"));
            }
        } else {
            textView = (TextView) view.findViewById(a(this.f22153e));
            textView2 = (TextView) view.findViewById(a("mbridge_reward_click_tv"));
        }
        if (textView != null) {
            textView.setBackgroundResource(v.a(context, "mbridge_reward_shape_progress", "drawable"));
            textView.setTextColor(Color.parseColor(this.f22164p));
            textView.setTextSize(11.0f);
        }
        if (textView2 != null) {
            textView2.setTextSize(20.0f);
            if (textView2 instanceof MBridgeTextView) {
                ((MBridgeTextView) textView2).setObjectAnimator(new com.mbridge.msdk.video.dynview.h.b().c(textView2));
            }
            if (textView2 instanceof MBTextView) {
                ((MBTextView) textView2).setAnimator(new com.mbridge.msdk.video.dynview.h.b().c(textView2));
            }
        }
        String str3 = this.f22165q;
        String str4 = this.f22167s;
        int i8 = cVar.i();
        float f8 = 10.0f;
        float f9 = 1.0f;
        if (i8 == 302) {
            str = this.f22168t;
            str2 = this.f22171w;
            str3 = this.f22164p;
            str4 = this.f22169u;
        } else if (i8 == 802) {
            str = this.f22164p;
            str3 = this.f22165q;
            str4 = this.f22166r;
            f8 = 25.0f;
            str2 = str;
            f9 = 0.5f;
        } else if (i8 != 5002010) {
            str = this.f22170v;
            str2 = this.f22167s;
            f8 = 5.0f;
        } else {
            str = this.f22170v;
            str3 = this.f22164p;
            str4 = str;
            str2 = str4;
        }
        if (textView2 != null) {
            textView2.setTextColor(Color.parseColor(str3));
            com.mbridge.msdk.video.dynview.i.b.a.a(textView2, f9, f8, str4, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
        }
        if (cVar.f() != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cVar.f().getLayoutParams();
            layoutParams.setMargins(0, 0, 0, 0);
            cVar.f().setLayoutParams(layoutParams);
        }
        if (this.f22174z) {
            relativeLayout = (RelativeLayout) view.findViewById(b(this.f22155g));
        } else {
            relativeLayout = (RelativeLayout) view.findViewById(a(this.f22155g));
        }
        if (relativeLayout != null) {
            if (com.mbridge.msdk.video.dynview.a.a.f21993a == 0 && com.mbridge.msdk.video.dynview.a.a.f21994b == 0 && com.mbridge.msdk.video.dynview.a.a.f21995c == 0 && com.mbridge.msdk.video.dynview.a.a.f21996d == 0) {
                return;
            }
            relativeLayout.setVisibility(4);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
            alphaAnimation.setDuration(200L);
            relativeLayout.startAnimation(alphaAnimation);
            relativeLayout.setVisibility(0);
        }
    }

    private int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        return str.hashCode();
    }

    public final void a(View view, com.mbridge.msdk.video.dynview.c cVar) {
        Context context;
        int a8;
        if (view == null || cVar == null || (context = view.getContext()) == null) {
            return;
        }
        if (cVar.e() == 1) {
            view.setBackground(context.getResources().getDrawable(v.a(context, this.f22163o, "drawable")));
            TextView textView = (TextView) view.findViewById(a(this.f22156h));
            if (textView != null) {
                textView.setTextColor(Color.parseColor(this.f22165q));
            }
            TextView textView2 = (TextView) view.findViewById(a(this.f22157i));
            if (textView2 != null) {
                textView2.setTextColor(Color.parseColor(this.f22165q));
            }
            a8 = ai.a(context, 2.0f);
        } else {
            a8 = ai.a(context, 10.0f);
            view.getBackground().setAlpha(100);
        }
        int a9 = ai.a(context, 8.0f);
        View findViewById = view.findViewById(a(this.f22158j));
        if (findViewById != null) {
            if (cVar.f() != null && (cVar.f() instanceof MBridgeClickCTAView)) {
                ((MBridgeClickCTAView) cVar.f()).setObjectAnimator(new com.mbridge.msdk.video.dynview.h.b().c(findViewById));
            }
            if (findViewById instanceof TextView) {
                TextView textView3 = (TextView) findViewById;
                textView3.setTextColor(Color.parseColor(this.f22164p));
                textView3.setTextSize(15.0f);
                String str = this.f22170v;
                String str2 = this.f22167s;
                com.mbridge.msdk.video.dynview.i.b.a.a(textView3, 1.0f, 5.0f, str2, new String[]{str, str2}, GradientDrawable.Orientation.LEFT_RIGHT);
            }
        }
        if (view.getLayoutParams() == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(a8, a8, a8, a9);
            layoutParams.height = ai.a(context, 60.0f);
            view.setLayoutParams(layoutParams);
        }
    }

    private int a(String str) {
        return v.a(com.mbridge.msdk.foundation.controller.c.m().c(), str, "id");
    }
}
