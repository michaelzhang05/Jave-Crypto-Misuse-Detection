package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public abstract class a<Resource> implements o {

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f22159b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f22160c;

    /* renamed from: d, reason: collision with root package name */
    private int f22161d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22162e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22163f = false;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f22158a = false;

    public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        this.f22159b = bVar;
        this.f22160c = aVar;
    }

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.f22159b;
    }

    public final com.mbridge.msdk.newreward.function.d.a.a b() {
        return this.f22160c;
    }

    public boolean c() {
        if (!TextUtils.isEmpty(j()) && !g() && !this.f22162e) {
            return false;
        }
        return true;
    }

    public boolean d() {
        if (!TextUtils.isEmpty(j()) && !i() && !this.f22163f) {
            return false;
        }
        return true;
    }

    public final int e() {
        return this.f22161d;
    }

    public final void a(boolean z8) {
        this.f22158a = z8;
    }

    public final void b(boolean z8) {
        this.f22162e = z8;
    }

    public final void a(int i8) {
        this.f22161d = i8;
    }
}
