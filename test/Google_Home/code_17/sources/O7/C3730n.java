package o7;

/* renamed from: o7.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3730n {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f36878a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f36879b;

    /* renamed from: c, reason: collision with root package name */
    private final b7.e f36880c;

    /* renamed from: d, reason: collision with root package name */
    private int f36881d;

    /* renamed from: e, reason: collision with root package name */
    private int f36882e;

    public C3730n(byte[] bArr, byte[] bArr2, b7.e eVar) {
        this.f36878a = bArr;
        this.f36879b = bArr2;
        this.f36880c = eVar;
    }

    public void a(byte[] bArr, boolean z8, int i8) {
        b(bArr, i8);
        if (z8) {
            this.f36882e++;
        }
    }

    public byte[] b(byte[] bArr, int i8) {
        if (bArr.length >= this.f36880c.f()) {
            b7.e eVar = this.f36880c;
            byte[] bArr2 = this.f36878a;
            eVar.b(bArr2, 0, bArr2.length);
            this.f36880c.c((byte) (this.f36881d >>> 24));
            this.f36880c.c((byte) (this.f36881d >>> 16));
            this.f36880c.c((byte) (this.f36881d >>> 8));
            this.f36880c.c((byte) this.f36881d);
            this.f36880c.c((byte) (this.f36882e >>> 8));
            this.f36880c.c((byte) this.f36882e);
            this.f36880c.c((byte) -1);
            b7.e eVar2 = this.f36880c;
            byte[] bArr3 = this.f36879b;
            eVar2.b(bArr3, 0, bArr3.length);
            this.f36880c.a(bArr, i8);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    public void c(int i8) {
        this.f36882e = i8;
    }

    public void d(int i8) {
        this.f36881d = i8;
    }
}
