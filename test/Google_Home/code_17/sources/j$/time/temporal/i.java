package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes2.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* renamed from: a, reason: collision with root package name */
    private final String f33215a;

    static {
        Duration duration = Duration.f33031c;
    }

    i(String str) {
        this.f33215a = str;
    }

    @Override // j$.time.temporal.u
    public final m j(m mVar, long j8) {
        int i8 = c.f33211a[ordinal()];
        if (i8 == 1) {
            return mVar.d(j$.com.android.tools.r8.a.f(mVar.j(r0), j8), j.f33218c);
        }
        if (i8 == 2) {
            return mVar.e(j8 / 4, b.YEARS).e((j8 % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f33215a;
    }
}
