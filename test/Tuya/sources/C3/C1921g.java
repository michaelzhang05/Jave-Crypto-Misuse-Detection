package c3;

import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1921g implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    public static final C1921g f14915b = new C1921g();

    private C1921g() {
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b3.n a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        String l8 = v2.e.l(json, "payment_method");
        if (l8 == null) {
            return null;
        }
        return new b3.n(l8);
    }
}
