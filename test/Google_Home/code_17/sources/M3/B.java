package M3;

import com.stripe.android.model.o;
import e3.EnumC2791e;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes4.dex */
public abstract class B {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6477a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f6478b;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f25587i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f25591m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f25577O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f6477a = iArr;
            int[] iArr2 = new int[EnumC2791e.values().length];
            try {
                iArr2[EnumC2791e.f31444o.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC2791e.f31446q.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC2791e.f31447r.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC2791e.f31448s.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC2791e.f31449t.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC2791e.f31445p.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC2791e.f31450u.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC2791e.f31451v.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC2791e.f31452w.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            f6478b = iArr2;
        }
    }

    public static final B2.b a(String str) {
        if (str == null) {
            return null;
        }
        return B2.c.f(t3.w.f39767U, new Object[]{str}, null, 4, null);
    }

    public static final int b(EnumC2791e enumC2791e) {
        AbstractC3255y.i(enumC2791e, "<this>");
        switch (a.f6478b[enumC2791e.ordinal()]) {
            case 1:
                return t3.t.f39732q;
            case 2:
                return t3.t.f39724i;
            case 3:
                return t3.t.f39727l;
            case 4:
                return t3.t.f39728m;
            case 5:
                return t3.t.f39726k;
            case 6:
                return t3.t.f39729n;
            case 7:
                return t3.t.f39730o;
            case 8:
                return t3.t.f39725j;
            case 9:
                return t3.t.f39731p;
            default:
                throw new O5.p();
        }
    }

    public static final int c(EnumC2791e enumC2791e) {
        AbstractC3255y.i(enumC2791e, "<this>");
        switch (a.f6478b[enumC2791e.ordinal()]) {
            case 1:
                return B4.a.f901t;
            case 2:
                return B4.a.f883b;
            case 3:
                return B4.a.f891j;
            case 4:
                return B4.a.f894m;
            case 5:
                return B4.a.f889h;
            case 6:
                return B4.a.f896o;
            case 7:
                return B4.a.f898q;
            case 8:
                return B4.a.f885d;
            case 9:
                return t3.t.f39731p;
            default:
                throw new O5.p();
        }
    }

    public static final B2.b d(com.stripe.android.model.o oVar) {
        int i8;
        String str;
        String str2;
        AbstractC3255y.i(oVar, "<this>");
        o.p pVar = oVar.f25467e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f6477a[pVar.ordinal()];
        }
        String str3 = null;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return null;
                }
                int i9 = t3.w.f39767U;
                o.r rVar = oVar.f25480r;
                if (rVar != null) {
                    str2 = rVar.f25615e;
                } else {
                    str2 = null;
                }
                return B2.c.f(i9, new Object[]{str2}, null, 4, null);
            }
            int i10 = t3.w.f39767U;
            o.n nVar = oVar.f25474l;
            if (nVar != null) {
                str = nVar.f25561e;
            } else {
                str = null;
            }
            return B2.c.f(i10, new Object[]{str}, null, 4, null);
        }
        o.g gVar = oVar.f25470h;
        if (gVar != null) {
            str3 = gVar.f25537h;
        }
        return a(str3);
    }

    public static final Integer e(com.stripe.android.model.o oVar) {
        int i8;
        AbstractC3255y.i(oVar, "<this>");
        o.p pVar = oVar.f25467e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f6477a[pVar.ordinal()];
        }
        if (i8 == 3) {
            return Integer.valueOf(t3.t.f39723h);
        }
        return null;
    }

    public static final int f(com.stripe.android.model.o oVar, boolean z8) {
        int i8;
        String str;
        int b8;
        o.r rVar;
        String str2;
        AbstractC3255y.i(oVar, "<this>");
        o.p pVar = oVar.f25467e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f6477a[pVar.ordinal()];
        }
        Integer num = null;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3 && (rVar = oVar.f25480r) != null && (str2 = rVar.f25613c) != null) {
                    num = Integer.valueOf(E3.b.f2336a.a(str2));
                }
            } else {
                num = Integer.valueOf(t3.t.f39739x);
            }
        } else {
            EnumC2791e.a aVar = EnumC2791e.f31442m;
            o.g gVar = oVar.f25470h;
            if (gVar != null) {
                str = gVar.f25541l;
            } else {
                str = null;
            }
            EnumC2791e b9 = aVar.b(str);
            if (b9 == EnumC2791e.f31452w) {
                b9 = null;
            }
            if (b9 == null) {
                o.g gVar2 = oVar.f25470h;
                if (gVar2 != null) {
                    b9 = gVar2.f25530a;
                } else {
                    b9 = null;
                }
            }
            if (z8) {
                if (b9 != null) {
                    b8 = c(b9);
                    num = Integer.valueOf(b8);
                }
            } else if (b9 != null) {
                b8 = b(b9);
                num = Integer.valueOf(b8);
            }
        }
        if (num != null) {
            return num.intValue();
        }
        return t3.t.f39731p;
    }

    public static /* synthetic */ int g(com.stripe.android.model.o oVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return f(oVar, z8);
    }
}
