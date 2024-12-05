package y6;

import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: y6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4211a {

    /* renamed from: a, reason: collision with root package name */
    private final String f41013a;

    /* renamed from: b, reason: collision with root package name */
    private List f41014b;

    /* renamed from: c, reason: collision with root package name */
    private final List f41015c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f41016d;

    /* renamed from: e, reason: collision with root package name */
    private final List f41017e;

    /* renamed from: f, reason: collision with root package name */
    private final List f41018f;

    /* renamed from: g, reason: collision with root package name */
    private final List f41019g;

    public C4211a(String serialName) {
        AbstractC3255y.i(serialName, "serialName");
        this.f41013a = serialName;
        this.f41014b = AbstractC1378t.m();
        this.f41015c = new ArrayList();
        this.f41016d = new HashSet();
        this.f41017e = new ArrayList();
        this.f41018f = new ArrayList();
        this.f41019g = new ArrayList();
    }

    public static /* synthetic */ void b(C4211a c4211a, String str, f fVar, List list, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list = AbstractC1378t.m();
        }
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        c4211a.a(str, fVar, list, z8);
    }

    public final void a(String elementName, f descriptor, List annotations, boolean z8) {
        AbstractC3255y.i(elementName, "elementName");
        AbstractC3255y.i(descriptor, "descriptor");
        AbstractC3255y.i(annotations, "annotations");
        if (this.f41016d.add(elementName)) {
            this.f41015c.add(elementName);
            this.f41017e.add(descriptor);
            this.f41018f.add(annotations);
            this.f41019g.add(Boolean.valueOf(z8));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f41013a).toString());
    }

    public final List c() {
        return this.f41014b;
    }

    public final List d() {
        return this.f41018f;
    }

    public final List e() {
        return this.f41017e;
    }

    public final List f() {
        return this.f41015c;
    }

    public final List g() {
        return this.f41019g;
    }

    public final void h(List list) {
        AbstractC3255y.i(list, "<set-?>");
        this.f41014b = list;
    }
}
