package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class zzbts<ListenerT> {

    /* renamed from: f, reason: collision with root package name */
    private final Map<ListenerT, Executor> f13548f = new HashMap();

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbts(Set<zzbuz<ListenerT>> set) {
        X(set);
    }

    private final synchronized void X(Set<zzbuz<ListenerT>> set) {
        Iterator<zzbuz<ListenerT>> it = set.iterator();
        while (it.hasNext()) {
            U(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void T(final zzbtu<ListenerT> zzbtuVar) {
        for (Map.Entry<ListenerT, Executor> entry : this.f13548f.entrySet()) {
            final ListenerT key = entry.getKey();
            entry.getValue().execute(new Runnable(zzbtuVar, key) { // from class: com.google.android.gms.internal.ads.te

                /* renamed from: f, reason: collision with root package name */
                private final zzbtu f12198f;

                /* renamed from: g, reason: collision with root package name */
                private final Object f12199g;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.f12198f = zzbtuVar;
                    this.f12199g = key;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        this.f12198f.a(this.f12199g);
                    } catch (Throwable th) {
                        zzk.zzlk().h(th, "EventEmitter.notify");
                        zzawz.l("Event emitter exception.", th);
                    }
                }
            });
        }
    }

    public final synchronized void U(zzbuz<ListenerT> zzbuzVar) {
        V(zzbuzVar.a, zzbuzVar.f13568b);
    }

    public final synchronized void V(ListenerT listenert, Executor executor) {
        this.f13548f.put(listenert, executor);
    }
}
