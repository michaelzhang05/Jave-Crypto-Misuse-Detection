package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.SocketException;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.SSLSocketFactory;

@zzard
/* loaded from: classes2.dex */
final class m9 implements zzrv {
    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<byte[]> f11799b = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private final int f11801d;

    /* renamed from: e, reason: collision with root package name */
    private final int f11802e;

    /* renamed from: f, reason: collision with root package name */
    private final String f11803f;

    /* renamed from: h, reason: collision with root package name */
    private final zzsj<? super m9> f11805h;

    /* renamed from: i, reason: collision with root package name */
    private zzry f11806i;

    /* renamed from: j, reason: collision with root package name */
    private HttpURLConnection f11807j;

    /* renamed from: k, reason: collision with root package name */
    private InputStream f11808k;
    private boolean l;
    private long m;
    private long n;
    private long o;
    private long p;
    private int q;

    /* renamed from: c, reason: collision with root package name */
    private SSLSocketFactory f11800c = new n9(this);
    private Set<Socket> r = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private final zzsd f11804g = new zzsd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public m9(String str, zzsj<? super m9> zzsjVar, int i2, int i3, int i4) {
        this.f11803f = zzsk.c(str);
        this.f11805h = zzsjVar;
        this.f11801d = i2;
        this.f11802e = i3;
        this.q = i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Socket socket) {
        this.r.add(socket);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long f(java.net.HttpURLConnection r9) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r9.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            if (r1 != 0) goto L34
            long r3 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L13
            goto L36
        L13:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r3.append(r1)
            r3.append(r0)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            com.google.android.gms.internal.ads.zzbad.g(r1)
        L34:
            r3 = -1
        L36:
            java.lang.String r1 = "Content-Range"
            java.lang.String r9 = r9.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto Lc9
            java.util.regex.Pattern r1 = com.google.android.gms.internal.ads.m9.a
            java.util.regex.Matcher r1 = r1.matcher(r9)
            boolean r5 = r1.find()
            if (r5 == 0) goto Lc9
            r5 = 2
            java.lang.String r5 = r1.group(r5)     // Catch: java.lang.NumberFormatException -> La8
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> La8
            r7 = 1
            java.lang.String r1 = r1.group(r7)     // Catch: java.lang.NumberFormatException -> La8
            long r7 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> La8
            long r5 = r5 - r7
            r7 = 1
            long r5 = r5 + r7
            r7 = 0
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 >= 0) goto L6c
            r3 = r5
            goto Lc9
        L6c:
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto Lc9
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.NumberFormatException -> La8
            int r1 = r1.length()     // Catch: java.lang.NumberFormatException -> La8
            int r1 = r1 + 26
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch: java.lang.NumberFormatException -> La8
            int r7 = r7.length()     // Catch: java.lang.NumberFormatException -> La8
            int r1 = r1 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> La8
            r7.<init>(r1)     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r1 = "Inconsistent headers ["
            r7.append(r1)     // Catch: java.lang.NumberFormatException -> La8
            r7.append(r0)     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r0 = "] ["
            r7.append(r0)     // Catch: java.lang.NumberFormatException -> La8
            r7.append(r9)     // Catch: java.lang.NumberFormatException -> La8
            r7.append(r2)     // Catch: java.lang.NumberFormatException -> La8
            java.lang.String r0 = r7.toString()     // Catch: java.lang.NumberFormatException -> La8
            com.google.android.gms.internal.ads.zzbad.i(r0)     // Catch: java.lang.NumberFormatException -> La8
            long r0 = java.lang.Math.max(r3, r5)     // Catch: java.lang.NumberFormatException -> La8
            r3 = r0
            goto Lc9
        La8:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r9)
            r1.append(r2)
            java.lang.String r9 = r1.toString()
            com.google.android.gms.internal.ads.zzbad.g(r9)
        Lc9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m9.f(java.net.HttpURLConnection):long");
    }

    private final void g() {
        HttpURLConnection httpURLConnection = this.f11807j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                zzbad.c("Unexpected error while disconnecting", e2);
            }
            this.f11807j = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0127, code lost:
    
        r23.f11807j = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0129, code lost:
    
        r0 = r14.getResponseCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012f, code lost:
    
        if (r0 < 200) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0133, code lost:
    
        if (r0 <= 299) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0136, code lost:
    
        if (r0 != 200) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0138, code lost:
    
        r3 = r24.f15509d;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013e, code lost:
    
        if (r3 == 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0140, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0145, code lost:
    
        r23.m = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014c, code lost:
    
        if (r24.a(1) != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014e, code lost:
    
        r3 = r24.f15510e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0154, code lost:
    
        if (r3 == (-1)) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0156, code lost:
    
        r23.n = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0170, code lost:
    
        r23.f11808k = r23.f11807j.getInputStream();
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0178, code lost:
    
        r23.l = true;
        r0 = r23.f11805h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x017d, code lost:
    
        if (r0 == null) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x017f, code lost:
    
        r0.n(r23, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0184, code lost:
    
        return r23.n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0185, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0186, code lost:
    
        g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018f, code lost:
    
        throw new com.google.android.gms.internal.ads.zzsb(r0, r24, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0159, code lost:
    
        r3 = f(r23.f11807j);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0161, code lost:
    
        if (r3 == (-1)) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0163, code lost:
    
        r4 = r3 - r23.m;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0169, code lost:
    
        r23.n = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0168, code lost:
    
        r4 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016c, code lost:
    
        r23.n = r24.f15510e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0144, code lost:
    
        r4 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0142, code lost:
    
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0190, code lost:
    
        r3 = r23.f11807j.getHeaderFields();
        g();
        r4 = new com.google.android.gms.internal.ads.zzsc(r0, r3, r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01a0, code lost:
    
        if (r0 != 416) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01a2, code lost:
    
        r4.initCause(new com.google.android.gms.internal.ads.zzrx(0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ab, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        throw r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01ac, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ad, code lost:
    
        g();
        r5 = java.lang.String.valueOf(r24.a.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01c1, code lost:
    
        if (r5.length() != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01c3, code lost:
    
        r3 = "Unable to connect to ".concat(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01d2, code lost:
    
        throw new com.google.android.gms.internal.ads.zzsb(r3, r0, r24, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01c8, code lost:
    
        r3 = new java.lang.String("Unable to connect to ");
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0220 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5 A[Catch: IOException -> 0x0241, TryCatch #1 {IOException -> 0x0241, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:20:0x00cc, B:22:0x00d5, B:23:0x00dc, B:26:0x00e5, B:28:0x00ea, B:30:0x00f2, B:31:0x0107, B:46:0x0127, B:97:0x01d7, B:99:0x01e2, B:101:0x01f3, B:104:0x01fb, B:106:0x0209, B:107:0x0213, B:108:0x0216, B:109:0x020e, B:114:0x0220, B:115:0x0227, B:116:0x0104, B:118:0x0085, B:120:0x00a1, B:121:0x00c7, B:124:0x0228, B:125:0x0240), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ea A[Catch: IOException -> 0x0241, TryCatch #1 {IOException -> 0x0241, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:20:0x00cc, B:22:0x00d5, B:23:0x00dc, B:26:0x00e5, B:28:0x00ea, B:30:0x00f2, B:31:0x0107, B:46:0x0127, B:97:0x01d7, B:99:0x01e2, B:101:0x01f3, B:104:0x01fb, B:106:0x0209, B:107:0x0213, B:108:0x0216, B:109:0x020e, B:114:0x0220, B:115:0x0227, B:116:0x0104, B:118:0x0085, B:120:0x00a1, B:121:0x00c7, B:124:0x0228, B:125:0x0240), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01e2 A[Catch: IOException -> 0x0241, TryCatch #1 {IOException -> 0x0241, blocks: (B:3:0x000f, B:4:0x0025, B:6:0x002b, B:8:0x0035, B:9:0x003d, B:10:0x0055, B:12:0x005b, B:20:0x00cc, B:22:0x00d5, B:23:0x00dc, B:26:0x00e5, B:28:0x00ea, B:30:0x00f2, B:31:0x0107, B:46:0x0127, B:97:0x01d7, B:99:0x01e2, B:101:0x01f3, B:104:0x01fb, B:106:0x0209, B:107:0x0213, B:108:0x0216, B:109:0x020e, B:114:0x0220, B:115:0x0227, B:116:0x0104, B:118:0x0085, B:120:0x00a1, B:121:0x00c7, B:124:0x0228, B:125:0x0240), top: B:2:0x000f }] */
    @Override // com.google.android.gms.internal.ads.zzrv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.zzry r24) throws com.google.android.gms.internal.ads.zzsb {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m9.a(com.google.android.gms.internal.ads.zzry):long");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i2) {
        this.q = i2;
        for (Socket socket : this.r) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.q);
                } catch (SocketException e2) {
                    zzbad.d("Failed to update receive buffer size.", e2);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0032, code lost:
    
        if (r3 > 2048) goto L21;
     */
    @Override // com.google.android.gms.internal.ads.zzrv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.google.android.gms.internal.ads.zzsb {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r9.f11808k     // Catch: java.lang.Throwable -> L8d
            if (r2 == 0) goto L75
            java.net.HttpURLConnection r2 = r9.f11807j     // Catch: java.lang.Throwable -> L8d
            long r3 = r9.n     // Catch: java.lang.Throwable -> L8d
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.p     // Catch: java.lang.Throwable -> L8d
            long r3 = r3 - r7
        L14:
            int r7 = com.google.android.gms.internal.ads.zzsy.a     // Catch: java.lang.Throwable -> L8d
            r8 = 19
            if (r7 == r8) goto L1e
            r8 = 20
            if (r7 != r8) goto L65
        L1e:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2e
            int r3 = r2.read()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            r4 = -1
            if (r3 != r4) goto L34
            goto L65
        L2e:
            r5 = 2048(0x800, double:1.012E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L65
        L34:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            if (r4 != 0) goto L4c
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            if (r3 == 0) goto L65
        L4c:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L8d
        L65:
            java.io.InputStream r2 = r9.f11808k     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L8d
            r2.close()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L8d
            goto L75
        L6b:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzsb r3 = new com.google.android.gms.internal.ads.zzsb     // Catch: java.lang.Throwable -> L8d
            com.google.android.gms.internal.ads.zzry r4 = r9.f11806i     // Catch: java.lang.Throwable -> L8d
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L8d
            throw r3     // Catch: java.lang.Throwable -> L8d
        L75:
            r9.f11808k = r0
            r9.g()
            boolean r0 = r9.l
            if (r0 == 0) goto L87
            r9.l = r1
            com.google.android.gms.internal.ads.zzsj<? super com.google.android.gms.internal.ads.m9> r0 = r9.f11805h
            if (r0 == 0) goto L87
            r0.d(r9)
        L87:
            java.util.Set<java.net.Socket> r0 = r9.r
            r0.clear()
            return
        L8d:
            r2 = move-exception
            r9.f11808k = r0
            r9.g()
            boolean r0 = r9.l
            if (r0 == 0) goto La0
            r9.l = r1
            com.google.android.gms.internal.ads.zzsj<? super com.google.android.gms.internal.ads.m9> r0 = r9.f11805h
            if (r0 == 0) goto La0
            r0.d(r9)
        La0:
            java.util.Set<java.net.Socket> r0 = r9.r
            r0.clear()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.m9.close():void");
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final Uri n0() {
        HttpURLConnection httpURLConnection = this.f11807j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final int read(byte[] bArr, int i2, int i3) throws zzsb {
        try {
            if (this.o != this.m) {
                byte[] andSet = f11799b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT];
                }
                while (true) {
                    long j2 = this.o;
                    long j3 = this.m;
                    if (j2 != j3) {
                        int read = this.f11808k.read(andSet, 0, (int) Math.min(j3 - j2, andSet.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.o += read;
                            zzsj<? super m9> zzsjVar = this.f11805h;
                            if (zzsjVar != null) {
                                zzsjVar.o(this, read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        f11799b.set(andSet);
                        break;
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j4 = this.n;
            if (j4 != -1) {
                long j5 = j4 - this.p;
                if (j5 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j5);
            }
            int read2 = this.f11808k.read(bArr, i2, i3);
            if (read2 == -1) {
                if (this.n == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.p += read2;
            zzsj<? super m9> zzsjVar2 = this.f11805h;
            if (zzsjVar2 != null) {
                zzsjVar2.o(this, read2);
            }
            return read2;
        } catch (IOException e2) {
            throw new zzsb(e2, this.f11806i, 2);
        }
    }
}
