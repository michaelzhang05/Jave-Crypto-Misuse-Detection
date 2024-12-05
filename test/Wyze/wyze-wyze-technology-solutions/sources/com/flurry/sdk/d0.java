package com.flurry.sdk;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class d0 extends d7<c0> {
    public AtomicLong p;
    public AtomicLong q;
    public AtomicBoolean r;
    public long s;
    private long t;
    public List<e.d.a.c> u;
    private h7 v;
    private f7<i7> w;

    /* loaded from: classes2.dex */
    final class a implements f7<i7> {
        a() {
        }

        @Override // com.flurry.sdk.f7
        public final /* synthetic */ void a(i7 i7Var) {
            int i2 = g.a[i7Var.f9949b.ordinal()];
            if (i2 == 1) {
                d0.this.C(f0.FOREGROUND, false);
            } else {
                if (i2 != 2) {
                    return;
                }
                d0.this.D(f0.FOREGROUND, false);
            }
        }
    }

    /* loaded from: classes2.dex */
    final class b extends f2 {
        b() {
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            d0.this.t = p2.f("initial_run_time", Long.MIN_VALUE);
        }
    }

    /* loaded from: classes2.dex */
    public class c extends f2 {
        public c() {
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            d0.this.t = Long.MIN_VALUE;
        }
    }

    /* loaded from: classes2.dex */
    final class d extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ List f9804h;

        d(List list) {
            this.f9804h = list;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            for (e.d.a.c cVar : this.f9804h) {
                if (cVar != null) {
                    cVar.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class e extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f9806h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f9807i;

        e(f0 f0Var, boolean z) {
            this.f9806h = f0Var;
            this.f9807i = z;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            d1.c(3, "ReportingProvider", "Start session: " + this.f9806h.name() + ", isManualSession: " + this.f9807i);
            d0.B(d0.this, this.f9806h, e0.SESSION_START, this.f9807i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public final class f extends f2 {

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ f0 f9809h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f9810i;

        f(f0 f0Var, boolean z) {
            this.f9809h = f0Var;
            this.f9810i = z;
        }

        @Override // com.flurry.sdk.f2
        public final void a() throws Exception {
            d1.c(3, "ReportingProvider", "End session: " + this.f9809h.name() + ", isManualSession: " + this.f9810i);
            d0.B(d0.this, this.f9809h, e0.SESSION_END, this.f9810i);
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class g {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g7.values().length];
            a = iArr;
            try {
                iArr[g7.FOREGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[g7.BACKGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public d0(h7 h7Var) {
        super("ReportingProvider");
        this.p = new AtomicLong(0L);
        this.q = new AtomicLong(0L);
        this.r = new AtomicBoolean(true);
        this.w = new a();
        this.u = new ArrayList();
        this.v = h7Var;
        h7Var.v(this.w);
        m(new b());
    }

    static /* synthetic */ void B(d0 d0Var, f0 f0Var, e0 e0Var, boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        if (d0Var.t == Long.MIN_VALUE) {
            d0Var.t = currentTimeMillis;
            p2.c("initial_run_time", currentTimeMillis);
            d1.c(3, "ReportingProvider", "Refresh initial timestamp");
        }
        d0Var.t(new c0(f0Var, currentTimeMillis, d0Var.t, f0Var.equals(f0.FOREGROUND) ? d0Var.s : 60000L, e0Var, z));
    }

    public final void A(e.d.a.c cVar) {
        if (cVar == null) {
            d1.c(2, "ReportingProvider", "Cannot register with null listener");
        } else {
            this.u.add(cVar);
        }
    }

    public final void C(f0 f0Var, boolean z) {
        m(new e(f0Var, z));
    }

    public final void D(f0 f0Var, boolean z) {
        m(new f(f0Var, z));
    }

    public final String y() {
        return String.valueOf(this.p.get());
    }

    public final void z(long j2, long j3) {
        this.p.set(j2);
        this.q.set(j3);
        if (this.u.isEmpty()) {
            return;
        }
        r(new d(new ArrayList(this.u)));
    }
}
