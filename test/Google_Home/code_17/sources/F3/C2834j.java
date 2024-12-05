package f3;

import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2834j implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    public static final C2834j f31893b = new C2834j();

    private C2834j() {
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e3.q a(JSONObject json) {
        AbstractC3255y.i(json, "json");
        e3.o a8 = new C2832h().a(json);
        String l8 = y2.e.l(json, "publishable_key");
        if (a8 != null) {
            return new e3.q(a8, l8);
        }
        return null;
    }
}
