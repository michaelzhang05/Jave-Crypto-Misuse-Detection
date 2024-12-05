package com.uptodown.activities;

import a5.C1631C;
import a5.C1639f;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3667g;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class l extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30273a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30274b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30275a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f30276b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f30277c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f30278d;

        /* renamed from: e, reason: collision with root package name */
        private final ArrayList f30279e;

        public a(ArrayList tmpUserApps, ArrayList tmpSystemApps, ArrayList tmpDisabledApps, ArrayList tmpSystemServices, ArrayList tmpPositiveApps) {
            AbstractC3255y.i(tmpUserApps, "tmpUserApps");
            AbstractC3255y.i(tmpSystemApps, "tmpSystemApps");
            AbstractC3255y.i(tmpDisabledApps, "tmpDisabledApps");
            AbstractC3255y.i(tmpSystemServices, "tmpSystemServices");
            AbstractC3255y.i(tmpPositiveApps, "tmpPositiveApps");
            this.f30275a = tmpUserApps;
            this.f30276b = tmpSystemApps;
            this.f30277c = tmpDisabledApps;
            this.f30278d = tmpSystemServices;
            this.f30279e = tmpPositiveApps;
        }

        public final ArrayList a() {
            return this.f30277c;
        }

        public final ArrayList b() {
            return this.f30279e;
        }

        public final ArrayList c() {
            return this.f30276b;
        }

        public final ArrayList d() {
            return this.f30278d;
        }

        public final ArrayList e() {
            return this.f30275a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f30275a, aVar.f30275a) && AbstractC3255y.d(this.f30276b, aVar.f30276b) && AbstractC3255y.d(this.f30277c, aVar.f30277c) && AbstractC3255y.d(this.f30278d, aVar.f30278d) && AbstractC3255y.d(this.f30279e, aVar.f30279e);
        }

        public int hashCode() {
            return (((((((this.f30275a.hashCode() * 31) + this.f30276b.hashCode()) * 31) + this.f30277c.hashCode()) * 31) + this.f30278d.hashCode()) * 31) + this.f30279e.hashCode();
        }

        public String toString() {
            return "MyAppsData(tmpUserApps=" + this.f30275a + ", tmpSystemApps=" + this.f30276b + ", tmpDisabledApps=" + this.f30277c + ", tmpSystemServices=" + this.f30278d + ", tmpPositiveApps=" + this.f30279e + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30280a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30281b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ l f30282c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f30283d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, l lVar, Context context, S5.d dVar) {
            super(2, dVar);
            this.f30281b = z8;
            this.f30282c = lVar;
            this.f30283d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f30281b, this.f30282c, this.f30283d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30280a == 0) {
                O5.t.b(obj);
                if (this.f30281b) {
                    this.f30282c.f30273a.setValue(AbstractC3685y.a.f36548a);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList A8 = new C3667g().A(this.f30283d);
                SettingsPreferences.a aVar = SettingsPreferences.f30353b;
                boolean h02 = aVar.h0(this.f30283d);
                boolean i02 = aVar.i0(this.f30283d);
                Iterator it = A8.iterator();
                while (it.hasNext()) {
                    C1639f c1639f = (C1639f) it.next();
                    Q4.f fVar = new Q4.f();
                    Context context = this.f30283d;
                    String J8 = c1639f.J();
                    AbstractC3255y.f(J8);
                    if (fVar.p(context, J8)) {
                        arrayList3.add(c1639f);
                    } else if (c1639f.n0()) {
                        if (i02) {
                            arrayList4.add(c1639f);
                        }
                    } else if (c1639f.l0()) {
                        if (h02) {
                            arrayList2.add(c1639f);
                        }
                    } else {
                        arrayList.add(c1639f);
                    }
                    UptodownApp.a aVar2 = UptodownApp.f29058B;
                    if (aVar2.w() != null) {
                        ArrayList w8 = aVar2.w();
                        AbstractC3255y.f(w8);
                        Iterator it2 = w8.iterator();
                        while (it2.hasNext()) {
                            C1631C c1631c = (C1631C) it2.next();
                            if (AbstractC3255y.d(c1631c.c(), c1639f.X())) {
                                c1639f.E0(c1631c);
                                arrayList5.add(c1639f);
                            }
                        }
                    }
                }
                C3667g.a aVar3 = C3667g.f36491a;
                aVar3.c(arrayList, this.f30283d);
                aVar3.c(arrayList2, this.f30283d);
                aVar3.c(arrayList4, this.f30283d);
                this.f30282c.f30273a.setValue(new AbstractC3685y.c(new a(arrayList, arrayList2, arrayList3, arrayList4, arrayList5)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public l() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f30273a = a8;
        this.f30274b = a8;
    }

    public final void b(Context context, boolean z8) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(z8, this, context, null), 2, null);
    }

    public final InterfaceC3698L c() {
        return this.f30274b;
    }
}
