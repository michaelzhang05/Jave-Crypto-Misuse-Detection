package X4;

import a5.C1644k;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import o5.AbstractC3685y;
import o5.C3660F;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes5.dex */
public final class W0 extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f13252a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f13253b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f13254c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f13255d;

    /* renamed from: e, reason: collision with root package name */
    private int f13256e;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f13257a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f13258b;

        public a(ArrayList topList, boolean z8) {
            AbstractC3255y.i(topList, "topList");
            this.f13257a = topList;
            this.f13258b = z8;
        }

        public final boolean a() {
            return this.f13258b;
        }

        public final ArrayList b() {
            return this.f13257a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (AbstractC3255y.d(this.f13257a, aVar.f13257a) && this.f13258b == aVar.f13258b) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f13257a.hashCode() * 31;
            boolean z8 = this.f13258b;
            int i8 = z8;
            if (z8 != 0) {
                i8 = 1;
            }
            return hashCode + i8;
        }

        public String toString() {
            return "TopByCategoryData(topList=" + this.f13257a + ", firstRequest=" + this.f13258b + ')';
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13259a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13261c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1644k f13262d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, C1644k c1644k, S5.d dVar) {
            super(2, dVar);
            this.f13261c = context;
            this.f13262d = c1644k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f13261c, this.f13262d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13259a == 0) {
                O5.t.b(obj);
                W0.this.k(true);
                W0.this.f13256e = 0;
                W0.this.f13252a.setValue(new AbstractC3685y.c(new a(W0.this.i(this.f13261c, this.f13262d), true)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f13263a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f13265c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ C1644k f13266d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, C1644k c1644k, S5.d dVar) {
            super(2, dVar);
            this.f13265c = context;
            this.f13266d = c1644k;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(this.f13265c, this.f13266d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f13263a == 0) {
                O5.t.b(obj);
                W0.this.k(true);
                ArrayList i8 = W0.this.i(this.f13265c, this.f13266d);
                if (i8.isEmpty()) {
                    W0.this.j(true);
                }
                W0.this.f13252a.setValue(new AbstractC3685y.c(new a(i8, false)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public W0() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f13252a = a8;
        this.f13253b = a8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList i(Context context, C1644k c1644k) {
        a5.I H8;
        C3660F c3660f = new C3660F(context);
        ArrayList arrayList = new ArrayList();
        if (c1644k.b() > 0) {
            if (c1644k.s()) {
                arrayList = c3660f.F0(c3660f.f0(c1644k.b(), 40, this.f13256e));
            } else if (c1644k.p()) {
                arrayList = c3660f.F0(c3660f.c0(c1644k.b(), 40, this.f13256e));
            } else {
                arrayList = c3660f.F0(c3660f.b0(c1644k.b(), 40, this.f13256e));
            }
        } else if (c1644k.b() == -1) {
            arrayList = c3660f.F0(c3660f.a0(40, this.f13256e));
        } else if (c1644k.b() == -2) {
            if (c1644k.i() > 0) {
                H8 = c3660f.S(c1644k.i(), 40, this.f13256e);
            } else {
                H8 = c3660f.H(40, this.f13256e);
            }
            arrayList = c3660f.F0(H8);
        } else if (c1644k.b() == -3) {
            arrayList = c3660f.F0(c3660f.D(40, this.f13256e));
        }
        this.f13256e += arrayList.size();
        return arrayList;
    }

    public final void d(Context context, C1644k category) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(category, "category");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(context, category, null), 2, null);
    }

    public final void e(Context context, C1644k category) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(category, "category");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new c(context, category, null), 2, null);
    }

    public final boolean f() {
        return this.f13255d;
    }

    public final InterfaceC3698L g() {
        return this.f13253b;
    }

    public final boolean h() {
        return this.f13254c;
    }

    public final void j(boolean z8) {
        this.f13255d = z8;
    }

    public final void k(boolean z8) {
        this.f13254c = z8;
    }
}
