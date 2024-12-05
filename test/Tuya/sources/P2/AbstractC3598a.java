package p2;

import kotlin.jvm.internal.AbstractC3159y;
import q3.w;
import r2.f;
import t2.AbstractC3790k;
import t2.C3780a;
import t2.C3787h;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;

/* renamed from: p2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3598a {
    public static final InterfaceC3983b a(Throwable th) {
        C3780a c3780a;
        C3787h c3787h;
        f d8;
        String j8;
        String g8;
        AbstractC3159y.i(th, "<this>");
        AbstractC3790k abstractC3790k = null;
        if (th instanceof C3780a) {
            c3780a = (C3780a) th;
        } else {
            c3780a = null;
        }
        if (c3780a != null) {
            return AbstractC3984c.a(w.f37465h);
        }
        if (th instanceof C3787h) {
            c3787h = (C3787h) th;
        } else {
            c3787h = null;
        }
        if (c3787h != null && (g8 = c3787h.g()) != null) {
            return AbstractC3984c.b(g8);
        }
        if (th instanceof AbstractC3790k) {
            abstractC3790k = (AbstractC3790k) th;
        }
        if (abstractC3790k != null && (d8 = abstractC3790k.d()) != null && (j8 = d8.j()) != null) {
            return AbstractC3984c.b(j8);
        }
        return AbstractC3984c.a(w.f37466h0);
    }
}
