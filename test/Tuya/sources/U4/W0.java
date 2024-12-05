package U4;

import X4.C1501k;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import i6.AbstractC2829k;
import i6.C2812b0;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3312F;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes5.dex */
public final class W0 extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f11582a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f11583b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11584c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f11585d;

    /* renamed from: e, reason: collision with root package name */
    private int f11586e;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f11587a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f11588b;

        public a(ArrayList topList, boolean z8) {
            AbstractC3159y.i(topList, "topList");
            this.f11587a = topList;
            this.f11588b = z8;
        }

        public final boolean a() {
            return this.f11588b;
        }

        public final ArrayList b() {
            return this.f11587a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3159y.d(this.f11587a, aVar.f11587a) && this.f11588b == aVar.f11588b) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f11587a.hashCode() * 31;
            boolean z8 = this.f11588b;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            return hashCode + i8;
        }

        public String toString() {
            return "TopByCategoryData(topList=" + this.f11587a + ", firstRequest=" + this.f11588b + ')';
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11589a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f11591c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1501k f11592d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, C1501k c1501k, P5.d dVar) {
            super(2, dVar);
            this.f11591c = context;
            this.f11592d = c1501k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f11591c, this.f11592d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11589a == 0) {
                L5.t.b(obj);
                W0.this.k(true);
                W0.this.f11586e = 0;
                W0.this.f11582a.setValue(new AbstractC3337y.c(new a(W0.this.i(this.f11591c, this.f11592d), true)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f11593a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f11595c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1501k f11596d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, C1501k c1501k, P5.d dVar) {
            super(2, dVar);
            this.f11595c = context;
            this.f11596d = c1501k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new c(this.f11595c, this.f11596d, dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f11593a == 0) {
                L5.t.b(obj);
                W0.this.k(true);
                ArrayList i8 = W0.this.i(this.f11595c, this.f11596d);
                if (i8.isEmpty()) {
                    W0.this.j(true);
                }
                W0.this.f11582a.setValue(new AbstractC3337y.c(new a(i8, false)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public W0() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34547a);
        this.f11582a = a8;
        this.f11583b = a8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList i(Context context, C1501k c1501k) {
        X4.I H8;
        C3312F c3312f = new C3312F(context);
        ArrayList arrayList = new ArrayList();
        if (c1501k.c() > 0) {
            if (c1501k.n()) {
                arrayList = c3312f.F0(c3312f.f0(c1501k.c(), 40, this.f11586e));
            } else if (c1501k.k()) {
                arrayList = c3312f.F0(c3312f.c0(c1501k.c(), 40, this.f11586e));
            } else {
                arrayList = c3312f.F0(c3312f.b0(c1501k.c(), 40, this.f11586e));
            }
        } else if (c1501k.c() == -1) {
            arrayList = c3312f.F0(c3312f.a0(40, this.f11586e));
        } else if (c1501k.c() == -2) {
            if (c1501k.i() > 0) {
                H8 = c3312f.S(c1501k.i(), 40, this.f11586e);
            } else {
                H8 = c3312f.H(40, this.f11586e);
            }
            arrayList = c3312f.F0(H8);
        } else if (c1501k.c() == -3) {
            arrayList = c3312f.F0(c3312f.D(40, this.f11586e));
        }
        this.f11586e += arrayList.size();
        return arrayList;
    }

    public final void d(Context context, C1501k category) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(category, "category");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(context, category, null), 2, null);
    }

    public final void e(Context context, C1501k category) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(category, "category");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new c(context, category, null), 2, null);
    }

    public final boolean f() {
        return this.f11585d;
    }

    public final InterfaceC3349K g() {
        return this.f11583b;
    }

    public final boolean h() {
        return this.f11584c;
    }

    public final void j(boolean z8) {
        this.f11585d = z8;
    }

    public final void k(boolean z8) {
        this.f11584c = z8;
    }
}
