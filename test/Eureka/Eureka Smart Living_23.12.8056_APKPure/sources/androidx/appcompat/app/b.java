package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* loaded from: classes.dex */
public class b extends u implements DialogInterface {

    /* renamed from: f, reason: collision with root package name */
    final AlertController f276f;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final AlertController.f f277a;

        /* renamed from: b, reason: collision with root package name */
        private final int f278b;

        public a(Context context) {
            this(context, b.l(context, 0));
        }

        public b a() {
            b bVar = new b(this.f277a.f235a, this.f278b);
            this.f277a.a(bVar.f276f);
            bVar.setCancelable(this.f277a.f252r);
            if (this.f277a.f252r) {
                bVar.setCanceledOnTouchOutside(true);
            }
            bVar.setOnCancelListener(this.f277a.f253s);
            bVar.setOnDismissListener(this.f277a.f254t);
            DialogInterface.OnKeyListener onKeyListener = this.f277a.f255u;
            if (onKeyListener != null) {
                bVar.setOnKeyListener(onKeyListener);
            }
            return bVar;
        }

        public Context b() {
            return this.f277a.f235a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f277a;
            fVar.f257w = listAdapter;
            fVar.f258x = onClickListener;
            return this;
        }

        public a d(View view) {
            this.f277a.f241g = view;
            return this;
        }

        public a e(Drawable drawable) {
            this.f277a.f238d = drawable;
            return this;
        }

        public a f(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f277a;
            fVar.f246l = charSequence;
            fVar.f248n = onClickListener;
            return this;
        }

        public a g(DialogInterface.OnKeyListener onKeyListener) {
            this.f277a.f255u = onKeyListener;
            return this;
        }

        public a h(ListAdapter listAdapter, int i6, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f277a;
            fVar.f257w = listAdapter;
            fVar.f258x = onClickListener;
            fVar.I = i6;
            fVar.H = true;
            return this;
        }

        public a i(CharSequence charSequence) {
            this.f277a.f240f = charSequence;
            return this;
        }

        public a j(View view) {
            AlertController.f fVar = this.f277a;
            fVar.f260z = view;
            fVar.f259y = 0;
            fVar.E = false;
            return this;
        }

        public a(Context context, int i6) {
            this.f277a = new AlertController.f(new ContextThemeWrapper(context, b.l(context, i6)));
            this.f278b = i6;
        }
    }

    protected b(Context context, int i6) {
        super(context, l(context, i6));
        this.f276f = new AlertController(getContext(), this, getWindow());
    }

    static int l(Context context, int i6) {
        if (((i6 >>> 24) & 255) >= 1) {
            return i6;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(d.a.f6125l, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView k() {
        return this.f276f.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.u, androidx.activity.i, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f276f.e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i6, KeyEvent keyEvent) {
        if (this.f276f.g(i6, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i6, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i6, KeyEvent keyEvent) {
        if (this.f276f.h(i6, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i6, keyEvent);
    }

    @Override // androidx.appcompat.app.u, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f276f.q(charSequence);
    }
}
