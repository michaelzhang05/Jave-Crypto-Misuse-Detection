package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: RopeByteString.java */
/* loaded from: classes2.dex */
public class s extends kotlin.reflect.jvm.internal.impl.protobuf.d {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f21948g;

    /* renamed from: h, reason: collision with root package name */
    private final int f21949h;

    /* renamed from: i, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f21950i;

    /* renamed from: j, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f21951j;

    /* renamed from: k, reason: collision with root package name */
    private final int f21952k;
    private final int l;
    private int m;

    /* compiled from: RopeByteString.java */
    /* loaded from: classes2.dex */
    private static class b {
        private final Stack<kotlin.reflect.jvm.internal.impl.protobuf.d> a;

        private b() {
            this.a = new Stack<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public kotlin.reflect.jvm.internal.impl.protobuf.d b(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
            c(dVar);
            c(dVar2);
            kotlin.reflect.jvm.internal.impl.protobuf.d pop = this.a.pop();
            while (!this.a.isEmpty()) {
                pop = new s(this.a.pop(), pop);
            }
            return pop;
        }

        private void c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            if (dVar.K()) {
                e(dVar);
                return;
            }
            if (dVar instanceof s) {
                s sVar = (s) dVar;
                c(sVar.f21950i);
                c(sVar.f21951j);
            } else {
                String valueOf = String.valueOf(dVar.getClass());
                StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        private int d(int i2) {
            int binarySearch = Arrays.binarySearch(s.f21948g, i2);
            return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
        }

        private void e(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            int d2 = d(dVar.size());
            int i2 = s.f21948g[d2 + 1];
            if (!this.a.isEmpty() && this.a.peek().size() < i2) {
                int i3 = s.f21948g[d2];
                kotlin.reflect.jvm.internal.impl.protobuf.d pop = this.a.pop();
                while (true) {
                    if (this.a.isEmpty() || this.a.peek().size() >= i3) {
                        break;
                    } else {
                        pop = new s(this.a.pop(), pop);
                    }
                }
                s sVar = new s(pop, dVar);
                while (!this.a.isEmpty()) {
                    if (this.a.peek().size() >= s.f21948g[d(sVar.size()) + 1]) {
                        break;
                    } else {
                        sVar = new s(this.a.pop(), sVar);
                    }
                }
                this.a.push(sVar);
                return;
            }
            this.a.push(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RopeByteString.java */
    /* loaded from: classes2.dex */
    public static class c implements Iterator<n> {

        /* renamed from: f, reason: collision with root package name */
        private final Stack<s> f21953f;

        /* renamed from: g, reason: collision with root package name */
        private n f21954g;

        private n a(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            while (dVar instanceof s) {
                s sVar = (s) dVar;
                this.f21953f.push(sVar);
                dVar = sVar.f21950i;
            }
            return (n) dVar;
        }

        private n c() {
            while (!this.f21953f.isEmpty()) {
                n a = a(this.f21953f.pop().f21951j);
                if (!a.isEmpty()) {
                    return a;
                }
            }
            return null;
        }

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public n next() {
            n nVar = this.f21954g;
            if (nVar != null) {
                this.f21954g = c();
                return nVar;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21954g != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private c(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f21953f = new Stack<>();
            this.f21954g = a(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: RopeByteString.java */
    /* loaded from: classes2.dex */
    public class d implements d.a {

        /* renamed from: f, reason: collision with root package name */
        private final c f21955f;

        /* renamed from: g, reason: collision with root package name */
        private d.a f21956g;

        /* renamed from: h, reason: collision with root package name */
        int f21957h;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte b() {
            if (!this.f21956g.hasNext()) {
                this.f21956g = this.f21955f.next().iterator();
            }
            this.f21957h--;
            return this.f21956g.b();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21957h > 0;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private d() {
            c cVar = new c(s.this);
            this.f21955f = cVar;
            this.f21956g = cVar.next().iterator();
            this.f21957h = s.this.size();
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        int i3 = 1;
        while (i2 > 0) {
            arrayList.add(Integer.valueOf(i2));
            int i4 = i3 + i2;
            i3 = i2;
            i2 = i4;
        }
        arrayList.add(Integer.MAX_VALUE);
        f21948g = new int[arrayList.size()];
        int i5 = 0;
        while (true) {
            int[] iArr = f21948g;
            if (i5 >= iArr.length) {
                return;
            }
            iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
            i5++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static kotlin.reflect.jvm.internal.impl.protobuf.d a0(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        s sVar = dVar instanceof s ? (s) dVar : null;
        if (dVar2.size() == 0) {
            return dVar;
        }
        if (dVar.size() != 0) {
            int size = dVar.size() + dVar2.size();
            if (size < 128) {
                return b0(dVar, dVar2);
            }
            if (sVar != null && sVar.f21951j.size() + dVar2.size() < 128) {
                dVar2 = new s(sVar.f21950i, b0(sVar.f21951j, dVar2));
            } else if (sVar != null && sVar.f21950i.J() > sVar.f21951j.J() && sVar.J() > dVar2.J()) {
                dVar2 = new s(sVar.f21950i, new s(sVar.f21951j, dVar2));
            } else {
                if (size < f21948g[Math.max(dVar.J(), dVar2.J()) + 1]) {
                    return new b().b(dVar, dVar2);
                }
                return new s(dVar, dVar2);
            }
        }
        return dVar2;
    }

    private static n b0(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        int size = dVar.size();
        int size2 = dVar2.size();
        byte[] bArr = new byte[size + size2];
        dVar.z(bArr, 0, 0, size);
        dVar2.z(bArr, 0, size, size2);
        return new n(bArr);
    }

    private boolean c0(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
        c cVar = new c(this);
        n next = cVar.next();
        c cVar2 = new c(dVar);
        n next2 = cVar2.next();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int size = next.size() - i2;
            int size2 = next2.size() - i3;
            int min = Math.min(size, size2);
            if (!(i2 == 0 ? next.Y(next2, i3, min) : next2.Y(next, i2, min))) {
                return false;
            }
            i4 += min;
            int i5 = this.f21949h;
            if (i4 >= i5) {
                if (i4 == i5) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                next = cVar.next();
                i2 = 0;
            } else {
                i2 += min;
            }
            if (min == size2) {
                next2 = cVar2.next();
                i3 = 0;
            } else {
                i3 += min;
            }
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected void D(byte[] bArr, int i2, int i3, int i4) {
        int i5 = i2 + i4;
        int i6 = this.f21952k;
        if (i5 <= i6) {
            this.f21950i.D(bArr, i2, i3, i4);
        } else {
            if (i2 >= i6) {
                this.f21951j.D(bArr, i2 - i6, i3, i4);
                return;
            }
            int i7 = i6 - i2;
            this.f21950i.D(bArr, i2, i3, i7);
            this.f21951j.D(bArr, 0, i3 + i7, i4 - i7);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int J() {
        return this.l;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected boolean K() {
        return this.f21949h >= f21948g[this.l];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public boolean L() {
        int Q = this.f21950i.Q(0, 0, this.f21952k);
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = this.f21951j;
        return dVar.Q(Q, 0, dVar.size()) == 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: M */
    public d.a iterator() {
        return new d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public kotlin.reflect.jvm.internal.impl.protobuf.e N() {
        return kotlin.reflect.jvm.internal.impl.protobuf.e.g(new e());
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int P(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f21952k;
        if (i5 <= i6) {
            return this.f21950i.P(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f21951j.P(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f21951j.P(this.f21950i.P(i2, i3, i7), 0, i4 - i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int Q(int i2, int i3, int i4) {
        int i5 = i3 + i4;
        int i6 = this.f21952k;
        if (i5 <= i6) {
            return this.f21950i.Q(i2, i3, i4);
        }
        if (i3 >= i6) {
            return this.f21951j.Q(i2, i3 - i6, i4);
        }
        int i7 = i6 - i3;
        return this.f21951j.Q(this.f21950i.Q(i2, i3, i7), 0, i4 - i7);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    protected int R() {
        return this.m;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public String T(String str) throws UnsupportedEncodingException {
        return new String(S(), str);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    void W(OutputStream outputStream, int i2, int i3) throws IOException {
        int i4 = i2 + i3;
        int i5 = this.f21952k;
        if (i4 <= i5) {
            this.f21950i.W(outputStream, i2, i3);
        } else {
            if (i2 >= i5) {
                this.f21951j.W(outputStream, i2 - i5, i3);
                return;
            }
            int i6 = i5 - i2;
            this.f21950i.W(outputStream, i2, i6);
            this.f21951j.W(outputStream, 0, i3 - i6);
        }
    }

    public boolean equals(Object obj) {
        int R;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.protobuf.d)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.protobuf.d dVar = (kotlin.reflect.jvm.internal.impl.protobuf.d) obj;
        if (this.f21949h != dVar.size()) {
            return false;
        }
        if (this.f21949h == 0) {
            return true;
        }
        if (this.m == 0 || (R = dVar.R()) == 0 || this.m == R) {
            return c0(dVar);
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.m;
        if (i2 == 0) {
            int i3 = this.f21949h;
            i2 = P(i3, 0, i3);
            if (i2 == 0) {
                i2 = 1;
            }
            this.m = i2;
        }
        return i2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f21949h;
    }

    private s(kotlin.reflect.jvm.internal.impl.protobuf.d dVar, kotlin.reflect.jvm.internal.impl.protobuf.d dVar2) {
        this.m = 0;
        this.f21950i = dVar;
        this.f21951j = dVar2;
        int size = dVar.size();
        this.f21952k = size;
        this.f21949h = size + dVar2.size();
        this.l = Math.max(dVar.J(), dVar2.J()) + 1;
    }

    /* compiled from: RopeByteString.java */
    /* loaded from: classes2.dex */
    private class e extends InputStream {

        /* renamed from: f, reason: collision with root package name */
        private c f21959f;

        /* renamed from: g, reason: collision with root package name */
        private n f21960g;

        /* renamed from: h, reason: collision with root package name */
        private int f21961h;

        /* renamed from: i, reason: collision with root package name */
        private int f21962i;

        /* renamed from: j, reason: collision with root package name */
        private int f21963j;

        /* renamed from: k, reason: collision with root package name */
        private int f21964k;

        public e() {
            b();
        }

        private void a() {
            if (this.f21960g != null) {
                int i2 = this.f21962i;
                int i3 = this.f21961h;
                if (i2 == i3) {
                    this.f21963j += i3;
                    this.f21962i = 0;
                    if (this.f21959f.hasNext()) {
                        n next = this.f21959f.next();
                        this.f21960g = next;
                        this.f21961h = next.size();
                    } else {
                        this.f21960g = null;
                        this.f21961h = 0;
                    }
                }
            }
        }

        private void b() {
            c cVar = new c(s.this);
            this.f21959f = cVar;
            n next = cVar.next();
            this.f21960g = next;
            this.f21961h = next.size();
            this.f21962i = 0;
            this.f21963j = 0;
        }

        private int f(byte[] bArr, int i2, int i3) {
            int i4 = i3;
            while (true) {
                if (i4 <= 0) {
                    break;
                }
                a();
                if (this.f21960g != null) {
                    int min = Math.min(this.f21961h - this.f21962i, i4);
                    if (bArr != null) {
                        this.f21960g.z(bArr, this.f21962i, i2, min);
                        i2 += min;
                    }
                    this.f21962i += min;
                    i4 -= min;
                } else if (i4 == i3) {
                    return -1;
                }
            }
            return i3 - i4;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return s.this.size() - (this.f21963j + this.f21962i);
        }

        @Override // java.io.InputStream
        public void mark(int i2) {
            this.f21964k = this.f21963j + this.f21962i;
        }

        @Override // java.io.InputStream
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i2, int i3) {
            bArr.getClass();
            if (i2 >= 0 && i3 >= 0 && i3 <= bArr.length - i2) {
                return f(bArr, i2, i3);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public synchronized void reset() {
            b();
            f(null, 0, this.f21964k);
        }

        @Override // java.io.InputStream
        public long skip(long j2) {
            if (j2 >= 0) {
                if (j2 > 2147483647L) {
                    j2 = 2147483647L;
                }
                return f(null, 0, (int) j2);
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            a();
            n nVar = this.f21960g;
            if (nVar == null) {
                return -1;
            }
            int i2 = this.f21962i;
            this.f21962i = i2 + 1;
            return nVar.X(i2) & 255;
        }
    }
}
