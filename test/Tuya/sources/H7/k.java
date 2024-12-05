package H7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONArray;
import org.json.JSONObject;
import r5.AbstractC3689a;

/* loaded from: classes5.dex */
public final class k extends h {

    /* renamed from: e, reason: collision with root package name */
    public final List f3653e;

    public k(List userEvents) {
        AbstractC3159y.i(userEvents, "userEvents");
        this.f3653e = userEvents;
    }

    @Override // H7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f3653e.iterator();
        while (it.hasNext()) {
            arrayList.add(new JSONObject(((o) it.next()).a()));
        }
        jSONObject.put("userEvents", new JSONArray((Collection) arrayList));
        jSONObject.put("clientTimestamp", this.f3634a);
        jSONObject.put("operationType", this.f3635b.f3612a);
        jSONObject.putOpt("sessionId", this.f3636c);
        jSONObject.put("domain", this.f3637d);
        String jSONObject2 = jSONObject.toString();
        AbstractC3159y.h(jSONObject2, "JSONObject().apply {\n   … domain)\n    }.toString()");
        return jSONObject2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof k) && AbstractC3159y.d(this.f3653e, ((k) obj).f3653e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3653e.hashCode();
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("TrackingUserEventsLog(userEvents=");
        a8.append(this.f3653e);
        a8.append(')');
        return a8.toString();
    }
}
