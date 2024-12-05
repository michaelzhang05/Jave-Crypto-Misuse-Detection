package J1;

import J1.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet f4806c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f4807d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f4808e;

    public a(b.InterfaceC0072b interfaceC0072b, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(interfaceC0072b);
        this.f4806c = new HashSet(hashSet);
        this.f4807d = jSONObject;
        this.f4808e = j8;
    }
}
