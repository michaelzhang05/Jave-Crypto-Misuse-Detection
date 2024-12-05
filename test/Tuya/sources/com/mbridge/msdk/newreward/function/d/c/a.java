package com.mbridge.msdk.newreward.function.d.c;

import android.text.TextUtils;

/* loaded from: classes4.dex */
public abstract class a<Resource> implements o {

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f21104b;

    /* renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f21105c;

    /* renamed from: d, reason: collision with root package name */
    private int f21106d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f21107e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f21108f = false;

    /* renamed from: a, reason: collision with root package name */
    protected boolean f21103a = false;

    public a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        this.f21104b = bVar;
        this.f21105c = aVar;
    }

    public final com.mbridge.msdk.newreward.function.d.a.b a() {
        return this.f21104b;
    }

    public final com.mbridge.msdk.newreward.function.d.a.a b() {
        return this.f21105c;
    }

    public boolean c() {
        if (!TextUtils.isEmpty(j()) && !g() && !this.f21107e) {
            return false;
        }
        return true;
    }

    public boolean d() {
        if (!TextUtils.isEmpty(j()) && !i() && !this.f21108f) {
            return false;
        }
        return true;
    }

    public final int e() {
        return this.f21106d;
    }

    public final void a(boolean z8) {
        this.f21103a = z8;
    }

    public final void b(boolean z8) {
        this.f21107e = z8;
    }

    public final void a(int i8) {
        this.f21106d = i8;
    }
}
