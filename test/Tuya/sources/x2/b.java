package X2;

import M5.AbstractC1246t;
import Y2.h;
import com.stripe.android.paymentsheet.u;
import e4.C2597a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;
import m4.D;
import m4.h0;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final h.a f12215a;

    /* renamed from: b, reason: collision with root package name */
    private final List f12216b;

    /* renamed from: c, reason: collision with root package name */
    private final List f12217c;

    /* renamed from: d, reason: collision with root package name */
    private final List f12218d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f12219e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f12220f;

    /* renamed from: g, reason: collision with root package name */
    private Set f12221g;

    public b(h.a arguments) {
        AbstractC3159y.i(arguments, "arguments");
        this.f12215a = arguments;
        this.f12216b = new ArrayList();
        this.f12217c = new ArrayList();
        this.f12218d = new ArrayList();
        this.f12219e = new LinkedHashSet();
        this.f12221g = v2.d.f38784a.h();
        for (a aVar : a.d()) {
            if (aVar.f(this.f12215a.a())) {
                e(aVar);
            }
        }
        if (this.f12215a.a().b() == u.d.a.f26393c) {
            d(this, null, 1, null);
        }
    }

    public static /* synthetic */ b d(b bVar, Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = bVar.f12221g;
        }
        return bVar.c(set);
    }

    public final List a() {
        h0 n8;
        List c8 = AbstractC1246t.c();
        c8.addAll(this.f12216b);
        Iterator it = this.f12219e.iterator();
        while (it.hasNext()) {
            c8.add(((a) it.next()).c(this.f12215a.d()));
        }
        c8.addAll(this.f12217c);
        if (this.f12220f && (n8 = new C2597a(null, this.f12221g, null, false, null, false, 61, null).n(this.f12215a.d(), this.f12215a.j())) != null) {
            c8.add(n8);
        }
        c8.addAll(this.f12218d);
        return AbstractC1246t.a(c8);
    }

    public final b b(D formElement) {
        AbstractC3159y.i(formElement, "formElement");
        this.f12217c.add(formElement);
        return this;
    }

    public final b c(Set availableCountries) {
        AbstractC3159y.i(availableCountries, "availableCountries");
        if (this.f12215a.a().b() != u.d.a.f26392b) {
            this.f12220f = true;
            this.f12221g = availableCountries;
        }
        return this;
    }

    public final b e(a type) {
        AbstractC3159y.i(type, "type");
        if (type.e(this.f12215a.a())) {
            this.f12219e.add(type);
        }
        return this;
    }
}
