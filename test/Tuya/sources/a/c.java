package A;

import B.x;
import C.InterfaceC1070d;
import D.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import u.p;
import u.u;
import v.m;

/* loaded from: classes3.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f53f = Logger.getLogger(u.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f54a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f55b;

    /* renamed from: c, reason: collision with root package name */
    private final v.e f56c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1070d f57d;

    /* renamed from: e, reason: collision with root package name */
    private final D.b f58e;

    public c(Executor executor, v.e eVar, x xVar, InterfaceC1070d interfaceC1070d, D.b bVar) {
        this.f55b = executor;
        this.f56c = eVar;
        this.f54a = xVar;
        this.f57d = interfaceC1070d;
        this.f58e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(p pVar, u.i iVar) {
        this.f57d.v(pVar, iVar);
        this.f54a.b(pVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final p pVar, s.h hVar, u.i iVar) {
        try {
            m mVar = this.f56c.get(pVar.b());
            if (mVar == null) {
                String format = String.format("Transport backend '%s' is not registered", pVar.b());
                f53f.warning(format);
                hVar.a(new IllegalArgumentException(format));
            } else {
                final u.i a8 = mVar.a(iVar);
                this.f58e.e(new b.a() { // from class: A.b
                    @Override // D.b.a
                    public final Object execute() {
                        Object d8;
                        d8 = c.this.d(pVar, a8);
                        return d8;
                    }
                });
                hVar.a(null);
            }
        } catch (Exception e8) {
            f53f.warning("Error scheduling event " + e8.getMessage());
            hVar.a(e8);
        }
    }

    @Override // A.e
    public void a(final p pVar, final u.i iVar, final s.h hVar) {
        this.f55b.execute(new Runnable() { // from class: A.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(pVar, hVar, iVar);
            }
        });
    }
}
