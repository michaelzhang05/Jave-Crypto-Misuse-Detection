package d1;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class t implements s {

    /* renamed from: e, reason: collision with root package name */
    private static volatile u f6463e;

    /* renamed from: a, reason: collision with root package name */
    private final n1.a f6464a;

    /* renamed from: b, reason: collision with root package name */
    private final n1.a f6465b;

    /* renamed from: c, reason: collision with root package name */
    private final j1.e f6466c;

    /* renamed from: d, reason: collision with root package name */
    private final k1.r f6467d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(n1.a aVar, n1.a aVar2, j1.e eVar, k1.r rVar, k1.v vVar) {
        this.f6464a = aVar;
        this.f6465b = aVar2;
        this.f6466c = eVar;
        this.f6467d = rVar;
        vVar.c();
    }

    private i b(n nVar) {
        return i.a().i(this.f6464a.a()).k(this.f6465b.a()).j(nVar.g()).h(new h(nVar.b(), nVar.d())).g(nVar.c().a()).d();
    }

    public static t c() {
        u uVar = f6463e;
        if (uVar != null) {
            return uVar.q();
        }
        throw new IllegalStateException("Not initialized!");
    }

    private static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(b1.b.b("proto"));
    }

    public static void f(Context context) {
        if (f6463e == null) {
            synchronized (t.class) {
                if (f6463e == null) {
                    f6463e = e.w().b(context).a();
                }
            }
        }
    }

    @Override // d1.s
    public void a(n nVar, b1.h hVar) {
        this.f6466c.a(nVar.f().f(nVar.c().c()), b(nVar), hVar);
    }

    public k1.r e() {
        return this.f6467d;
    }

    public b1.g g(f fVar) {
        return new p(d(fVar), o.a().b(fVar.b()).c(fVar.getExtras()).a(), this);
    }
}
