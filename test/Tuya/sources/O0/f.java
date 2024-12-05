package O0;

import H0.AbstractC1176j;
import H0.C1187v;
import H0.EnumC1188w;
import H0.InterfaceC1186u;
import H0.P;
import H0.z;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Task;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import r0.C3679j;
import r0.InterfaceC3678i;

/* loaded from: classes3.dex */
public class f implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7711a;

    /* renamed from: b, reason: collision with root package name */
    private final j f7712b;

    /* renamed from: c, reason: collision with root package name */
    private final g f7713c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1186u f7714d;

    /* renamed from: e, reason: collision with root package name */
    private final O0.a f7715e;

    /* renamed from: f, reason: collision with root package name */
    private final k f7716f;

    /* renamed from: g, reason: collision with root package name */
    private final C1187v f7717g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f7718h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f7719i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC3678i {
        a() {
        }

        @Override // r0.InterfaceC3678i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task a(Void r52) {
            JSONObject a8 = f.this.f7716f.a(f.this.f7712b, true);
            if (a8 != null) {
                d b8 = f.this.f7713c.b(a8);
                f.this.f7715e.c(b8.f7696c, a8);
                f.this.q(a8, "Loaded settings: ");
                f fVar = f.this;
                fVar.r(fVar.f7712b.f7727f);
                f.this.f7718h.set(b8);
                ((C3679j) f.this.f7719i.get()).e(b8);
            }
            return r0.l.e(null);
        }
    }

    f(Context context, j jVar, InterfaceC1186u interfaceC1186u, g gVar, O0.a aVar, k kVar, C1187v c1187v) {
        AtomicReference atomicReference = new AtomicReference();
        this.f7718h = atomicReference;
        this.f7719i = new AtomicReference(new C3679j());
        this.f7711a = context;
        this.f7712b = jVar;
        this.f7714d = interfaceC1186u;
        this.f7713c = gVar;
        this.f7715e = aVar;
        this.f7716f = kVar;
        this.f7717g = c1187v;
        atomicReference.set(b.b(interfaceC1186u));
    }

    public static f l(Context context, String str, z zVar, L0.b bVar, String str2, String str3, M0.f fVar, C1187v c1187v) {
        String g8 = zVar.g();
        P p8 = new P();
        return new f(context, new j(str, zVar.h(), zVar.i(), zVar.j(), zVar, AbstractC1176j.h(AbstractC1176j.o(context), str, str3, str2), str3, str2, EnumC1188w.a(g8).b()), p8, new g(p8), new O0.a(fVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), c1187v);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b8 = this.f7715e.b();
                if (b8 != null) {
                    d b9 = this.f7713c.b(b8);
                    if (b9 != null) {
                        q(b8, "Loaded cached settings: ");
                        long a8 = this.f7714d.a();
                        if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b9.a(a8)) {
                            E0.f.f().i("Cached settings have expired.");
                        }
                        try {
                            E0.f.f().i("Returning cached settings.");
                            dVar = b9;
                        } catch (Exception e8) {
                            e = e8;
                            dVar = b9;
                            E0.f.f().e("Failed to get cached settings", e);
                            return dVar;
                        }
                    } else {
                        E0.f.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    E0.f.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e9) {
            e = e9;
        }
        return dVar;
    }

    private String n() {
        return AbstractC1176j.s(this.f7711a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        E0.f.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor edit = AbstractC1176j.s(this.f7711a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // O0.i
    public Task a() {
        return ((C3679j) this.f7719i.get()).a();
    }

    @Override // O0.i
    public d b() {
        return (d) this.f7718h.get();
    }

    boolean k() {
        return !n().equals(this.f7712b.f7727f);
    }

    public Task o(e eVar, Executor executor) {
        d m8;
        if (!k() && (m8 = m(eVar)) != null) {
            this.f7718h.set(m8);
            ((C3679j) this.f7719i.get()).e(m8);
            return r0.l.e(null);
        }
        d m9 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m9 != null) {
            this.f7718h.set(m9);
            ((C3679j) this.f7719i.get()).e(m9);
        }
        return this.f7717g.k(executor).o(executor, new a());
    }

    public Task p(Executor executor) {
        return o(e.USE_CACHE, executor);
    }
}
