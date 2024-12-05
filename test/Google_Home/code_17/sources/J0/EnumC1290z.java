package J0;

/* renamed from: J0.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1290z {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: a, reason: collision with root package name */
    private final int f4805a;

    EnumC1290z(int i8) {
        this.f4805a = i8;
    }

    public static EnumC1290z b(String str) {
        if (str != null) {
            return APP_STORE;
        }
        return DEVELOPER;
    }

    public int c() {
        return this.f4805a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f4805a);
    }
}
