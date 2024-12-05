package k1;

import java.util.Iterator;
import java.util.concurrent.Executor;
import m1.b;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f7160a;

    /* renamed from: b, reason: collision with root package name */
    private final l1.d f7161b;

    /* renamed from: c, reason: collision with root package name */
    private final x f7162c;

    /* renamed from: d, reason: collision with root package name */
    private final m1.b f7163d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor, l1.d dVar, x xVar, m1.b bVar) {
        this.f7160a = executor;
        this.f7161b = dVar;
        this.f7162c = xVar;
        this.f7163d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator it = this.f7161b.F().iterator();
        while (it.hasNext()) {
            this.f7162c.a((d1.o) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f7163d.g(new b.a() { // from class: k1.u
            @Override // m1.b.a
            public final Object a() {
                Object d6;
                d6 = v.this.d();
                return d6;
            }
        });
    }

    public void c() {
        this.f7160a.execute(new Runnable() { // from class: k1.t
            @Override // java.lang.Runnable
            public final void run() {
                v.this.e();
            }
        });
    }
}
