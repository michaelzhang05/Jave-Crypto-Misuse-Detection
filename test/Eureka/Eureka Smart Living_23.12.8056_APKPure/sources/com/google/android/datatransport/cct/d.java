package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import c1.j;
import c1.k;
import c1.l;
import c1.m;
import c1.n;
import c1.o;
import c1.p;
import com.google.android.datatransport.cct.d;
import d1.h;
import d1.i;
import e1.f;
import e1.g;
import e1.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    private final d4.a f4512a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f4513b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f4514c;

    /* renamed from: d, reason: collision with root package name */
    final URL f4515d;

    /* renamed from: e, reason: collision with root package name */
    private final n1.a f4516e;

    /* renamed from: f, reason: collision with root package name */
    private final n1.a f4517f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4518g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f4519a;

        /* renamed from: b, reason: collision with root package name */
        final j f4520b;

        /* renamed from: c, reason: collision with root package name */
        final String f4521c;

        a(URL url, j jVar, String str) {
            this.f4519a = url;
            this.f4520b = jVar;
            this.f4521c = str;
        }

        a a(URL url) {
            return new a(url, this.f4520b, this.f4521c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f4522a;

        /* renamed from: b, reason: collision with root package name */
        final URL f4523b;

        /* renamed from: c, reason: collision with root package name */
        final long f4524c;

        b(int i6, URL url, long j6) {
            this.f4522a = i6;
            this.f4523b = url;
            this.f4524c = j6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, n1.a aVar, n1.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) {
        h1.a.f("CctTransportBackend", "Making request to: %s", aVar.f4519a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f4519a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f4518g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", String.format("datatransport/%s android/", "3.1.8"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f4521c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f4512a.a(aVar.f4520b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    h1.a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    h1.a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    h1.a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new b(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream m6 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                        try {
                            b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(m6))).c());
                            if (m6 != null) {
                                m6.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return bVar;
                        } finally {
                        }
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                if (outputStream != null) {
                    try {
                        outputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                }
                throw th3;
            }
        } catch (d4.b e6) {
            e = e6;
            h1.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e7) {
            e = e7;
            h1.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e8) {
            e = e8;
            h1.a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e9) {
            e = e9;
            h1.a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        o.b bVar;
        if (networkInfo == null) {
            bVar = o.b.UNKNOWN_MOBILE_SUBTYPE;
        } else {
            int subtype = networkInfo.getSubtype();
            if (subtype != -1) {
                if (o.b.a(subtype) != null) {
                    return subtype;
                }
                return 0;
            }
            bVar = o.b.COMBINED;
        }
        return bVar.b();
    }

    private static int g(NetworkInfo networkInfo) {
        return networkInfo == null ? o.c.NONE.b() : networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e6) {
            h1.a.d("CctTransportBackend", "Unable to find version code for package", e6);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a j6;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String j7 = iVar.j();
            if (hashMap.containsKey(j7)) {
                ((List) hashMap.get(j7)).add(iVar);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j7, arrayList);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b6 = c1.m.a().f(p.DEFAULT).g(this.f4517f.a()).h(this.f4516e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(c1.a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b6.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b6.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e6 = iVar3.e();
                b1.b b7 = e6.b();
                if (b7.equals(b1.b.b("proto"))) {
                    j6 = l.j(e6.a());
                } else if (b7.equals(b1.b.b("json"))) {
                    j6 = l.i(new String(e6.a(), Charset.forName("UTF-8")));
                } else {
                    h1.a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b7);
                }
                j6.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.a(iVar3.g("net-type"))).b(o.b.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j6.b(iVar3.d());
                }
                arrayList3.add(j6.a());
            }
            b6.c(arrayList3);
            arrayList2.add(b6.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f4523b;
        if (url == null) {
            return null;
        }
        h1.a.b("CctTransportBackend", "Following redirect to: %s", url);
        return aVar.a(bVar.f4523b);
    }

    private static InputStream m(InputStream inputStream, String str) {
        return "gzip".equals(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e6) {
            throw new IllegalArgumentException("Invalid url: " + str, e6);
        }
    }

    @Override // e1.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f4513b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f4514c).getSimOperator()).c("application_build", Integer.toString(h(this.f4514c))).d();
    }

    @Override // e1.m
    public g b(f fVar) {
        j i6 = i(fVar);
        URL url = this.f4515d;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a d6 = com.google.android.datatransport.cct.a.d(fVar.c());
                r3 = d6.e() != null ? d6.e() : null;
                if (d6.f() != null) {
                    url = n(d6.f());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) i1.b.a(5, new a(url, i6, r3), new i1.a() { // from class: com.google.android.datatransport.cct.b
                @Override // i1.a
                public final Object apply(Object obj) {
                    d.b e6;
                    e6 = d.this.e((d.a) obj);
                    return e6;
                }
            }, new i1.c() { // from class: com.google.android.datatransport.cct.c
                @Override // i1.c
                public final Object a(Object obj, Object obj2) {
                    d.a l6;
                    l6 = d.l((d.a) obj, (d.b) obj2);
                    return l6;
                }
            });
            int i7 = bVar.f4522a;
            if (i7 == 200) {
                return g.e(bVar.f4524c);
            }
            if (i7 < 500 && i7 != 404) {
                return i7 == 400 ? g.d() : g.a();
            }
            return g.f();
        } catch (IOException e6) {
            h1.a.d("CctTransportBackend", "Could not make request to the backend", e6);
            return g.f();
        }
    }

    d(Context context, n1.a aVar, n1.a aVar2, int i6) {
        this.f4512a = j.b();
        this.f4514c = context;
        this.f4513b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f4515d = n(com.google.android.datatransport.cct.a.f4503c);
        this.f4516e = aVar2;
        this.f4517f = aVar;
        this.f4518g = i6;
    }
}
