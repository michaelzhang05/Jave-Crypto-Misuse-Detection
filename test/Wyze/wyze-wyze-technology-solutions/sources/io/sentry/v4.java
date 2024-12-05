package io.sentry;

import java.util.Date;

/* compiled from: SentryNanotimeDate.java */
/* loaded from: classes2.dex */
public final class v4 extends f4 {

    /* renamed from: f, reason: collision with root package name */
    private final Date f19299f;

    /* renamed from: g, reason: collision with root package name */
    private final long f19300g;

    public v4() {
        this(a1.c(), System.nanoTime());
    }

    private long x(v4 v4Var, v4 v4Var2) {
        return v4Var.r() + (v4Var2.f19300g - v4Var.f19300g);
    }

    @Override // io.sentry.f4, java.lang.Comparable
    /* renamed from: d */
    public int compareTo(f4 f4Var) {
        if (f4Var instanceof v4) {
            v4 v4Var = (v4) f4Var;
            long time = this.f19299f.getTime();
            long time2 = v4Var.f19299f.getTime();
            if (time == time2) {
                return Long.valueOf(this.f19300g).compareTo(Long.valueOf(v4Var.f19300g));
            }
            return Long.valueOf(time).compareTo(Long.valueOf(time2));
        }
        return super.compareTo(f4Var);
    }

    @Override // io.sentry.f4
    public long f(f4 f4Var) {
        if (f4Var instanceof v4) {
            return this.f19300g - ((v4) f4Var).f19300g;
        }
        return super.f(f4Var);
    }

    @Override // io.sentry.f4
    public long o(f4 f4Var) {
        if (f4Var != null && (f4Var instanceof v4)) {
            v4 v4Var = (v4) f4Var;
            if (compareTo(f4Var) < 0) {
                return x(this, v4Var);
            }
            return x(v4Var, this);
        }
        return super.o(f4Var);
    }

    @Override // io.sentry.f4
    public long r() {
        return a1.a(this.f19299f);
    }

    public v4(Date date, long j2) {
        this.f19299f = date;
        this.f19300g = j2;
    }
}
