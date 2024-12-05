package P;

import N.C1331b;
import O.a;
import O.f;
import Q.AbstractC1400p;
import Q.C1388d;
import Q.O;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import java.util.Set;
import o0.AbstractBinderC3507d;

/* loaded from: classes3.dex */
public final class y extends AbstractBinderC3507d implements f.a, f.b {

    /* renamed from: p, reason: collision with root package name */
    private static final a.AbstractC0143a f8655p = n0.d.f35281c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f8656a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f8657b;

    /* renamed from: k, reason: collision with root package name */
    private final a.AbstractC0143a f8658k;

    /* renamed from: l, reason: collision with root package name */
    private final Set f8659l;

    /* renamed from: m, reason: collision with root package name */
    private final C1388d f8660m;

    /* renamed from: n, reason: collision with root package name */
    private n0.e f8661n;

    /* renamed from: o, reason: collision with root package name */
    private x f8662o;

    public y(Context context, Handler handler, C1388d c1388d) {
        a.AbstractC0143a abstractC0143a = f8655p;
        this.f8656a = context;
        this.f8657b = handler;
        this.f8660m = (C1388d) AbstractC1400p.m(c1388d, "ClientSettings must not be null");
        this.f8659l = c1388d.g();
        this.f8658k = abstractC0143a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void u0(y yVar, o0.l lVar) {
        C1331b p8 = lVar.p();
        if (p8.z()) {
            O o8 = (O) AbstractC1400p.l(lVar.u());
            C1331b p9 = o8.p();
            if (!p9.z()) {
                String valueOf = String.valueOf(p9);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                yVar.f8662o.c(p9);
                yVar.f8661n.b();
                return;
            }
            yVar.f8662o.a(o8.u(), yVar.f8659l);
        } else {
            yVar.f8662o.c(p8);
        }
        yVar.f8661n.b();
    }

    @Override // P.InterfaceC1358c
    public final void h(int i8) {
        this.f8662o.d(i8);
    }

    @Override // P.h
    public final void i(C1331b c1331b) {
        this.f8662o.c(c1331b);
    }

    @Override // o0.InterfaceC3509f
    public final void i0(o0.l lVar) {
        this.f8657b.post(new w(this, lVar));
    }

    @Override // P.InterfaceC1358c
    public final void k(Bundle bundle) {
        this.f8661n.a(this);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [O.a$f, n0.e] */
    public final void v0(x xVar) {
        n0.e eVar = this.f8661n;
        if (eVar != null) {
            eVar.b();
        }
        this.f8660m.k(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0143a abstractC0143a = this.f8658k;
        Context context = this.f8656a;
        Handler handler = this.f8657b;
        C1388d c1388d = this.f8660m;
        this.f8661n = abstractC0143a.a(context, handler.getLooper(), c1388d, c1388d.h(), this, this);
        this.f8662o = xVar;
        Set set = this.f8659l;
        if (set != null && !set.isEmpty()) {
            this.f8661n.p();
        } else {
            this.f8657b.post(new v(this));
        }
    }

    public final void w0() {
        n0.e eVar = this.f8661n;
        if (eVar != null) {
            eVar.b();
        }
    }
}
