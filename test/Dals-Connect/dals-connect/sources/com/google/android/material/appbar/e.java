package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.j;
import e.e.b.b.g;

/* compiled from: ViewUtilsLollipop.java */
/* loaded from: classes2.dex */
class e {
    private static final int[] a = {R.attr.stateListAnimator};

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(View view, float f2) {
        int integer = view.getResources().getInteger(g.a);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.enabled, e.e.b.b.b.F, -e.e.b.b.b.G}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.enabled}, ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(View view, AttributeSet attributeSet, int i2, int i3) {
        Context context = view.getContext();
        TypedArray h2 = j.h(context, attributeSet, a, i2, i3, new int[0]);
        try {
            if (h2.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, h2.getResourceId(0, 0)));
            }
        } finally {
            h2.recycle();
        }
    }
}
