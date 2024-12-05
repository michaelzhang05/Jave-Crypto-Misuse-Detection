package c1;

import c1.e;

/* loaded from: classes.dex */
public abstract class k {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract k a();

        public abstract a b(c1.a aVar);

        public abstract a c(b bVar);
    }

    /* loaded from: classes.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: a, reason: collision with root package name */
        private final int f3964a;

        b(int i6) {
            this.f3964a = i6;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract c1.a b();

    public abstract b c();
}
