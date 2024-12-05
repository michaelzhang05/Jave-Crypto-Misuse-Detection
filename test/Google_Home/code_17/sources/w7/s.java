package w7;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class s extends q implements H7.c {

    /* renamed from: c, reason: collision with root package name */
    private final r f40465c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f40466d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f40467e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f40468f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f40469g;

    /* renamed from: h, reason: collision with root package name */
    private volatile long f40470h;

    /* renamed from: i, reason: collision with root package name */
    private volatile w7.b f40471i;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final r f40472a;

        /* renamed from: b, reason: collision with root package name */
        private long f40473b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f40474c = -1;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f40475d = null;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f40476e = null;

        /* renamed from: f, reason: collision with root package name */
        private byte[] f40477f = null;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f40478g = null;

        /* renamed from: h, reason: collision with root package name */
        private w7.b f40479h = null;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f40480i = null;

        /* renamed from: j, reason: collision with root package name */
        private x f40481j = null;

        public b(r rVar) {
            this.f40472a = rVar;
        }

        public s k() {
            return new s(this);
        }

        public b l(w7.b bVar) {
            if (bVar.b() == 0) {
                this.f40479h = new w7.b(bVar, (1 << this.f40472a.a()) - 1);
            } else {
                this.f40479h = bVar;
            }
            return this;
        }

        public b m(long j8) {
            this.f40473b = j8;
            return this;
        }

        public b n(long j8) {
            this.f40474c = j8;
            return this;
        }

        public b o(byte[] bArr) {
            this.f40477f = A.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f40478g = A.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f40476e = A.c(bArr);
            return this;
        }

        public b r(byte[] bArr) {
            this.f40475d = A.c(bArr);
            return this;
        }
    }

    private s(b bVar) {
        super(true, bVar.f40472a.e());
        r rVar = bVar.f40472a;
        this.f40465c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int f8 = rVar.f();
        byte[] bArr = bVar.f40480i;
        if (bArr != null) {
            if (bVar.f40481j == null) {
                throw new NullPointerException("xmss == null");
            }
            int a8 = rVar.a();
            int i8 = (a8 + 7) / 8;
            this.f40470h = A.a(bArr, 0, i8);
            if (!A.l(a8, this.f40470h)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f40466d = A.g(bArr, i8, f8);
            int i9 = i8 + f8;
            this.f40467e = A.g(bArr, i9, f8);
            int i10 = i9 + f8;
            this.f40468f = A.g(bArr, i10, f8);
            int i11 = i10 + f8;
            this.f40469g = A.g(bArr, i11, f8);
            int i12 = i11 + f8;
            try {
                this.f40471i = ((w7.b) A.f(A.g(bArr, i12, bArr.length - i12), w7.b.class)).f(bVar.f40481j.g());
                return;
            } catch (IOException e8) {
                throw new IllegalArgumentException(e8.getMessage(), e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalArgumentException(e9.getMessage(), e9);
            }
        }
        this.f40470h = bVar.f40473b;
        byte[] bArr2 = bVar.f40475d;
        if (bArr2 == null) {
            this.f40466d = new byte[f8];
        } else {
            if (bArr2.length != f8) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f40466d = bArr2;
        }
        byte[] bArr3 = bVar.f40476e;
        if (bArr3 == null) {
            this.f40467e = new byte[f8];
        } else {
            if (bArr3.length != f8) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f40467e = bArr3;
        }
        byte[] bArr4 = bVar.f40477f;
        if (bArr4 == null) {
            this.f40468f = new byte[f8];
        } else {
            if (bArr4.length != f8) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f40468f = bArr4;
        }
        byte[] bArr5 = bVar.f40478g;
        if (bArr5 == null) {
            this.f40469g = new byte[f8];
        } else {
            if (bArr5.length != f8) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f40469g = bArr5;
        }
        w7.b bVar2 = bVar.f40479h;
        if (bVar2 == null) {
            bVar2 = (!A.l(rVar.a(), bVar.f40473b) || bArr4 == null || bArr2 == null) ? new w7.b(bVar.f40474c + 1) : new w7.b(rVar, bVar.f40473b, bArr4, bArr2);
        }
        this.f40471i = bVar2;
        if (bVar.f40474c >= 0 && bVar.f40474c != this.f40471i.b()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public r b() {
        return this.f40465c;
    }

    public byte[] c() {
        byte[] f8;
        synchronized (this) {
            try {
                int f9 = this.f40465c.f();
                int a8 = (this.f40465c.a() + 7) / 8;
                byte[] bArr = new byte[a8 + f9 + f9 + f9 + f9];
                A.e(bArr, A.q(this.f40470h, a8), 0);
                A.e(bArr, this.f40466d, a8);
                int i8 = a8 + f9;
                A.e(bArr, this.f40467e, i8);
                int i9 = i8 + f9;
                A.e(bArr, this.f40468f, i9);
                A.e(bArr, this.f40469g, i9 + f9);
                try {
                    f8 = H7.a.f(bArr, A.p(this.f40471i));
                } catch (IOException e8) {
                    throw new IllegalStateException("error serializing bds state: " + e8.getMessage(), e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8;
    }

    @Override // H7.c
    public byte[] getEncoded() {
        byte[] c8;
        synchronized (this) {
            c8 = c();
        }
        return c8;
    }
}
