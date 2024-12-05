package u3;

import O5.p;
import h4.C2917a;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import p4.AbstractC3762i;
import p4.W;
import u3.d;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final f f39993a = new f();

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39994a;

        static {
            int[] iArr = new int[d.b.values().length];
            try {
                iArr[d.b.f39980a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.b.f39981b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.b.f39982c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39994a = iArr;
        }
    }

    private f() {
    }

    public final C2917a a(boolean z8, e eVar, Function0 onNavigation) {
        f fVar;
        d.b bVar;
        C2917a c2917a;
        String str;
        Set set;
        Set g8;
        String str2;
        Set set2;
        d a8;
        AbstractC3255y.i(onNavigation, "onNavigation");
        C2917a c2917a2 = null;
        if (eVar != null && (a8 = eVar.a()) != null) {
            bVar = a8.b();
            fVar = this;
        } else {
            fVar = this;
            bVar = null;
        }
        W b8 = fVar.b(bVar);
        if (z8) {
            if (eVar != null) {
                str2 = eVar.p();
            } else {
                str2 = null;
            }
            if (eVar != null) {
                set2 = eVar.i();
            } else {
                set2 = null;
            }
            c2917a = new C2917a(null, null, null, false, new AbstractC3762i.b(str2, set2, b8, onNavigation), false, 39, null);
        } else {
            if (eVar != null) {
                str = eVar.p();
            } else {
                str = null;
            }
            if (eVar != null) {
                set = eVar.i();
            } else {
                set = null;
            }
            c2917a = new C2917a(null, null, null, false, new AbstractC3762i.c(str, set, b8, onNavigation), false, 39, null);
        }
        if (eVar != null && (g8 = eVar.g()) != null) {
            c2917a2 = C2917a.l(c2917a, null, g8, null, false, null, false, 61, null);
        }
        if (c2917a2 != null) {
            return c2917a2;
        }
        return c2917a;
    }

    public final W b(d.b bVar) {
        int i8;
        if (bVar == null) {
            i8 = -1;
        } else {
            i8 = a.f39994a[bVar.ordinal()];
        }
        if (i8 != -1) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        return W.f37318d;
                    }
                    throw new p();
                }
                return W.f37317c;
            }
            return W.f37316b;
        }
        return W.f37317c;
    }
}
