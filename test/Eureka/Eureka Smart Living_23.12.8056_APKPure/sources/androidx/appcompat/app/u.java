package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import androidx.core.view.x;

/* loaded from: classes.dex */
public class u extends androidx.activity.i implements d {

    /* renamed from: d, reason: collision with root package name */
    private g f418d;

    /* renamed from: e, reason: collision with root package name */
    private final x.a f419e;

    public u(Context context, int i6) {
        super(context, h(context, i6));
        this.f419e = new x.a() { // from class: androidx.appcompat.app.t
            @Override // androidx.core.view.x.a
            public final boolean i(KeyEvent keyEvent) {
                return u.this.i(keyEvent);
            }
        };
        g g6 = g();
        g6.L(h(context, i6));
        g6.x(null);
    }

    private static int h(Context context, int i6) {
        if (i6 != 0) {
            return i6;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.a.f6136w, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().e(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        g().y();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return androidx.core.view.x.e(this.f419e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public View findViewById(int i6) {
        return g().j(i6);
    }

    public g g() {
        if (this.f418d == null) {
            this.f418d = g.i(this, this);
        }
        return this.f418d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        g().t();
    }

    public boolean j(int i6) {
        return g().G(i6);
    }

    @Override // androidx.appcompat.app.d
    public void m(androidx.appcompat.view.b bVar) {
    }

    @Override // androidx.appcompat.app.d
    public void o(androidx.appcompat.view.b bVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        g().s();
        super.onCreate(bundle);
        g().x(bundle);
    }

    @Override // androidx.activity.i, android.app.Dialog
    protected void onStop() {
        super.onStop();
        g().D();
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void setContentView(int i6) {
        g().H(i6);
    }

    @Override // android.app.Dialog
    public void setTitle(int i6) {
        super.setTitle(i6);
        g().M(getContext().getString(i6));
    }

    @Override // androidx.appcompat.app.d
    public androidx.appcompat.view.b t(b.a aVar) {
        return null;
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void setContentView(View view) {
        g().I(view);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        g().M(charSequence);
    }

    @Override // androidx.activity.i, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        g().J(view, layoutParams);
    }
}
