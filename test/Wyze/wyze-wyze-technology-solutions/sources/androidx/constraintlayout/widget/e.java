package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: Constraints.java */
/* loaded from: classes.dex */
public class e extends ViewGroup {

    /* renamed from: f, reason: collision with root package name */
    d f764f;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        return new a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    public d getConstraintSet() {
        if (this.f764f == null) {
            this.f764f = new d();
        }
        this.f764f.g(this);
        return this.f764f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    /* compiled from: Constraints.java */
    /* loaded from: classes.dex */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float p0;
        public boolean q0;
        public float r0;
        public float s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public a(int i2, int i3) {
            super(i2, i3);
            this.p0 = 1.0f;
            this.q0 = false;
            this.r0 = 0.0f;
            this.s0 = 0.0f;
            this.t0 = 0.0f;
            this.u0 = 0.0f;
            this.v0 = 1.0f;
            this.w0 = 1.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
        }

        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.p0 = 1.0f;
            this.q0 = false;
            this.r0 = 0.0f;
            this.s0 = 0.0f;
            this.t0 = 0.0f;
            this.u0 = 0.0f;
            this.v0 = 1.0f;
            this.w0 = 1.0f;
            this.x0 = 0.0f;
            this.y0 = 0.0f;
            this.z0 = 0.0f;
            this.A0 = 0.0f;
            this.B0 = 0.0f;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.p2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == i.q2) {
                    this.p0 = obtainStyledAttributes.getFloat(index, this.p0);
                } else if (index == i.B2) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        this.r0 = obtainStyledAttributes.getFloat(index, this.r0);
                        this.q0 = true;
                    }
                } else if (index == i.y2) {
                    this.t0 = obtainStyledAttributes.getFloat(index, this.t0);
                } else if (index == i.z2) {
                    this.u0 = obtainStyledAttributes.getFloat(index, this.u0);
                } else if (index == i.x2) {
                    this.s0 = obtainStyledAttributes.getFloat(index, this.s0);
                } else if (index == i.v2) {
                    this.v0 = obtainStyledAttributes.getFloat(index, this.v0);
                } else if (index == i.w2) {
                    this.w0 = obtainStyledAttributes.getFloat(index, this.w0);
                } else if (index == i.r2) {
                    this.x0 = obtainStyledAttributes.getFloat(index, this.x0);
                } else if (index == i.s2) {
                    this.y0 = obtainStyledAttributes.getFloat(index, this.y0);
                } else if (index == i.t2) {
                    this.z0 = obtainStyledAttributes.getFloat(index, this.z0);
                } else if (index == i.u2) {
                    this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                } else if (index == i.A2 && Build.VERSION.SDK_INT >= 21) {
                    this.B0 = obtainStyledAttributes.getFloat(index, this.B0);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }
}
