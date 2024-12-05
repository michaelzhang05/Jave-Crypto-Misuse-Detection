package Q0;

import J0.AbstractC1275j;
import J0.C1289y;
import J0.D;
import J0.EnumC1290z;
import J0.InterfaceC1288x;
import J0.U;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.tasks.Task;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import q0.AbstractC3828l;
import q0.C3826j;
import q0.InterfaceC3825i;

/* loaded from: classes3.dex */
public class f implements i {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9110a;

    /* renamed from: b, reason: collision with root package name */
    private final j f9111b;

    /* renamed from: c, reason: collision with root package name */
    private final g f9112c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1288x f9113d;

    /* renamed from: e, reason: collision with root package name */
    private final Q0.a f9114e;

    /* renamed from: f, reason: collision with root package name */
    private final k f9115f;

    /* renamed from: g, reason: collision with root package name */
    private final C1289y f9116g;

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference f9117h;

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference f9118i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC3825i {
        a() {
        }

        @Override // q0.InterfaceC3825i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Task a(Void r52) {
            JSONObject a8 = f.this.f9115f.a(f.this.f9111b, true);
            if (a8 != null) {
                d b8 = f.this.f9112c.b(a8);
                f.this.f9114e.c(b8.f9095c, a8);
                f.this.q(a8, "Loaded settings: ");
                f fVar = f.this;
                fVar.r(fVar.f9111b.f9126f);
                f.this.f9117h.set(b8);
                ((C3826j) f.this.f9118i.get()).e(b8);
            }
            return AbstractC3828l.e(null);
        }
    }

    f(Context context, j jVar, InterfaceC1288x interfaceC1288x, g gVar, Q0.a aVar, k kVar, C1289y c1289y) {
        AtomicReference atomicReference = new AtomicReference();
        this.f9117h = atomicReference;
        this.f9118i = new AtomicReference(new C3826j());
        this.f9110a = context;
        this.f9111b = jVar;
        this.f9113d = interfaceC1288x;
        this.f9112c = gVar;
        this.f9114e = aVar;
        this.f9115f = kVar;
        this.f9116g = c1289y;
        atomicReference.set(b.b(interfaceC1288x));
    }

    public static f l(Context context, String str, D d8, N0.b bVar, String str2, String str3, O0.g gVar, C1289y c1289y) {
        String g8 = d8.g();
        U u8 = new U();
        return new f(context, new j(str, d8.h(), d8.i(), d8.j(), d8, AbstractC1275j.h(AbstractC1275j.m(context), str, str3, str2), str3, str2, EnumC1290z.b(g8).c()), u8, new g(u8), new Q0.a(gVar), new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), bVar), c1289y);
    }

    private d m(e eVar) {
        d dVar = null;
        try {
            if (!e.SKIP_CACHE_LOOKUP.equals(eVar)) {
                JSONObject b8 = this.f9114e.b();
                if (b8 != null) {
                    d b9 = this.f9112c.b(b8);
                    if (b9 != null) {
                        q(b8, "Loaded cached settings: ");
                        long a8 = this.f9113d.a();
                        if (!e.IGNORE_CACHE_EXPIRATION.equals(eVar) && b9.a(a8)) {
                            G0.h.f().i("Cached settings have expired.");
                        }
                        try {
                            G0.h.f().i("Returning cached settings.");
                            dVar = b9;
                        } catch (Exception e8) {
                            e = e8;
                            dVar = b9;
                            G0.h.f().e("Failed to get cached settings", e);
                            return dVar;
                        }
                    } else {
                        G0.h.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    G0.h.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e9) {
            e = e9;
        }
        return dVar;
    }

    private String n() {
        return AbstractC1275j.q(this.f9110a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        G0.h.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor edit = AbstractC1275j.q(this.f9110a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // Q0.i
    public Task a() {
        return ((C3826j) this.f9118i.get()).a();
    }

    @Override // Q0.i
    public d b() {
        return (d) this.f9117h.get();
    }

    boolean k() {
        return !n().equals(this.f9111b.f9126f);
    }

    public Task o(e eVar, Executor executor) {
        d m8;
        if (!k() && (m8 = m(eVar)) != null) {
            this.f9117h.set(m8);
            ((C3826j) this.f9118i.get()).e(m8);
            return AbstractC3828l.e(null);
        }
        d m9 = m(e.IGNORE_CACHE_EXPIRATION);
        if (m9 != null) {
            this.f9117h.set(m9);
            ((C3826j) this.f9118i.get()).e(m9);
        }
        return this.f9116g.k(executor).o(executor, new a());
    }

    public Task p(Executor executor) {
        return o(e.USE_CACHE, executor);
    }
}
