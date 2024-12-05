package com.stripe.android.paymentsheet.paymentdatacollection.bacs;

import O5.I;
import O5.t;
import P5.AbstractC1378t;
import a6.InterfaceC1668n;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationContract;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.c;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.d;
import h6.InterfaceC2963c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.M;
import o6.AbstractC3689C;
import o6.AbstractC3700N;
import o6.AbstractC3708h;
import o6.InterfaceC3687A;
import o6.InterfaceC3698L;
import o6.v;
import o6.w;

/* loaded from: classes4.dex */
public final class e extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final v f27224a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3687A f27225b;

    /* renamed from: c, reason: collision with root package name */
    private final w f27226c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3698L f27227d;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f27228a;

        /* renamed from: b, reason: collision with root package name */
        private final String f27229b;

        /* renamed from: c, reason: collision with root package name */
        private final String f27230c;

        /* renamed from: d, reason: collision with root package name */
        private final String f27231d;

        public a(String email, String nameOnAccount, String sortCode, String accountNumber) {
            AbstractC3255y.i(email, "email");
            AbstractC3255y.i(nameOnAccount, "nameOnAccount");
            AbstractC3255y.i(sortCode, "sortCode");
            AbstractC3255y.i(accountNumber, "accountNumber");
            this.f27228a = email;
            this.f27229b = nameOnAccount;
            this.f27230c = sortCode;
            this.f27231d = accountNumber;
        }

        public final String a() {
            return this.f27231d;
        }

        public final String b() {
            return this.f27228a;
        }

        public final String c() {
            return this.f27229b;
        }

        public final String d() {
            return this.f27230c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3255y.d(this.f27228a, aVar.f27228a) && AbstractC3255y.d(this.f27229b, aVar.f27229b) && AbstractC3255y.d(this.f27230c, aVar.f27230c) && AbstractC3255y.d(this.f27231d, aVar.f27231d);
        }

        public int hashCode() {
            return (((((this.f27228a.hashCode() * 31) + this.f27229b.hashCode()) * 31) + this.f27230c.hashCode()) * 31) + this.f27231d.hashCode();
        }

        public String toString() {
            return "Args(email=" + this.f27228a + ", nameOnAccount=" + this.f27229b + ", sortCode=" + this.f27230c + ", accountNumber=" + this.f27231d + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final BacsMandateConfirmationContract.a f27232a;

        public b(BacsMandateConfirmationContract.a args) {
            AbstractC3255y.i(args, "args");
            this.f27232a = args;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls) {
            return n.b(this, cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass, CreationExtras extras) {
            AbstractC3255y.i(modelClass, "modelClass");
            AbstractC3255y.i(extras, "extras");
            return new e(new a(this.f27232a.g(), this.f27232a.h(), this.f27232a.i(), this.f27232a.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27233a;

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27233a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = e.this.f27224a;
                c.a aVar = c.a.f27217a;
                this.f27233a = 1;
                if (vVar.emit(aVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27235a;

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27235a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = e.this.f27224a;
                c.C0623c c0623c = c.C0623c.f27219a;
                this.f27235a = 1;
                if (vVar.emit(c0623c, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.paymentsheet.paymentdatacollection.bacs.e$e, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0624e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f27237a;

        C0624e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0624e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f27237a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = e.this.f27224a;
                c.d dVar = c.d.f27220a;
                this.f27237a = 1;
                if (vVar.emit(dVar, this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((C0624e) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public e(a args) {
        AbstractC3255y.i(args, "args");
        v b8 = AbstractC3689C.b(0, 0, null, 7, null);
        this.f27224a = b8;
        this.f27225b = AbstractC3708h.a(b8);
        w a8 = AbstractC3700N.a(new G3.d(args.b(), args.c(), AbstractC1378t.w0(j6.n.O0(args.d(), 2), "-", null, null, 0, null, null, 62, null), args.a(), d(), b(), c()));
        this.f27226c = a8;
        this.f27227d = AbstractC3708h.b(a8);
    }

    private final B2.b b() {
        int i8 = t3.w.f39811y;
        B2.b a8 = B2.c.a(t3.w.f39812z);
        B2.b a9 = B2.c.a(t3.w.f39747A);
        int i9 = t3.w.f39748B;
        return B2.c.f(i8, new Object[]{a8, a9, B2.c.a(i9), B2.c.a(i9)}, null, 4, null);
    }

    private final B2.b c() {
        return B2.c.f(t3.w.f39804r, new Object[]{B2.c.a(t3.w.f39805s), B2.c.a(t3.w.f39803q)}, null, 4, null);
    }

    private final B2.b d() {
        return B2.c.a(t3.w.f39808v);
    }

    private final void h() {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
    }

    private final void i() {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new d(null), 3, null);
    }

    private final void j() {
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new C0624e(null), 3, null);
    }

    public final InterfaceC3687A e() {
        return this.f27225b;
    }

    public final InterfaceC3698L f() {
        return this.f27227d;
    }

    public final void g(com.stripe.android.paymentsheet.paymentdatacollection.bacs.d action) {
        AbstractC3255y.i(action, "action");
        if (action instanceof d.b) {
            i();
        } else if (action instanceof d.c) {
            j();
        } else if (action instanceof d.a) {
            h();
        }
    }
}
