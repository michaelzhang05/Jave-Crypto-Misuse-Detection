package com.uptodown.activities;

import M5.AbstractC1246t;
import X4.C1496f;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3319g;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class u extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f29408a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f29409b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29410a;

        public a(ArrayList rollbackApps) {
            AbstractC3159y.i(rollbackApps, "rollbackApps");
            this.f29410a = rollbackApps;
        }

        public final ArrayList a() {
            return this.f29410a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f29410a, ((a) obj).f29410a);
        }

        public int hashCode() {
            return this.f29410a.hashCode();
        }

        public String toString() {
            return "RollbackData(rollbackApps=" + this.f29410a + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f29411a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f29412b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ u f29413c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f29414d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, u uVar, Context context, P5.d dVar) {
            super(2, dVar);
            this.f29412b = z8;
            this.f29413c = uVar;
            this.f29414d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f29412b, this.f29413c, this.f29414d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f29411a == 0) {
                L5.t.b(obj);
                if (this.f29412b) {
                    this.f29413c.f29408a.setValue(AbstractC3337y.a.f34547a);
                }
                this.f29413c.f29408a.setValue(new AbstractC3337y.c(new a(this.f29413c.e(this.f29414d, new C3319g().A(this.f29414d)))));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return O5.a.a(((C1496f) obj).I(), ((C1496f) obj2).I());
        }
    }

    public u() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34547a);
        this.f29408a = a8;
        this.f29409b = a8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList e(Context context, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!g6.n.s(context.getPackageName(), ((C1496f) arrayList.get(i8)).Q(), true)) {
                N4.f fVar = new N4.f();
                String Q8 = ((C1496f) arrayList.get(i8)).Q();
                AbstractC3159y.f(Q8);
                if (!fVar.p(context, Q8) && !((C1496f) arrayList.get(i8)).l0() && ((C1496f) arrayList.get(i8)).n() == 1) {
                    arrayList2.add(arrayList.get(i8));
                }
            }
        }
        if (arrayList2.size() > 1) {
            AbstractC1246t.B(arrayList2, new c());
        }
        return arrayList2;
    }

    public final void c(Context context, boolean z8) {
        AbstractC3159y.i(context, "context");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(z8, this, context, null), 2, null);
    }

    public final InterfaceC3349K d() {
        return this.f29409b;
    }
}
