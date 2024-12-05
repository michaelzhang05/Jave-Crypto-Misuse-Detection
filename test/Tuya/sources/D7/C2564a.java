package d7;

/* renamed from: d7.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2564a implements Y6.b {

    /* renamed from: a, reason: collision with root package name */
    private byte[] f30211a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f30212b;

    /* renamed from: c, reason: collision with root package name */
    private C2566c f30213c;

    /* renamed from: d, reason: collision with root package name */
    private int f30214d;

    public C2564a(C2566c c2566c, int i8, byte[] bArr, byte[] bArr2) {
        this.f30213c = c2566c;
        this.f30212b = E7.a.d(bArr);
        this.f30214d = i8;
        this.f30211a = E7.a.d(bArr2);
    }

    public byte[] a() {
        return E7.a.d(this.f30211a);
    }

    public C2566c b() {
        return this.f30213c;
    }

    public int c() {
        return this.f30214d;
    }

    public byte[] d() {
        return E7.a.d(this.f30212b);
    }
}
