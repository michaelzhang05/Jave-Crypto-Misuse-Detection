package com.flurry.sdk;

import com.flurry.sdk.f3;

/* loaded from: classes2.dex */
public final class d3 implements f3 {

    /* renamed from: k, reason: collision with root package name */
    private int f9814k = 0;

    @Override // com.flurry.sdk.f3
    public final void a() {
        this.f9814k = 0;
    }

    @Override // com.flurry.sdk.f3
    public final f3.a b(u6 u6Var) {
        if (u6Var.a().equals(s6.FLUSH_FRAME)) {
            return new f3.a(f3.b.DO_NOT_DROP, new c4(new d4(this.f9814k)));
        }
        if (!u6Var.a().equals(s6.ANALYTICS_ERROR)) {
            return f3.a;
        }
        if (p7.UNCAUGHT_EXCEPTION_ID.f10123i.equals(((t3) u6Var.f()).f10175c)) {
            return f3.a;
        }
        int i2 = this.f9814k;
        this.f9814k = i2 + 1;
        if (i2 >= 50) {
            return f3.f9862h;
        }
        return f3.a;
    }
}
