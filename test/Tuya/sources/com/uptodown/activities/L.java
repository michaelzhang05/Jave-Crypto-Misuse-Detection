package com.uptodown.activities;

import X4.C1498h;
import X4.C1505o;
import X4.U;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import i6.AbstractC2829k;
import i6.C2812b0;
import i6.M;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import l5.AbstractC3337y;
import l5.C3326n;
import l6.AbstractC3351M;
import l6.InterfaceC3349K;

/* loaded from: classes4.dex */
public final class L extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final l6.v f28348a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3349K f28349b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28350c;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f28351a;

        public a(ArrayList wishlist) {
            AbstractC3159y.i(wishlist, "wishlist");
            this.f28351a = wishlist;
        }

        public final ArrayList a() {
            return this.f28351a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3159y.d(this.f28351a, ((a) obj).f28351a);
        }

        public int hashCode() {
            return this.f28351a.hashCode();
        }

        public String toString() {
            return "WishlistData(wishlist=" + this.f28351a + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements X5.n {

        /* renamed from: a, reason: collision with root package name */
        int f28352a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f28353b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ L f28354c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f28355d;

        /* loaded from: classes4.dex */
        public static final class a implements W4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ U f28356a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f28357b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f28358c;

            a(U u8, Context context, Function1 function1) {
                this.f28356a = u8;
                this.f28357b = context;
                this.f28358c = function1;
            }

            @Override // W4.r
            public void c(int i8) {
                if (i8 == 404) {
                    this.f28356a.i(this.f28357b);
                    Function1 function1 = this.f28358c;
                    U w8 = this.f28356a;
                    AbstractC3159y.h(w8, "w");
                    function1.invoke(w8);
                }
            }

            @Override // W4.r
            public void f(C1498h appInfo) {
                AbstractC3159y.i(appInfo, "appInfo");
                if (!appInfo.n1()) {
                    this.f28356a.q(this.f28357b, 0);
                    Function1 function1 = this.f28358c;
                    U w8 = this.f28356a;
                    AbstractC3159y.h(w8, "w");
                    function1.invoke(w8);
                    return;
                }
                if (appInfo.n1() && this.f28356a.b() == 0) {
                    this.f28356a.q(this.f28357b, 1);
                    Function1 function12 = this.f28358c;
                    U w9 = this.f28356a;
                    AbstractC3159y.h(w9, "w");
                    function12.invoke(w9);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, L l8, Function1 function1, P5.d dVar) {
            super(2, dVar);
            this.f28353b = context;
            this.f28354c = l8;
            this.f28355d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new b(this.f28353b, this.f28354c, this.f28355d, dVar);
        }

        @Override // X5.n
        public final Object invoke(M m8, P5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f28352a == 0) {
                L5.t.b(obj);
                C3326n a8 = C3326n.f34504t.a(this.f28353b);
                a8.a();
                ArrayList w02 = a8.w0();
                ArrayList c02 = a8.c0();
                if (!this.f28354c.f28350c) {
                    Iterator it = w02.iterator();
                    while (it.hasNext()) {
                        U u8 = (U) it.next();
                        new S4.i(this.f28353b, u8.a(), new a(u8, this.f28353b, this.f28355d), ViewModelKt.getViewModelScope(this.f28354c));
                    }
                }
                a8.g();
                Iterator it2 = w02.iterator();
                while (it2.hasNext()) {
                    U u9 = (U) it2.next();
                    Iterator it3 = c02.iterator();
                    while (it3.hasNext()) {
                        C1505o c1505o = (C1505o) it3.next();
                        if (u9.a() == c1505o.f()) {
                            String u10 = c1505o.u();
                            AbstractC3159y.f(u10);
                            u9.l(u10);
                        }
                    }
                }
                this.f28354c.f28350c = true;
                this.f28354c.f28348a.setValue(new AbstractC3337y.c(new a(w02)));
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public L() {
        l6.v a8 = AbstractC3351M.a(AbstractC3337y.a.f34547a);
        this.f28348a = a8;
        this.f28349b = a8;
    }

    public final void d(Context context, Function1 callback) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(callback, "callback");
        AbstractC2829k.d(ViewModelKt.getViewModelScope(this), C2812b0.b(), null, new b(context, this, callback, null), 2, null);
    }

    public final InterfaceC3349K e() {
        return this.f28349b;
    }
}
