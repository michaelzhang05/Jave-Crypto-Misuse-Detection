package com.mbridge.msdk.foundation.same.report.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected Context f20860a;

    /* renamed from: b, reason: collision with root package name */
    protected h f20861b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.h f20862c;

    public a(h hVar) {
        Context context;
        this.f20862c = null;
        this.f20861b = hVar;
        Context c8 = c.m().c();
        this.f20860a = c8;
        this.f20862c = com.mbridge.msdk.foundation.db.h.a(c8);
        if (this.f20861b != null && (context = this.f20860a) != null) {
            int l8 = z.l(context);
            this.f20861b.d(l8);
            this.f20861b.c(z.a(this.f20860a, l8));
        }
    }

    public final void a() {
        if (this.f20861b != null) {
            l.a(this.f20862c).a(this.f20861b);
        }
    }

    public final void b(int i8) {
        h hVar = this.f20861b;
        if (hVar != null) {
            hVar.a(i8);
        }
    }

    public final void c(int i8) {
        h hVar = this.f20861b;
        if (hVar != null) {
            hVar.c(i8);
        }
    }

    public final void b(String str) {
        h hVar = this.f20861b;
        if (hVar != null) {
            hVar.b(str);
        }
    }

    public final void a(int i8) {
        h hVar = this.f20861b;
        if (hVar != null) {
            hVar.b(i8);
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f20861b.a(str);
    }
}
