package t1;

import android.content.Context;
import android.os.Looper;
import java.util.Set;
import t1.e;
import v1.c;
import v1.i;
import v1.n;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0138a f9278a;

    /* renamed from: b, reason: collision with root package name */
    private final g f9279b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9280c;

    /* renamed from: t1.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0138a extends e {
        public f a(Context context, Looper looper, v1.d dVar, Object obj, e.a aVar, e.b bVar) {
            return b(context, looper, dVar, obj, aVar, bVar);
        }

        public f b(Context context, Looper looper, v1.d dVar, Object obj, u1.c cVar, u1.h hVar) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }
    }

    /* loaded from: classes.dex */
    public interface b {
    }

    /* loaded from: classes.dex */
    public static class c {
    }

    /* loaded from: classes.dex */
    public interface d {
    }

    /* loaded from: classes.dex */
    public static abstract class e {
    }

    /* loaded from: classes.dex */
    public interface f extends b {
        boolean a();

        s1.c[] b();

        boolean c();

        String d();

        void e(c.InterfaceC0144c interfaceC0144c);

        String f();

        Set g();

        void h();

        void i(String str);

        boolean j();

        boolean m();

        void n(i iVar, Set set);

        void o(c.e eVar);

        int p();
    }

    /* loaded from: classes.dex */
    public static final class g extends c {
    }

    public a(String str, AbstractC0138a abstractC0138a, g gVar) {
        n.i(abstractC0138a, "Cannot construct an Api with a null ClientBuilder");
        n.i(gVar, "Cannot construct an Api with a null ClientKey");
        this.f9280c = str;
        this.f9278a = abstractC0138a;
        this.f9279b = gVar;
    }

    public final AbstractC0138a a() {
        return this.f9278a;
    }

    public final String b() {
        return this.f9280c;
    }
}
