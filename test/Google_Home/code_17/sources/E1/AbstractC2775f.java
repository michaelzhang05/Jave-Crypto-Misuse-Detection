package e1;

import e1.C2771b;

/* renamed from: e1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2775f {

    /* renamed from: e1.f$a */
    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract AbstractC2775f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j8);
    }

    /* renamed from: e1.f$b */
    /* loaded from: classes3.dex */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new C2771b.C0719b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
