package B1;

import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final k f721a;

    /* renamed from: b, reason: collision with root package name */
    private final k f722b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f723c;

    /* renamed from: d, reason: collision with root package name */
    private final f f724d;

    /* renamed from: e, reason: collision with root package name */
    private final i f725e;

    private c(f fVar, i iVar, k kVar, k kVar2, boolean z8) {
        this.f724d = fVar;
        this.f725e = iVar;
        this.f721a = kVar;
        if (kVar2 == null) {
            this.f722b = k.NONE;
        } else {
            this.f722b = kVar2;
        }
        this.f723c = z8;
    }

    public static c a(f fVar, i iVar, k kVar, k kVar2, boolean z8) {
        H1.g.d(fVar, "CreativeType is null");
        H1.g.d(iVar, "ImpressionType is null");
        H1.g.d(kVar, "Impression owner is null");
        H1.g.b(kVar, fVar, iVar);
        return new c(fVar, iVar, kVar, kVar2, z8);
    }

    public boolean b() {
        if (k.NATIVE == this.f721a) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (k.NATIVE == this.f722b) {
            return true;
        }
        return false;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        H1.c.i(jSONObject, "impressionOwner", this.f721a);
        H1.c.i(jSONObject, "mediaEventsOwner", this.f722b);
        H1.c.i(jSONObject, "creativeType", this.f724d);
        H1.c.i(jSONObject, "impressionType", this.f725e);
        H1.c.i(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f723c));
        return jSONObject;
    }
}
