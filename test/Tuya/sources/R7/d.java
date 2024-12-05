package R7;

import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final B6.f f8912a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f8913b;

    /* renamed from: c, reason: collision with root package name */
    public final f f8914c;

    /* renamed from: d, reason: collision with root package name */
    public e f8915d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8916e;

    /* renamed from: f, reason: collision with root package name */
    public String f8917f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f8918g;

    public d(B6.f value, Boolean bool, f viewType, e itemType, boolean z8, String text, Integer num) {
        AbstractC3159y.i(value, "value");
        AbstractC3159y.i(viewType, "viewType");
        AbstractC3159y.i(itemType, "itemType");
        AbstractC3159y.i(text, "text");
        this.f8912a = value;
        this.f8913b = bool;
        this.f8914c = viewType;
        this.f8915d = itemType;
        this.f8916e = z8;
        this.f8917f = text;
        this.f8918g = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3159y.d(this.f8912a, dVar.f8912a) && AbstractC3159y.d(this.f8913b, dVar.f8913b) && this.f8914c == dVar.f8914c && this.f8915d == dVar.f8915d && this.f8916e == dVar.f8916e && AbstractC3159y.d(this.f8917f, dVar.f8917f) && AbstractC3159y.d(this.f8918g, dVar.f8918g)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f8912a.hashCode() * 31;
        Boolean bool = this.f8913b;
        int i8 = 0;
        if (bool == null) {
            hashCode = 0;
        } else {
            hashCode = bool.hashCode();
        }
        int hashCode3 = (this.f8915d.hashCode() + ((this.f8914c.hashCode() + ((hashCode2 + hashCode) * 31)) * 31)) * 31;
        boolean z8 = this.f8916e;
        int i9 = z8;
        if (z8 != 0) {
            i9 = 1;
        }
        int a8 = t.a(this.f8917f, (hashCode3 + i9) * 31, 31);
        Integer num = this.f8918g;
        if (num != null) {
            i8 = num.hashCode();
        }
        return a8 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("SwitchItemData(value=");
        a8.append(this.f8912a);
        a8.append(", selectedState=");
        a8.append(this.f8913b);
        a8.append(", viewType=");
        a8.append(this.f8914c);
        a8.append(", itemType=");
        a8.append(this.f8915d);
        a8.append(", isTagEnabled=");
        a8.append(this.f8916e);
        a8.append(", text=");
        a8.append(this.f8917f);
        a8.append(", counter=");
        a8.append(this.f8918g);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ d(B6.f fVar, Boolean bool, f fVar2, e eVar, boolean z8, String str, Integer num, int i8) {
        this((i8 & 1) != 0 ? new B6.f(0, null, 3) : fVar, (i8 & 2) != 0 ? null : bool, (i8 & 4) != 0 ? f.NORMAL : fVar2, (i8 & 8) != 0 ? e.IAB_VENDOR : eVar, (i8 & 16) != 0 ? true : z8, (i8 & 32) != 0 ? "" : str, (i8 & 64) == 0 ? num : null);
    }
}
