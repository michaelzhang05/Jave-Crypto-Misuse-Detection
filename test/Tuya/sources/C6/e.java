package C6;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1329a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1330b;

    /* renamed from: c, reason: collision with root package name */
    public final Boolean f1331c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f1332d;

    /* renamed from: e, reason: collision with root package name */
    public final G5.a f1333e;

    /* renamed from: f, reason: collision with root package name */
    public final List f1334f;

    /* renamed from: g, reason: collision with root package name */
    public List f1335g;

    public e(Integer num, String str, Boolean bool, Boolean bool2, G5.a aVar, List list, List list2) {
        this.f1329a = num;
        this.f1330b = str;
        this.f1331c = bool;
        this.f1332d = bool2;
        this.f1333e = aVar;
        this.f1334f = list;
        this.f1335g = list2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (AbstractC3159y.d(this.f1329a, eVar.f1329a) && AbstractC3159y.d(this.f1330b, eVar.f1330b) && AbstractC3159y.d(this.f1331c, eVar.f1331c) && AbstractC3159y.d(this.f1332d, eVar.f1332d) && AbstractC3159y.d(this.f1333e, eVar.f1333e) && AbstractC3159y.d(this.f1334f, eVar.f1334f) && AbstractC3159y.d(this.f1335g, eVar.f1335g)) {
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
        Integer num = this.f1329a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        String str = this.f1330b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        Boolean bool = this.f1331c;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool2 = this.f1332d;
        if (bool2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool2.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        G5.a aVar = this.f1333e;
        if (aVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = aVar.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        List list = this.f1334f;
        if (list == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = list.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        List list2 = this.f1335g;
        if (list2 != null) {
            i8 = list2.hashCode();
        }
        return i14 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("MSPAPurpose(id=");
        a8.append(this.f1329a);
        a8.append(", category=");
        a8.append((Object) this.f1330b);
        a8.append(", defaultValue=");
        a8.append(this.f1331c);
        a8.append(", value=");
        a8.append(this.f1332d);
        a8.append(", consentBanner=");
        a8.append(this.f1333e);
        a8.append(", purposes=");
        a8.append(this.f1334f);
        a8.append(", applicableSensitivePurposes=");
        a8.append(this.f1335g);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ e(Integer num, String str, Boolean bool, Boolean bool2, G5.a aVar, List list, List list2, int i8) {
        this((i8 & 1) != 0 ? 0 : num, (i8 & 2) != 0 ? "" : null, (i8 & 4) != 0 ? Boolean.FALSE : bool, (i8 & 8) != 0 ? Boolean.FALSE : null, (i8 & 16) != 0 ? new G5.a(null, null, null, null, 15) : aVar, (i8 & 32) != 0 ? AbstractC1246t.m() : list, (i8 & 64) != 0 ? AbstractC1246t.m() : null);
    }
}
