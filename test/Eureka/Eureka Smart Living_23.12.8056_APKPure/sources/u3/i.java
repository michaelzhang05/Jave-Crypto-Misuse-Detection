package u3;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u3.j;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: b, reason: collision with root package name */
    public static final i f9460b = new i(new j.a());

    /* renamed from: c, reason: collision with root package name */
    public static final i f9461c = new i(new j.e());

    /* renamed from: d, reason: collision with root package name */
    public static final i f9462d = new i(new j.g());

    /* renamed from: e, reason: collision with root package name */
    public static final i f9463e = new i(new j.f());

    /* renamed from: f, reason: collision with root package name */
    public static final i f9464f = new i(new j.b());

    /* renamed from: g, reason: collision with root package name */
    public static final i f9465g = new i(new j.d());

    /* renamed from: h, reason: collision with root package name */
    public static final i f9466h = new i(new j.c());

    /* renamed from: a, reason: collision with root package name */
    private final e f9467a;

    /* loaded from: classes.dex */
    private static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        private final j f9468a;

        private b(j jVar) {
            this.f9468a = jVar;
        }

        @Override // u3.i.e
        public Object a(String str) {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f9468a.a(str, (Provider) it.next());
                } catch (Exception e6) {
                    if (exc == null) {
                        exc = e6;
                    }
                }
            }
            return this.f9468a.a(str, null);
        }
    }

    /* loaded from: classes.dex */
    private static class c implements e {

        /* renamed from: a, reason: collision with root package name */
        private final j f9469a;

        private c(j jVar) {
            this.f9469a = jVar;
        }

        @Override // u3.i.e
        public Object a(String str) {
            return this.f9469a.a(str, null);
        }
    }

    /* loaded from: classes.dex */
    private static class d implements e {

        /* renamed from: a, reason: collision with root package name */
        private final j f9470a;

        private d(j jVar) {
            this.f9470a = jVar;
        }

        @Override // u3.i.e
        public Object a(String str) {
            Iterator it = i.b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f9470a.a(str, (Provider) it.next());
                } catch (Exception e6) {
                    if (exc == null) {
                        exc = e6;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    /* loaded from: classes.dex */
    private interface e {
        Object a(String str);
    }

    public i(j jVar) {
        this.f9467a = l3.b.c() ? new d(jVar) : q.b() ? new b(jVar) : new c(jVar);
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public Object a(String str) {
        return this.f9467a.a(str);
    }
}
