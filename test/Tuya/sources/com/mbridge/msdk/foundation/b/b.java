package com.mbridge.msdk.foundation.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f19011a;

    /* renamed from: b, reason: collision with root package name */
    private double f19012b;

    /* renamed from: c, reason: collision with root package name */
    private String f19013c;

    /* renamed from: d, reason: collision with root package name */
    private String f19014d;

    /* renamed from: e, reason: collision with root package name */
    private int f19015e;

    /* renamed from: f, reason: collision with root package name */
    private long f19016f;

    /* renamed from: g, reason: collision with root package name */
    private int f19017g;

    /* renamed from: h, reason: collision with root package name */
    private long f19018h;

    /* renamed from: i, reason: collision with root package name */
    private String f19019i;

    /* renamed from: j, reason: collision with root package name */
    private long f19020j;

    public final long a() {
        return this.f19020j;
    }

    public final CopyOnWriteArrayList<CampaignEx> b() {
        return this.f19011a;
    }

    public final double c() {
        return this.f19012b;
    }

    public final String d() {
        return this.f19013c;
    }

    public final String e() {
        return this.f19014d;
    }

    public final int f() {
        return this.f19015e;
    }

    public final int g() {
        return this.f19017g;
    }

    public final long h() {
        return this.f19018h;
    }

    public final void a(long j8) {
        this.f19020j = j8;
    }

    public final void b(String str) {
        this.f19013c = str;
    }

    public final void c(String str) {
        this.f19014d = str;
    }

    public final void d(String str) {
        this.f19019i = str;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f19011a = copyOnWriteArrayList;
    }

    public final void b(int i8) {
        this.f19017g = i8;
    }

    public final void c(long j8) {
        this.f19016f = j8;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String a8 = x.a(str);
        if (TextUtils.isEmpty(a8)) {
            return;
        }
        try {
            double parseDouble = Double.parseDouble(a8);
            if (parseDouble <= 0.0d) {
                return;
            }
            this.f19012b = parseDouble;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(long j8) {
        this.f19018h = j8;
    }

    public final void a(int i8) {
        this.f19015e = i8;
    }
}
