package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.p;
import j2.AbstractC3049A;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: com.stripe.android.view.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2452j extends AbstractC2454k {

    /* renamed from: c, reason: collision with root package name */
    public static final a f27743c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f27744d = 8;

    /* renamed from: a, reason: collision with root package name */
    private Integer f27745a;

    /* renamed from: b, reason: collision with root package name */
    private final C2450i f27746b;

    /* renamed from: com.stripe.android.view.j$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C2452j a(FragmentActivity activity) {
            AbstractC3159y.i(activity, "activity");
            return new C2452j(activity, null, 0, 6, null);
        }

        public /* synthetic */ a(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.j$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3160z implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return L5.I.f6487a;
        }

        public final void invoke(int i8) {
            C2452j.this.f27745a = Integer.valueOf(i8);
        }
    }

    public /* synthetic */ C2452j(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i8, int i9, AbstractC3151p abstractC3151p) {
        this(fragmentActivity, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    @Override // com.stripe.android.view.AbstractC2454k
    public com.stripe.android.model.p getCreateParams() {
        Integer valueOf = Integer.valueOf(this.f27746b.b());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return p.e.g(com.stripe.android.model.p.f24581u, new p.j(((EnumC2453j0) EnumC2453j0.e().get(this.f27746b.b())).d()), null, null, null, 14, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2452j(FragmentActivity activity, AttributeSet attributeSet, int i8) {
        super(activity, attributeSet, i8);
        AbstractC3159y.i(activity, "activity");
        C2450i c2450i = new C2450i(new S0(activity), EnumC2453j0.e(), new b());
        this.f27746b = c2450i;
        G2.h c8 = G2.h.c(activity.getLayoutInflater(), this, true);
        AbstractC3159y.h(c8, "inflate(...)");
        setId(AbstractC3049A.f32757U);
        RecyclerView recyclerView = c8.f3131b;
        recyclerView.setAdapter(c2450i);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Integer num = this.f27745a;
        if (num != null) {
            c2450i.g(num.intValue());
        }
    }
}
