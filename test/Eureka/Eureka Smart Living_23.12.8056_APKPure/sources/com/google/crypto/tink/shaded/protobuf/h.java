package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class h implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f5485b = new j(z.f5710d);

    /* renamed from: c, reason: collision with root package name */
    private static final f f5486c;

    /* renamed from: d, reason: collision with root package name */
    private static final Comparator f5487d;

    /* renamed from: a, reason: collision with root package name */
    private int f5488a = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends c {

        /* renamed from: a, reason: collision with root package name */
        private int f5489a = 0;

        /* renamed from: b, reason: collision with root package name */
        private final int f5490b;

        a() {
            this.f5490b = h.this.size();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.g
        public byte a() {
            int i6 = this.f5489a;
            if (i6 >= this.f5490b) {
                throw new NoSuchElementException();
            }
            this.f5489a = i6 + 1;
            return h.this.p(i6);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5489a < this.f5490b;
        }
    }

    /* loaded from: classes.dex */
    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(h hVar, h hVar2) {
            g r5 = hVar.r();
            g r6 = hVar2.r();
            while (r5.hasNext() && r6.hasNext()) {
                int compareTo = Integer.valueOf(h.y(r5.a())).compareTo(Integer.valueOf(h.y(r6.a())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(hVar.size()).compareTo(Integer.valueOf(hVar2.size()));
        }
    }

    /* loaded from: classes.dex */
    static abstract class c implements g {
        c() {
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(a());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes.dex */
    private static final class d implements f {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
        public byte[] a(byte[] bArr, int i6, int i7) {
            return Arrays.copyOfRange(bArr, i6, i7 + i6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class e extends j {

        /* renamed from: f, reason: collision with root package name */
        private final int f5492f;

        /* renamed from: g, reason: collision with root package name */
        private final int f5493g;

        e(byte[] bArr, int i6, int i7) {
            super(bArr);
            h.k(i6, i6 + i7, bArr.length);
            this.f5492f = i6;
            this.f5493g = i7;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j
        protected int H() {
            return this.f5492f;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public byte i(int i6) {
            h.j(i6, size());
            return this.f5496e[this.f5492f + i6];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        protected void o(byte[] bArr, int i6, int i7, int i8) {
            System.arraycopy(this.f5496e, H() + i6, bArr, i7, i8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        byte p(int i6) {
            return this.f5496e[this.f5492f + i6];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.j, com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.f5493g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface f {
        byte[] a(byte[] bArr, int i6, int i7);
    }

    /* loaded from: classes.dex */
    public interface g extends Iterator {
        byte a();
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.h$h, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0089h {

        /* renamed from: a, reason: collision with root package name */
        private final com.google.crypto.tink.shaded.protobuf.k f5494a;

        /* renamed from: b, reason: collision with root package name */
        private final byte[] f5495b;

        private C0089h(int i6) {
            byte[] bArr = new byte[i6];
            this.f5495b = bArr;
            this.f5494a = com.google.crypto.tink.shaded.protobuf.k.U(bArr);
        }

        public h a() {
            this.f5494a.c();
            return new j(this.f5495b);
        }

        public com.google.crypto.tink.shaded.protobuf.k b() {
            return this.f5494a;
        }

        /* synthetic */ C0089h(int i6, a aVar) {
            this(i6);
        }
    }

    /* loaded from: classes.dex */
    static abstract class i extends h {
        i() {
        }

        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.r();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j extends i {

        /* renamed from: e, reason: collision with root package name */
        protected final byte[] f5496e;

        j(byte[] bArr) {
            bArr.getClass();
            this.f5496e = bArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected final String A(Charset charset) {
            return new String(this.f5496e, H(), size(), charset);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        final void F(com.google.crypto.tink.shaded.protobuf.g gVar) {
            gVar.a(this.f5496e, H(), size());
        }

        final boolean G(h hVar, int i6, int i7) {
            if (i7 > hVar.size()) {
                throw new IllegalArgumentException("Length too large: " + i7 + size());
            }
            int i8 = i6 + i7;
            if (i8 > hVar.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i6 + ", " + i7 + ", " + hVar.size());
            }
            if (!(hVar instanceof j)) {
                return hVar.w(i6, i8).equals(w(0, i7));
            }
            j jVar = (j) hVar;
            byte[] bArr = this.f5496e;
            byte[] bArr2 = jVar.f5496e;
            int H = H() + i7;
            int H2 = H();
            int H3 = jVar.H() + i6;
            while (H2 < H) {
                if (bArr[H2] != bArr2[H3]) {
                    return false;
                }
                H2++;
                H3++;
            }
            return true;
        }

        protected int H() {
            return 0;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof h) || size() != ((h) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof j)) {
                return obj.equals(this);
            }
            j jVar = (j) obj;
            int v5 = v();
            int v6 = jVar.v();
            if (v5 == 0 || v6 == 0 || v5 == v6) {
                return G(jVar, 0, size());
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public byte i(int i6) {
            return this.f5496e[i6];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected void o(byte[] bArr, int i6, int i7, int i8) {
            System.arraycopy(this.f5496e, i6, bArr, i7, i8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        byte p(int i6) {
            return this.f5496e[i6];
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final boolean q() {
            int H = H();
            return o1.n(this.f5496e, H, size() + H);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public int size() {
            return this.f5496e.length;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final com.google.crypto.tink.shaded.protobuf.i t() {
            return com.google.crypto.tink.shaded.protobuf.i.j(this.f5496e, H(), size(), true);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        protected final int u(int i6, int i7, int i8) {
            return z.h(i6, this.f5496e, H() + i7, i8);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h
        public final h w(int i6, int i7) {
            int k6 = h.k(i6, i7, size());
            return k6 == 0 ? h.f5485b : new e(this.f5496e, H() + i6, k6);
        }
    }

    /* loaded from: classes.dex */
    private static final class k implements f {
        private k() {
        }

        /* synthetic */ k(a aVar) {
            this();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h.f
        public byte[] a(byte[] bArr, int i6, int i7) {
            byte[] bArr2 = new byte[i7];
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f5486c = com.google.crypto.tink.shaded.protobuf.d.c() ? new k(aVar) : new d(aVar);
        f5487d = new b();
    }

    h() {
    }

    private String C() {
        if (size() <= 50) {
            return h1.a(this);
        }
        return h1.a(w(0, 47)) + "...";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h D(byte[] bArr) {
        return new j(bArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static h E(byte[] bArr, int i6, int i7) {
        return new e(bArr, i6, i7);
    }

    static void j(int i6, int i7) {
        if (((i7 - (i6 + 1)) | i6) < 0) {
            if (i6 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i6);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i6 + ", " + i7);
        }
    }

    static int k(int i6, int i7, int i8) {
        int i9 = i7 - i6;
        if ((i6 | i7 | i9 | (i8 - i7)) >= 0) {
            return i9;
        }
        if (i6 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i6 + " < 0");
        }
        if (i7 < i6) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i6 + ", " + i7);
        }
        throw new IndexOutOfBoundsException("End index: " + i7 + " >= " + i8);
    }

    public static h l(byte[] bArr) {
        return m(bArr, 0, bArr.length);
    }

    public static h m(byte[] bArr, int i6, int i7) {
        k(i6, i6 + i7, bArr.length);
        return new j(f5486c.a(bArr, i6, i7));
    }

    public static h n(String str) {
        return new j(str.getBytes(z.f5708b));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0089h s(int i6) {
        return new C0089h(i6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y(byte b6) {
        return b6 & 255;
    }

    protected abstract String A(Charset charset);

    public final String B() {
        return z(z.f5708b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void F(com.google.crypto.tink.shaded.protobuf.g gVar);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i6 = this.f5488a;
        if (i6 == 0) {
            int size = size();
            i6 = u(size, 0, size);
            if (i6 == 0) {
                i6 = 1;
            }
            this.f5488a = i6;
        }
        return i6;
    }

    public abstract byte i(int i6);

    protected abstract void o(byte[] bArr, int i6, int i7, int i8);

    abstract byte p(int i6);

    public abstract boolean q();

    public g r() {
        return new a();
    }

    public abstract int size();

    public abstract com.google.crypto.tink.shaded.protobuf.i t();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), C());
    }

    protected abstract int u(int i6, int i7, int i8);

    protected final int v() {
        return this.f5488a;
    }

    public abstract h w(int i6, int i7);

    public final byte[] x() {
        int size = size();
        if (size == 0) {
            return z.f5710d;
        }
        byte[] bArr = new byte[size];
        o(bArr, 0, 0, size);
        return bArr;
    }

    public final String z(Charset charset) {
        return size() == 0 ? "" : A(charset);
    }
}
