package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@zzard
/* loaded from: classes2.dex */
public final class zzbfs implements Iterable<zzbfq> {

    /* renamed from: f, reason: collision with root package name */
    private final List<zzbfq> f13253f = new ArrayList();

    public static boolean f(zzbdf zzbdfVar) {
        zzbfq o = o(zzbdfVar);
        if (o == null) {
            return false;
        }
        o.f13250b.c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzbfq o(zzbdf zzbdfVar) {
        Iterator<zzbfq> it = zzk.zzmc().iterator();
        while (it.hasNext()) {
            zzbfq next = it.next();
            if (next.a == zzbdfVar) {
                return next;
            }
        }
        return null;
    }

    public final void a(zzbfq zzbfqVar) {
        this.f13253f.add(zzbfqVar);
    }

    public final void b(zzbfq zzbfqVar) {
        this.f13253f.remove(zzbfqVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzbfq> iterator() {
        return this.f13253f.iterator();
    }
}
