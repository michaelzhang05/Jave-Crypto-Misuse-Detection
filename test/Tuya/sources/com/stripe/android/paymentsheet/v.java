package com.stripe.android.paymentsheet;

import androidx.compose.material.ColorsKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitKt;
import com.stripe.android.paymentsheet.u;
import j4.C3075a;
import j4.C3076b;
import j4.C3077c;
import j4.C3078d;
import j4.C3082h;
import j4.C3084j;
import j4.C3085k;
import j4.C3086l;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes4.dex */
public abstract class v {
    public static final void a(u.b bVar) {
        j4.n a8;
        int u8;
        int u9;
        float e8;
        float c8;
        long pack;
        AbstractC3159y.i(bVar, "<this>");
        C3085k c3085k = C3085k.f33229a;
        C3086l c3086l = C3086l.f33236a;
        c3085k.f(C3082h.b(c3086l.c(), ColorKt.Color(bVar.c().f()), ColorKt.Color(bVar.c().i()), ColorKt.Color(bVar.c().j()), ColorKt.Color(bVar.c().n()), ColorKt.Color(bVar.c().z()), 0L, ColorKt.Color(bVar.c().s()), ColorKt.Color(bVar.c().e()), ColorsKt.m1200lightColors2qZNXz8$default(ColorKt.Color(bVar.c().u()), 0L, 0L, 0L, 0L, ColorKt.Color(bVar.c().G()), ColorKt.Color(bVar.c().k()), 0L, 0L, 0L, ColorKt.Color(bVar.c().o()), 0L, 2974, null), 32, null));
        c3085k.e(C3082h.b(c3086l.b(), ColorKt.Color(bVar.b().f()), ColorKt.Color(bVar.b().i()), ColorKt.Color(bVar.b().j()), ColorKt.Color(bVar.b().n()), ColorKt.Color(bVar.b().z()), 0L, ColorKt.Color(bVar.b().s()), ColorKt.Color(bVar.b().e()), ColorsKt.m1198darkColors2qZNXz8$default(ColorKt.Color(bVar.b().u()), 0L, 0L, 0L, 0L, ColorKt.Color(bVar.b().G()), ColorKt.Color(bVar.b().k()), 0L, 0L, 0L, ColorKt.Color(bVar.b().o()), 0L, 2974, null), 32, null));
        c3085k.h(C3084j.b(c3086l.e(), bVar.f().e(), bVar.f().c(), 0.0f, 4, null));
        a8 = r4.a((r42 & 1) != 0 ? r4.f33263a : 0, (r42 & 2) != 0 ? r4.f33264b : 0, (r42 & 4) != 0 ? r4.f33265c : 0, (r42 & 8) != 0 ? r4.f33266d : bVar.i().e(), (r42 & 16) != 0 ? r4.f33267e : 0L, (r42 & 32) != 0 ? r4.f33268f : 0L, (r42 & 64) != 0 ? r4.f33269g : 0L, (r42 & 128) != 0 ? r4.f33270h : 0L, (r42 & 256) != 0 ? r4.f33271i : 0L, (r42 & 512) != 0 ? r4.f33272j : 0L, (r42 & 1024) != 0 ? r4.f33273k : bVar.i().c(), (r42 & 2048) != 0 ? r4.f33274l : null, (r42 & 4096) != 0 ? r4.f33275m : null, (r42 & 8192) != 0 ? r4.f33276n : null, (r42 & 16384) != 0 ? r4.f33277o : null, (r42 & 32768) != 0 ? r4.f33278p : null, (r42 & 65536) != 0 ? r4.f33279q : null, (r42 & 131072) != 0 ? c3086l.f().f33280r : null);
        c3085k.i(a8);
        C3077c d8 = c3086l.d();
        Integer e9 = bVar.e().c().e();
        if (e9 != null) {
            u8 = e9.intValue();
        } else {
            u8 = bVar.c().u();
        }
        C3075a c3075a = new C3075a(ColorKt.Color(u8), ColorKt.Color(bVar.e().c().i()), ColorKt.Color(bVar.e().c().f()), ColorKt.Color(bVar.e().c().k()), ColorKt.Color(bVar.e().c().j()), null);
        Integer e10 = bVar.e().b().e();
        if (e10 != null) {
            u9 = e10.intValue();
        } else {
            u9 = bVar.b().u();
        }
        C3075a c3075a2 = new C3075a(ColorKt.Color(u9), ColorKt.Color(bVar.e().b().i()), ColorKt.Color(bVar.e().b().f()), ColorKt.Color(bVar.e().b().k()), ColorKt.Color(bVar.e().b().j()), null);
        Float c9 = bVar.e().e().c();
        if (c9 != null) {
            e8 = c9.floatValue();
        } else {
            e8 = bVar.f().e();
        }
        Float b8 = bVar.e().e().b();
        if (b8 != null) {
            c8 = b8.floatValue();
        } else {
            c8 = bVar.f().c();
        }
        C3076b c3076b = new C3076b(e8, c8);
        Integer b9 = bVar.e().f().b();
        if (b9 == null) {
            b9 = bVar.i().c();
        }
        Float c10 = bVar.e().f().c();
        if (c10 != null) {
            pack = TextUnitKt.getSp(c10.floatValue());
        } else {
            long n8 = c3086l.f().n();
            float e11 = bVar.i().e();
            TextUnitKt.m5378checkArithmeticR2X_6o(n8);
            pack = TextUnitKt.pack(TextUnit.m5363getRawTypeimpl(n8), TextUnit.m5365getValueimpl(n8) * e11);
        }
        c3085k.g(d8.a(c3075a, c3075a2, c3076b, new C3078d(b9, pack, null)));
    }

    public static final void b(u.g gVar) {
        u.h b8;
        String id;
        AbstractC3159y.i(gVar, "<this>");
        if (!g6.n.u(gVar.s())) {
            u.i j8 = gVar.j();
            if (j8 != null && (id = j8.getId()) != null && g6.n.u(id)) {
                throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the Customer ID cannot be an empty string.");
            }
            u.i j9 = gVar.j();
            if (j9 != null && (b8 = j9.b()) != null) {
                if (b8 instanceof u.h.b) {
                    if (g6.n.u(((u.h.b) b8).b()) || g6.n.u(gVar.j().c())) {
                        throw new IllegalArgumentException("When a CustomerConfiguration is passed to PaymentSheet, the ephemeralKeySecret cannot be an empty string.");
                    }
                    return;
                } else {
                    if (b8 instanceof u.h.a) {
                        String F8 = ((u.h.a) b8).F();
                        if (!g6.n.u(F8)) {
                            if (!g6.n.C(F8, "ek_", false, 2, null)) {
                                if (!g6.n.C(F8, "cuss_", false, 2, null)) {
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
