package l1;

/* renamed from: l1.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC3301d implements W0.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* renamed from: a, reason: collision with root package name */
    private final int f34325a;

    EnumC3301d(int i8) {
        this.f34325a = i8;
    }

    @Override // W0.f
    public int getNumber() {
        return this.f34325a;
    }
}
