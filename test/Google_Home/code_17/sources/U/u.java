package u;

import android.content.Context;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Set;
import s.C3982c;
import u.i;

/* loaded from: classes3.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    private static volatile v f39903e;

    /* renamed from: a, reason: collision with root package name */
    private final E.a f39904a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f39905b;

    /* renamed from: c, reason: collision with root package name */
    private final A.e f39906c;

    /* renamed from: d, reason: collision with root package name */
    private final B.r f39907d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(E.a aVar, E.a aVar2, A.e eVar, B.r rVar, B.v vVar) {
        this.f39904a = aVar;
        this.f39905b = aVar2;
        this.f39906c = eVar;
        this.f39907d = rVar;
        vVar.c();
    }

    private i b(o oVar) {
        i.a g8 = i.a().i(this.f39904a.a()).o(this.f39905b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        if (oVar.c().e() != null && oVar.c().e().a() != null) {
            g8.l(oVar.c().e().a());
        }
        oVar.c().b();
        return g8.d();
    }

    public static u c() {
        v vVar = f39903e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        if (fVar instanceof g) {
            return DesugarCollections.unmodifiableSet(((g) fVar).a());
        }
        return Collections.singleton(C3982c.b("proto"));
    }

    public static void f(Context context) {
        if (f39903e == null) {
            synchronized (u.class) {
                try {
                    if (f39903e == null) {
                        f39903e = e.a().a(context).build();
                    }
                } finally {
                }
            }
        }
    }

    @Override // u.t
    public void a(o oVar, s.k kVar) {
        this.f39906c.a(oVar.f().f(oVar.c().d()), b(oVar), kVar);
    }

    public B.r e() {
        return this.f39907d;
    }

    public s.j g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.getExtras()).a(), this);
    }
}
