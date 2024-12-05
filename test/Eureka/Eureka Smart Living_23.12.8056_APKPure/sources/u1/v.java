package u1;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.Set;
import t1.a;
import t1.e;
import v1.i0;

/* loaded from: classes.dex */
public final class v extends j2.d implements e.a, e.b {

    /* renamed from: h, reason: collision with root package name */
    private static final a.AbstractC0138a f9398h = i2.d.f6976c;

    /* renamed from: a, reason: collision with root package name */
    private final Context f9399a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f9400b;

    /* renamed from: c, reason: collision with root package name */
    private final a.AbstractC0138a f9401c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f9402d;

    /* renamed from: e, reason: collision with root package name */
    private final v1.d f9403e;

    /* renamed from: f, reason: collision with root package name */
    private i2.e f9404f;

    /* renamed from: g, reason: collision with root package name */
    private u f9405g;

    public v(Context context, Handler handler, v1.d dVar) {
        a.AbstractC0138a abstractC0138a = f9398h;
        this.f9399a = context;
        this.f9400b = handler;
        this.f9403e = (v1.d) v1.n.i(dVar, "ClientSettings must not be null");
        this.f9402d = dVar.e();
        this.f9401c = abstractC0138a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void B(v vVar, j2.l lVar) {
        s1.a a6 = lVar.a();
        if (a6.e()) {
            i0 i0Var = (i0) v1.n.h(lVar.b());
            a6 = i0Var.a();
            if (a6.e()) {
                vVar.f9405g.c(i0Var.b(), vVar.f9402d);
                vVar.f9404f.h();
            } else {
                String valueOf = String.valueOf(a6);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
            }
        }
        vVar.f9405g.a(a6);
        vVar.f9404f.h();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [i2.e, t1.a$f] */
    public final void C(u uVar) {
        i2.e eVar = this.f9404f;
        if (eVar != null) {
            eVar.h();
        }
        this.f9403e.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0138a abstractC0138a = this.f9401c;
        Context context = this.f9399a;
        Looper looper = this.f9400b.getLooper();
        v1.d dVar = this.f9403e;
        this.f9404f = abstractC0138a.a(context, looper, dVar, dVar.f(), this, this);
        this.f9405g = uVar;
        Set set = this.f9402d;
        if (set == null || set.isEmpty()) {
            this.f9400b.post(new s(this));
        } else {
            this.f9404f.l();
        }
    }

    public final void D() {
        i2.e eVar = this.f9404f;
        if (eVar != null) {
            eVar.h();
        }
    }

    @Override // u1.h
    public final void a(s1.a aVar) {
        this.f9405g.a(aVar);
    }

    @Override // u1.c
    public final void b(int i6) {
        this.f9404f.h();
    }

    @Override // u1.c
    public final void c(Bundle bundle) {
        this.f9404f.k(this);
    }

    @Override // j2.f
    public final void m(j2.l lVar) {
        this.f9400b.post(new t(this, lVar));
    }
}
