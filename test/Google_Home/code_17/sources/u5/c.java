package U5;

import P5.AbstractC1362c;
import P5.AbstractC1371l;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c extends AbstractC1362c implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f10386a;

    public c(Enum[] entries) {
        AbstractC3255y.i(entries, "entries");
        this.f10386a = entries;
    }

    public boolean c(Enum element) {
        AbstractC3255y.i(element, "element");
        if (((Enum) AbstractC1371l.k0(this.f10386a, element.ordinal())) == element) {
            return true;
        }
        return false;
    }

    @Override // P5.AbstractC1360a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return c((Enum) obj);
    }

    @Override // P5.AbstractC1362c, java.util.List
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public Enum get(int i8) {
        AbstractC1362c.Companion.b(i8, this.f10386a.length);
        return this.f10386a[i8];
    }

    public int f(Enum element) {
        AbstractC3255y.i(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC1371l.k0(this.f10386a, ordinal)) != element) {
            return -1;
        }
        return ordinal;
    }

    @Override // P5.AbstractC1362c, P5.AbstractC1360a
    public int getSize() {
        return this.f10386a.length;
    }

    @Override // P5.AbstractC1362c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return f((Enum) obj);
    }

    public int j(Enum element) {
        AbstractC3255y.i(element, "element");
        return indexOf(element);
    }

    @Override // P5.AbstractC1362c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return j((Enum) obj);
    }
}
