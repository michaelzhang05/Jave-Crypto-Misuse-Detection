package I1;

import J1.b;
import J1.e;
import J1.f;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class c implements b.InterfaceC0072b {

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f3974a;

    /* renamed from: b, reason: collision with root package name */
    private final J1.c f3975b;

    public c(J1.c cVar) {
        this.f3975b = cVar;
    }

    @Override // J1.b.InterfaceC0072b
    public JSONObject a() {
        return this.f3974a;
    }

    public void b(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f3975b.c(new e(this, hashSet, jSONObject, j8));
    }

    public void c() {
        this.f3975b.c(new J1.d(this));
    }

    public void d(JSONObject jSONObject, HashSet hashSet, long j8) {
        this.f3975b.c(new f(this, hashSet, jSONObject, j8));
    }

    @Override // J1.b.InterfaceC0072b
    public void a(JSONObject jSONObject) {
        this.f3974a = jSONObject;
    }
}
