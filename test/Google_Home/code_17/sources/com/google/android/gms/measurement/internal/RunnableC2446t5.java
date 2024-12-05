package com.google.android.gms.measurement.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.t5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2446t5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    long f17838a;

    /* renamed from: b, reason: collision with root package name */
    long f17839b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C2426q5 f17840c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC2446t5(C2426q5 c2426q5, long j8, long j9) {
        this.f17840c = c2426q5;
        this.f17838a = j8;
        this.f17839b = j9;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17840c.f17783b.e().D(new Runnable() { // from class: com.google.android.gms.measurement.internal.s5
            @Override // java.lang.Runnable
            public final void run() {
                RunnableC2446t5 runnableC2446t5 = RunnableC2446t5.this;
                C2426q5 c2426q5 = runnableC2446t5.f17840c;
                long j8 = runnableC2446t5.f17838a;
                long j9 = runnableC2446t5.f17839b;
                c2426q5.f17783b.k();
                c2426q5.f17783b.c().F().a("Application going to the background");
                c2426q5.f17783b.f().f17831u.a(true);
                c2426q5.f17783b.D(true);
                if (!c2426q5.f17783b.a().Z()) {
                    if (c2426q5.f17783b.a().q(H.f17082P0)) {
                        c2426q5.f17783b.E(false, false, j9);
                        c2426q5.f17783b.f17765f.e(j9);
                    } else {
                        c2426q5.f17783b.f17765f.e(j9);
                        c2426q5.f17783b.E(false, false, j9);
                    }
                }
                c2426q5.f17783b.c().J().b("Application backgrounded at: timestamp_millis", Long.valueOf(j8));
                if (c2426q5.f17783b.a().q(H.f17129i1)) {
                    c2426q5.f17783b.o().B0();
                }
            }
        });
    }
}
