package com.uptodown.activities;

import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.C1479f0;
import a5.C1641h;
import a5.K;
import a5.Q;
import a6.InterfaceC1668n;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.snackbar.Snackbar;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.ReviewsActivity;
import com.uptodown.activities.s;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3655A;
import o5.C3678r;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class ReviewsActivity extends AbstractActivityC2683a implements Z4.A {

    /* renamed from: R, reason: collision with root package name */
    public static final a f29829R = new a(null);

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29830N = O5.l.b(new b());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f29831O = new ViewModelLazy(U.b(s.class), new g(this), new f(this), new h(null, this));

    /* renamed from: P, reason: collision with root package name */
    private G4.B f29832P;

    /* renamed from: Q, reason: collision with root package name */
    private final ActivityResultLauncher f29833Q;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends AbstractC3256z implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1479f0 invoke() {
            return C1479f0.c(ReviewsActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29835a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReviewsActivity f29837a;

            a(ReviewsActivity reviewsActivity) {
                this.f29837a = reviewsActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (AbstractC3255y.d(abstractC3685y, AbstractC3685y.a.f36548a)) {
                    this.f29837a.r3().r(true);
                    if (this.f29837a.f29832P == null) {
                        this.f29837a.p3().f12229k.f11842b.setVisibility(0);
                    }
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    this.f29837a.r3().r(false);
                    if (this.f29837a.f29832P == null) {
                        this.f29837a.G3(((s.a) ((AbstractC3685y.c) abstractC3685y).a()).a());
                        this.f29837a.p3().f12232n.setAdapter(this.f29837a.f29832P);
                    } else {
                        Iterator it = ((s.a) ((AbstractC3685y.c) abstractC3685y).a()).a().iterator();
                        while (it.hasNext()) {
                            a5.K review = (a5.K) it.next();
                            G4.B b8 = this.f29837a.f29832P;
                            AbstractC3255y.f(b8);
                            AbstractC3255y.h(review, "review");
                            b8.a(review);
                        }
                    }
                    G4.B b9 = this.f29837a.f29832P;
                    if (b9 != null) {
                        b9.c(false);
                    }
                    this.f29837a.p3().f12229k.f11842b.setVisibility(8);
                } else {
                    AbstractC3255y.d(abstractC3685y, AbstractC3685y.b.f36549a);
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
            int i8 = this.f29835a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L f8 = ReviewsActivity.this.r3().f();
                a aVar = new a(ReviewsActivity.this);
                this.f29835a = 1;
                if (f8.collect(aVar, this) == e8) {
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
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29838a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReviewsActivity f29840a;

            a(ReviewsActivity reviewsActivity) {
                this.f29840a = reviewsActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (AbstractC3255y.d(abstractC3685y, AbstractC3685y.a.f36548a)) {
                    this.f29840a.r3().r(true);
                    this.f29840a.p3().f12229k.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    if (((s.b) cVar.a()).b() == 1) {
                        ReviewsActivity reviewsActivity = this.f29840a;
                        Toast.makeText(reviewsActivity, reviewsActivity.getString(R.string.review_sended), 0).show();
                        this.f29840a.p3().f12220b.setText("");
                        Bundle bundle = new Bundle();
                        bundle.putString(CampaignEx.JSON_KEY_STAR, String.valueOf(((Number) this.f29840a.r3().m().getValue()).intValue()));
                        Object value = this.f29840a.r3().e().getValue();
                        AbstractC3255y.f(value);
                        bundle.putString("packagename", ((C1641h) value).y0());
                        C3678r t22 = this.f29840a.t2();
                        if (t22 != null) {
                            t22.b("app_rated", bundle);
                        }
                    } else if (((s.b) cVar.a()).a() == 403) {
                        Toast.makeText(this.f29840a, R.string.email_validation_msg, 1).show();
                    } else if (((s.b) cVar.a()).b() == 0 && ((s.b) cVar.a()).a() == 0) {
                        Toast.makeText(this.f29840a, R.string.error_review_already_submitted, 1).show();
                    } else {
                        ReviewsActivity reviewsActivity2 = this.f29840a;
                        Toast.makeText(reviewsActivity2, reviewsActivity2.getString(R.string.error_generico), 0).show();
                    }
                } else {
                    AbstractC3255y.d(abstractC3685y, AbstractC3685y.b.f36549a);
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
            int i8 = this.f29838a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L n8 = ReviewsActivity.this.r3().n();
                a aVar = new a(ReviewsActivity.this);
                this.f29838a = 1;
                if (n8.collect(aVar, this) == e8) {
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
        int f29841a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReviewsActivity f29843a;

            a(ReviewsActivity reviewsActivity) {
                this.f29843a = reviewsActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (!AbstractC3255y.d(abstractC3685y, AbstractC3685y.a.f36548a)) {
                    if (abstractC3685y instanceof AbstractC3685y.c) {
                        AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                        if (((K.c) cVar.a()).b() == 1) {
                            G4.B b8 = this.f29843a.f29832P;
                            if (b8 != null) {
                                b8.d(((K.c) cVar.a()).a());
                            }
                        } else {
                            Snackbar.make(this.f29843a.p3().f12232n, R.string.error_generico, -1).show();
                        }
                    } else {
                        boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
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
            int i8 = this.f29841a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L l8 = ReviewsActivity.this.r3().l();
                a aVar = new a(ReviewsActivity.this);
                this.f29841a = 1;
                if (l8.collect(aVar, this) == e8) {
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
        final /* synthetic */ ComponentActivity f29844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.f29844a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29844a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29845a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f29845a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29845a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29846a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29847b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29846a = function0;
            this.f29847b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29846a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29847b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public ReviewsActivity() {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: D4.O2
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                ReviewsActivity.F3(ReviewsActivity.this, (ActivityResult) obj);
            }
        });
        AbstractC3255y.h(registerForActivityResult, "registerForActivityResul…        }\n        }\n    }");
        this.f29833Q = registerForActivityResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A3(ReviewsActivity this$0, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.r3().m().setValue(4);
            this$0.p3().f12222d.setImageDrawable(drawable);
            this$0.p3().f12223e.setImageDrawable(drawable);
            this$0.p3().f12224f.setImageDrawable(drawable);
            this$0.p3().f12225g.setImageDrawable(drawable);
            this$0.p3().f12226h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(ReviewsActivity this$0, Drawable drawable, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.r3().m().setValue(5);
            this$0.p3().f12222d.setImageDrawable(drawable);
            this$0.p3().f12223e.setImageDrawable(drawable);
            this$0.p3().f12224f.setImageDrawable(drawable);
            this$0.p3().f12225g.setImageDrawable(drawable);
            this$0.p3().f12226h.setImageDrawable(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(ReviewsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (!AbstractC3255y.d(this$0.r3().k().getValue(), "date")) {
            this$0.r3().k().setValue("date");
            this$0.p3().f12238t.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_blue_primary_button));
            this$0.p3().f12238t.setTextColor(ContextCompat.getColor(this$0, R.color.white));
            this$0.p3().f12237s.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.p3().f12237s.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.p3().f12239u.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.p3().f12239u.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.I3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(ReviewsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (!AbstractC3255y.d(this$0.r3().k().getValue(), "best")) {
            this$0.r3().k().setValue("best");
            this$0.p3().f12237s.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_blue_primary_button));
            this$0.p3().f12237s.setTextColor(ContextCompat.getColor(this$0, R.color.white));
            this$0.p3().f12238t.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.p3().f12238t.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.p3().f12239u.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.p3().f12239u.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.I3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(ReviewsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (!AbstractC3255y.d(this$0.r3().k().getValue(), "most")) {
            this$0.r3().k().setValue("most");
            this$0.p3().f12239u.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_blue_primary_button));
            this$0.p3().f12239u.setTextColor(ContextCompat.getColor(this$0, R.color.white));
            this$0.p3().f12237s.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.p3().f12237s.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.p3().f12238t.setBackground(ContextCompat.getDrawable(this$0, R.drawable.ripple_header_categories));
            this$0.p3().f12238t.setTextColor(ContextCompat.getColorStateList(this$0, R.color.selector_wizard_accept_button_text));
            this$0.I3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(ReviewsActivity this$0, ActivityResult activityResult) {
        String str;
        AbstractC3255y.i(this$0, "this$0");
        if (activityResult.getResultCode() == 1) {
            Q e8 = Q.f14058k.e(this$0);
            if (e8 != null) {
                str = e8.getId();
            } else {
                str = null;
            }
            if (str != null && e8.x(this$0)) {
                UptodownApp.a aVar = UptodownApp.f29058B;
                aVar.j0(this$0);
                aVar.i0(this$0);
                this$0.J3(this$0.p3().f12220b.getText().toString());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G3(ArrayList arrayList) {
        this.f29832P = new G4.B(arrayList, this, this);
    }

    private final void H3() {
        this.f29833Q.launch(new Intent(this, (Class<?>) LoginActivity.class), UptodownApp.f29058B.b(this));
    }

    private final void I3() {
        p3().f12232n.setAdapter(null);
        this.f29832P = null;
        r3().q(true);
        r3().s(0);
        q3();
    }

    private final void J3(String str) {
        int intValue = ((Number) r3().m().getValue()).intValue();
        if (1 <= intValue && intValue < 6) {
            r3().p(this, str);
        } else {
            Toast.makeText(this, getString(R.string.error_review_no_valoration), 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C1479f0 p3() {
        return (C1479f0) this.f29830N.getValue();
    }

    private final void q3() {
        if (r3().g()) {
            r3().d(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s r3() {
        return (s) this.f29831O.getValue();
    }

    private final void s3() {
        String str;
        String str2;
        String str3;
        String str4;
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            p3().f12233o.setNavigationIcon(drawable);
            p3().f12233o.setNavigationContentDescription(getString(R.string.back));
        }
        p3().f12233o.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.S2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.t3(ReviewsActivity.this, view);
            }
        });
        C3655A c3655a = C3655A.f36474a;
        C1641h c1641h = (C1641h) r3().e().getValue();
        String str5 = null;
        if (c1641h != null) {
            str = c1641h.y0();
        } else {
            str = null;
        }
        Drawable j8 = c3655a.j(this, str);
        if (j8 != null) {
            p3().f12221c.setImageDrawable(j8);
        } else {
            com.squareup.picasso.s h8 = com.squareup.picasso.s.h();
            C1641h c1641h2 = (C1641h) r3().e().getValue();
            if (c1641h2 != null) {
                str2 = c1641h2.m0();
            } else {
                str2 = null;
            }
            h8.l(str2).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f29058B.f0(this)).i(p3().f12221c);
        }
        TextView textView = p3().f12241w;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        p3().f12235q.setTypeface(aVar.t());
        TextView textView2 = p3().f12235q;
        C1641h c1641h3 = (C1641h) r3().e().getValue();
        if (c1641h3 != null) {
            str3 = c1641h3.s0();
        } else {
            str3 = null;
        }
        textView2.setText(str3);
        p3().f12236r.setTypeface(aVar.u());
        TextView textView3 = p3().f12236r;
        C1641h c1641h4 = (C1641h) r3().e().getValue();
        if (c1641h4 != null) {
            str4 = c1641h4.g1();
        } else {
            str4 = null;
        }
        textView3.setText(str4);
        p3().f12234p.setTypeface(aVar.u());
        TextView textView4 = p3().f12234p;
        C1641h c1641h5 = (C1641h) r3().e().getValue();
        if (c1641h5 != null) {
            str5 = c1641h5.p();
        }
        textView4.setText(str5);
        p3().f12220b.setTypeface(aVar.u());
        p3().f12240v.setTypeface(aVar.t());
        p3().f12240v.setOnClickListener(new View.OnClickListener() { // from class: D4.V2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.u3(ReviewsActivity.this, view);
            }
        });
        final Drawable drawable2 = ContextCompat.getDrawable(this, R.drawable.vector_star_on);
        final Drawable drawable3 = ContextCompat.getDrawable(this, R.drawable.vector_star_off);
        if (r3().i().getValue() != null) {
            Object value = r3().i().getValue();
            AbstractC3255y.f(value);
            if (((a5.K) value).s() >= 1) {
                p3().f12222d.setImageDrawable(drawable2);
            }
            Object value2 = r3().i().getValue();
            AbstractC3255y.f(value2);
            if (((a5.K) value2).s() >= 2) {
                p3().f12223e.setImageDrawable(drawable2);
            }
            Object value3 = r3().i().getValue();
            AbstractC3255y.f(value3);
            if (((a5.K) value3).s() >= 3) {
                p3().f12224f.setImageDrawable(drawable2);
            }
            Object value4 = r3().i().getValue();
            AbstractC3255y.f(value4);
            if (((a5.K) value4).s() >= 4) {
                p3().f12225g.setImageDrawable(drawable2);
            }
            Object value5 = r3().i().getValue();
            AbstractC3255y.f(value5);
            if (((a5.K) value5).s() == 5) {
                p3().f12226h.setImageDrawable(drawable2);
            }
            Object value6 = r3().i().getValue();
            AbstractC3255y.f(value6);
            String u8 = ((a5.K) value6).u();
            if (u8 != null && u8.length() != 0) {
                EditText editText = p3().f12220b;
                Object value7 = r3().i().getValue();
                AbstractC3255y.f(value7);
                editText.setText(String.valueOf(((a5.K) value7).u()));
            }
            p3().f12240v.setText(getString(R.string.edit_your_review));
        }
        p3().f12222d.setOnClickListener(new View.OnClickListener() { // from class: D4.W2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.x3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        p3().f12223e.setOnClickListener(new View.OnClickListener() { // from class: D4.X2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.y3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        p3().f12224f.setOnClickListener(new View.OnClickListener() { // from class: D4.Y2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.z3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        p3().f12225g.setOnClickListener(new View.OnClickListener() { // from class: D4.Z2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.A3(ReviewsActivity.this, drawable2, drawable3, view);
            }
        });
        p3().f12226h.setOnClickListener(new View.OnClickListener() { // from class: D4.a3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.B3(ReviewsActivity.this, drawable2, view);
            }
        });
        p3().f12238t.setTypeface(aVar.t());
        p3().f12238t.setOnClickListener(new View.OnClickListener() { // from class: D4.P2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.C3(ReviewsActivity.this, view);
            }
        });
        p3().f12237s.setTypeface(aVar.t());
        p3().f12237s.setOnClickListener(new View.OnClickListener() { // from class: D4.Q2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.D3(ReviewsActivity.this, view);
            }
        });
        p3().f12239u.setTypeface(aVar.t());
        p3().f12239u.setOnClickListener(new View.OnClickListener() { // from class: D4.R2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.E3(ReviewsActivity.this, view);
            }
        });
        p3().f12232n.setLayoutManager(new LinearLayoutManager(this, 1, false));
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        p3().f12232n.addItemDecoration(new q5.r(dimension, dimension, dimension, dimension));
        p3().f12230l.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() { // from class: D4.T2
            @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
            public final void onScrollChange(NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11) {
                ReviewsActivity.v3(ReviewsActivity.this, nestedScrollView, i8, i9, i10, i11);
            }
        });
        p3().f12229k.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.U2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReviewsActivity.w3(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(ReviewsActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(ReviewsActivity this$0, View view) {
        String str;
        AbstractC3255y.i(this$0, "this$0");
        Object systemService = this$0.getSystemService("input_method");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this$0.p3().f12220b.getWindowToken(), 0);
        this$0.p3().f12220b.clearFocus();
        Q e8 = Q.f14058k.e(this$0);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            Editable text = this$0.p3().f12220b.getText();
            AbstractC3255y.h(text, "binding.etReview.text");
            this$0.J3(j6.n.M0(text).toString());
            return;
        }
        this$0.H3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v3(ReviewsActivity this$0, NestedScrollView v8, int i8, int i9, int i10, int i11) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(v8, "v");
        if (i9 == v8.getChildAt(0).getMeasuredHeight() - v8.getMeasuredHeight() && !this$0.r3().h() && this$0.r3().g()) {
            this$0.r3().r(true);
            G4.B b8 = this$0.f29832P;
            if (b8 != null) {
                b8.c(true);
            }
            this$0.q3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w3(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x3(ReviewsActivity this$0, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.r3().m().setValue(1);
            this$0.p3().f12222d.setImageDrawable(drawable);
            this$0.p3().f12223e.setImageDrawable(drawable2);
            this$0.p3().f12224f.setImageDrawable(drawable2);
            this$0.p3().f12225g.setImageDrawable(drawable2);
            this$0.p3().f12226h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y3(ReviewsActivity this$0, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.r3().m().setValue(2);
            this$0.p3().f12222d.setImageDrawable(drawable);
            this$0.p3().f12223e.setImageDrawable(drawable);
            this$0.p3().f12224f.setImageDrawable(drawable2);
            this$0.p3().f12225g.setImageDrawable(drawable2);
            this$0.p3().f12226h.setImageDrawable(drawable2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z3(ReviewsActivity this$0, Drawable drawable, Drawable drawable2, View view) {
        AbstractC3255y.i(this$0, "this$0");
        if (UptodownApp.f29058B.a0()) {
            this$0.r3().m().setValue(3);
            this$0.p3().f12222d.setImageDrawable(drawable);
            this$0.p3().f12223e.setImageDrawable(drawable);
            this$0.p3().f12224f.setImageDrawable(drawable);
            this$0.p3().f12225g.setImageDrawable(drawable2);
            this$0.p3().f12226h.setImageDrawable(drawable2);
        }
    }

    @Override // Z4.A
    public void b(int i8) {
        a5.K k8;
        ArrayList b8;
        G4.B b9 = this.f29832P;
        if (b9 != null && (b8 = b9.b()) != null) {
            k8 = (a5.K) b8.get(i8);
        } else {
            k8 = null;
        }
        if (UptodownApp.f29058B.a0() && k8 != null && !C3655A.f36474a.i(k8.l())) {
            r3().o(this, k8);
        }
    }

    @Override // Z4.A
    public void d(int i8) {
        a5.K k8;
        ArrayList b8;
        G4.B b9 = this.f29832P;
        if (b9 != null && (b8 = b9.b()) != null) {
            k8 = (a5.K) b8.get(i8);
        } else {
            k8 = null;
        }
        Intent intent = new Intent(this, (Class<?>) UserCommentsActivity.class);
        if (k8 != null) {
            intent.putExtra("userID", k8.x());
        }
        startActivity(intent, UptodownApp.f29058B.a(this));
    }

    @Override // Z4.A
    public void f(int i8) {
        a5.K k8;
        ArrayList b8;
        G4.B b9 = this.f29832P;
        String str = null;
        if (b9 != null && (b8 = b9.b()) != null) {
            k8 = (a5.K) b8.get(i8);
        } else {
            k8 = null;
        }
        Intent intent = new Intent(this, (Class<?>) RepliesActivity.class);
        intent.putExtra("review", k8);
        C1641h c1641h = (C1641h) r3().e().getValue();
        if (c1641h != null) {
            str = c1641h.s0();
        }
        if (str != null && str.length() != 0) {
            Object value = r3().e().getValue();
            AbstractC3255y.f(value);
            intent.putExtra("appName", ((C1641h) value).s0());
        }
        startActivity(intent, UptodownApp.f29058B.a(this));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        super.onCreate(bundle);
        setContentView(p3().getRoot());
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("appInfo")) {
                o6.w e8 = r3().e();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = extras.getParcelable("appInfo", C1641h.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    parcelable3 = extras.getParcelable("appInfo");
                }
                AbstractC3255y.f(parcelable3);
                e8.setValue(parcelable3);
            }
            if (extras.containsKey("myReview")) {
                o6.w i8 = r3().i();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("myReview", a5.K.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("myReview");
                }
                i8.setValue(parcelable);
                if (r3().i().getValue() != null) {
                    o6.w m8 = r3().m();
                    Object value = r3().i().getValue();
                    AbstractC3255y.f(value);
                    m8.setValue(Integer.valueOf(((a5.K) value).s()));
                }
            }
        }
        s3();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new c(null), 2, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new d(null), 2, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new e(null), 2, null);
        q3();
    }
}
