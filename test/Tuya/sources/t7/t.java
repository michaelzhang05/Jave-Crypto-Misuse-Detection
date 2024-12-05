package t7;

/* loaded from: classes5.dex */
public final class t extends q implements E7.c {

    /* renamed from: c, reason: collision with root package name */
    private final r f38355c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38356d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f38357e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f38358f;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final r f38359a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f38360b = null;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f38361c = null;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f38362d = null;

        public b(r rVar) {
            this.f38359a = rVar;
        }

        public t e() {
            return new t(this);
        }

        public b f(byte[] bArr) {
            this.f38362d = A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f38361c = A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f38360b = A.c(bArr);
            return this;
        }
    }

    private t(b bVar) {
        super(false, bVar.f38359a.e());
        r rVar = bVar.f38359a;
        this.f38355c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int f8 = rVar.f();
        byte[] bArr = bVar.f38362d;
        if (bArr != null) {
            if (bArr.length == f8 + f8) {
                this.f38356d = 0;
                this.f38357e = A.g(bArr, 0, f8);
                this.f38358f = A.g(bArr, f8, f8);
                return;
            } else {
                if (bArr.length != f8 + 4 + f8) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f38356d = E7.f.a(bArr, 0);
                this.f38357e = A.g(bArr, 4, f8);
                this.f38358f = A.g(bArr, 4 + f8, f8);
                return;
            }
        }
        if (rVar.d() != null) {
            this.f38356d = rVar.d().a();
        } else {
            this.f38356d = 0;
        }
        byte[] bArr2 = bVar.f38360b;
        if (bArr2 == null) {
            this.f38357e = new byte[f8];
        } else {
            if (bArr2.length != f8) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f38357e = bArr2;
        }
        byte[] bArr3 = bVar.f38361c;
        if (bArr3 == null) {
            this.f38358f = new byte[f8];
        } else {
            if (bArr3.length != f8) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f38358f = bArr3;
        }
    }

    public r b() {
        return this.f38355c;
    }

    public byte[] c() {
        return A.c(this.f38358f);
    }

    public byte[] d() {
        return A.c(this.f38357e);
    }

    public byte[] e() {
        byte[] bArr;
        int f8 = this.f38355c.f();
        int i8 = this.f38356d;
        int i9 = 0;
        if (i8 != 0) {
            bArr = new byte[f8 + 4 + f8];
            E7.f.d(i8, bArr, 0);
            i9 = 4;
        } else {
            bArr = new byte[f8 + f8];
        }
        A.e(bArr, this.f38357e, i9);
        A.e(bArr, this.f38358f, i9 + f8);
        return bArr;
    }

    @Override // E7.c
    public byte[] getEncoded() {
        return e();
    }
}
