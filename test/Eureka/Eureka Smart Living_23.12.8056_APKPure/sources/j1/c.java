package j1;

import d1.o;
import d1.t;
import e1.m;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k1.x;
import m1.b;

/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f7063f = Logger.getLogger(t.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final x f7064a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f7065b;

    /* renamed from: c, reason: collision with root package name */
    private final e1.e f7066c;

    /* renamed from: d, reason: collision with root package name */
    private final l1.d f7067d;

    /* renamed from: e, reason: collision with root package name */
    private final m1.b f7068e;

    public c(Executor executor, e1.e eVar, x xVar, l1.d dVar, m1.b bVar) {
        this.f7065b = executor;
        this.f7066c = eVar;
        this.f7064a = xVar;
        this.f7067d = dVar;
        this.f7068e = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(o oVar, d1.i iVar) {
        this.f7067d.i(oVar, iVar);
        this.f7064a.a(oVar, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final o oVar, b1.h hVar, d1.i iVar) {
        try {
            m a6 = this.f7066c.a(oVar.b());
            if (a6 == null) {
                String format = String.format("Transport backend '%s' is not registered", oVar.b());
                f7063f.warning(format);
                hVar.a(new IllegalArgumentException(format));
            } else {
                final d1.i a7 = a6.a(iVar);
                this.f7068e.g(new b.a() { // from class: j1.b
                    @Override // m1.b.a
                    public final Object a() {
                        Object d6;
                        d6 = c.this.d(oVar, a7);
                        return d6;
                    }
                });
                hVar.a(null);
            }
        } catch (Exception e6) {
            f7063f.warning("Error scheduling event " + e6.getMessage());
            hVar.a(e6);
        }
    }

    @Override // j1.e
    public void a(final o oVar, final d1.i iVar, final b1.h hVar) {
        this.f7065b.execute(new Runnable() { // from class: j1.a
            @Override // java.lang.Runnable
            public final void run() {
                c.this.e(oVar, hVar, iVar);
            }
        });
    }
}
