package y2;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.n0;
import androidx.core.widget.c;
import m2.i;

/* loaded from: classes.dex */
public class a extends n0 {

    /* renamed from: g, reason: collision with root package name */
    private static final int f9895g = i.f7695l;

    /* renamed from: h, reason: collision with root package name */
    private static final int[][] f9896h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f9897e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f9898f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m2.a.H);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9897e == null) {
            int d6 = r2.a.d(this, m2.a.f7552f);
            int d7 = r2.a.d(this, m2.a.f7555i);
            int d8 = r2.a.d(this, m2.a.f7558l);
            int[][] iArr = f9896h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = r2.a.j(d8, d6, 1.0f);
            iArr2[1] = r2.a.j(d8, d7, 0.54f);
            iArr2[2] = r2.a.j(d8, d7, 0.38f);
            iArr2[3] = r2.a.j(d8, d7, 0.38f);
            this.f9897e = new ColorStateList(iArr, iArr2);
        }
        return this.f9897e;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9898f && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z5) {
        this.f9898f = z5;
        c.d(this, z5 ? getMaterialThemeColorsTintList() : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = y2.a.f9895g
            android.content.Context r8 = f3.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = m2.j.f7746g3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.l.i(r0, r1, r2, r3, r4, r5)
            int r10 = m2.j.f7753h3
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L2a
            int r10 = m2.j.f7753h3
            android.content.res.ColorStateList r8 = z2.c.a(r8, r9, r10)
            androidx.core.widget.c.d(r7, r8)
        L2a:
            int r8 = m2.j.f7760i3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f9898f = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y2.a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
