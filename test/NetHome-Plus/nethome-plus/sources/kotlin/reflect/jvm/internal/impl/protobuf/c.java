package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.NoSuchElementException;
import kotlin.reflect.jvm.internal.impl.protobuf.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: BoundedByteString.java */
/* loaded from: classes2.dex */
public class c extends n {

    /* renamed from: i, reason: collision with root package name */
    private final int f21889i;

    /* renamed from: j, reason: collision with root package name */
    private final int f21890j;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BoundedByteString.java */
    /* loaded from: classes2.dex */
    public class b implements d.a {

        /* renamed from: f, reason: collision with root package name */
        private int f21891f;

        /* renamed from: g, reason: collision with root package name */
        private final int f21892g;

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Byte next() {
            return Byte.valueOf(b());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.d.a
        public byte b() {
            int i2 = this.f21891f;
            if (i2 < this.f21892g) {
                byte[] bArr = c.this.f21943g;
                this.f21891f = i2 + 1;
                return bArr[i2];
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21891f < this.f21892g;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b() {
            int Z = c.this.Z();
            this.f21891f = Z;
            this.f21892g = Z + c.this.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(byte[] bArr, int i2, int i3) {
        super(bArr);
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(29);
            sb.append("Offset too small: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("Length too small: ");
            sb2.append(i2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i2 + i3 <= bArr.length) {
            this.f21889i = i2;
            this.f21890j = i3;
            return;
        }
        StringBuilder sb3 = new StringBuilder(48);
        sb3.append("Offset+Length too large: ");
        sb3.append(i2);
        sb3.append("+");
        sb3.append(i3);
        throw new IllegalArgumentException(sb3.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    public void D(byte[] bArr, int i2, int i3, int i4) {
        System.arraycopy(this.f21943g, Z() + i2, bArr, i3, i4);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d, java.lang.Iterable
    /* renamed from: M */
    public d.a iterator() {
        return new b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public byte X(int i2) {
        if (i2 >= 0) {
            if (i2 < size()) {
                return this.f21943g[this.f21889i + i2];
            }
            int size = size();
            StringBuilder sb = new StringBuilder(41);
            sb.append("Index too large: ");
            sb.append(i2);
            sb.append(", ");
            sb.append(size);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(28);
        sb2.append("Index too small: ");
        sb2.append(i2);
        throw new ArrayIndexOutOfBoundsException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n
    public int Z() {
        return this.f21889i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.n, kotlin.reflect.jvm.internal.impl.protobuf.d
    public int size() {
        return this.f21890j;
    }
}
