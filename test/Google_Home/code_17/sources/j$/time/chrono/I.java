package j$.time.chrono;

/* loaded from: classes2.dex */
abstract /* synthetic */ class I {

    /* renamed from: a, reason: collision with root package name */
    static final /* synthetic */ int[] f33064a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f33064a = iArr;
        try {
            iArr[j$.time.temporal.a.DAY_OF_MONTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f33064a[j$.time.temporal.a.DAY_OF_YEAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f33064a[j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f33064a[j$.time.temporal.a.YEAR_OF_ERA.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f33064a[j$.time.temporal.a.PROLEPTIC_MONTH.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f33064a[j$.time.temporal.a.YEAR.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            f33064a[j$.time.temporal.a.ERA.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
    }
}
