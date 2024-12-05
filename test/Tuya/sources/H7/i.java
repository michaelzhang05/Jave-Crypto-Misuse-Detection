package H7;

import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import r5.AbstractC3689a;
import y5.t;

/* loaded from: classes5.dex */
public final class i extends h {

    /* renamed from: e, reason: collision with root package name */
    public final String f3638e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3639f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3640g;

    /* renamed from: h, reason: collision with root package name */
    public final String f3641h;

    /* renamed from: i, reason: collision with root package name */
    public final String f3642i;

    /* renamed from: j, reason: collision with root package name */
    public final String f3643j;

    public i(String accountId, String publisher, int i8, String cmpVersion, String displayType, String configurationHashCode) {
        AbstractC3159y.i(accountId, "accountId");
        AbstractC3159y.i(publisher, "publisher");
        AbstractC3159y.i(cmpVersion, "cmpVersion");
        AbstractC3159y.i(displayType, "displayType");
        AbstractC3159y.i(configurationHashCode, "configurationHashCode");
        this.f3638e = accountId;
        this.f3639f = publisher;
        this.f3640g = i8;
        this.f3641h = cmpVersion;
        this.f3642i = displayType;
        this.f3643j = configurationHashCode;
    }

    @Override // H7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("accountId", this.f3638e);
        jSONObject.put("publisher", this.f3639f);
        jSONObject.put("cmpId", this.f3640g);
        jSONObject.put("cmpVersion", this.f3641h);
        jSONObject.put("displayType", this.f3642i);
        jSONObject.put("configurationHashCode", this.f3643j);
        jSONObject.put("clientTimestamp", this.f3634a);
        jSONObject.put("operationType", this.f3635b.f3612a);
        jSONObject.put("sessionId", this.f3636c);
        jSONObject.put("domain", this.f3637d);
        String jSONObject2 = jSONObject.toString();
        AbstractC3159y.h(jSONObject2, "JSONObject().apply {\n   … domain)\n    }.toString()");
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
        if (AbstractC3159y.d(this.f3638e, iVar.f3638e) && AbstractC3159y.d(this.f3639f, iVar.f3639f) && this.f3640g == iVar.f3640g && AbstractC3159y.d(this.f3641h, iVar.f3641h) && AbstractC3159y.d(this.f3642i, iVar.f3642i) && AbstractC3159y.d(this.f3643j, iVar.f3643j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f3643j.hashCode() + t.a(this.f3642i, t.a(this.f3641h, C6.k.a(this.f3640g, t.a(this.f3639f, this.f3638e.hashCode() * 31, 31), 31), 31), 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC3689a.a("TrackingInitLog(accountId=");
        a8.append(this.f3638e);
        a8.append(", publisher=");
        a8.append(this.f3639f);
        a8.append(", cmpId=");
        a8.append(this.f3640g);
        a8.append(", cmpVersion=");
        a8.append(this.f3641h);
        a8.append(", displayType=");
        a8.append(this.f3642i);
        a8.append(", configurationHashCode=");
        a8.append(this.f3643j);
        a8.append(')');
        return a8.toString();
    }
}
