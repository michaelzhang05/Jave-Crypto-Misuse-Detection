package F6;

import P5.AbstractC1378t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2839a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2840b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f2841c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f2842d;

    /* renamed from: e, reason: collision with root package name */
    public final J5.a f2843e;

    /* renamed from: f, reason: collision with root package name */
    public final List f2844f;

    /* renamed from: g, reason: collision with root package name */
    public List f2845g;

    public e(Integer num, String str, Boolean bool, Boolean bool2, J5.a aVar, List list, List list2) {
        this.f2839a = num;
        this.f2840b = str;
        this.f2841c = bool;
        this.f2842d = bool2;
        this.f2843e = aVar;
        this.f2844f = list;
        this.f2845g = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3255y.d(this.f2839a, eVar.f2839a) && AbstractC3255y.d(this.f2840b, eVar.f2840b) && AbstractC3255y.d(this.f2841c, eVar.f2841c) && AbstractC3255y.d(this.f2842d, eVar.f2842d) && AbstractC3255y.d(this.f2843e, eVar.f2843e) && AbstractC3255y.d(this.f2844f, eVar.f2844f) && AbstractC3255y.d(this.f2845g, eVar.f2845g)) {
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
        int hashCode6;
        Integer num = this.f2839a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        String str = this.f2840b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Boolean bool = this.f2841c;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool2 = this.f2842d;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        J5.a aVar = this.f2843e;
        if (aVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = aVar.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        List list = this.f2844f;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        List list2 = this.f2845g;
        if (list2 != null) {
            i8 = list2.hashCode();
        }
        return i14 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("MSPAPurpose(id=");
        a8.append(this.f2839a);
        a8.append(", category=");
        a8.append((Object) this.f2840b);
        a8.append(", defaultValue=");
        a8.append(this.f2841c);
        a8.append(", value=");
        a8.append(this.f2842d);
        a8.append(", consentBanner=");
        a8.append(this.f2843e);
        a8.append(", purposes=");
        a8.append(this.f2844f);
        a8.append(", applicableSensitivePurposes=");
        a8.append(this.f2845g);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ e(Integer num, String str, Boolean bool, Boolean bool2, J5.a aVar, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? 0 : num, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? Boolean.FALSE : bool, (i8 & 8) != 0 ? Boolean.FALSE : null, (i8 & 16) != 0 ? new J5.a(null, null, null, null, 15) : aVar, (i8 & 32) != 0 ? AbstractC1378t.m() : list, (i8 & 64) != 0 ? AbstractC1378t.m() : null);
    }
}
