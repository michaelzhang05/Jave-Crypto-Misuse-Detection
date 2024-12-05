package h4;

import P5.AbstractC1378t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import n4.EnumC3481f;
import o6.InterfaceC3698L;
import p4.AbstractC3762i;
import p4.C3753b;
import p4.C3777y;

/* renamed from: h4.A, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2907A extends C3753b {

    /* renamed from: t, reason: collision with root package name */
    private final e4.c f32188t;

    /* renamed from: u, reason: collision with root package name */
    private final InterfaceC3698L f32189u;

    /* renamed from: h4.A$a */
    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function1 {

        /* renamed from: h4.A$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0754a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ U5.a f32191a = U5.b.a(EnumC3481f.values());
        }

        /* renamed from: h4.A$a$b */
        /* loaded from: classes4.dex */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f32192a;

            static {
                int[] iArr = new int[e4.c.values().length];
                try {
                    iArr[e4.c.f31616b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e4.c.f31617c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e4.c.f31615a.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f32192a = iArr;
            }
        }

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Set invoke(String str) {
            int hashCode;
            int i8 = b.f32192a[C2907A.this.f32188t.ordinal()];
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 == 3) {
                        if (str != null && ((hashCode = str.hashCode()) == 2142 ? str.equals("CA") : !(hashCode == 2267 ? !str.equals("GB") : !(hashCode == 2718 && str.equals("US"))))) {
                            U5.a aVar = C0754a.f32191a;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj : aVar) {
                                EnumC3481f enumC3481f = (EnumC3481f) obj;
                                if (enumC3481f != EnumC3481f.f35467i && enumC3481f != EnumC3481f.f35470l) {
                                    arrayList.add(obj);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(AbstractC1378t.x(arrayList, 10));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(((EnumC3481f) it.next()).e());
                            }
                            return AbstractC1378t.b1(arrayList2);
                        }
                        U5.a aVar2 = C0754a.f32191a;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj2 : aVar2) {
                            if (((EnumC3481f) obj2) != EnumC3481f.f35470l) {
                                arrayList3.add(obj2);
                            }
                        }
                        ArrayList arrayList4 = new ArrayList(AbstractC1378t.x(arrayList3, 10));
                        Iterator it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            arrayList4.add(((EnumC3481f) it2.next()).e());
                        }
                        return AbstractC1378t.b1(arrayList4);
                    }
                    throw new O5.p();
                }
                return P5.a0.f();
            }
            U5.a aVar3 = C0754a.f32191a;
            ArrayList arrayList5 = new ArrayList(AbstractC1378t.x(aVar3, 10));
            Iterator<E> it3 = aVar3.iterator();
            while (it3.hasNext()) {
                arrayList5.add(((EnumC3481f) it3.next()).e());
            }
            return AbstractC1378t.b1(arrayList5);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C2907A(p4.G r14, java.util.Map r15, java.util.Set r16, p4.C3777y r17, p4.e0 r18, java.util.Map r19, e4.c r20, int r21, kotlin.jvm.internal.AbstractC3247p r22) {
        /*
            r13 = this;
            r0 = r21 & 2
            if (r0 == 0) goto La
            java.util.Map r0 = P5.Q.h()
            r3 = r0
            goto Lb
        La:
            r3 = r15
        Lb:
            r0 = r21 & 4
            if (r0 == 0) goto L14
            java.util.Set r0 = P5.a0.f()
            goto L16
        L14:
            r0 = r16
        L16:
            r1 = r21 & 8
            if (r1 == 0) goto L3c
            p4.y r1 = new p4.y
            p4.t r2 = new p4.t
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
            p4.G$b r4 = p4.G.Companion
            p4.G r4 = r4.l()
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
            e4.c r1 = e4.c.f31615a
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
        throw new UnsupportedOperationException("Method not decompiled: h4.C2907A.<init>(p4.G, java.util.Map, java.util.Set, p4.y, p4.e0, java.util.Map, e4.c, int, kotlin.jvm.internal.p):void");
    }

    public final InterfaceC3698L w() {
        return this.f32189u;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2907A(p4.G identifier, Map rawValuesMap, Set countryCodes, C3777y countryDropdownFieldController, p4.e0 e0Var, Map map, e4.c collectionMode) {
        super(identifier, rawValuesMap, new AbstractC3762i.a(null, 1, null), countryCodes, countryDropdownFieldController, e0Var, map, null, false, 384, null);
        AbstractC3255y.i(identifier, "identifier");
        AbstractC3255y.i(rawValuesMap, "rawValuesMap");
        AbstractC3255y.i(countryCodes, "countryCodes");
        AbstractC3255y.i(countryDropdownFieldController, "countryDropdownFieldController");
        AbstractC3255y.i(collectionMode, "collectionMode");
        this.f32188t = collectionMode;
        this.f32189u = y4.g.m(countryDropdownFieldController.y(), new a());
    }
}
