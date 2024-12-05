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
public final class k extends h {

    /* renamed from: e, reason: collision with root package name */
    public final List f5256e;

    public k(List userEvents) {
        AbstractC3255y.i(userEvents, "userEvents");
        this.f5256e = userEvents;
    }

    @Override // K7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5256e.iterator();
        while (it.hasNext()) {
            arrayList.add(new JSONObject(((o) it.next()).a()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList));
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
        if ((obj instanceof k) && AbstractC3255y.d(this.f5256e, ((k) obj).f5256e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5256e.hashCode();
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("TrackingUserEventsLog(userEvents=");
        a8.append(this.f5256e);
        a8.append(')');
        return a8.toString();
    }
}
