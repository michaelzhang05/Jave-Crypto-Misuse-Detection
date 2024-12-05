package f3;

import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2831g implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2831g f31890b = new C2831g();

    private C2831g() {
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e3.n a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        String l8 = y2.e.l(json, "payment_method");
        if (l8 == null) {
            return null;
        }
        return new e3.n(l8);
    }
}
