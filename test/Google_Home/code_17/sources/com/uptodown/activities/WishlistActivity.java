package com.uptodown.activities;

import D4.W1;
import G4.V;
import H4.j;
import O5.C1352h;
import O5.InterfaceC1355k;
import P5.AbstractC1378t;
import W4.G0;
import a5.C1641h;
import a5.C1648o;
import a6.InterfaceC1668n;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
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
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import com.uptodown.activities.K;
import com.uptodown.activities.WishlistActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import kotlin.jvm.internal.U;
import kotlin.jvm.internal.Y;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.M;
import o5.AbstractC3685y;
import o5.C3661a;
import o5.C3667g;
import o5.C3674n;
import o5.C3677q;
import o6.InterfaceC3698L;
import o6.InterfaceC3707g;

/* loaded from: classes4.dex */
public final class WishlistActivity extends W1 {

    /* renamed from: t0, reason: collision with root package name */
    public static final a f30113t0 = new a(null);

    /* renamed from: r0, reason: collision with root package name */
    private V f30116r0;

    /* renamed from: p0, reason: collision with root package name */
    private final InterfaceC1355k f30114p0 = O5.l.b(new b());

    /* renamed from: q0, reason: collision with root package name */
    private final InterfaceC1355k f30115q0 = new ViewModelLazy(U.b(K.class), new k(this), new j(this), new l(null, this));

