package com.uptodown.activities;

import a5.C1641h;
import a5.C1648o;
import a5.U;
import a6.InterfaceC1668n;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3674n;
import o6.AbstractC3700N;
import o6.InterfaceC3698L;

/* loaded from: classes4.dex */
public final class K extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final o6.w f29402a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3698L f29403b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f29404c;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f29405a;

        public a(ArrayList wishlist) {
            AbstractC3255y.i(wishlist, "wishlist");
            this.f29405a = wishlist;
        }

        public final ArrayList a() {
            return this.f29405a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3255y.d(this.f29405a, ((a) obj).f29405a);
        }

        public int hashCode() {
            return this.f29405a.hashCode();
        }

        public String toString() {
            return "WishlistData(wishlist=" + this.f29405a + ')';
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29406a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29407b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ K f29408c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function1 f29409d;

        /* loaded from: classes4.dex */
        public static final class a implements Z4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ U f29410a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f29411b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f29412c;

            a(U u8, Context context, Function1 function1) {
                this.f29410a = u8;
                this.f29411b = context;
                this.f29412c = function1;
            }

            @Override // Z4.r
            public void c(int i8) {
                if (i8 == 404) {
                    this.f29410a.i(this.f29411b);
                    Function1 function1 = this.f29412c;
                    U w8 = this.f29410a;
                    AbstractC3255y.h(w8, "w");
                    function1.invoke(w8);
                }
            }

            @Override // Z4.r
            public void e(C1641h appInfo) {
                AbstractC3255y.i(appInfo, "appInfo");
                if (!appInfo.n1()) {
                    this.f29410a.q(this.f29411b, 0);
                    Function1 function1 = this.f29412c;
                    U w8 = this.f29410a;
                    AbstractC3255y.h(w8, "w");
                    function1.invoke(w8);
                    return;
                }
                if (appInfo.n1() && this.f29410a.b() == 0) {
                    this.f29410a.q(this.f29411b, 1);
                    Function1 function12 = this.f29412c;
                    U w9 = this.f29410a;
                    AbstractC3255y.h(w9, "w");
                    function12.invoke(w9);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, K k8, Function1 function1, S5.d dVar) {
            super(2, dVar);
            this.f29407b = context;
            this.f29408c = k8;
            this.f29409d = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(this.f29407b, this.f29408c, this.f29409d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f29406a == 0) {
                O5.t.b(obj);
                C3674n a8 = C3674n.f36505t.a(this.f29407b);
                a8.a();
                ArrayList w02 = a8.w0();
                ArrayList c02 = a8.c0();
                if (!this.f29408c.f29404c) {
                    Iterator it = w02.iterator();
                    while (it.hasNext()) {
                        U u8 = (U) it.next();
                        new V4.i(this.f29407b, u8.a(), new a(u8, this.f29407b, this.f29409d), ViewModelKt.getViewModelScope(this.f29408c));
                    }
                }
                a8.l();
                Iterator it2 = w02.iterator();
                while (it2.hasNext()) {
                    U u9 = (U) it2.next();
                    Iterator it3 = c02.iterator();
                    while (it3.hasNext()) {
                        C1648o c1648o = (C1648o) it3.next();
                        if (u9.a() == c1648o.h()) {
                            String w8 = c1648o.w();
                            AbstractC3255y.f(w8);
                            u9.l(w8);
                        }
                    }
                }
                this.f29408c.f29404c = true;
                this.f29408c.f29402a.setValue(new AbstractC3685y.c(new a(w02)));
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    public K() {
        o6.w a8 = AbstractC3700N.a(AbstractC3685y.a.f36548a);
        this.f29402a = a8;
        this.f29403b = a8;
    }

    public final void d(Context context, Function1 callback) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(callback, "callback");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), C3347b0.b(), null, new b(context, this, callback, null), 2, null);
    }

    public final InterfaceC3698L e() {
        return this.f29403b;
    }
}
