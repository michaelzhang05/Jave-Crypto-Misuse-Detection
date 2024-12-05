package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: classes.dex */
public class r0 extends SeekBar {

    /* renamed from: a, reason: collision with root package name */
    private final s0 f1202a;

    public r0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.G);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1202a.h();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1202a.i();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1202a.g(canvas);
    }

    public r0(Context context, AttributeSet attributeSet, int i6) {
        super(context, attributeSet, i6);
        y2.a(this, getContext());
        s0 s0Var = new s0(this);
        this.f1202a = s0Var;
        s0Var.c(attributeSet, i6);
    }
}
