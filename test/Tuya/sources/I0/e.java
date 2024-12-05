package I0;

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
public class e implements Closeable {

    /* renamed from: g, reason: collision with root package name */
    private static final Logger f3699g = Logger.getLogger(e.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final RandomAccessFile f3700a;

    /* renamed from: b, reason: collision with root package name */
    int f3701b;

    /* renamed from: c, reason: collision with root package name */
    private int f3702c;

    /* renamed from: d, reason: collision with root package name */
    private b f3703d;

    /* renamed from: e, reason: collision with root package name */
    private b f3704e;

    /* renamed from: f, reason: collision with root package name */
    private final byte[] f3705f = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        boolean f3706a = true;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f3707b;

        a(StringBuilder sb) {
            this.f3707b = sb;
        }

        @Override // I0.e.d
        public void a(InputStream inputStream, int i8) {
            if (this.f3706a) {
                this.f3706a = false;
            } else {
                this.f3707b.append(", ");
            }
            this.f3707b.append(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: c, reason: collision with root package name */
        static final b f3709c = new b(0, 0);

        /* renamed from: a, reason: collision with root package name */
        final int f3710a;

        /* renamed from: b, reason: collision with root package name */
        final int f3711b;

        b(int i8, int i9) {
            this.f3710a = i8;
            this.f3711b = i9;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f3710a + ", length = " + this.f3711b + "]";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class c extends InputStream {

        /* renamed from: a, reason: collision with root package name */
        private int f3712a;

        /* renamed from: b, reason: collision with root package name */
        private int f3713b;

        /* synthetic */ c(e eVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i8, int i9) {
            e.u(bArr, "buffer");
            if ((i8 | i9) >= 0 && i9 <= bArr.length - i8) {
                int i10 = this.f3713b;
                if (i10 <= 0) {
                    return -1;
                }
                if (i9 > i10) {
                    i9 = i10;
                }
                e.this.H(this.f3712a, bArr, i8, i9);
                this.f3712a = e.this.L(this.f3712a + i9);
                this.f3713b -= i9;
                return i9;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private c(b bVar) {
            this.f3712a = e.this.L(bVar.f3710a + 4);
            this.f3713b = bVar.f3711b;
        }

        @Override // java.io.InputStream
        public int read() {
            if (this.f3713b == 0) {
                return -1;
            }
            e.this.f3700a.seek(this.f3712a);
            int read = e.this.f3700a.read();
            this.f3712a = e.this.L(this.f3712a + 1);
            this.f3713b--;
            return read;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(InputStream inputStream, int i8);
    }

    public e(File file) {
        if (!file.exists()) {
            r(file);
        }
        this.f3700a = w(file);
        A();
    }

    private void A() {
        this.f3700a.seek(0L);
        this.f3700a.readFully(this.f3705f);
        int E8 = E(this.f3705f, 0);
        this.f3701b = E8;
        if (E8 <= this.f3700a.length()) {
            this.f3702c = E(this.f3705f, 4);
            int E9 = E(this.f3705f, 8);
            int E10 = E(this.f3705f, 12);
            this.f3703d = x(E9);
            this.f3704e = x(E10);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f3701b + ", Actual length: " + this.f3700a.length());
    }

    private static int E(byte[] bArr, int i8) {
        return ((bArr[i8] & 255) << 24) + ((bArr[i8 + 1] & 255) << 16) + ((bArr[i8 + 2] & 255) << 8) + (bArr[i8 + 3] & 255);
    }

    private int F() {
        return this.f3701b - K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H(int i8, byte[] bArr, int i9, int i10) {
        int L8 = L(i8);
        int i11 = L8 + i10;
        int i12 = this.f3701b;
        if (i11 <= i12) {
            this.f3700a.seek(L8);
            this.f3700a.readFully(bArr, i9, i10);
            return;
        }
        int i13 = i12 - L8;
        this.f3700a.seek(L8);
        this.f3700a.readFully(bArr, i9, i13);
        this.f3700a.seek(16L);
        this.f3700a.readFully(bArr, i9 + i13, i10 - i13);
    }

    private void I(int i8, byte[] bArr, int i9, int i10) {
        int L8 = L(i8);
        int i11 = L8 + i10;
        int i12 = this.f3701b;
        if (i11 <= i12) {
            this.f3700a.seek(L8);
            this.f3700a.write(bArr, i9, i10);
            return;
        }
        int i13 = i12 - L8;
        this.f3700a.seek(L8);
        this.f3700a.write(bArr, i9, i13);
        this.f3700a.seek(16L);
        this.f3700a.write(bArr, i9 + i13, i10 - i13);
    }

    private void J(int i8) {
        this.f3700a.setLength(i8);
        this.f3700a.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int L(int i8) {
        int i9 = this.f3701b;
        if (i8 >= i9) {
            return (i8 + 16) - i9;
        }
        return i8;
    }

    private void M(int i8, int i9, int i10, int i11) {
        O(this.f3705f, i8, i9, i10, i11);
        this.f3700a.seek(0L);
        this.f3700a.write(this.f3705f);
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

    private void m(int i8) {
        int i9 = i8 + 4;
        int F8 = F();
        if (F8 >= i9) {
            return;
        }
        int i10 = this.f3701b;
        do {
            F8 += i10;
            i10 <<= 1;
        } while (F8 < i9);
        J(i10);
        b bVar = this.f3704e;
        int L8 = L(bVar.f3710a + 4 + bVar.f3711b);
        if (L8 < this.f3703d.f3710a) {
            FileChannel channel = this.f3700a.getChannel();
            channel.position(this.f3701b);
            long j8 = L8 - 4;
            if (channel.transferTo(16L, j8, channel) != j8) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i11 = this.f3704e.f3710a;
        int i12 = this.f3703d.f3710a;
        if (i11 < i12) {
            int i13 = (this.f3701b + i11) - 16;
            M(i10, this.f3702c, i12, i13);
            this.f3704e = new b(i13, this.f3704e.f3711b);
        } else {
            M(i10, this.f3702c, i12, i11);
        }
        this.f3701b = i10;
    }

    private static void r(File file) {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile w8 = w(file2);
        try {
            w8.setLength(4096L);
            w8.seek(0L);
            byte[] bArr = new byte[16];
            O(bArr, 4096, 0, 0, 0);
            w8.write(bArr);
            w8.close();
            if (file2.renameTo(file)) {
            } else {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            w8.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object u(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    private static RandomAccessFile w(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private b x(int i8) {
        if (i8 == 0) {
            return b.f3709c;
        }
        this.f3700a.seek(i8);
        return new b(i8, this.f3700a.readInt());
    }

    public synchronized void G() {
        try {
            if (!t()) {
                if (this.f3702c == 1) {
                    l();
                } else {
                    b bVar = this.f3703d;
                    int L8 = L(bVar.f3710a + 4 + bVar.f3711b);
                    H(L8, this.f3705f, 0, 4);
                    int E8 = E(this.f3705f, 0);
                    M(this.f3701b, this.f3702c - 1, L8, this.f3704e.f3710a);
                    this.f3702c--;
                    this.f3703d = new b(L8, E8);
                }
            } else {
                throw new NoSuchElementException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public int K() {
        if (this.f3702c == 0) {
            return 16;
        }
        b bVar = this.f3704e;
        int i8 = bVar.f3710a;
        int i9 = this.f3703d.f3710a;
        if (i8 >= i9) {
            return (i8 - i9) + 4 + bVar.f3711b + 16;
        }
        return (((i8 + 4) + bVar.f3711b) + this.f3701b) - i9;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f3700a.close();
    }

    public void g(byte[] bArr) {
        h(bArr, 0, bArr.length);
    }

    public synchronized void h(byte[] bArr, int i8, int i9) {
        int L8;
        int i10;
        try {
            u(bArr, "buffer");
            if ((i8 | i9) >= 0 && i9 <= bArr.length - i8) {
                m(i9);
                boolean t8 = t();
                if (t8) {
                    L8 = 16;
                } else {
                    b bVar = this.f3704e;
                    L8 = L(bVar.f3710a + 4 + bVar.f3711b);
                }
                b bVar2 = new b(L8, i9);
                N(this.f3705f, 0, i9);
                I(bVar2.f3710a, this.f3705f, 0, 4);
                I(bVar2.f3710a + 4, bArr, i8, i9);
                if (t8) {
                    i10 = bVar2.f3710a;
                } else {
                    i10 = this.f3703d.f3710a;
                }
                M(this.f3701b, this.f3702c + 1, i10, bVar2.f3710a);
                this.f3704e = bVar2;
                this.f3702c++;
                if (t8) {
                    this.f3703d = bVar2;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void l() {
        try {
            M(4096, 0, 0, 0);
            this.f3702c = 0;
            b bVar = b.f3709c;
            this.f3703d = bVar;
            this.f3704e = bVar;
            if (this.f3701b > 4096) {
                J(4096);
            }
            this.f3701b = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void o(d dVar) {
        int i8 = this.f3703d.f3710a;
        for (int i9 = 0; i9 < this.f3702c; i9++) {
            b x8 = x(i8);
            dVar.a(new c(this, x8, null), x8.f3711b);
            i8 = L(x8.f3710a + 4 + x8.f3711b);
        }
    }

    public synchronized boolean t() {
        boolean z8;
        if (this.f3702c == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        return z8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f3701b);
        sb.append(", size=");
        sb.append(this.f3702c);
        sb.append(", first=");
        sb.append(this.f3703d);
        sb.append(", last=");
        sb.append(this.f3704e);
        sb.append(", element lengths=[");
        try {
            o(new a(sb));
        } catch (IOException e8) {
            f3699g.log(Level.WARNING, "read error", (Throwable) e8);
        }
        sb.append("]]");
        return sb.toString();
    }
}
