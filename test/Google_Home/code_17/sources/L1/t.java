package l1;

/* loaded from: classes4.dex */
public enum t implements W0.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: a, reason: collision with root package name */
    private final int f34356a;

    t(int i8) {
        this.f34356a = i8;
    }

    @Override // W0.f
    public int getNumber() {
        return this.f34356a;
    }
}
