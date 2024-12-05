package K7;

import O5.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONArray;
import org.json.JSONObject;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class l extends h {

    /* renamed from: e, reason: collision with root package name */
    public final List f5257e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5258f;

    /* renamed from: g, reason: collision with root package name */
    public final List f5259g;

    public l(List userEvents, String str, List list) {
        AbstractC3255y.i(userEvents, "userEvents");
        this.f5257e = userEvents;
        this.f5258f = str;
        this.f5259g = list;
    }

    @Override // K7.h
    public String a() {
        ArrayList arrayList;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f5257e.iterator();
        while (it.hasNext()) {
            arrayList2.add(new JSONObject(((o) it.next()).a()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList2));
        jSONObject.putOpt("acceptanceState", this.f5258f);
        if (this.f5259g == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (r rVar : this.f5259g) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(String.valueOf(((Number) rVar.c()).intValue()), rVar.d());
                arrayList.add(jSONObject2);
            }
        }
        jSONObject.putOpt("gbcData", new JSONArray((Collection) arrayList));
        jSONObject.put("clientTimestamp", this.f5237a);
        jSONObject.put("operationType", this.f5238b.f5215a);
        jSONObject.putOpt("sessionId", this.f5239c);
        jSONObject.put("domain", this.f5240d);
        String jSONObject3 = jSONObject.toString();
        AbstractC3255y.h(jSONObject3, "JSONObject().apply {\n   … domain)\n    }.toString()");
        return jSONObject3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (AbstractC3255y.d(this.f5257e, lVar.f5257e) && AbstractC3255y.d(this.f5258f, lVar.f5258f) && AbstractC3255y.d(this.f5259g, lVar.f5259g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f5257e.hashCode() * 31;
        String str = this.f5258f;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        List list = this.f5259g;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("TrackingUserGBCDoneLog(userEvents=");
        a8.append(this.f5257e);
        a8.append(", acceptanceState=");
        a8.append((Object) this.f5258f);
        a8.append(", gbcData=");
        a8.append(this.f5259g);
        a8.append(')');
        return a8.toString();
    }
}
