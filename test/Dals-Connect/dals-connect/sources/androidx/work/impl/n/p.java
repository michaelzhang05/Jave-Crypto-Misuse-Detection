package androidx.work.impl.n;

import androidx.work.x;
import cm.aptoide.pt.notification.sync.LocalNotificationSyncManager;
import java.util.List;

/* compiled from: WorkSpec.java */
/* loaded from: classes.dex */
public final class p {
    private static final String a = androidx.work.n.f("WorkSpec");

    /* renamed from: b, reason: collision with root package name */
    public static final c.b.a.c.a<List<?>, List<?>> f2017b = new a();

    /* renamed from: c, reason: collision with root package name */
    public String f2018c;

    /* renamed from: d, reason: collision with root package name */
    public x f2019d;

    /* renamed from: e, reason: collision with root package name */
    public String f2020e;

    /* renamed from: f, reason: collision with root package name */
    public String f2021f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.work.e f2022g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.work.e f2023h;

    /* renamed from: i, reason: collision with root package name */
    public long f2024i;

    /* renamed from: j, reason: collision with root package name */
    public long f2025j;

    /* renamed from: k, reason: collision with root package name */
    public long f2026k;
    public androidx.work.c l;
    public int m;
    public androidx.work.a n;
    public long o;
    public long p;
    public long q;
    public long r;
    public boolean s;
    public androidx.work.r t;

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    class a implements c.b.a.c.a<List<?>, List<?>> {
        a() {
        }
    }

    /* compiled from: WorkSpec.java */
    /* loaded from: classes.dex */
    public static class b {
        public String a;

        /* renamed from: b, reason: collision with root package name */
        public x f2027b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2027b != bVar.f2027b) {
                return false;
            }
            return this.a.equals(bVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.f2027b.hashCode();
        }
    }

    public p(String str, String str2) {
        this.f2019d = x.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f1820b;
        this.f2022g = eVar;
        this.f2023h = eVar;
        this.l = androidx.work.c.a;
        this.n = androidx.work.a.EXPONENTIAL;
        this.o = 30000L;
        this.r = -1L;
        this.t = androidx.work.r.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f2018c = str;
        this.f2020e = str2;
    }

    public long a() {
        long scalb;
        if (c()) {
            if (this.n == androidx.work.a.LINEAR) {
                scalb = this.o * this.m;
            } else {
                scalb = Math.scalb((float) this.o, this.m - 1);
            }
            return this.p + Math.min(18000000L, scalb);
        }
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = this.p;
            long j3 = j2 == 0 ? currentTimeMillis + this.f2024i : j2;
            long j4 = this.f2026k;
            long j5 = this.f2025j;
            if (j4 != j5) {
                return j3 + j5 + (j2 == 0 ? j4 * (-1) : 0L);
            }
            return j3 + (j2 != 0 ? j5 : 0L);
        }
        long j6 = this.p;
        if (j6 == 0) {
            j6 = System.currentTimeMillis();
        }
        return j6 + this.f2024i;
    }

    public boolean b() {
        return !androidx.work.c.a.equals(this.l);
    }

    public boolean c() {
        return this.f2019d == x.ENQUEUED && this.m > 0;
    }

    public boolean d() {
        return this.f2025j != 0;
    }

    public void e(long j2) {
        if (j2 < 900000) {
            androidx.work.n.c().h(a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j2 = 900000;
        }
        f(j2, j2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f2024i != pVar.f2024i || this.f2025j != pVar.f2025j || this.f2026k != pVar.f2026k || this.m != pVar.m || this.o != pVar.o || this.p != pVar.p || this.q != pVar.q || this.r != pVar.r || this.s != pVar.s || !this.f2018c.equals(pVar.f2018c) || this.f2019d != pVar.f2019d || !this.f2020e.equals(pVar.f2020e)) {
            return false;
        }
        String str = this.f2021f;
        if (str == null ? pVar.f2021f == null : str.equals(pVar.f2021f)) {
            return this.f2022g.equals(pVar.f2022g) && this.f2023h.equals(pVar.f2023h) && this.l.equals(pVar.l) && this.n == pVar.n && this.t == pVar.t;
        }
        return false;
    }

    public void f(long j2, long j3) {
        if (j2 < 900000) {
            androidx.work.n.c().h(a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", 900000L), new Throwable[0]);
            j2 = 900000;
        }
        if (j3 < LocalNotificationSyncManager.FIVE_MINUTES) {
            androidx.work.n.c().h(a, String.format("Flex duration lesser than minimum allowed value; Changed to %s", Long.valueOf(LocalNotificationSyncManager.FIVE_MINUTES)), new Throwable[0]);
            j3 = 300000;
        }
        if (j3 > j2) {
            androidx.work.n.c().h(a, String.format("Flex duration greater than interval duration; Changed to %s", Long.valueOf(j2)), new Throwable[0]);
            j3 = j2;
        }
        this.f2025j = j2;
        this.f2026k = j3;
    }

    public int hashCode() {
        int hashCode = ((((this.f2018c.hashCode() * 31) + this.f2019d.hashCode()) * 31) + this.f2020e.hashCode()) * 31;
        String str = this.f2021f;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f2022g.hashCode()) * 31) + this.f2023h.hashCode()) * 31;
        long j2 = this.f2024i;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f2025j;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.f2026k;
        int hashCode3 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.l.hashCode()) * 31) + this.m) * 31) + this.n.hashCode()) * 31;
        long j5 = this.o;
        int i4 = (hashCode3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.p;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.q;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.r;
        return ((((i6 + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.s ? 1 : 0)) * 31) + this.t.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f2018c + "}";
    }

    public p(p pVar) {
        this.f2019d = x.ENQUEUED;
        androidx.work.e eVar = androidx.work.e.f1820b;
        this.f2022g = eVar;
        this.f2023h = eVar;
        this.l = androidx.work.c.a;
        this.n = androidx.work.a.EXPONENTIAL;
        this.o = 30000L;
        this.r = -1L;
        this.t = androidx.work.r.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f2018c = pVar.f2018c;
        this.f2020e = pVar.f2020e;
        this.f2019d = pVar.f2019d;
        this.f2021f = pVar.f2021f;
        this.f2022g = new androidx.work.e(pVar.f2022g);
        this.f2023h = new androidx.work.e(pVar.f2023h);
        this.f2024i = pVar.f2024i;
        this.f2025j = pVar.f2025j;
        this.f2026k = pVar.f2026k;
        this.l = new androidx.work.c(pVar.l);
        this.m = pVar.m;
        this.n = pVar.n;
        this.o = pVar.o;
        this.p = pVar.p;
        this.q = pVar.q;
        this.r = pVar.r;
        this.s = pVar.s;
        this.t = pVar.t;
    }
}
