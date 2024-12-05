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
import x5.AbstractC3931d;
import x5.C3932e;
import x5.InterfaceC3928a;
import x5.InterfaceC3930c;

/* loaded from: classes5.dex */
public class BlurView extends FrameLayout {

    /* renamed from: c, reason: collision with root package name */
    private static final String f30923c = "BlurView";

    /* renamed from: a, reason: collision with root package name */
    a f30924a;

    /* renamed from: b, reason: collision with root package name */
    private int f30925b;

    public BlurView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30924a = new b();
        a(attributeSet, 0);
    }

    private void a(AttributeSet attributeSet, int i8) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC3931d.f39492a, i8, 0);
        this.f30925b = obtainStyledAttributes.getColor(AbstractC3931d.f39493b, 0);
        obtainStyledAttributes.recycle();
    }

    @NonNull
    @RequiresApi(api = 17)
    private InterfaceC3928a getBlurAlgorithm() {
        if (Build.VERSION.SDK_INT >= 31) {
            return new d();
        }
        return new C3932e(getContext());
    }

    public InterfaceC3930c b(ViewGroup viewGroup, InterfaceC3928a interfaceC3928a) {
        this.f30924a.destroy();
        c cVar = new c(this, viewGroup, this.f30925b, interfaceC3928a);
        this.f30924a = cVar;
        return cVar;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f30924a.draw(canvas)) {
            super.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            Log.e(f30923c, "BlurView can't be used in not hardware-accelerated window!");
        } else {
            this.f30924a.a(true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30924a.a(false);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        this.f30924a.c();
    }
}
