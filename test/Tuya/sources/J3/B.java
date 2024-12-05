package J3;

import b3.EnumC1870e;
import com.stripe.android.model.o;
import kotlin.jvm.internal.AbstractC3159y;
import y2.AbstractC3984c;
import y2.InterfaceC3983b;
import y4.AbstractC3993a;

/* loaded from: classes4.dex */
public abstract class B {

    /* loaded from: classes4.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4771a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f4772b;

        static {
            int[] iArr = new int[o.p.values().length];
            try {
                iArr[o.p.f24532i.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[o.p.f24536m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[o.p.f24522O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f4771a = iArr;
            int[] iArr2 = new int[EnumC1870e.values().length];
            try {
                iArr2[EnumC1870e.f14438o.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[EnumC1870e.f14440q.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC1870e.f14441r.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC1870e.f14442s.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[EnumC1870e.f14443t.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC1870e.f14439p.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC1870e.f14444u.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC1870e.f14445v.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[EnumC1870e.f14446w.ordinal()] = 9;
            } catch (NoSuchFieldError unused12) {
            }
            f4772b = iArr2;
        }
    }

    public static final InterfaceC3983b a(String str) {
        if (str == null) {
            return null;
        }
        return AbstractC3984c.f(q3.w.f37445U, new Object[]{str}, null, 4, null);
    }

    public static final int b(EnumC1870e enumC1870e) {
        AbstractC3159y.i(enumC1870e, "<this>");
        switch (a.f4772b[enumC1870e.ordinal()]) {
            case 1:
                return q3.t.f37410q;
            case 2:
                return q3.t.f37402i;
            case 3:
                return q3.t.f37405l;
            case 4:
                return q3.t.f37406m;
            case 5:
                return q3.t.f37404k;
            case 6:
                return q3.t.f37407n;
            case 7:
                return q3.t.f37408o;
            case 8:
                return q3.t.f37403j;
            case 9:
                return q3.t.f37409p;
            default:
                throw new L5.p();
        }
    }

    public static final int c(EnumC1870e enumC1870e) {
        AbstractC3159y.i(enumC1870e, "<this>");
        switch (a.f4772b[enumC1870e.ordinal()]) {
            case 1:
                return AbstractC3993a.f39857t;
            case 2:
                return AbstractC3993a.f39839b;
            case 3:
                return AbstractC3993a.f39847j;
            case 4:
                return AbstractC3993a.f39850m;
            case 5:
                return AbstractC3993a.f39845h;
            case 6:
                return AbstractC3993a.f39852o;
            case 7:
                return AbstractC3993a.f39854q;
            case 8:
                return AbstractC3993a.f39841d;
            case 9:
                return q3.t.f37409p;
            default:
                throw new L5.p();
        }
    }

    public static final InterfaceC3983b d(com.stripe.android.model.o oVar) {
        int i8;
        String str;
        String str2;
        AbstractC3159y.i(oVar, "<this>");
        o.p pVar = oVar.f24412e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f4771a[pVar.ordinal()];
        }
        String str3 = null;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    return null;
                }
                int i9 = q3.w.f37445U;
                o.r rVar = oVar.f24425r;
                if (rVar != null) {
                    str2 = rVar.f24560e;
                } else {
                    str2 = null;
                }
                return AbstractC3984c.f(i9, new Object[]{str2}, null, 4, null);
            }
            int i10 = q3.w.f37445U;
            o.n nVar = oVar.f24419l;
            if (nVar != null) {
                str = nVar.f24506e;
            } else {
                str = null;
            }
            return AbstractC3984c.f(i10, new Object[]{str}, null, 4, null);
        }
        o.g gVar = oVar.f24415h;
        if (gVar != null) {
            str3 = gVar.f24482h;
        }
        return a(str3);
    }

    public static final Integer e(com.stripe.android.model.o oVar) {
        int i8;
        AbstractC3159y.i(oVar, "<this>");
        o.p pVar = oVar.f24412e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f4771a[pVar.ordinal()];
        }
        if (i8 == 3) {
            return Integer.valueOf(q3.t.f37401h);
        }
        return null;
    }

    public static final int f(com.stripe.android.model.o oVar, boolean z8) {
        int i8;
        String str;
        int b8;
        o.r rVar;
        String str2;
        AbstractC3159y.i(oVar, "<this>");
        o.p pVar = oVar.f24412e;
        if (pVar == null) {
            i8 = -1;
        } else {
            i8 = a.f4771a[pVar.ordinal()];
        }
        Integer num = null;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3 && (rVar = oVar.f24425r) != null && (str2 = rVar.f24558c) != null) {
                    num = Integer.valueOf(B3.b.f741a.a(str2));
                }
            } else {
                num = Integer.valueOf(q3.t.f37417x);
            }
        } else {
            EnumC1870e.a aVar = EnumC1870e.f14436m;
            o.g gVar = oVar.f24415h;
            if (gVar != null) {
                str = gVar.f24486l;
            } else {
                str = null;
            }
            EnumC1870e b9 = aVar.b(str);
            if (b9 == EnumC1870e.f14446w) {
                b9 = null;
            }
            if (b9 == null) {
                o.g gVar2 = oVar.f24415h;
                if (gVar2 != null) {
                    b9 = gVar2.f24475a;
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
        return q3.t.f37409p;
    }

    public static /* synthetic */ int g(com.stripe.android.model.o oVar, boolean z8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = false;
        }
        return f(oVar, z8);
    }
}
