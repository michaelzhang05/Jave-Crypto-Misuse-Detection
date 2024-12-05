package com.mbridge.msdk.click.a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f18088a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static int f18089b = 1;

    /* renamed from: c, reason: collision with root package name */
    private String f18090c;

    /* renamed from: d, reason: collision with root package name */
    private int f18091d;

    /* renamed from: e, reason: collision with root package name */
    private HashSet<String> f18092e = new HashSet<>();

    /* renamed from: f, reason: collision with root package name */
    private long f18093f = System.currentTimeMillis();

    /* renamed from: g, reason: collision with root package name */
    private CampaignEx f18094g;

    /* renamed from: h, reason: collision with root package name */
    private String f18095h;

    /* renamed from: i, reason: collision with root package name */
    private int f18096i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f18097j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18098k;

    /* renamed from: l, reason: collision with root package name */
    private int f18099l;

    public b(String str, String str2) {
        this.f18090c = str;
        b(str2);
    }

    public final boolean a() {
        return this.f18097j;
    }

    public final boolean b() {
        return this.f18098k;
    }

    public final int c() {
        return this.f18099l;
    }

    public final int d() {
        return this.f18096i;
    }

    public final String e() {
        return this.f18095h;
    }

    public final CampaignEx f() {
        return this.f18094g;
    }

    public final String g() {
        return this.f18090c;
    }

    public final int h() {
        return this.f18091d;
    }

    public final HashSet<String> i() {
        return this.f18092e;
    }

    public final long j() {
        return this.f18093f;
    }

    public final void a(boolean z8) {
        this.f18097j = z8;
    }

    public final void b(boolean z8) {
        this.f18098k = z8;
    }

    public final void a(int i8) {
        this.f18099l = i8;
    }

    public final void b(int i8) {
        this.f18096i = i8;
    }

    public final void a(String str) {
        this.f18095h = str;
    }

    public final void b(String str) {
        this.f18091d++;
        this.f18092e.add(str);
    }

    public final void a(CampaignEx campaignEx) {
        this.f18094g = campaignEx;
    }
}
