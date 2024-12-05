package i4;

/* loaded from: classes.dex */
public interface j {

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);


        /* renamed from: a, reason: collision with root package name */
        private final int f7009a;

        a(int i6) {
            this.f7009a = i6;
        }

        public int a() {
            return this.f7009a;
        }
    }

    a b(String str);
}
