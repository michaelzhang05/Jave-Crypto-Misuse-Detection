package com.mbridge.msdk.click.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f19143a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f19144b = 1;

    /* renamed from: c, reason: collision with root package name */
    private String f19145c;

    /* renamed from: d, reason: collision with root package name */
    private int f19146d;

    /* renamed from: e, reason: collision with root package name */
    private HashSet<String> f19147e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private long f19148f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private CampaignEx f19149g;

    /* renamed from: h, reason: collision with root package name */
    private String f19150h;

    /* renamed from: i, reason: collision with root package name */
    private int f19151i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f19152j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19153k;

    /* renamed from: l, reason: collision with root package name */
    private int f19154l;

    public b(String str, String str2) {
        this.f19145c = str;
        b(str2);
    }

    public final boolean a() {
        return this.f19152j;
    }

    public final boolean b() {
        return this.f19153k;
    }

    public final int c() {
        return this.f19154l;
    }

    public final int d() {
        return this.f19151i;
    }

    public final String e() {
        return this.f19150h;
    }

    public final CampaignEx f() {
        return this.f19149g;
    }

    public final String g() {
        return this.f19145c;
    }

    public final int h() {
        return this.f19146d;
    }

    public final HashSet<String> i() {
        return this.f19147e;
    }

    public final long j() {
        return this.f19148f;
    }

    public final void a(boolean z8) {
        this.f19152j = z8;
    }

    public final void b(boolean z8) {
        this.f19153k = z8;
    }

    public final void a(int i8) {
        this.f19154l = i8;
    }

    public final void b(int i8) {
        this.f19151i = i8;
    }

    public final void a(String str) {
        this.f19150h = str;
    }

    public final void b(String str) {
        this.f19146d++;
        this.f19147e.add(str);
    }

    public final void a(CampaignEx campaignEx) {
        this.f19149g = campaignEx;
    }
}
