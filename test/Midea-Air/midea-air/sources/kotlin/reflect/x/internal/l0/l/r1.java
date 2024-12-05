package kotlin.reflect.x.internal.l0.l;

import okhttp3.HttpUrl;

/* compiled from: Variance.kt */
/* loaded from: classes2.dex */
public enum r1 {
    INVARIANT(HttpUrl.FRAGMENT_ENCODE_SET, true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);


    /* renamed from: j, reason: collision with root package name */
    private final String f21290j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f21291k;
    private final boolean l;
    private final int m;

    r1(String str, boolean z, boolean z2, int i2) {
        this.f21290j = str;
        this.f21291k = z;
        this.l = z2;
        this.m = i2;
    }

    public final boolean f() {
        return this.l;
    }

    public final String i() {
        return this.f21290j;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f21290j;
    }
}
