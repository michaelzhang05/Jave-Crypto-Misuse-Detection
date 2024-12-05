package com.stripe.android.paymentsheet;

import androidx.compose.material.ColorsKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.stripe.android.paymentsheet.u;
import kotlin.jvm.internal.AbstractC3255y;
import m4.C3429a;
import m4.C3430b;
import m4.C3431c;
import m4.C3432d;
import m4.C3436h;
import m4.C3438j;
import m4.C3439k;
import m4.C3440l;

/* loaded from: classes4.dex */
public abstract class v {
    public static final void a(u.b bVar) {
        m4.n a8;
        int w8;
        int w9;
        float g8;
        float b8;
        long pack;
        AbstractC3255y.i(bVar, "<this>");
        C3439k c3439k = C3439k.f35205a;
        C3440l c3440l = C3440l.f35212a;
        c3439k.f(C3436h.b(c3440l.c(), ColorKt.Color(bVar.b().h()), ColorKt.Color(bVar.b().i()), ColorKt.Color(bVar.b().l()), ColorKt.Color(bVar.b().s()), ColorKt.Color(bVar.b().x()), 0L, ColorKt.Color(bVar.b().v()), ColorKt.Color(bVar.b().g()), ColorsKt.m1205lightColors2qZNXz8$default(ColorKt.Color(bVar.b().w()), 0L, 0L, 0L, 0L, ColorKt.Color(bVar.b().y()), ColorKt.Color(bVar.b().p()), 0L, 0L, 0L, ColorKt.Color(bVar.b().u()), 0L, 2974, null), 32, null));
        c3439k.e(C3436h.b(c3440l.b(), ColorKt.Color(bVar.a().h()), ColorKt.Color(bVar.a().i()), ColorKt.Color(bVar.a().l()), ColorKt.Color(bVar.a().s()), ColorKt.Color(bVar.a().x()), 0L, ColorKt.Color(bVar.a().v()), ColorKt.Color(bVar.a().g()), ColorsKt.m1203darkColors2qZNXz8$default(ColorKt.Color(bVar.a().w()), 0L, 0L, 0L, 0L, ColorKt.Color(bVar.a().y()), ColorKt.Color(bVar.a().p()), 0L, 0L, 0L, ColorKt.Color(bVar.a().u()), 0L, 2974, null), 32, null));
        c3439k.h(C3438j.b(c3440l.e(), bVar.h().g(), bVar.h().b(), 0.0f, 4, null));
        a8 = r4.a((r42 & 1) != 0 ? r4.f35239a : 0, (r42 & 2) != 0 ? r4.f35240b : 0, (r42 & 4) != 0 ? r4.f35241c : 0, (r42 & 8) != 0 ? r4.f35242d : bVar.i().g(), (r42 & 16) != 0 ? r4.f35243e : 0L, (r42 & 32) != 0 ? r4.f35244f : 0L, (r42 & 64) != 0 ? r4.f35245g : 0L, (r42 & 128) != 0 ? r4.f35246h : 0L, (r42 & 256) != 0 ? r4.f35247i : 0L, (r42 & 512) != 0 ? r4.f35248j : 0L, (r42 & 1024) != 0 ? r4.f35249k : bVar.i().b(), (r42 & 2048) != 0 ? r4.f35250l : null, (r42 & 4096) != 0 ? r4.f35251m : null, (r42 & 8192) != 0 ? r4.f35252n : null, (r42 & 16384) != 0 ? r4.f35253o : null, (r42 & 32768) != 0 ? r4.f35254p : null, (r42 & 65536) != 0 ? r4.f35255q : null, (r42 & 131072) != 0 ? c3440l.f().f35256r : null);
        c3439k.i(a8);
        C3431c d8 = c3440l.d();
        Integer g9 = bVar.g().b().g();
        if (g9 != null) {
            w8 = g9.intValue();
        } else {
            w8 = bVar.b().w();
        }
        C3429a c3429a = new C3429a(ColorKt.Color(w8), ColorKt.Color(bVar.g().b().i()), ColorKt.Color(bVar.g().b().h()), ColorKt.Color(bVar.g().b().p()), ColorKt.Color(bVar.g().b().l()), null);
        Integer g10 = bVar.g().a().g();
        if (g10 != null) {
            w9 = g10.intValue();
        } else {
            w9 = bVar.a().w();
        }
        C3429a c3429a2 = new C3429a(ColorKt.Color(w9), ColorKt.Color(bVar.g().a().i()), ColorKt.Color(bVar.g().a().h()), ColorKt.Color(bVar.g().a().p()), ColorKt.Color(bVar.g().a().l()), null);
        Float b9 = bVar.g().g().b();
        if (b9 != null) {
            g8 = b9.floatValue();
        } else {
            g8 = bVar.h().g();
        }
        Float a9 = bVar.g().g().a();
        if (a9 != null) {
            b8 = a9.floatValue();
        } else {
            b8 = bVar.h().b();
        }
        C3430b c3430b = new C3430b(g8, b8);
        Integer a10 = bVar.g().h().a();
        if (a10 == null) {
            a10 = bVar.i().b();
        }
        Float b10 = bVar.g().h().b();
        if (b10 != null) {
            pack = TextUnitKt.getSp(b10.floatValue());
        } else {
            long n8 = c3440l.f().n();
            float g11 = bVar.i().g();
            TextUnitKt.m5383checkArithmeticR2X_6o(n8);
            pack = TextUnitKt.pack(TextUnit.m5368getRawTypeimpl(n8), TextUnit.m5370getValueimpl(n8) * g11);
        }
        c3439k.g(d8.a(c3429a, c3429a2, c3430b, new C3432d(a10, pack, null)));
    }

    public static final void b(u.g gVar) {
        u.h a8;
        String id;
        AbstractC3255y.i(gVar, "<this>");
        if (!j6.n.u(gVar.v())) {
            u.i l8 = gVar.l();
            if (l8 != null && (id = l8.getId()) != null && j6.n.u(id)) {
                throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the Customer ID cannot be an empty string.");
            }
            u.i l9 = gVar.l();
            if (l9 != null && (a8 = l9.a()) != null) {
                if (a8 instanceof u.h.b) {
                    if (j6.n.u(((u.h.b) a8).a()) || j6.n.u(gVar.l().b())) {
                        throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the ephemeralKeySecret cannot be an empty string.");
                    }
                    return;
                } else {
                    if (a8 instanceof u.h.a) {
                        String I8 = ((u.h.a) a8).I();
                        if (!j6.n.u(I8)) {
                            if (!j6.n.C(I8, "ek_", false, 2, null)) {
                                if (!j6.n.C(I8, "cuss_", false, 2, null)) {
                                    throw new IllegalArgumentException("Argument does not look like a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create");
                                }
                                return;
                            }
                            throw new IllegalArgumentException("Argument looks like an Ephemeral Key secret, but expecting a CustomerSession client secret. See CustomerSession API: https://docs.stripe.com/api/customer_sessions/create");
                        }
                        throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the customerSessionClientSecret cannot be an empty string.");
                    }
                    return;
                }
            }
            return;
        }
        throw new IllegalArgumentException("When a Configuration is passed to PaymentSheet, the Merchant display name cannot be an empty string.");
    }
}
