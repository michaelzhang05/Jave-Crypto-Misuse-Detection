package w7;

/* loaded from: classes5.dex */
public final class t extends q implements H7.c {

    /* renamed from: c, reason: collision with root package name */
    private final r f40482c;

    /* renamed from: d, reason: collision with root package name */
    private final int f40483d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f40484e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f40485f;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final r f40486a;

        /* renamed from: b, reason: collision with root package name */
        private byte[] f40487b = null;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f40488c = null;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f40489d = null;

        public b(r rVar) {
            this.f40486a = rVar;
        }

        public t e() {
            return new t(this);
        }

        public b f(byte[] bArr) {
            this.f40489d = A.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f40488c = A.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f40487b = A.c(bArr);
            return this;
        }
    }

    private t(b bVar) {
        super(false, bVar.f40486a.e());
        r rVar = bVar.f40486a;
        this.f40482c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int f8 = rVar.f();
        byte[] bArr = bVar.f40489d;
        if (bArr != null) {
            if (bArr.length == f8 + f8) {
                this.f40483d = 0;
                this.f40484e = A.g(bArr, 0, f8);
                this.f40485f = A.g(bArr, f8, f8);
                return;
            } else {
                if (bArr.length != f8 + 4 + f8) {
                    throw new IllegalArgumentException("public key has wrong size");
                }
                this.f40483d = H7.f.a(bArr, 0);
                this.f40484e = A.g(bArr, 4, f8);
                this.f40485f = A.g(bArr, 4 + f8, f8);
                return;
            }
        }
        if (rVar.d() != null) {
            this.f40483d = rVar.d().a();
        } else {
            this.f40483d = 0;
        }
        byte[] bArr2 = bVar.f40487b;
        if (bArr2 == null) {
            this.f40484e = new byte[f8];
        } else {
            if (bArr2.length != f8) {
                throw new IllegalArgumentException("length of root must be equal to length of digest");
            }
            this.f40484e = bArr2;
        }
        byte[] bArr3 = bVar.f40488c;
        if (bArr3 == null) {
            this.f40485f = new byte[f8];
        } else {
            if (bArr3.length != f8) {
                throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
            }
            this.f40485f = bArr3;
        }
    }

    public r b() {
        return this.f40482c;
    }

    public byte[] c() {
        return A.c(this.f40485f);
    }

    public byte[] d() {
        return A.c(this.f40484e);
    }

    public byte[] e() {
        byte[] bArr;
        int f8 = this.f40482c.f();
        int i8 = this.f40483d;
        int i9 = 0;
        if (i8 != 0) {
            bArr = new byte[f8 + 4 + f8];
            H7.f.d(i8, bArr, 0);
            i9 = 4;
        } else {
            bArr = new byte[f8 + f8];
        }
        A.e(bArr, this.f40484e, i9);
        A.e(bArr, this.f40485f, i9 + f8);
        return bArr;
    }

    @Override // H7.c
    public byte[] getEncoded() {
        return e();
    }
}
