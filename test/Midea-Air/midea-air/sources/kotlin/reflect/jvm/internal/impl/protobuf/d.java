package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: ByteString.java */
/* loaded from: classes2.dex */
public abstract class d implements Iterable<Byte> {

    /* renamed from: f, reason: collision with root package name */
    public static final d f21894f = new n(new byte[0]);

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public interface a extends Iterator<Byte> {
        byte b();
    }

    public static b O() {
        return new b(128);
    }

    private static d a(Iterator<d> it, int i2) {
        if (i2 == 1) {
            return it.next();
        }
        int i3 = i2 >>> 1;
        return a(it, i3).b(a(it, i2 - i3));
    }

    public static d f(Iterable<d> iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = new ArrayList();
            Iterator<d> it = iterable.iterator();
            while (it.hasNext()) {
                collection.add(it.next());
            }
        } else {
            collection = (Collection) iterable;
        }
        if (collection.isEmpty()) {
            return f21894f;
        }
        return a(collection.iterator(), collection.size());
    }

    public static d o(byte[] bArr) {
        return w(bArr, 0, bArr.length);
    }

    public static d w(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i2, bArr2, 0, i3);
        return new n(bArr2);
    }

    public static d x(String str) {
        try {
            return new n(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void D(byte[] bArr, int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int J();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean K();

    public abstract boolean L();

    @Override // java.lang.Iterable
    /* renamed from: M */
    public abstract a iterator();

    public abstract e N();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int P(int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int Q(int i2, int i3, int i4);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract int R();

    public byte[] S() {
        int size = size();
        if (size == 0) {
            return i.a;
        }
        byte[] bArr = new byte[size];
        D(bArr, 0, 0, size);
        return bArr;
    }

    public abstract String T(String str) throws UnsupportedEncodingException;

    public String U() {
        try {
            return T("UTF-8");
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 not supported?", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V(OutputStream outputStream, int i2, int i3) throws IOException {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 >= 0) {
            int i4 = i2 + i3;
            if (i4 <= size()) {
                if (i3 > 0) {
                    W(outputStream, i2, i3);
                    return;
                }
                return;
            } else {
                StringBuilder sb2 = new StringBuilder(39);
                sb2.append("Source end offset exceeded: ");
                sb2.append(i4);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder(23);
        sb3.append("Length < 0: ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void W(OutputStream outputStream, int i2, int i3) throws IOException;

    public d b(d dVar) {
        int size = size();
        int size2 = dVar.size();
        if (size + size2 < 2147483647L) {
            return s.a0(this, dVar);
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("ByteString would be too long: ");
        sb.append(size);
        sb.append("+");
        sb.append(size2);
        throw new IllegalArgumentException(sb.toString());
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract int size();

    public String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public void z(byte[] bArr, int i2, int i3, int i4) {
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Source offset < 0: ");
            sb.append(i2);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i3 < 0) {
            StringBuilder sb2 = new StringBuilder(30);
            sb2.append("Target offset < 0: ");
            sb2.append(i3);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i4 >= 0) {
            int i5 = i2 + i4;
            if (i5 <= size()) {
                int i6 = i3 + i4;
                if (i6 <= bArr.length) {
                    if (i4 > 0) {
                        D(bArr, i2, i3, i4);
                        return;
                    }
                    return;
                } else {
                    StringBuilder sb3 = new StringBuilder(34);
                    sb3.append("Target end offset < 0: ");
                    sb3.append(i6);
                    throw new IndexOutOfBoundsException(sb3.toString());
                }
            }
            StringBuilder sb4 = new StringBuilder(34);
            sb4.append("Source end offset < 0: ");
            sb4.append(i5);
            throw new IndexOutOfBoundsException(sb4.toString());
        }
        StringBuilder sb5 = new StringBuilder(23);
        sb5.append("Length < 0: ");
        sb5.append(i4);
        throw new IndexOutOfBoundsException(sb5.toString());
    }

    /* compiled from: ByteString.java */
    /* loaded from: classes2.dex */
    public static final class b extends OutputStream {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f21895f = new byte[0];

        /* renamed from: g, reason: collision with root package name */
        private final int f21896g;

        /* renamed from: h, reason: collision with root package name */
        private final ArrayList<d> f21897h;

        /* renamed from: i, reason: collision with root package name */
        private int f21898i;

        /* renamed from: j, reason: collision with root package name */
        private byte[] f21899j;

        /* renamed from: k, reason: collision with root package name */
        private int f21900k;

        b(int i2) {
            if (i2 >= 0) {
                this.f21896g = i2;
                this.f21897h = new ArrayList<>();
                this.f21899j = new byte[i2];
                return;
            }
            throw new IllegalArgumentException("Buffer size < 0");
        }

        private byte[] a(byte[] bArr, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, 0, bArr2, 0, Math.min(bArr.length, i2));
            return bArr2;
        }

        private void b(int i2) {
            this.f21897h.add(new n(this.f21899j));
            int length = this.f21898i + this.f21899j.length;
            this.f21898i = length;
            this.f21899j = new byte[Math.max(this.f21896g, Math.max(i2, length >>> 1))];
            this.f21900k = 0;
        }

        private void f() {
            int i2 = this.f21900k;
            byte[] bArr = this.f21899j;
            if (i2 >= bArr.length) {
                this.f21897h.add(new n(this.f21899j));
                this.f21899j = f21895f;
            } else if (i2 > 0) {
                this.f21897h.add(new n(a(bArr, i2)));
            }
            this.f21898i += this.f21900k;
            this.f21900k = 0;
        }

        public synchronized int o() {
            return this.f21898i + this.f21900k;
        }

        public String toString() {
            return String.format("<ByteString.Output@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(o()));
        }

        public synchronized d w() {
            f();
            return d.f(this.f21897h);
        }

        @Override // java.io.OutputStream
        public synchronized void write(int i2) {
            if (this.f21900k == this.f21899j.length) {
                b(1);
            }
            byte[] bArr = this.f21899j;
            int i3 = this.f21900k;
            this.f21900k = i3 + 1;
            bArr[i3] = (byte) i2;
        }

        @Override // java.io.OutputStream
        public synchronized void write(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = this.f21899j;
            int length = bArr2.length;
            int i4 = this.f21900k;
            if (i3 <= length - i4) {
                System.arraycopy(bArr, i2, bArr2, i4, i3);
                this.f21900k += i3;
            } else {
                int length2 = bArr2.length - i4;
                System.arraycopy(bArr, i2, bArr2, i4, length2);
                int i5 = i3 - length2;
                b(i5);
                System.arraycopy(bArr, i2 + length2, this.f21899j, 0, i5);
                this.f21900k = i5;
            }
        }
    }
}
