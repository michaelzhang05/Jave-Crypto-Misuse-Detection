package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.b1;
import c3.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m2.j;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class e extends ConstraintLayout {

    /* renamed from: x, reason: collision with root package name */
    private final Runnable f5422x;

    /* renamed from: y, reason: collision with root package name */
    private int f5423y;

    /* renamed from: z, reason: collision with root package name */
    private c3.g f5424z;

    public e(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        LayoutInflater.from(context).inflate(m2.g.f7648g, this);
        b1.u0(this, u());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.U3, i6, 0);
        this.f5423y = obtainStyledAttributes.getDimensionPixelSize(j.V3, 0);
        this.f5422x = new Runnable() { // from class: com.google.android.material.timepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                e.this.z();
            }
        };
        obtainStyledAttributes.recycle();
    }

    private void A() {
        Handler handler = getHandler();
        if (handler != null) {
            handler.removeCallbacks(this.f5422x);
            handler.post(this.f5422x);
        }
    }

    private void t(List list, androidx.constraintlayout.widget.d dVar, int i6) {
        Iterator it = list.iterator();
        float f6 = 0.0f;
        while (it.hasNext()) {
            dVar.g(((View) it.next()).getId(), m2.e.f7617c, i6, f6);
            f6 += 360.0f / list.size();
        }
    }

    private Drawable u() {
        c3.g gVar = new c3.g();
        this.f5424z = gVar;
        gVar.P(new i(0.5f));
        this.f5424z.R(ColorStateList.valueOf(-1));
        return this.f5424z;
    }

    private static boolean y(View view) {
        return "skip".equals(view.getTag());
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void addView(View view, int i6, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i6, layoutParams);
        if (view.getId() == -1) {
            view.setId(b1.m());
        }
        A();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        z();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i6) {
        this.f5424z.R(ColorStateList.valueOf(i6));
    }

    int v(int i6) {
        return i6 == 2 ? Math.round(this.f5423y * 0.66f) : this.f5423y;
    }

    public int w() {
        return this.f5423y;
    }

    public void x(int i6) {
        this.f5423y = i6;
        z();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void z() {
        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
        dVar.f(this);
        HashMap hashMap = new HashMap();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getId() != m2.e.f7617c && !y(childAt)) {
                int i7 = (Integer) childAt.getTag(m2.e.f7627m);
                if (i7 == null) {
                    i7 = 1;
                }
                if (!hashMap.containsKey(i7)) {
                    hashMap.put(i7, new ArrayList());
                }
                ((List) hashMap.get(i7)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            t((List) entry.getValue(), dVar, v(((Integer) entry.getKey()).intValue()));
        }
        dVar.c(this);
    }
}
