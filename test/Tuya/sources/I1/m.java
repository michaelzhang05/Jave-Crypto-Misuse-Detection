package i1;

/* loaded from: classes3.dex */
public enum m implements U0.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: a, reason: collision with root package name */
    private final int f31505a;

    m(int i8) {
        this.f31505a = i8;
    }

    @Override // U0.f
    public int getNumber() {
        return this.f31505a;
    }
}
