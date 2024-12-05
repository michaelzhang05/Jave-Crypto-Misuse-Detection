package androidx.exifinterface.media;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.b;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import t3.b0;

/* loaded from: classes.dex */
public class a {
    private static SimpleDateFormat U;
    private static SimpleDateFormat V;
    private static final e[] Z;

    /* renamed from: a0, reason: collision with root package name */
    private static final e[] f2582a0;

    /* renamed from: b0, reason: collision with root package name */
    private static final e[] f2583b0;

    /* renamed from: c0, reason: collision with root package name */
    private static final e[] f2584c0;

    /* renamed from: d0, reason: collision with root package name */
    private static final e[] f2585d0;

    /* renamed from: e0, reason: collision with root package name */
    private static final e f2586e0;

    /* renamed from: f0, reason: collision with root package name */
    private static final e[] f2587f0;

    /* renamed from: g0, reason: collision with root package name */
    private static final e[] f2588g0;

    /* renamed from: h0, reason: collision with root package name */
    private static final e[] f2589h0;

    /* renamed from: i0, reason: collision with root package name */
    private static final e[] f2590i0;

    /* renamed from: j0, reason: collision with root package name */
    static final e[][] f2591j0;

    /* renamed from: k0, reason: collision with root package name */
    private static final e[] f2592k0;

    /* renamed from: l0, reason: collision with root package name */
    private static final HashMap[] f2593l0;

    /* renamed from: m0, reason: collision with root package name */
    private static final HashMap[] f2594m0;

    /* renamed from: n0, reason: collision with root package name */
    private static final HashSet f2595n0;

    /* renamed from: o0, reason: collision with root package name */
    private static final HashMap f2596o0;

    /* renamed from: p0, reason: collision with root package name */
    static final Charset f2597p0;

    /* renamed from: q0, reason: collision with root package name */
    static final byte[] f2598q0;

    /* renamed from: r0, reason: collision with root package name */
    private static final byte[] f2599r0;

    /* renamed from: s0, reason: collision with root package name */
    private static final Pattern f2600s0;

    /* renamed from: t0, reason: collision with root package name */
    private static final Pattern f2601t0;

    /* renamed from: u0, reason: collision with root package name */
    private static final Pattern f2602u0;

    /* renamed from: v0, reason: collision with root package name */
    private static final Pattern f2604v0;

    /* renamed from: a, reason: collision with root package name */
    private String f2609a;

    /* renamed from: b, reason: collision with root package name */
    private FileDescriptor f2610b;

    /* renamed from: c, reason: collision with root package name */
    private AssetManager.AssetInputStream f2611c;

    /* renamed from: d, reason: collision with root package name */
    private int f2612d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2613e;

    /* renamed from: f, reason: collision with root package name */
    private final HashMap[] f2614f;

    /* renamed from: g, reason: collision with root package name */
    private Set f2615g;

    /* renamed from: h, reason: collision with root package name */
    private ByteOrder f2616h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f2617i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f2618j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f2619k;

    /* renamed from: l, reason: collision with root package name */
    private int f2620l;

    /* renamed from: m, reason: collision with root package name */
    private int f2621m;

    /* renamed from: n, reason: collision with root package name */
    private byte[] f2622n;

    /* renamed from: o, reason: collision with root package name */
    private int f2623o;

    /* renamed from: p, reason: collision with root package name */
    private int f2624p;

    /* renamed from: q, reason: collision with root package name */
    private int f2625q;

    /* renamed from: r, reason: collision with root package name */
    private int f2626r;

    /* renamed from: s, reason: collision with root package name */
    private int f2627s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f2628t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f2629u;

    /* renamed from: v, reason: collision with root package name */
    private static final boolean f2603v = Log.isLoggable("ExifInterface", 3);

    /* renamed from: w, reason: collision with root package name */
    private static final List f2605w = Arrays.asList(1, 6, 3, 8);

    /* renamed from: x, reason: collision with root package name */
    private static final List f2606x = Arrays.asList(2, 7, 4, 5);

