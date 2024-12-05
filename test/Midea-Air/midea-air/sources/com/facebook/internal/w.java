package com.facebook.internal;

import java.util.EnumSet;
import java.util.Iterator;

/* compiled from: SmartLoginOption.java */
/* loaded from: classes.dex */
public enum w {
    None(0),
    Enabled(1),
    RequireConfirm(2);


    /* renamed from: i, reason: collision with root package name */
    public static final EnumSet<w> f9229i = EnumSet.allOf(w.class);

    /* renamed from: k, reason: collision with root package name */
    private final long f9231k;

    w(long j2) {
        this.f9231k = j2;
    }

    public static EnumSet<w> f(long j2) {
        EnumSet<w> noneOf = EnumSet.noneOf(w.class);
        Iterator it = f9229i.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if ((wVar.d() & j2) != 0) {
                noneOf.add(wVar);
            }
        }
        return noneOf;
    }

    public long d() {
        return this.f9231k;
    }
}
