package G1;

import G1.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class a extends b {

    /* renamed from: c, reason: collision with root package name */
    protected final HashSet f3087c;

    /* renamed from: d, reason: collision with root package name */
    protected final JSONObject f3088d;

    /* renamed from: e, reason: collision with root package name */
    protected final long f3089e;

    public a(b.InterfaceC0046b interfaceC0046b, HashSet hashSet, JSONObject jSONObject, long j8) {
        super(interfaceC0046b);
        this.f3087c = new HashSet(hashSet);
        this.f3088d = jSONObject;
        this.f3089e = j8;
    }
}
