package v6;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3834a {

    /* renamed from: a, reason: collision with root package name */
    private final String f38882a;

    /* renamed from: b, reason: collision with root package name */
    private List f38883b;

    /* renamed from: c, reason: collision with root package name */
    private final List f38884c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f38885d;

    /* renamed from: e, reason: collision with root package name */
    private final List f38886e;

    /* renamed from: f, reason: collision with root package name */
    private final List f38887f;

    /* renamed from: g, reason: collision with root package name */
    private final List f38888g;

    public C3834a(String serialName) {
        AbstractC3159y.i(serialName, "serialName");
        this.f38882a = serialName;
        this.f38883b = AbstractC1246t.m();
        this.f38884c = new ArrayList();
        this.f38885d = new HashSet();
        this.f38886e = new ArrayList();
        this.f38887f = new ArrayList();
        this.f38888g = new ArrayList();
    }

    public static /* synthetic */ void b(C3834a c3834a, String str, f fVar, List list, boolean z8, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            list = AbstractC1246t.m();
        }
        if ((i8 & 8) != 0) {
            z8 = false;
        }
        c3834a.a(str, fVar, list, z8);
    }

    public final void a(String elementName, f descriptor, List annotations, boolean z8) {
        AbstractC3159y.i(elementName, "elementName");
        AbstractC3159y.i(descriptor, "descriptor");
        AbstractC3159y.i(annotations, "annotations");
        if (this.f38885d.add(elementName)) {
            this.f38884c.add(elementName);
            this.f38886e.add(descriptor);
            this.f38887f.add(annotations);
            this.f38888g.add(Boolean.valueOf(z8));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f38882a).toString());
    }

    public final List c() {
        return this.f38883b;
    }

    public final List d() {
        return this.f38887f;
    }

    public final List e() {
        return this.f38886e;
    }

    public final List f() {
        return this.f38884c;
    }

    public final List g() {
        return this.f38888g;
    }

    public final void h(List list) {
        AbstractC3159y.i(list, "<set-?>");
        this.f38883b = list;
    }
}
