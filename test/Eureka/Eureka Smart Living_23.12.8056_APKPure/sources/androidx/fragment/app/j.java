package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.b;
import androidx.core.app.d1;
import androidx.core.app.e1;
import androidx.core.view.q0;
import androidx.lifecycle.h;
import androidx.savedstate.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class j extends ComponentActivity implements b.f, b.g {

    /* renamed from: x, reason: collision with root package name */
    boolean f2899x;

    /* renamed from: y, reason: collision with root package name */
    boolean f2900y;

    /* renamed from: v, reason: collision with root package name */
    final m f2897v = m.b(new a());

    /* renamed from: w, reason: collision with root package name */
    final androidx.lifecycle.n f2898w = new androidx.lifecycle.n(this);

    /* renamed from: z, reason: collision with root package name */
    boolean f2901z = true;

    /* loaded from: classes.dex */
    class a extends o implements androidx.core.content.h, androidx.core.content.i, d1, e1, androidx.lifecycle.j0, androidx.activity.s, androidx.activity.result.d, i0.d, a0, androidx.core.view.a0 {
        public a() {
            super(j.this);
        }

        @Override // androidx.fragment.app.o
        public void A() {
            B();
        }

        public void B() {
            j.this.I();
        }

        @Override // androidx.fragment.app.o
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public j x() {
            return j.this;
        }

        @Override // androidx.fragment.app.a0
        public void a(w wVar, Fragment fragment) {
            j.this.c0(fragment);
        }

        @Override // androidx.activity.s
        public OnBackPressedDispatcher c() {
            return j.this.c();
        }

        @Override // i0.d
        public androidx.savedstate.a d() {
            return j.this.d();
        }

        @Override // androidx.core.app.e1
        public void e(androidx.core.util.a aVar) {
            j.this.e(aVar);
        }

        @Override // androidx.core.view.a0
        public void f(q0 q0Var) {
            j.this.f(q0Var);
        }

        @Override // androidx.core.view.a0
        public void g(q0 q0Var) {
            j.this.g(q0Var);
        }

        @Override // androidx.activity.result.d
        public ActivityResultRegistry h() {
            return j.this.h();
        }

        @Override // androidx.fragment.app.l
        public View i(int i6) {
            return j.this.findViewById(i6);
        }

        @Override // androidx.core.app.d1
        public void j(androidx.core.util.a aVar) {
            j.this.j(aVar);
        }

        @Override // androidx.fragment.app.l
        public boolean k() {
            Window window = j.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.core.content.h
        public void l(androidx.core.util.a aVar) {
            j.this.l(aVar);
        }

        @Override // androidx.lifecycle.j0
        public androidx.lifecycle.i0 n() {
            return j.this.n();
        }

        @Override // androidx.core.app.d1
        public void p(androidx.core.util.a aVar) {
            j.this.p(aVar);
        }

        @Override // androidx.core.app.e1
        public void q(androidx.core.util.a aVar) {
            j.this.q(aVar);
        }

        @Override // androidx.lifecycle.m
        public androidx.lifecycle.h r() {
            return j.this.f2898w;
        }

        @Override // androidx.core.content.i
        public void s(androidx.core.util.a aVar) {
            j.this.s(aVar);
        }

        @Override // androidx.core.content.i
        public void u(androidx.core.util.a aVar) {
            j.this.u(aVar);
        }

        @Override // androidx.core.content.h
        public void v(androidx.core.util.a aVar) {
            j.this.v(aVar);
        }

        @Override // androidx.fragment.app.o
        public void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            j.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.o
        public LayoutInflater y() {
            return j.this.getLayoutInflater().cloneInContext(j.this);
        }
    }

    public j() {
        V();
    }

    private void V() {
        d().h("android:support:lifecycle", new a.c() { // from class: androidx.fragment.app.f
            @Override // androidx.savedstate.a.c
            public final Bundle a() {
                Bundle W;
                W = j.this.W();
                return W;
            }
        });
        l(new androidx.core.util.a() { // from class: androidx.fragment.app.g
            @Override // androidx.core.util.a
            public final void a(Object obj) {
                j.this.X((Configuration) obj);
            }
        });
        E(new androidx.core.util.a() { // from class: androidx.fragment.app.h
            @Override // androidx.core.util.a
            public final void a(Object obj) {
                j.this.Y((Intent) obj);
            }
        });
        D(new b.b() { // from class: androidx.fragment.app.i
            @Override // b.b
            public final void a(Context context) {
                j.this.Z(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle W() {
        a0();
        this.f2898w.h(h.a.ON_STOP);
        return new Bundle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void X(Configuration configuration) {
        this.f2897v.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Y(Intent intent) {
        this.f2897v.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z(Context context) {
        this.f2897v.a(null);
    }

    private static boolean b0(w wVar, h.b bVar) {
        boolean z5 = false;
        for (Fragment fragment : wVar.t0()) {
            if (fragment != null) {
                if (fragment.D() != null) {
                    z5 |= b0(fragment.t(), bVar);
                }
                i0 i0Var = fragment.T;
                if (i0Var != null && i0Var.r().b().b(h.b.STARTED)) {
                    fragment.T.i(bVar);
                    z5 = true;
                }
                if (fragment.S.b().b(h.b.STARTED)) {
                    fragment.S.n(bVar);
                    z5 = true;
                }
            }
        }
        return z5;
    }

    final View T(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f2897v.n(view, str, context, attributeSet);
    }

    public w U() {
        return this.f2897v.l();
    }

    void a0() {
        do {
        } while (b0(U(), h.b.CREATED));
    }

    @Override // androidx.core.app.b.g
    public final void b(int i6) {
    }

    public void c0(Fragment fragment) {
    }

    protected void d0() {
        this.f2898w.h(h.a.ON_RESUME);
        this.f2897v.h();
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (x(strArr)) {
            printWriter.print(str);
            printWriter.print("Local FragmentActivity ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(" State:");
            String str2 = str + "  ";
            printWriter.print(str2);
            printWriter.print("mCreated=");
            printWriter.print(this.f2899x);
            printWriter.print(" mResumed=");
            printWriter.print(this.f2900y);
            printWriter.print(" mStopped=");
            printWriter.print(this.f2901z);
            if (getApplication() != null) {
                androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
            }
            this.f2897v.l().W(str, fileDescriptor, printWriter, strArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i6, int i7, Intent intent) {
        this.f2897v.m();
        super.onActivityResult(i6, i7, intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.p, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f2898w.h(h.a.ON_CREATE);
        this.f2897v.e();
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View T = T(view, str, context, attributeSet);
        return T == null ? super.onCreateView(view, str, context, attributeSet) : T;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f2897v.f();
        this.f2898w.h(h.a.ON_DESTROY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i6, MenuItem menuItem) {
        if (super.onMenuItemSelected(i6, menuItem)) {
            return true;
        }
        if (i6 == 6) {
            return this.f2897v.d(menuItem);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f2900y = false;
        this.f2897v.g();
        this.f2898w.h(h.a.ON_PAUSE);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        d0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i6, String[] strArr, int[] iArr) {
        this.f2897v.m();
        super.onRequestPermissionsResult(i6, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        this.f2897v.m();
        super.onResume();
        this.f2900y = true;
        this.f2897v.k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        this.f2897v.m();
        super.onStart();
        this.f2901z = false;
        if (!this.f2899x) {
            this.f2899x = true;
            this.f2897v.c();
        }
        this.f2897v.k();
        this.f2898w.h(h.a.ON_START);
        this.f2897v.i();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.f2897v.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.f2901z = true;
        a0();
        this.f2897v.j();
        this.f2898w.h(h.a.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View T = T(null, str, context, attributeSet);
        return T == null ? super.onCreateView(str, context, attributeSet) : T;
    }
}
