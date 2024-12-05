package t7;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class s extends q implements E7.c {

    /* renamed from: c, reason: collision with root package name */
    private final r f38338c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f38339d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f38340e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f38341f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f38342g;

    /* renamed from: h, reason: collision with root package name */
    private volatile long f38343h;

    /* renamed from: i, reason: collision with root package name */
    private volatile t7.b f38344i;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final r f38345a;

        /* renamed from: b, reason: collision with root package name */
        private long f38346b = 0;

        /* renamed from: c, reason: collision with root package name */
        private long f38347c = -1;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f38348d = null;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f38349e = null;

        /* renamed from: f, reason: collision with root package name */
        private byte[] f38350f = null;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f38351g = null;

        /* renamed from: h, reason: collision with root package name */
        private t7.b f38352h = null;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f38353i = null;

        /* renamed from: j, reason: collision with root package name */
        private x f38354j = null;

        public b(r rVar) {
            this.f38345a = rVar;
        }

        public s k() {
            return new s(this);
        }

        public b l(t7.b bVar) {
            if (bVar.b() == 0) {
                this.f38352h = new t7.b(bVar, (1 << this.f38345a.a()) - 1);
            } else {
                this.f38352h = bVar;
            }
            return this;
        }

        public b m(long j8) {
            this.f38346b = j8;
            return this;
        }

        public b n(long j8) {
            this.f38347c = j8;
            return this;
        }

        public b o(byte[] bArr) {
            this.f38350f = A.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f38351g = A.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f38349e = A.c(bArr);
            return this;
        }

        public b r(byte[] bArr) {
            this.f38348d = A.c(bArr);
            return this;
        }
    }

    private s(b bVar) {
        super(true, bVar.f38345a.e());
        r rVar = bVar.f38345a;
        this.f38338c = rVar;
        if (rVar == null) {
            throw new NullPointerException("params == null");
        }
        int f8 = rVar.f();
        byte[] bArr = bVar.f38353i;
        if (bArr != null) {
            if (bVar.f38354j == null) {
                throw new NullPointerException("xmss == null");
            }
            int a8 = rVar.a();
            int i8 = (a8 + 7) / 8;
            this.f38343h = A.a(bArr, 0, i8);
            if (!A.l(a8, this.f38343h)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f38339d = A.g(bArr, i8, f8);
            int i9 = i8 + f8;
            this.f38340e = A.g(bArr, i9, f8);
            int i10 = i9 + f8;
            this.f38341f = A.g(bArr, i10, f8);
            int i11 = i10 + f8;
            this.f38342g = A.g(bArr, i11, f8);
            int i12 = i11 + f8;
            try {
                this.f38344i = ((t7.b) A.f(A.g(bArr, i12, bArr.length - i12), t7.b.class)).f(bVar.f38354j.g());
                return;
            } catch (IOException e8) {
                throw new IllegalArgumentException(e8.getMessage(), e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalArgumentException(e9.getMessage(), e9);
            }
        }
        this.f38343h = bVar.f38346b;
        byte[] bArr2 = bVar.f38348d;
        if (bArr2 == null) {
            this.f38339d = new byte[f8];
        } else {
            if (bArr2.length != f8) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f38339d = bArr2;
        }
        byte[] bArr3 = bVar.f38349e;
        if (bArr3 == null) {
            this.f38340e = new byte[f8];
        } else {
            if (bArr3.length != f8) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f38340e = bArr3;
        }
        byte[] bArr4 = bVar.f38350f;
        if (bArr4 == null) {
            this.f38341f = new byte[f8];
        } else {
            if (bArr4.length != f8) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f38341f = bArr4;
        }
        byte[] bArr5 = bVar.f38351g;
        if (bArr5 == null) {
            this.f38342g = new byte[f8];
        } else {
            if (bArr5.length != f8) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f38342g = bArr5;
        }
        t7.b bVar2 = bVar.f38352h;
        if (bVar2 == null) {
            bVar2 = (!A.l(rVar.a(), bVar.f38346b) || bArr4 == null || bArr2 == null) ? new t7.b(bVar.f38347c + 1) : new t7.b(rVar, bVar.f38346b, bArr4, bArr2);
        }
        this.f38344i = bVar2;
        if (bVar.f38347c >= 0 && bVar.f38347c != this.f38344i.b()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public r b() {
        return this.f38338c;
    }

    public byte[] c() {
        byte[] f8;
        synchronized (this) {
            try {
                int f9 = this.f38338c.f();
                int a8 = (this.f38338c.a() + 7) / 8;
                byte[] bArr = new byte[a8 + f9 + f9 + f9 + f9];
                A.e(bArr, A.q(this.f38343h, a8), 0);
                A.e(bArr, this.f38339d, a8);
                int i8 = a8 + f9;
                A.e(bArr, this.f38340e, i8);
                int i9 = i8 + f9;
                A.e(bArr, this.f38341f, i9);
                A.e(bArr, this.f38342g, i9 + f9);
                try {
                    f8 = E7.a.f(bArr, A.p(this.f38344i));
                } catch (IOException e8) {
                    throw new IllegalStateException("error serializing bds state: " + e8.getMessage(), e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f8;
    }

    @Override // E7.c
    public byte[] getEncoded() {
        byte[] c8;
        synchronized (this) {
            c8 = c();
        }
        return c8;
    }
}
