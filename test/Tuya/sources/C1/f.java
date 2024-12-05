package c1;

import c1.C1903b;

/* loaded from: classes3.dex */
public abstract class f {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j8);
    }

    /* loaded from: classes3.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new C1903b.C0365b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
