package com.stripe.android.view;

import android.util.AttributeSet;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.p;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import m2.AbstractC3403A;

/* renamed from: com.stripe.android.view.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2646j extends AbstractC2648k {

    /* renamed from: c, reason: collision with root package name */
    public static final a f28798c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f28799d = 8;

    /* renamed from: a, reason: collision with root package name */
    private Integer f28800a;

    /* renamed from: b, reason: collision with root package name */
    private final C2644i f28801b;

    /* renamed from: com.stripe.android.view.j$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final /* synthetic */ C2646j a(FragmentActivity activity) {
            AbstractC3255y.i(activity, "activity");
            return new C2646j(activity, null, 0, 6, null);
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* renamed from: com.stripe.android.view.j$b */
    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function1 {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return O5.I.f8278a;
        }

        public final void invoke(int i8) {
            C2646j.this.f28800a = Integer.valueOf(i8);
        }
    }

    public /* synthetic */ C2646j(FragmentActivity fragmentActivity, AttributeSet attributeSet, int i8, int i9, AbstractC3247p abstractC3247p) {
        this(fragmentActivity, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    @Override // com.stripe.android.view.AbstractC2648k
    public com.stripe.android.model.p getCreateParams() {
        Integer valueOf = Integer.valueOf(this.f28801b.b());
        if (valueOf.intValue() == -1) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        return p.e.g(com.stripe.android.model.p.f25636u, new p.j(((EnumC2647j0) EnumC2647j0.e().get(this.f28801b.b())).d()), null, null, null, 14, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2646j(FragmentActivity activity, AttributeSet attributeSet, int i8) {
        super(activity, attributeSet, i8);
        AbstractC3255y.i(activity, "activity");
        C2644i c2644i = new C2644i(new S0(activity), EnumC2647j0.e(), new b());
        this.f28801b = c2644i;
        J2.h c8 = J2.h.c(activity.getLayoutInflater(), this, true);
        AbstractC3255y.h(c8, "inflate(...)");
        setId(AbstractC3403A.f34733U);
        RecyclerView recyclerView = c8.f4850b;
        recyclerView.setAdapter(c2644i);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(activity));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        Integer num = this.f28800a;
        if (num != null) {
            c2644i.g(num.intValue());
        }
    }
}
