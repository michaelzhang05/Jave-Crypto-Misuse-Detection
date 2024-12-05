package z0;

import R.AbstractC1319p;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.X0;
import com.google.firebase.analytics.connector.internal.f;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import l0.C3162a;
import y0.e;
import z0.InterfaceC4011a;

/* renamed from: z0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4012b implements InterfaceC4011a {

    /* renamed from: c, reason: collision with root package name */
    private static volatile InterfaceC4011a f40042c;

    /* renamed from: a, reason: collision with root package name */
    final C3162a f40043a;

    /* renamed from: b, reason: collision with root package name */
    final Map f40044b;

    /* renamed from: z0.b$a */
    /* loaded from: classes3.dex */
    class a implements InterfaceC4011a.InterfaceC0920a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40045a;

        a(String str) {
            this.f40045a = str;
        }
    }

    C4012b(C3162a c3162a) {
        AbstractC1319p.l(c3162a);
        this.f40043a = c3162a;
        this.f40044b = new ConcurrentHashMap();
    }

    public static InterfaceC4011a d(e eVar, Context context, W0.d dVar) {
        AbstractC1319p.l(eVar);
        AbstractC1319p.l(context);
        AbstractC1319p.l(dVar);
        AbstractC1319p.l(context.getApplicationContext());
        if (f40042c == null) {
            synchronized (C4012b.class) {
                try {
                    if (f40042c == null) {
                        Bundle bundle = new Bundle(1);
                        if (eVar.u()) {
                            dVar.b(y0.b.class, new Executor() { // from class: z0.c
                                @Override // java.util.concurrent.Executor
                                public final void execute(Runnable runnable) {
                                    runnable.run();
                                }
                            }, new W0.b() { // from class: z0.d
                                @Override // W0.b
                                public final void a(W0.a aVar) {
                                    C4012b.e(aVar);
                                }
                            });
                            bundle.putBoolean("dataCollectionDefaultEnabled", eVar.t());
                        }
                        f40042c = new C4012b(X0.r(context, null, null, null, bundle).o());
                    }
                } finally {
                }
            }
        }
        return f40042c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void e(W0.a aVar) {
        throw null;
    }

    private final boolean f(String str) {
        if (!str.isEmpty() && this.f40044b.containsKey(str) && this.f40044b.get(str) != null) {
            return true;
        }
        return false;
    }

    @Override // z0.InterfaceC4011a
    public InterfaceC4011a.InterfaceC0920a a(String str, InterfaceC4011a.b bVar) {
        Object obj;
        AbstractC1319p.l(bVar);
        if (!com.google.firebase.analytics.connector.internal.b.d(str) || f(str)) {
            return null;
        }
        C3162a c3162a = this.f40043a;
        if ("fiam".equals(str)) {
            obj = new com.google.firebase.analytics.connector.internal.d(c3162a, bVar);
        } else if ("clx".equals(str)) {
            obj = new f(c3162a, bVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        this.f40044b.put(str, obj);
        return new a(str);
    }

    @Override // z0.InterfaceC4011a
    public void b(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (com.google.firebase.analytics.connector.internal.b.d(str) && com.google.firebase.analytics.connector.internal.b.b(str2, bundle) && com.google.firebase.analytics.connector.internal.b.a(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.f40043a.a(str, str2, bundle);
        }
    }

    @Override // z0.InterfaceC4011a
    public void c(String str, String str2, Object obj) {
        if (!com.google.firebase.analytics.connector.internal.b.d(str) || !com.google.firebase.analytics.connector.internal.b.e(str, str2)) {
            return;
        }
        this.f40043a.c(str, str2, obj);
    }
}