    /* renamed from: y, reason: collision with root package name */
    public static final int[] f2607y = {8, 8, 8};

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f2608z = {4};
    public static final int[] A = {8};
    static final byte[] B = {-1, -40, -1};
    private static final byte[] C = {102, 116, 121, 112};
    private static final byte[] D = {109, 105, 102, 49};
    private static final byte[] E = {104, 101, 105, 99};
    private static final byte[] F = {79, 76, 89, 77, 80, 0};
    private static final byte[] G = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] H = {-119, 80, 78, 71, 13, 10, 26, 10};
    private static final byte[] I = {101, 88, 73, 102};
    private static final byte[] J = {73, 72, 68, 82};
    private static final byte[] K = {73, 69, 78, 68};
    private static final byte[] L = {82, 73, 70, 70};
    private static final byte[] M = {87, 69, 66, 80};
    private static final byte[] N = {69, 88, 73, 70};
    private static final byte[] O = {-99, 1, 42};
    private static final byte[] P = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] Q = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] R = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] S = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] T = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] W = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] X = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] Y = {65, 83, 67, 73, 73, 0, 0, 0};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.exifinterface.media.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0044a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        long f2630a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ g f2631b;

        C0044a(g gVar) {
            this.f2631b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // android.media.MediaDataSource
        public long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j6, byte[] bArr, int i6, int i7) {
            if (i7 == 0) {
                return 0;
            }
            if (j6 < 0) {
                return -1;
            }
            try {
                long j7 = this.f2630a;
                if (j7 != j6) {
                    if (j7 >= 0 && j6 >= j7 + this.f2631b.available()) {
                        return -1;
                    }
                    this.f2631b.G(j6);
                    this.f2630a = j6;
                }
                if (i7 > this.f2631b.available()) {
                    i7 = this.f2631b.available();
                }
                int read = this.f2631b.read(bArr, i6, i7);
                if (read >= 0) {
                    this.f2630a += read;
                    return read;
                }
            } catch (IOException unused) {
            }
            this.f2630a = -1L;
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends InputStream implements DataInput {

        /* renamed from: e, reason: collision with root package name */
        private static final ByteOrder f2633e = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: f, reason: collision with root package name */
        private static final ByteOrder f2634f = ByteOrder.BIG_ENDIAN;

        /* renamed from: a, reason: collision with root package name */
        final DataInputStream f2635a;

        /* renamed from: b, reason: collision with root package name */
        private ByteOrder f2636b;

        /* renamed from: c, reason: collision with root package name */
        int f2637c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f2638d;

        b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public void D(int i6) {
            int i7 = 0;
            while (i7 < i6) {
                int i8 = i6 - i7;
                int skip = (int) this.f2635a.skip(i8);
                if (skip <= 0) {
                    if (this.f2638d == null) {
                        this.f2638d = new byte[8192];
                    }
                    skip = this.f2635a.read(this.f2638d, 0, Math.min(8192, i8));
                    if (skip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i6 + " bytes.");
                    }
                }
                i7 += skip;
            }
            this.f2637c += i7;
        }

        @Override // java.io.InputStream
        public int available() {
            return this.f2635a.available();
        }

        public int g() {
            return this.f2637c;
        }

        @Override // java.io.InputStream
        public void mark(int i6) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        public long q() {
            return readInt() & 4294967295L;
        }

        @Override // java.io.InputStream
        public int read() {
            this.f2637c++;
            return this.f2635a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() {
            this.f2637c++;
            return this.f2635a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() {
            this.f2637c++;
            int read = this.f2635a.read();
            if (read >= 0) {
                return (byte) read;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public char readChar() {
            this.f2637c += 2;
            return this.f2635a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) {
            this.f2637c += bArr.length;
            this.f2635a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public int readInt() {
            this.f2637c += 4;
            int read = this.f2635a.read();
            int read2 = this.f2635a.read();
            int read3 = this.f2635a.read();
            int read4 = this.f2635a.read();
            if ((read | read2 | read3 | read4) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2636b;
            if (byteOrder == f2633e) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f2634f) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.f2636b);
        }

        @Override // java.io.DataInput
        public String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() {
            this.f2637c += 8;
            int read = this.f2635a.read();
            int read2 = this.f2635a.read();
            int read3 = this.f2635a.read();
            int read4 = this.f2635a.read();
            int read5 = this.f2635a.read();
            int read6 = this.f2635a.read();
            int read7 = this.f2635a.read();
            int read8 = this.f2635a.read();
            if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2636b;
            if (byteOrder == f2633e) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == f2634f) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.f2636b);
        }

        @Override // java.io.DataInput
        public short readShort() {
            this.f2637c += 2;
            int read = this.f2635a.read();
            int read2 = this.f2635a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2636b;
            if (byteOrder == f2633e) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == f2634f) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.f2636b);
        }

        @Override // java.io.DataInput
        public String readUTF() {
            this.f2637c += 2;
            return this.f2635a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() {
            this.f2637c++;
            return this.f2635a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() {
            this.f2637c += 2;
            int read = this.f2635a.read();
            int read2 = this.f2635a.read();
            if ((read | read2) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f2636b;
            if (byteOrder == f2633e) {
                return (read2 << 8) + read;
            }
            if (byteOrder == f2634f) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.f2636b);
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i6) {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public void w(ByteOrder byteOrder) {
            this.f2636b = byteOrder;
        }

        b(InputStream inputStream, ByteOrder byteOrder) {
            this.f2636b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f2635a = dataInputStream;
            dataInputStream.mark(0);
            this.f2637c = 0;
            this.f2636b = byteOrder;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i6, int i7) {
            int read = this.f2635a.read(bArr, i6, i7);
            this.f2637c += read;
            return read;
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i6, int i7) {
            this.f2637c += i7;
            this.f2635a.readFully(bArr, i6, i7);
        }

        b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        final OutputStream f2639a;

        /* renamed from: b, reason: collision with root package name */
        private ByteOrder f2640b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f2639a = outputStream;
            this.f2640b = byteOrder;
        }

        public void D(short s5) {
            OutputStream outputStream;
            int i6;
            ByteOrder byteOrder = this.f2640b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f2639a.write((s5 >>> 0) & 255);
                outputStream = this.f2639a;
                i6 = s5 >>> 8;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f2639a.write((s5 >>> 8) & 255);
                outputStream = this.f2639a;
                i6 = s5 >>> 0;
            }
            outputStream.write(i6 & 255);
        }

        public void G(long j6) {
            w((int) j6);
        }

        public void H(int i6) {
            D((short) i6);
        }

        public void g(ByteOrder byteOrder) {
            this.f2640b = byteOrder;
        }

        public void q(int i6) {
            this.f2639a.write(i6);
        }

        public void w(int i6) {
            OutputStream outputStream;
            int i7;
            ByteOrder byteOrder = this.f2640b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f2639a.write((i6 >>> 0) & 255);
                this.f2639a.write((i6 >>> 8) & 255);
                this.f2639a.write((i6 >>> 16) & 255);
                outputStream = this.f2639a;
                i7 = i6 >>> 24;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    return;
                }
                this.f2639a.write((i6 >>> 24) & 255);
                this.f2639a.write((i6 >>> 16) & 255);
                this.f2639a.write((i6 >>> 8) & 255);
                outputStream = this.f2639a;
                i7 = i6 >>> 0;
            }
            outputStream.write(i7 & 255);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) {
            this.f2639a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i6, int i7) {
            this.f2639a.write(bArr, i6, i7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f2641a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2642b;

        /* renamed from: c, reason: collision with root package name */
        public final long f2643c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f2644d;

        d(int i6, int i7, long j6, byte[] bArr) {
            this.f2641a = i6;
            this.f2642b = i7;
            this.f2643c = j6;
            this.f2644d = bArr;
        }

        public static d a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(a.f2597p0);
            return new d(1, bytes.length, bytes);
        }

        public static d b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[12] * dArr.length]);
            wrap.order(byteOrder);
            for (double d6 : dArr) {
                wrap.putDouble(d6);
            }
            return new d(12, dArr.length, wrap.array());
        }

        public static d c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[9] * iArr.length]);
            wrap.order(byteOrder);
            for (int i6 : iArr) {
                wrap.putInt(i6);
            }
            return new d(9, iArr.length, wrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[10] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f2649a);
                wrap.putInt((int) fVar.f2650b);
            }
            return new d(10, fVarArr.length, wrap.array());
        }

        public static d e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(a.f2597p0);
            return new d(2, bytes.length, bytes);
        }

        public static d f(long j6, ByteOrder byteOrder) {
            return g(new long[]{j6}, byteOrder);
        }

        public static d g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[4] * jArr.length]);
            wrap.order(byteOrder);
            for (long j6 : jArr) {
                wrap.putInt((int) j6);
            }
            return new d(4, jArr.length, wrap.array());
        }

        public static d h(f fVar, ByteOrder byteOrder) {
            return i(new f[]{fVar}, byteOrder);
        }

        public static d i(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[5] * fVarArr.length]);
            wrap.order(byteOrder);
            for (f fVar : fVarArr) {
                wrap.putInt((int) fVar.f2649a);
                wrap.putInt((int) fVar.f2650b);
            }
            return new d(5, fVarArr.length, wrap.array());
        }

        public static d j(int i6, ByteOrder byteOrder) {
            return k(new int[]{i6}, byteOrder);
        }

        public static d k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[a.X[3] * iArr.length]);
            wrap.order(byteOrder);
            for (int i6 : iArr) {
                wrap.putShort((short) i6);
            }
            return new d(3, iArr.length, wrap.array());
        }

        public double l(ByteOrder byteOrder) {
            Object o6 = o(byteOrder);
            if (o6 == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (o6 instanceof String) {
                return Double.parseDouble((String) o6);
            }
            if (o6 instanceof long[]) {
                if (((long[]) o6).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o6 instanceof int[]) {
                if (((int[]) o6).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (o6 instanceof double[]) {
                double[] dArr = (double[]) o6;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o6 instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) o6;
            if (fVarArr.length == 1) {
                return fVarArr[0].a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        public int m(ByteOrder byteOrder) {
            Object o6 = o(byteOrder);
            if (o6 == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (o6 instanceof String) {
                return Integer.parseInt((String) o6);
            }
            if (o6 instanceof long[]) {
                long[] jArr = (long[]) o6;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(o6 instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) o6;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public String n(ByteOrder byteOrder) {
            Object o6 = o(byteOrder);
            if (o6 == null) {
                return null;
            }
            if (o6 instanceof String) {
                return (String) o6;
            }
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            if (o6 instanceof long[]) {
                long[] jArr = (long[]) o6;
                while (i6 < jArr.length) {
                    sb.append(jArr[i6]);
                    i6++;
                    if (i6 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (o6 instanceof int[]) {
                int[] iArr = (int[]) o6;
                while (i6 < iArr.length) {
                    sb.append(iArr[i6]);
                    i6++;
                    if (i6 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (o6 instanceof double[]) {
                double[] dArr = (double[]) o6;
                while (i6 < dArr.length) {
                    sb.append(dArr[i6]);
                    i6++;
                    if (i6 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(o6 instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) o6;
            while (i6 < fVarArr.length) {
                sb.append(fVarArr[i6].f2649a);
                sb.append('/');
                sb.append(fVarArr[i6].f2650b);
                i6++;
                if (i6 != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Not initialized variable reg: 3, insn: 0x0198: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:168:0x0198 */
        /* JADX WARN: Removed duplicated region for block: B:171:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        java.lang.Object o(java.nio.ByteOrder r11) {
            /*
                Method dump skipped, instructions count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.d.o(java.nio.ByteOrder):java.lang.Object");
        }

        public int p() {
            return a.X[this.f2641a] * this.f2642b;
        }

        public String toString() {
            return "(" + a.W[this.f2641a] + ", data length:" + this.f2644d.length + ")";
        }

        d(int i6, int i7, byte[] bArr) {
            this(i6, i7, -1L, bArr);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f2645a;

        /* renamed from: b, reason: collision with root package name */
        public final String f2646b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2647c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2648d;

        e(String str, int i6, int i7) {
            this.f2646b = str;
            this.f2645a = i6;
            this.f2647c = i7;
            this.f2648d = -1;
        }

        boolean a(int i6) {
            int i7;
            int i8 = this.f2647c;
            if (i8 == 7 || i6 == 7 || i8 == i6 || (i7 = this.f2648d) == i6) {
                return true;
            }
            if ((i8 == 4 || i7 == 4) && i6 == 3) {
                return true;
            }
            if ((i8 == 9 || i7 == 9) && i6 == 8) {
                return true;
            }
            return (i8 == 12 || i7 == 12) && i6 == 11;
        }

        e(String str, int i6, int i7, int i8) {
            this.f2646b = str;
            this.f2645a = i6;
            this.f2647c = i7;
            this.f2648d = i8;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f2649a;

        /* renamed from: b, reason: collision with root package name */
        public final long f2650b;

        f(double d6) {
            this((long) (d6 * 10000.0d), 10000L);
        }

        public double a() {
            return this.f2649a / this.f2650b;
        }

        public String toString() {
            return this.f2649a + "/" + this.f2650b;
        }

        f(long j6, long j7) {
            if (j7 == 0) {
                this.f2649a = 0L;
                this.f2650b = 1L;
            } else {
                this.f2649a = j6;
                this.f2650b = j7;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g extends b {
        g(InputStream inputStream) {
            super(inputStream);
            if (!inputStream.markSupported()) {
                throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            }
            this.f2635a.mark(Integer.MAX_VALUE);
        }

        public void G(long j6) {
            int i6 = this.f2637c;
            if (i6 > j6) {
                this.f2637c = 0;
                this.f2635a.reset();
            } else {
                j6 -= i6;
            }
            D((int) j6);
        }

        g(byte[] bArr) {
            super(bArr);
            this.f2635a.mark(Integer.MAX_VALUE);
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        Z = eVarArr;
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f2582a0 = eVarArr2;
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        f2583b0 = eVarArr3;
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        f2584c0 = eVarArr4;
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        f2585d0 = eVarArr5;
        f2586e0 = new e("StripOffsets", 273, 3);
        e[] eVarArr6 = {new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)};
        f2587f0 = eVarArr6;
        e[] eVarArr7 = {new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)};
        f2588g0 = eVarArr7;
        e[] eVarArr8 = {new e("AspectFrame", 4371, 3)};
        f2589h0 = eVarArr8;
        e[] eVarArr9 = {new e("ColorSpace", 55, 3)};
        f2590i0 = eVarArr9;
        e[][] eVarArr10 = {eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, eVarArr6, eVarArr7, eVarArr8, eVarArr9};
        f2591j0 = eVarArr10;
        f2592k0 = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        f2593l0 = new HashMap[eVarArr10.length];
        f2594m0 = new HashMap[eVarArr10.length];
        f2595n0 = new HashSet(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f2596o0 = new HashMap();
        Charset forName = Charset.forName("US-ASCII");
        f2597p0 = forName;
        f2598q0 = "Exif\u0000\u0000".getBytes(forName);
        f2599r0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(forName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        U = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        V = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i6 = 0;
        while (true) {
            e[][] eVarArr11 = f2591j0;
            if (i6 >= eVarArr11.length) {
                HashMap hashMap = f2596o0;
                e[] eVarArr12 = f2592k0;
                hashMap.put(Integer.valueOf(eVarArr12[0].f2645a), 5);
                hashMap.put(Integer.valueOf(eVarArr12[1].f2645a), 1);
                hashMap.put(Integer.valueOf(eVarArr12[2].f2645a), 2);
                hashMap.put(Integer.valueOf(eVarArr12[3].f2645a), 3);
                hashMap.put(Integer.valueOf(eVarArr12[4].f2645a), 7);
                hashMap.put(Integer.valueOf(eVarArr12[5].f2645a), 8);
                f2600s0 = Pattern.compile(".*[1-9].*");
                f2601t0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f2602u0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f2604v0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            f2593l0[i6] = new HashMap();
            f2594m0[i6] = new HashMap();
            for (e eVar : eVarArr11[i6]) {
                f2593l0[i6].put(Integer.valueOf(eVar.f2645a), eVar);
                f2594m0[i6].put(eVar.f2646b, eVar);
            }
            i6++;
        }
    }

    public a(InputStream inputStream) {
        this(inputStream, 0);
    }

    private boolean A(byte[] bArr) {
        int i6 = 0;
        while (true) {
            byte[] bArr2 = H;
            if (i6 >= bArr2.length) {
                return true;
            }
            if (bArr[i6] != bArr2[i6]) {
                return false;
            }
            i6++;
        }
    }

    private boolean B(byte[] bArr) {
        byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
        for (int i6 = 0; i6 < bytes.length; i6++) {
            if (bArr[i6] != bytes[i6]) {
                return false;
            }
        }
        return true;
    }

    private boolean C(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder L2 = L(bVar2);
                this.f2616h = L2;
                bVar2.w(L2);
                boolean z5 = bVar2.readShort() == 85;
                bVar2.close();
                return z5;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean D(FileDescriptor fileDescriptor) {
        try {
            b.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f2603v) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    private boolean E(HashMap hashMap) {
        d dVar;
        int m6;
        d dVar2 = (d) hashMap.get("BitsPerSample");
        if (dVar2 != null) {
            int[] iArr = (int[]) dVar2.o(this.f2616h);
            int[] iArr2 = f2607y;
            if (Arrays.equals(iArr2, iArr)) {
                return true;
            }
            if (this.f2612d == 3 && (dVar = (d) hashMap.get("PhotometricInterpretation")) != null && (((m6 = dVar.m(this.f2616h)) == 1 && Arrays.equals(iArr, A)) || (m6 == 6 && Arrays.equals(iArr, iArr2)))) {
                return true;
            }
        }
        if (!f2603v) {
            return false;
        }
        Log.d("ExifInterface", "Unsupported data type value");
        return false;
    }

    private static boolean F(int i6) {
        return i6 == 4 || i6 == 13 || i6 == 14;
    }

    private boolean G(HashMap hashMap) {
        d dVar = (d) hashMap.get("ImageLength");
        d dVar2 = (d) hashMap.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.m(this.f2616h) <= 512 && dVar2.m(this.f2616h) <= 512;
    }

    private boolean H(byte[] bArr) {
        int i6 = 0;
        while (true) {
            byte[] bArr2 = L;
            if (i6 >= bArr2.length) {
                int i7 = 0;
                while (true) {
                    byte[] bArr3 = M;
                    if (i7 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[L.length + i7 + 4] != bArr3[i7]) {
                        return false;
                    }
                    i7++;
                }
            } else {
                if (bArr[i6] != bArr2[i6]) {
                    return false;
                }
                i6++;
            }
        }
    }

    private void I(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i6 = 0; i6 < f2591j0.length; i6++) {
            try {
                try {
                    this.f2614f[i6] = new HashMap();
                } finally {
                    a();
                    if (f2603v) {
                        K();
                    }
                }
            } catch (IOException | UnsupportedOperationException e6) {
                boolean z5 = f2603v;
                if (z5) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e6);
                }
                a();
                if (!z5) {
                    return;
                }
            }
        }
        if (!this.f2613e) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.f2612d = i(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (Y(this.f2612d)) {
            g gVar = new g(inputStream);
            if (this.f2613e) {
                o(gVar);
            } else {
                int i7 = this.f2612d;
                if (i7 == 12) {
                    g(gVar);
                } else if (i7 == 7) {
                    j(gVar);
                } else if (i7 == 10) {
                    n(gVar);
                } else {
                    m(gVar);
                }
            }
            gVar.G(this.f2624p);
            X(gVar);
        } else {
            b bVar = new b(inputStream);
            int i8 = this.f2612d;
            if (i8 == 4) {
                h(bVar, 0, 0);
            } else if (i8 == 13) {
                k(bVar);
            } else if (i8 == 9) {
                l(bVar);
            } else if (i8 == 14) {
                r(bVar);
            }
        }
    }

    private void J(b bVar) {
        ByteOrder L2 = L(bVar);
        this.f2616h = L2;
        bVar.w(L2);
        int readUnsignedShort = bVar.readUnsignedShort();
        int i6 = this.f2612d;
        if (i6 != 7 && i6 != 10 && readUnsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(readUnsignedShort));
        }
        int readInt = bVar.readInt();
        if (readInt < 8) {
            throw new IOException("Invalid first Ifd offset: " + readInt);
        }
        int i7 = readInt - 8;
        if (i7 > 0) {
            bVar.D(i7);
        }
    }

    private void K() {
        for (int i6 = 0; i6 < this.f2614f.length; i6++) {
            Log.d("ExifInterface", "The size of tag group[" + i6 + "]: " + this.f2614f[i6].size());
            for (Map.Entry entry : this.f2614f[i6].entrySet()) {
                d dVar = (d) entry.getValue();
                Log.d("ExifInterface", "tagName: " + ((String) entry.getKey()) + ", tagType: " + dVar.toString() + ", tagValue: '" + dVar.n(this.f2616h) + "'");
            }
        }
    }

    private ByteOrder L(b bVar) {
        short readShort = bVar.readShort();
        if (readShort == 18761) {
            if (f2603v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (readShort == 19789) {
            if (f2603v) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(readShort));
    }

    private void M(byte[] bArr, int i6) {
        g gVar = new g(bArr);
        J(gVar);
        N(gVar, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0279  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void N(androidx.exifinterface.media.a.g r30, int r31) {
        /*
            Method dump skipped, instructions count: 903
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.N(androidx.exifinterface.media.a$g, int):void");
    }

    private void O(String str) {
        for (int i6 = 0; i6 < f2591j0.length; i6++) {
            this.f2614f[i6].remove(str);
        }
    }

    private void P(int i6, String str, String str2) {
        if (this.f2614f[i6].isEmpty() || this.f2614f[i6].get(str) == null) {
            return;
        }
        HashMap hashMap = this.f2614f[i6];
        hashMap.put(str2, hashMap.get(str));
        this.f2614f[i6].remove(str);
    }

    private void R(g gVar, int i6) {
        d dVar = (d) this.f2614f[i6].get("ImageLength");
        d dVar2 = (d) this.f2614f[i6].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            d dVar3 = (d) this.f2614f[i6].get("JPEGInterchangeFormat");
            d dVar4 = (d) this.f2614f[i6].get("JPEGInterchangeFormatLength");
            if (dVar3 == null || dVar4 == null) {
                return;
            }
            int m6 = dVar3.m(this.f2616h);
            int m7 = dVar3.m(this.f2616h);
            gVar.G(m6);
            byte[] bArr = new byte[m7];
            gVar.read(bArr);
            h(new b(bArr), m6, i6);
        }
    }

    private void T(InputStream inputStream, OutputStream outputStream) {
        if (f2603v) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        c cVar = new c(outputStream, ByteOrder.BIG_ENDIAN);
        if (bVar.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.q(-1);
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.q(-40);
        d dVar = (d("Xmp") == null || !this.f2629u) ? null : (d) this.f2614f[0].remove("Xmp");
        cVar.q(-1);
        cVar.q(-31);
        c0(cVar);
        if (dVar != null) {
            this.f2614f[0].put("Xmp", dVar);
        }
        byte[] bArr = new byte[4096];
        while (bVar.readByte() == -1) {
            byte readByte = bVar.readByte();
            if (readByte == -39 || readByte == -38) {
                cVar.q(-1);
                cVar.q(readByte);
                androidx.exifinterface.media.b.e(bVar, cVar);
                return;
            }
            if (readByte != -31) {
                cVar.q(-1);
                cVar.q(readByte);
                int readUnsignedShort = bVar.readUnsignedShort();
                cVar.H(readUnsignedShort);
                int i6 = readUnsignedShort - 2;
                if (i6 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i6 > 0) {
                    int read = bVar.read(bArr, 0, Math.min(i6, 4096));
                    if (read >= 0) {
                        cVar.write(bArr, 0, read);
                        i6 -= read;
                    }
                }
            } else {
                int readUnsignedShort2 = bVar.readUnsignedShort() - 2;
                if (readUnsignedShort2 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (readUnsignedShort2 >= 6) {
                    if (bVar.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f2598q0)) {
                        bVar.D(readUnsignedShort2 - 6);
                    }
                }
                cVar.q(-1);
                cVar.q(readByte);
                cVar.H(readUnsignedShort2 + 2);
                if (readUnsignedShort2 >= 6) {
                    readUnsignedShort2 -= 6;
                    cVar.write(bArr2);
                }
                while (readUnsignedShort2 > 0) {
                    int read2 = bVar.read(bArr, 0, Math.min(readUnsignedShort2, 4096));
                    if (read2 >= 0) {
                        cVar.write(bArr, 0, read2);
                        readUnsignedShort2 -= read2;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    private void U(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (f2603v) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        b bVar = new b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = H;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        int i6 = this.f2624p;
        if (i6 == 0) {
            int readInt = bVar.readInt();
            cVar.w(readInt);
            androidx.exifinterface.media.b.f(bVar, cVar, readInt + 4 + 4);
        } else {
            androidx.exifinterface.media.b.f(bVar, cVar, ((i6 - bArr.length) - 4) - 4);
            bVar.D(bVar.readInt() + 4 + 4);
        }
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th) {
            th = th;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            c0(cVar2);
            byte[] byteArray = ((ByteArrayOutputStream) cVar2.f2639a).toByteArray();
            cVar.write(byteArray);
            CRC32 crc32 = new CRC32();
            crc32.update(byteArray, 4, byteArray.length - 4);
            cVar.w((int) crc32.getValue());
            androidx.exifinterface.media.b.c(byteArrayOutputStream);
            androidx.exifinterface.media.b.e(bVar, cVar);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.c(byteArrayOutputStream2);
            throw th;
        }
    }

    private void V(InputStream inputStream, OutputStream outputStream) {
        ByteArrayOutputStream byteArrayOutputStream;
        int i6;
        int i7;
        int i8;
        if (f2603v) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + inputStream + ", outputStream: " + outputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(inputStream, byteOrder);
        c cVar = new c(outputStream, byteOrder);
        byte[] bArr = L;
        androidx.exifinterface.media.b.f(bVar, cVar, bArr.length);
        byte[] bArr2 = M;
        bVar.D(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e6) {
            e = e6;
        }
        try {
            c cVar2 = new c(byteArrayOutputStream, byteOrder);
            int i9 = this.f2624p;
            if (i9 != 0) {
                androidx.exifinterface.media.b.f(bVar, cVar2, ((i9 - ((bArr.length + 4) + bArr2.length)) - 4) - 4);
                bVar.D(4);
                int readInt = bVar.readInt();
                if (readInt % 2 != 0) {
                    readInt++;
                }
                bVar.D(readInt);
            } else {
                byte[] bArr3 = new byte[4];
                if (bVar.read(bArr3) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                }
                byte[] bArr4 = P;
                boolean z5 = true;
                if (!Arrays.equals(bArr3, bArr4)) {
                    byte[] bArr5 = R;
                    if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, Q)) {
                        int readInt2 = bVar.readInt();
                        int i10 = readInt2 % 2 == 1 ? readInt2 + 1 : readInt2;
                        byte[] bArr6 = new byte[3];
                        if (Arrays.equals(bArr3, bArr5)) {
                            bVar.read(bArr6);
                            byte[] bArr7 = new byte[3];
                            if (bVar.read(bArr7) != 3 || !Arrays.equals(O, bArr7)) {
                                throw new IOException("Encountered error while checking VP8 signature");
                            }
                            i6 = bVar.readInt();
                            i10 -= 10;
                            i8 = (i6 << 2) >> 18;
                            i7 = (i6 << 18) >> 18;
                            z5 = false;
                        } else if (!Arrays.equals(bArr3, Q)) {
                            i6 = 0;
                            z5 = false;
                            i7 = 0;
                            i8 = 0;
                        } else {
                            if (bVar.readByte() != 47) {
                                throw new IOException("Encountered error while checking VP8L signature");
                            }
                            i6 = bVar.readInt();
                            i7 = (i6 & 16383) + 1;
                            i8 = ((i6 & 268419072) >>> 14) + 1;
                            if ((i6 & 268435456) == 0) {
                                z5 = false;
                            }
                            i10 -= 5;
                        }
                        cVar2.write(bArr4);
                        cVar2.w(10);
                        byte[] bArr8 = new byte[10];
                        if (z5) {
                            bArr8[0] = (byte) (bArr8[0] | 16);
                        }
                        bArr8[0] = (byte) (bArr8[0] | 8);
                        int i11 = i7 - 1;
                        int i12 = i8 - 1;
                        bArr8[4] = (byte) i11;
                        bArr8[5] = (byte) (i11 >> 8);
                        bArr8[6] = (byte) (i11 >> 16);
                        bArr8[7] = (byte) i12;
                        bArr8[8] = (byte) (i12 >> 8);
                        bArr8[9] = (byte) (i12 >> 16);
                        cVar2.write(bArr8);
                        cVar2.write(bArr3);
                        cVar2.w(readInt2);
                        if (Arrays.equals(bArr3, bArr5)) {
                            cVar2.write(bArr6);
                            cVar2.write(O);
                        } else {
                            if (Arrays.equals(bArr3, Q)) {
                                cVar2.write(47);
                            }
                            androidx.exifinterface.media.b.f(bVar, cVar2, i10);
                        }
                        cVar2.w(i6);
                        androidx.exifinterface.media.b.f(bVar, cVar2, i10);
                    }
                    androidx.exifinterface.media.b.e(bVar, cVar2);
                    int size = byteArrayOutputStream.size();
                    byte[] bArr9 = M;
                    cVar.w(size + bArr9.length);
                    cVar.write(bArr9);
                    byteArrayOutputStream.writeTo(cVar);
                    androidx.exifinterface.media.b.c(byteArrayOutputStream);
                }
                int readInt3 = bVar.readInt();
                byte[] bArr10 = new byte[readInt3 % 2 == 1 ? readInt3 + 1 : readInt3];
                bVar.read(bArr10);
                byte b6 = (byte) (8 | bArr10[0]);
                bArr10[0] = b6;
                boolean z6 = ((b6 >> 1) & 1) == 1;
                cVar2.write(bArr4);
                cVar2.w(readInt3);
                cVar2.write(bArr10);
                if (z6) {
                    b(bVar, cVar2, S, null);
                    while (true) {
                        byte[] bArr11 = new byte[4];
                        inputStream.read(bArr11);
                        if (!Arrays.equals(bArr11, T)) {
                            break;
                        } else {
                            c(bVar, cVar2, bArr11);
                        }
                    }
                } else {
                    b(bVar, cVar2, R, Q);
                }
            }
            c0(cVar2);
            androidx.exifinterface.media.b.e(bVar, cVar2);
            int size2 = byteArrayOutputStream.size();
            byte[] bArr92 = M;
            cVar.w(size2 + bArr92.length);
            cVar.write(bArr92);
            byteArrayOutputStream.writeTo(cVar);
            androidx.exifinterface.media.b.c(byteArrayOutputStream);
        } catch (Exception e7) {
            e = e7;
            throw new IOException("Failed to save WebP file", e);
        } catch (Throwable th2) {
            th = th2;
            byteArrayOutputStream2 = byteArrayOutputStream;
            androidx.exifinterface.media.b.c(byteArrayOutputStream2);
            throw th;
        }
    }

    private void X(b bVar) {
        HashMap hashMap = this.f2614f[4];
        d dVar = (d) hashMap.get("Compression");
        if (dVar != null) {
            int m6 = dVar.m(this.f2616h);
            this.f2623o = m6;
            if (m6 != 1) {
                if (m6 != 6) {
                    if (m6 != 7) {
                        return;
                    }
                }
            }
            if (E(hashMap)) {
                u(bVar, hashMap);
                return;
            }
            return;
        }
        this.f2623o = 6;
        t(bVar, hashMap);
    }

    private static boolean Y(int i6) {
        return (i6 == 4 || i6 == 9 || i6 == 13 || i6 == 14) ? false : true;
    }

    private void Z(int i6, int i7) {
        String str;
        if (this.f2614f[i6].isEmpty() || this.f2614f[i7].isEmpty()) {
            if (f2603v) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = (d) this.f2614f[i6].get("ImageLength");
        d dVar2 = (d) this.f2614f[i6].get("ImageWidth");
        d dVar3 = (d) this.f2614f[i7].get("ImageLength");
        d dVar4 = (d) this.f2614f[i7].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (!f2603v) {
                return;
            } else {
                str = "First image does not contain valid size information";
            }
        } else {
            if (dVar3 != null && dVar4 != null) {
                int m6 = dVar.m(this.f2616h);
                int m7 = dVar2.m(this.f2616h);
                int m8 = dVar3.m(this.f2616h);
                int m9 = dVar4.m(this.f2616h);
                if (m6 >= m8 || m7 >= m9) {
                    return;
                }
                HashMap[] hashMapArr = this.f2614f;
                HashMap hashMap = hashMapArr[i6];
                hashMapArr[i6] = hashMapArr[i7];
                hashMapArr[i7] = hashMap;
                return;
            }
            if (!f2603v) {
                return;
            } else {
                str = "Second image does not contain valid size information";
            }
        }
        Log.d("ExifInterface", str);
    }

    private void a() {
        String d6 = d("DateTimeOriginal");
        if (d6 != null && d("DateTime") == null) {
            this.f2614f[0].put("DateTime", d.e(d6));
        }
        if (d("ImageWidth") == null) {
            this.f2614f[0].put("ImageWidth", d.f(0L, this.f2616h));
        }
        if (d("ImageLength") == null) {
            this.f2614f[0].put("ImageLength", d.f(0L, this.f2616h));
        }
        if (d("Orientation") == null) {
            this.f2614f[0].put("Orientation", d.f(0L, this.f2616h));
        }
        if (d("LightSource") == null) {
            this.f2614f[1].put("LightSource", d.f(0L, this.f2616h));
        }
    }

    private void a0(g gVar, int i6) {
        StringBuilder sb;
        String arrays;
        d j6;
        d j7;
        d dVar = (d) this.f2614f[i6].get("DefaultCropSize");
        d dVar2 = (d) this.f2614f[i6].get("SensorTopBorder");
        d dVar3 = (d) this.f2614f[i6].get("SensorLeftBorder");
        d dVar4 = (d) this.f2614f[i6].get("SensorBottomBorder");
        d dVar5 = (d) this.f2614f[i6].get("SensorRightBorder");
        if (dVar == null) {
            if (dVar2 == null || dVar3 == null || dVar4 == null || dVar5 == null) {
                R(gVar, i6);
                return;
            }
            int m6 = dVar2.m(this.f2616h);
            int m7 = dVar4.m(this.f2616h);
            int m8 = dVar5.m(this.f2616h);
            int m9 = dVar3.m(this.f2616h);
            if (m7 <= m6 || m8 <= m9) {
                return;
            }
            d j8 = d.j(m7 - m6, this.f2616h);
            d j9 = d.j(m8 - m9, this.f2616h);
            this.f2614f[i6].put("ImageLength", j8);
            this.f2614f[i6].put("ImageWidth", j9);
            return;
        }
        if (dVar.f2641a == 5) {
            f[] fVarArr = (f[]) dVar.o(this.f2616h);
            if (fVarArr != null && fVarArr.length == 2) {
                j6 = d.h(fVarArr[0], this.f2616h);
                j7 = d.h(fVarArr[1], this.f2616h);
                this.f2614f[i6].put("ImageWidth", j6);
                this.f2614f[i6].put("ImageLength", j7);
                return;
            }
            sb = new StringBuilder();
            sb.append("Invalid crop size values. cropSize=");
            arrays = Arrays.toString(fVarArr);
            sb.append(arrays);
            Log.w("ExifInterface", sb.toString());
        }
        int[] iArr = (int[]) dVar.o(this.f2616h);
        if (iArr != null && iArr.length == 2) {
            j6 = d.j(iArr[0], this.f2616h);
            j7 = d.j(iArr[1], this.f2616h);
            this.f2614f[i6].put("ImageWidth", j6);
            this.f2614f[i6].put("ImageLength", j7);
            return;
        }
        sb = new StringBuilder();
        sb.append("Invalid crop size values. cropSize=");
        arrays = Arrays.toString(iArr);
        sb.append(arrays);
        Log.w("ExifInterface", sb.toString());
    }

    private void b(b bVar, c cVar, byte[] bArr, byte[] bArr2) {
        String str;
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder();
                sb.append("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f2597p0;
                sb.append(new String(bArr, charset));
                if (bArr2 == null) {
                    str = "";
                } else {
                    str = " or " + new String(bArr2, charset);
                }
                sb.append(str);
                throw new IOException(sb.toString());
            }
            c(bVar, cVar, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void b0() {
        Z(0, 5);
        Z(0, 4);
        Z(5, 4);
        d dVar = (d) this.f2614f[1].get("PixelXDimension");
        d dVar2 = (d) this.f2614f[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            this.f2614f[0].put("ImageWidth", dVar);
            this.f2614f[0].put("ImageLength", dVar2);
        }
        if (this.f2614f[4].isEmpty() && G(this.f2614f[5])) {
            HashMap[] hashMapArr = this.f2614f;
            hashMapArr[4] = hashMapArr[5];
            hashMapArr[5] = new HashMap();
        }
        if (!G(this.f2614f[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        P(0, "ThumbnailOrientation", "Orientation");
        P(0, "ThumbnailImageLength", "ImageLength");
        P(0, "ThumbnailImageWidth", "ImageWidth");
        P(5, "ThumbnailOrientation", "Orientation");
        P(5, "ThumbnailImageLength", "ImageLength");
        P(5, "ThumbnailImageWidth", "ImageWidth");
        P(4, "Orientation", "ThumbnailOrientation");
        P(4, "ImageLength", "ThumbnailImageLength");
        P(4, "ImageWidth", "ThumbnailImageWidth");
    }

    private void c(b bVar, c cVar, byte[] bArr) {
        int readInt = bVar.readInt();
        cVar.write(bArr);
        cVar.w(readInt);
        if (readInt % 2 == 1) {
            readInt++;
        }
        androidx.exifinterface.media.b.f(bVar, cVar, readInt);
    }

    private int c0(c cVar) {
        e[][] eVarArr = f2591j0;
        int[] iArr = new int[eVarArr.length];
        int[] iArr2 = new int[eVarArr.length];
        for (e eVar : f2592k0) {
            O(eVar.f2646b);
        }
        if (this.f2617i) {
            if (this.f2618j) {
                O("StripOffsets");
                O("StripByteCounts");
            } else {
                O("JPEGInterchangeFormat");
                O("JPEGInterchangeFormatLength");
            }
        }
        for (int i6 = 0; i6 < f2591j0.length; i6++) {
            for (Object obj : this.f2614f[i6].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.f2614f[i6].remove(entry.getKey());
                }
            }
        }
        if (!this.f2614f[1].isEmpty()) {
            this.f2614f[0].put(f2592k0[1].f2646b, d.f(0L, this.f2616h));
        }
        if (!this.f2614f[2].isEmpty()) {
            this.f2614f[0].put(f2592k0[2].f2646b, d.f(0L, this.f2616h));
        }
        if (!this.f2614f[3].isEmpty()) {
            this.f2614f[1].put(f2592k0[3].f2646b, d.f(0L, this.f2616h));
        }
        if (this.f2617i) {
            if (this.f2618j) {
                this.f2614f[4].put("StripOffsets", d.j(0, this.f2616h));
                this.f2614f[4].put("StripByteCounts", d.j(this.f2621m, this.f2616h));
            } else {
                this.f2614f[4].put("JPEGInterchangeFormat", d.f(0L, this.f2616h));
                this.f2614f[4].put("JPEGInterchangeFormatLength", d.f(this.f2621m, this.f2616h));
            }
        }
        for (int i7 = 0; i7 < f2591j0.length; i7++) {
            Iterator it = this.f2614f[i7].entrySet().iterator();
            int i8 = 0;
            while (it.hasNext()) {
                int p6 = ((d) ((Map.Entry) it.next()).getValue()).p();
                if (p6 > 4) {
                    i8 += p6;
                }
            }
            iArr2[i7] = iArr2[i7] + i8;
        }
        int i9 = 8;
        for (int i10 = 0; i10 < f2591j0.length; i10++) {
            if (!this.f2614f[i10].isEmpty()) {
                iArr[i10] = i9;
                i9 += (this.f2614f[i10].size() * 12) + 2 + 4 + iArr2[i10];
            }
        }
        if (this.f2617i) {
            if (this.f2618j) {
                this.f2614f[4].put("StripOffsets", d.j(i9, this.f2616h));
            } else {
                this.f2614f[4].put("JPEGInterchangeFormat", d.f(i9, this.f2616h));
            }
            this.f2620l = i9;
            i9 += this.f2621m;
        }
        if (this.f2612d == 4) {
            i9 += 8;
        }
        if (f2603v) {
            for (int i11 = 0; i11 < f2591j0.length; i11++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i11), Integer.valueOf(iArr[i11]), Integer.valueOf(this.f2614f[i11].size()), Integer.valueOf(iArr2[i11]), Integer.valueOf(i9)));
            }
        }
        if (!this.f2614f[1].isEmpty()) {
            this.f2614f[0].put(f2592k0[1].f2646b, d.f(iArr[1], this.f2616h));
        }
        if (!this.f2614f[2].isEmpty()) {
            this.f2614f[0].put(f2592k0[2].f2646b, d.f(iArr[2], this.f2616h));
        }
        if (!this.f2614f[3].isEmpty()) {
            this.f2614f[1].put(f2592k0[3].f2646b, d.f(iArr[3], this.f2616h));
        }
        int i12 = this.f2612d;
        if (i12 == 4) {
            cVar.H(i9);
            cVar.write(f2598q0);
        } else if (i12 == 13) {
            cVar.w(i9);
            cVar.write(I);
        } else if (i12 == 14) {
            cVar.write(N);
            cVar.w(i9);
        }
        cVar.D(this.f2616h == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.g(this.f2616h);
        cVar.H(42);
        cVar.G(8L);
        for (int i13 = 0; i13 < f2591j0.length; i13++) {
            if (!this.f2614f[i13].isEmpty()) {
                cVar.H(this.f2614f[i13].size());
                int size = iArr[i13] + 2 + (this.f2614f[i13].size() * 12) + 4;
                for (Map.Entry entry2 : this.f2614f[i13].entrySet()) {
                    int i14 = ((e) f2594m0[i13].get(entry2.getKey())).f2645a;
                    d dVar = (d) entry2.getValue();
                    int p7 = dVar.p();
                    cVar.H(i14);
                    cVar.H(dVar.f2641a);
                    cVar.w(dVar.f2642b);
                    if (p7 > 4) {
                        cVar.G(size);
                        size += p7;
                    } else {
                        cVar.write(dVar.f2644d);
                        if (p7 < 4) {
                            while (p7 < 4) {
                                cVar.q(0);
                                p7++;
                            }
                        }
                    }
                }
                if (i13 != 0 || this.f2614f[4].isEmpty()) {
                    cVar.G(0L);
                } else {
                    cVar.G(iArr[4]);
                }
                Iterator it2 = this.f2614f[i13].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = ((d) ((Map.Entry) it2.next()).getValue()).f2644d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f2617i) {
            cVar.write(q());
        }
        if (this.f2612d == 14 && i9 % 2 == 1) {
            cVar.q(0);
        }
        cVar.g(ByteOrder.BIG_ENDIAN);
        return i9;
    }

    private d f(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f2603v) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i6 = 0; i6 < f2591j0.length; i6++) {
            d dVar = (d) this.f2614f[i6].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    private void g(g gVar) {
        String str;
        String str2;
        String str3;
        if (Build.VERSION.SDK_INT < 28) {
            throw new UnsupportedOperationException("Reading EXIF from HEIF files is supported from SDK 28 and above");
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                b.C0045b.a(mediaMetadataRetriever, new C0044a(gVar));
                String extractMetadata = mediaMetadataRetriever.extractMetadata(33);
                String extractMetadata2 = mediaMetadataRetriever.extractMetadata(34);
                String extractMetadata3 = mediaMetadataRetriever.extractMetadata(26);
                String extractMetadata4 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(extractMetadata3)) {
                    str = mediaMetadataRetriever.extractMetadata(29);
                    str2 = mediaMetadataRetriever.extractMetadata(30);
                    str3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(extractMetadata4)) {
                    str = mediaMetadataRetriever.extractMetadata(18);
                    str2 = mediaMetadataRetriever.extractMetadata(19);
                    str3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (str != null) {
                    this.f2614f[0].put("ImageWidth", d.j(Integer.parseInt(str), this.f2616h));
                }
                if (str2 != null) {
                    this.f2614f[0].put("ImageLength", d.j(Integer.parseInt(str2), this.f2616h));
                }
                if (str3 != null) {
                    int parseInt = Integer.parseInt(str3);
                    this.f2614f[0].put("Orientation", d.j(parseInt != 90 ? parseInt != 180 ? parseInt != 270 ? 1 : 8 : 3 : 6, this.f2616h));
                }
                if (extractMetadata != null && extractMetadata2 != null) {
                    int parseInt2 = Integer.parseInt(extractMetadata);
                    int parseInt3 = Integer.parseInt(extractMetadata2);
                    if (parseInt3 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.G(parseInt2);
                    byte[] bArr = new byte[6];
                    if (gVar.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i6 = parseInt2 + 6;
                    int i7 = parseInt3 - 6;
                    if (!Arrays.equals(bArr, f2598q0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i7];
                    if (gVar.read(bArr2) != i7) {
                        throw new IOException("Can't read exif");
                    }
                    this.f2624p = i6;
                    M(bArr2, 0);
                }
                if (f2603v) {
                    Log.d("ExifInterface", "Heif meta: " + str + "x" + str2 + ", rotation " + str3);
                }
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x019a, code lost:
    
        r22.w(r21.f2616h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x019f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0184 A[LOOP:0: B:9:0x0038->B:33:0x0184, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h(androidx.exifinterface.media.a.b r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.h(androidx.exifinterface.media.a$b, int, int):void");
    }

    private int i(BufferedInputStream bufferedInputStream) {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (y(bArr)) {
            return 4;
        }
        if (B(bArr)) {
            return 9;
        }
        if (x(bArr)) {
            return 12;
        }
        if (z(bArr)) {
            return 7;
        }
        if (C(bArr)) {
            return 10;
        }
        if (A(bArr)) {
            return 13;
        }
        return H(bArr) ? 14 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void j(androidx.exifinterface.media.a.g r6) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.j(androidx.exifinterface.media.a$g):void");
    }

    private void k(b bVar) {
        if (f2603v) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.w(ByteOrder.BIG_ENDIAN);
        byte[] bArr = H;
        bVar.D(bArr.length);
        int length = bArr.length + 0;
        while (true) {
            try {
                int readInt = bVar.readInt();
                int i6 = length + 4;
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i7 = i6 + 4;
                if (i7 == 16 && !Arrays.equals(bArr2, J)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, K)) {
                    return;
                }
                if (Arrays.equals(bArr2, I)) {
                    byte[] bArr3 = new byte[readInt];
                    if (bVar.read(bArr3) != readInt) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                    int readInt2 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == readInt2) {
                        this.f2624p = i7;
                        M(bArr3, 0);
                        b0();
                        X(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + readInt2 + ", calculated CRC value: " + crc32.getValue());
                }
                int i8 = readInt + 4;
                bVar.D(i8);
                length = i7 + i8;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    private void l(b bVar) {
        boolean z5 = f2603v;
        if (z5) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.D(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i6 = ByteBuffer.wrap(bArr).getInt();
        int i7 = ByteBuffer.wrap(bArr2).getInt();
        int i8 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i7];
        bVar.D(i6 - bVar.g());
        bVar.read(bArr4);
        h(new b(bArr4), i6, 5);
        bVar.D(i8 - bVar.g());
        bVar.w(ByteOrder.BIG_ENDIAN);
        int readInt = bVar.readInt();
        if (z5) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + readInt);
        }
        for (int i9 = 0; i9 < readInt; i9++) {
            int readUnsignedShort = bVar.readUnsignedShort();
            int readUnsignedShort2 = bVar.readUnsignedShort();
            if (readUnsignedShort == f2586e0.f2645a) {
                short readShort = bVar.readShort();
                short readShort2 = bVar.readShort();
                d j6 = d.j(readShort, this.f2616h);
                d j7 = d.j(readShort2, this.f2616h);
                this.f2614f[0].put("ImageLength", j6);
                this.f2614f[0].put("ImageWidth", j7);
                if (f2603v) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) readShort) + ", width: " + ((int) readShort2));
                    return;
                }
                return;
            }
            bVar.D(readUnsignedShort2);
        }
    }

    private void m(g gVar) {
        d dVar;
        J(gVar);
        N(gVar, 0);
        a0(gVar, 0);
        a0(gVar, 5);
        a0(gVar, 4);
        b0();
        if (this.f2612d != 8 || (dVar = (d) this.f2614f[1].get("MakerNote")) == null) {
            return;
        }
        g gVar2 = new g(dVar.f2644d);
        gVar2.w(this.f2616h);
        gVar2.D(6);
        N(gVar2, 9);
        d dVar2 = (d) this.f2614f[9].get("ColorSpace");
        if (dVar2 != null) {
            this.f2614f[1].put("ColorSpace", dVar2);
        }
    }

    private void n(g gVar) {
        if (f2603v) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        m(gVar);
        d dVar = (d) this.f2614f[0].get("JpgFromRaw");
        if (dVar != null) {
            h(new b(dVar.f2644d), (int) dVar.f2643c, 5);
        }
        d dVar2 = (d) this.f2614f[0].get("ISO");
        d dVar3 = (d) this.f2614f[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        this.f2614f[1].put("PhotographicSensitivity", dVar2);
    }

    private void o(g gVar) {
        byte[] bArr = f2598q0;
        gVar.D(bArr.length);
        byte[] bArr2 = new byte[gVar.available()];
        gVar.readFully(bArr2);
        this.f2624p = bArr.length;
        M(bArr2, 0);
    }

    private void r(b bVar) {
        if (f2603v) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.w(ByteOrder.LITTLE_ENDIAN);
        bVar.D(L.length);
        int readInt = bVar.readInt() + 8;
        byte[] bArr = M;
        bVar.D(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int readInt2 = bVar.readInt();
                int i6 = length + 4 + 4;
                if (Arrays.equals(N, bArr2)) {
                    byte[] bArr3 = new byte[readInt2];
                    if (bVar.read(bArr3) == readInt2) {
                        this.f2624p = i6;
                        M(bArr3, 0);
                        X(new b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + androidx.exifinterface.media.b.a(bArr2));
                    }
                }
                if (readInt2 % 2 == 1) {
                    readInt2++;
                }
                length = i6 + readInt2;
                if (length == readInt) {
                    return;
                }
                if (length > readInt) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                bVar.D(readInt2);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    private static Pair s(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair s5 = s(split[0]);
            if (((Integer) s5.first).intValue() == 2) {
                return s5;
            }
            for (int i6 = 1; i6 < split.length; i6++) {
                Pair s6 = s(split[i6]);
                int intValue = (((Integer) s6.first).equals(s5.first) || ((Integer) s6.second).equals(s5.first)) ? ((Integer) s5.first).intValue() : -1;
                int intValue2 = (((Integer) s5.second).intValue() == -1 || !(((Integer) s6.first).equals(s5.second) || ((Integer) s6.second).equals(s5.second))) ? -1 : ((Integer) s5.second).intValue();
                if (intValue == -1 && intValue2 == -1) {
                    return new Pair(2, -1);
                }
                if (intValue == -1) {
                    s5 = new Pair(Integer.valueOf(intValue2), -1);
                } else if (intValue2 == -1) {
                    s5 = new Pair(Integer.valueOf(intValue), -1);
                }
            }
            return s5;
        }
        if (!str.contains("/")) {
            try {
                try {
                    Long valueOf = Long.valueOf(Long.parseLong(str));
                    return (valueOf.longValue() < 0 || valueOf.longValue() > 65535) ? valueOf.longValue() < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair(12, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    private void t(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("JPEGInterchangeFormat");
        d dVar2 = (d) hashMap.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int m6 = dVar.m(this.f2616h);
        int m7 = dVar2.m(this.f2616h);
        if (this.f2612d == 7) {
            m6 += this.f2625q;
        }
        if (m6 > 0 && m7 > 0) {
            this.f2617i = true;
            if (this.f2609a == null && this.f2611c == null && this.f2610b == null) {
                byte[] bArr = new byte[m7];
                bVar.skip(m6);
                bVar.read(bArr);
                this.f2622n = bArr;
            }
            this.f2620l = m6;
            this.f2621m = m7;
        }
        if (f2603v) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + m6 + ", length: " + m7);
        }
    }

    private void u(b bVar, HashMap hashMap) {
        d dVar = (d) hashMap.get("StripOffsets");
        d dVar2 = (d) hashMap.get("StripByteCounts");
        if (dVar == null || dVar2 == null) {
            return;
        }
        long[] d6 = androidx.exifinterface.media.b.d(dVar.o(this.f2616h));
        long[] d7 = androidx.exifinterface.media.b.d(dVar2.o(this.f2616h));
        if (d6 == null || d6.length == 0) {
            Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
            return;
        }
        if (d7 == null || d7.length == 0) {
            Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
            return;
        }
        if (d6.length != d7.length) {
            Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
            return;
        }
        long j6 = 0;
        for (long j7 : d7) {
            j6 += j7;
        }
        int i6 = (int) j6;
        byte[] bArr = new byte[i6];
        int i7 = 1;
        this.f2619k = true;
        this.f2618j = true;
        this.f2617i = true;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < d6.length) {
            int i11 = (int) d6[i8];
            int i12 = (int) d7[i8];
            if (i8 < d6.length - i7 && i11 + i12 != d6[i8 + 1]) {
                this.f2619k = false;
            }
            int i13 = i11 - i9;
            if (i13 < 0) {
                Log.d("ExifInterface", "Invalid strip offset value");
                return;
            }
            long j8 = i13;
            if (bVar.skip(j8) != j8) {
                Log.d("ExifInterface", "Failed to skip " + i13 + " bytes.");
                return;
            }
            int i14 = i9 + i13;
            byte[] bArr2 = new byte[i12];
            if (bVar.read(bArr2) != i12) {
                Log.d("ExifInterface", "Failed to read " + i12 + " bytes.");
                return;
            }
            i9 = i14 + i12;
            System.arraycopy(bArr2, 0, bArr, i10, i12);
            i10 += i12;
            i8++;
            i7 = 1;
        }
        this.f2622n = bArr;
        if (this.f2619k) {
            this.f2620l = (int) d6[0];
            this.f2621m = i6;
        }
    }

    private void v(String str) {
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f2611c = null;
        this.f2609a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (D(fileInputStream2.getFD())) {
                    this.f2610b = fileInputStream2.getFD();
                } else {
                    this.f2610b = null;
                }
                I(fileInputStream2);
                androidx.exifinterface.media.b.c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                androidx.exifinterface.media.b.c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean w(BufferedInputStream bufferedInputStream) {
        byte[] bArr = f2598q0;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i6 = 0;
        while (true) {
            byte[] bArr3 = f2598q0;
            if (i6 >= bArr3.length) {
                return true;
            }
            if (bArr2[i6] != bArr3[i6]) {
                return false;
            }
            i6++;
        }
    }

    private boolean x(byte[] bArr) {
        b bVar;
        long readInt;
        byte[] bArr2;
        long j6;
        b bVar2 = null;
        try {
            try {
                bVar = new b(bArr);
            } catch (Exception e6) {
                e = e6;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            readInt = bVar.readInt();
            bArr2 = new byte[4];
            bVar.read(bArr2);
        } catch (Exception e7) {
            e = e7;
            bVar2 = bVar;
            if (f2603v) {
                Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
            }
            if (bVar2 != null) {
                bVar2.close();
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
        if (!Arrays.equals(bArr2, C)) {
            bVar.close();
            return false;
        }
        if (readInt == 1) {
            readInt = bVar.readLong();
            j6 = 16;
            if (readInt < 16) {
                bVar.close();
                return false;
            }
        } else {
            j6 = 8;
        }
        if (readInt > bArr.length) {
            readInt = bArr.length;
        }
        long j7 = readInt - j6;
        if (j7 < 8) {
            bVar.close();
            return false;
        }
        byte[] bArr3 = new byte[4];
        boolean z5 = false;
        boolean z6 = false;
        for (long j8 = 0; j8 < j7 / 4; j8++) {
            if (bVar.read(bArr3) != 4) {
                bVar.close();
                return false;
            }
            if (j8 != 1) {
                if (Arrays.equals(bArr3, D)) {
                    z5 = true;
                } else if (Arrays.equals(bArr3, E)) {
                    z6 = true;
                }
                if (z5 && z6) {
                    bVar.close();
                    return true;
                }
            }
        }
        bVar.close();
        return false;
    }

    private static boolean y(byte[] bArr) {
        int i6 = 0;
        while (true) {
            byte[] bArr2 = B;
            if (i6 >= bArr2.length) {
                return true;
            }
            if (bArr[i6] != bArr2[i6]) {
                return false;
            }
            i6++;
        }
    }

    private boolean z(byte[] bArr) {
        b bVar = null;
        try {
            b bVar2 = new b(bArr);
            try {
                ByteOrder L2 = L(bVar2);
                this.f2616h = L2;
                bVar2.w(L2);
                short readShort = bVar2.readShort();
                boolean z5 = readShort == 20306 || readShort == 21330;
                bVar2.close();
                return z5;
            } catch (Exception unused) {
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                bVar = bVar2;
                if (bVar != null) {
                    bVar.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public void Q() {
        W("Orientation", Integer.toString(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[Catch: all -> 0x010c, Exception -> 0x010f, TryCatch #20 {Exception -> 0x010f, all -> 0x010c, blocks: (B:57:0x00e0, B:59:0x00e4, B:60:0x00fa, B:64:0x00f3), top: B:56:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f3 A[Catch: all -> 0x010c, Exception -> 0x010f, TryCatch #20 {Exception -> 0x010f, all -> 0x010c, blocks: (B:57:0x00e0, B:59:0x00e4, B:60:0x00fa, B:64:0x00f3), top: B:56:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S() {
        /*
            Method dump skipped, instructions count: 371
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.S():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:58:0x01f1. Please report as an issue. */
    public void W(String str, String str2) {
        StringBuilder sb;
        e eVar;
        int i6;
        HashMap hashMap;
        d a6;
        HashMap hashMap2;
        d c6;
        String str3 = str;
        String str4 = str2;
        if (str3 == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && str4 != null) {
            boolean find = f2602u0.matcher(str4).find();
            boolean find2 = f2604v0.matcher(str4).find();
            if (str2.length() != 19 || (!find && !find2)) {
                sb = new StringBuilder();
                sb.append("Invalid value for ");
                sb.append(str3);
                sb.append(" : ");
                sb.append(str4);
                Log.w("ExifInterface", sb.toString());
                return;
            }
            if (find2) {
                str4 = str4.replaceAll("-", ":");
            }
        }
        if ("ISOSpeedRatings".equals(str3)) {
            if (f2603v) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i7 = 2;
        int i8 = 1;
        if (str4 != null && f2595n0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f2601t0.matcher(str4);
                if (!matcher.find()) {
                    sb = new StringBuilder();
                    sb.append("Invalid value for ");
                    sb.append(str3);
                    sb.append(" : ");
                    sb.append(str4);
                    Log.w("ExifInterface", sb.toString());
                    return;
                }
                str4 = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    str4 = new f(Double.parseDouble(str4)).toString();
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                }
            }
        }
        char c7 = 0;
        int i9 = 0;
        while (i9 < f2591j0.length) {
            if ((i9 != 4 || this.f2617i) && (eVar = (e) f2594m0[i9].get(str3)) != null) {
                if (str4 == null) {
                    this.f2614f[i9].remove(str3);
                } else {
                    Pair s5 = s(str4);
                    int i10 = -1;
                    if (eVar.f2647c == ((Integer) s5.first).intValue() || eVar.f2647c == ((Integer) s5.second).intValue()) {
                        i6 = eVar.f2647c;
                    } else {
                        int i11 = eVar.f2648d;
                        if (i11 == -1 || !(i11 == ((Integer) s5.first).intValue() || eVar.f2648d == ((Integer) s5.second).intValue())) {
                            int i12 = eVar.f2647c;
                            if (i12 == i8 || i12 == 7 || i12 == i7) {
                                i6 = i12;
                            } else if (f2603v) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Given tag (");
                                sb2.append(str3);
                                sb2.append(") value didn't match with one of expected formats: ");
                                String[] strArr = W;
                                sb2.append(strArr[eVar.f2647c]);
                                sb2.append(eVar.f2648d == -1 ? "" : ", " + strArr[eVar.f2648d]);
                                sb2.append(" (guess: ");
                                sb2.append(strArr[((Integer) s5.first).intValue()]);
                                sb2.append(((Integer) s5.second).intValue() != -1 ? ", " + strArr[((Integer) s5.second).intValue()] : "");
                                sb2.append(")");
                                Log.d("ExifInterface", sb2.toString());
                            }
                        } else {
                            i6 = eVar.f2648d;
                        }
                    }
                    switch (i6) {
                        case 1:
                            hashMap = this.f2614f[i9];
                            a6 = d.a(str4);
                            hashMap.put(str3, a6);
                            break;
                        case 2:
                        case 7:
                            hashMap = this.f2614f[i9];
                            a6 = d.e(str4);
                            hashMap.put(str3, a6);
                            break;
                        case 3:
                            String[] split = str4.split(",", -1);
                            int[] iArr = new int[split.length];
                            for (int i13 = 0; i13 < split.length; i13++) {
                                iArr[i13] = Integer.parseInt(split[i13]);
                            }
                            hashMap = this.f2614f[i9];
                            a6 = d.k(iArr, this.f2616h);
                            hashMap.put(str3, a6);
                            break;
                        case 4:
                            String[] split2 = str4.split(",", -1);
                            long[] jArr = new long[split2.length];
                            for (int i14 = 0; i14 < split2.length; i14++) {
                                jArr[i14] = Long.parseLong(split2[i14]);
                            }
                            hashMap = this.f2614f[i9];
                            a6 = d.g(jArr, this.f2616h);
                            hashMap.put(str3, a6);
                            break;
                        case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                            String[] split3 = str4.split(",", -1);
                            f[] fVarArr = new f[split3.length];
                            int i15 = 0;
                            while (i15 < split3.length) {
                                String[] split4 = split3[i15].split("/", i10);
                                fVarArr[i15] = new f((long) Double.parseDouble(split4[0]), (long) Double.parseDouble(split4[1]));
                                i15++;
                                i10 = -1;
                            }
                            hashMap = this.f2614f[i9];
                            a6 = d.i(fVarArr, this.f2616h);
                            hashMap.put(str3, a6);
                            break;
                        case 6:
                        case 8:
                        case 11:
                        default:
                            if (f2603v) {
                                Log.d("ExifInterface", "Data format isn't one of expected formats: " + i6);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            String[] split5 = str4.split(",", -1);
                            int[] iArr2 = new int[split5.length];
                            for (int i16 = 0; i16 < split5.length; i16++) {
                                iArr2[i16] = Integer.parseInt(split5[i16]);
                            }
                            hashMap2 = this.f2614f[i9];
                            c6 = d.c(iArr2, this.f2616h);
                            hashMap2.put(str3, c6);
                            break;
                        case 10:
                            String[] split6 = str4.split(",", -1);
                            f[] fVarArr2 = new f[split6.length];
                            int i17 = 0;
                            while (i17 < split6.length) {
                                String[] split7 = split6[i17].split("/", -1);
                                fVarArr2[i17] = new f((long) Double.parseDouble(split7[c7]), (long) Double.parseDouble(split7[i8]));
                                i17++;
                                split6 = split6;
                                c7 = 0;
                                i8 = 1;
                            }
                            hashMap2 = this.f2614f[i9];
                            c6 = d.d(fVarArr2, this.f2616h);
                            hashMap2.put(str3, c6);
                            break;
                        case 12:
                            String[] split8 = str4.split(",", -1);
                            double[] dArr = new double[split8.length];
                            for (int i18 = 0; i18 < split8.length; i18++) {
                                dArr[i18] = Double.parseDouble(split8[i18]);
                            }
                            this.f2614f[i9].put(str3, d.b(dArr, this.f2616h));
                            break;
                    }
                    i9++;
                    i7 = 2;
                    c7 = 0;
                    i8 = 1;
                }
            }
            i9++;
            i7 = 2;
            c7 = 0;
            i8 = 1;
        }
    }

    public String d(String str) {
        String str2;
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d f6 = f(str);
        if (f6 != null) {
            if (!f2595n0.contains(str)) {
                return f6.n(this.f2616h);
            }
            if (str.equals("GPSTimeStamp")) {
                int i6 = f6.f2641a;
                if (i6 == 5 || i6 == 10) {
                    f[] fVarArr = (f[]) f6.o(this.f2616h);
                    if (fVarArr != null && fVarArr.length == 3) {
                        f fVar = fVarArr[0];
                        f fVar2 = fVarArr[1];
                        f fVar3 = fVarArr[2];
                        return String.format("%02d:%02d:%02d", Integer.valueOf((int) (((float) fVar.f2649a) / ((float) fVar.f2650b))), Integer.valueOf((int) (((float) fVar2.f2649a) / ((float) fVar2.f2650b))), Integer.valueOf((int) (((float) fVar3.f2649a) / ((float) fVar3.f2650b))));
                    }
                    str2 = "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr);
                } else {
                    str2 = "GPS Timestamp format is not rational. format=" + f6.f2641a;
                }
                Log.w("ExifInterface", str2);
                return null;
            }
            try {
                return Double.toString(f6.l(this.f2616h));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public int e(String str, int i6) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d f6 = f(str);
        if (f6 == null) {
            return i6;
        }
        try {
            return f6.m(this.f2616h);
        } catch (NumberFormatException unused) {
            return i6;
        }
    }

    public byte[] p() {
        int i6 = this.f2623o;
        if (i6 == 6 || i6 == 7) {
            return q();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065 A[Catch: Exception -> 0x0088, all -> 0x00a7, TRY_ENTER, TryCatch #3 {all -> 0x00a7, blocks: (B:17:0x004f, B:20:0x0065, B:22:0x0071, B:27:0x007c, B:28:0x0081, B:29:0x0082, B:30:0x0087, B:32:0x0099), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082 A[Catch: Exception -> 0x0088, all -> 0x00a7, TryCatch #3 {all -> 0x00a7, blocks: (B:17:0x004f, B:20:0x0065, B:22:0x0071, B:27:0x007c, B:28:0x0081, B:29:0x0082, B:30:0x0087, B:32:0x0099), top: B:6:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [android.content.res.AssetManager$AssetInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.Closeable, java.io.InputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] q() {
        /*
            r11 = this;
            java.lang.String r0 = "ExifInterface"
            boolean r1 = r11.f2617i
            r2 = 0
            if (r1 != 0) goto L8
            return r2
        L8:
            byte[] r1 = r11.f2622n
            if (r1 == 0) goto Ld
            return r1
        Ld:
            android.content.res.AssetManager$AssetInputStream r1 = r11.f2611c     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r1 == 0) goto L2e
            boolean r3 = r1.markSupported()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            if (r3 == 0) goto L1c
            r1.reset()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
        L1a:
            r3 = r2
            goto L4f
        L1c:
            java.lang.String r3 = "Cannot read thumbnail from inputstream without mark/reset support"
            android.util.Log.d(r0, r3)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L29
            androidx.exifinterface.media.b.c(r1)
            return r2
        L25:
            r0 = move-exception
            r3 = r2
            goto La8
        L29:
            r3 = move-exception
            r4 = r3
            r3 = r2
            goto L99
        L2e:
            java.lang.String r1 = r11.f2609a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r1 == 0) goto L3a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r3 = r11.f2609a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            goto L1a
        L3a:
            java.io.FileDescriptor r1 = r11.f2610b     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.io.FileDescriptor r1 = androidx.exifinterface.media.b.a.b(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            int r3 = android.system.OsConstants.SEEK_SET     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r4 = 0
            androidx.exifinterface.media.b.a.c(r1, r4, r3)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L8a java.lang.Exception -> L8d
            r10 = r3
            r3 = r1
            r1 = r10
        L4f:
            int r4 = r11.f2620l     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r5 = r11.f2624p     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r4 = r4 + r5
            long r4 = (long) r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            long r4 = r1.skip(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r11.f2620l     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r7 = r11.f2624p     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r6 + r7
            long r6 = (long) r6
            java.lang.String r8 = "Corrupted image"
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 != 0) goto L82
            int r4 = r11.f2621m     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            byte[] r4 = new byte[r4]     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r5 = r1.read(r4)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            int r6 = r11.f2621m     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            if (r5 != r6) goto L7c
            r11.f2622n = r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            androidx.exifinterface.media.b.c(r1)
            if (r3 == 0) goto L7b
            androidx.exifinterface.media.b.b(r3)
        L7b:
            return r4
        L7c:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            r4.<init>(r8)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            throw r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
        L82:
            java.io.IOException r4 = new java.io.IOException     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            r4.<init>(r8)     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
            throw r4     // Catch: java.lang.Exception -> L88 java.lang.Throwable -> La7
        L88:
            r4 = move-exception
            goto L99
        L8a:
            r0 = move-exception
            r3 = r1
            goto La9
        L8d:
            r3 = move-exception
            r4 = r3
            r3 = r1
            r1 = r2
            goto L99
        L92:
            r0 = move-exception
            r3 = r2
            goto La9
        L95:
            r3 = move-exception
            r1 = r2
            r4 = r3
            r3 = r1
        L99:
            java.lang.String r5 = "Encountered exception while getting thumbnail"
            android.util.Log.d(r0, r5, r4)     // Catch: java.lang.Throwable -> La7
            androidx.exifinterface.media.b.c(r1)
            if (r3 == 0) goto La6
            androidx.exifinterface.media.b.b(r3)
        La6:
            return r2
        La7:
            r0 = move-exception
        La8:
            r2 = r1
        La9:
            androidx.exifinterface.media.b.c(r2)
            if (r3 == 0) goto Lb1
            androidx.exifinterface.media.b.b(r3)
        Lb1:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.exifinterface.media.a.q():byte[]");
    }

    public a(InputStream inputStream, int i6) {
        e[][] eVarArr = f2591j0;
        this.f2614f = new HashMap[eVarArr.length];
        this.f2615g = new HashSet(eVarArr.length);
        this.f2616h = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            throw new NullPointerException("inputStream cannot be null");
        }
        this.f2609a = null;
        if (i6 == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, f2598q0.length);
            if (!w(bufferedInputStream)) {
                Log.w("ExifInterface", "Given data does not follow the structure of an Exif-only data.");
                return;
            }
            this.f2613e = true;
            this.f2611c = null;
            this.f2610b = null;
            inputStream = bufferedInputStream;
        } else {
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f2611c = (AssetManager.AssetInputStream) inputStream;
            } else {
                if (inputStream instanceof FileInputStream) {
                    FileInputStream fileInputStream = (FileInputStream) inputStream;
                    if (D(fileInputStream.getFD())) {
                        this.f2611c = null;
                        this.f2610b = fileInputStream.getFD();
                    }
                }
                this.f2611c = null;
            }
            this.f2610b = null;
        }
        I(inputStream);
    }

    public a(String str) {
        e[][] eVarArr = f2591j0;
        this.f2614f = new HashMap[eVarArr.length];
        this.f2615g = new HashSet(eVarArr.length);
        this.f2616h = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        v(str);
    }
}
