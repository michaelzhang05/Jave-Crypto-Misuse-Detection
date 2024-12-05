package K7;

import androidx.core.app.NotificationCompat;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import u5.AbstractC4062a;

/* loaded from: classes5.dex */
public final class o extends h {

    /* renamed from: e, reason: collision with root package name */
    public long f5292e;

    /* renamed from: f, reason: collision with root package name */
    public final String f5293f;

    public o(long j8, String event) {
        AbstractC3255y.i(event, "event");
        this.f5292e = j8;
        this.f5293f = event;
    }

    @Override // K7.h
    public String a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("clientTimestamp", Long.valueOf(this.f5292e));
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f5293f);
        jSONObject.putOpt("sessionId", this.f5239c);
        String jSONObject2 = jSONObject.toString();
        AbstractC3255y.h(jSONObject2, "JSONObject().apply {\n   …ssionId)\n    }.toString()");
        return jSONObject2;
    }

    @Override // K7.h
    public void b(long j8) {
        this.f5292e = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f5292e == oVar.f5292e && AbstractC3255y.d(this.f5293f, oVar.f5293f)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f5293f.hashCode() + (androidx.collection.a.a(this.f5292e) * 31);
    }

    public String toString() {
        StringBuilder a8 = AbstractC4062a.a("UserEvent(clientTimestamp=");
        a8.append(this.f5292e);
        a8.append(", event=");
        a8.append(this.f5293f);
        a8.append(')');
        return a8.toString();
    }
}
