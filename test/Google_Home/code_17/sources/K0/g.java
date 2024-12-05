package K0;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class g implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f5003g = Logger.getLogger(g.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f5004a;

    /* renamed from: b, reason: collision with root package name */
    int f5005b;

    /* renamed from: c, reason: collision with root package name */
    private int f5006c;

    /* renamed from: d, reason: collision with root package name */
    private b f5007d;

    /* renamed from: e, reason: collision with root package name */
    private b f5008e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f5009f = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f5010a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f5011b;

        a(StringBuilder sb) {
            this.f5011b = sb;
        }

        @Override // K0.g.d
        public void a(InputStream inputStream, int i8) {
            if (this.f5010a) {
                this.f5010a = false;
            } else {
                this.f5011b.append(", ");
            }
            this.f5011b.append(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f5013c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f5014a;

        /* renamed from: b, reason: collision with root package name */
        final int f5015b;

        b(int i8, int i9) {
            this.f5014a = i8;
            this.f5015b = i9;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f5014a + ", length = " + this.f5015b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class c extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private int f5016a;

        /* renamed from: b, reason: collision with root package name */
        private int f5017b;

        /* synthetic */ c(g gVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            g.x(bArr, "buffer");
            if ((i8 | i9) >= 0 && i9 <= bArr.length - i8) {
                int i10 = this.f5017b;
                if (i10 <= 0) {
                    return -1;
                }
                if (i9 > i10) {
                    i9 = i10;
                }
                g.this.H(this.f5016a, bArr, i8, i9);
                this.f5016a = g.this.L(this.f5016a + i9);
                this.f5017b -= i9;
                return i9;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private c(b bVar) {
            this.f5016a = g.this.L(bVar.f5014a + 4);
            this.f5017b = bVar.f5015b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f5017b == 0) {
                return -1;
            }
            g.this.f5004a.seek(this.f5016a);
            int read = g.this.f5004a.read();
            this.f5016a = g.this.L(this.f5016a + 1);
            this.f5017b--;
            return read;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(InputStream inputStream, int i8);
    }

    public g(File file) {
        if (!file.exists()) {
            u(file);
        }
        this.f5004a = y(file);
        D();
    }

    private b A(int i8) {
        if (i8 == 0) {
            return b.f5013c;
        }
        this.f5004a.seek(i8);
        return new b(i8, this.f5004a.readInt());
    }

    private void D() {
        this.f5004a.seek(0L);
        this.f5004a.readFully(this.f5009f);
        int E8 = E(this.f5009f, 0);
        this.f5005b = E8;
        if (E8 <= this.f5004a.length()) {
            this.f5006c = E(this.f5009f, 4);
            int E9 = E(this.f5009f, 8);
            int E10 = E(this.f5009f, 12);
            this.f5007d = A(E9);
            this.f5008e = A(E10);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f5005b + ", Actual length: " + this.f5004a.length());
    }

    private static int E(byte[] bArr, int i8) {
        return ((bArr[i8] & 255) << 24) + ((bArr[i8 + 1] & 255) << 16) + ((bArr[i8 + 2] & 255) << 8) + (bArr[i8 + 3] & 255);
    }

    private int F() {
        return this.f5005b - K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i8, byte[] bArr, int i9, int i10) {
        int L8 = L(i8);
        int i11 = L8 + i10;
        int i12 = this.f5005b;
        if (i11 <= i12) {
            this.f5004a.seek(L8);
            this.f5004a.readFully(bArr, i9, i10);
            return;
        }
        int i13 = i12 - L8;
        this.f5004a.seek(L8);
        this.f5004a.readFully(bArr, i9, i13);
        this.f5004a.seek(16L);
        this.f5004a.readFully(bArr, i9 + i13, i10 - i13);
    }

    private void I(int i8, byte[] bArr, int i9, int i10) {
        int L8 = L(i8);
        int i11 = L8 + i10;
        int i12 = this.f5005b;
        if (i11 <= i12) {
            this.f5004a.seek(L8);
            this.f5004a.write(bArr, i9, i10);
            return;
        }
        int i13 = i12 - L8;
        this.f5004a.seek(L8);
        this.f5004a.write(bArr, i9, i13);
        this.f5004a.seek(16L);
        this.f5004a.write(bArr, i9 + i13, i10 - i13);
    }

    private void J(int i8) {
        this.f5004a.setLength(i8);
        this.f5004a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L(int i8) {
        int i9 = this.f5005b;
        if (i8 >= i9) {
            return (i8 + 16) - i9;
        }
        return i8;
    }

    private void M(int i8, int i9, int i10, int i11) {
        O(this.f5009f, i8, i9, i10, i11);
        this.f5004a.seek(0L);
        this.f5004a.write(this.f5009f);
    }

    private static void N(byte[] bArr, int i8, int i9) {
        bArr[i8] = (byte) (i9 >> 24);
        bArr[i8 + 1] = (byte) (i9 >> 16);
        bArr[i8 + 2] = (byte) (i9 >> 8);
        bArr[i8 + 3] = (byte) i9;
    }

    private static void O(byte[] bArr, int... iArr) {
        int i8 = 0;
        for (int i9 : iArr) {
            N(bArr, i8, i9);
            i8 += 4;
        }
    }

    private void o(int i8) {
        int i9 = i8 + 4;
        int F8 = F();
        if (F8 >= i9) {
            return;
        }
        int i10 = this.f5005b;
        do {
            F8 += i10;
            i10 <<= 1;
        } while (F8 < i9);
        J(i10);
        b bVar = this.f5008e;
        int L8 = L(bVar.f5014a + 4 + bVar.f5015b);
        if (L8 < this.f5007d.f5014a) {
            FileChannel channel = this.f5004a.getChannel();
            channel.position(this.f5005b);
            long j8 = L8 - 4;
            if (channel.transferTo(16L, j8, channel) != j8) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i11 = this.f5008e.f5014a;
        int i12 = this.f5007d.f5014a;
        if (i11 < i12) {
            int i13 = (this.f5005b + i11) - 16;
            M(i10, this.f5006c, i12, i13);
            this.f5008e = new b(i13, this.f5008e.f5015b);
        } else {
            M(i10, this.f5006c, i12, i11);
        }
        this.f5005b = i10;
    }

    private static void u(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile y8 = y(file2);
        try {
            y8.setLength(4096L);
            y8.seek(0L);
            byte[] bArr = new byte[16];
            O(bArr, 4096, 0, 0, 0);
            y8.write(bArr);
            y8.close();
            if (file2.renameTo(file)) {
            } else {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            y8.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object x(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile y(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public synchronized void G() {
        try {
            if (!v()) {
                if (this.f5006c == 1) {
                    n();
                } else {
                    b bVar = this.f5007d;
                    int L8 = L(bVar.f5014a + 4 + bVar.f5015b);
                    H(L8, this.f5009f, 0, 4);
                    int E8 = E(this.f5009f, 0);
                    M(this.f5005b, this.f5006c - 1, L8, this.f5008e.f5014a);
                    this.f5006c--;
                    this.f5007d = new b(L8, E8);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int K() {
        if (this.f5006c == 0) {
            return 16;
        }
        b bVar = this.f5008e;
        int i8 = bVar.f5014a;
        int i9 = this.f5007d.f5014a;
        if (i8 >= i9) {
            return (i8 - i9) + 4 + bVar.f5015b + 16;
        }
        return (((i8 + 4) + bVar.f5015b) + this.f5005b) - i9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f5004a.close();
    }

    public void l(byte[] bArr) {
        m(bArr, 0, bArr.length);
    }

    public synchronized void m(byte[] bArr, int i8, int i9) {
        int L8;
        int i10;
        try {
            x(bArr, "buffer");
            if ((i8 | i9) >= 0 && i9 <= bArr.length - i8) {
                o(i9);
                boolean v8 = v();
                if (v8) {
                    L8 = 16;
                } else {
                    b bVar = this.f5008e;
                    L8 = L(bVar.f5014a + 4 + bVar.f5015b);
                }
                b bVar2 = new b(L8, i9);
                N(this.f5009f, 0, i9);
                I(bVar2.f5014a, this.f5009f, 0, 4);
                I(bVar2.f5014a + 4, bArr, i8, i9);
                if (v8) {
                    i10 = bVar2.f5014a;
                } else {
                    i10 = this.f5007d.f5014a;
                }
                M(this.f5005b, this.f5006c + 1, i10, bVar2.f5014a);
                this.f5008e = bVar2;
                this.f5006c++;
                if (v8) {
                    this.f5007d = bVar2;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void n() {
        try {
            M(4096, 0, 0, 0);
            this.f5006c = 0;
            b bVar = b.f5013c;
            this.f5007d = bVar;
            this.f5008e = bVar;
            if (this.f5005b > 4096) {
                J(4096);
            }
            this.f5005b = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void s(d dVar) {
        int i8 = this.f5007d.f5014a;
        for (int i9 = 0; i9 < this.f5006c; i9++) {
            b A8 = A(i8);
            dVar.a(new c(this, A8, null), A8.f5015b);
            i8 = L(A8.f5014a + 4 + A8.f5015b);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f5005b);
        sb.append(", size=");
        sb.append(this.f5006c);
        sb.append(", first=");
        sb.append(this.f5007d);
        sb.append(", last=");
        sb.append(this.f5008e);
        sb.append(", element lengths=[");
        try {
            s(new a(sb));
        } catch (IOException e8) {
            f5003g.log(Level.WARNING, "read error", (Throwable) e8);
        }
        sb.append("]]");
        return sb.toString();
    }

    public synchronized boolean v() {
        boolean z8;
        if (this.f5006c == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        return z8;
    }
}
