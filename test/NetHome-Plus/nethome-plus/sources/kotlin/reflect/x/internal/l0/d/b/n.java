package kotlin.reflect.x.internal.l0.d.b;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.l;
import kotlin.reflect.x.internal.l0.b.i;
import kotlin.reflect.x.internal.l0.d.b.l;
import kotlin.reflect.x.internal.l0.i.u.d;
import kotlin.reflect.x.internal.l0.i.u.e;
import kotlin.text.v;

/* compiled from: methodSignatureMapping.kt */
/* loaded from: classes2.dex */
final class n implements m<l> {
    public static final n a = new n();

    /* compiled from: methodSignatureMapping.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[i.values().length];
            iArr[i.BOOLEAN.ordinal()] = 1;
            iArr[i.CHAR.ordinal()] = 2;
            iArr[i.BYTE.ordinal()] = 3;
            iArr[i.SHORT.ordinal()] = 4;
            iArr[i.INT.ordinal()] = 5;
            iArr[i.FLOAT.ordinal()] = 6;
            iArr[i.LONG.ordinal()] = 7;
            iArr[i.DOUBLE.ordinal()] = 8;
            a = iArr;
        }
    }

    private n() {
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.m
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public l d(l lVar) {
        l.f(lVar, "possiblyPrimitiveType");
        if (!(lVar instanceof l.d)) {
            return lVar;
        }
        l.d dVar = (l.d) lVar;
        if (dVar.i() == null) {
            return lVar;
        }
        String f2 = d.c(dVar.i().B()).f();
        kotlin.jvm.internal.l.e(f2, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return c(f2);
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.m
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public l b(String str) {
        e eVar;
        l cVar;
        kotlin.jvm.internal.l.f(str, "representation");
        str.length();
        char charAt = str.charAt(0);
        e[] values = e.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i2];
            if (eVar.n().charAt(0) == charAt) {
                break;
            }
            i2++;
        }
        if (eVar != null) {
            return new l.d(eVar);
        }
        if (charAt == 'V') {
            return new l.d(null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            kotlin.jvm.internal.l.e(substring, "this as java.lang.String).substring(startIndex)");
            cVar = new l.a(b(substring));
        } else {
            if (charAt == 'L') {
                v.I(str, ';', false, 2, null);
            }
            String substring2 = str.substring(1, str.length() - 1);
            kotlin.jvm.internal.l.e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            cVar = new l.c(substring2);
        }
        return cVar;
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.m
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public l.c c(String str) {
        kotlin.jvm.internal.l.f(str, "internalName");
        return new l.c(str);
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.m
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public l f(i iVar) {
        kotlin.jvm.internal.l.f(iVar, "primitiveType");
        switch (a.a[iVar.ordinal()]) {
            case 1:
                return l.a.a();
            case 2:
                return l.a.c();
            case 3:
                return l.a.b();
            case 4:
                return l.a.h();
            case 5:
                return l.a.f();
            case 6:
                return l.a.e();
            case 7:
                return l.a.g();
            case 8:
                return l.a.d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.m
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public l e() {
        return c("java/lang/Class");
    }

    @Override // kotlin.reflect.x.internal.l0.d.b.m
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public String a(l lVar) {
        String n;
        kotlin.jvm.internal.l.f(lVar, "type");
        if (lVar instanceof l.a) {
            return '[' + a(((l.a) lVar).i());
        }
        if (lVar instanceof l.d) {
            e i2 = ((l.d) lVar).i();
            return (i2 == null || (n = i2.n()) == null) ? "V" : n;
        }
        if (!(lVar instanceof l.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return 'L' + ((l.c) lVar).i() + ';';
    }
}
