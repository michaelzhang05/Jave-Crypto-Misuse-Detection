package com.mbridge.msdk.e;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c f18877a;

    /* renamed from: b, reason: collision with root package name */
    private final r f18878b;

    /* renamed from: c, reason: collision with root package name */
    private final j f18879c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f18880d = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    private final long[] f18881e = new long[2];

    /* renamed from: f, reason: collision with root package name */
    private volatile i f18882f;

    public g(c cVar, r rVar, j jVar) {
        this.f18877a = cVar;
        this.f18878b = rVar;
        this.f18879c = jVar;
    }

    @Override // com.mbridge.msdk.e.l
    public final void b(final e eVar) {
        this.f18879c.b(new Runnable() { // from class: com.mbridge.msdk.e.g.1
            private void a(i iVar, int i8) {
                while (i8 > 0) {
                    if (g.this.f18877a.a(iVar) > 0) {
                        g.this.f18878b.c();
                        g.this.f18878b.d();
                        g.this.f18878b.a(eVar);
                        return;
                    }
                    i8--;
                }
                g.this.f18882f = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i iVar = new i(eVar);
                iVar.a(1);
                iVar.b(0);
                iVar.a(System.currentTimeMillis() + eVar.h());
                if (g.this.f18882f != null) {
                    a(g.this.f18882f, 5);
                    g.this.f18882f = null;
                }
                a(iVar, 5);
            }
        });
    }

    @Override // com.mbridge.msdk.e.l
    public final void a(e eVar) {
        long incrementAndGet = this.f18880d.incrementAndGet();
        this.f18881e[0] = System.currentTimeMillis();
        this.f18881e[1] = incrementAndGet;
    }

    @Override // com.mbridge.msdk.e.l
    public final long[] a() {
        long[] jArr = this.f18881e;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
