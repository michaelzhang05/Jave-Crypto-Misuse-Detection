package r3;

import L5.p;
import e4.C2597a;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3159y;
import m4.AbstractC3419i;
import m4.W;
import r3.d;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f37613a = new f();

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f37614a;

        static {
            int[] iArr = new int[d.b.values().length];
            try {
                iArr[d.b.f37600a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.f37601b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.b.f37602c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f37614a = iArr;
        }
    }

    private f() {
    }

    public final C2597a a(boolean z8, e eVar, Function0 onNavigation) {
        f fVar;
        d.b bVar;
        C2597a c2597a;
        String str;
        Set set;
        Set e8;
        String str2;
        Set set2;
        d b8;
        AbstractC3159y.i(onNavigation, "onNavigation");
        C2597a c2597a2 = null;
        if (eVar != null && (b8 = eVar.b()) != null) {
            bVar = b8.c();
            fVar = this;
        } else {
            fVar = this;
            bVar = null;
        }
        W b9 = fVar.b(bVar);
        if (z8) {
            if (eVar != null) {
                str2 = eVar.k();
            } else {
                str2 = null;
            }
            if (eVar != null) {
                set2 = eVar.i();
            } else {
                set2 = null;
            }
            c2597a = new C2597a(null, null, null, false, new AbstractC3419i.b(str2, set2, b9, onNavigation), false, 39, null);
        } else {
            if (eVar != null) {
                str = eVar.k();
            } else {
                str = null;
            }
            if (eVar != null) {
                set = eVar.i();
            } else {
                set = null;
            }
            c2597a = new C2597a(null, null, null, false, new AbstractC3419i.c(str, set, b9, onNavigation), false, 39, null);
        }
        if (eVar != null && (e8 = eVar.e()) != null) {
            c2597a2 = C2597a.j(c2597a, null, e8, null, false, null, false, 61, null);
        }
        if (c2597a2 != null) {
            return c2597a2;
        }
        return c2597a;
    }

    public final W b(d.b bVar) {
        int i8;
        if (bVar == null) {
            i8 = -1;
        } else {
            i8 = a.f37614a[bVar.ordinal()];
        }
        if (i8 != -1) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        return W.f35292d;
                    }
                    throw new p();
                }
                return W.f35291c;
            }
            return W.f35290b;
        }
        return W.f35291c;
    }
}
