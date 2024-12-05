package O;

import N.C1333d;
import O.f;
import P.InterfaceC1358c;
import Q.AbstractC1387c;
import Q.AbstractC1400p;
import Q.C1388d;
import Q.InterfaceC1394j;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0143a f7794a;

    /* renamed from: b, reason: collision with root package name */
    private final g f7795b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7796c;

    /* renamed from: O.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0143a extends e {
        public f a(Context context, Looper looper, C1388d c1388d, Object obj, f.a aVar, f.b bVar) {
            return b(context, looper, c1388d, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C1388d c1388d, Object obj, InterfaceC1358c interfaceC1358c, P.h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
    }

    /* loaded from: classes3.dex */
    public static class c {
    }

    /* loaded from: classes3.dex */
    public interface d {

        /* renamed from: O.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0144a extends d {
            Account l();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class e {
    }

    /* loaded from: classes3.dex */
    public interface f extends b {
        void b();

        Set c();

        void d(String str);

        void e(AbstractC1387c.e eVar);

        boolean f();

        String g();

        boolean h();

        boolean i();

        void j(AbstractC1387c.InterfaceC0179c interfaceC0179c);

        int k();

        C1333d[] l();

        void m(InterfaceC1394j interfaceC1394j, Set set);

        String n();

        boolean o();
    }

    /* loaded from: classes3.dex */
    public static final class g extends c {
    }

    public a(String str, AbstractC0143a abstractC0143a, g gVar) {
        AbstractC1400p.m(abstractC0143a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC1400p.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f7796c = str;
        this.f7794a = abstractC0143a;
        this.f7795b = gVar;
    }

    public final AbstractC0143a a() {
        return this.f7794a;
    }

    public final c b() {
        return this.f7795b;
    }

    public final String c() {
        return this.f7796c;
    }
}
