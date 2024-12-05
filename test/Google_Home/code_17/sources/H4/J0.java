package h4;

import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import p4.InterfaceC3776x;

/* loaded from: classes4.dex */
public final class J0 implements InterfaceC3776x {

    /* renamed from: a, reason: collision with root package name */
    private final int f32343a;

    /* renamed from: b, reason: collision with root package name */
    private final List f32344b;

    /* renamed from: c, reason: collision with root package name */
    private final String f32345c;

    /* renamed from: d, reason: collision with root package name */
    private final List f32346d;

    /* renamed from: e, reason: collision with root package name */
    private final List f32347e;

    public J0(int i8, List items) {
        AbstractC3255y.i(items, "items");
        this.f32343a = i8;
        this.f32344b = items;
        this.f32345c = "simple_dropdown";
        List list = items;
        ArrayList arrayList = new ArrayList(AbstractC1378t.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((V) it.next()).a());
        }
        this.f32346d = arrayList;
        List list2 = this.f32344b;
        ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(list2, 10));
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((V) it2.next()).b());
        }
        this.f32347e = arrayList2;
    }

    @Override // p4.InterfaceC3776x
    public int b() {
        return this.f32343a;
    }

    @Override // p4.InterfaceC3776x
    public String c(String rawValue) {
        Object obj;
        String b8;
        AbstractC3255y.i(rawValue, "rawValue");
        Iterator it = this.f32344b.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3255y.d(((V) obj).a(), rawValue)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        V v8 = (V) obj;
        if (v8 == null || (b8 = v8.b()) == null) {
            return ((V) this.f32344b.get(0)).b();
        }
        return b8;
    }

    @Override // p4.InterfaceC3776x
    public String d(int i8) {
        return (String) f().get(i8);
    }

    @Override // p4.InterfaceC3776x
    public boolean e() {
        return InterfaceC3776x.a.a(this);
    }

    @Override // p4.InterfaceC3776x
    public List f() {
        return this.f32347e;
    }

    @Override // p4.InterfaceC3776x
    public List g() {
        return this.f32346d;
    }

    @Override // p4.InterfaceC3776x
    public boolean h() {
        return InterfaceC3776x.a.b(this);
    }
}
