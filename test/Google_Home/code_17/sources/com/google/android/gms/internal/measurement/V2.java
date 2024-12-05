package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class V2 {

    /* renamed from: a, reason: collision with root package name */
    private final V2 f16366a;

    /* renamed from: b, reason: collision with root package name */
    private E f16367b;

    /* renamed from: c, reason: collision with root package name */
    private Map f16368c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map f16369d = new HashMap();

    public V2(V2 v22, E e8) {
        this.f16366a = v22;
        this.f16367b = e8;
    }

    public final InterfaceC2236s a(C2125g c2125g) {
        InterfaceC2236s interfaceC2236s = InterfaceC2236s.f16802b0;
        Iterator r8 = c2125g.r();
        while (r8.hasNext()) {
            interfaceC2236s = this.f16367b.a(this, c2125g.e(((Integer) r8.next()).intValue()));
            if (interfaceC2236s instanceof C2174l) {
                break;
            }
        }
        return interfaceC2236s;
    }

    public final InterfaceC2236s b(InterfaceC2236s interfaceC2236s) {
        return this.f16367b.a(this, interfaceC2236s);
    }

    public final InterfaceC2236s c(String str) {
        V2 v22 = this;
        while (!v22.f16368c.containsKey(str)) {
            v22 = v22.f16366a;
            if (v22 == null) {
                throw new IllegalArgumentException(String.format("%s is not defined", str));
            }
        }
        return (InterfaceC2236s) v22.f16368c.get(str);
    }

    public final V2 d() {
        return new V2(this, this.f16367b);
    }

    public final void e(String str, InterfaceC2236s interfaceC2236s) {
        if (!this.f16369d.containsKey(str)) {
            if (interfaceC2236s == null) {
                this.f16368c.remove(str);
            } else {
                this.f16368c.put(str, interfaceC2236s);
            }
        }
    }

    public final void f(String str, InterfaceC2236s interfaceC2236s) {
        e(str, interfaceC2236s);
        this.f16369d.put(str, Boolean.TRUE);
    }

    public final boolean g(String str) {
        V2 v22 = this;
        while (!v22.f16368c.containsKey(str)) {
            v22 = v22.f16366a;
            if (v22 == null) {
                return false;
            }
        }
        return true;
    }

    public final void h(String str, InterfaceC2236s interfaceC2236s) {
        V2 v22;
        V2 v23 = this;
        while (!v23.f16368c.containsKey(str) && (v22 = v23.f16366a) != null && v22.g(str)) {
            v23 = v23.f16366a;
        }
        if (!v23.f16369d.containsKey(str)) {
            if (interfaceC2236s == null) {
                v23.f16368c.remove(str);
            } else {
                v23.f16368c.put(str, interfaceC2236s);
            }
        }
    }
}
