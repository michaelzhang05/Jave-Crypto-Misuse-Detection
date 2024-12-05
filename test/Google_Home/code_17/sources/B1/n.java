package B1;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class n extends b {

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f779k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a, reason: collision with root package name */
    private final d f780a;

    /* renamed from: b, reason: collision with root package name */
    private final c f781b;

    /* renamed from: d, reason: collision with root package name */
    private K1.a f783d;

    /* renamed from: e, reason: collision with root package name */
    private G1.a f784e;

    /* renamed from: i, reason: collision with root package name */
    private boolean f788i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f789j;

    /* renamed from: c, reason: collision with root package name */
    private final List f782c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private boolean f785f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f786g = false;

    /* renamed from: h, reason: collision with root package name */
    private final String f787h = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(c cVar, d dVar) {
        G1.a bVar;
        this.f781b = cVar;
        this.f780a = dVar;
        r(null);
        if (dVar.c() != e.HTML && dVar.c() != e.JAVASCRIPT) {
            bVar = new G1.c(dVar.f(), dVar.g());
        } else {
            bVar = new G1.b(dVar.j());
        }
        this.f784e = bVar;
        this.f784e.w();
        E1.c.e().b(this);
        this.f784e.d(cVar);
    }

    private void h() {
        if (!this.f788i) {
        } else {
            throw new IllegalStateException("Impression event can only be sent once");
        }
    }

    private static void i(View view) {
        if (view != null) {
        } else {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
    }

    private void j(String str) {
        if (str != null) {
            if (str.length() <= 50) {
                if (!f779k.matcher(str).matches()) {
                    throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
                }
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
        }
    }

    private E1.e m(View view) {
        for (E1.e eVar : this.f782c) {
            if (eVar.c().get() == view) {
                return eVar;
            }
        }
        return null;
    }

    private void n() {
        if (!this.f789j) {
        } else {
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    private void p(View view) {
        Collection<n> c8 = E1.c.e().c();
        if (c8 != null && !c8.isEmpty()) {
            for (n nVar : c8) {
                if (nVar != this && nVar.o() == view) {
                    nVar.f783d.clear();
                }
            }
        }
    }

    private void r(View view) {
        this.f783d = new K1.a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A() {
        h();
        w().u();
        this.f788i = true;
    }

    @Override // B1.b
    public void a(View view, h hVar, String str) {
        if (this.f786g) {
            return;
        }
        i(view);
        j(str);
        if (m(view) == null) {
            this.f782c.add(new E1.e(view, hVar, str));
        }
    }

    @Override // B1.b
    public void c() {
        if (this.f786g) {
            return;
        }
        this.f783d.clear();
        e();
        this.f786g = true;
        w().t();
        E1.c.e().d(this);
        w().o();
        this.f784e = null;
    }

    @Override // B1.b
    public void d(View view) {
        if (this.f786g) {
            return;
        }
        H1.g.d(view, "AdView is null");
        if (o() == view) {
            return;
        }
        r(view);
        w().a();
        p(view);
    }

    @Override // B1.b
    public void e() {
        if (this.f786g) {
            return;
        }
        this.f782c.clear();
    }

    @Override // B1.b
    public void f(View view) {
        if (this.f786g) {
            return;
        }
        i(view);
        E1.e m8 = m(view);
        if (m8 != null) {
            this.f782c.remove(m8);
        }
    }

    @Override // B1.b
    public void g() {
        if (this.f785f) {
            return;
        }
        this.f785f = true;
        E1.c.e().f(this);
        this.f784e.b(E1.h.d().c());
        this.f784e.l(E1.a.a().c());
        this.f784e.e(this, this.f780a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void k(List list) {
        if (s()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                View view = (View) ((K1.a) it.next()).get();
                if (view != null) {
                    arrayList.add(view);
                }
            }
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l(JSONObject jSONObject) {
        n();
        w().m(jSONObject);
        this.f789j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View o() {
        return (View) this.f783d.get();
    }

    public List q() {
        return this.f782c;
    }

    public boolean s() {
        return false;
    }

    public boolean t() {
        if (this.f785f && !this.f786g) {
            return true;
        }
        return false;
    }

    public boolean u() {
        return this.f786g;
    }

    public String v() {
        return this.f787h;
    }

    public G1.a w() {
        return this.f784e;
    }

    public boolean x() {
        return this.f781b.b();
    }

    public boolean y() {
        return this.f781b.c();
    }

    public boolean z() {
        return this.f785f;
    }
}
