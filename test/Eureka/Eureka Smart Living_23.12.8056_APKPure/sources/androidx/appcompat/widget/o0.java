package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

/* loaded from: classes.dex */
public class o0 extends RatingBar {

    /* renamed from: a, reason: collision with root package name */
    private final m0 f1182a;

    public o0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.E);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i6, int i7) {
        super.onMeasure(i6, i7);
        Bitmap b6 = this.f1182a.b();
        if (b6 != null) {
            setMeasuredDimension(View.resolveSizeAndState(b6.getWidth() * getNumStars(), i6, 0), getMeasuredHeight());
        }
    }

    public o0(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        y2.a(this, getContext());
        m0 m0Var = new m0(this);
        this.f1182a = m0Var;
        m0Var.c(attributeSet, i6);
    }
}
