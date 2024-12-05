package R5;

import M5.AbstractC1230c;
import M5.AbstractC1239l;
import java.io.Serializable;
import kotlin.jvm.internal.AbstractC3159y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class c extends AbstractC1230c implements a, Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final Enum[] f8760a;

    public c(Enum[] entries) {
        AbstractC3159y.i(entries, "entries");
        this.f8760a = entries;
    }

    public boolean a(Enum element) {
        AbstractC3159y.i(element, "element");
        if (((Enum) AbstractC1239l.k0(this.f8760a, element.ordinal())) == element) {
            return true;
        }
        return false;
    }

    @Override // M5.AbstractC1228a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        return a((Enum) obj);
    }

    @Override // M5.AbstractC1230c, java.util.List
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public Enum get(int i8) {
        AbstractC1230c.Companion.b(i8, this.f8760a.length);
        return this.f8760a[i8];
    }

    @Override // M5.AbstractC1230c, M5.AbstractC1228a
    public int getSize() {
        return this.f8760a.length;
    }

    public int h(Enum element) {
        AbstractC3159y.i(element, "element");
        int ordinal = element.ordinal();
        if (((Enum) AbstractC1239l.k0(this.f8760a, ordinal)) != element) {
            return -1;
        }
        return ordinal;
    }

    @Override // M5.AbstractC1230c, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return h((Enum) obj);
    }

    public int l(Enum element) {
        AbstractC3159y.i(element, "element");
        return indexOf(element);
    }

    @Override // M5.AbstractC1230c, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        return l((Enum) obj);
    }
}
