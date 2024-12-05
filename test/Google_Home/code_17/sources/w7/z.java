package w7;

/* loaded from: classes5.dex */
public final class z extends p implements H7.c {

    /* renamed from: c, reason: collision with root package name */
    private final x f40516c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40517d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f40518e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f40519f;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final x f40520a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f40521b = null;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f40522c = null;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f40523d = null;

        public b(x xVar) {
            this.f40520a = xVar;
        }

        public z e() {
            return new z(this);
        }

        public b f(byte[] bArr) {
            this.f40523d = A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f40522c = A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f40521b = A.c(bArr);
            return this;
        }
    }

    private z(b bVar) {
        super(false, bVar.f40520a.f());
        x xVar = bVar.f40520a;
        this.f40516c = xVar;
        if (xVar == null) {
            throw new NullPointerException("params == null");
        }
        int h8 = xVar.h();
        byte[] bArr = bVar.f40523d;
        if (bArr != null) {
            if (bArr.length == h8 + h8) {
                this.f40517d = 0;
                this.f40518e = A.g(bArr, 0, h8);
                this.f40519f = A.g(bArr, h8, h8);
                return;
            } else {
                if (bArr.length != h8 + 4 + h8) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f40517d = H7.f.a(bArr, 0);
                this.f40518e = A.g(bArr, 4, h8);
                this.f40519f = A.g(bArr, 4 + h8, h8);
                return;
            }
        }
        if (xVar.e() != null) {
            this.f40517d = xVar.e().a();
        } else {
            this.f40517d = 0;
        }
        byte[] bArr2 = bVar.f40521b;
        if (bArr2 == null) {
            this.f40518e = new byte[h8];
        } else {
            if (bArr2.length != h8) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f40518e = bArr2;
        }
        byte[] bArr3 = bVar.f40522c;
        if (bArr3 == null) {
            this.f40519f = new byte[h8];
        } else {
            if (bArr3.length != h8) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f40519f = bArr3;
        }
    }

    public x b() {
        return this.f40516c;
    }

    public byte[] c() {
        return A.c(this.f40519f);
    }

    public byte[] d() {
        return A.c(this.f40518e);
    }

    public byte[] e() {
        byte[] bArr;
        int h8 = this.f40516c.h();
        int i8 = this.f40517d;
        int i9 = 0;
        if (i8 != 0) {
            bArr = new byte[h8 + 4 + h8];
            H7.f.d(i8, bArr, 0);
            i9 = 4;
        } else {
            bArr = new byte[h8 + h8];
        }
        A.e(bArr, this.f40518e, i9);
        A.e(bArr, this.f40519f, i9 + h8);
        return bArr;
    }

    @Override // H7.c
    public byte[] getEncoded() {
        return e();
    }
}
