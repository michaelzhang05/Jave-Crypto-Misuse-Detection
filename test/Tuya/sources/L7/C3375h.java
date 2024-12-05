package l7;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: l7.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C3375h extends AbstractC3374g {

    /* renamed from: l, reason: collision with root package name */
    private static a f34830l;

    /* renamed from: m, reason: collision with root package name */
    private static a[] f34831m;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f34832b;

    /* renamed from: c, reason: collision with root package name */
    private final C3378k f34833c;

    /* renamed from: d, reason: collision with root package name */
    private final C3372e f34834d;

    /* renamed from: e, reason: collision with root package name */
    private final int f34835e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f34836f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f34837g;

    /* renamed from: h, reason: collision with root package name */
    private final int f34838h;

    /* renamed from: i, reason: collision with root package name */
    private final Y6.e f34839i;

    /* renamed from: j, reason: collision with root package name */
    private int f34840j;

    /* renamed from: k, reason: collision with root package name */
    private C3376i f34841k;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l7.h$a */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f34842a;

        a(int i8) {
            this.f34842a = i8;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a) || ((a) obj).f34842a != this.f34842a) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f34842a;
        }
    }

    static {
        a aVar = new a(1);
        f34830l = aVar;
        a[] aVarArr = new a[TsExtractor.TS_STREAM_TYPE_AC3];
        f34831m = aVarArr;
        aVarArr[1] = aVar;
        int i8 = 2;
        while (true) {
            a[] aVarArr2 = f34831m;
            if (i8 < aVarArr2.length) {
                aVarArr2[i8] = new a(i8);
                i8++;
            } else {
                return;
            }
        }
    }

    public C3375h(C3378k c3378k, C3372e c3372e, int i8, byte[] bArr, int i9, byte[] bArr2) {
        super(true);
        this.f34833c = c3378k;
        this.f34834d = c3372e;
        this.f34840j = i8;
        this.f34832b = E7.a.d(bArr);
        this.f34835e = i9;
        this.f34836f = E7.a.d(bArr2);
        this.f34838h = 1 << (c3378k.c() + 1);
        this.f34837g = new WeakHashMap();
        this.f34839i = AbstractC3369b.a(c3378k.b());
    }

    private byte[] a(int i8) {
        int c8 = 1 << j().c();
        if (i8 >= c8) {
            AbstractC3380m.a(d(), this.f34839i);
            AbstractC3380m.c(i8, this.f34839i);
            AbstractC3380m.b((short) -32126, this.f34839i);
            AbstractC3380m.a(AbstractC3379l.a(h(), d(), i8 - c8, g()), this.f34839i);
            byte[] bArr = new byte[this.f34839i.f()];
            this.f34839i.a(bArr, 0);
            return bArr;
        }
        int i9 = i8 * 2;
        byte[] b8 = b(i9);
        byte[] b9 = b(i9 + 1);
        AbstractC3380m.a(d(), this.f34839i);
        AbstractC3380m.c(i8, this.f34839i);
        AbstractC3380m.b((short) -31869, this.f34839i);
        AbstractC3380m.a(b8, this.f34839i);
        AbstractC3380m.a(b9, this.f34839i);
        byte[] bArr2 = new byte[this.f34839i.f()];
        this.f34839i.a(bArr2, 0);
        return bArr2;
    }

    private byte[] c(a aVar) {
        synchronized (this.f34837g) {
            try {
                byte[] bArr = (byte[]) this.f34837g.get(aVar);
                if (bArr != null) {
                    return bArr;
                }
                byte[] a8 = a(aVar.f34842a);
                this.f34837g.put(aVar, a8);
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static C3375h e(Object obj) {
        DataInputStream dataInputStream;
        if (obj instanceof C3375h) {
            return (C3375h) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream2 = (DataInputStream) obj;
            if (dataInputStream2.readInt() == 0) {
                C3378k e8 = C3378k.e(dataInputStream2.readInt());
                C3372e e9 = C3372e.e(dataInputStream2.readInt());
                byte[] bArr = new byte[16];
                dataInputStream2.readFully(bArr);
                int readInt = dataInputStream2.readInt();
                int readInt2 = dataInputStream2.readInt();
                int readInt3 = dataInputStream2.readInt();
                if (readInt3 >= 0) {
                    if (readInt3 <= dataInputStream2.available()) {
                        byte[] bArr2 = new byte[readInt3];
                        dataInputStream2.readFully(bArr2);
                        return new C3375h(e8, e9, readInt, bArr, readInt2, bArr2);
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
                C3375h e10 = e(dataInputStream);
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
            return e(G7.a.b((InputStream) obj));
        }
        throw new IllegalArgumentException("cannot parse " + obj);
    }

    public static C3375h f(byte[] bArr, byte[] bArr2) {
        C3375h e8 = e(bArr);
        e8.f34841k = C3376i.a(bArr2);
        return e8;
    }

    byte[] b(int i8) {
        a aVar;
        if (i8 < this.f34838h) {
            a[] aVarArr = f34831m;
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
        return E7.a.d(this.f34832b);
    }

    public boolean equals(Object obj) {
        C3376i c3376i;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C3375h c3375h = (C3375h) obj;
        if (this.f34840j != c3375h.f34840j || this.f34835e != c3375h.f34835e || !E7.a.a(this.f34832b, c3375h.f34832b)) {
            return false;
        }
        C3378k c3378k = this.f34833c;
        if (c3378k == null ? c3375h.f34833c != null : !c3378k.equals(c3375h.f34833c)) {
            return false;
        }
        C3372e c3372e = this.f34834d;
        if (c3372e == null ? c3375h.f34834d != null : !c3372e.equals(c3375h.f34834d)) {
            return false;
        }
        if (!E7.a.a(this.f34836f, c3375h.f34836f)) {
            return false;
        }
        C3376i c3376i2 = this.f34841k;
        if (c3376i2 == null || (c3376i = c3375h.f34841k) == null) {
            return true;
        }
        return c3376i2.equals(c3376i);
    }

    public byte[] g() {
        return E7.a.d(this.f34836f);
    }

    @Override // l7.AbstractC3374g, E7.c
    public byte[] getEncoded() {
        return C3368a.f().i(0).i(this.f34833c.f()).i(this.f34834d.f()).d(this.f34832b).i(this.f34840j).i(this.f34835e).i(this.f34836f.length).d(this.f34836f).b();
    }

    public C3372e h() {
        return this.f34834d;
    }

    public int hashCode() {
        int i8;
        int i9;
        int k8 = ((this.f34840j * 31) + E7.a.k(this.f34832b)) * 31;
        C3378k c3378k = this.f34833c;
        int i10 = 0;
        if (c3378k != null) {
            i8 = c3378k.hashCode();
        } else {
            i8 = 0;
        }
        int i11 = (k8 + i8) * 31;
        C3372e c3372e = this.f34834d;
        if (c3372e != null) {
            i9 = c3372e.hashCode();
        } else {
            i9 = 0;
        }
        int k9 = (((((i11 + i9) * 31) + this.f34835e) * 31) + E7.a.k(this.f34836f)) * 31;
        C3376i c3376i = this.f34841k;
        if (c3376i != null) {
            i10 = c3376i.hashCode();
        }
        return k9 + i10;
    }

    public C3376i i() {
        C3376i c3376i;
        synchronized (this) {
            try {
                if (this.f34841k == null) {
                    this.f34841k = new C3376i(this.f34833c, this.f34834d, c(f34830l), this.f34832b);
                }
                c3376i = this.f34841k;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3376i;
    }

    public C3378k j() {
        return this.f34833c;
    }
}
