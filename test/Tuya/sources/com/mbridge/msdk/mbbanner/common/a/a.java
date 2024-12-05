package com.mbridge.msdk.mbbanner.common.a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f20293a;

    /* renamed from: b, reason: collision with root package name */
    private String f20294b;

    /* renamed from: c, reason: collision with root package name */
    private String f20295c;

    /* renamed from: d, reason: collision with root package name */
    private String f20296d;

    /* renamed from: e, reason: collision with root package name */
    private String f20297e;

    /* renamed from: f, reason: collision with root package name */
    private String f20298f;

    /* renamed from: g, reason: collision with root package name */
    private String f20299g;

    /* renamed from: h, reason: collision with root package name */
    private int f20300h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f20301i;

    private a() {
    }

    public final a a(boolean z8) {
        this.f20301i = z8;
        return this;
    }

    public final a b(String str) {
        this.f20294b = str;
        return this;
    }

    public final a c(String str) {
        this.f20295c = str;
        return this;
    }

    public final a d(String str) {
        this.f20296d = str;
        return this;
    }

    public final a e(String str) {
        this.f20297e = str;
        return this;
    }

    public final a f(String str) {
        this.f20298f = str;
        return this;
    }

    public final a g(String str) {
        this.f20299g = str;
        return this;
    }

    public static a a() {
        return new a();
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.f20294b)) {
            sb.append("unit_id=");
            sb.append(this.f20294b);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20295c)) {
            sb.append("cid=");
            sb.append(this.f20295c);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20296d)) {
            sb.append("rid=");
            sb.append(this.f20296d);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20297e)) {
            sb.append("rid_n=");
            sb.append(this.f20297e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20298f)) {
            sb.append("creative_id=");
            sb.append(this.f20298f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f20299g)) {
            sb.append("reason=");
            sb.append(this.f20299g);
            sb.append("&");
        }
        if (this.f20300h != 0) {
            sb.append("result=");
            sb.append(this.f20300h);
            sb.append("&");
        }
        if (this.f20301i) {
            sb.append("hb=1");
            sb.append("&");
        }
        sb.append("network_type=");
        sb.append(z.l(com.mbridge.msdk.foundation.controller.c.m().c()));
        sb.append("&");
        if (!TextUtils.isEmpty(this.f20293a)) {
            sb.append("key=");
            sb.append(this.f20293a);
        }
        return sb.toString();
    }

    public final a a(String str) {
        this.f20293a = str;
        return this;
    }

    public final a a(int i8) {
        this.f20300h = i8;
        return this;
    }
}
