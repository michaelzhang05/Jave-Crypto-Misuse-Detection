package com.getcapacitor.plugin;

import com.getcapacitor.h;
import com.getcapacitor.l0;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends CookieManager {

    /* renamed from: a, reason: collision with root package name */
    private final android.webkit.CookieManager f4456a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4457b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4458c;

    /* renamed from: d, reason: collision with root package name */
    private final String f4459d;

    public a(CookieStore cookieStore, CookiePolicy cookiePolicy, h hVar) {
        super(cookieStore, cookiePolicy);
        this.f4459d = "CapacitorCookies";
        this.f4456a = android.webkit.CookieManager.getInstance();
        this.f4457b = hVar.v();
        this.f4458c = hVar.F();
    }

    private String d(String str) {
        String[] split = str.toLowerCase(Locale.ROOT).split("domain=");
        return e(split.length <= 1 ? null : split[1].split(";")[0].trim());
    }

    public void a() {
        this.f4456a.flush();
    }

    public String b(String str) {
        try {
            String e6 = e(str);
            l0.g("CapacitorCookies", "Getting cookies at: '" + e6 + "'");
            return this.f4456a.getCookie(e6);
        } catch (Exception e7) {
            l0.d("CapacitorCookies", "Failed to get cookies at the given URL.", e7);
            return null;
        }
    }

    public HttpCookie[] c(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            String b6 = b(str);
            if (b6 != null) {
                for (String str2 : b6.split(";")) {
                    HttpCookie httpCookie = HttpCookie.parse(str2).get(0);
                    httpCookie.setValue(httpCookie.getValue());
                    arrayList.add(httpCookie);
                }
            }
            return (HttpCookie[]) arrayList.toArray(new HttpCookie[arrayList.size()]);
        } catch (Exception unused) {
            return new HttpCookie[0];
        }
    }

    public String e(String str) {
        if (str == null || str.isEmpty()) {
            str = this.f4458c;
        }
        try {
            new URI(str);
        } catch (Exception unused) {
            str = this.f4457b;
            try {
                new URI(str);
            } catch (Exception e6) {
                l0.d("CapacitorCookies", "Failed to get sanitized URL.", e6);
                throw e6;
            }
        }
        return str;
    }

    public void f() {
        this.f4456a.removeAllCookies(null);
        a();
    }

    public void g() {
        this.f4456a.removeSessionCookies(null);
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public Map get(URI uri, Map map) {
        if (uri == null || map == null) {
            throw new IllegalArgumentException("Argument is null");
        }
        String uri2 = uri.toString();
        HashMap hashMap = new HashMap();
        String b6 = b(uri2);
        if (b6 != null) {
            hashMap.put("Cookie", Collections.singletonList(b6));
        }
        return hashMap;
    }

    @Override // java.net.CookieManager
    public CookieStore getCookieStore() {
        throw new UnsupportedOperationException();
    }

    public void h(String str, String str2) {
        try {
            String e6 = e(str);
            l0.g("CapacitorCookies", "Setting cookie '" + str2 + "' at: '" + e6 + "'");
            this.f4456a.setCookie(e6, str2);
            a();
        } catch (Exception e7) {
            l0.d("CapacitorCookies", "Failed to set cookie.", e7);
        }
    }

    public void i(String str, String str2, String str3, String str4, String str5) {
        h(str, str2 + "=" + str3 + "; expires=" + str4 + "; path=" + str5);
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public void put(URI uri, Map map) {
        if (uri == null || map == null) {
            return;
        }
        for (String str : map.keySet()) {
            if (str != null && (str.equalsIgnoreCase("Set-Cookie2") || str.equalsIgnoreCase("Set-Cookie"))) {
                List<String> list = (List) map.get(str);
                Objects.requireNonNull(list);
                for (String str2 : list) {
                    try {
                        h(uri.toString(), str2);
                        h(d(str2), str2);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
