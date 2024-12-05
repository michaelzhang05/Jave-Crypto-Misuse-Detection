package com.mbridge.msdk.foundation.b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f20066a;

    /* renamed from: b, reason: collision with root package name */
    private double f20067b;

    /* renamed from: c, reason: collision with root package name */
    private String f20068c;

    /* renamed from: d, reason: collision with root package name */
    private String f20069d;

    /* renamed from: e, reason: collision with root package name */
    private int f20070e;

    /* renamed from: f, reason: collision with root package name */
    private long f20071f;

    /* renamed from: g, reason: collision with root package name */
    private int f20072g;

    /* renamed from: h, reason: collision with root package name */
    private long f20073h;

    /* renamed from: i, reason: collision with root package name */
    private String f20074i;

    /* renamed from: j, reason: collision with root package name */
    private long f20075j;

    public final long a() {
        return this.f20075j;
    }

    public final CopyOnWriteArrayList<CampaignEx> b() {
        return this.f20066a;
    }

    public final double c() {
        return this.f20067b;
    }

    public final String d() {
        return this.f20068c;
    }

    public final String e() {
        return this.f20069d;
    }

    public final int f() {
        return this.f20070e;
    }

    public final int g() {
        return this.f20072g;
    }

    public final long h() {
        return this.f20073h;
    }

    public final void a(long j8) {
        this.f20075j = j8;
    }

    public final void b(String str) {
        this.f20068c = str;
    }

    public final void c(String str) {
        this.f20069d = str;
    }

    public final void d(String str) {
        this.f20074i = str;
    }

    public final void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f20066a = copyOnWriteArrayList;
    }

    public final void b(int i8) {
        this.f20072g = i8;
    }

    public final void c(long j8) {
        this.f20071f = j8;
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
            this.f20067b = parseDouble;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public final void b(long j8) {
        this.f20073h = j8;
    }

    public final void a(int i8) {
        this.f20070e = i8;
    }
}