    /* renamed from: s0, reason: collision with root package name */
    private d f30117s0 = new d();

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
        public final G0 invoke() {
            return G0.c(WishlistActivity.this.getLayoutInflater());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5.U f30120b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30121c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30122a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WishlistActivity f30123b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a5.U f30124c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f30125d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WishlistActivity wishlistActivity, a5.U u8, int i8, S5.d dVar) {
                super(2, dVar);
                this.f30123b = wishlistActivity;
                this.f30124c = u8;
                this.f30125d = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30123b, this.f30124c, this.f30125d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = T5.b.e();
                int i8 = this.f30122a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        O5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    O5.t.b(obj);
                    WishlistActivity wishlistActivity = this.f30123b;
                    a5.U u8 = this.f30124c;
                    int i9 = this.f30125d;
                    this.f30122a = 1;
                    if (wishlistActivity.T4(u8, i9, this) == e8) {
                        return e8;
                    }
                }
                return O5.I.f8278a;
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a5.U u8, int i8) {
            super(0);
            this.f30120b = u8;
            this.f30121c = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m5577invoke();
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5577invoke() {
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(WishlistActivity.this), null, null, new a(WishlistActivity.this, this.f30120b, this.f30121c, null), 3, null);
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements Z4.M {

        /* loaded from: classes4.dex */
        public static final class a implements Z4.r {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WishlistActivity f30127a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f30128b;

            a(WishlistActivity wishlistActivity, int i8) {
                this.f30127a = wishlistActivity;
                this.f30128b = i8;
            }

            @Override // Z4.r
            public void c(int i8) {
                WishlistActivity wishlistActivity = this.f30127a;
                String string = wishlistActivity.getString(R.string.error_cant_enqueue_download);
                AbstractC3255y.h(string, "getString(R.string.error_cant_enqueue_download)");
                wishlistActivity.d2(string);
            }

            @Override // Z4.r
            public void e(C1641h appInfo) {
                AbstractC3255y.i(appInfo, "appInfo");
                String H8 = appInfo.H();
                if (H8 != null && H8.length() != 0) {
                    if (!new C3667g().r(appInfo.y0(), this.f30127a)) {
                        this.f30127a.S4(appInfo, this.f30128b);
                        return;
                    } else {
                        this.f30127a.l4(new C3667g().z(this.f30127a, appInfo.y0()));
                        return;
                    }
                }
                WishlistActivity wishlistActivity = this.f30127a;
                String string = wishlistActivity.getString(R.string.dialog_msg_download_not_available, appInfo.s0());
                AbstractC3255y.h(string, "getString(R.string.dialo…_available, appInfo.name)");
                wishlistActivity.d2(string);
            }
        }

        d() {
        }

        @Override // Z4.J
        public void a(int i8) {
            if (UptodownApp.f29058B.a0() && WishlistActivity.this.f30116r0 != null) {
                AbstractC3255y.f(WishlistActivity.this.f30116r0);
                if (!r0.a().isEmpty()) {
                    V v8 = WishlistActivity.this.f30116r0;
                    AbstractC3255y.f(v8);
                    Object obj = v8.a().get(i8);
                    AbstractC3255y.h(obj, "adapter!!.wishlist[position]");
                    WishlistActivity.this.F2(((a5.U) obj).a());
                }
            }
        }

        @Override // Z4.J
        public void b(View v8, int i8) {
            AbstractC3255y.i(v8, "v");
            if (UptodownApp.f29058B.a0() && WishlistActivity.this.f30116r0 != null) {
                AbstractC3255y.f(WishlistActivity.this.f30116r0);
                if (!r3.a().isEmpty()) {
                    WishlistActivity wishlistActivity = WishlistActivity.this;
                    V v9 = wishlistActivity.f30116r0;
                    AbstractC3255y.f(v9);
                    Object obj = v9.a().get(i8);
                    AbstractC3255y.h(obj, "adapter!!.wishlist[position]");
                    wishlistActivity.I4((a5.U) obj, i8);
                }
            }
        }

        @Override // Z4.M
        public void c(int i8) {
            if (WishlistActivity.this.f30116r0 != null) {
                AbstractC3255y.f(WishlistActivity.this.f30116r0);
                if (!r0.a().isEmpty()) {
                    WishlistActivity wishlistActivity = WishlistActivity.this;
                    V v8 = wishlistActivity.f30116r0;
                    AbstractC3255y.f(v8);
                    new V4.i(wishlistActivity, ((a5.U) v8.a().get(i8)).a(), new a(WishlistActivity.this, i8), LifecycleOwnerKt.getLifecycleScope(WishlistActivity.this));
                }
            }
        }

        @Override // Z4.M
        public void d(int i8) {
            if (WishlistActivity.this.f30116r0 != null) {
                AbstractC3255y.f(WishlistActivity.this.f30116r0);
                if (!r2.a().isEmpty()) {
                    V v8 = WishlistActivity.this.f30116r0;
                    AbstractC3255y.f(v8);
                    Object obj = v8.a().get(i8);
                    AbstractC3255y.h(obj, "adapter!!.wishlist[position]");
                    a5.U u8 = (a5.U) obj;
                    String f8 = u8.f();
                    if (f8 != null && f8.length() != 0) {
                        PackageManager packageManager = WishlistActivity.this.getPackageManager();
                        String f9 = u8.f();
                        AbstractC3255y.f(f9);
                        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(f9);
                        if (launchIntentForPackage != null) {
                            WishlistActivity.this.startActivity(launchIntentForPackage);
                            return;
                        }
                        WishlistActivity wishlistActivity = WishlistActivity.this;
                        String string = wishlistActivity.getString(R.string.error_open_app, u8.e());
                        AbstractC3255y.h(string, "getString(R.string.error…p, selectedWishlist.name)");
                        wishlistActivity.d2(string);
                        return;
                    }
                    WishlistActivity wishlistActivity2 = WishlistActivity.this;
                    String string2 = wishlistActivity2.getString(R.string.error_open_app, u8.e());
                    AbstractC3255y.h(string2, "getString(R.string.error…p, selectedWishlist.name)");
                    wishlistActivity2.d2(string2);
                }
            }
        }

        @Override // Z4.J
        public void e(int i8) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends AbstractC3256z implements Function1 {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f30130a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ WishlistActivity f30131b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ a5.U f30132c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(WishlistActivity wishlistActivity, a5.U u8, S5.d dVar) {
                super(2, dVar);
                this.f30131b = wishlistActivity;
                this.f30132c = u8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final S5.d create(Object obj, S5.d dVar) {
                return new a(this.f30131b, this.f30132c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                int i8;
                V v8;
                ArrayList a8;
                T5.b.e();
                if (this.f30130a == 0) {
                    O5.t.b(obj);
                    V v9 = this.f30131b.f30116r0;
                    if (v9 != null && (a8 = v9.a()) != null) {
                        i8 = a8.indexOf(this.f30132c);
                    } else {
                        i8 = -1;
                    }
                    if (i8 > -1 && (v8 = this.f30131b.f30116r0) != null) {
                        v8.notifyItemChanged(i8);
                    }
                    return O5.I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, S5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
            }
        }

        e() {
            super(1);
        }

        public final void a(a5.U wishlist) {
            AbstractC3255y.i(wishlist, "wishlist");
            AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(WishlistActivity.this), C3347b0.c(), null, new a(WishlistActivity.this, wishlist, null), 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a5.U) obj);
            return O5.I.f8278a;
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30133a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class a implements InterfaceC3707g {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ WishlistActivity f30135a;

            a(WishlistActivity wishlistActivity) {
                this.f30135a = wishlistActivity;
            }

            @Override // o6.InterfaceC3707g
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC3685y abstractC3685y, S5.d dVar) {
                if (abstractC3685y instanceof AbstractC3685y.a) {
                    this.f30135a.K4().f11774b.f11842b.setVisibility(0);
                } else if (abstractC3685y instanceof AbstractC3685y.c) {
                    AbstractC3685y.c cVar = (AbstractC3685y.c) abstractC3685y;
                    this.f30135a.H4(((K.a) cVar.a()).a());
                    if (((K.a) cVar.a()).a().size() == 0) {
                        this.f30135a.K4().f11778f.setVisibility(0);
                        this.f30135a.K4().f11777e.setVisibility(0);
                    }
                    this.f30135a.K4().f11774b.f11842b.setVisibility(8);
                } else {
                    boolean z8 = abstractC3685y instanceof AbstractC3685y.b;
                }
                return O5.I.f8278a;
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
            int i8 = this.f30133a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                O5.t.b(obj);
            } else {
                O5.t.b(obj);
                InterfaceC3698L e9 = WishlistActivity.this.L4().e();
                a aVar = new a(WishlistActivity.this);
                this.f30133a = 1;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f30136a;

        /* renamed from: b, reason: collision with root package name */
        int f30137b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f30138c;

        /* renamed from: e, reason: collision with root package name */
        int f30140e;

        g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30138c = obj;
            this.f30140e |= Integer.MIN_VALUE;
            return WishlistActivity.this.T4(null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30141a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a5.U f30142b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ WishlistActivity f30143c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f30144d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(a5.U u8, WishlistActivity wishlistActivity, int i8, S5.d dVar) {
            super(2, dVar);
            this.f30142b = u8;
            this.f30143c = wishlistActivity;
            this.f30144d = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new h(this.f30142b, this.f30143c, this.f30144d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30141a == 0) {
                O5.t.b(obj);
                this.f30142b.i(this.f30143c);
                V v8 = this.f30143c.f30116r0;
                AbstractC3255y.f(v8);
                return v8.a().remove(this.f30144d);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30145a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f30147c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(int i8, S5.d dVar) {
            super(2, dVar);
            this.f30147c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new i(this.f30147c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f30145a == 0) {
                O5.t.b(obj);
                V v8 = WishlistActivity.this.f30116r0;
                AbstractC3255y.f(v8);
                v8.notifyItemRemoved(this.f30147c);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((i) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class j extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30148a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f30148a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.f30148a.getDefaultViewModelProviderFactory();
        }
    }

    /* loaded from: classes4.dex */
    public static final class k extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30149a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentActivity componentActivity) {
            super(0);
            this.f30149a = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.f30149a.getViewModelStore();
        }
    }

    /* loaded from: classes4.dex */
    public static final class l extends AbstractC3256z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f30150a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ComponentActivity f30151b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.f30150a = function0;
            this.f30151b = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f30150a;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.f30151b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class m extends kotlin.coroutines.jvm.internal.l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f30152a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30154c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, S5.d dVar) {
            super(2, dVar);
            this.f30154c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new m(this.f30154c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String str;
            Object obj2;
            T5.b.e();
            if (this.f30152a == 0) {
                O5.t.b(obj);
                if (WishlistActivity.this.f30116r0 != null) {
                    AbstractC3255y.f(WishlistActivity.this.f30116r0);
                    if ((!r4.a().isEmpty()) && (str = this.f30154c) != null && str.length() != 0) {
                        V v8 = WishlistActivity.this.f30116r0;
                        AbstractC3255y.f(v8);
                        ArrayList a8 = v8.a();
                        String str2 = this.f30154c;
                        Iterator it = a8.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (AbstractC3255y.d(((a5.U) obj2).f(), str2)) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                        V v9 = WishlistActivity.this.f30116r0;
                        AbstractC3255y.f(v9);
                        int r02 = AbstractC1378t.r0(v9.a(), (a5.U) obj2);
                        if (r02 > -1) {
                            V v10 = WishlistActivity.this.f30116r0;
                            AbstractC3255y.f(v10);
                            v10.notifyItemChanged(r02);
                        } else {
                            WishlistActivity.this.R4();
                        }
                        return O5.I.f8278a;
                    }
                }
                WishlistActivity.this.R4();
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, S5.d dVar) {
            return ((m) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H4(ArrayList arrayList) {
        V v8 = this.f30116r0;
        if (v8 == null) {
            this.f30116r0 = new V(arrayList, this, this.f30117s0);
            K4().f11775c.setAdapter(this.f30116r0);
        } else {
            AbstractC3255y.f(v8);
            v8.d(arrayList);
            R4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I4(a5.U u8, int i8) {
        Y y8 = Y.f34167a;
        String string = getString(R.string.dialog_wishlist_msg);
        AbstractC3255y.h(string, "getString(R.string.dialog_wishlist_msg)");
        String format = String.format(string, Arrays.copyOf(new Object[]{u8.e()}, 1));
        AbstractC3255y.h(format, "format(...)");
        Y1(format, new c(u8, i8));
    }

    private final void J4(C1641h c1641h, C1648o c1648o) {
        c1648o.a(c1641h);
        int l02 = c1648o.l0(this);
        if (l02 >= 0) {
            L2(this, l02);
            return;
        }
        Toast.makeText(this, getString(R.string.error_cant_enqueue_download) + " (108)", 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final G0 K4() {
        return (G0) this.f30114p0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final K L4() {
        return (K) this.f30115q0.getValue();
    }

    private final void M4() {
        setContentView(K4().getRoot());
        Drawable drawable = ContextCompat.getDrawable(this, R.drawable.vector_arrow_left);
        G0 K42 = K4();
        if (drawable != null) {
            K42.f11776d.setNavigationIcon(drawable);
            K42.f11776d.setNavigationContentDescription(getString(R.string.back));
        }
        K42.f11776d.setNavigationOnClickListener(new View.OnClickListener() { // from class: D4.o4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WishlistActivity.N4(WishlistActivity.this, view);
            }
        });
        TextView textView = K42.f11779g;
        j.a aVar = H4.j.f3824g;
        textView.setTypeface(aVar.t());
        K42.f11775c.setLayoutManager(new LinearLayoutManager(this, 1, false));
        K42.f11775c.setItemAnimator(new DefaultItemAnimator());
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        int dimension = (int) getResources().getDimension(R.dimen.margin_m);
        K4().f11775c.addItemDecoration(new q5.m(dimension, dimension));
        K42.f11775c.setItemAnimator(defaultItemAnimator);
        K42.f11778f.setTypeface(aVar.u());
        K42.f11777e.setTypeface(aVar.u());
        K42.f11777e.setOnClickListener(new View.OnClickListener() { // from class: D4.p4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WishlistActivity.O4(WishlistActivity.this, view);
            }
        });
        K42.f11774b.f11842b.setOnClickListener(new View.OnClickListener() { // from class: D4.q4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WishlistActivity.P4(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(WishlistActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O4(WishlistActivity this$0, View view) {
        AbstractC3255y.i(this$0, "this$0");
        this$0.setResult(1);
        this$0.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P4(View view) {
    }

    private final void Q4() {
        L4().d(this, new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R4() {
        V v8 = this.f30116r0;
        if (v8 != null) {
            v8.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S4(C1641h c1641h, int i8) {
        C3674n.a aVar = C3674n.f36505t;
        Context applicationContext = getApplicationContext();
        AbstractC3255y.h(applicationContext, "applicationContext");
        C3674n a8 = aVar.a(applicationContext);
        a8.a();
        C1648o Z7 = a8.Z(String.valueOf(c1641h.f0()));
        a8.l();
        if (Z7 != null) {
            int Z8 = Z7.Z();
            if (1 <= Z8 && Z8 < 100) {
                if (Z7.X() != null) {
                    C3661a c3661a = new C3661a();
                    Context applicationContext2 = getApplicationContext();
                    AbstractC3255y.h(applicationContext2, "applicationContext");
                    c3661a.a(applicationContext2, Z7.X());
                    V v8 = this.f30116r0;
                    if (v8 != null) {
                        v8.notifyItemChanged(i8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (Z7.Z() == 100) {
                File f8 = new C3677q().f(this);
                String X7 = Z7.X();
                AbstractC3255y.f(X7);
                UptodownApp.f29058B.Y(new File(f8, X7), this, c1641h.t0());
                return;
            }
            Z7.n0(this);
            V v9 = this.f30116r0;
            if (v9 != null) {
                v9.notifyItemChanged(i8);
                return;
            }
            return;
        }
        C1648o c1648o = new C1648o();
        try {
            String W02 = c1641h.W0();
            AbstractC3255y.f(W02);
            c1648o.G0(Long.parseLong(W02));
        } catch (NumberFormatException e8) {
            e8.printStackTrace();
        }
        J4(c1641h, c1648o);
        V v10 = this.f30116r0;
        AbstractC3255y.f(v10);
        ((a5.U) v10.a().get(i8)).l(String.valueOf(c1641h.f0()));
        V v11 = this.f30116r0;
        if (v11 != null) {
            v11.notifyItemChanged(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T4(a5.U r7, int r8, S5.d r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof com.uptodown.activities.WishlistActivity.g
            if (r0 == 0) goto L13
            r0 = r9
            com.uptodown.activities.WishlistActivity$g r0 = (com.uptodown.activities.WishlistActivity.g) r0
            int r1 = r0.f30140e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30140e = r1
            goto L18
        L13:
            com.uptodown.activities.WishlistActivity$g r0 = new com.uptodown.activities.WishlistActivity$g
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f30138c
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f30140e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r9)
            goto L6d
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            int r8 = r0.f30137b
            java.lang.Object r7 = r0.f30136a
            com.uptodown.activities.WishlistActivity r7 = (com.uptodown.activities.WishlistActivity) r7
            O5.t.b(r9)
            goto L59
        L3f:
            O5.t.b(r9)
            l6.I r9 = l6.C3347b0.b()
            com.uptodown.activities.WishlistActivity$h r2 = new com.uptodown.activities.WishlistActivity$h
            r2.<init>(r7, r6, r8, r5)
            r0.f30136a = r6
            r0.f30137b = r8
            r0.f30140e = r4
            java.lang.Object r7 = l6.AbstractC3360i.g(r9, r2, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            r7 = r6
        L59:
            l6.J0 r9 = l6.C3347b0.c()
            com.uptodown.activities.WishlistActivity$i r2 = new com.uptodown.activities.WishlistActivity$i
            r2.<init>(r8, r5)
            r0.f30136a = r5
            r0.f30140e = r3
            java.lang.Object r7 = l6.AbstractC3360i.g(r9, r2, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.activities.WishlistActivity.T4(a5.U, int, S5.d):java.lang.Object");
    }

    public final void U4(String str) {
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new m(str, null), 2, null);
    }

    @Override // D4.W1
    protected void o4() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        M4();
        AbstractC3364k.d(LifecycleOwnerKt.getLifecycleScope(this), C3347b0.c(), null, new f(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.uptodown.activities.AbstractActivityC2683a, I4.a1, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Q4();
    }
}
