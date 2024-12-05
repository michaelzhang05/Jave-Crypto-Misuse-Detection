package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.b1;
import m2.e;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private TextView f5183a;

    /* renamed from: b, reason: collision with root package name */
    private Button f5184b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeInterpolator f5185c;

    /* renamed from: d, reason: collision with root package name */
    private int f5186d;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5185c = x2.a.g(context, m2.a.E, n2.a.f7962b);
    }

    private static void a(View view, int i6, int i7) {
        if (b1.W(view)) {
            b1.E0(view, b1.J(view), i6, b1.I(view), i7);
        } else {
            view.setPadding(view.getPaddingLeft(), i6, view.getPaddingRight(), i7);
        }
    }

    private boolean b(int i6, int i7, int i8) {
        boolean z5;
        if (i6 != getOrientation()) {
            setOrientation(i6);
            z5 = true;
        } else {
            z5 = false;
        }
        if (this.f5183a.getPaddingTop() == i7 && this.f5183a.getPaddingBottom() == i8) {
            return z5;
        }
        a(this.f5183a, i7, i8);
        return true;
    }

    public Button getActionView() {
        return this.f5184b;
    }

    public TextView getMessageView() {
        return this.f5183a;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f5183a = (TextView) findViewById(e.I);
        this.f5184b = (Button) findViewById(e.H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (b(1, r0, r0 - r2) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        if (r1 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (b(0, r0, r0) != false) goto L26;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = m2.c.f7582d
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = m2.c.f7581c
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f5183a
            android.text.Layout r3 = r3.getLayout()
            r4 = 0
            if (r3 == 0) goto L30
            int r3 = r3.getLineCount()
            if (r3 <= r1) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            if (r3 == 0) goto L4a
            int r5 = r7.f5186d
            if (r5 <= 0) goto L4a
            android.widget.Button r5 = r7.f5184b
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f5186d
            if (r5 <= r6) goto L4a
            int r2 = r0 - r2
            boolean r0 = r7.b(r1, r0, r2)
            if (r0 == 0) goto L55
            goto L56
        L4a:
            if (r3 == 0) goto L4d
            goto L4e
        L4d:
            r0 = r2
        L4e:
            boolean r0 = r7.b(r4, r0, r0)
            if (r0 == 0) goto L55
            goto L56
        L55:
            r1 = 0
        L56:
            if (r1 == 0) goto L5b
            super.onMeasure(r8, r9)
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i6) {
        this.f5186d = i6;
    }
}
