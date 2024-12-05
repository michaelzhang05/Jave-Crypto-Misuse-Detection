package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f800a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f801b;

    /* renamed from: c, reason: collision with root package name */
    private int f802c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f802c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.j.N0);
        androidx.core.view.b1.o0(this, context, d.j.N0, attributeSet, obtainStyledAttributes, 0, 0);
        this.f800a = obtainStyledAttributes.getBoolean(d.j.O0, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f800a);
        }
    }

    private int a(int i6) {
        int childCount = getChildCount();
        while (i6 < childCount) {
            if (getChildAt(i6).getVisibility() == 0) {
                return i6;
            }
            i6++;
        }
        return -1;
    }

    private boolean b() {
        return this.f801b;
    }

    private void setStacked(boolean z5) {
        if (this.f801b != z5) {
            if (!z5 || this.f800a) {
                this.f801b = z5;
                setOrientation(z5 ? 1 : 0);
                setGravity(z5 ? 8388613 : 80);
                View findViewById = findViewById(d.f.G);
                if (findViewById != null) {
                    findViewById.setVisibility(z5 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i6, int i7) {
        int i8;
        boolean z5;
        int size = View.MeasureSpec.getSize(i6);
        int i9 = 0;
        if (this.f800a) {
            if (size > this.f802c && b()) {
                setStacked(false);
            }
            this.f802c = size;
        }
        if (b() || View.MeasureSpec.getMode(i6) != 1073741824) {
            i8 = i6;
            z5 = false;
        } else {
            i8 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z5 = true;
        }
        super.onMeasure(i8, i7);
        if (this.f800a && !b()) {
            if ((getMeasuredWidthAndState() & (-16777216)) == 16777216) {
                setStacked(true);
                z5 = true;
            }
        }
        if (z5) {
            super.onMeasure(i6, i7);
        }
        int a6 = a(0);
        if (a6 >= 0) {
            View childAt = getChildAt(a6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a7 = a(a6 + 1);
                if (a7 >= 0) {
                    paddingTop += getChildAt(a7).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i9 = paddingTop;
            } else {
                i9 = paddingTop + getPaddingBottom();
            }
        }
        if (androidx.core.view.b1.F(this) != i9) {
            setMinimumHeight(i9);
            if (i7 == 0) {
                super.onMeasure(i6, i7);
            }
        }
    }

    public void setAllowStacking(boolean z5) {
        if (this.f800a != z5) {
            this.f800a = z5;
            if (!z5 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
