package io.sentry;

/* compiled from: SentryDate.java */
/* loaded from: classes2.dex */
public abstract class f4 implements Comparable<f4> {
    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(f4 f4Var) {
        return Long.valueOf(r()).compareTo(Long.valueOf(f4Var.r()));
    }

    public long f(f4 f4Var) {
        return r() - f4Var.r();
    }

    public final boolean i(f4 f4Var) {
        return f(f4Var) > 0;
    }

    public final boolean n(f4 f4Var) {
        return f(f4Var) < 0;
    }

    public long o(f4 f4Var) {
        if (f4Var != null && compareTo(f4Var) < 0) {
            return f4Var.r();
        }
        return r();
    }

    public abstract long r();
}
