package com.stripe.android.view;

import O5.C1352h;
import O5.InterfaceC1351g;
import O5.InterfaceC1355k;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import android.app.Application;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.p;
import com.stripe.android.view.C2641g0;
import e3.C2788b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.C3232a;
import kotlin.jvm.internal.InterfaceC3249s;
import l6.AbstractC3364k;
import m2.AbstractC3403A;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* renamed from: com.stripe.android.view.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2640g extends AbstractC2648k {

    /* renamed from: d, reason: collision with root package name */
    public static final b f28763d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f28764e = 8;

    /* renamed from: a, reason: collision with root package name */
    private C2788b f28765a;

    /* renamed from: b, reason: collision with root package name */
    private final C2644i f28766b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1355k f28767c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28768a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.view.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0689a implements InterfaceC3707g, InterfaceC3249s {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2640g f28770a;

            C0689a(C2640g c2640g) {
                this.f28770a = c2640g;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C2788b c2788b, S5.d dVar) {
                Object m8 = a.m(this.f28770a, c2788b, dVar);
                if (m8 == T5.b.e()) {
                    return m8;
                }
                return O5.I.f8278a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC3707g) && (obj instanceof InterfaceC3249s)) {
                    return AbstractC3255y.d(getFunctionDelegate(), ((InterfaceC3249s) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC3249s
            public final InterfaceC1351g getFunctionDelegate() {
                return new C3232a(2, this.f28770a, C2640g.class, "onFpxBankStatusesUpdated", "onFpxBankStatusesUpdated(Lcom/stripe/android/model/BankStatuses;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        a(S5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object m(C2640g c2640g, C2788b c2788b, S5.d dVar) {
            c2640g.d(c2788b);
            return O5.I.f8278a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f28768a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L d8 = C2640g.this.getViewModel().d();
                C0689a c0689a = new C0689a(C2640g.this);
                this.f28768a = 1;
                if (d8.collect(c0689a, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* renamed from: com.stripe.android.view.g$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ C2640g a(FragmentActivity activity) {
            AbstractC3255y.i(activity, "activity");
            return new C2640g(activity, null, 0, 6, null);
        }

        public /* synthetic */ b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.g$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3256z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(int i8) {
            C2640g.this.getViewModel().f(Integer.valueOf(i8));
        }
    }

    /* renamed from: com.stripe.android.view.g$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f28772a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FragmentActivity fragmentActivity) {
            super(0);
            this.f28772a = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2641g0 invoke() {
            FragmentActivity fragmentActivity = this.f28772a;
            Application application = this.f28772a.getApplication();
            AbstractC3255y.h(application, "getApplication(...)");
            return (C2641g0) new ViewModelProvider(fragmentActivity, new C2641g0.b(application)).get(C2641g0.class);
        }
    }

    public /* synthetic */ C2640g(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(fragmentActivity, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    private final EnumC2639f0 c(int i8) {
        return (EnumC2639f0) EnumC2639f0.e().get(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(C2788b c2788b) {
        if (c2788b != null) {
            e(c2788b);
        }
    }

    private final void e(C2788b c2788b) {
        this.f28765a = c2788b;
        this.f28766b.e(c2788b);
        g6.i n8 = AbstractC1378t.n(EnumC2639f0.e());
        ArrayList arrayList = new ArrayList();
        for (Object obj : n8) {
            if (!c2788b.a(c(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f28766b.c(((Number) it.next()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2641g0 getViewModel() {
        return (C2641g0) this.f28767c.getValue();
    }

    @Override // com.stripe.android.view.AbstractC2648k
    public com.stripe.android.model.p getCreateParams() {
        Integer valueOf = Integer.valueOf(this.f28766b.b());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return p.e.f(com.stripe.android.model.p.f25636u, new p.g(((EnumC2639f0) EnumC2639f0.e().get(valueOf.intValue())).d()), null, null, null, 14, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2640g(FragmentActivity activity, AttributeSet attributeSet, int i8) {
        super(activity, attributeSet, i8);
        AbstractC3255y.i(activity, "activity");
        this.f28765a = new C2788b(null, 1, null);
        C2644i c2644i = new C2644i(new S0(activity), EnumC2639f0.e(), new c());
        this.f28766b = c2644i;
        this.f28767c = O5.l.b(new d(activity));
        J2.h c8 = J2.h.c(activity.getLayoutInflater(), this, true);
        AbstractC3255y.h(c8, "inflate(...)");
        setId(AbstractC3403A.f34732T);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new a(null), 3, null);
        RecyclerView recyclerView = c8.f4850b;
        recyclerView.setAdapter(c2644i);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Integer e8 = getViewModel().e();
        if (e8 != null) {
            c2644i.g(e8.intValue());
        }
    }
}
