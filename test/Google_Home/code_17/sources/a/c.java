package A;

import B.x;
import C.InterfaceC1010d;
import D.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import s.k;
import u.p;
import u.u;
import v.InterfaceC4076e;
import v.InterfaceC4084m;

/* loaded from: classes3.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f53f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f54a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f55b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4076e f56c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1010d f57d;

    /* renamed from: e, reason: collision with root package name */
    private final D.b f58e;

    public c(Executor executor, InterfaceC4076e interfaceC4076e, x xVar, InterfaceC1010d interfaceC1010d, D.b bVar) {
        this.f55b = executor;
        this.f56c = interfaceC4076e;
        this.f54a = xVar;
        this.f57d = interfaceC1010d;
        this.f58e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, u.i iVar) {
        this.f57d.t(pVar, iVar);
        this.f54a.b(pVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final p pVar, k kVar, u.i iVar) {
        try {
            InterfaceC4084m interfaceC4084m = this.f56c.get(pVar.b());
            if (interfaceC4084m == null) {
                String format = String.format("Transport backend '%s' is not registered", pVar.b());
                f53f.warning(format);
                kVar.a(new IllegalArgumentException(format));
            } else {
                final u.i a8 = interfaceC4084m.a(iVar);
                this.f58e.f(new b.a() { // from class: A.b
                    @Override // D.b.a
                    public final Object execute() {
                        Object d8;
                        d8 = c.this.d(pVar, a8);
                        return d8;
                    }
                });
                kVar.a(null);
            }
        } catch (Exception e8) {
            f53f.warning("Error scheduling event " + e8.getMessage());
            kVar.a(e8);
        }
    }

    @Override // A.e
    public void a(final p pVar, final u.i iVar, final k kVar) {
        this.f55b.execute(new Runnable() { // from class: A.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(pVar, kVar, iVar);
            }
        });
    }
}
