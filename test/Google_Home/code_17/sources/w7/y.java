package w7;

import java.io.IOException;
import w7.j;

/* loaded from: classes5.dex */
public final class y extends p implements H7.c {

    /* renamed from: c, reason: collision with root package name */
    private final x f40501c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f40502d;

    /* renamed from: e, reason: collision with root package name */
    private final byte[] f40503e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f40504f;

    /* renamed from: g, reason: collision with root package name */
    private final byte[] f40505g;

    /* renamed from: h, reason: collision with root package name */
    private volatile C4151a f40506h;

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final x f40507a;

        /* renamed from: b, reason: collision with root package name */
        private int f40508b = 0;

        /* renamed from: c, reason: collision with root package name */
        private int f40509c = -1;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f40510d = null;

        /* renamed from: e, reason: collision with root package name */
        private byte[] f40511e = null;

        /* renamed from: f, reason: collision with root package name */
        private byte[] f40512f = null;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f40513g = null;

        /* renamed from: h, reason: collision with root package name */
        private C4151a f40514h = null;

        /* renamed from: i, reason: collision with root package name */
        private byte[] f40515i = null;

        public b(x xVar) {
            this.f40507a = xVar;
        }

        public y j() {
            return new y(this);
        }

        public b k(C4151a c4151a) {
            this.f40514h = c4151a;
            return this;
        }

        public b l(int i8) {
            this.f40508b = i8;
            return this;
        }

        public b m(int i8) {
            this.f40509c = i8;
            return this;
        }

        public b n(byte[] bArr) {
            this.f40512f = A.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.f40513g = A.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f40511e = A.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f40510d = A.c(bArr);
            return this;
        }
    }

    private y(b bVar) {
        super(true, bVar.f40507a.f());
        x xVar = bVar.f40507a;
        this.f40501c = xVar;
        if (xVar == null) {
            throw new NullPointerException("params == null");
        }
        int h8 = xVar.h();
        byte[] bArr = bVar.f40515i;
        if (bArr != null) {
            int b8 = xVar.b();
            int a8 = H7.f.a(bArr, 0);
            if (!A.l(b8, a8)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f40502d = A.g(bArr, 4, h8);
            int i8 = 4 + h8;
            this.f40503e = A.g(bArr, i8, h8);
            int i9 = i8 + h8;
            this.f40504f = A.g(bArr, i9, h8);
            int i10 = i9 + h8;
            this.f40505g = A.g(bArr, i10, h8);
            int i11 = i10 + h8;
            try {
                C4151a c4151a = (C4151a) A.f(A.g(bArr, i11, bArr.length - i11), C4151a.class);
                if (c4151a.b() != a8) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.f40506h = c4151a.h(bVar.f40507a.g());
                return;
            } catch (IOException e8) {
                throw new IllegalArgumentException(e8.getMessage(), e8);
            } catch (ClassNotFoundException e9) {
                throw new IllegalArgumentException(e9.getMessage(), e9);
            }
        }
        byte[] bArr2 = bVar.f40510d;
        if (bArr2 == null) {
            this.f40502d = new byte[h8];
        } else {
            if (bArr2.length != h8) {
                throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
            }
            this.f40502d = bArr2;
        }
        byte[] bArr3 = bVar.f40511e;
        if (bArr3 == null) {
            this.f40503e = new byte[h8];
        } else {
            if (bArr3.length != h8) {
                throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
            }
            this.f40503e = bArr3;
        }
        byte[] bArr4 = bVar.f40512f;
        if (bArr4 == null) {
            this.f40504f = new byte[h8];
        } else {
            if (bArr4.length != h8) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
            }
            this.f40504f = bArr4;
        }
        byte[] bArr5 = bVar.f40513g;
        if (bArr5 == null) {
            this.f40505g = new byte[h8];
        } else {
            if (bArr5.length != h8) {
                throw new IllegalArgumentException("size of root needs to be equal size of digest");
            }
            this.f40505g = bArr5;
        }
        C4151a c4151a2 = bVar.f40514h;
        this.f40506h = c4151a2 == null ? (bVar.f40508b >= (1 << xVar.b()) + (-2) || bArr4 == null || bArr2 == null) ? new C4151a(xVar, (1 << xVar.b()) - 1, bVar.f40508b) : new C4151a(xVar, bArr4, bArr2, (j) new j.b().l(), bVar.f40508b) : c4151a2;
        if (bVar.f40509c >= 0 && bVar.f40509c != this.f40506h.c()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public x b() {
        return this.f40501c;
    }

    public byte[] c() {
        byte[] f8;
        synchronized (this) {
            try {
                int h8 = this.f40501c.h();
                byte[] bArr = new byte[h8 + 4 + h8 + h8 + h8];
                H7.f.d(this.f40506h.b(), bArr, 0);
                A.e(bArr, this.f40502d, 4);
                int i8 = 4 + h8;
                A.e(bArr, this.f40503e, i8);
                int i9 = i8 + h8;
                A.e(bArr, this.f40504f, i9);
                A.e(bArr, this.f40505g, i9 + h8);
                try {
                    f8 = H7.a.f(bArr, A.p(this.f40506h));
                } catch (IOException e8) {
                    throw new RuntimeException("error serializing bds state: " + e8.getMessage());
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
