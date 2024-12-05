package a6;

import e6.i;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: a6.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1577b implements InterfaceC1580e {

    /* renamed from: a, reason: collision with root package name */
    private Object f13564a;

    public AbstractC1577b(Object obj) {
        this.f13564a = obj;
    }

    protected abstract void a(i iVar, Object obj, Object obj2);

    protected boolean b(i property, Object obj, Object obj2) {
        AbstractC3159y.i(property, "property");
        return true;
    }

    @Override // a6.InterfaceC1580e, a6.InterfaceC1579d
    public Object getValue(Object obj, i property) {
        AbstractC3159y.i(property, "property");
        return this.f13564a;
    }

    @Override // a6.InterfaceC1580e
    public void setValue(Object obj, i property, Object obj2) {
        AbstractC3159y.i(property, "property");
        Object obj3 = this.f13564a;
        if (!b(property, obj3, obj2)) {
            return;
        }
        this.f13564a = obj2;
        a(property, obj3, obj2);
    }

    public String toString() {
        return "ObservableProperty(value=" + this.f13564a + ')';
    }
}
