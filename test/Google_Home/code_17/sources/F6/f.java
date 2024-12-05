package F6;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2846a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f2847b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2848c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f2849d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2850e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2851f;

    public f(Integer num, Integer num2, String str, Boolean bool, String str2, List list) {
        this.f2846a = num;
        this.f2847b = num2;
        this.f2848c = str;
        this.f2849d = bool;
        this.f2850e = str2;
        this.f2851f = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3255y.d(this.f2846a, fVar.f2846a) && AbstractC3255y.d(this.f2847b, fVar.f2847b) && AbstractC3255y.d(this.f2848c, fVar.f2848c) && AbstractC3255y.d(this.f2849d, fVar.f2849d) && AbstractC3255y.d(this.f2850e, fVar.f2850e) && AbstractC3255y.d(this.f2851f, fVar.f2851f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        Integer num = this.f2846a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        Integer num2 = this.f2847b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str = this.f2848c;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool = this.f2849d;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str2 = this.f2850e;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        List list = this.f2851f;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i13 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("MSPASensitivePurpose(id=");
        a8.append(this.f2846a);
        a8.append(", order=");
        a8.append(this.f2847b);
        a8.append(", title=");
        a8.append((Object) this.f2848c);
        a8.append(", value=");
        a8.append(this.f2849d);
        a8.append(", description=");
        a8.append((Object) this.f2850e);
        a8.append(", nationalIds=");
        a8.append(this.f2851f);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ f(Integer num, Integer num2, String str, Boolean bool, String str2, List list, int i8) {
        this((i8 & 1) != 0 ? 0 : num, (i8 & 2) != 0 ? 0 : num2, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? Boolean.FALSE : null, (i8 & 16) != 0 ? "" : str2, (i8 & 32) != 0 ? AbstractC1378t.m() : list);
    }
}
