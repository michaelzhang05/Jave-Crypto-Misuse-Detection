package com.google.android.datatransport.cct;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.autofill.HintConstants;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.android.datatransport.cct.d;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.playercommon.exoplayer2.C;
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
import s.C3700b;
import t.AbstractC3763a;
import t.j;
import t.k;
import t.l;
import t.m;
import t.n;
import t.o;
import t.p;
import u.h;
import u.i;
import v.f;
import v.g;
import v.m;
import y.AbstractC3966a;
import z.AbstractC4009b;
import z.InterfaceC4008a;
import z.InterfaceC4010c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class d implements m {

    /* renamed from: a, reason: collision with root package name */
    private final S0.a f15004a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f15005b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f15006c;

    /* renamed from: d, reason: collision with root package name */
    final URL f15007d;

    /* renamed from: e, reason: collision with root package name */
    private final E.a f15008e;

    /* renamed from: f, reason: collision with root package name */
    private final E.a f15009f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15010g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f15011a;

        /* renamed from: b, reason: collision with root package name */
        final j f15012b;

        /* renamed from: c, reason: collision with root package name */
        final String f15013c;

        a(URL url, j jVar, String str) {
            this.f15011a = url;
            this.f15012b = jVar;
            this.f15013c = str;
        }

        a a(URL url) {
            return new a(url, this.f15012b, this.f15013c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f15014a;

        /* renamed from: b, reason: collision with root package name */
        final URL f15015b;

        /* renamed from: c, reason: collision with root package name */
        final long f15016c;

        b(int i8, URL url, long j8) {
            this.f15014a = i8;
            this.f15015b = url;
            this.f15016c = j8;
        }
    }

    d(Context context, E.a aVar, E.a aVar2, int i8) {
        this.f15004a = j.b();
        this.f15006c = context;
        this.f15005b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f15007d = n(com.google.android.datatransport.cct.a.f14995c);
        this.f15008e = aVar2;
        this.f15009f = aVar;
        this.f15010g = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) {
        AbstractC3966a.f("CctTransportBackend", "Making request to: %s", aVar.f15011a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f15011a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f15010g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, String.format("datatransport/%s android/", "3.1.9"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f15013c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f15004a.a(aVar.f15012b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC3966a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC3966a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC3966a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new b(responseCode, null, 0L);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            InputStream m8 = m(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                            try {
                                b bVar = new b(responseCode, null, n.b(new BufferedReader(new InputStreamReader(m8))).c());
                                if (m8 != null) {
                                    m8.close();
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
                    }
                    return new b(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
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
        } catch (S0.b e8) {
            e = e8;
            AbstractC3966a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e9) {
            e = e9;
            AbstractC3966a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            AbstractC3966a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            AbstractC3966a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static int f(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return o.b.COMBINED.b();
        }
        if (o.b.a(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return o.c.NONE.b();
        }
        return networkInfo.getType();
    }

    private static int h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            AbstractC3966a.d("CctTransportBackend", "Unable to find version code for package", e8);
            return -1;
        }
    }

    private j i(f fVar) {
        l.a j8;
        HashMap hashMap = new HashMap();
        for (i iVar : fVar.b()) {
            String j9 = iVar.j();
            if (!hashMap.containsKey(j9)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(j9, arrayList);
            } else {
                ((List) hashMap.get(j9)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            m.a b8 = t.m.a().f(p.DEFAULT).g(this.f15009f.a()).h(this.f15008e.a()).b(k.a().c(k.b.ANDROID_FIREBASE).b(AbstractC3763a.a().m(Integer.valueOf(iVar2.g("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b8.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b8.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e8 = iVar3.e();
                C3700b b9 = e8.b();
                if (b9.equals(C3700b.b("proto"))) {
                    j8 = l.j(e8.a());
                } else if (b9.equals(C3700b.b("json"))) {
                    j8 = l.i(new String(e8.a(), Charset.forName(C.UTF8_NAME)));
                } else {
                    AbstractC3966a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b9);
                }
                j8.c(iVar3.f()).d(iVar3.k()).h(iVar3.h("tz-offset")).e(o.a().c(o.c.a(iVar3.g("net-type"))).b(o.b.a(iVar3.g("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    j8.b(iVar3.d());
                }
                arrayList3.add(j8.a());
            }
            b8.c(arrayList3);
            arrayList2.add(b8.a());
        }
        return j.a(arrayList2);
    }

    private static TelephonyManager j(Context context) {
        return (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    static long k() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a l(a aVar, b bVar) {
        URL url = bVar.f15015b;
        if (url != null) {
            AbstractC3966a.b("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.f15015b);
        }
        return null;
    }

    private static InputStream m(InputStream inputStream, String str) {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    private static URL n(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException("Invalid url: " + str, e8);
        }
    }

    @Override // v.m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f15005b.getActiveNetworkInfo();
        return iVar.l().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", k()).a("net-type", g(activeNetworkInfo)).a("mobile-subtype", f(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", j(this.f15006c).getSimOperator()).c("application_build", Integer.toString(h(this.f15006c))).d();
    }

    @Override // v.m
    public g b(f fVar) {
        j i8 = i(fVar);
        URL url = this.f15007d;
        String str = null;
        if (fVar.c() != null) {
            try {
                com.google.android.datatransport.cct.a c8 = com.google.android.datatransport.cct.a.c(fVar.c());
                if (c8.d() != null) {
                    str = c8.d();
                }
                if (c8.e() != null) {
                    url = n(c8.e());
                }
            } catch (IllegalArgumentException unused) {
                return g.a();
            }
        }
        try {
            b bVar = (b) AbstractC4009b.a(5, new a(url, i8, str), new InterfaceC4008a() { // from class: com.google.android.datatransport.cct.b
                @Override // z.InterfaceC4008a
                public final Object apply(Object obj) {
                    d.b e8;
                    e8 = d.this.e((d.a) obj);
                    return e8;
                }
            }, new InterfaceC4010c() { // from class: com.google.android.datatransport.cct.c
                @Override // z.InterfaceC4010c
                public final Object a(Object obj, Object obj2) {
                    d.a l8;
                    l8 = d.l((d.a) obj, (d.b) obj2);
                    return l8;
                }
            });
            int i9 = bVar.f15014a;
            if (i9 == 200) {
                return g.e(bVar.f15016c);
            }
            if (i9 < 500 && i9 != 404) {
                if (i9 == 400) {
                    return g.d();
                }
                return g.a();
            }
            return g.f();
        } catch (IOException e8) {
            AbstractC3966a.d("CctTransportBackend", "Could not make request to the backend", e8);
            return g.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, E.a aVar, E.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
