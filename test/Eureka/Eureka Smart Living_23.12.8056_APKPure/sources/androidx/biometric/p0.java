package androidx.biometric;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.b;

/* loaded from: classes.dex */
public class p0 extends androidx.fragment.app.e {

    /* renamed from: s0, reason: collision with root package name */
    final Handler f1345s0 = new Handler(Looper.getMainLooper());

    /* renamed from: t0, reason: collision with root package name */
    final Runnable f1346t0 = new a();

    /* renamed from: u0, reason: collision with root package name */
    w f1347u0;

    /* renamed from: v0, reason: collision with root package name */
    private int f1348v0;

    /* renamed from: w0, reason: collision with root package name */
    private int f1349w0;

    /* renamed from: x0, reason: collision with root package name */
    private ImageView f1350x0;

    /* renamed from: y0, reason: collision with root package name */
    TextView f1351y0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.a2();
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnClickListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i6) {
            p0.this.f1347u0.a0(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements androidx.lifecycle.r {
        c() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(Integer num) {
            p0 p0Var = p0.this;
            p0Var.f1345s0.removeCallbacks(p0Var.f1346t0);
            p0.this.c2(num.intValue());
            p0.this.d2(num.intValue());
            p0 p0Var2 = p0.this;
            p0Var2.f1345s0.postDelayed(p0Var2.f1346t0, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements androidx.lifecycle.r {
        d() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(CharSequence charSequence) {
            p0 p0Var = p0.this;
            p0Var.f1345s0.removeCallbacks(p0Var.f1346t0);
            p0.this.e2(charSequence);
            p0 p0Var2 = p0.this;
            p0Var2.f1345s0.postDelayed(p0Var2.f1346t0, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e {
        static void a(Drawable drawable) {
            if (drawable instanceof AnimatedVectorDrawable) {
                ((AnimatedVectorDrawable) drawable).start();
            }
        }
    }

    /* loaded from: classes.dex */
    private static class f {
        static int a() {
            return u0.f1365a;
        }
    }

    private void W1() {
        androidx.fragment.app.j m6 = m();
        if (m6 == null) {
            return;
        }
        w wVar = (w) new androidx.lifecycle.f0(m6).a(w.class);
        this.f1347u0 = wVar;
        wVar.s().e(this, new c());
        this.f1347u0.q().e(this, new d());
    }

    private Drawable X1(int i6, int i7) {
        int i8;
        Context u5 = u();
        if (u5 == null) {
            Log.w("FingerprintFragment", "Unable to get asset. Context is null.");
            return null;
        }
        if (i6 != 0 || i7 != 1) {
            if (i6 == 1 && i7 == 2) {
                i8 = w0.f1394a;
                return androidx.core.content.a.e(u5, i8);
            }
            if ((i6 != 2 || i7 != 1) && (i6 != 1 || i7 != 3)) {
                return null;
            }
        }
        i8 = w0.f1395b;
        return androidx.core.content.a.e(u5, i8);
    }

    private int Y1(int i6) {
        Context u5 = u();
        androidx.fragment.app.j m6 = m();
        if (u5 == null || m6 == null) {
            Log.w("FingerprintFragment", "Unable to get themed color. Context or activity is null.");
            return 0;
        }
        TypedValue typedValue = new TypedValue();
        u5.getTheme().resolveAttribute(i6, typedValue, true);
        TypedArray obtainStyledAttributes = m6.obtainStyledAttributes(typedValue.data, new int[]{i6});
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        return color;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p0 Z1() {
        return new p0();
    }

    private boolean b2(int i6, int i7) {
        if (i6 == 0 && i7 == 1) {
            return false;
        }
        if (i6 == 1 && i7 == 2) {
            return true;
        }
        return i6 == 2 && i7 == 1;
    }

    @Override // androidx.fragment.app.Fragment
    public void F0() {
        super.F0();
        this.f1345s0.removeCallbacksAndMessages(null);
    }

    @Override // androidx.fragment.app.Fragment
    public void K0() {
        super.K0();
        this.f1347u0.X(0);
        this.f1347u0.Y(1);
        this.f1347u0.W(U(z0.f1407c));
    }

    @Override // androidx.fragment.app.e
    public Dialog O1(Bundle bundle) {
        b.a aVar = new b.a(s1());
        aVar.i(this.f1347u0.x());
        View inflate = LayoutInflater.from(aVar.b()).inflate(y0.f1404a, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(x0.f1403d);
        if (textView != null) {
            CharSequence w5 = this.f1347u0.w();
            if (TextUtils.isEmpty(w5)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
                textView.setText(w5);
            }
        }
        TextView textView2 = (TextView) inflate.findViewById(x0.f1400a);
        if (textView2 != null) {
            CharSequence p6 = this.f1347u0.p();
            if (TextUtils.isEmpty(p6)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
                textView2.setText(p6);
            }
        }
        this.f1350x0 = (ImageView) inflate.findViewById(x0.f1402c);
        this.f1351y0 = (TextView) inflate.findViewById(x0.f1401b);
        aVar.f(androidx.biometric.d.c(this.f1347u0.f()) ? U(z0.f1405a) : this.f1347u0.v(), new b());
        aVar.j(inflate);
        androidx.appcompat.app.b a6 = aVar.a();
        a6.setCanceledOnTouchOutside(false);
        return a6;
    }

    void a2() {
        Context u5 = u();
        if (u5 == null) {
            Log.w("FingerprintFragment", "Not resetting the dialog. Context is null.");
        } else {
            this.f1347u0.Y(1);
            this.f1347u0.W(u5.getString(z0.f1407c));
        }
    }

    void c2(int i6) {
        int r5;
        Drawable X1;
        if (this.f1350x0 == null || Build.VERSION.SDK_INT < 23 || (X1 = X1((r5 = this.f1347u0.r()), i6)) == null) {
            return;
        }
        this.f1350x0.setImageDrawable(X1);
        if (b2(r5, i6)) {
            e.a(X1);
        }
        this.f1347u0.X(i6);
    }

    void d2(int i6) {
        TextView textView = this.f1351y0;
        if (textView != null) {
            textView.setTextColor(i6 == 2 ? this.f1348v0 : this.f1349w0);
        }
    }

    void e2(CharSequence charSequence) {
        TextView textView = this.f1351y0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        this.f1347u0.U(true);
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void p0(Bundle bundle) {
        int c6;
        super.p0(bundle);
        W1();
        if (Build.VERSION.SDK_INT >= 26) {
            c6 = Y1(f.a());
        } else {
            Context u5 = u();
            c6 = u5 != null ? androidx.core.content.a.c(u5, v0.f1366a) : 0;
        }
        this.f1348v0 = c6;
        this.f1349w0 = Y1(R.attr.textColorSecondary);
    }
}
