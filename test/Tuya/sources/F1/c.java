package F1;

import G1.b;
import G1.e;
import G1.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements b.InterfaceC0046b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f2434a;

    /* renamed from: b, reason: collision with root package name */
    private final G1.c f2435b;

    public c(G1.c cVar) {
        this.f2435b = cVar;
    }

    @Override // G1.b.InterfaceC0046b
    public JSONObject a() {
        return this.f2434a;
    }

    public void b(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f2435b.c(new e(this, hashSet, jSONObject, j8));
    }

    public void c() {
        this.f2435b.c(new G1.d(this));
    }

    public void d(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f2435b.c(new f(this, hashSet, jSONObject, j8));
    }

    @Override // G1.b.InterfaceC0046b
    public void a(JSONObject jSONObject) {
        this.f2434a = jSONObject;
    }
}
