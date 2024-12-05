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
    private static d f24157c;

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f24158a;

    /* renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f24159b;

    /* renamed from: d, reason: collision with root package name */
    private g f24160d;

    /* renamed from: e, reason: collision with root package name */
    private e f24161e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f24162f;

    /* renamed from: g, reason: collision with root package name */
    private final String f24163g = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* renamed from: h, reason: collision with root package name */
    private final String f24164h = "down_type";

    private d() {
        this.f24162f = false;
        try {
            this.f24160d = g.a();
            this.f24161e = e.a.f24167a;
            this.f24158a = new CopyOnWriteArrayList<>();
            this.f24159b = new ConcurrentHashMap();
            com.mbridge.msdk.c.g b8 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
            if (b8 != null) {
                this.f24162f = b8.y(1);
            }
        } catch (Throwable th) {
            ad.a("H5DownLoadManager", th.getMessage(), th);
        }
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            try {
                if (f24157c == null) {
                    f24157c = new d();
                }
                dVar = f24157c;
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
            g gVar = this.f24160d;
            if (gVar != null) {
                return gVar.a(str);
            }
            return null;
        }
        e eVar = this.f24161e;
        return eVar != null ? eVar.a(str) : str;
    }
}
