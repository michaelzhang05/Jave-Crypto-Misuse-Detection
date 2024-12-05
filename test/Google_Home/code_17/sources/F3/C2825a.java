package f3;

import e3.C2787a;
import e3.C2789c;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import org.json.JSONObject;
import z2.InterfaceC4225a;

/* renamed from: f3.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2825a implements InterfaceC4225a {

    /* renamed from: b, reason: collision with root package name */
    private static final C0734a f31883b = new C0734a(null);

    /* renamed from: f3.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    private static final class C0734a {
        private C0734a() {
        }

        public /* synthetic */ C0734a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    @Override // z2.InterfaceC4225a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2787a a(JSONObject json) {
        Object obj;
        AbstractC3255y.i(json, "json");
        String l8 = y2.e.l(json, "account_range_high");
        String l9 = y2.e.l(json, "account_range_low");
        Integer i8 = y2.e.f40920a.i(json, "pan_length");
        String l10 = y2.e.l(json, "brand");
        Iterator<E> it = C2787a.EnumC0723a.d().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (AbstractC3255y.d(((C2787a.EnumC0723a) obj).c(), l10)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C2787a.EnumC0723a enumC0723a = (C2787a.EnumC0723a) obj;
        if (l8 == null || l9 == null || i8 == null || enumC0723a == null) {
            return null;
        }
        return new C2787a(new C2789c(l9, l8), i8.intValue(), enumC0723a, y2.e.l(json, "country"));
    }
}
