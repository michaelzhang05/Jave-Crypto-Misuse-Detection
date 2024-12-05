package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.videocommon.download.e;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class d {

    /* renamed from: c, reason: collision with root package name */
    private static d f23102c;

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f23103a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f23104b;

    /* renamed from: d, reason: collision with root package name */
    private g f23105d;

    /* renamed from: e, reason: collision with root package name */
    private e f23106e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f23107f;

    /* renamed from: g, reason: collision with root package name */
    private final String f23108g = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* renamed from: h, reason: collision with root package name */
    private final String f23109h = "down_type";

    private d() {
        this.f23107f = false;
        try {
            this.f23105d = g.a();
            this.f23106e = e.a.f23112a;
            this.f23103a = new CopyOnWriteArrayList<>();
            this.f23104b = new ConcurrentHashMap();
            com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b8 != null) {
                this.f23107f = b8.y(1);
            }
        } catch (Throwable th) {
            ad.a("H5DownLoadManager", th.getMessage(), th);
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f23102c == null) {
                    f23102c = new d();
                }
                dVar = f23102c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    public final String a(String str) {
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (!Patterns.WEB_URL.matcher(str).matches()) {
            if (URLUtil.isValidUrl(str)) {
            }
            return str;
        }
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
            return str;
        }
        if (path.toLowerCase().endsWith(".zip")) {
            g gVar = this.f23105d;
            if (gVar != null) {
                return gVar.a(str);
            }
            return null;
        }
        e eVar = this.f23106e;
        return eVar != null ? eVar.a(str) : str;
    }
}
