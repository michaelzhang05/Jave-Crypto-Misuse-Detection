package a3;

import P5.AbstractC1378t;
import b3.InterfaceC1974h;
import com.stripe.android.paymentsheet.u;
import h4.C2917a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;
import p4.D;
import p4.h0;

/* renamed from: a3.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1620b {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1974h.a f13836a;

    /* renamed from: b, reason: collision with root package name */
    private final List f13837b;

    /* renamed from: c, reason: collision with root package name */
    private final List f13838c;

    /* renamed from: d, reason: collision with root package name */
    private final List f13839d;

    /* renamed from: e, reason: collision with root package name */
    private final Set f13840e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f13841f;

    /* renamed from: g, reason: collision with root package name */
    private Set f13842g;

    public C1620b(InterfaceC1974h.a arguments) {
        AbstractC3255y.i(arguments, "arguments");
        this.f13836a = arguments;
        this.f13837b = new ArrayList();
        this.f13838c = new ArrayList();
        this.f13839d = new ArrayList();
        this.f13840e = new LinkedHashSet();
        this.f13842g = y2.d.f40915a.h();
        for (EnumC1619a enumC1619a : EnumC1619a.d()) {
            if (enumC1619a.f(this.f13836a.a())) {
                e(enumC1619a);
            }
        }
        if (this.f13836a.a().a() == u.d.a.f27448c) {
            d(this, null, 1, null);
        }
    }

    public static /* synthetic */ C1620b d(C1620b c1620b, Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = c1620b.f13842g;
        }
        return c1620b.c(set);
    }

    public final List a() {
        h0 s8;
        List c8 = AbstractC1378t.c();
        c8.addAll(this.f13837b);
        Iterator it = this.f13840e.iterator();
        while (it.hasNext()) {
            c8.add(((EnumC1619a) it.next()).c(this.f13836a.d()));
        }
        c8.addAll(this.f13838c);
        if (this.f13841f && (s8 = new C2917a(null, this.f13842g, null, false, null, false, 61, null).s(this.f13836a.d(), this.f13836a.j())) != null) {
            c8.add(s8);
        }
        c8.addAll(this.f13839d);
        return AbstractC1378t.a(c8);
    }

    public final C1620b b(D formElement) {
        AbstractC3255y.i(formElement, "formElement");
        this.f13838c.add(formElement);
        return this;
    }

    public final C1620b c(Set availableCountries) {
        AbstractC3255y.i(availableCountries, "availableCountries");
        if (this.f13836a.a().a() != u.d.a.f27447b) {
            this.f13841f = true;
            this.f13842g = availableCountries;
        }
        return this;
    }

    public final C1620b e(EnumC1619a type) {
        AbstractC3255y.i(type, "type");
        if (type.e(this.f13836a.a())) {
            this.f13840e.add(type);
        }
        return this;
    }
}
