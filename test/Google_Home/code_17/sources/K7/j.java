package K7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class j extends h {

    /* renamed from: e, reason: collision with root package name */
    public final List f5247e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5248f;

    /* renamed from: g, reason: collision with root package name */
    public final String f5249g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5250h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5251i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5252j;

    /* renamed from: k, reason: collision with root package name */
    public final String f5253k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5254l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5255m;

    public /* synthetic */ j(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i8) {
        this((i8 & 1) != 0 ? new ArrayList() : list, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : str4, (i8 & 32) != 0 ? null : str5, (i8 & 64) != 0 ? null : str6, (i8 & 128) != 0 ? null : str7, (i8 & 256) == 0 ? str8 : null);
    }

    @Override // K7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5247e.iterator();
        while (it.hasNext()) {
            arrayList.add(new JSONObject(((o) it.next()).a()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList));
        jSONObject.putOpt("acceptanceState", this.f5248f);
        jSONObject.putOpt("objectionState", this.f5249g);
        jSONObject.putOpt("tcData", this.f5250h);
        jSONObject.putOpt("gppData", this.f5251i);
        jSONObject.putOpt("state", this.f5252j);
        jSONObject.putOpt("jurisdiction", this.f5253k);
        jSONObject.putOpt("nonIabConsentData", this.f5254l);
        jSONObject.putOpt("uspData", this.f5255m);
        jSONObject.put("clientTimestamp", this.f5237a);
        jSONObject.put("operationType", this.f5238b.f5215a);
        jSONObject.putOpt("sessionId", this.f5239c);
        jSONObject.put("domain", this.f5240d);
        String jSONObject2 = jSONObject.toString();
        AbstractC3255y.h(jSONObject2, "JSONObject().apply {\n   … domain)\n    }.toString()");
        return jSONObject2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        if (AbstractC3255y.d(this.f5247e, jVar.f5247e) && AbstractC3255y.d(this.f5248f, jVar.f5248f) && AbstractC3255y.d(this.f5249g, jVar.f5249g) && AbstractC3255y.d(this.f5250h, jVar.f5250h) && AbstractC3255y.d(this.f5251i, jVar.f5251i) && AbstractC3255y.d(this.f5252j, jVar.f5252j) && AbstractC3255y.d(this.f5253k, jVar.f5253k) && AbstractC3255y.d(this.f5254l, jVar.f5254l) && AbstractC3255y.d(this.f5255m, jVar.f5255m)) {
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
        int hashCode7;
        int hashCode8 = this.f5247e.hashCode() * 31;
        String str = this.f5248f;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode8 + hashCode) * 31;
        String str2 = this.f5249g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str3 = this.f5250h;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        String str4 = this.f5251i;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str5 = this.f5252j;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str6 = this.f5253k;
        if (str6 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str6.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str7 = this.f5254l;
        if (str7 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str7.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        String str8 = this.f5255m;
        if (str8 != null) {
            i8 = str8.hashCode();
        }
        return i15 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("TrackingUserDoneLog(userEvents=");
        a8.append(this.f5247e);
        a8.append(", acceptanceState=");
        a8.append((Object) this.f5248f);
        a8.append(", objectionState=");
        a8.append((Object) this.f5249g);
        a8.append(", tcData=");
        a8.append((Object) this.f5250h);
        a8.append(", gppData=");
        a8.append((Object) this.f5251i);
        a8.append(", state=");
        a8.append((Object) this.f5252j);
        a8.append(", jurisdiction=");
        a8.append((Object) this.f5253k);
        a8.append(", nonIabConsentData=");
        a8.append((Object) this.f5254l);
        a8.append(", uspData=");
        a8.append((Object) this.f5255m);
        a8.append(')');
        return a8.toString();
    }

    public j(List userEvents, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        AbstractC3255y.i(userEvents, "userEvents");
        this.f5247e = userEvents;
        this.f5248f = str;
        this.f5249g = str2;
        this.f5250h = str3;
        this.f5251i = str4;
        this.f5252j = str5;
        this.f5253k = str6;
        this.f5254l = str7;
        this.f5255m = str8;
    }
}
