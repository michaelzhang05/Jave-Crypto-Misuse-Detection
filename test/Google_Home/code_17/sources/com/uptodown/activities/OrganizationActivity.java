package com.uptodown.activities;

import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import Z4.InterfaceC1590d;
import a5.C1629A;
import a5.C1641h;
import a5.C1648o;
import a6.InterfaceC1668n;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.OrganizationActivity;
import com.uptodown.activities.q;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3671k;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class OrganizationActivity extends AbstractActivityC2683a {

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29764N = O5.l.b(new a());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f29765O = new ViewModelLazy(U.b(q.class), new e(this), new d(this), new f(null, this));

    /* renamed from: P, reason: collision with root package name */
    private G4.w f29766P;

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final W4.U invoke() {
            return W4.U.c(OrganizationActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements InterfaceC1590d {
        b() {
        }

        @Override // Z4.InterfaceC1590d
        public void b(C1641h app) {
            AbstractC3255y.i(app, "app");
            if (UptodownApp.f29058B.a0()) {
                OrganizationActivity.this.F2(app.i());
            }
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29769a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ OrganizationActivity f29771a;

            a(OrganizationActivity organizationActivity) {
                this.f29771a = organizationActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                G4.w wVar;
                if (AbstractC3255y.d(abstractC3685y, AbstractC3685y.a.f36548a)) {
                    if (this.f29771a.f29766P == null) {
                        this.f29771a.l3().f11993g.f11842b.setVisibility(0);
                    }
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    if (!((q.a) cVar.a()).a()) {
                        this.f29771a.n3(((q.a) cVar.a()).b());
                        this.f29771a.k3(((q.a) cVar.a()).b());
                    } else {
                        G4.w wVar2 = this.f29771a.f29766P;
                        AbstractC3255y.f(wVar2);
                        wVar2.a(((q.a) cVar.a()).b().i());
                    }
                    this.f29771a.l3().f11993g.f11842b.setVisibility(8);
                    this.f29771a.l3().f11997k.setVisibility(0);
                    G4.w wVar3 = this.f29771a.f29766P;
                    if (wVar3 != null) {
                        wVar3.c(false);
                    }
                } else if (AbstractC3255y.d(abstractC3685y, AbstractC3685y.b.f36549a) && (wVar = this.f29771a.f29766P) != null) {
                    wVar.c(false);
                }
                return O5.I.f8278a;
            }
        }

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
            int i8 = this.f29769a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L h8 = OrganizationActivity.this.m3().h();
                a aVar = new a(OrganizationActivity.this);
                this.f29769a = 1;
                if (h8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29772a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ComponentActivity componentActivity) {
            super(0);
            this.f29772a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29772a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29773a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.f29773a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29773a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class f extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29774a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29775b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29774a = function0;
            this.f29775b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29774a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29775b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29776a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C1648o f29777b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ OrganizationActivity f29778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(C1648o c1648o, OrganizationActivity organizationActivity, S5.d dVar) {
            super(2, dVar);
            this.f29777b = c1648o;
            this.f29778c = organizationActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new g(this.f29777b, this.f29778c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String Y7;
            T5.b.e();
            if (this.f29776a == 0) {
                O5.t.b(obj);
                C1648o c1648o = this.f29777b;
                if (c1648o != null && (Y7 = c1648o.Y()) != null && Y7.length() != 0 && this.f29778c.f29766P != null) {
                    G4.w wVar = this.f29778c.f29766P;
                    AbstractC3255y.f(wVar);
                    String Y8 = this.f29777b.Y();
                    AbstractC3255y.f(Y8);
                    RecyclerView recyclerView = this.f29778c.l3().f11996j;
                    AbstractC3255y.h(recyclerView, "binding.rvOrganization");
                    wVar.d(Y8, recyclerView);
                }
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k3(C1629A c1629a) {
        String j8;
        if (this.f29766P == null && (j8 = c1629a.j()) != null && j8.length() != 0) {
            b bVar = new b();
            String j9 = c1629a.j();
            AbstractC3255y.f(j9);
            this.f29766P = new G4.w(bVar, j9);
            l3().f11996j.setAdapter(this.f29766P);
        }
        G4.w wVar = this.f29766P;
        if (wVar != null) {
            wVar.b(c1629a.h(), c1629a.f(), c1629a.b(), c1629a.i());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final W4.U l3() {
        return (W4.U) this.f29764N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q m3() {
        return (q) this.f29765O.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n3(final C1629A c1629a) {
        String a8;
        String e8;
        if (!m3().l()) {
            final W4.U l32 = l3();
            l32.f12002p.setText(c1629a.j());
            String c8 = c1629a.c();
            if (c8 != null && c8.length() != 0 && (a8 = c1629a.a()) != null && a8.length() != 0 && (e8 = c1629a.e()) != null && e8.length() != 0) {
                String c9 = c1629a.c();
                if (c9 != null && c9.length() != 0) {
                    com.squareup.picasso.s.h().l(c1629a.d()).n(UptodownApp.f29058B.e0(this)).i(l32.f11988b);
                }
                String e9 = c1629a.e();
                if (e9 != null && e9.length() != 0) {
                    com.squareup.picasso.s.h().l(c1629a.e()).n(UptodownApp.f29058B.f0(this)).i(l32.f11990d);
                }
                TextView textView = l32.f12000n;
                j.a aVar = H4.j.f3824g;
                textView.setTypeface(aVar.t());
                l32.f12000n.setText(c1629a.j());
                l32.f12003q.setTypeface(aVar.t());
                l32.f12003q.setOnClickListener(new View.OnClickListener() { // from class: D4.w2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OrganizationActivity.o3(C1629A.this, this, view);
                    }
                });
                String l8 = c1629a.l();
                if (l8 != null && l8.length() != 0) {
                    l32.f11992f.setVisibility(0);
                    l32.f11992f.setOnClickListener(new View.OnClickListener() { // from class: D4.x2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OrganizationActivity.p3(OrganizationActivity.this, c1629a, view);
                        }
                    });
                }
                String g8 = c1629a.g();
                if (g8 != null && g8.length() != 0) {
                    l32.f11989c.setVisibility(0);
                    l32.f11989c.setOnClickListener(new View.OnClickListener() { // from class: D4.y2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OrganizationActivity.q3(OrganizationActivity.this, c1629a, view);
                        }
                    });
                }
                String k8 = c1629a.k();
                if (k8 != null && k8.length() != 0) {
                    l32.f11991e.setVisibility(0);
                    l32.f11991e.setOnClickListener(new View.OnClickListener() { // from class: D4.z2
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            OrganizationActivity.r3(OrganizationActivity.this, c1629a, view);
                        }
                    });
                }
                l32.f11999m.setTypeface(aVar.u());
                l32.f11999m.setText(c1629a.a());
                l32.f12001o.setTypeface(aVar.t());
                l32.f12001o.setOnClickListener(new View.OnClickListener() { // from class: D4.A2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        OrganizationActivity.s3(C1629A.this, l32, view);
                    }
                });
            } else {
                l3().f11995i.setVisibility(8);
            }
            m3().o(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o3(C1629A organization, OrganizationActivity this$0, View view) {
        AbstractC3255y.i(organization, "$organization");
        AbstractC3255y.i(this$0, "this$0");
        if (organization.m() != null) {
            C3671k c3671k = new C3671k();
            String m8 = organization.m();
            AbstractC3255y.f(m8);
            c3671k.q(this$0, m8, organization.j());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p3(OrganizationActivity this$0, C1629A organization, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(organization, "$organization");
        if (!this$0.isFinishing()) {
            C3671k c3671k = new C3671k();
            String l8 = organization.l();
            AbstractC3255y.f(l8);
            C3671k.r(c3671k, this$0, l8, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q3(OrganizationActivity this$0, C1629A organization, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(organization, "$organization");
        if (!this$0.isFinishing()) {
            C3671k c3671k = new C3671k();
            String g8 = organization.g();
            AbstractC3255y.f(g8);
            C3671k.r(c3671k, this$0, g8, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r3(OrganizationActivity this$0, C1629A organization, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(organization, "$organization");
        if (!this$0.isFinishing()) {
            C3671k c3671k = new C3671k();
            String k8 = organization.k();
            AbstractC3255y.f(k8);
            C3671k.r(c3671k, this$0, k8, null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(C1629A organization, W4.U this_with, View view) {
        AbstractC3255y.i(organization, "$organization");
        AbstractC3255y.i(this_with, "$this_with");
        String a8 = organization.a();
        if (a8 != null && a8.length() != 0) {
            if (this_with.f12004r.getVisibility() == 0) {
                this_with.f12001o.setText(R.string.read_less_desc_app_detail);
                this_with.f12004r.setVisibility(8);
                this_with.f11999m.setMaxLines(Integer.MAX_VALUE);
                this_with.f11999m.setEllipsize(null);
                return;
            }
            this_with.f12001o.setText(R.string.read_more_desc_app_detail);
            this_with.f12004r.setVisibility(0);
            this_with.f11999m.setMaxLines(6);
            this_with.f11999m.setEllipsize(TextUtils.TruncateAt.END);
        }
    }

    private final void t3() {
        setContentView(l3().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        final W4.U l32 = l3();
        if (drawable != null) {
            l32.f11998l.setNavigationIcon(drawable);
            l32.f11998l.setNavigationContentDescription(getString(R.string.back));
        }
        l32.f11998l.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.u2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OrganizationActivity.u3(OrganizationActivity.this, view);
            }
        });
        l32.f12002p.setTypeface(H4.j.f3824g.t());
        l32.f11996j.setLayoutManager(new LinearLayoutManager(this, 1, false));
        l32.f11996j.setItemAnimator(null);
        if (((CharSequence) m3().k().getValue()).length() > 0) {
            l32.f12002p.setText((CharSequence) m3().k().getValue());
        }
        l32.f11997k.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: D4.v2
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                OrganizationActivity.v3(OrganizationActivity.this, l32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(OrganizationActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(OrganizationActivity this$0, W4.U this_with) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(this_with, "$this_with");
        if (!this$0.m3().i() && !this$0.m3().g()) {
            ScrollView scrollView = this_with.f11997k;
            if (scrollView.getChildAt(scrollView.getChildCount() - 1).getBottom() - (this_with.f11997k.getHeight() + this_with.f11997k.getScrollY()) <= 0 && !this$0.m3().i() && !this$0.m3().g()) {
                G4.w wVar = this$0.f29766P;
                if (wVar != null) {
                    wVar.c(true);
                }
                this$0.x3();
            }
        }
    }

    private final void w3() {
        m3().e(this);
    }

    private final void x3() {
        m3().f(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("organizationID")) {
                m3().j().setValue(Long.valueOf(extras.getLong("organizationID")));
            }
            if (extras.containsKey("organizationName")) {
                o6.w k8 = m3().k();
                String string = extras.getString("organizationName");
                AbstractC3255y.f(string);
                k8.setValue(string);
            }
        }
        t3();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new c(null), 2, null);
        w3();
    }

    public final void y3(C1648o c1648o) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new g(c1648o, this, null), 2, null);
    }
}
