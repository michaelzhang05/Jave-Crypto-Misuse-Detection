package o7;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: o7.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3724h extends AbstractC3723g {

    /* renamed from: l, reason: collision with root package name */
    private static a f36847l;

    /* renamed from: m, reason: collision with root package name */
    private static a[] f36848m;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f36849b;

    /* renamed from: c, reason: collision with root package name */
    private final C3727k f36850c;

    /* renamed from: d, reason: collision with root package name */
    private final C3721e f36851d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36852e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f36853f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f36854g;

    /* renamed from: h, reason: collision with root package name */
    private final int f36855h;

    /* renamed from: i, reason: collision with root package name */
    private final b7.e f36856i;

    /* renamed from: j, reason: collision with root package name */
    private int f36857j;

    /* renamed from: k, reason: collision with root package name */
    private C3725i f36858k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o7.h$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f36859a;

        a(int i8) {
            this.f36859a = i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || ((a) obj).f36859a != this.f36859a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f36859a;
        }
    }

    static {
        a aVar = new a(1);
        f36847l = aVar;
        a[] aVarArr = new a[TsExtractor.TS_STREAM_TYPE_AC3];
        f36848m = aVarArr;
        aVarArr[1] = aVar;
        int i8 = 2;
        while (true) {
            a[] aVarArr2 = f36848m;
            if (i8 < aVarArr2.length) {
                aVarArr2[i8] = new a(i8);
                i8++;
            } else {
                return;
            }
        }
    }

    public C3724h(C3727k c3727k, C3721e c3721e, int i8, byte[] bArr, int i9, byte[] bArr2) {
        super(true);
        this.f36850c = c3727k;
        this.f36851d = c3721e;
        this.f36857j = i8;
        this.f36849b = H7.a.d(bArr);
        this.f36852e = i9;
        this.f36853f = H7.a.d(bArr2);
        this.f36855h = 1 << (c3727k.c() + 1);
        this.f36854g = new WeakHashMap();
        this.f36856i = AbstractC3718b.a(c3727k.b());
    }

    private byte[] a(int i8) {
        int c8 = 1 << j().c();
        if (i8 >= c8) {
            AbstractC3729m.a(d(), this.f36856i);
            AbstractC3729m.c(i8, this.f36856i);
            AbstractC3729m.b((short) -32126, this.f36856i);
            AbstractC3729m.a(AbstractC3728l.a(h(), d(), i8 - c8, g()), this.f36856i);
            byte[] bArr = new byte[this.f36856i.f()];
            this.f36856i.a(bArr, 0);
            return bArr;
        }
        int i9 = i8 * 2;
        byte[] b8 = b(i9);
        byte[] b9 = b(i9 + 1);
        AbstractC3729m.a(d(), this.f36856i);
        AbstractC3729m.c(i8, this.f36856i);
        AbstractC3729m.b((short) -31869, this.f36856i);
        AbstractC3729m.a(b8, this.f36856i);
        AbstractC3729m.a(b9, this.f36856i);
        byte[] bArr2 = new byte[this.f36856i.f()];
        this.f36856i.a(bArr2, 0);
        return bArr2;
    }

    private byte[] c(a aVar) {
        synchronized (this.f36854g) {
            try {
                byte[] bArr = (byte[]) this.f36854g.get(aVar);
                if (bArr != null) {
                    return bArr;
                }
                byte[] a8 = a(aVar.f36859a);
                this.f36854g.put(aVar, a8);
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3724h e(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3724h) {
            return (C3724h) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() == 0) {
                C3727k e8 = C3727k.e(dataInputStream2.readInt());
                C3721e e9 = C3721e.e(dataInputStream2.readInt());
                byte[] bArr = new byte[16];
                dataInputStream2.readFully(bArr);
                int readInt = dataInputStream2.readInt();
                int readInt2 = dataInputStream2.readInt();
                int readInt3 = dataInputStream2.readInt();
                if (readInt3 >= 0) {
                    if (readInt3 <= dataInputStream2.available()) {
                        byte[] bArr2 = new byte[readInt3];
                        dataInputStream2.readFully(bArr2);
                        return new C3724h(e8, e9, readInt, bArr, readInt2, bArr2);
                    }
                    throw new IOException("secret length exceeded " + dataInputStream2.available());
                }
                throw new IllegalStateException("secret length less than zero");
            }
            throw new IllegalStateException("expected version 0 lms private key");
        }
        if (obj instanceof byte[]) {
            DataInputStream dataInputStream3 = null;
            try {
                dataInputStream = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            } catch (Throwable th) {
                th = th;
            }
            try {
                C3724h e10 = e(dataInputStream);
                dataInputStream.close();
                return e10;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream3 = dataInputStream;
                if (dataInputStream3 != null) {
                    dataInputStream3.close();
                }
                throw th;
            }
        }
        if (obj instanceof InputStream) {
            return e(J7.a.b((InputStream) obj));
        }
        throw new IllegalArgumentException("cannot parse " + obj);
    }

    public static C3724h f(byte[] bArr, byte[] bArr2) {
        C3724h e8 = e(bArr);
        e8.f36858k = C3725i.a(bArr2);
        return e8;
    }

    byte[] b(int i8) {
        a aVar;
        if (i8 < this.f36855h) {
            a[] aVarArr = f36848m;
            if (i8 < aVarArr.length) {
                aVar = aVarArr[i8];
            } else {
                aVar = new a(i8);
            }
            return c(aVar);
        }
        return a(i8);
    }

    public byte[] d() {
        return H7.a.d(this.f36849b);
    }

    public boolean equals(Object obj) {
        C3725i c3725i;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3724h c3724h = (C3724h) obj;
        if (this.f36857j != c3724h.f36857j || this.f36852e != c3724h.f36852e || !H7.a.a(this.f36849b, c3724h.f36849b)) {
            return false;
        }
        C3727k c3727k = this.f36850c;
        if (c3727k == null ? c3724h.f36850c != null : !c3727k.equals(c3724h.f36850c)) {
            return false;
        }
        C3721e c3721e = this.f36851d;
        if (c3721e == null ? c3724h.f36851d != null : !c3721e.equals(c3724h.f36851d)) {
            return false;
        }
        if (!H7.a.a(this.f36853f, c3724h.f36853f)) {
            return false;
        }
        C3725i c3725i2 = this.f36858k;
        if (c3725i2 == null || (c3725i = c3724h.f36858k) == null) {
            return true;
        }
        return c3725i2.equals(c3725i);
    }

    public byte[] g() {
        return H7.a.d(this.f36853f);
    }

    @Override // o7.AbstractC3723g, H7.c
    public byte[] getEncoded() {
        return C3717a.f().i(0).i(this.f36850c.f()).i(this.f36851d.f()).d(this.f36849b).i(this.f36857j).i(this.f36852e).i(this.f36853f.length).d(this.f36853f).b();
    }

    public C3721e h() {
        return this.f36851d;
    }

    public int hashCode() {
        int i8;
        int i9;
        int k8 = ((this.f36857j * 31) + H7.a.k(this.f36849b)) * 31;
        C3727k c3727k = this.f36850c;
        int i10 = 0;
        if (c3727k != null) {
            i8 = c3727k.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (k8 + i8) * 31;
        C3721e c3721e = this.f36851d;
        if (c3721e != null) {
            i9 = c3721e.hashCode();
        } else {
            i9 = 0;
        }
        int k9 = (((((i11 + i9) * 31) + this.f36852e) * 31) + H7.a.k(this.f36853f)) * 31;
        C3725i c3725i = this.f36858k;
        if (c3725i != null) {
            i10 = c3725i.hashCode();
        }
        return k9 + i10;
    }

    public C3725i i() {
        C3725i c3725i;
        synchronized (this) {
            try {
                if (this.f36858k == null) {
                    this.f36858k = new C3725i(this.f36850c, this.f36851d, c(f36847l), this.f36849b);
                }
                c3725i = this.f36858k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3725i;
    }

    public C3727k j() {
        return this.f36850c;
    }
}
