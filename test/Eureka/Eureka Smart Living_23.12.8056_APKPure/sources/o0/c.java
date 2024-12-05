package o0;

import java.util.Objects;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final d[] f8201a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8202b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8203c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8204d;

    public c(String str, d[] dVarArr) {
        this.f8202b = str;
        this.f8203c = null;
        this.f8201a = dVarArr;
        this.f8204d = 0;
    }

    public String a() {
        return this.f8202b;
    }

    public c(byte[] bArr, d[] dVarArr) {
        Objects.requireNonNull(bArr);
        this.f8203c = bArr;
        this.f8202b = null;
        this.f8201a = dVarArr;
        this.f8204d = 1;
    }
}
