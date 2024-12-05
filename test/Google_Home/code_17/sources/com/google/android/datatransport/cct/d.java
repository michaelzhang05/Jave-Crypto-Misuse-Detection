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
import s.C3982c;
import t.AbstractC4021a;
import t.n;
import t.o;
import t.p;
import t.q;
import t.r;
import t.s;
import t.t;
import t.u;
import t.v;
import t.w;
import t.x;
import u.h;
import u.i;
import v.AbstractC4077f;
import v.AbstractC4078g;
import v.InterfaceC4084m;
import y.AbstractC4194a;
import z.AbstractC4213b;
import z.InterfaceC4212a;
import z.InterfaceC4214c;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class d implements InterfaceC4084m {

    /* renamed from: a, reason: collision with root package name */
    private final U0.a f15815a;

    /* renamed from: b, reason: collision with root package name */
    private final ConnectivityManager f15816b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f15817c;

    /* renamed from: d, reason: collision with root package name */
    final URL f15818d;

    /* renamed from: e, reason: collision with root package name */
    private final E.a f15819e;

    /* renamed from: f, reason: collision with root package name */
    private final E.a f15820f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15821g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        final URL f15822a;

        /* renamed from: b, reason: collision with root package name */
        final n f15823b;

        /* renamed from: c, reason: collision with root package name */
        final String f15824c;

        a(URL url, n nVar, String str) {
            this.f15822a = url;
            this.f15823b = nVar;
            this.f15824c = str;
        }

        a a(URL url) {
            return new a(url, this.f15823b, this.f15824c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        final int f15825a;

        /* renamed from: b, reason: collision with root package name */
        final URL f15826b;

        /* renamed from: c, reason: collision with root package name */
        final long f15827c;

        b(int i8, URL url, long j8) {
            this.f15825a = i8;
            this.f15826b = url;
            this.f15827c = j8;
        }
    }

    d(Context context, E.a aVar, E.a aVar2, int i8) {
        this.f15815a = n.b();
        this.f15817c = context;
        this.f15816b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f15818d = o(com.google.android.datatransport.cct.a.f15806c);
        this.f15819e = aVar2;
        this.f15820f = aVar;
        this.f15821g = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public b e(a aVar) {
        AbstractC4194a.f("CctTransportBackend", "Making request to: %s", aVar.f15822a);
        HttpURLConnection httpURLConnection = (HttpURLConnection) aVar.f15822a.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(this.f15821g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, String.format("datatransport/%s android/", "3.3.0"));
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = aVar.f15824c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    this.f15815a.a(aVar.f15823b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    AbstractC4194a.f("CctTransportBackend", "Status Code: %d", Integer.valueOf(responseCode));
                    AbstractC4194a.b("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField("Content-Type"));
                    AbstractC4194a.b("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField("Content-Encoding"));
                    if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                        if (responseCode != 200) {
                            return new b(responseCode, null, 0L);
                        }
                        InputStream inputStream = httpURLConnection.getInputStream();
                        try {
                            InputStream n8 = n(inputStream, httpURLConnection.getHeaderField("Content-Encoding"));
                            try {
                                b bVar = new b(responseCode, null, v.b(new BufferedReader(new InputStreamReader(n8))).c());
                                if (n8 != null) {
                                    n8.close();
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
        } catch (U0.b e8) {
            e = e8;
            AbstractC4194a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        } catch (ConnectException e9) {
            e = e9;
            AbstractC4194a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (UnknownHostException e10) {
            e = e10;
            AbstractC4194a.d("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new b(500, null, 0L);
        } catch (IOException e11) {
            e = e11;
            AbstractC4194a.d("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new b(400, null, 0L);
        }
    }

    private static String f(Context context) {
        String simOperator = k(context).getSimOperator();
        if (simOperator != null) {
            return simOperator;
        }
        return "";
    }

    private static int g(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.b.UNKNOWN_MOBILE_SUBTYPE.b();
        }
        int subtype = networkInfo.getSubtype();
        if (subtype == -1) {
            return w.b.COMBINED.b();
        }
        if (w.b.a(subtype) == null) {
            return 0;
        }
        return subtype;
    }

    private static int h(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return w.c.NONE.b();
        }
        return networkInfo.getType();
    }

    private static int i(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e8) {
            AbstractC4194a.d("CctTransportBackend", "Unable to find version code for package", e8);
            return -1;
        }
    }

    private n j(AbstractC4077f abstractC4077f) {
        t.a l8;
        HashMap hashMap = new HashMap();
        for (i iVar : abstractC4077f.b()) {
            String n8 = iVar.n();
            if (!hashMap.containsKey(n8)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(iVar);
                hashMap.put(n8, arrayList);
            } else {
                ((List) hashMap.get(n8)).add(iVar);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : hashMap.entrySet()) {
            i iVar2 = (i) ((List) entry.getValue()).get(0);
            u.a b8 = u.a().f(x.DEFAULT).g(this.f15820f.a()).h(this.f15819e.a()).b(o.a().c(o.b.ANDROID_FIREBASE).b(AbstractC4021a.a().m(Integer.valueOf(iVar2.i("sdk-version"))).j(iVar2.b("model")).f(iVar2.b("hardware")).d(iVar2.b("device")).l(iVar2.b("product")).k(iVar2.b("os-uild")).h(iVar2.b("manufacturer")).e(iVar2.b("fingerprint")).c(iVar2.b("country")).g(iVar2.b("locale")).i(iVar2.b("mcc_mnc")).b(iVar2.b("application_build")).a()).a());
            try {
                b8.i(Integer.parseInt((String) entry.getKey()));
            } catch (NumberFormatException unused) {
                b8.j((String) entry.getKey());
            }
            ArrayList arrayList3 = new ArrayList();
            for (i iVar3 : (List) entry.getValue()) {
                h e8 = iVar3.e();
                C3982c b9 = e8.b();
                if (b9.equals(C3982c.b("proto"))) {
                    l8 = t.l(e8.a());
                } else if (b9.equals(C3982c.b("json"))) {
                    l8 = t.k(new String(e8.a(), Charset.forName(C.UTF8_NAME)));
                } else {
                    AbstractC4194a.g("CctTransportBackend", "Received event of unsupported encoding %s. Skipping...", b9);
                }
                l8.d(iVar3.f()).e(iVar3.o()).j(iVar3.j("tz-offset")).g(w.a().c(w.c.a(iVar3.i("net-type"))).b(w.b.a(iVar3.i("mobile-subtype"))).a());
                if (iVar3.d() != null) {
                    l8.c(iVar3.d());
                }
                if (iVar3.l() != null) {
                    l8.b(p.a().b(s.a().b(r.a().b(iVar3.l()).a()).a()).c(p.b.EVENT_OVERRIDE).a());
                }
                if (iVar3.g() != null || iVar3.h() != null) {
                    q.a a8 = q.a();
                    if (iVar3.g() != null) {
                        a8.b(iVar3.g());
                    }
                    if (iVar3.h() != null) {
                        a8.c(iVar3.h());
                    }
                    l8.f(a8.a());
                }
                arrayList3.add(l8.a());
            }
            b8.c(arrayList3);
            arrayList2.add(b8.a());
        }
        return n.a(arrayList2);
    }

    private static TelephonyManager k(Context context) {
        return (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
    }

    static long l() {
        Calendar.getInstance();
        return TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ a m(a aVar, b bVar) {
        URL url = bVar.f15826b;
        if (url != null) {
            AbstractC4194a.b("CctTransportBackend", "Following redirect to: %s", url);
            return aVar.a(bVar.f15826b);
        }
        return null;
    }

    private static InputStream n(InputStream inputStream, String str) {
        if ("gzip".equals(str)) {
            return new GZIPInputStream(inputStream);
        }
        return inputStream;
    }

    private static URL o(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e8) {
            throw new IllegalArgumentException("Invalid url: " + str, e8);
        }
    }

    @Override // v.InterfaceC4084m
    public i a(i iVar) {
        NetworkInfo activeNetworkInfo = this.f15816b.getActiveNetworkInfo();
        return iVar.p().a("sdk-version", Build.VERSION.SDK_INT).c("model", Build.MODEL).c("hardware", Build.HARDWARE).c("device", Build.DEVICE).c("product", Build.PRODUCT).c("os-uild", Build.ID).c("manufacturer", Build.MANUFACTURER).c("fingerprint", Build.FINGERPRINT).b("tz-offset", l()).a("net-type", h(activeNetworkInfo)).a("mobile-subtype", g(activeNetworkInfo)).c("country", Locale.getDefault().getCountry()).c("locale", Locale.getDefault().getLanguage()).c("mcc_mnc", f(this.f15817c)).c("application_build", Integer.toString(i(this.f15817c))).d();
    }

    @Override // v.InterfaceC4084m
    public AbstractC4078g b(AbstractC4077f abstractC4077f) {
        n j8 = j(abstractC4077f);
        URL url = this.f15818d;
        String str = null;
        if (abstractC4077f.c() != null) {
            try {
                com.google.android.datatransport.cct.a c8 = com.google.android.datatransport.cct.a.c(abstractC4077f.c());
                if (c8.d() != null) {
                    str = c8.d();
                }
                if (c8.e() != null) {
                    url = o(c8.e());
                }
            } catch (IllegalArgumentException unused) {
                return AbstractC4078g.a();
            }
        }
        try {
            b bVar = (b) AbstractC4213b.a(5, new a(url, j8, str), new InterfaceC4212a() { // from class: com.google.android.datatransport.cct.b
                @Override // z.InterfaceC4212a
                public final Object apply(Object obj) {
                    d.b e8;
                    e8 = d.this.e((d.a) obj);
                    return e8;
                }
            }, new InterfaceC4214c() { // from class: com.google.android.datatransport.cct.c
                @Override // z.InterfaceC4214c
                public final Object a(Object obj, Object obj2) {
                    d.a m8;
                    m8 = d.m((d.a) obj, (d.b) obj2);
                    return m8;
                }
            });
            int i8 = bVar.f15825a;
            if (i8 == 200) {
                return AbstractC4078g.e(bVar.f15827c);
            }
            if (i8 < 500 && i8 != 404) {
                if (i8 == 400) {
                    return AbstractC4078g.d();
                }
                return AbstractC4078g.a();
            }
            return AbstractC4078g.f();
        } catch (IOException e8) {
            AbstractC4194a.d("CctTransportBackend", "Could not make request to the backend", e8);
            return AbstractC4078g.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(Context context, E.a aVar, E.a aVar2) {
        this(context, aVar, aVar2, 130000);
    }
}
