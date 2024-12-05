package e4;

import M5.AbstractC1246t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k4.EnumC3126f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l6.InterfaceC3349K;
import m4.AbstractC3419i;
import m4.C3410b;
import m4.C3434y;

/* renamed from: e4.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2587A extends C3410b {

    /* renamed from: t, reason: collision with root package name */
    private final b4.c f30267t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3349K f30268u;

    /* renamed from: e4.A$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3160z implements Function1 {

        /* renamed from: e4.A$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0728a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ R5.a f30270a = R5.b.a(EnumC3126f.values());
        }

        /* renamed from: e4.A$a$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30271a;

            static {
                int[] iArr = new int[b4.c.values().length];
                try {
                    iArr[b4.c.f14610b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b4.c.f14611c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b4.c.f14609a.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f30271a = iArr;
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke(String str) {
            int hashCode;
            int i8 = b.f30271a[C2587A.this.f30267t.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        if (str != null && ((hashCode = str.hashCode()) == 2142 ? str.equals("CA") : !(hashCode == 2267 ? !str.equals("GB") : !(hashCode == 2718 && str.equals("US"))))) {
                            R5.a aVar = C0728a.f30270a;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : aVar) {
                                EnumC3126f enumC3126f = (EnumC3126f) obj;
                                if (enumC3126f != EnumC3126f.f33475i && enumC3126f != EnumC3126f.f33478l) {
                                    arrayList.add(obj);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(AbstractC1246t.x(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((EnumC3126f) it.next()).e());
                            }
                            return AbstractC1246t.b1(arrayList2);
                        }
                        R5.a aVar2 = C0728a.f30270a;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : aVar2) {
                            if (((EnumC3126f) obj2) != EnumC3126f.f33478l) {
                                arrayList3.add(obj2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(AbstractC1246t.x(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((EnumC3126f) it2.next()).e());
                        }
                        return AbstractC1246t.b1(arrayList4);
                    }
                    throw new L5.p();
                }
                return M5.a0.f();
            }
            R5.a aVar3 = C0728a.f30270a;
            ArrayList arrayList5 = new ArrayList(AbstractC1246t.x(aVar3, 10));
            Iterator<E> it3 = aVar3.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((EnumC3126f) it3.next()).e());
            }
            return AbstractC1246t.b1(arrayList5);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2587A(m4.G r14, java.util.Map r15, java.util.Set r16, m4.C3434y r17, m4.e0 r18, java.util.Map r19, b4.c r20, int r21, kotlin.jvm.internal.AbstractC3151p r22) {
        /*
            r13 = this;
            r0 = r21 & 2
            if (r0 == 0) goto La
            java.util.Map r0 = M5.Q.h()
            r3 = r0
            goto Lb
        La:
            r3 = r15
        Lb:
            r0 = r21 & 4
            if (r0 == 0) goto L14
            java.util.Set r0 = M5.a0.f()
            goto L16
        L14:
            r0 = r16
        L16:
            r1 = r21 & 8
            if (r1 == 0) goto L3c
            m4.y r1 = new m4.y
            m4.t r2 = new m4.t
            r11 = 62
            r12 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r4 = r2
            r5 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            m4.G$b r4 = m4.G.Companion
            m4.G r4 = r4.l()
            java.lang.Object r4 = r3.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            r1.<init>(r2, r4)
            r5 = r1
            goto L3e
        L3c:
            r5 = r17
        L3e:
            r1 = r21 & 64
            if (r1 == 0) goto L46
            b4.c r1 = b4.c.f14609a
            r8 = r1
            goto L48
        L46:
            r8 = r20
        L48:
            r1 = r13
            r2 = r14
            r4 = r0
            r6 = r18
            r7 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.C2587A.<init>(m4.G, java.util.Map, java.util.Set, m4.y, m4.e0, java.util.Map, b4.c, int, kotlin.jvm.internal.p):void");
    }

    public final InterfaceC3349K w() {
        return this.f30268u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2587A(m4.G identifier, Map rawValuesMap, Set countryCodes, C3434y countryDropdownFieldController, m4.e0 e0Var, Map map, b4.c collectionMode) {
        super(identifier, rawValuesMap, new AbstractC3419i.a(null, 1, null), countryCodes, countryDropdownFieldController, e0Var, map, null, false, 384, null);
        AbstractC3159y.i(identifier, "identifier");
        AbstractC3159y.i(rawValuesMap, "rawValuesMap");
        AbstractC3159y.i(countryCodes, "countryCodes");
        AbstractC3159y.i(countryDropdownFieldController, "countryDropdownFieldController");
        AbstractC3159y.i(collectionMode, "collectionMode");
        this.f30267t = collectionMode;
        this.f30268u = v4.g.m(countryDropdownFieldController.y(), new a());
    }
}
