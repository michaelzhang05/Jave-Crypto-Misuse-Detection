package E1;

import B1.n;
import E1.d;
import android.content.Context;
import android.os.Handler;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class h implements d.a, D1.c {

    /* renamed from: f, reason: collision with root package name */
    private static h f2282f;

    /* renamed from: a, reason: collision with root package name */
    private float f2283a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final D1.e f2284b;

    /* renamed from: c, reason: collision with root package name */
    private final D1.b f2285c;

    /* renamed from: d, reason: collision with root package name */
    private D1.d f2286d;

    /* renamed from: e, reason: collision with root package name */
    private c f2287e;

    public h(D1.e eVar, D1.b bVar) {
        this.f2284b = eVar;
        this.f2285c = bVar;
    }

    private c a() {
        if (this.f2287e == null) {
            this.f2287e = c.e();
        }
        return this.f2287e;
    }

    public static h d() {
        if (f2282f == null) {
            f2282f = new h(new D1.e(), new D1.b());
        }
        return f2282f;
    }

    public void b(Context context) {
        this.f2286d = this.f2284b.a(new Handler(), context, this.f2285c.a(), this);
    }

    public float c() {
        return this.f2283a;
    }

    public void e() {
        b.k().a(this);
        b.k().i();
        I1.a.p().q();
        this.f2286d.d();
    }

    public void f() {
        I1.a.p().s();
        b.k().j();
        this.f2286d.e();
    }

    @Override // D1.c
    public void a(float f8) {
        this.f2283a = f8;
        Iterator it = a().a().iterator();
        while (it.hasNext()) {
            ((n) it.next()).w().b(f8);
        }
    }

    @Override // E1.d.a
    public void a(boolean z8) {
        if (z8) {
            I1.a.p().q();
        } else {
            I1.a.p().o();
        }
    }
}
