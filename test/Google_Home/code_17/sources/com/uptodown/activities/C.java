package com.uptodown.activities;

import a5.C1631C;
import a5.C1639f;
import a5.O;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.UptodownApp;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3667g;
import o5.C3674n;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class C extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f29236a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f29237b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f29238a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f29239b;

        public a(boolean z8, boolean z9) {
            this.f29238a = z8;
            this.f29239b = z9;
        }

        public final boolean a() {
            return this.f29239b;
        }

        public final boolean b() {
            return this.f29238a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29238a == aVar.f29238a && this.f29239b == aVar.f29239b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v4 */
        /* JADX WARN: Type inference failed for: r0v5 */
        public int hashCode() {
            boolean z8 = this.f29238a;
            ?? r02 = z8;
            if (z8) {
                r02 = 1;
            }
            int i8 = r02 * 31;
            boolean z9 = this.f29239b;
            return i8 + (z9 ? 1 : z9 ? 1 : 0);
        }

        public String toString() {
            return "DownloadAllButtonData(hasUpdates=" + this.f29238a + ", allCompleted=" + this.f29239b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29240a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f29241b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f29242c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f29243d;

        /* renamed from: e, reason: collision with root package name */
        private final ArrayList f29244e;

        /* renamed from: f, reason: collision with root package name */
        private final a f29245f;

        public b(ArrayList updates, ArrayList disabled, ArrayList ignored, ArrayList recentlyUpdated, ArrayList positives, a downloadAllButtonData) {
            AbstractC3255y.i(updates, "updates");
            AbstractC3255y.i(disabled, "disabled");
            AbstractC3255y.i(ignored, "ignored");
            AbstractC3255y.i(recentlyUpdated, "recentlyUpdated");
            AbstractC3255y.i(positives, "positives");
            AbstractC3255y.i(downloadAllButtonData, "downloadAllButtonData");
            this.f29240a = updates;
            this.f29241b = disabled;
            this.f29242c = ignored;
            this.f29243d = recentlyUpdated;
            this.f29244e = positives;
            this.f29245f = downloadAllButtonData;
        }

        public final ArrayList a() {
            return this.f29241b;
        }

        public final a b() {
            return this.f29245f;
        }

        public final ArrayList c() {
            return this.f29242c;
        }

        public final ArrayList d() {
            return this.f29244e;
        }

        public final ArrayList e() {
            return this.f29243d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3255y.d(this.f29240a, bVar.f29240a) && AbstractC3255y.d(this.f29241b, bVar.f29241b) && AbstractC3255y.d(this.f29242c, bVar.f29242c) && AbstractC3255y.d(this.f29243d, bVar.f29243d) && AbstractC3255y.d(this.f29244e, bVar.f29244e) && AbstractC3255y.d(this.f29245f, bVar.f29245f);
        }

        public final ArrayList f() {
            return this.f29240a;
        }

        public int hashCode() {
            return (((((((((this.f29240a.hashCode() * 31) + this.f29241b.hashCode()) * 31) + this.f29242c.hashCode()) * 31) + this.f29243d.hashCode()) * 31) + this.f29244e.hashCode()) * 31) + this.f29245f.hashCode();
        }

        public String toString() {
            return "UpdatesData(updates=" + this.f29240a + ", disabled=" + this.f29241b + ", ignored=" + this.f29242c + ", recentlyUpdated=" + this.f29243d + ", positives=" + this.f29244e + ", downloadAllButtonData=" + this.f29245f + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29246a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29247b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29248c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList f29249d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z8, Context context, ArrayList arrayList, S5.d dVar) {
            super(2, dVar);
            this.f29247b = z8;
            this.f29248c = context;
            this.f29249d = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f29247b, this.f29248c, this.f29249d, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0087, code lost:
        
            r5 = false;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                T5.b.e()
                int r0 = r10.f29246a
                if (r0 != 0) goto Lc4
                O5.t.b(r11)
                boolean r11 = r10.f29247b
                r0 = 1
                if (r11 == 0) goto Lbf
                o5.n$a r11 = o5.C3674n.f36505t
                android.content.Context r1 = r10.f29248c
                o5.n r11 = r11.a(r1)
                r11.a()
                o5.q r1 = new o5.q
                r1.<init>()
                android.content.Context r2 = r10.f29248c
                java.util.ArrayList r1 = r1.e(r2)
                java.util.ArrayList r2 = r10.f29249d
                java.util.Iterator r2 = r2.iterator()
            L2b:
                r3 = 1
            L2c:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto Lbb
                java.lang.Object r4 = r2.next()
                a5.O r4 = (a5.O) r4
                java.lang.String r5 = r4.l()
                r6 = 0
                if (r5 == 0) goto Lb8
                java.util.Iterator r5 = r1.iterator()
            L43:
                boolean r7 = r5.hasNext()
                if (r7 == 0) goto L87
                java.lang.Object r7 = r5.next()
                java.io.File r7 = (java.io.File) r7
                java.lang.String r8 = r4.l()
                java.lang.String r9 = r7.getName()
                boolean r8 = j6.n.s(r8, r9, r0)
                if (r8 == 0) goto L43
                int r5 = r4.u()
                r8 = 100
                if (r5 != r8) goto L67
                r5 = 1
                goto L68
            L67:
                r5 = 0
            L68:
                if (r5 == 0) goto L88
                java.lang.String r8 = r4.g()
                if (r8 == 0) goto L88
                Q4.d r8 = Q4.d.f9161a
                java.lang.String r9 = r7.getAbsolutePath()
                java.lang.String r8 = r8.e(r9)
                java.lang.String r9 = r4.g()
                boolean r8 = j6.n.s(r9, r8, r0)
                if (r8 != 0) goto L88
                r7.delete()
            L87:
                r5 = 0
            L88:
                if (r5 != 0) goto Lb2
                o5.q r7 = new o5.q
                r7.<init>()
                android.content.Context r8 = r10.f29248c
                java.io.File r7 = r7.g(r8)
                java.io.File r8 = new java.io.File
                java.lang.String r9 = r4.l()
                kotlin.jvm.internal.AbstractC3255y.f(r9)
                r8.<init>(r7, r9)
                boolean r7 = r8.exists()
                if (r7 != 0) goto Lb2
                r4.X(r6)
                java.lang.String r7 = "u"
                kotlin.jvm.internal.AbstractC3255y.h(r4, r7)
                r11.r1(r4)
            Lb2:
                if (r3 == 0) goto Lb8
                if (r5 == 0) goto Lb8
                goto L2b
            Lb8:
                r3 = 0
                goto L2c
            Lbb:
                r11.l()
                r0 = r3
            Lbf:
                java.lang.Boolean r11 = kotlin.coroutines.jvm.internal.b.a(r0)
                return r11
            Lc4:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.C.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f29250a;

        /* renamed from: b, reason: collision with root package name */
        Object f29251b;

        /* renamed from: c, reason: collision with root package name */
        Object f29252c;

        /* renamed from: d, reason: collision with root package name */
        Object f29253d;

        /* renamed from: e, reason: collision with root package name */
        Object f29254e;

        /* renamed from: f, reason: collision with root package name */
        Object f29255f;

        /* renamed from: g, reason: collision with root package name */
        boolean f29256g;

        /* renamed from: h, reason: collision with root package name */
        int f29257h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ boolean f29258i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ C f29259j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ Context f29260k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z8, C c8, Context context, S5.d dVar) {
            super(2, dVar);
            this.f29258i = z8;
            this.f29259j = c8;
            this.f29260k = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(this.f29258i, this.f29259j, this.f29260k, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Object g8;
            ArrayList arrayList4;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Object d8;
            boolean z8;
            ArrayList arrayList7;
            ArrayList arrayList8;
            ArrayList arrayList9;
            ArrayList arrayList10;
            ArrayList arrayList11;
            Object e8 = T5.b.e();
            int i8 = this.f29257h;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        z8 = this.f29256g;
                        ArrayList arrayList12 = (ArrayList) this.f29254e;
                        ArrayList arrayList13 = (ArrayList) this.f29253d;
                        ArrayList arrayList14 = (ArrayList) this.f29252c;
                        ArrayList arrayList15 = (ArrayList) this.f29251b;
                        ArrayList arrayList16 = (ArrayList) this.f29250a;
                        O5.t.b(obj);
                        arrayList9 = arrayList12;
                        arrayList8 = arrayList13;
                        arrayList10 = arrayList14;
                        d8 = obj;
                        arrayList11 = arrayList15;
                        arrayList7 = arrayList16;
                        this.f29259j.f29236a.setValue(new AbstractC3685y.c(new b(arrayList7, arrayList11, arrayList10, arrayList8, arrayList9, new a(z8, ((Boolean) d8).booleanValue()))));
                        return O5.I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ArrayList arrayList17 = (ArrayList) this.f29255f;
                arrayList4 = (ArrayList) this.f29254e;
                ArrayList arrayList18 = (ArrayList) this.f29253d;
                arrayList6 = (ArrayList) this.f29252c;
                arrayList = (ArrayList) this.f29251b;
                arrayList5 = (ArrayList) this.f29250a;
                O5.t.b(obj);
                arrayList2 = arrayList18;
                arrayList3 = arrayList17;
                g8 = obj;
            } else {
                O5.t.b(obj);
                if (this.f29258i) {
                    this.f29259j.f29236a.setValue(AbstractC3685y.a.f36548a);
                }
                ArrayList A8 = new C3667g().A(this.f29260k);
                C3674n a8 = C3674n.f36505t.a(this.f29260k);
                a8.a();
                ArrayList arrayList19 = new ArrayList();
                arrayList = new ArrayList();
                ArrayList arrayList20 = new ArrayList();
                arrayList2 = new ArrayList();
                ArrayList arrayList21 = new ArrayList();
                Iterator it = A8.iterator();
                while (it.hasNext()) {
                    C1639f c1639f = (C1639f) it.next();
                    if (c1639f.i0(this.f29260k)) {
                        if (c1639f.i() == 1) {
                            c1639f.J0(C1639f.c.OUTDATED);
                            arrayList20.add(c1639f);
                        } else {
                            String J8 = c1639f.J();
                            AbstractC3255y.f(J8);
                            O u02 = a8.u0(J8);
                            if (u02 == null) {
                                if (c1639f.j0()) {
                                    c1639f.J0(C1639f.c.UPDATED);
                                    arrayList2.add(c1639f);
                                }
                            } else if (u02.h() == 1) {
                                arrayList20.add(c1639f);
                            } else {
                                c1639f.J0(C1639f.c.OUTDATED);
                                Q4.f fVar = new Q4.f();
                                Context context = this.f29260k;
                                String J9 = c1639f.J();
                                AbstractC3255y.f(J9);
                                if (fVar.p(context, J9)) {
                                    arrayList.add(c1639f);
                                } else {
                                    arrayList19.add(c1639f);
                                }
                            }
                            if (u02 != null && u02.p() == 0) {
                                u02.W(1);
                                a8.r1(u02);
                            }
                        }
                    }
                    UptodownApp.a aVar = UptodownApp.f29058B;
                    if (aVar.w() != null) {
                        ArrayList w8 = aVar.w();
                        AbstractC3255y.f(w8);
                        Iterator it2 = w8.iterator();
                        while (it2.hasNext()) {
                            C1631C c1631c = (C1631C) it2.next();
                            if (AbstractC3255y.d(c1631c.c(), c1639f.X())) {
                                c1639f.E0(c1631c);
                                arrayList21.add(c1639f);
                            }
                        }
                    }
                }
                C3667g.a aVar2 = C3667g.f36491a;
                aVar2.c(arrayList19, this.f29260k);
                aVar2.e(arrayList2);
                aVar2.c(arrayList20, this.f29260k);
                aVar2.c(arrayList, this.f29260k);
                ArrayList<O> v02 = a8.v0();
                a8.l();
                arrayList3 = new ArrayList();
                for (O o8 : v02) {
                    Iterator it3 = arrayList19.iterator();
                    while (it3.hasNext()) {
                        if (AbstractC3255y.d(o8.s(), ((C1639f) it3.next()).J())) {
                            arrayList3.add(o8);
                        }
                    }
                }
                C c8 = this.f29259j;
                this.f29250a = arrayList19;
                this.f29251b = arrayList;
                this.f29252c = arrayList20;
                this.f29253d = arrayList2;
                this.f29254e = arrayList21;
                this.f29255f = arrayList3;
                this.f29257h = 1;
                g8 = c8.g(v02, arrayList19, this);
                if (g8 == e8) {
                    return e8;
                }
                arrayList4 = arrayList21;
                arrayList5 = arrayList19;
                arrayList6 = arrayList20;
            }
            boolean booleanValue = ((Boolean) g8).booleanValue();
            C c9 = this.f29259j;
            Context context2 = this.f29260k;
            this.f29250a = arrayList5;
            this.f29251b = arrayList;
            this.f29252c = arrayList6;
            this.f29253d = arrayList2;
            this.f29254e = arrayList4;
            this.f29255f = null;
            this.f29256g = booleanValue;
            this.f29257h = 2;
            d8 = c9.d(context2, arrayList3, booleanValue, this);
            if (d8 == e8) {
                return e8;
            }
            z8 = booleanValue;
            arrayList7 = arrayList5;
            arrayList8 = arrayList2;
            arrayList9 = arrayList4;
            ArrayList arrayList22 = arrayList;
            arrayList10 = arrayList6;
            arrayList11 = arrayList22;
            this.f29259j.f29236a.setValue(new AbstractC3685y.c(new b(arrayList7, arrayList11, arrayList10, arrayList8, arrayList9, new a(z8, ((Boolean) d8).booleanValue()))));
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29261a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f29262b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f29263c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ArrayList arrayList, ArrayList arrayList2, S5.d dVar) {
            super(2, dVar);
            this.f29262b = arrayList;
            this.f29263c = arrayList2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(this.f29262b, this.f29263c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29261a == 0) {
                O5.t.b(obj);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList(this.f29262b);
                int size = arrayList2.size();
                boolean z8 = false;
                for (int i8 = 0; i8 < size; i8++) {
                    Iterator it = this.f29263c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            O o8 = (O) it.next();
                            String J8 = ((C1639f) arrayList2.get(i8)).J();
                            if (J8 != null && j6.n.s(J8, o8.s(), true) && ((C1639f) arrayList2.get(i8)).i() == 0) {
                                arrayList.add(o8);
                                break;
                            }
                        }
                    }
                }
                if (arrayList.size() > 0) {
                    z8 = true;
                }
                return kotlin.coroutines.jvm.internal.b.a(z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public C() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f29236a = a8;
        this.f29237b = a8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object d(Context context, ArrayList arrayList, boolean z8, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new c(z8, context, arrayList, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(ArrayList arrayList, ArrayList arrayList2, S5.d dVar) {
        return AbstractC3360i.g(C3347b0.b(), new e(arrayList2, arrayList, null), dVar);
    }

    public final void e(Context context, boolean z8) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new d(z8, this, context, null), 2, null);
    }

    public final InterfaceC3698L f() {
        return this.f29237b;
    }
}
