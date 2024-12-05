package B0;

import A0.f;
import B0.a;
import Q.AbstractC1400p;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C2077b1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import k0.C3210a;

/* loaded from: classes.dex */
public class b implements B0.a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile B0.a f715c;

    /* renamed from: a, reason: collision with root package name */
    private final C3210a f716a;

    /* renamed from: b, reason: collision with root package name */
    final Map f717b;

    /* loaded from: classes.dex */
    class a implements a.InterfaceC0006a {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ String f718a;

        /* renamed from: b, reason: collision with root package name */
        private final /* synthetic */ b f719b;

        a(b bVar, String str) {
            this.f718a = str;
            this.f719b = bVar;
        }
    }

    private b(C3210a c3210a) {
        AbstractC1400p.l(c3210a);
        this.f716a = c3210a;
        this.f717b = new ConcurrentHashMap();
    }

    public static B0.a d(f fVar, Context context, Y0.d dVar) {
        AbstractC1400p.l(fVar);
        AbstractC1400p.l(context);
        AbstractC1400p.l(dVar);
        AbstractC1400p.l(context.getApplicationContext());
        if (f715c == null) {
            synchronized (b.class) {
                try {
                    if (f715c == null) {
                        Bundle bundle = new Bundle(1);
                        if (fVar.u()) {
                            dVar.b(A0.b.class, new Executor() { // from class: B0.d
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new Y0.b() { // from class: B0.c
                                @Override // Y0.b
                                public final void a(Y0.a aVar) {
                                    b.e(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", fVar.t());
                        }
                        f715c = new b(C2077b1.f(context, null, null, null, bundle).x());
                    }
                } finally {
                }
            }
        }
        return f715c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(Y0.a aVar) {
        throw null;
    }

    private final boolean f(String str) {
        if (!str.isEmpty() && this.f717b.containsKey(str) && this.f717b.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // B0.a
    public a.InterfaceC0006a a(String str, a.b bVar) {
        Object obj;
        AbstractC1400p.l(bVar);
        if (!com.google.firebase.analytics.connector.internal.c.g(str) || f(str)) {
            return null;
        }
        C3210a c3210a = this.f716a;
        if ("fiam".equals(str)) {
            obj = new com.google.firebase.analytics.connector.internal.b(c3210a, bVar);
        } else if ("clx".equals(str)) {
            obj = new com.google.firebase.analytics.connector.internal.d(c3210a, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f717b.put(str, obj);
        return new a(this, str);
    }

    @Override // B0.a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (!com.google.firebase.analytics.connector.internal.c.g(str) || !com.google.firebase.analytics.connector.internal.c.c(str2, bundle) || !com.google.firebase.analytics.connector.internal.c.e(str, str2, bundle)) {
            return;
        }
        com.google.firebase.analytics.connector.internal.c.b(str, str2, bundle);
        this.f716a.a(str, str2, bundle);
    }

    @Override // B0.a
    public void c(String str, String str2, Object obj) {
        if (!com.google.firebase.analytics.connector.internal.c.g(str) || !com.google.firebase.analytics.connector.internal.c.d(str, str2)) {
            return;
        }
        this.f716a.c(str, str2, obj);
    }
}
