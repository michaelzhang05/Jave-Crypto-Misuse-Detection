package P;

import O.C1260d;
import P.f;
import Q.InterfaceC1302c;
import R.AbstractC1306c;
import R.AbstractC1319p;
import R.C1307d;
import R.InterfaceC1313j;
import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import java.util.Set;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0166a f7832a;

    /* renamed from: b, reason: collision with root package name */
    private final g f7833b;

    /* renamed from: c, reason: collision with root package name */
    private final String f7834c;

    /* renamed from: P.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static abstract class AbstractC0166a extends e {
        public f a(Context context, Looper looper, C1307d c1307d, Object obj, f.a aVar, f.b bVar) {
            return b(context, looper, c1307d, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, C1307d c1307d, Object obj, InterfaceC1302c interfaceC1302c, Q.h hVar) {
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

        /* renamed from: P.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0167a extends d {
            Account i();
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

        boolean e();

        String f();

        boolean g();

        void h(AbstractC1306c.InterfaceC0181c interfaceC0181c);

        boolean i();

        void j(AbstractC1306c.e eVar);

        int k();

        C1260d[] l();

        String m();

        boolean n();

        void p(InterfaceC1313j interfaceC1313j, Set set);
    }

    /* loaded from: classes3.dex */
    public static final class g extends c {
    }

    public a(String str, AbstractC0166a abstractC0166a, g gVar) {
        AbstractC1319p.m(abstractC0166a, "Cannot construct an Api with a null ClientBuilder");
        AbstractC1319p.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f7834c = str;
        this.f7832a = abstractC0166a;
        this.f7833b = gVar;
    }

    public final AbstractC0166a a() {
        return this.f7832a;
    }

    public final c b() {
        return this.f7833b;
    }

    public final String c() {
        return this.f7834c;
    }
}
