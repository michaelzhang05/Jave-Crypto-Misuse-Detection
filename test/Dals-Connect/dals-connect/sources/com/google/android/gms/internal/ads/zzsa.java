package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzsa implements zzrv {
    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<byte[]> f15520b = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    private final int f15522d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15523e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15524f;

    /* renamed from: j, reason: collision with root package name */
    private final zzsj<? super zzsa> f15528j;

    /* renamed from: k, reason: collision with root package name */
    private zzry f15529k;
    private HttpURLConnection l;
    private InputStream m;
    private boolean n;
    private long o;
    private long p;
    private long q;
    private long r;

    /* renamed from: g, reason: collision with root package name */
    private final zzsv<String> f15525g = null;

    /* renamed from: i, reason: collision with root package name */
    private final zzsd f15527i = new zzsd();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15521c = true;

    /* renamed from: h, reason: collision with root package name */
    private final zzsd f15526h = null;

    public zzsa(String str, zzsv<String> zzsvVar, zzsj<? super zzsa> zzsjVar, int i2, int i3, boolean z, zzsd zzsdVar) {
        this.f15524f = zzsk.c(str);
        this.f15528j = zzsjVar;
        this.f15522d = i2;
        this.f15523e = i3;
    }

    private final HttpURLConnection c(URL url, byte[] bArr, long j2, long j3, boolean z, boolean z2) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f15522d);
        httpURLConnection.setReadTimeout(this.f15523e);
        for (Map.Entry<String, String> entry : this.f15527i.a().entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        if (j2 != 0 || j3 != -1) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            String sb2 = sb.toString();
            if (j3 != -1) {
                String valueOf = String.valueOf(sb2);
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 20);
                sb3.append(valueOf);
                sb3.append((j2 + j3) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f15524f);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length != 0) {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
                return httpURLConnection;
            }
        }
        httpURLConnection.connect();
        return httpURLConnection;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long d(java.net.HttpURLConnection r10) {
        /*
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r10.getHeaderField(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "]"
            java.lang.String r3 = "DefaultHttpDataSource"
            if (r1 != 0) goto L36
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L38
        L15:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            int r1 = r1 + 28
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Length ["
            r4.append(r1)
            r4.append(r0)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            android.util.Log.e(r3, r1)
        L36:
            r4 = -1
        L38:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto Lcb
            java.util.regex.Pattern r1 = com.google.android.gms.internal.ads.zzsa.a
            java.util.regex.Matcher r1 = r1.matcher(r10)
            boolean r6 = r1.find()
            if (r6 == 0) goto Lcb
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> Laa
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> Laa
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> Laa
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> Laa
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L6e
            r4 = r6
            goto Lcb
        L6e:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto Lcb
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Laa
            int r1 = r1.length()     // Catch: java.lang.NumberFormatException -> Laa
            int r1 = r1 + 26
            java.lang.String r8 = java.lang.String.valueOf(r10)     // Catch: java.lang.NumberFormatException -> Laa
            int r8 = r8.length()     // Catch: java.lang.NumberFormatException -> Laa
            int r1 = r1 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Laa
            r8.<init>(r1)     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r1 = "Inconsistent headers ["
            r8.append(r1)     // Catch: java.lang.NumberFormatException -> Laa
            r8.append(r0)     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r0 = "] ["
            r8.append(r0)     // Catch: java.lang.NumberFormatException -> Laa
            r8.append(r10)     // Catch: java.lang.NumberFormatException -> Laa
            r8.append(r2)     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r0 = r8.toString()     // Catch: java.lang.NumberFormatException -> Laa
            android.util.Log.w(r3, r0)     // Catch: java.lang.NumberFormatException -> Laa
            long r0 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> Laa
            r4 = r0
            goto Lcb
        Laa:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            int r0 = r0.length()
            int r0 = r0 + 27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = "Unexpected Content-Range ["
            r1.append(r0)
            r1.append(r10)
            r1.append(r2)
            java.lang.String r10 = r1.toString()
            android.util.Log.e(r3, r10)
        Lcb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.d(java.net.HttpURLConnection):long");
    }

    private final void e() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.l = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x0077, code lost:
    
        r0 = r1;
     */
    @Override // com.google.android.gms.internal.ads.zzrv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.zzry r25) throws com.google.android.gms.internal.ads.zzsb {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.a(com.google.android.gms.internal.ads.zzry):long");
    }

    public final Map<String, List<String>> b() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
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
            java.io.InputStream r2 = r9.m     // Catch: java.lang.Throwable -> L88
            if (r2 == 0) goto L75
            java.net.HttpURLConnection r2 = r9.l     // Catch: java.lang.Throwable -> L88
            long r3 = r9.p     // Catch: java.lang.Throwable -> L88
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L11
            goto L14
        L11:
            long r7 = r9.r     // Catch: java.lang.Throwable -> L88
            long r3 = r3 - r7
        L14:
            int r7 = com.google.android.gms.internal.ads.zzsy.a     // Catch: java.lang.Throwable -> L88
            r8 = 19
            if (r7 == r8) goto L1e
            r8 = 20
            if (r7 != r8) goto L65
        L1e:
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2e
            int r3 = r2.read()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r4 = -1
            if (r3 != r4) goto L34
            goto L65
        L2e:
            r5 = 2048(0x800, double:1.012E-320)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L65
        L34:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            if (r4 != 0) goto L4c
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            if (r3 == 0) goto L65
        L4c:
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
            r3.invoke(r2, r4)     // Catch: java.lang.Exception -> L65 java.lang.Throwable -> L88
        L65:
            java.io.InputStream r2 = r9.m     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L88
            r2.close()     // Catch: java.io.IOException -> L6b java.lang.Throwable -> L88
            goto L75
        L6b:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzsb r3 = new com.google.android.gms.internal.ads.zzsb     // Catch: java.lang.Throwable -> L88
            com.google.android.gms.internal.ads.zzry r4 = r9.f15529k     // Catch: java.lang.Throwable -> L88
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L88
            throw r3     // Catch: java.lang.Throwable -> L88
        L75:
            r9.m = r0
            r9.e()
            boolean r0 = r9.n
            if (r0 == 0) goto L87
            r9.n = r1
            com.google.android.gms.internal.ads.zzsj<? super com.google.android.gms.internal.ads.zzsa> r0 = r9.f15528j
            if (r0 == 0) goto L87
            r0.d(r9)
        L87:
            return
        L88:
            r2 = move-exception
            r9.m = r0
            r9.e()
            boolean r0 = r9.n
            if (r0 == 0) goto L9b
            r9.n = r1
            com.google.android.gms.internal.ads.zzsj<? super com.google.android.gms.internal.ads.zzsa> r0 = r9.f15528j
            if (r0 == 0) goto L9b
            r0.d(r9)
        L9b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsa.close():void");
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final Uri n0() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzrv
    public final int read(byte[] bArr, int i2, int i3) throws zzsb {
        try {
            if (this.q != this.o) {
                byte[] andSet = f15520b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT];
                }
                while (true) {
                    long j2 = this.q;
                    long j3 = this.o;
                    if (j2 != j3) {
                        int read = this.m.read(andSet, 0, (int) Math.min(j3 - j2, andSet.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.q += read;
                            zzsj<? super zzsa> zzsjVar = this.f15528j;
                            if (zzsjVar != null) {
                                zzsjVar.o(this, read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        f15520b.set(andSet);
                        break;
                    }
                }
            }
            if (i3 == 0) {
                return 0;
            }
            long j4 = this.p;
            if (j4 != -1) {
                long j5 = j4 - this.r;
                if (j5 == 0) {
                    return -1;
                }
                i3 = (int) Math.min(i3, j5);
            }
            int read2 = this.m.read(bArr, i2, i3);
            if (read2 == -1) {
                if (this.p == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.r += read2;
            zzsj<? super zzsa> zzsjVar2 = this.f15528j;
            if (zzsjVar2 != null) {
                zzsjVar2.o(this, read2);
            }
            return read2;
        } catch (IOException e2) {
            throw new zzsb(e2, this.f15529k, 2);
        }
    }
}
