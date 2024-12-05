package com.uptodown.activities;

import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import W4.C1473c0;
import a5.K;
import a5.Q;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.snackbar.Snackbar;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.RepliesActivity;
import com.uptodown.activities.preferences.SettingsPreferences;
import com.uptodown.activities.r;
import com.uptodown.util.views.UsernameTextView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3655A;
import o5.C3671k;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class RepliesActivity extends AbstractActivityC2683a {

    /* renamed from: P, reason: collision with root package name */
    private G4.A f29809P;

    /* renamed from: N, reason: collision with root package name */
    private final InterfaceC1355k f29807N = O5.l.b(new a());

    /* renamed from: O, reason: collision with root package name */
    private final InterfaceC1355k f29808O = new ViewModelLazy(U.b(r.class), new h(this), new g(this), new i(null, this));

    /* renamed from: Q, reason: collision with root package name */
    private final f f29810Q = new f();

    /* loaded from: classes4.dex */
    static final class a extends AbstractC3256z implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C1473c0 invoke() {
            return C1473c0.c(RepliesActivity.this.getLayoutInflater());
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29812a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f29814a;

            a(RepliesActivity repliesActivity) {
                this.f29814a = repliesActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f29814a.n3().f12131d.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    if (!((r.a) cVar.a()).a().isEmpty()) {
                        RepliesActivity repliesActivity = this.f29814a;
                        ArrayList a8 = ((r.a) cVar.a()).a();
                        Context applicationContext = this.f29814a.getApplicationContext();
                        AbstractC3255y.h(applicationContext, "applicationContext");
                        repliesActivity.f29809P = new G4.A(a8, applicationContext, this.f29814a.f29810Q);
                        this.f29814a.n3().f12137j.setAdapter(this.f29814a.f29809P);
                    } else {
                        this.f29814a.n3().f12140m.setVisibility(0);
                    }
                    this.f29814a.n3().f12133f.setVisibility(0);
                    this.f29814a.n3().f12131d.f11842b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
            }
        }

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
            int i8 = this.f29812a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L g8 = RepliesActivity.this.p3().g();
                a aVar = new a(RepliesActivity.this);
                this.f29812a = 1;
                if (g8.collect(aVar, this) == e8) {
                    return e8;
                }
            }
            throw new C1352h();
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f29815a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f29817a;

            a(RepliesActivity repliesActivity) {
                this.f29817a = repliesActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (!AbstractC3255y.d(abstractC3685y, AbstractC3685y.a.f36548a)) {
                    if (abstractC3685y instanceof AbstractC3685y.c) {
                        AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                        if (((K.c) cVar.a()).b() == 1) {
                            this.f29817a.n3().f12134g.f12159p.setText(String.valueOf(((K.c) cVar.a()).a().p()));
                        } else {
                            Snackbar.make(this.f29817a.n3().f12137j, R.string.error_generico, -1).show();
                        }
                    } else {
                        boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                    }
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
            int i8 = this.f29815a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L i9 = RepliesActivity.this.p3().i();
                a aVar = new a(RepliesActivity.this);
                this.f29815a = 1;
                if (i9.collect(aVar, this) == e8) {
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
        int f29818a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f29820a;

            a(RepliesActivity repliesActivity) {
                this.f29820a = repliesActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (!AbstractC3255y.d(abstractC3685y, AbstractC3685y.a.f36548a)) {
                    if (abstractC3685y instanceof AbstractC3685y.c) {
                        AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                        if (((r.b) cVar.a()).a() == 1) {
                            G4.A a8 = this.f29820a.f29809P;
                            if (a8 != null) {
                                a8.c(((r.b) cVar.a()).b());
                            }
                        } else {
                            Snackbar.make(this.f29820a.n3().f12137j, R.string.error_generico, -1).show();
                        }
                    } else {
                        boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                    }
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
            int i8 = this.f29818a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L h8 = RepliesActivity.this.p3().h();
                a aVar = new a(RepliesActivity.this);
                this.f29818a = 1;
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
        int f29821a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ RepliesActivity f29823a;

            a(RepliesActivity repliesActivity) {
                this.f29823a = repliesActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (!AbstractC3255y.d(abstractC3685y, AbstractC3685y.a.f36548a)) {
                    if (abstractC3685y instanceof AbstractC3685y.c) {
                        AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                        if (((r.c) cVar.a()).c() == 1) {
                            a5.K k8 = new a5.K();
                            Q e8 = Q.f14058k.e(this.f29823a);
                            if (e8 != null) {
                                k8.g0(e8.s());
                                k8.Y(e8.h());
                            }
                            k8.c0(((r.c) cVar.a()).d());
                            this.f29823a.n3().f12129b.setText("");
                            RepliesActivity repliesActivity = this.f29823a;
                            Toast.makeText(repliesActivity, repliesActivity.getString(R.string.review_sended), 1).show();
                        } else if (((r.c) cVar.a()).b() == 401) {
                            this.f29823a.w3();
                        } else if (((r.c) cVar.a()).b() == 403) {
                            Toast.makeText(this.f29823a, R.string.email_validation_msg, 1).show();
                        } else {
                            Toast.makeText(this.f29823a, ((r.c) cVar.a()).a(), 1).show();
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
            int i8 = this.f29821a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L k8 = RepliesActivity.this.p3().k();
                a aVar = new a(RepliesActivity.this);
                this.f29821a = 1;
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
    public static final class f implements Z4.z {
        f() {
        }

        @Override // Z4.z
        public void a(String userID) {
            AbstractC3255y.i(userID, "userID");
            RepliesActivity.this.z3(userID);
        }

        @Override // Z4.z
        public void b(a5.G reply) {
            AbstractC3255y.i(reply, "reply");
            if (UptodownApp.f29058B.a0()) {
                if (!C3655A.f36474a.h(reply.g())) {
                    RepliesActivity.this.p3().m(RepliesActivity.this, reply);
                } else {
                    Snackbar.make(RepliesActivity.this.n3().f12137j, R.string.review_already_liked, -1).show();
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class g extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29825a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.f29825a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f29825a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class h extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29826a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f29826a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f29826a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f29827a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f29828b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f29827a = function0;
            this.f29828b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f29827a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f29828b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    private final void A3(final a5.K k8) {
        if (k8.H()) {
            n3().f12135h.f12201l.setVisibility(8);
            n3().f12135h.f12200k.setOnClickListener(new View.OnClickListener() { // from class: D4.I2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RepliesActivity.B3(RepliesActivity.this, k8, view);
                }
            });
            if (C3655A.f36474a.i(k8.l())) {
                n3().f12135h.f12193d.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_heart_red));
            }
            TextView textView = n3().f12135h.f12205p;
            j.a aVar = H4.j.f3824g;
            textView.setTypeface(aVar.u());
            n3().f12135h.f12205p.setText(String.valueOf(k8.p()));
            n3().f12135h.f12194e.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            n3().f12135h.f12195f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            n3().f12135h.f12196g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            n3().f12135h.f12197h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            n3().f12135h.f12198i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off_turbo));
            if (k8.s() >= 2) {
                n3().f12135h.f12195f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (k8.s() >= 3) {
                n3().f12135h.f12196g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (k8.s() >= 4) {
                n3().f12135h.f12197h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            if (k8.s() == 5) {
                n3().f12135h.f12198i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on_turbo));
            }
            n3().f12135h.f12209t.setTypeface(aVar.t());
            n3().f12135h.f12204o.setTypeface(aVar.u());
            n3().f12135h.f12203n.setTypeface(aVar.u());
            n3().f12135h.f12206q.setTypeface(aVar.u());
            Q.b bVar = Q.f14058k;
            String c8 = bVar.c(k8.i());
            if (c8 != null && c8.length() != 0) {
                com.squareup.picasso.s.h().l(bVar.c(k8.i())).n(UptodownApp.f29058B.f0(this)).i(n3().f12135h.f12192c);
            } else {
                com.squareup.picasso.s.h().j(R.drawable.vector_user_default).n(UptodownApp.f29058B.f0(this)).i(n3().f12135h.f12192c);
            }
            String y8 = k8.y();
            if (y8 != null && y8.length() != 0) {
                n3().f12135h.f12209t.setText(k8.y());
                UsernameTextView.a aVar2 = UsernameTextView.f31022k;
                UsernameTextView usernameTextView = n3().f12135h.f12209t;
                AbstractC3255y.h(usernameTextView, "binding.reviewTurbo.tvUsernameReview");
                aVar2.a(usernameTextView, k8.H(), k8.z());
            } else {
                CharSequence charSequence = (CharSequence) p3().l().getValue();
                if (charSequence != null && charSequence.length() != 0) {
                    n3().f12135h.f12209t.setText((CharSequence) p3().l().getValue());
                    UsernameTextView.a aVar3 = UsernameTextView.f31022k;
                    UsernameTextView usernameTextView2 = n3().f12135h.f12209t;
                    AbstractC3255y.h(usernameTextView2, "binding.reviewTurbo.tvUsernameReview");
                    aVar3.a(usernameTextView2, k8.H(), k8.z());
                }
            }
            String w8 = k8.w();
            if (w8 != null && w8.length() != 0) {
                n3().f12135h.f12204o.setText(k8.w());
            }
            String u8 = k8.u();
            if (u8 != null && u8.length() != 0) {
                n3().f12135h.f12203n.setMaxLines(Integer.MAX_VALUE);
                TextView textView2 = n3().f12135h.f12203n;
                Spanned v8 = k8.v();
                textView2.setText(v8 != null ? j6.n.M0(v8) : null);
                if (k8.a() == 1) {
                    TextView textView3 = n3().f12135h.f12206q;
                    Y y9 = Y.f34167a;
                    String string = getString(R.string.replies_counter_single);
                    AbstractC3255y.h(string, "getString(R.string.replies_counter_single)");
                    String format = String.format(string, Arrays.copyOf(new Object[0], 0));
                    AbstractC3255y.h(format, "format(...)");
                    textView3.setText(format);
                } else if (k8.a() > 1) {
                    TextView textView4 = n3().f12135h.f12206q;
                    Y y10 = Y.f34167a;
                    String string2 = getString(R.string.replies_counter_multiple);
                    AbstractC3255y.h(string2, "getString(R.string.replies_counter_multiple)");
                    String format2 = String.format(string2, Arrays.copyOf(new Object[]{String.valueOf(k8.a())}, 1));
                    AbstractC3255y.h(format2, "format(...)");
                    textView4.setText(format2);
                }
            } else {
                n3().f12135h.f12203n.setVisibility(8);
            }
            if (k8.h() == 1) {
                n3().f12135h.f12191b.setVisibility(0);
            }
            String x8 = k8.x();
            if (x8 != null && x8.length() != 0) {
                n3().f12135h.f12209t.setOnClickListener(new View.OnClickListener() { // from class: D4.J2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RepliesActivity.C3(RepliesActivity.this, k8, view);
                    }
                });
                n3().f12135h.f12192c.setOnClickListener(new View.OnClickListener() { // from class: D4.K2
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        RepliesActivity.D3(RepliesActivity.this, k8, view);
                    }
                });
            }
            n3().f12135h.f12199j.setVisibility(0);
            C3671k.a aVar4 = C3671k.f36498a;
            ImageView imageView = n3().f12135h.f12192c;
            AbstractC3255y.h(imageView, "binding.reviewTurbo.ivAvatarReview");
            aVar4.a(imageView);
            n3().f12135h.getRoot().setVisibility(0);
            n3().f12134g.getRoot().setVisibility(8);
            return;
        }
        n3().f12134g.f12155l.setVisibility(8);
        n3().f12134g.f12154k.setOnClickListener(new View.OnClickListener() { // from class: D4.L2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.E3(RepliesActivity.this, k8, view);
            }
        });
        if (C3655A.f36474a.i(k8.l())) {
            n3().f12134g.f12147d.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_heart_red));
        }
        TextView textView5 = n3().f12134g.f12159p;
        j.a aVar5 = H4.j.f3824g;
        textView5.setTypeface(aVar5.u());
        n3().f12134g.f12159p.setText(String.valueOf(k8.p()));
        n3().f12134g.f12148e.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        n3().f12134g.f12149f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        n3().f12134g.f12150g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        n3().f12134g.f12151h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        n3().f12134g.f12152i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_off));
        if (k8.s() >= 2) {
            n3().f12134g.f12149f.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (k8.s() >= 3) {
            n3().f12134g.f12150g.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (k8.s() >= 4) {
            n3().f12134g.f12151h.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        if (k8.s() == 5) {
            n3().f12134g.f12152i.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.vector_star_on));
        }
        n3().f12134g.f12163t.setTypeface(aVar5.t());
        n3().f12134g.f12158o.setTypeface(aVar5.u());
        n3().f12134g.f12157n.setTypeface(aVar5.u());
        n3().f12134g.f12160q.setTypeface(aVar5.u());
        Q.b bVar2 = Q.f14058k;
        String c9 = bVar2.c(k8.i());
        if (c9 != null && c9.length() != 0) {
            com.squareup.picasso.s.h().l(bVar2.c(k8.i())).n(UptodownApp.f29058B.f0(this)).i(n3().f12134g.f12146c);
        } else {
            com.squareup.picasso.s.h().j(R.drawable.vector_user_default).n(UptodownApp.f29058B.f0(this)).i(n3().f12134g.f12146c);
        }
        String y11 = k8.y();
        if (y11 != null && y11.length() != 0) {
            n3().f12134g.f12163t.setText(k8.y());
            UsernameTextView.a aVar6 = UsernameTextView.f31022k;
            UsernameTextView usernameTextView3 = n3().f12134g.f12163t;
            AbstractC3255y.h(usernameTextView3, "binding.review.tvUsernameReview");
            aVar6.a(usernameTextView3, k8.H(), k8.z());
        } else {
            CharSequence charSequence2 = (CharSequence) p3().l().getValue();
            if (charSequence2 != null && charSequence2.length() != 0) {
                n3().f12134g.f12163t.setText((CharSequence) p3().l().getValue());
                UsernameTextView.a aVar7 = UsernameTextView.f31022k;
                UsernameTextView usernameTextView4 = n3().f12134g.f12163t;
                AbstractC3255y.h(usernameTextView4, "binding.review.tvUsernameReview");
                aVar7.a(usernameTextView4, k8.H(), k8.z());
            }
        }
        String w9 = k8.w();
        if (w9 != null && w9.length() != 0) {
            n3().f12134g.f12158o.setText(k8.w());
        }
        String u9 = k8.u();
        if (u9 != null && u9.length() != 0) {
            TextView textView6 = n3().f12134g.f12157n;
            Spanned v9 = k8.v();
            textView6.setText(v9 != null ? j6.n.M0(v9) : null);
            if (k8.a() == 1) {
                TextView textView7 = n3().f12134g.f12160q;
                Y y12 = Y.f34167a;
                String string3 = getString(R.string.replies_counter_single);
                AbstractC3255y.h(string3, "getString(R.string.replies_counter_single)");
                String format3 = String.format(string3, Arrays.copyOf(new Object[0], 0));
                AbstractC3255y.h(format3, "format(...)");
                textView7.setText(format3);
            } else if (k8.a() > 1) {
                TextView textView8 = n3().f12134g.f12160q;
                Y y13 = Y.f34167a;
                String string4 = getString(R.string.replies_counter_multiple);
                AbstractC3255y.h(string4, "getString(R.string.replies_counter_multiple)");
                String format4 = String.format(string4, Arrays.copyOf(new Object[]{String.valueOf(k8.a())}, 1));
                AbstractC3255y.h(format4, "format(...)");
                textView8.setText(format4);
            }
        } else {
            n3().f12134g.f12157n.setVisibility(8);
        }
        if (k8.h() == 1) {
            n3().f12134g.f12145b.setVisibility(0);
        }
        String x9 = k8.x();
        if (x9 == null || x9.length() == 0) {
            return;
        }
        n3().f12134g.f12163t.setOnClickListener(new View.OnClickListener() { // from class: D4.M2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.F3(RepliesActivity.this, k8, view);
            }
        });
        n3().f12134g.f12146c.setOnClickListener(new View.OnClickListener() { // from class: D4.N2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.G3(RepliesActivity.this, k8, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B3(RepliesActivity this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        if (UptodownApp.f29058B.a0()) {
            ImageView imageView = this$0.n3().f12135h.f12193d;
            AbstractC3255y.h(imageView, "binding.reviewTurbo.ivLikesCounterReview");
            q5.k.a(this$0, imageView);
            if (!C3655A.f36474a.i(review.l())) {
                this$0.p3().n(this$0, review);
                this$0.n3().f12135h.f12205p.setText(String.valueOf(review.p() + 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C3(RepliesActivity this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        String x8 = review.x();
        AbstractC3255y.f(x8);
        this$0.z3(x8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D3(RepliesActivity this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        String x8 = review.x();
        AbstractC3255y.f(x8);
        this$0.z3(x8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E3(RepliesActivity this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        if (UptodownApp.f29058B.a0()) {
            ImageView imageView = this$0.n3().f12134g.f12147d;
            AbstractC3255y.h(imageView, "binding.review.ivLikesCounterReview");
            q5.k.a(this$0, imageView);
            if (!C3655A.f36474a.i(review.l())) {
                this$0.p3().n(this$0, review);
                this$0.n3().f12134g.f12159p.setText(String.valueOf(review.p() + 1));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F3(RepliesActivity this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        String x8 = review.x();
        AbstractC3255y.f(x8);
        this$0.z3(x8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G3(RepliesActivity this$0, a5.K review, View view) {
        AbstractC3255y.i(this$0, "this$0");
        AbstractC3255y.i(review, "$review");
        String x8 = review.x();
        AbstractC3255y.f(x8);
        this$0.z3(x8);
    }

    private final void H3() {
        String str;
        Q.b bVar = Q.f14058k;
        Q e8 = bVar.e(this);
        if (e8 != null) {
            str = e8.b();
        } else {
            str = null;
        }
        if (str != null) {
            com.squareup.picasso.s.h().l(bVar.c(e8.b())).l(R.drawable.shape_bg_placeholder).n(UptodownApp.f29058B.f0(this)).i(n3().f12130c);
            if (e8.y()) {
                C3671k.a aVar = C3671k.f36498a;
                ImageView imageView = n3().f12130c;
                AbstractC3255y.h(imageView, "binding.ivUserAvatarReply");
                aVar.b(imageView);
                return;
            }
            return;
        }
        n3().f12130c.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.vector_user_default));
    }

    private final void I3() {
        String str;
        Q e8 = Q.f14058k.e(this);
        if (e8 != null) {
            str = e8.getId();
        } else {
            str = null;
        }
        if (str != null) {
            String id = e8.getId();
            AbstractC3255y.f(id);
            if (id.length() > 0) {
                n3().f12132e.setVisibility(8);
                return;
            }
        }
        n3().f12132e.setVisibility(0);
    }

    private final void o3(long j8) {
        p3().e(this, j8);
    }

    private final void q3() {
        Object systemService = getSystemService("input_method");
        AbstractC3255y.g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(n3().f12129b.getWindowToken(), 0);
    }

    private final void r3() {
        String str;
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        if (drawable != null) {
            n3().f12138k.setNavigationIcon(drawable);
            n3().f12138k.setNavigationContentDescription(getString(R.string.back));
        }
        n3().f12138k.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.E2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.s3(RepliesActivity.this, view);
            }
        });
        TextView textView = n3().f12139l;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        a5.K k8 = (a5.K) p3().j().getValue();
        String str2 = null;
        if (k8 != null) {
            str = k8.g();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            TextView textView2 = n3().f12139l;
            a5.K k9 = (a5.K) p3().j().getValue();
            if (k9 != null) {
                str2 = k9.g();
            }
            textView2.setText(str2);
        } else {
            CharSequence charSequence = (CharSequence) p3().f().getValue();
            if (charSequence != null && charSequence.length() != 0) {
                n3().f12139l.setText((CharSequence) p3().f().getValue());
            }
        }
        n3().f12140m.setTypeface(aVar.u());
        H3();
        n3().f12141n.setTypeface(aVar.t());
        n3().f12141n.setOnClickListener(new View.OnClickListener() { // from class: D4.F2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.t3(RepliesActivity.this, view);
            }
        });
        n3().f12132e.setOnClickListener(new View.OnClickListener() { // from class: D4.G2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RepliesActivity.u3(RepliesActivity.this, view);
            }
        });
        n3().f12129b.setTypeface(aVar.u());
        n3().f12129b.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: D4.H2
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView3, int i8, KeyEvent keyEvent) {
                boolean v32;
                v32 = RepliesActivity.v3(RepliesActivity.this, textView3, i8, keyEvent);
                return v32;
            }
        });
        I3();
        n3().f12137j.setLayoutManager(new LinearLayoutManager(this, 1, false));
        n3().f12137j.setItemAnimator(new DefaultItemAnimator());
        if (p3().j().getValue() != null) {
            Object value = p3().j().getValue();
            AbstractC3255y.f(value);
            o3(((a5.K) value).l());
            Object value2 = p3().j().getValue();
            AbstractC3255y.f(value2);
            A3((a5.K) value2);
            return;
        }
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s3(RepliesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.getOnBackPressedDispatcher().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t3(RepliesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.x3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u3(RepliesActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.y3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v3(RepliesActivity this$0, TextView textView, int i8, KeyEvent keyEvent) {
        AbstractC3255y.i(this$0, "this$0");
        if (i8 == 6) {
            this$0.x3();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w3() {
        Q.f14058k.a(this);
        y3();
    }

    private final void x3() {
        q3();
        if (n3().f12129b.getText() != null && j6.n.M0(n3().f12129b.getText().toString()).toString().length() > 0) {
            if (!a5.K.f14002o.b(this, n3().f12129b.getText().toString())) {
                SettingsPreferences.a aVar = SettingsPreferences.f30353b;
                Context applicationContext = getApplicationContext();
                AbstractC3255y.h(applicationContext, "applicationContext");
                aVar.N0(applicationContext, n3().f12129b.getText().toString());
                Context applicationContext2 = getApplicationContext();
                AbstractC3255y.h(applicationContext2, "applicationContext");
                aVar.O0(applicationContext2, String.valueOf(System.currentTimeMillis()));
                r p32 = p3();
                String obj = n3().f12129b.getText().toString();
                Object value = p3().j().getValue();
                AbstractC3255y.f(value);
                p32.o(this, obj, ((a5.K) value).l());
                return;
            }
            n3().f12129b.setText("");
            return;
        }
        if (j6.n.M0(n3().f12129b.getText().toString()).toString().length() == 0) {
            String string = getString(R.string.empty_answer_error);
            AbstractC3255y.h(string, "getString(R.string.empty_answer_error)");
            d2(string);
        }
    }

    private final void y3() {
        if (!isFinishing()) {
            startActivity(new Intent(getApplicationContext(), (Class<?>) LoginActivity.class), UptodownApp.f29058B.a(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z3(String str) {
        Intent intent = new Intent(this, (Class<?>) UserCommentsActivity.class);
        intent.putExtra("userID", str);
        startActivity(intent, UptodownApp.f29058B.a(this));
    }

    public final C1473c0 n3() {
        return (C1473c0) this.f29807N.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Bundle extras;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        setContentView(n3().getRoot());
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            if (extras.containsKey("review")) {
                o6.w j8 = p3().j();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = extras.getParcelable("review", a5.K.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    parcelable = extras.getParcelable("review");
                }
                j8.setValue(parcelable);
            }
            if (extras.containsKey("appName")) {
                p3().f().setValue(extras.getString("appName"));
            }
            if (extras.containsKey(HintConstants.AUTOFILL_HINT_USERNAME)) {
                p3().l().setValue(extras.getString(HintConstants.AUTOFILL_HINT_USERNAME));
            }
        }
        r3();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new b(null), 2, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new c(null), 2, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new d(null), 2, null);
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new e(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        I3();
        H3();
    }

    public final r p3() {
        return (r) this.f29808O.getValue();
    }
}
