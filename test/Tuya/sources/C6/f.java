package C6;

import M5.AbstractC1246t;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f1336a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f1337b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1338c;

    /* renamed from: d, reason: collision with root package name */
    public Boolean f1339d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1340e;

    /* renamed from: f, reason: collision with root package name */
    public final List f1341f;

    public f(Integer num, Integer num2, String str, Boolean bool, String str2, List list) {
        this.f1336a = num;
        this.f1337b = num2;
        this.f1338c = str;
        this.f1339d = bool;
        this.f1340e = str2;
        this.f1341f = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3159y.d(this.f1336a, fVar.f1336a) && AbstractC3159y.d(this.f1337b, fVar.f1337b) && AbstractC3159y.d(this.f1338c, fVar.f1338c) && AbstractC3159y.d(this.f1339d, fVar.f1339d) && AbstractC3159y.d(this.f1340e, fVar.f1340e) && AbstractC3159y.d(this.f1341f, fVar.f1341f)) {
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
        Integer num = this.f1336a;
        int i8 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i9 = hashCode * 31;
        Integer num2 = this.f1337b;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str = this.f1338c;
        if (str == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Boolean bool = this.f1339d;
        if (bool == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bool.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str2 = this.f1340e;
        if (str2 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str2.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        List list = this.f1341f;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i13 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("MSPASensitivePurpose(id=");
        a8.append(this.f1336a);
        a8.append(", order=");
        a8.append(this.f1337b);
        a8.append(", title=");
        a8.append((Object) this.f1338c);
        a8.append(", value=");
        a8.append(this.f1339d);
        a8.append(", description=");
        a8.append((Object) this.f1340e);
        a8.append(", nationalIds=");
        a8.append(this.f1341f);
        a8.append(')');
        return a8.toString();
    }

    public /* synthetic */ f(Integer num, Integer num2, String str, Boolean bool, String str2, List list, int i8) {
        this((i8 & 1) != 0 ? 0 : num, (i8 & 2) != 0 ? 0 : num2, (i8 & 4) != 0 ? "" : str, (i8 & 8) != 0 ? Boolean.FALSE : null, (i8 & 16) != 0 ? "" : str2, (i8 & 32) != 0 ? AbstractC1246t.m() : list);
    }
}
