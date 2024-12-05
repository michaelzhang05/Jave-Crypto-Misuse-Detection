package t;

import t.e;

/* loaded from: classes3.dex */
public abstract class o {

    /* loaded from: classes3.dex */
    public static abstract class a {
        public abstract o a();

        public abstract a b(AbstractC4021a abstractC4021a);

        public abstract a c(b bVar);
    }

    /* loaded from: classes3.dex */
    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* renamed from: a, reason: collision with root package name */
        private final int f39473a;

        b(int i8) {
            this.f39473a = i8;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract AbstractC4021a b();

    public abstract b c();
}
