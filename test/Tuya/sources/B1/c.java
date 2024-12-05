package B1;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import y1.C3981n;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: c, reason: collision with root package name */
    private static c f672c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f673a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f674b = new ArrayList();

    private c() {
    }

    public static c e() {
        return f672c;
    }

    public Collection a() {
        return DesugarCollections.unmodifiableCollection(this.f674b);
    }

    public void b(C3981n c3981n) {
        this.f673a.add(c3981n);
    }

    public Collection c() {
        return DesugarCollections.unmodifiableCollection(this.f673a);
    }

    public void d(C3981n c3981n) {
        boolean g8 = g();
        this.f673a.remove(c3981n);
        this.f674b.remove(c3981n);
        if (g8 && !g()) {
            h.d().f();
        }
    }

    public void f(C3981n c3981n) {
        boolean g8 = g();
        this.f674b.add(c3981n);
        if (!g8) {
            h.d().e();
        }
    }

    public boolean g() {
        if (this.f674b.size() > 0) {
            return true;
        }
        return false;
    }
}
