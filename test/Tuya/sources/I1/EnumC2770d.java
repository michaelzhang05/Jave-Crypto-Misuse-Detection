package i1;

/* renamed from: i1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC2770d implements U0.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* renamed from: a, reason: collision with root package name */
    private final int f31472a;

    EnumC2770d(int i8) {
        this.f31472a = i8;
    }

    @Override // U0.f
    public int getNumber() {
        return this.f31472a;
    }
}
