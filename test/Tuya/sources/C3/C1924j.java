package c3;

import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1924j implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    public static final C1924j f14918b = new C1924j();

    private C1924j() {
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b3.q a(JSONObject json) {
        AbstractC3159y.i(json, "json");
        b3.o a8 = new C1922h().a(json);
        String l8 = v2.e.l(json, "publishable_key");
        if (a8 != null) {
            return new b3.q(a8, l8);
        }
        return null;
    }
}
