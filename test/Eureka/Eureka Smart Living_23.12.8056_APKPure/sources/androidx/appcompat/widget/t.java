package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
class t extends PopupWindow {

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f1223b = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f1224a;

    public t(Context context, AttributeSet attributeSet, int i6, int i7) {
        super(context, attributeSet, i6, i7);
        a(context, attributeSet, i6, i7);
    }

    private void a(Context context, AttributeSet attributeSet, int i6, int i7) {
        c3 v5 = c3.v(context, attributeSet, d.j.Y1, i6, i7);
        if (v5.s(d.j.f6253a2)) {
            b(v5.a(d.j.f6253a2, false));
        }
        setBackgroundDrawable(v5.g(d.j.Z1));
        v5.w();
    }

    private void b(boolean z5) {
        if (f1223b) {
            this.f1224a = z5;
        } else {
            androidx.core.widget.m.a(this, z5);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i6, int i7) {
        if (f1223b && this.f1224a) {
            i7 -= view.getHeight();
        }
        super.showAsDropDown(view, i6, i7);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i6, int i7, int i8, int i9) {
        if (f1223b && this.f1224a) {
            i7 -= view.getHeight();
        }
        super.update(view, i6, i7, i8, i9);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i6, int i7, int i8) {
        if (f1223b && this.f1224a) {
            i7 -= view.getHeight();
        }
        super.showAsDropDown(view, i6, i7, i8);
    }
}
