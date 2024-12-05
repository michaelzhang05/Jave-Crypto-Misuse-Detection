package e4;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import m4.InterfaceC3433x;

/* loaded from: classes4.dex */
public final class J0 implements InterfaceC3433x {

    /* renamed from: a, reason: collision with root package name */
    private final int f30422a;

    /* renamed from: b, reason: collision with root package name */
    private final List f30423b;

    /* renamed from: c, reason: collision with root package name */
    private final String f30424c;

    /* renamed from: d, reason: collision with root package name */
    private final List f30425d;

    /* renamed from: e, reason: collision with root package name */
    private final List f30426e;

    public J0(int i8, List items) {
        AbstractC3159y.i(items, "items");
        this.f30422a = i8;
        this.f30423b = items;
        this.f30424c = "simple_dropdown";
        List list = items;
        ArrayList arrayList = new ArrayList(AbstractC1246t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((V) it.next()).b());
        }
        this.f30425d = arrayList;
        List list2 = this.f30423b;
        ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((V) it2.next()).c());
        }
        this.f30426e = arrayList2;
    }

    @Override // m4.InterfaceC3433x
    public int b() {
        return this.f30422a;
    }

    @Override // m4.InterfaceC3433x
    public String f(String rawValue) {
        Object obj;
        String c8;
        AbstractC3159y.i(rawValue, "rawValue");
        Iterator it = this.f30423b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((V) obj).b(), rawValue)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        V v8 = (V) obj;
        if (v8 == null || (c8 = v8.c()) == null) {
            return ((V) this.f30423b.get(0)).c();
        }
        return c8;
    }

    @Override // m4.InterfaceC3433x
    public String g(int i8) {
        return (String) i().get(i8);
    }

    @Override // m4.InterfaceC3433x
    public boolean h() {
        return InterfaceC3433x.a.a(this);
    }

    @Override // m4.InterfaceC3433x
    public List i() {
        return this.f30426e;
    }

    @Override // m4.InterfaceC3433x
    public List j() {
        return this.f30425d;
    }

    @Override // m4.InterfaceC3433x
    public boolean k() {
        return InterfaceC3433x.a.b(this);
    }
}
