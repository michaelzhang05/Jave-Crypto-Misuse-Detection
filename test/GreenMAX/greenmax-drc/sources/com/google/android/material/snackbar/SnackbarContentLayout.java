package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.u;
import e.e.b.b.f;
import e.e.b.b.l;

/* loaded from: classes2.dex */
public class SnackbarContentLayout extends LinearLayout implements a {

    /* renamed from: f, reason: collision with root package name */
    private TextView f16733f;

    /* renamed from: g, reason: collision with root package name */
    private Button f16734g;

    /* renamed from: h, reason: collision with root package name */
    private int f16735h;

    /* renamed from: i, reason: collision with root package name */
    private int f16736i;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.h4);
        this.f16735h = obtainStyledAttributes.getDimensionPixelSize(l.i4, -1);
        this.f16736i = obtainStyledAttributes.getDimensionPixelSize(l.p4, -1);
        obtainStyledAttributes.recycle();
    }

    private static void d(View view, int i2, int i3) {
        if (u.Q(view)) {
            u.w0(view, u.D(view), i2, u.C(view), i3);
        } else {
            view.setPadding(view.getPaddingLeft(), i2, view.getPaddingRight(), i3);
        }
    }

    private boolean e(int i2, int i3, int i4) {
        boolean z;
        if (i2 != getOrientation()) {
            setOrientation(i2);
            z = true;
        } else {
            z = false;
        }
        if (this.f16733f.getPaddingTop() == i3 && this.f16733f.getPaddingBottom() == i4) {
            return z;
        }
        d(this.f16733f, i3, i4);
        return true;
    }

    @Override // com.google.android.material.snackbar.a
    public void a(int i2, int i3) {
        this.f16733f.setAlpha(0.0f);
        long j2 = i3;
        long j3 = i2;
        this.f16733f.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f16734g.getVisibility() == 0) {
            this.f16734g.setAlpha(0.0f);
            this.f16734g.animate().alpha(1.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    @Override // com.google.android.material.snackbar.a
    public void b(int i2, int i3) {
        this.f16733f.setAlpha(1.0f);
        long j2 = i3;
        long j3 = i2;
        this.f16733f.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        if (this.f16734g.getVisibility() == 0) {
            this.f16734g.setAlpha(1.0f);
            this.f16734g.animate().alpha(0.0f).setDuration(j2).setStartDelay(j3).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(float f2) {
        if (f2 != 1.0f) {
            this.f16734g.setTextColor(e.e.b.b.q.a.f(e.e.b.b.q.a.c(this, e.e.b.b.b.o), this.f16734g.getCurrentTextColor(), f2));
        }
    }

    public Button getActionView() {
        return this.f16734g;
    }

    public TextView getMessageView() {
        return this.f16733f;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f16733f = (TextView) findViewById(f.x);
        this.f16734g = (Button) findViewById(f.w);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
    
        if (e(1, r0, r0 - r1) != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (e(0, r0, r0) != false) goto L24;
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
            int r0 = r7.f16735h
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.f16735h
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = e.e.b.b.d.o
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = e.e.b.b.d.n
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.f16733f
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.f16736i
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.f16734g
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f16736i
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.e(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.e(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = 1
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i2) {
        this.f16736i = i2;
    }
}
