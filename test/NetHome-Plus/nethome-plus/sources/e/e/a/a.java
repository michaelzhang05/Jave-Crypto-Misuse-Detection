package e.e.a;

/* loaded from: classes2.dex */
public enum a {
    INVALID_REQUEST("Invalid Ad request."),
    NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
    NETWORK_ERROR("A network error occurred."),
    INTERNAL_ERROR("There was an internal error.");


    /* renamed from: k, reason: collision with root package name */
    private final String f17406k;

    a(String str) {
        this.f17406k = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17406k;
    }
}
