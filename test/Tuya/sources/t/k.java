package t;

import t.C3767e;

/* loaded from: classes3.dex */
public abstract class k {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract k a();

        public abstract a b(AbstractC3763a abstractC3763a);

        public abstract a c(b bVar);
    }

    /* loaded from: classes3.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: a, reason: collision with root package name */
        private final int f38147a;

        b(int i8) {
            this.f38147a = i8;
        }
    }

    public static a a() {
        return new C3767e.b();
    }

    public abstract AbstractC3763a b();

    public abstract b c();
}
