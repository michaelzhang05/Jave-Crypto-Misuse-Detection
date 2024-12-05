package g7;

import b7.InterfaceC1991b;

/* renamed from: g7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2888a implements InterfaceC1991b {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f32091a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f32092b;

    /* renamed from: c, reason: collision with root package name */
    private C2890c f32093c;

    /* renamed from: d, reason: collision with root package name */
    private int f32094d;

    public C2888a(C2890c c2890c, int i8, byte[] bArr, byte[] bArr2) {
        this.f32093c = c2890c;
        this.f32092b = H7.a.d(bArr);
        this.f32094d = i8;
        this.f32091a = H7.a.d(bArr2);
    }

    public byte[] a() {
        return H7.a.d(this.f32091a);
    }

    public C2890c b() {
        return this.f32093c;
    }

    public int c() {
        return this.f32094d;
    }

    public byte[] d() {
        return H7.a.d(this.f32092b);
    }
}
