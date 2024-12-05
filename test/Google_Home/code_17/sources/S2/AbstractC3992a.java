package s2;

import B2.b;
import B2.c;
import kotlin.jvm.internal.AbstractC3255y;
import t3.w;
import u2.f;
import w2.AbstractC4144k;
import w2.C4134a;
import w2.C4141h;

/* renamed from: s2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3992a {
    public static final b a(Throwable th) {
        C4134a c4134a;
        C4141h c4141h;
        f d8;
        String i8;
        String g8;
        AbstractC3255y.i(th, "<this>");
        AbstractC4144k abstractC4144k = null;
        if (th instanceof C4134a) {
            c4134a = (C4134a) th;
        } else {
            c4134a = null;
        }
        if (c4134a != null) {
            return c.a(w.f39787h);
        }
        if (th instanceof C4141h) {
            c4141h = (C4141h) th;
        } else {
            c4141h = null;
        }
        if (c4141h != null && (g8 = c4141h.g()) != null) {
            return c.b(g8);
        }
        if (th instanceof AbstractC4144k) {
            abstractC4144k = (AbstractC4144k) th;
        }
        if (abstractC4144k != null && (d8 = abstractC4144k.d()) != null && (i8 = d8.i()) != null) {
            return c.b(i8);
        }
        return c.a(w.f39788h0);
    }
}
