package com.mbridge.msdk.e;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class i implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static String f19940a = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_count INTEGER)";

    /* renamed from: b, reason: collision with root package name */
    static String f19941b = "DROP TABLE IF EXISTS %s";

    /* renamed from: c, reason: collision with root package name */
    private final e f19942c;

    /* renamed from: d, reason: collision with root package name */
    private int f19943d;

    /* renamed from: e, reason: collision with root package name */
    private int f19944e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19945f;

    /* renamed from: g, reason: collision with root package name */
    private long f19946g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f19947h = false;

    /* renamed from: i, reason: collision with root package name */
    private boolean f19948i = false;

    public i(e eVar) {
        this.f19942c = eVar;
        this.f19945f = eVar.e();
    }

    public final void a(boolean z8) {
        this.f19947h = z8;
    }

    public final void b(boolean z8) {
        this.f19948i = z8;
    }

    public final e c() {
        return this.f19942c;
    }

    public final int d() {
        return this.f19943d;
    }

    public final int e() {
        return this.f19944e;
    }

    public final String f() {
        return this.f19945f;
    }

    public final long g() {
        return this.f19946g;
    }

    public final boolean a() {
        return this.f19947h;
    }

    public final boolean b() {
        return this.f19948i;
    }

    public final void a(int i8) {
        this.f19943d = i8;
    }

    public final void b(int i8) {
        this.f19944e = i8;
    }

    public final void a(long j8) {
        this.f19946g = j8;
    }
}
