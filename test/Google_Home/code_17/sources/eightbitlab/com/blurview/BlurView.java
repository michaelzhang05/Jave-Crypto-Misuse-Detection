package eightbitlab.com.blurview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes5.dex */
public class BlurView extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    private static final String f31823c = "BlurView";

    /* renamed from: a, reason: collision with root package name */
    a f31824a;

    /* renamed from: b, reason: collision with root package name */
    private int f31825b;

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31824a = new b();
        a(attributeSet, 0);
    }

    private void a(AttributeSet attributeSet, int i8) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, A5.d.f487a, i8, 0);
        this.f31825b = obtainStyledAttributes.getColor(A5.d.f488b, 0);
        obtainStyledAttributes.recycle();
    }

    @NonNull
    @RequiresApi(api = 17)
    private A5.a getBlurAlgorithm() {
        if (Build.VERSION.SDK_INT >= 31) {
            return new d();
        }
        return new A5.e(getContext());
    }

    public A5.c b(ViewGroup viewGroup, A5.a aVar) {
        this.f31824a.destroy();
        c cVar = new c(this, viewGroup, this.f31825b, aVar);
        this.f31824a = cVar;
        return cVar;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f31824a.draw(canvas)) {
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            Log.e(f31823c, "BlurView can't be used in not hardware-accelerated window!");
        } else {
            this.f31824a.a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31824a.a(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.f31824a.c();
    }
}
