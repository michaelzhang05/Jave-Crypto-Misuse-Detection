package l7;

/* renamed from: l7.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3381n {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f34861a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f34862b;

    /* renamed from: c, reason: collision with root package name */
    private final Y6.e f34863c;

    /* renamed from: d, reason: collision with root package name */
    private int f34864d;

    /* renamed from: e, reason: collision with root package name */
    private int f34865e;

    public C3381n(byte[] bArr, byte[] bArr2, Y6.e eVar) {
        this.f34861a = bArr;
        this.f34862b = bArr2;
        this.f34863c = eVar;
    }

    public void a(byte[] bArr, boolean z8, int i8) {
        b(bArr, i8);
        if (z8) {
            this.f34865e++;
        }
    }

    public byte[] b(byte[] bArr, int i8) {
        if (bArr.length >= this.f34863c.f()) {
            Y6.e eVar = this.f34863c;
            byte[] bArr2 = this.f34861a;
            eVar.b(bArr2, 0, bArr2.length);
            this.f34863c.c((byte) (this.f34864d >>> 24));
            this.f34863c.c((byte) (this.f34864d >>> 16));
            this.f34863c.c((byte) (this.f34864d >>> 8));
            this.f34863c.c((byte) this.f34864d);
            this.f34863c.c((byte) (this.f34865e >>> 8));
            this.f34863c.c((byte) this.f34865e);
            this.f34863c.c((byte) -1);
            Y6.e eVar2 = this.f34863c;
            byte[] bArr3 = this.f34862b;
            eVar2.b(bArr3, 0, bArr3.length);
            this.f34863c.a(bArr, i8);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    public void c(int i8) {
        this.f34865e = i8;
    }

    public void d(int i8) {
        this.f34864d = i8;
    }
}
