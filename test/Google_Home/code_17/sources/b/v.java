package B;

import C.InterfaceC1010d;
import D.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f707a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1010d f708b;

    /* renamed from: c, reason: collision with root package name */
    private final x f709c;

    /* renamed from: d, reason: collision with root package name */
    private final D.b f710d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(Executor executor, InterfaceC1010d interfaceC1010d, x xVar, D.b bVar) {
        this.f707a = executor;
        this.f708b = interfaceC1010d;
        this.f709c = xVar;
        this.f710d = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator it = this.f708b.k().iterator();
        while (it.hasNext()) {
            this.f709c.b((u.p) it.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.f710d.f(new b.a() { // from class: B.u
            @Override // D.b.a
            public final Object execute() {
                Object d8;
                d8 = v.this.d();
                return d8;
            }
        });
    }

    public void c() {
        this.f707a.execute(new Runnable() { // from class: B.t
            @Override // java.lang.Runnable
            public final void run() {
                v.this.e();
            }
        });
    }
}
