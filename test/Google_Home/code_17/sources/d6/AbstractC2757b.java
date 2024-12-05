package d6;

import h6.i;
import kotlin.jvm.internal.AbstractC3255y;

/* renamed from: d6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2757b implements InterfaceC2760e {

    /* renamed from: a, reason: collision with root package name */
    private Object f31227a;

    public AbstractC2757b(Object obj) {
        this.f31227a = obj;
    }

    protected abstract void a(i iVar, Object obj, Object obj2);

    protected boolean b(i property, Object obj, Object obj2) {
        AbstractC3255y.i(property, "property");
        return true;
    }

    @Override // d6.InterfaceC2760e, d6.InterfaceC2759d
    public Object getValue(Object obj, i property) {
        AbstractC3255y.i(property, "property");
        return this.f31227a;
    }

    @Override // d6.InterfaceC2760e
    public void setValue(Object obj, i property, Object obj2) {
        AbstractC3255y.i(property, "property");
        Object obj3 = this.f31227a;
        if (!b(property, obj3, obj2)) {
            return;
        }
        this.f31227a = obj2;
        a(property, obj3, obj2);
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f31227a + ')';
    }
}
