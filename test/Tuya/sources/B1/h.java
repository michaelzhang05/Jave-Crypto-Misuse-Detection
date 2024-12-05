package B1;

import B1.d;
import android.content.Context;
import android.os.Handler;
import java.util.Iterator;
import y1.C3981n;

/* loaded from: classes3.dex */
public class h implements d.a, A1.c {

    /* renamed from: f, reason: collision with root package name */
    private static h f687f;

    /* renamed from: a, reason: collision with root package name */
    private float f688a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final A1.e f689b;

    /* renamed from: c, reason: collision with root package name */
    private final A1.b f690c;

    /* renamed from: d, reason: collision with root package name */
    private A1.d f691d;

    /* renamed from: e, reason: collision with root package name */
    private c f692e;

    public h(A1.e eVar, A1.b bVar) {
        this.f689b = eVar;
        this.f690c = bVar;
    }

    private c a() {
        if (this.f692e == null) {
            this.f692e = c.e();
        }
        return this.f692e;
    }

    public static h d() {
        if (f687f == null) {
            f687f = new h(new A1.e(), new A1.b());
        }
        return f687f;
    }

    public void b(Context context) {
        this.f691d = this.f689b.a(new Handler(), context, this.f690c.a(), this);
    }

    public float c() {
        return this.f688a;
    }

    public void e() {
        b.k().a(this);
        b.k().i();
        F1.a.p().q();
        this.f691d.d();
    }

    public void f() {
        F1.a.p().s();
        b.k().j();
        this.f691d.e();
    }

    @Override // A1.c
    public void a(float f8) {
        this.f688a = f8;
        Iterator it = a().a().iterator();
        while (it.hasNext()) {
            ((C3981n) it.next()).w().b(f8);
        }
    }

    @Override // B1.d.a
    public void a(boolean z8) {
        if (z8) {
            F1.a.p().q();
        } else {
            F1.a.p().o();
        }
    }
}
