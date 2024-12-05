package K7;

import B5.t;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class i extends h {

    /* renamed from: e, reason: collision with root package name */
    public final String f5241e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5242f;

    /* renamed from: g, reason: collision with root package name */
    public final int f5243g;

    /* renamed from: h, reason: collision with root package name */
    public final String f5244h;

    /* renamed from: i, reason: collision with root package name */
    public final String f5245i;

    /* renamed from: j, reason: collision with root package name */
    public final String f5246j;

    public i(String accountId, String publisher, int i8, String cmpVersion, String displayType, String configurationHashCode) {
        AbstractC3255y.i(accountId, "accountId");
        AbstractC3255y.i(publisher, "publisher");
        AbstractC3255y.i(cmpVersion, "cmpVersion");
        AbstractC3255y.i(displayType, "displayType");
        AbstractC3255y.i(configurationHashCode, "configurationHashCode");
        this.f5241e = accountId;
        this.f5242f = publisher;
        this.f5243g = i8;
        this.f5244h = cmpVersion;
        this.f5245i = displayType;
        this.f5246j = configurationHashCode;
    }

    @Override // K7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("accountId", this.f5241e);
        jSONObject.put("publisher", this.f5242f);
        jSONObject.put("cmpId", this.f5243g);
        jSONObject.put("cmpVersion", this.f5244h);
        jSONObject.put("displayType", this.f5245i);
        jSONObject.put("configurationHashCode", this.f5246j);
        jSONObject.put("clientTimestamp", this.f5237a);
        jSONObject.put("operationType", this.f5238b.f5215a);
        jSONObject.put("sessionId", this.f5239c);
        jSONObject.put("domain", this.f5240d);
        String jSONObject2 = jSONObject.toString();
        AbstractC3255y.h(jSONObject2, "JSONObject().apply {\n   … domain)\n    }.toString()");
        return jSONObject2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (AbstractC3255y.d(this.f5241e, iVar.f5241e) && AbstractC3255y.d(this.f5242f, iVar.f5242f) && this.f5243g == iVar.f5243g && AbstractC3255y.d(this.f5244h, iVar.f5244h) && AbstractC3255y.d(this.f5245i, iVar.f5245i) && AbstractC3255y.d(this.f5246j, iVar.f5246j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5246j.hashCode() + t.a(this.f5245i, t.a(this.f5244h, F6.k.a(this.f5243g, t.a(this.f5242f, this.f5241e.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("TrackingInitLog(accountId=");
        a8.append(this.f5241e);
        a8.append(", publisher=");
        a8.append(this.f5242f);
        a8.append(", cmpId=");
        a8.append(this.f5243g);
        a8.append(", cmpVersion=");
        a8.append(this.f5244h);
        a8.append(", displayType=");
        a8.append(this.f5245i);
        a8.append(", configurationHashCode=");
        a8.append(this.f5246j);
        a8.append(')');
        return a8.toString();
    }
}
