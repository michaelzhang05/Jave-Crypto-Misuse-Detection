package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdob;

/* loaded from: classes2.dex */
final class gv implements zv {
    private static final gv a = new gv();

    private gv() {
    }

    public static gv c() {
        return a;
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final yv a(Class<?> cls) {
        if (!zzdob.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (yv) zzdob.w(cls.asSubclass(zzdob.class)).q(zzdob.zze.f14846c, null, null);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final boolean b(Class<?> cls) {
        return zzdob.class.isAssignableFrom(cls);
    }
}
