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
    protected Context f19805a;

    /* renamed from: b, reason: collision with root package name */
    protected h f19806b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.h f19807c;

    public a(h hVar) {
        Context context;
        this.f19807c = null;
        this.f19806b = hVar;
        Context c8 = c.m().c();
        this.f19805a = c8;
        this.f19807c = com.mbridge.msdk.foundation.db.h.a(c8);
        if (this.f19806b != null && (context = this.f19805a) != null) {
            int l8 = z.l(context);
            this.f19806b.d(l8);
            this.f19806b.c(z.a(this.f19805a, l8));
        }
    }

    public final void a() {
        if (this.f19806b != null) {
            l.a(this.f19807c).a(this.f19806b);
        }
    }

    public final void b(int i8) {
        h hVar = this.f19806b;
        if (hVar != null) {
            hVar.a(i8);
        }
    }

    public final void c(int i8) {
        h hVar = this.f19806b;
        if (hVar != null) {
            hVar.c(i8);
        }
    }

    public final void b(String str) {
        h hVar = this.f19806b;
        if (hVar != null) {
            hVar.b(str);
        }
    }

    public final void a(int i8) {
        h hVar = this.f19806b;
        if (hVar != null) {
            hVar.b(i8);
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f19806b.a(str);
    }
}
