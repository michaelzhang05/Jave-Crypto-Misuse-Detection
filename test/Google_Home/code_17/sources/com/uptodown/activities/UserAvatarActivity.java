package com.uptodown.activities;

import G4.N;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.u0;
import Z4.InterfaceC1592f;
import a5.C1642i;
import a5.Q;
import a6.InterfaceC1668n;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.uptodown.R;
import com.uptodown.activities.G;
import com.uptodown.activities.UserAvatarActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3660F;
import o5.C3671k;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class UserAvatarActivity extends AbstractActivityC2683a {

    /* renamed from: P, reason: collision with root package name */
    private N f30041P;

    /* renamed from: Q, reason: collision with root package name */
    private N f30042Q;

    /* renamed from: R, reason: collision with root package name */
    private int f30043R;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f30039N = O5.l.b(new a());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f30040O = new ViewModelLazy(U.b(G.class), new h(this), new g(this), new i(null, this));

    /* renamed from: S, reason: collision with root package name */
    private final AtomicBoolean f30044S = new AtomicBoolean(false);

    /* renamed from: T, reason: collision with root package name */
    private final d f30045T = new d();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final u0 invoke() {
            return u0.c(UserAvatarActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30047a;

        b(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30047a;
            if (i8 != 0) {
                if (i8 == 1) {
                    O5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                O5.t.b(obj);
                if (UserAvatarActivity.this.f30044S.compareAndSet(false, true)) {
                    UserAvatarActivity userAvatarActivity = UserAvatarActivity.this;
                    this.f30047a = 1;
                    if (userAvatarActivity.s3(this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }
            UserAvatarActivity.this.f30044S.set(false);
            return O5.I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30049a;

        c(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30049a == 0) {
                O5.t.b(obj);
                UserAvatarActivity.this.m3();
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC1592f {
        d() {
        }

        @Override // Z4.InterfaceC1592f
        public void a(C1642i avatar, int i8) {
            AbstractC3255y.i(avatar, "avatar");
            if (avatar.f()) {
                if (UserAvatarActivity.this.n3().f().getValue() != null) {
                    Object value = UserAvatarActivity.this.n3().f().getValue();
                    AbstractC3255y.f(value);
                    if (((Q) value).x(UserAvatarActivity.this)) {
                        Object value2 = UserAvatarActivity.this.n3().f().getValue();
                        AbstractC3255y.f(value2);
                        if (((Q) value2).y()) {
                            N n8 = UserAvatarActivity.this.f30041P;
                            AbstractC3255y.f(n8);
                            if (n8.c() != -1) {
                                N n9 = UserAvatarActivity.this.f30041P;
                                AbstractC3255y.f(n9);
                                N n10 = UserAvatarActivity.this.f30041P;
                                AbstractC3255y.f(n10);
                                n9.notifyItemChanged(n10.c());
                                N n11 = UserAvatarActivity.this.f30041P;
                                AbstractC3255y.f(n11);
                                n11.d(-1);
                                N n12 = UserAvatarActivity.this.f30041P;
                                AbstractC3255y.f(n12);
                                n12.notifyItemChanged(i8);
                            }
                            N n13 = UserAvatarActivity.this.f30042Q;
                            if (n13 != null) {
                                N n14 = UserAvatarActivity.this.f30042Q;
                                AbstractC3255y.f(n14);
                                n13.notifyItemChanged(n14.c());
                            }
                            N n15 = UserAvatarActivity.this.f30042Q;
                            if (n15 != null) {
                                n15.d(i8);
                            }
                            N n16 = UserAvatarActivity.this.f30042Q;
                            if (n16 != null) {
                                n16.notifyItemChanged(i8);
                                return;
                            }
                            return;
                        }
                    }
                }
                C3671k.r(new C3671k(), UserAvatarActivity.this, C3660F.f36486c.c(UserAvatarActivity.this), null, 4, null);
                return;
            }
            if (UserAvatarActivity.this.f30042Q != null) {
                N n17 = UserAvatarActivity.this.f30042Q;
                AbstractC3255y.f(n17);
                if (n17.c() != -1) {
                    N n18 = UserAvatarActivity.this.f30042Q;
                    AbstractC3255y.f(n18);
                    N n19 = UserAvatarActivity.this.f30042Q;
                    AbstractC3255y.f(n19);
                    n18.notifyItemChanged(n19.c());
                    N n20 = UserAvatarActivity.this.f30042Q;
                    AbstractC3255y.f(n20);
                    n20.d(-1);
                    N n21 = UserAvatarActivity.this.f30042Q;
                    AbstractC3255y.f(n21);
                    n21.notifyItemChanged(i8);
                }
            }
            N n22 = UserAvatarActivity.this.f30041P;
            AbstractC3255y.f(n22);
            N n23 = UserAvatarActivity.this.f30041P;
            AbstractC3255y.f(n23);
            n22.notifyItemChanged(n23.c());
            N n24 = UserAvatarActivity.this.f30041P;
            AbstractC3255y.f(n24);
            n24.d(i8);
            N n25 = UserAvatarActivity.this.f30041P;
            AbstractC3255y.f(n25);
            n25.notifyItemChanged(i8);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30052a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserAvatarActivity f30054a;

            a(UserAvatarActivity userAvatarActivity) {
                this.f30054a = userAvatarActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f30054a.k3().f12581d.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    this.f30054a.k3().f12581d.f11842b.setVisibility(8);
                    this.f30054a.k3().f12587j.setVisibility(0);
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    this.f30054a.j3(((G.a) cVar.a()).a(), ((G.a) cVar.a()).b());
                } else {
                    boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
            }
        }

        e(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new e(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30052a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L d8 = UserAvatarActivity.this.n3().d();
                a aVar = new a(UserAvatarActivity.this);
                this.f30052a = 1;
                if (d8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30055a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserAvatarActivity f30057a;

            a(UserAvatarActivity userAvatarActivity) {
                this.f30057a = userAvatarActivity;
            }

            public final Object a(boolean z8, S5.d dVar) {
                if (z8) {
                    UserAvatarActivity userAvatarActivity = this.f30057a;
                    Toast.makeText(userAvatarActivity, userAvatarActivity.getString(R.string.avatar_activity_changed_success), 1).show();
                    this.f30057a.finish();
                }
                return O5.I.f8278a;
            }

            @Override // o6.InterfaceC3707g
            public /* bridge */ /* synthetic */ Object emit(Object obj, S5.d dVar) {
                return a(((Boolean) obj).booleanValue(), dVar);
            }
        }

        f(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f30055a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L e9 = UserAvatarActivity.this.n3().e();
                a aVar = new a(UserAvatarActivity.this);
                this.f30055a = 1;
                if (e9.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30058a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f30058a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30058a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f30059a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30059a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30060a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30061b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30060a = function0;
            this.f30061b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30060a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30061b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j3(ArrayList arrayList, ArrayList arrayList2) {
        boolean z8;
        int i8 = 0;
        if (this.f30041P == null) {
            this.f30041P = new N(arrayList, this.f30045T, 0, this.f30043R, false, 16, null);
            k3().f12582e.setAdapter(this.f30041P);
            k3().f12585h.setVisibility(0);
        }
        k3().f12580c.setVisibility(8);
        if (!arrayList2.isEmpty()) {
            k3().f12580c.setVisibility(0);
            Q e8 = Q.f14058k.e(this);
            if (e8 != null) {
                z8 = e8.y();
            } else {
                z8 = false;
            }
            if (this.f30042Q == null) {
                this.f30042Q = new N(arrayList2, this.f30045T, 1, 0, z8, 8, null);
                k3().f12583f.setAdapter(this.f30042Q);
                k3().f12583f.setVisibility(0);
            }
        } else {
            k3().f12580c.setVisibility(8);
            k3().f12583f.setVisibility(8);
        }
        Iterator it = arrayList.iterator();
        int i9 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((C1642i) it.next()).b() == 1) {
                    break;
                } else {
                    i9++;
                }
            } else {
                i9 = -1;
                break;
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((C1642i) it2.next()).b() == 1) {
                    break;
                } else {
                    i8++;
                }
            } else {
                i8 = -1;
                break;
            }
        }
        if (i9 > -1) {
            N n8 = this.f30041P;
            if (n8 != null) {
                n8.d(i9);
            }
            N n9 = this.f30041P;
            if (n9 != null) {
                n9.notifyItemChanged(i9);
                return;
            }
            return;
        }
        if (i8 > -1) {
            N n10 = this.f30042Q;
            if (n10 != null) {
                n10.d(i8);
            }
            N n11 = this.f30042Q;
            if (n11 != null) {
                n11.notifyItemChanged(i8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final u0 k3() {
        return (u0) this.f30039N.getValue();
    }

    private final int l3() {
        int i8 = getResources().getDisplayMetrics().widthPixels;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.margin_m);
        int i9 = 6;
        while (true) {
            if ((i8 - ((i9 + 1) * dimensionPixelSize)) / i9 > getResources().getDimensionPixelSize(R.dimen.icon_size_l)) {
                break;
            }
            i9--;
            if (i9 <= 0) {
                i9 = 1;
                break;
            }
        }
        this.f30043R = (i8 - (dimensionPixelSize * (i9 + 1))) / i9;
        return i9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m3() {
        n3().c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G n3() {
        return (G) this.f30040O.getValue();
    }

    private final void o3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        u0 k32 = k3();
        if (drawable != null) {
            k32.f12584g.setNavigationIcon(drawable);
            k32.f12584g.setNavigationContentDescription(getString(R.string.back));
        }
        k32.f12584g.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.X3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAvatarActivity.p3(UserAvatarActivity.this, view);
            }
        });
        TextView textView = k32.f12588k;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        k32.f12587j.setTypeface(aVar.t());
        k32.f12586i.setTypeface(aVar.t());
        k32.f12585h.setTypeface(aVar.t());
        k32.f12589l.setTypeface(aVar.t());
        k32.f12586i.setOnClickListener(new View.OnClickListener() { // from class: D4.Y3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserAvatarActivity.q3(UserAvatarActivity.this, view);
            }
        });
        if (n3().f().getValue() != null) {
            Object value = n3().f().getValue();
            AbstractC3255y.f(value);
            if (((Q) value).y()) {
                k32.f12579b.setOnClickListener(new View.OnClickListener() { // from class: D4.Z3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        UserAvatarActivity.r3(UserAvatarActivity.this, view);
                    }
                });
            }
        }
        int l32 = l3();
        k32.f12582e.setLayoutManager(new GridLayoutManager(this, l32));
        k32.f12582e.addItemDecoration(new q5.n(this, l32));
        k32.f12583f.setLayoutManager(new LinearLayoutManager(this, 0, false));
        k32.f12583f.addItemDecoration(new q5.u(this));
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(UserAvatarActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(UserAvatarActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(UserAvatarActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        C3671k.r(new C3671k(), this$0, C3660F.f36486c.c(this$0), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s3(S5.d r7) {
        /*
            r6 = this;
            androidx.lifecycle.LifecycleCoroutineScope r0 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r6)
            l6.J0 r1 = l6.C3347b0.c()
            com.uptodown.activities.UserAvatarActivity$f r3 = new com.uptodown.activities.UserAvatarActivity$f
            r7 = 0
            r3.<init>(r7)
            r4 = 2
            r5 = 0
            r2 = 0
            l6.AbstractC3360i.d(r0, r1, r2, r3, r4, r5)
            G4.N r0 = r6.f30041P
            r1 = -1
            if (r0 == 0) goto L3b
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            int r0 = r0.c()
            if (r0 == r1) goto L3b
            G4.N r7 = r6.f30041P
            kotlin.jvm.internal.AbstractC3255y.f(r7)
            java.util.ArrayList r7 = r7.b()
            G4.N r0 = r6.f30041P
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            int r0 = r0.c()
            java.lang.Object r7 = r7.get(r0)
            a5.i r7 = (a5.C1642i) r7
            goto L60
        L3b:
            G4.N r0 = r6.f30042Q
            if (r0 == 0) goto L60
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            int r0 = r0.c()
            if (r0 == r1) goto L60
            G4.N r7 = r6.f30042Q
            kotlin.jvm.internal.AbstractC3255y.f(r7)
            java.util.ArrayList r7 = r7.b()
            G4.N r0 = r6.f30042Q
            kotlin.jvm.internal.AbstractC3255y.f(r0)
            int r0 = r0.c()
            java.lang.Object r7 = r7.get(r0)
            a5.i r7 = (a5.C1642i) r7
        L60:
            if (r7 == 0) goto L69
            com.uptodown.activities.G r0 = r6.n3()
            r0.g(r6, r7)
        L69:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.UserAvatarActivity.s3(S5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(k3().getRoot());
        n3().f().setValue(Q.f14058k.e(this));
        o3();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        m3();
    }
}
