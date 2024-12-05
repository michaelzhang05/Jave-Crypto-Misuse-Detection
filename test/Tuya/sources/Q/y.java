package Q;

import O.C1258b;
import P.a;
import P.f;
import R.AbstractC1319p;
import R.C1307d;
import R.O;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Set;
import o0.AbstractC3522d;
import o0.InterfaceC3523e;
import p0.AbstractBinderC3594d;

/* loaded from: classes3.dex */
public final class y extends AbstractBinderC3594d implements f.a, f.b {

    /* renamed from: p, reason: collision with root package name */
    private static final a.AbstractC0166a f8164p = AbstractC3522d.f36356c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f8165a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f8166b;

    /* renamed from: k, reason: collision with root package name */
    private final a.AbstractC0166a f8167k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f8168l;

    /* renamed from: m, reason: collision with root package name */
    private final C1307d f8169m;

    /* renamed from: n, reason: collision with root package name */
    private InterfaceC3523e f8170n;

    /* renamed from: o, reason: collision with root package name */
    private x f8171o;

    public y(Context context, Handler handler, C1307d c1307d) {
        a.AbstractC0166a abstractC0166a = f8164p;
        this.f8165a = context;
        this.f8166b = handler;
        this.f8169m = (C1307d) AbstractC1319p.m(c1307d, "ClientSettings must not be null");
        this.f8168l = c1307d.g();
        this.f8167k = abstractC0166a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void o0(y yVar, p0.l lVar) {
        C1258b s8 = lVar.s();
        if (s8.I()) {
            O o8 = (O) AbstractC1319p.l(lVar.u());
            C1258b s9 = o8.s();
            if (!s9.I()) {
                String valueOf = String.valueOf(s9);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                yVar.f8171o.a(s9);
                yVar.f8170n.b();
                return;
            }
            yVar.f8171o.c(o8.u(), yVar.f8168l);
        } else {
            yVar.f8171o.a(s8);
        }
        yVar.f8170n.b();
    }

    @Override // p0.f
    public final void Z(p0.l lVar) {
        this.f8166b.post(new w(this, lVar));
    }

    @Override // Q.InterfaceC1302c
    public final void i(int i8) {
        this.f8171o.d(i8);
    }

    @Override // Q.h
    public final void j(C1258b c1258b) {
        this.f8171o.a(c1258b);
    }

    @Override // Q.InterfaceC1302c
    public final void l(Bundle bundle) {
        this.f8170n.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [P.a$f, o0.e] */
    public final void p0(x xVar) {
        InterfaceC3523e interfaceC3523e = this.f8170n;
        if (interfaceC3523e != null) {
            interfaceC3523e.b();
        }
        this.f8169m.k(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0166a abstractC0166a = this.f8167k;
        Context context = this.f8165a;
        Handler handler = this.f8166b;
        C1307d c1307d = this.f8169m;
        this.f8170n = abstractC0166a.a(context, handler.getLooper(), c1307d, c1307d.h(), this, this);
        this.f8171o = xVar;
        Set set = this.f8168l;
        if (set != null && !set.isEmpty()) {
            this.f8170n.o();
        } else {
            this.f8166b.post(new v(this));
        }
    }

    public final void q0() {
        InterfaceC3523e interfaceC3523e = this.f8170n;
        if (interfaceC3523e != null) {
            interfaceC3523e.b();
        }
    }
}
