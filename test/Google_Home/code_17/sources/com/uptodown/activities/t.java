package com.uptodown.activities;

import P5.AbstractC1378t;
import a5.C1639f;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.Comparator;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3667g;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class t extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f30438a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f30439b;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30440a;

        public a(ArrayList rollbackApps) {
            AbstractC3255y.i(rollbackApps, "rollbackApps");
            this.f30440a = rollbackApps;
        }

        public final ArrayList a() {
            return this.f30440a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f30440a, ((a) obj).f30440a);
        }

        public int hashCode() {
            return this.f30440a.hashCode();
        }

        public String toString() {
            return "RollbackData(rollbackApps=" + this.f30440a + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30441a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30442b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f30443c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f30444d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z8, t tVar, Context context, S5.d dVar) {
            super(2, dVar);
            this.f30442b = z8;
            this.f30443c = tVar;
            this.f30444d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f30442b, this.f30443c, this.f30444d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30441a == 0) {
                O5.t.b(obj);
                if (this.f30442b) {
                    this.f30443c.f30438a.setValue(AbstractC3685y.a.f36548a);
                }
                this.f30443c.f30438a.setValue(new AbstractC3685y.c(new a(this.f30443c.e(this.f30444d, new C3667g().A(this.f30444d)))));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return R5.a.a(((C1639f) obj).z(), ((C1639f) obj2).z());
        }
    }

    public t() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f30438a = a8;
        this.f30439b = a8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList e(Context context, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!j6.n.s(context.getPackageName(), ((C1639f) arrayList.get(i8)).J(), true)) {
                Q4.f fVar = new Q4.f();
                String J8 = ((C1639f) arrayList.get(i8)).J();
                AbstractC3255y.f(J8);
                if (!fVar.p(context, J8) && !((C1639f) arrayList.get(i8)).l0() && ((C1639f) arrayList.get(i8)).s() == 1) {
                    arrayList2.add(arrayList.get(i8));
                }
            }
        }
        if (arrayList2.size() > 1) {
            AbstractC1378t.B(arrayList2, new c());
        }
        return arrayList2;
    }

    public final void c(Context context, boolean z8) {
        AbstractC3255y.i(context, "context");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(z8, this, context, null), 2, null);
    }

    public final InterfaceC3698L d() {
        return this.f30439b;
    }
}
