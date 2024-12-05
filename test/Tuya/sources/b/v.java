package B;

import C.InterfaceC1070d;
import D.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f582a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1070d f583b;

    /* renamed from: c, reason: collision with root package name */
    private final x f584c;

    /* renamed from: d, reason: collision with root package name */
    private final D.b f585d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor, InterfaceC1070d interfaceC1070d, x xVar, D.b bVar) {
        this.f582a = executor;
        this.f583b = interfaceC1070d;
        this.f584c = xVar;
        this.f585d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator it = this.f583b.k().iterator();
        while (it.hasNext()) {
            this.f584c.b((u.p) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f585d.e(new b.a() { // from class: B.u
            @Override // D.b.a
            public final Object execute() {
                Object d8;
                d8 = v.this.d();
                return d8;
            }
        });
    }

    public void c() {
        this.f582a.execute(new Runnable() { // from class: B.t
            @Override // java.lang.Runnable
            public final void run() {
                v.this.e();
            }
        });
    }
}
