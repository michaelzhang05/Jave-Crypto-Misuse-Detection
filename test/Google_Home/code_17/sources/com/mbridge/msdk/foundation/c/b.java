package com.mbridge.msdk.foundation.c;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.out.MBridgeIds;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private int f20090a;

    /* renamed from: b, reason: collision with root package name */
    private int f20091b;

    /* renamed from: c, reason: collision with root package name */
    private String f20092c;

    /* renamed from: d, reason: collision with root package name */
    private Throwable f20093d;

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f20094e;

    /* renamed from: f, reason: collision with root package name */
    private MBridgeIds f20095f;

    /* renamed from: g, reason: collision with root package name */
    private String f20096g;

    /* renamed from: h, reason: collision with root package name */
    private String f20097h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20098i;

    /* renamed from: j, reason: collision with root package name */
    private int f20099j = -1;

    /* renamed from: k, reason: collision with root package name */
    private String f20100k;

    /* renamed from: l, reason: collision with root package name */
    private HashMap<Object, Object> f20101l;

    /* renamed from: m, reason: collision with root package name */
    private int f20102m;

    /* renamed from: n, reason: collision with root package name */
    private String f20103n;

    /* renamed from: o, reason: collision with root package name */
    private String f20104o;

    /* renamed from: p, reason: collision with root package name */
    private String f20105p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20106q;

    public b(int i8) {
        this.f20090a = i8;
        this.f20091b = a.b(i8);
    }

    public final int a() {
        return this.f20090a;
    }

    public final String b() {
        String str;
        int i8;
        if (!TextUtils.isEmpty(this.f20092c)) {
            str = this.f20092c;
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) && (i8 = this.f20090a) != -1) {
            str = a.a(i8);
        }
        Throwable th = this.f20093d;
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
        return this.f20094e;
    }

    public final MBridgeIds d() {
        if (this.f20095f == null) {
            this.f20095f = new MBridgeIds();
        }
        return this.f20095f;
    }

    public final boolean e() {
        return this.f20098i;
    }

    public final int f() {
        return this.f20091b;
    }

    public final int g() {
        return this.f20099j;
    }

    public final String h() {
        return this.f20100k;
    }

    public final int i() {
        return this.f20102m;
    }

    public final String j() {
        return this.f20103n;
    }

    public final String k() {
        return this.f20104o;
    }

    public final String l() {
        return this.f20105p;
    }

    public final boolean m() {
        return this.f20106q;
    }

    public final String toString() {
        return "MBFailureReason{errorCode=" + this.f20090a + ", errorSubType=" + this.f20091b + ", message='" + this.f20092c + "', cause=" + this.f20093d + ", campaign=" + this.f20094e + ", ids=" + this.f20095f + ", requestId='" + this.f20096g + "', localRequestId='" + this.f20097h + "', isHeaderBidding=" + this.f20098i + ", typeD=" + this.f20099j + ", reasonD='" + this.f20100k + "', extraMap=" + this.f20101l + ", serverErrorCode=" + this.f20102m + ", errorUrl='" + this.f20103n + "', serverErrorResponse='" + this.f20104o + "'}";
    }

    public final void a(String str) {
        this.f20092c = str;
    }

    public final void c(String str) {
        this.f20103n = str;
    }

    public final void e(String str) {
        this.f20105p = str;
    }

    public final void a(Throwable th) {
        this.f20093d = th;
    }

    public final void a(CampaignEx campaignEx) {
        this.f20094e = campaignEx;
    }

    public final void d(String str) {
        this.f20104o = str;
    }

    public b(int i8, String str) {
        this.f20090a = i8;
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
        }
        this.f20092c = str;
        this.f20091b = a.b(i8);
    }

    public final void a(MBridgeIds mBridgeIds) {
        this.f20095f = mBridgeIds;
    }

    public final void a(boolean z8) {
        this.f20098i = z8;
    }

    public final void a(int i8) {
        this.f20091b = i8;
    }

    public final void a(Object obj, Object obj2) {
        if (this.f20101l == null) {
            this.f20101l = new HashMap<>();
        }
        this.f20101l.put(obj, obj2);
    }

    public final Object a(Object obj) {
        HashMap<Object, Object> hashMap = this.f20101l;
        if (hashMap != null && hashMap.containsKey(obj)) {
            return this.f20101l.get(obj);
        }
        return null;
    }

    public final void b(int i8) {
        this.f20099j = i8;
    }

    public b(int i8, int i9, String str) {
        if (!TextUtils.isEmpty(str)) {
            a("his_reason", str);
            this.f20092c = str;
        } else {
            this.f20092c = a.a(i9);
        }
        this.f20102m = i8;
        this.f20091b = a.b(i9);
    }

    public final void b(String str) {
        this.f20100k = str;
    }

    public final void b(boolean z8) {
        this.f20106q = z8;
    }
}
