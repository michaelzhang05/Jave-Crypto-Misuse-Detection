package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiteralByteString.java */
/* loaded from: classes2.dex */
public class n extends d {

    /* renamed from: g, reason: collision with root package name */
    protected final byte[] f21943g;

    /* renamed from: h, reason: collision with root package name */
    private int f21944h = 0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LiteralByteString.java */
    /* loaded from: classes2.dex */
    public class b implements d.a {

        /* renamed from: f, reason: collision with root package name */
        private int f21945f;

        /* renamed from: g, reason: collision with root package name */
        private final int f21946g;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte b() {
            try {
                byte[] bArr = n.this.f21943g;
                int i2 = this.f21945f;
                this.f21945f = i2 + 1;
                return bArr[i2];
            } catch (ArrayIndexOutOfBoundsException e2) {
                throw new NoSuchElementException(e2.getMessage());
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21945f < this.f21946g;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            this.f21945f = 0;
            this.f21946g = n.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(byte[] bArr) {
        this.f21943g = bArr;
    }

    static int a0(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void D(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f21943g, i2, bArr, i3, i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int J() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean K() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean L() {
        int Z = Z();
        return v.f(this.f21943g, Z, size() + Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public e N() {
        return e.h(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int P(int i2, int i3, int i4) {
        return a0(i2, this.f21943g, Z() + i3, i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int Q(int i2, int i3, int i4) {
        int Z = Z() + i3;
        return v.g(i2, this.f21943g, Z, i4 + Z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int R() {
        return this.f21944h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String T(String str) throws UnsupportedEncodingException {
        return new String(this.f21943g, Z(), size(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void W(OutputStream outputStream, int i2, int i3) throws IOException {
        outputStream.write(this.f21943g, Z() + i2, i3);
    }

    public byte X(int i2) {
        return this.f21943g[i2];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean Y(n nVar, int i2, int i3) {
        if (i3 <= nVar.size()) {
            if (i2 + i3 <= nVar.size()) {
                byte[] bArr = this.f21943g;
                byte[] bArr2 = nVar.f21943g;
                int Z = Z() + i3;
                int Z2 = Z();
                int Z3 = nVar.Z() + i2;
                while (Z2 < Z) {
                    if (bArr[Z2] != bArr2[Z3]) {
                        return false;
                    }
                    Z2++;
                    Z3++;
                }
                return true;
            }
            int size = nVar.size();
            StringBuilder sb = new StringBuilder(59);
            sb.append("Ran off end of other: ");
            sb.append(i2);
            sb.append(", ");
            sb.append(i3);
            sb.append(", ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int size2 = size();
        StringBuilder sb2 = new StringBuilder(40);
        sb2.append("Length too large: ");
        sb2.append(i3);
        sb2.append(size2);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public int Z() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d) || size() != ((d) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof n) {
            return Y((n) obj, 0, size());
        }
        if (obj instanceof s) {
            return obj.equals(this);
        }
        String valueOf = String.valueOf(obj.getClass());
        StringBuilder sb = new StringBuilder(valueOf.length() + 49);
        sb.append("Has a new type of ByteString been created? Found ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public int hashCode() {
        int i2 = this.f21944h;
        if (i2 == 0) {
            int size = size();
            i2 = P(size, 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.f21944h = i2;
        }
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f21943g.length;
    }
}
