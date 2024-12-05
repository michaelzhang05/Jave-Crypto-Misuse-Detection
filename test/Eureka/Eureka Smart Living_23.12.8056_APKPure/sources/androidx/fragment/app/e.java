package androidx.fragment.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

/* loaded from: classes.dex */
public class e extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: c0, reason: collision with root package name */
    private Handler f2814c0;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f2823l0;

    /* renamed from: n0, reason: collision with root package name */
    private Dialog f2825n0;

    /* renamed from: o0, reason: collision with root package name */
    private boolean f2826o0;

    /* renamed from: p0, reason: collision with root package name */
    private boolean f2827p0;

    /* renamed from: q0, reason: collision with root package name */
    private boolean f2828q0;

    /* renamed from: d0, reason: collision with root package name */
    private Runnable f2815d0 = new a();

    /* renamed from: e0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f2816e0 = new b();

    /* renamed from: f0, reason: collision with root package name */
    private DialogInterface.OnDismissListener f2817f0 = new c();

    /* renamed from: g0, reason: collision with root package name */
    private int f2818g0 = 0;

    /* renamed from: h0, reason: collision with root package name */
    private int f2819h0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f2820i0 = true;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f2821j0 = true;

    /* renamed from: k0, reason: collision with root package name */
    private int f2822k0 = -1;

    /* renamed from: m0, reason: collision with root package name */
    private androidx.lifecycle.r f2824m0 = new d();

    /* renamed from: r0, reason: collision with root package name */
    private boolean f2829r0 = false;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.f2817f0.onDismiss(e.this.f2825n0);
        }
    }

    /* loaded from: classes.dex */
    class b implements DialogInterface.OnCancelListener {
        b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (e.this.f2825n0 != null) {
                e eVar = e.this;
                eVar.onCancel(eVar.f2825n0);
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements DialogInterface.OnDismissListener {
        c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (e.this.f2825n0 != null) {
                e eVar = e.this;
                eVar.onDismiss(eVar.f2825n0);
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements androidx.lifecycle.r {
        d() {
        }

        @Override // androidx.lifecycle.r
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(androidx.lifecycle.m mVar) {
            if (mVar == null || !e.this.f2821j0) {
                return;
            }
            View t12 = e.this.t1();
            if (t12.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (e.this.f2825n0 != null) {
                if (w.H0(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + e.this.f2825n0);
                }
                e.this.f2825n0.setContentView(t12);
            }
        }
    }

    /* renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0047e extends l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ l f2834a;

        C0047e(l lVar) {
            this.f2834a = lVar;
        }

        @Override // androidx.fragment.app.l
        public View i(int i6) {
            return this.f2834a.k() ? this.f2834a.i(i6) : e.this.P1(i6);
        }

        @Override // androidx.fragment.app.l
        public boolean k() {
            return this.f2834a.k() || e.this.Q1();
        }
    }

    private void L1(boolean z5, boolean z6, boolean z7) {
        if (this.f2827p0) {
            return;
        }
        this.f2827p0 = true;
        this.f2828q0 = false;
        Dialog dialog = this.f2825n0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f2825n0.dismiss();
            if (!z6) {
                if (Looper.myLooper() == this.f2814c0.getLooper()) {
                    onDismiss(this.f2825n0);
                } else {
                    this.f2814c0.post(this.f2815d0);
                }
            }
        }
        this.f2826o0 = true;
        if (this.f2822k0 >= 0) {
            if (z7) {
                I().b1(this.f2822k0, 1);
            } else {
                I().Z0(this.f2822k0, 1, z5);
            }
            this.f2822k0 = -1;
            return;
        }
        e0 o6 = I().o();
        o6.o(true);
        o6.l(this);
        if (z7) {
            o6.h();
        } else if (z5) {
            o6.g();
        } else {
            o6.f();
        }
    }

    private void R1(Bundle bundle) {
        if (this.f2821j0 && !this.f2829r0) {
            try {
                this.f2823l0 = true;
                Dialog O1 = O1(bundle);
                this.f2825n0 = O1;
                if (this.f2821j0) {
                    U1(O1, this.f2818g0);
                    Context u5 = u();
                    if (u5 instanceof Activity) {
                        this.f2825n0.setOwnerActivity((Activity) u5);
                    }
                    this.f2825n0.setCancelable(this.f2820i0);
                    this.f2825n0.setOnCancelListener(this.f2816e0);
                    this.f2825n0.setOnDismissListener(this.f2817f0);
                    this.f2829r0 = true;
                } else {
                    this.f2825n0 = null;
                }
            } finally {
                this.f2823l0 = false;
            }
        }
    }

    public void J1() {
        L1(false, false, false);
    }

    public void K1() {
        L1(true, false, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void L0(Bundle bundle) {
        super.L0(bundle);
        Dialog dialog = this.f2825n0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i6 = this.f2818g0;
        if (i6 != 0) {
            bundle.putInt("android:style", i6);
        }
        int i7 = this.f2819h0;
        if (i7 != 0) {
            bundle.putInt("android:theme", i7);
        }
        boolean z5 = this.f2820i0;
        if (!z5) {
            bundle.putBoolean("android:cancelable", z5);
        }
        boolean z6 = this.f2821j0;
        if (!z6) {
            bundle.putBoolean("android:showsDialog", z6);
        }
        int i8 = this.f2822k0;
        if (i8 != -1) {
            bundle.putInt("android:backStackId", i8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M0() {
        super.M0();
        Dialog dialog = this.f2825n0;
        if (dialog != null) {
            this.f2826o0 = false;
            dialog.show();
            View decorView = this.f2825n0.getWindow().getDecorView();
            androidx.lifecycle.k0.a(decorView, this);
            androidx.lifecycle.l0.a(decorView, this);
            i0.e.a(decorView, this);
        }
    }

    public Dialog M1() {
        return this.f2825n0;
    }

    @Override // androidx.fragment.app.Fragment
    public void N0() {
        super.N0();
        Dialog dialog = this.f2825n0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public int N1() {
        return this.f2819h0;
    }

    public Dialog O1(Bundle bundle) {
        if (w.H0(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new androidx.activity.i(s1(), N1());
    }

    @Override // androidx.fragment.app.Fragment
    public void P0(Bundle bundle) {
        Bundle bundle2;
        super.P0(bundle);
        if (this.f2825n0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2825n0.onRestoreInstanceState(bundle2);
    }

    View P1(int i6) {
        Dialog dialog = this.f2825n0;
        if (dialog != null) {
            return dialog.findViewById(i6);
        }
        return null;
    }

    boolean Q1() {
        return this.f2829r0;
    }

    public final Dialog S1() {
        Dialog M1 = M1();
        if (M1 != null) {
            return M1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void T1(boolean z5) {
        this.f2821j0 = z5;
    }

    public void U1(Dialog dialog, int i6) {
        if (i6 != 1 && i6 != 2) {
            if (i6 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void V1(w wVar, String str) {
        this.f2827p0 = false;
        this.f2828q0 = true;
        e0 o6 = wVar.o();
        o6.o(true);
        o6.d(this, str);
        o6.f();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public void W0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.W0(layoutInflater, viewGroup, bundle);
        if (this.I != null || this.f2825n0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f2825n0.onRestoreInstanceState(bundle2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.fragment.app.Fragment
    public l h() {
        return new C0047e(super.h());
    }

    @Override // androidx.fragment.app.Fragment
    public void j0(Bundle bundle) {
        super.j0(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void m0(Context context) {
        super.m0(context);
        X().f(this.f2824m0);
        if (this.f2828q0) {
            return;
        }
        this.f2827p0 = false;
    }

    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f2826o0) {
            return;
        }
        if (w.H0(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        L1(true, true, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void p0(Bundle bundle) {
        super.p0(bundle);
        this.f2814c0 = new Handler();
        this.f2821j0 = this.f2677y == 0;
        if (bundle != null) {
            this.f2818g0 = bundle.getInt("android:style", 0);
            this.f2819h0 = bundle.getInt("android:theme", 0);
            this.f2820i0 = bundle.getBoolean("android:cancelable", true);
            this.f2821j0 = bundle.getBoolean("android:showsDialog", this.f2821j0);
            this.f2822k0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void w0() {
        super.w0();
        Dialog dialog = this.f2825n0;
        if (dialog != null) {
            this.f2826o0 = true;
            dialog.setOnDismissListener(null);
            this.f2825n0.dismiss();
            if (!this.f2827p0) {
                onDismiss(this.f2825n0);
            }
            this.f2825n0 = null;
            this.f2829r0 = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void x0() {
        super.x0();
        if (!this.f2828q0 && !this.f2827p0) {
            this.f2827p0 = true;
        }
        X().j(this.f2824m0);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater y0(Bundle bundle) {
        StringBuilder sb;
        String str;
        LayoutInflater y02 = super.y0(bundle);
        if (this.f2821j0 && !this.f2823l0) {
            R1(bundle);
            if (w.H0(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f2825n0;
            return dialog != null ? y02.cloneInContext(dialog.getContext()) : y02;
        }
        if (w.H0(2)) {
            String str2 = "getting layout inflater for DialogFragment " + this;
            if (this.f2821j0) {
                sb = new StringBuilder();
                str = "mCreatingDialog = true: ";
            } else {
                sb = new StringBuilder();
                str = "mShowsDialog = false: ";
            }
            sb.append(str);
            sb.append(str2);
            Log.d("FragmentManager", sb.toString());
        }
        return y02;
    }
}
