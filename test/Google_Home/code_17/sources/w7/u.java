package w7;

import java.io.Serializable;

/* loaded from: classes5.dex */
public final class u implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final int f40490a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f40491b;

    /* JADX INFO: Access modifiers changed from: protected */
    public u(int i8, byte[] bArr) {
        this.f40490a = i8;
        this.f40491b = bArr;
    }

    public int a() {
        return this.f40490a;
    }

    public byte[] b() {
        return A.c(this.f40491b);
    }
}
