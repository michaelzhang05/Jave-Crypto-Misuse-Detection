package com.stripe.android.stripe3ds2.views;

import O5.I;
import O5.t;
import S5.g;
import a4.v;
import a6.InterfaceC1668n;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.n;
import androidx.lifecycle.viewmodel.CreationExtras;
import b4.b;
import c4.InterfaceC2044b;
import com.stripe.android.stripe3ds2.transaction.h;
import d4.C2750n;
import h6.InterfaceC2963c;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3364k;
import l6.InterfaceC3390x0;
import l6.M;
import o6.AbstractC3708h;
import o6.InterfaceC3706f;

/* loaded from: classes4.dex */
public final class b extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.stripe3ds2.transaction.b f28070a;

    /* renamed from: b, reason: collision with root package name */
    private final v f28071b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2044b f28072c;

    /* renamed from: d, reason: collision with root package name */
    private final C2750n f28073d;

    /* renamed from: e, reason: collision with root package name */
    private final MutableLiveData f28074e;

    /* renamed from: f, reason: collision with root package name */
    private final LiveData f28075f;

    /* renamed from: g, reason: collision with root package name */
    private final MutableLiveData f28076g;

    /* renamed from: h, reason: collision with root package name */
    private final LiveData f28077h;

    /* renamed from: i, reason: collision with root package name */
    private final MutableLiveData f28078i;

    /* renamed from: j, reason: collision with root package name */
    private final LiveData f28079j;

    /* renamed from: k, reason: collision with root package name */
    private final MutableLiveData f28080k;

    /* renamed from: l, reason: collision with root package name */
    private final LiveData f28081l;

    /* renamed from: m, reason: collision with root package name */
    private final c f28082m;

    /* renamed from: n, reason: collision with root package name */
    private final LiveData f28083n;

    /* renamed from: o, reason: collision with root package name */
    private final c f28084o;

    /* renamed from: p, reason: collision with root package name */
    private final LiveData f28085p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f28086q;

    /* renamed from: r, reason: collision with root package name */
    private final InterfaceC3390x0 f28087r;

    /* loaded from: classes4.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28088a;

        a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f28088a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                v vVar = b.this.f28071b;
                this.f28088a = 1;
                if (vVar.b(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* renamed from: com.stripe.android.stripe3ds2.views.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0678b implements ViewModelProvider.Factory {

        /* renamed from: a, reason: collision with root package name */
        private final com.stripe.android.stripe3ds2.transaction.b f28090a;

        /* renamed from: b, reason: collision with root package name */
        private final v f28091b;

        /* renamed from: c, reason: collision with root package name */
        private final X3.c f28092c;

        /* renamed from: d, reason: collision with root package name */
        private final g f28093d;

        public C0678b(com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, v transactionTimer, X3.c errorReporter, g workContext) {
            AbstractC3255y.i(challengeActionHandler, "challengeActionHandler");
            AbstractC3255y.i(transactionTimer, "transactionTimer");
            AbstractC3255y.i(errorReporter, "errorReporter");
            AbstractC3255y.i(workContext, "workContext");
            this.f28090a = challengeActionHandler;
            this.f28091b = transactionTimer;
            this.f28092c = errorReporter;
            this.f28093d = workContext;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(InterfaceC2963c interfaceC2963c, CreationExtras creationExtras) {
            return n.a(this, interfaceC2963c, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
            return n.c(this, cls, creationExtras);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public ViewModel create(Class modelClass) {
            AbstractC3255y.i(modelClass, "modelClass");
            return new b(this.f28090a, this.f28091b, this.f28092c, null, this.f28093d, 8, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class c extends MutableLiveData {
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.lifecycle.LiveData
        public void onInactive() {
            super.onInactive();
            setValue(null);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28094a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28095b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b.d f28097d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f28098e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(b.d dVar, int i8, S5.d dVar2) {
            super(2, dVar2);
            this.f28097d = dVar;
            this.f28098e = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            d dVar2 = new d(this.f28097d, this.f28098e, dVar);
            dVar2.f28095b = obj;
            return dVar2;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(LiveDataScope liveDataScope, S5.d dVar) {
            return ((d) create(liveDataScope, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            String str;
            Object e8 = T5.b.e();
            int i8 = this.f28094a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f28095b;
                t.b(obj);
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f28095b;
                C2750n c2750n = b.this.f28073d;
                b.d dVar = this.f28097d;
                if (dVar != null) {
                    str = dVar.b(this.f28098e);
                } else {
                    str = null;
                }
                this.f28095b = liveDataScope;
                this.f28094a = 1;
                obj = c2750n.e(str, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f28095b = null;
            this.f28094a = 2;
            if (liveDataScope.emit(obj, this) == e8) {
                return e8;
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f28099a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f28100b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f28102a;

            /* renamed from: b, reason: collision with root package name */
            /* synthetic */ boolean f28103b;

            a(S5.d dVar) {
                super(2, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                a aVar = new a(dVar);
                aVar.f28103b = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // a6.InterfaceC1668n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return invoke(((Boolean) obj).booleanValue(), (S5.d) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f28102a == 0) {
                    t.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(this.f28103b);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(boolean z8, S5.d dVar) {
                return ((a) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8278a);
            }
        }

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            e eVar = new e(dVar);
            eVar.f28100b = obj;
            return eVar;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(LiveDataScope liveDataScope, S5.d dVar) {
            return ((e) create(liveDataScope, dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            LiveDataScope liveDataScope;
            Object e8 = T5.b.e();
            int i8 = this.f28099a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        t.b(obj);
                        return I.f8278a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                liveDataScope = (LiveDataScope) this.f28100b;
                t.b(obj);
            } else {
                t.b(obj);
                liveDataScope = (LiveDataScope) this.f28100b;
                InterfaceC3706f a8 = b.this.f28071b.a();
                a aVar = new a(null);
                this.f28100b = liveDataScope;
                this.f28099a = 1;
                obj = AbstractC3708h.y(a8, aVar, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f28100b = null;
            this.f28099a = 2;
            if (liveDataScope.emit(obj, this) == e8) {
                return e8;
            }
            return I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        Object f28104a;

        /* renamed from: b, reason: collision with root package name */
        int f28105b;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.stripe3ds2.transaction.a f28107d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(com.stripe.android.stripe3ds2.transaction.a aVar, S5.d dVar) {
            super(2, dVar);
            this.f28107d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(this.f28107d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            c cVar;
            Object e8 = T5.b.e();
            int i8 = this.f28105b;
            if (i8 != 0) {
                if (i8 == 1) {
                    cVar = (c) this.f28104a;
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar2 = b.this.f28082m;
                com.stripe.android.stripe3ds2.transaction.b bVar = b.this.f28070a;
                com.stripe.android.stripe3ds2.transaction.a aVar = this.f28107d;
                this.f28104a = cVar2;
                this.f28105b = 1;
                Object a8 = bVar.a(aVar, this);
                if (a8 == e8) {
                    return e8;
                }
                cVar = cVar2;
                obj = a8;
            }
            cVar.postValue(obj);
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public /* synthetic */ b(com.stripe.android.stripe3ds2.transaction.b bVar, v vVar, X3.c cVar, InterfaceC2044b interfaceC2044b, g gVar, int i8, AbstractC3247p abstractC3247p) {
        this(bVar, vVar, cVar, (i8 & 8) != 0 ? InterfaceC2044b.a.f15725a : interfaceC2044b, gVar);
    }

    public final LiveData e() {
        return this.f28083n;
    }

    public final LiveData f() {
        return this.f28081l;
    }

    public final LiveData g(b.d dVar, int i8) {
        return CoroutineLiveDataKt.liveData$default((g) null, 0L, new d(dVar, i8, null), 3, (Object) null);
    }

    public final LiveData h() {
        return this.f28085p;
    }

    public final LiveData i() {
        return this.f28075f;
    }

    public final LiveData j() {
        return this.f28079j;
    }

    public final boolean k() {
        return this.f28086q;
    }

    public final LiveData l() {
        return this.f28077h;
    }

    public final LiveData m() {
        return CoroutineLiveDataKt.liveData$default((g) null, 0L, new e(null), 3, (Object) null);
    }

    public final void n(h challengeResult) {
        AbstractC3255y.i(challengeResult, "challengeResult");
        this.f28078i.postValue(challengeResult);
    }

    public final void o() {
        this.f28072c.clear();
    }

    public final void p(b4.b cres) {
        AbstractC3255y.i(cres, "cres");
        this.f28084o.setValue(cres);
    }

    public final void q() {
        this.f28074e.setValue(I.f8278a);
    }

    public final void r(com.stripe.android.stripe3ds2.transaction.a challengeAction) {
        AbstractC3255y.i(challengeAction, "challengeAction");
        this.f28076g.postValue(challengeAction);
    }

    public final void s(boolean z8) {
        this.f28086q = z8;
    }

    public final void t() {
        InterfaceC3390x0.a.a(this.f28087r, null, 1, null);
    }

    public final void u(com.stripe.android.stripe3ds2.transaction.a action) {
        AbstractC3255y.i(action, "action");
        AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new f(action, null), 3, null);
    }

    public b(com.stripe.android.stripe3ds2.transaction.b challengeActionHandler, v transactionTimer, X3.c errorReporter, InterfaceC2044b imageCache, g workContext) {
        InterfaceC3390x0 d8;
        AbstractC3255y.i(challengeActionHandler, "challengeActionHandler");
        AbstractC3255y.i(transactionTimer, "transactionTimer");
        AbstractC3255y.i(errorReporter, "errorReporter");
        AbstractC3255y.i(imageCache, "imageCache");
        AbstractC3255y.i(workContext, "workContext");
        this.f28070a = challengeActionHandler;
        this.f28071b = transactionTimer;
        this.f28072c = imageCache;
        this.f28073d = new C2750n(errorReporter, workContext);
        MutableLiveData mutableLiveData = new MutableLiveData();
        this.f28074e = mutableLiveData;
        this.f28075f = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData();
        this.f28076g = mutableLiveData2;
        this.f28077h = mutableLiveData2;
        MutableLiveData mutableLiveData3 = new MutableLiveData();
        this.f28078i = mutableLiveData3;
        this.f28079j = mutableLiveData3;
        MutableLiveData mutableLiveData4 = new MutableLiveData();
        this.f28080k = mutableLiveData4;
        this.f28081l = mutableLiveData4;
        c cVar = new c();
        this.f28082m = cVar;
        this.f28083n = cVar;
        c cVar2 = new c();
        this.f28084o = cVar2;
        this.f28085p = cVar2;
        d8 = AbstractC3364k.d(ViewModelKt.getViewModelScope(this), null, null, new a(null), 3, null);
        this.f28087r = d8;
    }
}
