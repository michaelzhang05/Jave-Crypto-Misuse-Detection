package kotlin.reflect.x.internal.l0.l.w1;

import okhttp3.HttpUrl;

/* compiled from: TypeSystemContext.kt */
/* loaded from: classes2.dex */
public enum u {
    IN("in"),
    OUT("out"),
    INV(HttpUrl.FRAGMENT_ENCODE_SET);


    /* renamed from: j, reason: collision with root package name */
    private final String f21384j;

    u(String str) {
        this.f21384j = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f21384j;
    }
}
