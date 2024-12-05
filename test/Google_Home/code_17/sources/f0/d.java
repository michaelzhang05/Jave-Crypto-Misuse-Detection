package F0;

import B0.a;
import G0.h;
import android.os.Bundle;
import b1.InterfaceC1955a;
import b1.InterfaceC1956b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1955a f2677a;

    /* renamed from: b, reason: collision with root package name */
    private volatile H0.a f2678b;

    /* renamed from: c, reason: collision with root package name */
    private volatile I0.b f2679c;

    /* renamed from: d, reason: collision with root package name */
    private final List f2680d;

    public d(InterfaceC1955a interfaceC1955a) {
        this(interfaceC1955a, new I0.c(), new H0.f());
    }

    private void f() {
        this.f2677a.a(new InterfaceC1955a.InterfaceC0356a() { // from class: F0.c
            @Override // b1.InterfaceC1955a.InterfaceC0356a
            public final void a(InterfaceC1956b interfaceC1956b) {
                d.this.i(interfaceC1956b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f2678b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(I0.a aVar) {
        synchronized (this) {
            try {
                if (this.f2679c instanceof I0.c) {
                    this.f2680d.add(aVar);
                }
                this.f2679c.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(InterfaceC1956b interfaceC1956b) {
        h.f().b("AnalyticsConnector now available.");
        B0.a aVar = (B0.a) interfaceC1956b.get();
        H0.e eVar = new H0.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) != null) {
            h.f().b("Registered Firebase Analytics listener.");
            H0.d dVar = new H0.d();
            H0.c cVar = new H0.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                try {
                    Iterator it = this.f2680d.iterator();
                    while (it.hasNext()) {
                        dVar.a((I0.a) it.next());
                    }
                    eVar2.d(dVar);
                    eVar2.e(cVar);
                    this.f2679c = dVar;
                    this.f2678b = cVar;
                } finally {
                }
            }
            return;
        }
        h.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    private static a.InterfaceC0006a j(B0.a aVar, e eVar) {
        a.InterfaceC0006a a8 = aVar.a("clx", eVar);
        if (a8 == null) {
            h.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a8 = aVar.a("crash", eVar);
            if (a8 != null) {
                h.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a8;
    }

    public H0.a d() {
        return new H0.a() { // from class: F0.b
            @Override // H0.a
            public final void a(String str, Bundle bundle) {
                d.this.g(str, bundle);
            }
        };
    }

    public I0.b e() {
        return new I0.b() { // from class: F0.a
            @Override // I0.b
            public final void a(I0.a aVar) {
                d.this.h(aVar);
            }
        };
    }

    public d(InterfaceC1955a interfaceC1955a, I0.b bVar, H0.a aVar) {
        this.f2677a = interfaceC1955a;
        this.f2679c = bVar;
        this.f2680d = new ArrayList();
        this.f2678b = aVar;
        f();
    }
}
