package H7;

import L5.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class l extends h {

    /* renamed from: e, reason: collision with root package name */
    public final List f3654e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3655f;

    /* renamed from: g, reason: collision with root package name */
    public final List f3656g;

    public l(List userEvents, String str, List list) {
        AbstractC3159y.i(userEvents, "userEvents");
        this.f3654e = userEvents;
        this.f3655f = str;
        this.f3656g = list;
    }

    @Override // H7.h
    public String a() {
        ArrayList arrayList;
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f3654e.iterator();
        while (it.hasNext()) {
            arrayList2.add(new JSONObject(((o) it.next()).a()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList2));
        jSONObject.putOpt("acceptanceState", this.f3655f);
        if (this.f3656g == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (r rVar : this.f3656g) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(String.valueOf(((Number) rVar.c()).intValue()), rVar.d());
                arrayList.add(jSONObject2);
            }
        }
        jSONObject.putOpt("gbcData", new JSONArray((Collection) arrayList));
        jSONObject.put("clientTimestamp", this.f3634a);
        jSONObject.put("operationType", this.f3635b.f3612a);
        jSONObject.putOpt("sessionId", this.f3636c);
        jSONObject.put("domain", this.f3637d);
        String jSONObject3 = jSONObject.toString();
        AbstractC3159y.h(jSONObject3, "JSONObject().apply {\n   … domain)\n    }.toString()");
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
        if (AbstractC3159y.d(this.f3654e, lVar.f3654e) && AbstractC3159y.d(this.f3655f, lVar.f3655f) && AbstractC3159y.d(this.f3656g, lVar.f3656g)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f3654e.hashCode() * 31;
        String str = this.f3655f;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 + hashCode) * 31;
        List list = this.f3656g;
        if (list != null) {
            i8 = list.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("TrackingUserGBCDoneLog(userEvents=");
        a8.append(this.f3654e);
        a8.append(", acceptanceState=");
        a8.append((Object) this.f3655f);
        a8.append(", gbcData=");
        a8.append(this.f3656g);
        a8.append(')');
        return a8.toString();
    }
}
