package D0;

import Z0.a;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import z0.InterfaceC4011a;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final Z0.a f1370a;

    /* renamed from: b, reason: collision with root package name */
    private volatile F0.a f1371b;

    /* renamed from: c, reason: collision with root package name */
    private volatile G0.b f1372c;

    /* renamed from: d, reason: collision with root package name */
    private final List f1373d;

    public d(Z0.a aVar) {
        this(aVar, new G0.c(), new F0.f());
    }

    private void f() {
        this.f1370a.a(new a.InterfaceC0257a() { // from class: D0.c
            @Override // Z0.a.InterfaceC0257a
            public final void a(Z0.b bVar) {
                d.this.i(bVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f1371b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(G0.a aVar) {
        synchronized (this) {
            try {
                if (this.f1372c instanceof G0.c) {
                    this.f1373d.add(aVar);
                }
                this.f1372c.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Z0.b bVar) {
        E0.f.f().b("AnalyticsConnector now available.");
        InterfaceC4011a interfaceC4011a = (InterfaceC4011a) bVar.get();
        F0.e eVar = new F0.e(interfaceC4011a);
        e eVar2 = new e();
        if (j(interfaceC4011a, eVar2) != null) {
            E0.f.f().b("Registered Firebase Analytics listener.");
            F0.d dVar = new F0.d();
            F0.c cVar = new F0.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                try {
                    Iterator it = this.f1373d.iterator();
                    while (it.hasNext()) {
                        dVar.a((G0.a) it.next());
                    }
                    eVar2.d(dVar);
                    eVar2.e(cVar);
                    this.f1372c = dVar;
                    this.f1371b = cVar;
                } finally {
                }
            }
            return;
        }
        E0.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static InterfaceC4011a.InterfaceC0920a j(InterfaceC4011a interfaceC4011a, e eVar) {
        InterfaceC4011a.InterfaceC0920a a8 = interfaceC4011a.a("clx", eVar);
        if (a8 == null) {
            E0.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a8 = interfaceC4011a.a("crash", eVar);
            if (a8 != null) {
                E0.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a8;
    }

    public F0.a d() {
        return new F0.a() { // from class: D0.b
            @Override // F0.a
            public final void a(String str, Bundle bundle) {
                d.this.g(str, bundle);
            }
        };
    }

    public G0.b e() {
        return new G0.b() { // from class: D0.a
            @Override // G0.b
            public final void a(G0.a aVar) {
                d.this.h(aVar);
            }
        };
    }

    public d(Z0.a aVar, G0.b bVar, F0.a aVar2) {
        this.f1370a = aVar;
        this.f1372c = bVar;
        this.f1373d = new ArrayList();
        this.f1371b = aVar2;
        f();
    }
}
