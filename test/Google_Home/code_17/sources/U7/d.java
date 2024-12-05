package U7;

import B5.t;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final E6.f f10538a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f10539b;

    /* renamed from: c, reason: collision with root package name */
    public final f f10540c;

    /* renamed from: d, reason: collision with root package name */
    public e f10541d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10542e;

    /* renamed from: f, reason: collision with root package name */
    public String f10543f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f10544g;

    public d(E6.f value, Boolean bool, f viewType, e itemType, boolean z8, String text, Integer num) {
        AbstractC3255y.i(value, "value");
        AbstractC3255y.i(viewType, "viewType");
        AbstractC3255y.i(itemType, "itemType");
        AbstractC3255y.i(text, "text");
        this.f10538a = value;
        this.f10539b = bool;
        this.f10540c = viewType;
        this.f10541d = itemType;
        this.f10542e = z8;
        this.f10543f = text;
        this.f10544g = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3255y.d(this.f10538a, dVar.f10538a) && AbstractC3255y.d(this.f10539b, dVar.f10539b) && this.f10540c == dVar.f10540c && this.f10541d == dVar.f10541d && this.f10542e == dVar.f10542e && AbstractC3255y.d(this.f10543f, dVar.f10543f) && AbstractC3255y.d(this.f10544g, dVar.f10544g)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f10538a.hashCode() * 31;
        Boolean bool = this.f10539b;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int hashCode3 = (this.f10541d.hashCode() + ((this.f10540c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31;
        boolean z8 = this.f10542e;
        int i9 = z8;
        if (z8 != 0) {
            i9 = 1;
        }
        int a8 = t.a(this.f10543f, (hashCode3 + i9) * 31, 31);
        Integer num = this.f10544g;
        if (num != null) {
            i8 = num.hashCode();
        }
        return a8 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("SwitchItemData(value=");
        a8.append(this.f10538a);
        a8.append(", selectedState=");
        a8.append(this.f10539b);
        a8.append(", viewType=");
        a8.append(this.f10540c);
        a8.append(", itemType=");
        a8.append(this.f10541d);
        a8.append(", isTagEnabled=");
        a8.append(this.f10542e);
        a8.append(", text=");
        a8.append(this.f10543f);
        a8.append(", counter=");
        a8.append(this.f10544g);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ d(E6.f fVar, Boolean bool, f fVar2, e eVar, boolean z8, String str, Integer num, int i8) {
        this((i8 & 1) != 0 ? new E6.f(0, null, 3) : fVar, (i8 & 2) != 0 ? null : bool, (i8 & 4) != 0 ? f.NORMAL : fVar2, (i8 & 8) != 0 ? e.IAB_VENDOR : eVar, (i8 & 16) != 0 ? true : z8, (i8 & 32) != 0 ? "" : str, (i8 & 64) == 0 ? num : null);
    }
}
