package com.uptodown.activities;

import X4.C1496f;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.uptodown.UptodownApp;
import com.uptodown.activities.preferences.SettingsPreferences;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3319g;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class m extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29243a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29244b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29245a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f29246b;

        /* renamed from: c, reason: collision with root package name */
        private final ArrayList f29247c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f29248d;

        /* renamed from: e, reason: collision with root package name */
        private final ArrayList f29249e;

        public a(ArrayList tmpUserApps, ArrayList tmpSystemApps, ArrayList tmpDisabledApps, ArrayList tmpSystemServices, ArrayList tmpPositiveApps) {
            AbstractC3159y.i(tmpUserApps, "tmpUserApps");
            AbstractC3159y.i(tmpSystemApps, "tmpSystemApps");
            AbstractC3159y.i(tmpDisabledApps, "tmpDisabledApps");
            AbstractC3159y.i(tmpSystemServices, "tmpSystemServices");
            AbstractC3159y.i(tmpPositiveApps, "tmpPositiveApps");
            this.f29245a = tmpUserApps;
            this.f29246b = tmpSystemApps;
            this.f29247c = tmpDisabledApps;
            this.f29248d = tmpSystemServices;
            this.f29249e = tmpPositiveApps;
        }

        public final ArrayList a() {
            return this.f29247c;
        }

        public final ArrayList b() {
            return this.f29249e;
        }

        public final ArrayList c() {
            return this.f29246b;
        }

        public final ArrayList d() {
            return this.f29248d;
        }

        public final ArrayList e() {
            return this.f29245a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3159y.d(this.f29245a, aVar.f29245a) && AbstractC3159y.d(this.f29246b, aVar.f29246b) && AbstractC3159y.d(this.f29247c, aVar.f29247c) && AbstractC3159y.d(this.f29248d, aVar.f29248d) && AbstractC3159y.d(this.f29249e, aVar.f29249e);
        }

        public int hashCode() {
            return (((((((this.f29245a.hashCode() * 31) + this.f29246b.hashCode()) * 31) + this.f29247c.hashCode()) * 31) + this.f29248d.hashCode()) * 31) + this.f29249e.hashCode();
        }

        public String toString() {
            return "MyAppsData(tmpUserApps=" + this.f29245a + ", tmpSystemApps=" + this.f29246b + ", tmpDisabledApps=" + this.f29247c + ", tmpSystemServices=" + this.f29248d + ", tmpPositiveApps=" + this.f29249e + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29250a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29251b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ m f29252c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f29253d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, m mVar, Context context, P5.d dVar) {
            super(2, dVar);
            this.f29251b = z8;
            this.f29252c = mVar;
            this.f29253d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f29251b, this.f29252c, this.f29253d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29250a == 0) {
                L5.t.b(obj);
                if (this.f29251b) {
                    this.f29252c.f29243a.setValue(AbstractC3337y.a.f34547a);
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList A8 = new C3319g().A(this.f29253d);
                SettingsPreferences.a aVar = SettingsPreferences.f29323b;
                boolean h02 = aVar.h0(this.f29253d);
                boolean i02 = aVar.i0(this.f29253d);
                Iterator it = A8.iterator();
                while (it.hasNext()) {
                    C1496f c1496f = (C1496f) it.next();
                    N4.f fVar = new N4.f();
                    Context context = this.f29253d;
                    String Q8 = c1496f.Q();
                    AbstractC3159y.f(Q8);
                    if (fVar.p(context, Q8)) {
                        arrayList3.add(c1496f);
                    } else if (c1496f.n0()) {
                        if (i02) {
                            arrayList4.add(c1496f);
                        }
                    } else if (c1496f.l0()) {
                        if (h02) {
                            arrayList2.add(c1496f);
                        }
                    } else {
                        arrayList.add(c1496f);
                    }
                    UptodownApp.a aVar2 = UptodownApp.f28003B;
                    if (aVar2.w() != null) {
                        ArrayList w8 = aVar2.w();
                        AbstractC3159y.f(w8);
                        Iterator it2 = w8.iterator();
                        while (it2.hasNext()) {
                            X4.C c8 = (X4.C) it2.next();
                            if (AbstractC3159y.d(c8.c(), c1496f.X())) {
                                c1496f.E0(c8);
                                arrayList5.add(c1496f);
                            }
                        }
                    }
                }
                C3319g.a aVar3 = C3319g.f34490a;
                aVar3.c(arrayList, this.f29253d);
                aVar3.c(arrayList2, this.f29253d);
                aVar3.c(arrayList4, this.f29253d);
                this.f29252c.f29243a.setValue(new AbstractC3337y.c(new a(arrayList, arrayList2, arrayList3, arrayList4, arrayList5)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public m() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34547a);
        this.f29243a = a8;
        this.f29244b = a8;
    }

    public final void b(Context context, boolean z8) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(z8, this, context, null), 2, null);
    }

    public final InterfaceC3349K c() {
        return this.f29244b;
    }
}
