package com.uptodown.activities;

import G4.Q;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.x0;
import a5.C1641h;
import a5.K;
import a6.InterfaceC1668n;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.snackbar.Snackbar;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.H;
import com.uptodown.activities.UserCommentsActivity;
import com.uptodown.util.views.UsernameTextView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3655A;
import o5.C3671k;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class UserCommentsActivity extends AbstractActivityC2683a {

    /* renamed from: P, reason: collision with root package name */
    private Q f30064P;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f30062N = O5.l.b(new a());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f30063O = new ViewModelLazy(U.b(H.class), new g(this), new f(this), new h(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private c f30065Q = new c();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x0 invoke() {
            return x0.c(UserCommentsActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends RecyclerView.OnScrollListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LinearLayoutManager f30067a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ UserCommentsActivity f30068b;

        b(LinearLayoutManager linearLayoutManager, UserCommentsActivity userCommentsActivity) {
            this.f30067a = linearLayoutManager;
            this.f30068b = userCommentsActivity;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
            AbstractC3255y.i(recyclerView, "recyclerView");
            if (i9 > 0) {
                int findFirstVisibleItemPosition = this.f30067a.findFirstVisibleItemPosition();
                int childCount = this.f30067a.getChildCount();
                int itemCount = this.f30067a.getItemCount();
                if (!this.f30068b.i3().i() && childCount + findFirstVisibleItemPosition >= itemCount) {
                    Q q8 = this.f30068b.f30064P;
                    if (q8 != null) {
                        q8.c(true);
                    }
                    this.f30068b.g3();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class c implements Z4.H {

        /* loaded from: classes4.dex */
        public static final class a implements Z4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCommentsActivity f30070a;

            a(UserCommentsActivity userCommentsActivity) {
                this.f30070a = userCommentsActivity;
            }

            @Override // Z4.r
            public void c(int i8) {
            }

            @Override // Z4.r
            public void e(C1641h appInfo) {
                AbstractC3255y.i(appInfo, "appInfo");
                Intent intent = new Intent(this.f30070a, (Class<?>) AppDetailActivity.class);
                intent.putExtra("appInfo", appInfo);
                UserCommentsActivity userCommentsActivity = this.f30070a;
                userCommentsActivity.startActivity(intent, UptodownApp.f29058B.a(userCommentsActivity));
            }
        }

        c() {
        }

        @Override // Z4.H
        public void a(int i8) {
            Intent intent = new Intent(UserCommentsActivity.this, (Class<?>) RepliesActivity.class);
            Q q8 = UserCommentsActivity.this.f30064P;
            AbstractC3255y.f(q8);
            Object obj = q8.b().get(i8);
            a5.K k8 = (a5.K) obj;
            k8.Y((String) UserCommentsActivity.this.i3().l().getValue());
            AbstractC3255y.h(obj, "adapter!!.reviews[positi…wModel.userAvatar.value }");
            k8.e0(((Boolean) UserCommentsActivity.this.i3().p().getValue()).booleanValue() ? 1 : 0);
            k8.h0((String) UserCommentsActivity.this.i3().o().getValue());
            intent.putExtra("review", k8);
            intent.putExtra(HintConstants.AUTOFILL_HINT_USERNAME, (String) UserCommentsActivity.this.i3().n().getValue());
            UserCommentsActivity userCommentsActivity = UserCommentsActivity.this;
            userCommentsActivity.startActivity(intent, UptodownApp.f29058B.a(userCommentsActivity));
        }

        @Override // Z4.H
        public void b(int i8) {
            if (UptodownApp.f29058B.a0()) {
                C3655A c3655a = C3655A.f36474a;
                Q q8 = UserCommentsActivity.this.f30064P;
                AbstractC3255y.f(q8);
                if (!c3655a.i(((a5.K) q8.b().get(i8)).l())) {
                    H i32 = UserCommentsActivity.this.i3();
                    UserCommentsActivity userCommentsActivity = UserCommentsActivity.this;
                    Q q9 = userCommentsActivity.f30064P;
                    AbstractC3255y.f(q9);
                    Object obj = q9.b().get(i8);
                    AbstractC3255y.h(obj, "adapter!!.reviews[position]");
                    i32.q(userCommentsActivity, (a5.K) obj);
                }
            }
        }

        @Override // Z4.H
        public void c(int i8) {
            if (UptodownApp.f29058B.a0()) {
                UserCommentsActivity userCommentsActivity = UserCommentsActivity.this;
                Q q8 = userCommentsActivity.f30064P;
                AbstractC3255y.f(q8);
                new V4.i(userCommentsActivity, ((a5.K) q8.b().get(i8)).b(), new a(UserCommentsActivity.this), LifecycleOwnerKt.getLifecycleScope(UserCommentsActivity.this));
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30071a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCommentsActivity f30073a;

            a(UserCommentsActivity userCommentsActivity) {
                this.f30073a = userCommentsActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f30073a.f3().f12622d.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    if (((H.a) cVar.a()).b() != null && ((H.a) cVar.a()).c()) {
                        String h8 = ((H.a) cVar.a()).b().h();
                        if (h8 != null && h8.length() != 0) {
                            com.squareup.picasso.s.h().l(a5.Q.f14058k.c(((H.a) cVar.a()).b().b())).n(UptodownApp.f29058B.f0(this.f30073a)).i(this.f30073a.f3().f12620b);
                        }
                        this.f30073a.f3().f12629k.setText(((H.a) cVar.a()).b().s());
                        UsernameTextView.a aVar = UsernameTextView.f31022k;
                        UsernameTextView usernameTextView = this.f30073a.f3().f12629k;
                        AbstractC3255y.h(usernameTextView, "binding.tvUsernameUserComment");
                        aVar.a(usernameTextView, ((H.a) cVar.a()).b().z(), ((H.a) cVar.a()).b().w());
                        this.f30073a.f3().f12626h.setText(((H.a) cVar.a()).b().u());
                        if (((H.a) cVar.a()).b().z()) {
                            this.f30073a.f3().f12621c.setVisibility(0);
                            C3671k.a aVar2 = C3671k.f36498a;
                            ImageView imageView = this.f30073a.f3().f12620b;
                            AbstractC3255y.h(imageView, "binding.ivAvatarUserComment");
                            aVar2.a(imageView);
                        }
                        if (!((H.a) cVar.a()).a().isEmpty()) {
                            if (this.f30073a.f30064P != null) {
                                Q q8 = this.f30073a.f30064P;
                                AbstractC3255y.f(q8);
                                q8.a(((H.a) cVar.a()).a());
                            } else {
                                this.f30073a.f30064P = new Q(((H.a) cVar.a()).a(), this.f30073a.f30065Q);
                                this.f30073a.f3().f12624f.setAdapter(this.f30073a.f30064P);
                            }
                        }
                        Q q9 = this.f30073a.f30064P;
                        if (q9 != null) {
                            q9.c(false);
                        }
                        this.f30073a.f3().f12630l.setVisibility(0);
                    } else {
                        this.f30073a.f3().f12627i.setTypeface(H4.j.f3824g.u());
                        this.f30073a.f3().f12627i.setVisibility(0);
                        this.f30073a.f3().f12623e.setVisibility(8);
                    }
                    this.f30073a.i3().r(false);
                    this.f30073a.f3().f12622d.f11842b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
            }
        }

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
            int i8 = this.f30071a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L h8 = UserCommentsActivity.this.i3().h();
                a aVar = new a(UserCommentsActivity.this);
                this.f30071a = 1;
                if (h8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30074a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ UserCommentsActivity f30076a;

            a(UserCommentsActivity userCommentsActivity) {
                this.f30076a = userCommentsActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    if (((K.c) cVar.a()).b() == 1) {
                        Q q8 = this.f30076a.f30064P;
                        if (q8 != null) {
                            q8.d(((K.c) cVar.a()).a());
                        }
                    } else {
                        Snackbar.make(this.f30076a.f3().f12624f, R.string.error_generico, -1).show();
                    }
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
            int i8 = this.f30074a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L k8 = UserCommentsActivity.this.i3().k();
                a aVar = new a(UserCommentsActivity.this);
                this.f30074a = 1;
                if (k8.collect(aVar, this) == e8) {
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

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f30077a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30077a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30078a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f30078a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30078a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30079a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30080b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30079a = function0;
            this.f30080b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30079a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30080b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0 f3() {
        return (x0) this.f30062N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g3() {
        CharSequence charSequence = (CharSequence) i3().m().getValue();
        if (charSequence != null && charSequence.length() != 0) {
            i3().r(true);
            i3().g(this);
        }
    }

    private final String h3() {
        Bundle extras;
        if (getIntent() != null && (extras = getIntent().getExtras()) != null && extras.containsKey("userID")) {
            return extras.getString("userID");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final H i3() {
        return (H) this.f30063O.getValue();
    }

    private final void j3() {
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            f3().f12625g.setNavigationIcon(drawable);
            f3().f12625g.setNavigationContentDescription(getString(R.string.back));
        }
        f3().f12625g.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.a4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                UserCommentsActivity.k3(UserCommentsActivity.this, view);
            }
        });
        TextView textView = f3().f12628j;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        f3().f12629k.setTypeface(aVar.t());
        f3().f12626h.setTypeface(aVar.u());
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, 1, false);
        f3().f12624f.addItemDecoration(new q5.r(dimension, dimension, dimension, dimension));
        f3().f12624f.setLayoutManager(linearLayoutManager);
        String str = null;
        f3().f12624f.setItemAnimator(null);
        f3().f12624f.addOnScrollListener(new b(linearLayoutManager, this));
        Object value = i3().m().getValue();
        a5.Q e8 = a5.Q.f14058k.e(this);
        if (e8 != null) {
            str = e8.getId();
        }
        if (AbstractC3255y.d(value, str)) {
            f3().f12623e.setVisibility(8);
        }
        g3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k3(UserCommentsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(f3().getRoot());
        i3().m().setValue(h3());
        j3();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new d(null), 2, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new e(null), 2, null);
    }
}
