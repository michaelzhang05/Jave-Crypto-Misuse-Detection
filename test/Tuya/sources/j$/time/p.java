package j$.time;

/* loaded from: classes2.dex */
abstract /* synthetic */ class p {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f32001a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f32001a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f32001a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
