package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.pt.dataprovider.BuildConfig;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zzjs implements zzkf {
    private static final Pattern a = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<byte[]> f15189b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15190c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15191d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15192e;

    /* renamed from: f, reason: collision with root package name */
    private final String f15193f;

    /* renamed from: g, reason: collision with root package name */
    private final zzkn<String> f15194g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f15195h;

    /* renamed from: i, reason: collision with root package name */
    private final zzke f15196i;

    /* renamed from: j, reason: collision with root package name */
    private zzjq f15197j;

    /* renamed from: k, reason: collision with root package name */
    private HttpURLConnection f15198k;
    private InputStream l;
    private boolean m;
    private long n;
    private long o;
    private long p;
    private long q;

    public zzjs(String str, zzkn<String> zzknVar, zzke zzkeVar, int i2, int i3, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f15193f = str;
            this.f15194g = null;
            this.f15196i = null;
            this.f15195h = new HashMap<>();
            this.f15191d = i2;
            this.f15192e = i3;
            this.f15190c = z;
            return;
        }
        throw new IllegalArgumentException();
    }

    private final void b() {
        HttpURLConnection httpURLConnection = this.f15198k;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f15198k = null;
        }
    }

    private final HttpURLConnection c(URL url, long j2, long j3, boolean z) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f15191d);
        httpURLConnection.setReadTimeout(this.f15192e);
        httpURLConnection.setDoOutput(false);
        synchronized (this.f15195h) {
            for (Map.Entry<String, String> entry : this.f15195h.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        if (j2 != 0 || j3 != -1) {
            StringBuilder sb = new StringBuilder(27);
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            String sb2 = sb.toString();
            if (j3 != -1) {
                String valueOf = String.valueOf(sb2);
                long j4 = (j2 + j3) - 1;
                StringBuilder sb3 = new StringBuilder(valueOf.length() + 20);
                sb3.append(valueOf);
                sb3.append(j4);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f15193f);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
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
            java.lang.String r3 = "HttpDataSource"
            if (r1 != 0) goto L36
            long r4 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L15
            goto L38
        L15:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            int r4 = r4 + 28
            r1.<init>(r4)
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.append(r4)
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r3, r1)
        L36:
            r4 = -1
        L38:
            java.lang.String r1 = "Content-Range"
            java.lang.String r10 = r10.getHeaderField(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            if (r1 != 0) goto Lcb
            java.util.regex.Pattern r1 = com.google.android.gms.internal.ads.zzjs.a
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
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Laa
            int r8 = r8.length()     // Catch: java.lang.NumberFormatException -> Laa
            int r8 = r8 + 26
            java.lang.String r9 = java.lang.String.valueOf(r10)     // Catch: java.lang.NumberFormatException -> Laa
            int r9 = r9.length()     // Catch: java.lang.NumberFormatException -> Laa
            int r8 = r8 + r9
            r1.<init>(r8)     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r8 = "Inconsistent headers ["
            r1.append(r8)     // Catch: java.lang.NumberFormatException -> Laa
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r0 = "] ["
            r1.append(r0)     // Catch: java.lang.NumberFormatException -> Laa
            r1.append(r10)     // Catch: java.lang.NumberFormatException -> Laa
            r1.append(r2)     // Catch: java.lang.NumberFormatException -> Laa
            java.lang.String r0 = r1.toString()     // Catch: java.lang.NumberFormatException -> Laa
            android.util.Log.w(r3, r0)     // Catch: java.lang.NumberFormatException -> Laa
            long r0 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> Laa
            r4 = r0
            goto Lcb
        Laa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = java.lang.String.valueOf(r10)
            int r1 = r1.length()
            int r1 = r1 + 27
            r0.<init>(r1)
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.append(r1)
            r0.append(r10)
            r0.append(r2)
            java.lang.String r10 = r0.toString()
            android.util.Log.e(r3, r10)
        Lcb:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjs.d(java.net.HttpURLConnection):long");
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final long a(zzjq zzjqVar) throws zzjx {
        HttpURLConnection httpURLConnection;
        this.f15197j = zzjqVar;
        long j2 = 0;
        this.q = 0L;
        this.p = 0L;
        try {
            URL url = new URL(zzjqVar.a.toString());
            long j3 = zzjqVar.f15182c;
            long j4 = zzjqVar.f15183d;
            boolean z = (zzjqVar.f15185f & 1) != 0;
            if (this.f15190c) {
                URL url2 = url;
                int i2 = 0;
                while (true) {
                    int i3 = i2 + 1;
                    if (i2 <= 20) {
                        URL url3 = url2;
                        long j5 = j4;
                        HttpURLConnection c2 = c(url2, j3, j4, z);
                        c2.setInstanceFollowRedirects(false);
                        c2.connect();
                        int responseCode = c2.getResponseCode();
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnection = c2;
                            break;
                        }
                        String headerField = c2.getHeaderField("Location");
                        c2.disconnect();
                        if (headerField != null) {
                            URL url4 = new URL(url3, headerField);
                            String protocol = url4.getProtocol();
                            if (!BuildConfig.APTOIDE_WEB_SERVICES_SCHEME.equals(protocol) && !"http".equals(protocol)) {
                                String valueOf = String.valueOf(protocol);
                                throw new ProtocolException(valueOf.length() != 0 ? "Unsupported protocol redirect: ".concat(valueOf) : new String("Unsupported protocol redirect: "));
                            }
                            url2 = url4;
                            i2 = i3;
                            j4 = j5;
                        } else {
                            throw new ProtocolException("Null location redirect");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("Too many redirects: ");
                        sb.append(i3);
                        throw new NoRouteToHostException(sb.toString());
                    }
                }
            } else {
                httpURLConnection = c(url, j3, j4, z);
                httpURLConnection.connect();
            }
            this.f15198k = httpURLConnection;
            try {
                int responseCode2 = httpURLConnection.getResponseCode();
                if (responseCode2 >= 200 && responseCode2 <= 299) {
                    this.f15198k.getContentType();
                    if (responseCode2 == 200) {
                        long j6 = zzjqVar.f15182c;
                        if (j6 != 0) {
                            j2 = j6;
                        }
                    }
                    this.n = j2;
                    if ((zzjqVar.f15185f & 1) == 0) {
                        long d2 = d(this.f15198k);
                        long j7 = zzjqVar.f15183d;
                        if (j7 == -1) {
                            j7 = d2 != -1 ? d2 - this.n : -1L;
                        }
                        this.o = j7;
                    } else {
                        this.o = zzjqVar.f15183d;
                    }
                    try {
                        this.l = this.f15198k.getInputStream();
                        this.m = true;
                        zzke zzkeVar = this.f15196i;
                        if (zzkeVar != null) {
                            zzkeVar.b();
                        }
                        return this.o;
                    } catch (IOException e2) {
                        b();
                        throw new zzjx(e2, zzjqVar);
                    }
                }
                Map<String, List<String>> headerFields = this.f15198k.getHeaderFields();
                b();
                throw new zzjy(responseCode2, headerFields, zzjqVar);
            } catch (IOException e3) {
                b();
                String valueOf2 = String.valueOf(zzjqVar.a.toString());
                throw new zzjx(valueOf2.length() != 0 ? "Unable to connect to ".concat(valueOf2) : new String("Unable to connect to "), e3, zzjqVar);
            }
        } catch (IOException e4) {
            String valueOf3 = String.valueOf(zzjqVar.a.toString());
            throw new zzjx(valueOf3.length() != 0 ? "Unable to connect to ".concat(valueOf3) : new String("Unable to connect to "), e4, zzjqVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0031, code lost:
    
        if (r2 > 2048) goto L21;
     */
    @Override // com.google.android.gms.internal.ads.zzjp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws com.google.android.gms.internal.ads.zzjx {
        /*
            r8 = this;
            r0 = 0
            java.io.InputStream r1 = r8.l     // Catch: java.lang.Throwable -> L87
            if (r1 == 0) goto L76
            java.net.HttpURLConnection r1 = r8.f15198k     // Catch: java.lang.Throwable -> L87
            long r2 = r8.o     // Catch: java.lang.Throwable -> L87
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L10
            goto L13
        L10:
            long r6 = r8.q     // Catch: java.lang.Throwable -> L87
            long r2 = r2 - r6
        L13:
            int r6 = com.google.android.gms.internal.ads.zzkq.a     // Catch: java.lang.Throwable -> L87
            r7 = 19
            if (r6 == r7) goto L1d
            r7 = 20
            if (r6 != r7) goto L64
        L1d:
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L2d
            int r2 = r1.read()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            r3 = -1
            if (r2 != r3) goto L33
            goto L64
        L2d:
            r4 = 2048(0x800, double:1.012E-320)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L64
        L33:
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.String r3 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            if (r3 != 0) goto L4b
            java.lang.String r3 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r2 = r2.equals(r3)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            if (r2 == 0) goto L64
        L4b:
            java.lang.Class r2 = r1.getClass()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.Class r2 = r2.getSuperclass()     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.String r3 = "unexpectedEndOfInput"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
            r2.invoke(r1, r3)     // Catch: java.lang.Throwable -> L64 java.lang.Throwable -> L87
        L64:
            java.io.InputStream r1 = r8.l     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L87
            r1.close()     // Catch: java.io.IOException -> L6d java.lang.Throwable -> L87
            r1 = 0
            r8.l = r1     // Catch: java.lang.Throwable -> L87
            goto L76
        L6d:
            r1 = move-exception
            com.google.android.gms.internal.ads.zzjx r2 = new com.google.android.gms.internal.ads.zzjx     // Catch: java.lang.Throwable -> L87
            com.google.android.gms.internal.ads.zzjq r3 = r8.f15197j     // Catch: java.lang.Throwable -> L87
            r2.<init>(r1, r3)     // Catch: java.lang.Throwable -> L87
            throw r2     // Catch: java.lang.Throwable -> L87
        L76:
            boolean r1 = r8.m
            if (r1 == 0) goto L86
            r8.m = r0
            com.google.android.gms.internal.ads.zzke r0 = r8.f15196i
            if (r0 == 0) goto L83
            r0.c()
        L83:
            r8.b()
        L86:
            return
        L87:
            r1 = move-exception
            boolean r2 = r8.m
            if (r2 == 0) goto L98
            r8.m = r0
            com.google.android.gms.internal.ads.zzke r0 = r8.f15196i
            if (r0 == 0) goto L95
            r0.c()
        L95:
            r8.b()
        L98:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjs.close():void");
    }

    @Override // com.google.android.gms.internal.ads.zzjp
    public final int read(byte[] bArr, int i2, int i3) throws zzjx {
        try {
            if (this.p != this.n) {
                byte[] andSet = f15189b.getAndSet(null);
                if (andSet == null) {
                    andSet = new byte[RecyclerView.l.FLAG_APPEARED_IN_PRE_LAYOUT];
                }
                while (true) {
                    long j2 = this.p;
                    long j3 = this.n;
                    if (j2 != j3) {
                        int read = this.l.read(andSet, 0, (int) Math.min(j3 - j2, andSet.length));
                        if (Thread.interrupted()) {
                            throw new InterruptedIOException();
                        }
                        if (read != -1) {
                            this.p += read;
                            zzke zzkeVar = this.f15196i;
                            if (zzkeVar != null) {
                                zzkeVar.a(read);
                            }
                        } else {
                            throw new EOFException();
                        }
                    } else {
                        f15189b.set(andSet);
                        break;
                    }
                }
            }
            long j4 = this.o;
            if (j4 != -1) {
                i3 = (int) Math.min(i3, j4 - this.q);
            }
            if (i3 == 0) {
                return -1;
            }
            int read2 = this.l.read(bArr, i2, i3);
            if (read2 == -1) {
                long j5 = this.o;
                if (j5 != -1 && j5 != this.q) {
                    throw new EOFException();
                }
                return -1;
            }
            this.q += read2;
            zzke zzkeVar2 = this.f15196i;
            if (zzkeVar2 != null) {
                zzkeVar2.a(read2);
            }
            return read2;
        } catch (IOException e2) {
            throw new zzjx(e2, this.f15197j);
        }
    }
}
