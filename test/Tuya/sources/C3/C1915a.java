package c3;

import b3.C1866a;
import b3.C1868c;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import org.json.JSONObject;
import w2.InterfaceC3845a;

/* renamed from: c3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1915a implements InterfaceC3845a {

    /* renamed from: b, reason: collision with root package name */
    private static final C0368a f14908b = new C0368a(null);

    /* renamed from: c3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0368a {
        private C0368a() {
        }

        public /* synthetic */ C0368a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    @Override // w2.InterfaceC3845a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C1866a a(JSONObject json) {
        Object obj;
        AbstractC3159y.i(json, "json");
        String l8 = v2.e.l(json, "account_range_high");
        String l9 = v2.e.l(json, "account_range_low");
        Integer i8 = v2.e.f38789a.i(json, "pan_length");
        String l10 = v2.e.l(json, "brand");
        Iterator<E> it = C1866a.EnumC0355a.d().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3159y.d(((C1866a.EnumC0355a) obj).c(), l10)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C1866a.EnumC0355a enumC0355a = (C1866a.EnumC0355a) obj;
        if (l8 == null || l9 == null || i8 == null || enumC0355a == null) {
            return null;
        }
        return new C1866a(new C1868c(l9, l8), i8.intValue(), enumC0355a, v2.e.l(json, "country"));
    }
}
