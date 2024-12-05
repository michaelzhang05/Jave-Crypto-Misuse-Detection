package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class qv implements nw {
    private static final zv a = new sv();

    /* renamed from: b, reason: collision with root package name */
    private final zv f12071b;

    public qv() {
        this(new tv(gv.c(), c()));
    }

    private static boolean b(yv yvVar) {
        return yvVar.c() == zzdob.zze.f14852i;
    }

    private static zv c() {
        try {
            return (zv) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return a;
        }
    }

    @Override // com.google.android.gms.internal.ads.nw
    public final <T> mw<T> a(Class<T> cls) {
        ow.L(cls);
        yv a2 = this.f12071b.a(cls);
        if (a2.a()) {
            if (zzdob.class.isAssignableFrom(cls)) {
                return cw.k(ow.s(), yu.b(), a2.b());
            }
            return cw.k(ow.q(), yu.c(), a2.b());
        }
        if (zzdob.class.isAssignableFrom(cls)) {
            if (b(a2)) {
                return bw.p(cls, a2, fw.b(), lv.d(), ow.s(), yu.b(), xv.b());
            }
            return bw.p(cls, a2, fw.b(), lv.d(), ow.s(), null, xv.b());
        }
        if (b(a2)) {
            return bw.p(cls, a2, fw.a(), lv.c(), ow.q(), yu.c(), xv.a());
        }
        return bw.p(cls, a2, fw.a(), lv.c(), ow.r(), null, xv.a());
    }

    private qv(zv zvVar) {
        this.f12071b = (zv) zzdod.d(zvVar, "messageInfoFactory");
    }
}
