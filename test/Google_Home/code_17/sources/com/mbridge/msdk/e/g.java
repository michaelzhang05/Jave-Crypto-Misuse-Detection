package com.mbridge.msdk.e;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    private final c f19932a;

    /* renamed from: b, reason: collision with root package name */
    private final r f19933b;

    /* renamed from: c, reason: collision with root package name */
    private final j f19934c;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicLong f19935d = new AtomicLong(0);

    /* renamed from: e, reason: collision with root package name */
    private final long[] f19936e = new long[2];

    /* renamed from: f, reason: collision with root package name */
    private volatile i f19937f;

    public g(c cVar, r rVar, j jVar) {
        this.f19932a = cVar;
        this.f19933b = rVar;
        this.f19934c = jVar;
    }

    @Override // com.mbridge.msdk.e.l
    public final void b(final e eVar) {
        this.f19934c.b(new Runnable() { // from class: com.mbridge.msdk.e.g.1
            private void a(i iVar, int i8) {
                while (i8 > 0) {
                    if (g.this.f19932a.a(iVar) > 0) {
                        g.this.f19933b.c();
                        g.this.f19933b.d();
                        g.this.f19933b.a(eVar);
                        return;
                    }
                    i8--;
                }
                g.this.f19937f = iVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                i iVar = new i(eVar);
                iVar.a(1);
                iVar.b(0);
                iVar.a(System.currentTimeMillis() + eVar.h());
                if (g.this.f19937f != null) {
                    a(g.this.f19937f, 5);
                    g.this.f19937f = null;
                }
                a(iVar, 5);
            }
        });
    }

    @Override // com.mbridge.msdk.e.l
    public final void a(e eVar) {
        long incrementAndGet = this.f19935d.incrementAndGet();
        this.f19936e[0] = System.currentTimeMillis();
        this.f19936e[1] = incrementAndGet;
    }

    @Override // com.mbridge.msdk.e.l
    public final long[] a() {
        long[] jArr = this.f19936e;
        return jArr.length == 0 ? new long[]{0, 0} : jArr;
    }
}
