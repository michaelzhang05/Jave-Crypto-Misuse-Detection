package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

@zzard
/* loaded from: classes2.dex */
public final class zzbja {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f13307b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13308c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, String> f13309d;

    @TargetApi(21)
    public zzbja(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public zzbja(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private zzbja(String str, Uri uri, String str2, Map<String, String> map) {
        this.a = str;
        this.f13307b = uri;
        this.f13308c = str2 == null ? "GET" : str2;
        this.f13309d = map == null ? Collections.emptyMap() : map;
    }
}
