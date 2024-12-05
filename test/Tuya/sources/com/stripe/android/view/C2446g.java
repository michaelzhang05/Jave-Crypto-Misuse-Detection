package com.stripe.android.view;

import L5.C1224h;
import L5.InterfaceC1223g;
import L5.InterfaceC1227k;
import M5.AbstractC1246t;
import android.app.Application;
import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b3.C1867b;
import com.stripe.android.model.p;
import com.stripe.android.view.C2447g0;
import i6.AbstractC2829k;
import j2.AbstractC3049A;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import kotlin.jvm.internal.C3136a;
import kotlin.jvm.internal.InterfaceC3153s;
import l6.InterfaceC3349K;
import l6.InterfaceC3359g;

/* renamed from: com.stripe.android.view.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2446g extends AbstractC2454k {

    /* renamed from: d, reason: collision with root package name */
    public static final b f27708d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    public static final int f27709e = 8;

    /* renamed from: a, reason: collision with root package name */
    private C1867b f27710a;

    /* renamed from: b, reason: collision with root package name */
    private final C2450i f27711b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC1227k f27712c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.view.g$a */
    /* loaded from: classes4.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f27713a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.stripe.android.view.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public /* synthetic */ class C0693a implements InterfaceC3359g, InterfaceC3153s {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ C2446g f27715a;

            C0693a(C2446g c2446g) {
                this.f27715a = c2446g;
            }

            @Override // l6.InterfaceC3359g
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C1867b c1867b, P5.d dVar) {
                Object h8 = a.h(this.f27715a, c1867b, dVar);
                if (h8 == Q5.b.e()) {
                    return h8;
                }
                return L5.I.f6487a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC3359g) && (obj instanceof InterfaceC3153s)) {
                    return AbstractC3159y.d(getFunctionDelegate(), ((InterfaceC3153s) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC3153s
            public final InterfaceC1223g getFunctionDelegate() {
                return new C3136a(2, this.f27715a, C2446g.class, "onFpxBankStatusesUpdated", "onFpxBankStatusesUpdated(Lcom/stripe/android/model/BankStatuses;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        a(P5.d dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object h(C2446g c2446g, C1867b c1867b, P5.d dVar) {
            c2446g.d(c1867b);
            return L5.I.f6487a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new a(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f27713a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                L5.t.b(obj);
            } else {
                L5.t.b(obj);
                InterfaceC3349K d8 = C2446g.this.getViewModel().d();
                C0693a c0693a = new C0693a(C2446g.this);
                this.f27713a = 1;
                if (d8.collect(c0693a, this) == e8) {
                    return e8;
                }
            }
            throw new C1224h();
        }
    }

    /* renamed from: com.stripe.android.view.g$b */
    /* loaded from: classes4.dex */
    public static final class b {
        private b() {
        }

        public final /* synthetic */ C2446g a(FragmentActivity activity) {
            AbstractC3159y.i(activity, "activity");
            return new C2446g(activity, null, 0, 6, null);
        }

        public /* synthetic */ b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.g$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3160z implements Function1 {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(int i8) {
            C2446g.this.getViewModel().f(Integer.valueOf(i8));
        }
    }

    /* renamed from: com.stripe.android.view.g$d */
    /* loaded from: classes4.dex */
    static final class d extends AbstractC3160z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ FragmentActivity f27717a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(FragmentActivity fragmentActivity) {
            super(0);
            this.f27717a = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C2447g0 invoke() {
            FragmentActivity fragmentActivity = this.f27717a;
            Application application = this.f27717a.getApplication();
            AbstractC3159y.h(application, "getApplication(...)");
            return (C2447g0) new ViewModelProvider(fragmentActivity, new C2447g0.b(application)).get(C2447g0.class);
        }
    }

    public /* synthetic */ C2446g(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(fragmentActivity, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    private final EnumC2445f0 c(int i8) {
        return (EnumC2445f0) EnumC2445f0.e().get(i8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d(C1867b c1867b) {
        if (c1867b != null) {
            e(c1867b);
        }
    }

    private final void e(C1867b c1867b) {
        this.f27710a = c1867b;
        this.f27711b.e(c1867b);
        d6.i n8 = AbstractC1246t.n(EnumC2445f0.e());
        ArrayList arrayList = new ArrayList();
        for (Object obj : n8) {
            if (!c1867b.b(c(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f27711b.c(((Number) it.next()).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C2447g0 getViewModel() {
        return (C2447g0) this.f27712c.getValue();
    }

    @Override // com.stripe.android.view.AbstractC2454k
    public com.stripe.android.model.p getCreateParams() {
        Integer valueOf = Integer.valueOf(this.f27711b.b());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return p.e.f(com.stripe.android.model.p.f24581u, new p.g(((EnumC2445f0) EnumC2445f0.e().get(valueOf.intValue())).d()), null, null, null, 14, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2446g(FragmentActivity activity, AttributeSet attributeSet, int i8) {
        super(activity, attributeSet, i8);
        AbstractC3159y.i(activity, "activity");
        this.f27710a = new C1867b(null, 1, null);
        C2450i c2450i = new C2450i(new S0(activity), EnumC2445f0.e(), new c());
        this.f27711b = c2450i;
        this.f27712c = L5.l.b(new d(activity));
        G2.h c8 = G2.h.c(activity.getLayoutInflater(), this, true);
        AbstractC3159y.h(c8, "inflate(...)");
        setId(AbstractC3049A.f32756T);
        AbstractC2829k.d(LifecycleOwnerKt.getLifecycleScope(activity), null, null, new a(null), 3, null);
        RecyclerView recyclerView = c8.f3131b;
        recyclerView.setAdapter(c2450i);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Integer e8 = getViewModel().e();
        if (e8 != null) {
            c2450i.g(e8.intValue());
        }
    }
}
