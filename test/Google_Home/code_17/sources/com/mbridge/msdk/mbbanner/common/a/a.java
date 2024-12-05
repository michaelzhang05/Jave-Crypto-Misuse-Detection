package com.mbridge.msdk.mbbanner.common.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f21348a;

    /* renamed from: b, reason: collision with root package name */
    private String f21349b;

    /* renamed from: c, reason: collision with root package name */
    private String f21350c;

    /* renamed from: d, reason: collision with root package name */
    private String f21351d;

    /* renamed from: e, reason: collision with root package name */
    private String f21352e;

    /* renamed from: f, reason: collision with root package name */
    private String f21353f;

    /* renamed from: g, reason: collision with root package name */
    private String f21354g;

    /* renamed from: h, reason: collision with root package name */
    private int f21355h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f21356i;

    private a() {
    }

    public final a a(boolean z8) {
        this.f21356i = z8;
        return this;
    }

    public final a b(String str) {
        this.f21349b = str;
        return this;
    }

    public final a c(String str) {
        this.f21350c = str;
        return this;
    }

    public final a d(String str) {
        this.f21351d = str;
        return this;
    }

    public final a e(String str) {
        this.f21352e = str;
        return this;
    }

    public final a f(String str) {
        this.f21353f = str;
        return this;
    }

    public final a g(String str) {
        this.f21354g = str;
        return this;
    }

    public static a a() {
        return new a();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f21349b)) {
            sb.append("unit_id=");
            sb.append(this.f21349b);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21350c)) {
            sb.append("cid=");
            sb.append(this.f21350c);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21351d)) {
            sb.append("rid=");
            sb.append(this.f21351d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21352e)) {
            sb.append("rid_n=");
            sb.append(this.f21352e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21353f)) {
            sb.append("creative_id=");
            sb.append(this.f21353f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f21354g)) {
            sb.append("reason=");
            sb.append(this.f21354g);
            sb.append("&");
        }
        if (this.f21355h != 0) {
            sb.append("result=");
            sb.append(this.f21355h);
            sb.append("&");
        }
        if (this.f21356i) {
            sb.append("hb=1");
            sb.append("&");
        }
        sb.append("network_type=");
        sb.append(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        sb.append("&");
        if (!TextUtils.isEmpty(this.f21348a)) {
            sb.append("key=");
            sb.append(this.f21348a);
        }
        return sb.toString();
    }

    public final a a(String str) {
        this.f21348a = str;
        return this;
    }

    public final a a(int i8) {
        this.f21355h = i8;
        return this;
    }
}
