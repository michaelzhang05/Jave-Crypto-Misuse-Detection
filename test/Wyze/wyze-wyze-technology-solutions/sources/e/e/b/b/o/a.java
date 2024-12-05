package e.e.b.b.o;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.e;
import e.e.b.b.b;
import e.e.b.b.k;

/* compiled from: MaterialCheckBox.java */
/* loaded from: classes2.dex */
public class a extends e {

    /* renamed from: i, reason: collision with root package name */
    private static final int f17520i = k.t;

    /* renamed from: j, reason: collision with root package name */
    private static final int[][] f17521j = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f17522k;
    private boolean l;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f17426g);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f17522k == null) {
            int[][] iArr = f17521j;
            int[] iArr2 = new int[iArr.length];
            int c2 = e.e.b.b.q.a.c(this, b.f17429j);
            int c3 = e.e.b.b.q.a.c(this, b.o);
            int c4 = e.e.b.b.q.a.c(this, b.l);
            iArr2[0] = e.e.b.b.q.a.f(c3, c2, 1.0f);
            iArr2[1] = e.e.b.b.q.a.f(c3, c4, 0.54f);
            iArr2[2] = e.e.b.b.q.a.f(c3, c4, 0.38f);
            iArr2[3] = e.e.b.b.q.a.f(c3, c4, 0.38f);
            this.f17522k = new ColorStateList(iArr, iArr2);
        }
        return this.f17522k;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l && androidx.core.widget.e.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.l = z;
        if (z) {
            androidx.core.widget.e.c(this, getMaterialThemeColorsTintList());
        } else {
            androidx.core.widget.e.c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = e.e.b.b.o.a.f17520i
            android.content.Context r8 = com.google.android.material.theme.a.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = e.e.b.b.l.q3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.j.h(r0, r1, r2, r3, r4, r5)
            int r10 = e.e.b.b.l.r3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = e.e.b.b.w.c.a(r8, r9, r10)
            androidx.core.widget.e.c(r7, r8)
        L28:
            int r8 = e.e.b.b.l.s3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.l = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e.e.b.b.o.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
