package com.mbridge.msdk.foundation.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f19035a;

    /* renamed from: b, reason: collision with root package name */
    private int f19036b;

    /* renamed from: c, reason: collision with root package name */
    private String f19037c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f19038d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f19039e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f19040f;

    /* renamed from: g, reason: collision with root package name */
    private String f19041g;

    /* renamed from: h, reason: collision with root package name */
    private String f19042h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19043i;

    /* renamed from: j, reason: collision with root package name */
    private int f19044j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f19045k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f19046l;

    /* renamed from: m, reason: collision with root package name */
    private int f19047m;

    /* renamed from: n, reason: collision with root package name */
    private String f19048n;

    /* renamed from: o, reason: collision with root package name */
    private String f19049o;

    /* renamed from: p, reason: collision with root package name */
    private String f19050p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f19051q;

    public b(int i8) {
        this.f19035a = i8;
        this.f19036b = a.b(i8);
    }

    public final int a() {
        return this.f19035a;
    }

    public final String b() {
        String str;
        int i8;
        if (!TextUtils.isEmpty(this.f19037c)) {
            str = this.f19037c;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (i8 = this.f19035a) != -1) {
            str = a.a(i8);
        }
        Throwable th = this.f19038d;
        if (th == null) {
            return str;
        }
        String message = th.getMessage();
        if (TextUtils.isEmpty(message)) {
            return str;
        }
        return str + " # " + message;
    }

    public final CampaignEx c() {
        return this.f19039e;
    }

    public final MBridgeIds d() {
        if (this.f19040f == null) {
            this.f19040f = new MBridgeIds();
        }
        return this.f19040f;
    }

    public final boolean e() {
        return this.f19043i;
    }

    public final int f() {
        return this.f19036b;
    }

    public final int g() {
        return this.f19044j;
    }

    public final String h() {
        return this.f19045k;
    }

    public final int i() {
        return this.f19047m;
    }

    public final String j() {
        return this.f19048n;
    }

    public final String k() {
        return this.f19049o;
    }

    public final String l() {
        return this.f19050p;
    }

    public final boolean m() {
        return this.f19051q;
    }

    public final String toString() {
        return "MBFailureReason{errorCode=" + this.f19035a + ", errorSubType=" + this.f19036b + ", message='" + this.f19037c + "', cause=" + this.f19038d + ", campaign=" + this.f19039e + ", ids=" + this.f19040f + ", requestId='" + this.f19041g + "', localRequestId='" + this.f19042h + "', isHeaderBidding=" + this.f19043i + ", typeD=" + this.f19044j + ", reasonD='" + this.f19045k + "', extraMap=" + this.f19046l + ", serverErrorCode=" + this.f19047m + ", errorUrl='" + this.f19048n + "', serverErrorResponse='" + this.f19049o + "'}";
    }

    public final void a(String str) {
        this.f19037c = str;
    }

    public final void c(String str) {
        this.f19048n = str;
    }

    public final void e(String str) {
        this.f19050p = str;
    }

    public final void a(Throwable th) {
        this.f19038d = th;
    }

    public final void a(CampaignEx campaignEx) {
        this.f19039e = campaignEx;
    }

    public final void d(String str) {
        this.f19049o = str;
    }

    public b(int i8, String str) {
        this.f19035a = i8;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f19037c = str;
        this.f19036b = a.b(i8);
    }

    public final void a(MBridgeIds mBridgeIds) {
        this.f19040f = mBridgeIds;
    }

    public final void a(boolean z8) {
        this.f19043i = z8;
    }

    public final void a(int i8) {
        this.f19036b = i8;
    }

    public final void a(Object obj, Object obj2) {
        if (this.f19046l == null) {
            this.f19046l = new HashMap<>();
        }
        this.f19046l.put(obj, obj2);
    }

    public final Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.f19046l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.f19046l.get(obj);
        }
        return null;
    }

    public final void b(int i8) {
        this.f19044j = i8;
    }

    public b(int i8, int i9, String str) {
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
            this.f19037c = str;
        } else {
            this.f19037c = a.a(i9);
        }
        this.f19047m = i8;
        this.f19036b = a.b(i9);
    }

    public final void b(String str) {
        this.f19045k = str;
    }

    public final void b(boolean z8) {
        this.f19051q = z8;
    }
}
