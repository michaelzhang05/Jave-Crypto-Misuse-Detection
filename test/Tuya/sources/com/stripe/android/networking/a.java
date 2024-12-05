package com.stripe.android.networking;

import L5.r;
import L5.s;
import L5.t;
import L5.x;
import M5.AbstractC1246t;
import P5.g;
import Q5.b;
import X5.n;
import android.content.Context;
import android.net.http.HttpResponseCache;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.stripe.android.model.c;
import com.stripe.android.model.p;
import com.stripe.android.model.w;
import e3.C2582d;
import e3.C2583e;
import e3.m;
import i6.AbstractC2829k;
import j2.InterfaceC3069i;
import java.io.File;
import java.security.Security;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3151p;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import l2.InterfaceC3167b;
import r2.C3683c;
import r2.InterfaceC3684d;
import r2.f;
import t2.AbstractC3783d;
import t2.C3781b;
import t2.C3782c;
import t2.C3785f;
import t2.C3788i;
import t2.C3789j;
import w2.InterfaceC3845a;
import x2.AbstractC3863A;
import x2.C3870H;
import x2.C3872b;
import x2.InterfaceC3868F;
import x2.InterfaceC3873c;
import x2.j;
import x2.z;

/* loaded from: classes4.dex */
public final class a implements m {

    /* renamed from: n, reason: collision with root package name */
    public static final C2407b f24890n = new C2407b(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f24891o = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f24892a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f24893b;

    /* renamed from: c, reason: collision with root package name */
    private final C3683c f24894c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3684d f24895d;

    /* renamed from: e, reason: collision with root package name */
    private final g f24896e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f24897f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC3868F f24898g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC3873c f24899h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3069i f24900i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3167b.a f24901j;

    /* renamed from: k, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f24902k;

    /* renamed from: l, reason: collision with root package name */
    private final C2583e f24903l;

    /* renamed from: m, reason: collision with root package name */
    private final j.b f24904m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f24906b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(Set set) {
            super(1);
            this.f24906b = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5489invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5489invoke(Object obj) {
            a aVar = a.this;
            aVar.S(aVar.f24902k.q(this.f24906b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class B extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f24907a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24908b;

        /* renamed from: d, reason: collision with root package name */
        int f24910d;

        B(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24908b = obj;
            this.f24910d |= Integer.MIN_VALUE;
            Object P8 = a.this.P(null, null, null, this);
            return P8 == b.e() ? P8 : s.a(P8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C f24911a = new C();

        C() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5490invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5490invoke(((s) obj).k());
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class D extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f24912a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24913b;

        /* renamed from: d, reason: collision with root package name */
        int f24915d;

        D(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24913b = obj;
            this.f24915d |= Integer.MIN_VALUE;
            Object n8 = a.this.n(null, null, this);
            return n8 == b.e() ? n8 : s.a(n8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class E extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24916a;

        /* renamed from: c, reason: collision with root package name */
        int f24918c;

        E(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24916a = obj;
            this.f24918c |= Integer.MIN_VALUE;
            Object x8 = a.this.x(null, this);
            return x8 == b.e() ? x8 : s.a(x8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends AbstractC3160z implements Function1 {
        F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5491invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5491invoke(Object obj) {
            a.this.R(PaymentAnalyticsEvent.f24828Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class G extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24920a;

        /* renamed from: c, reason: collision with root package name */
        int f24922c;

        G(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24920a = obj;
            this.f24922c |= Integer.MIN_VALUE;
            Object u8 = a.this.u(null, null, null, this);
            return u8 == b.e() ? u8 : s.a(u8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f24924b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(Set set) {
            super(1);
            this.f24924b = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5492invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5492invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f24902k, PaymentAnalyticsEvent.f24843g, this.f24924b, null, null, null, null, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class I extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24925a;

        /* renamed from: c, reason: collision with root package name */
        int f24927c;

        I(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24925a = obj;
            this.f24927c |= Integer.MIN_VALUE;
            Object l8 = a.this.l(null, null, null, this);
            return l8 == b.e() ? l8 : s.a(l8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class J extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f24928a;

        /* renamed from: b, reason: collision with root package name */
        Object f24929b;

        /* renamed from: c, reason: collision with root package name */
        Object f24930c;

        /* renamed from: d, reason: collision with root package name */
        Object f24931d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f24932e;

        /* renamed from: g, reason: collision with root package name */
        int f24934g;

        J(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24932e = obj;
            this.f24934g |= Integer.MIN_VALUE;
            return a.this.a0(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class K extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f24935a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f24936b;

        /* renamed from: d, reason: collision with root package name */
        int f24938d;

        K(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24936b = obj;
            this.f24938d |= Integer.MIN_VALUE;
            Object d02 = a.this.d0(null, null, this);
            return d02 == b.e() ? d02 : s.a(d02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class L extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24939a;

        /* renamed from: c, reason: collision with root package name */
        int f24941c;

        L(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24939a = obj;
            this.f24941c |= Integer.MIN_VALUE;
            Object t8 = a.this.t(null, null, this);
            return t8 == b.e() ? t8 : s.a(t8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class M extends AbstractC3160z implements Function1 {
        M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5493invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5493invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f24902k, PaymentAnalyticsEvent.f24864v, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class N extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24943a;

        /* renamed from: c, reason: collision with root package name */
        int f24945c;

        N(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24943a = obj;
            this.f24945c |= Integer.MIN_VALUE;
            Object f8 = a.this.f(null, null, this);
            return f8 == b.e() ? f8 : s.a(f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class O extends AbstractC3160z implements Function1 {
        O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5494invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5494invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f24902k, PaymentAnalyticsEvent.f24806A, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class P extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24947a;

        /* renamed from: c, reason: collision with root package name */
        int f24949c;

        P(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24947a = obj;
            this.f24949c |= Integer.MIN_VALUE;
            Object r8 = a.this.r(null, null, this);
            return r8 == b.e() ? r8 : s.a(r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Q extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24950a;

        /* renamed from: c, reason: collision with root package name */
        int f24952c;

        Q(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24950a = obj;
            this.f24952c |= Integer.MIN_VALUE;
            Object g8 = a.this.g(null, null, null, this);
            return g8 == b.e() ? g8 : s.a(g8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class R extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f24954b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        R(Set set) {
            super(1);
            this.f24954b = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5495invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5495invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f24902k, PaymentAnalyticsEvent.f24842f, this.f24954b, null, null, null, null, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class S extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24955a;

        /* renamed from: c, reason: collision with root package name */
        int f24957c;

        S(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24955a = obj;
            this.f24957c |= Integer.MIN_VALUE;
            Object w8 = a.this.w(null, null, this);
            return w8 == b.e() ? w8 : s.a(w8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class T extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24958a;

        /* renamed from: c, reason: collision with root package name */
        int f24960c;

        T(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24958a = obj;
            this.f24960c |= Integer.MIN_VALUE;
            Object f02 = a.this.f0(null, null, null, this);
            return f02 == b.e() ? f02 : s.a(f02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class U extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PaymentAnalyticsEvent f24961a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f24962b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        U(PaymentAnalyticsEvent paymentAnalyticsEvent, a aVar) {
            super(1);
            this.f24961a = paymentAnalyticsEvent;
            this.f24962b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5496invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5496invoke(Object obj) {
            PaymentAnalyticsEvent paymentAnalyticsEvent = this.f24961a;
            if (paymentAnalyticsEvent != null) {
                a aVar = this.f24962b;
                aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f24902k, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class V extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24963a;

        /* renamed from: c, reason: collision with root package name */
        int f24965c;

        V(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24963a = obj;
            this.f24965c |= Integer.MIN_VALUE;
            Object y8 = a.this.y(null, null, null, this);
            return y8 == b.e() ? y8 : s.a(y8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class W extends AbstractC3160z implements Function1 {
        W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5497invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5497invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f24902k, PaymentAnalyticsEvent.f24858s, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class X extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24967a;

        /* renamed from: c, reason: collision with root package name */
        int f24969c;

        X(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24967a = obj;
            this.f24969c |= Integer.MIN_VALUE;
            Object h8 = a.this.h(null, null, null, this);
            return h8 == b.e() ? h8 : s.a(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Y extends AbstractC3160z implements Function1 {
        Y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5498invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5498invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f24902k, PaymentAnalyticsEvent.f24868x, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Z extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24971a;

        /* renamed from: c, reason: collision with root package name */
        int f24973c;

        Z(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24971a = obj;
            this.f24973c |= Integer.MIN_VALUE;
            Object q8 = a.this.q(null, null, null, this);
            return q8 == b.e() ? q8 : s.a(q8);
        }
    }

    /* renamed from: com.stripe.android.networking.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0533a extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f24974a;

        C0533a(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            return new C0533a(dVar);
        }

        @Override // X5.n
        public final Object invoke(i6.M m8, P5.d dVar) {
            return ((C0533a) create(m8, dVar)).invokeSuspend(L5.I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.f24974a == 0) {
                t.b(obj);
                HttpResponseCache.install(new File(a.this.f24892a.getCacheDir(), "stripe_api_repository_cache"), 10485760L);
                return L5.I.f6487a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a0 extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24976a;

        /* renamed from: c, reason: collision with root package name */
        int f24978c;

        a0(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24976a = obj;
            this.f24978c |= Integer.MIN_VALUE;
            Object p8 = a.this.p(null, null, null, null, this);
            return p8 == b.e() ? p8 : s.a(p8);
        }
    }

    /* renamed from: com.stripe.android.networking.a$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2407b {
        private C2407b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map e(List list) {
            Map map = null;
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                map = M5.Q.e(x.a("expand", list));
            }
            if (map == null) {
                return M5.Q.h();
            }
            return map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String str) {
            return "https://api.stripe.com/v1/" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String g(String str, Object... objArr) {
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f33766a;
            Locale locale = Locale.ENGLISH;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
            AbstractC3159y.h(format, "format(...)");
            return f(format);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String o(String str) {
            return "https://api.stripe.com/edge-internal/" + str;
        }

        private final String q(String str) {
            return "https://merchant-ui-api.stripe.com/elements/" + str;
        }

        public final /* synthetic */ String h(String paymentIntentId, String financialConnectionsSessionId) {
            AbstractC3159y.i(paymentIntentId, "paymentIntentId");
            AbstractC3159y.i(financialConnectionsSessionId, "financialConnectionsSessionId");
            return g("payment_intents/%s/link_account_sessions/%s/attach", paymentIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String i(String setupIntentId, String financialConnectionsSessionId) {
            AbstractC3159y.i(setupIntentId, "setupIntentId");
            AbstractC3159y.i(financialConnectionsSessionId, "financialConnectionsSessionId");
            return g("setup_intents/%s/link_account_sessions/%s/attach", setupIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String j(String paymentIntentId) {
            AbstractC3159y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/source_cancel", paymentIntentId);
        }

        public final /* synthetic */ String k(String setupIntentId) {
            AbstractC3159y.i(setupIntentId, "setupIntentId");
            return g("setup_intents/%s/source_cancel", setupIntentId);
        }

        public final /* synthetic */ String l(String paymentIntentId) {
            AbstractC3159y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/confirm", paymentIntentId);
        }

        public final /* synthetic */ String m(String setupIntentId) {
            AbstractC3159y.i(setupIntentId, "setupIntentId");
            return g("setup_intents/%s/confirm", setupIntentId);
        }

        public final /* synthetic */ String n() {
            return f("connections/link_account_sessions_for_deferred_payment");
        }

        public final /* synthetic */ String p() {
            return f("consumers/sessions/log_out");
        }

        public final String r() {
            return q("mobile-card-element-config");
        }

        public final /* synthetic */ String s(String paymentMethodId) {
            AbstractC3159y.i(paymentMethodId, "paymentMethodId");
            return f("payment_methods/" + paymentMethodId);
        }

        public final /* synthetic */ String t() {
            return f("payment_methods");
        }

        public final /* synthetic */ String u(String paymentIntentId) {
            AbstractC3159y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String v(String paymentIntentId) {
            AbstractC3159y.i(paymentIntentId, "paymentIntentId");
            return g("setup_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String w(String customerId) {
            AbstractC3159y.i(customerId, "customerId");
            return g("customers/%s", customerId);
        }

        public final /* synthetic */ String x(String paymentIntentId) {
            AbstractC3159y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s", paymentIntentId);
        }

        public final /* synthetic */ String y(String setupIntentId) {
            AbstractC3159y.i(setupIntentId, "setupIntentId");
            return g("setup_intents/%s", setupIntentId);
        }

        public final /* synthetic */ String z() {
            return f("consumers/payment_details/share");
        }

        public /* synthetic */ C2407b(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b0 extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24979a;

        /* renamed from: c, reason: collision with root package name */
        int f24981c;

        b0(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24979a = obj;
            this.f24981c |= Integer.MIN_VALUE;
            Object b8 = a.this.b(null, null, this);
            return b8 == b.e() ? b8 : s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.stripe.android.networking.a$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC2408c {

        /* renamed from: com.stripe.android.networking.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0534a extends AbstractC2408c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0534a f24982a = new C0534a();

            private C0534a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0534a);
            }

            public int hashCode() {
                return 2054089437;
            }

            public String toString() {
                return "Failure";
            }
        }

        /* renamed from: com.stripe.android.networking.a$c$b */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC2408c {

            /* renamed from: a, reason: collision with root package name */
            private final String f24983a;

            public b(String str) {
                super(null);
                this.f24983a = str;
            }

            public final String a() {
                return this.f24983a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3159y.d(this.f24983a, ((b) obj).f24983a);
            }

            public int hashCode() {
                String str = this.f24983a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Success(originalDnsCacheTtl=" + this.f24983a + ")";
            }
        }

        private AbstractC2408c() {
        }

        public /* synthetic */ AbstractC2408c(AbstractC3151p abstractC3151p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c0 extends AbstractC3160z implements Function1 {
        c0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5499invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5499invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f24902k, PaymentAnalyticsEvent.f24832U, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2409d extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24985a;

        /* renamed from: c, reason: collision with root package name */
        int f24987c;

        C2409d(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24985a = obj;
            this.f24987c |= Integer.MIN_VALUE;
            Object k8 = a.this.k(null, null, null, null, null, this);
            return k8 == b.e() ? k8 : s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d0 extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24988a;

        /* renamed from: c, reason: collision with root package name */
        int f24990c;

        d0(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24988a = obj;
            this.f24990c |= Integer.MIN_VALUE;
            Object j8 = a.this.j(null, null, null, this);
            return j8 == b.e() ? j8 : s.a(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2410e extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2410e f24991a = new C2410e();

        C2410e() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5500invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5500invoke(((s) obj).k());
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e0 extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.t f24993b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(com.stripe.android.model.t tVar) {
            super(1);
            this.f24993b = tVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5501invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5501invoke(Object obj) {
            a aVar = a.this;
            aVar.S(aVar.f24902k.t(this.f24993b.i().f24550a, this.f24993b.f()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2411f extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24994a;

        /* renamed from: c, reason: collision with root package name */
        int f24996c;

        C2411f(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24994a = obj;
            this.f24996c |= Integer.MIN_VALUE;
            Object c8 = a.this.c(null, null, null, null, null, this);
            return c8 == b.e() ? c8 : s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2412g extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2412g f24997a = new C2412g();

        C2412g() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5502invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5502invoke(((s) obj).k());
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2413h extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f24998a;

        /* renamed from: c, reason: collision with root package name */
        int f25000c;

        C2413h(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f24998a = obj;
            this.f25000c |= Integer.MIN_VALUE;
            Object v8 = a.this.v(null, null, null, this);
            return v8 == b.e() ? v8 : s.a(v8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$i, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2414i extends AbstractC3160z implements Function1 {
        C2414i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5503invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5503invoke(Object obj) {
            a.this.R(PaymentAnalyticsEvent.f24862u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$j, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2415j extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25002a;

        /* renamed from: c, reason: collision with root package name */
        int f25004c;

        C2415j(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25002a = obj;
            this.f25004c |= Integer.MIN_VALUE;
            Object z8 = a.this.z(null, null, null, this);
            return z8 == b.e() ? z8 : s.a(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$k, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2416k extends AbstractC3160z implements Function1 {
        C2416k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5504invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5504invoke(Object obj) {
            a.this.R(PaymentAnalyticsEvent.f24872z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$l, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2417l extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25006a;

        /* renamed from: c, reason: collision with root package name */
        int f25008c;

        C2417l(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25006a = obj;
            this.f25008c |= Integer.MIN_VALUE;
            Object d8 = a.this.d(null, null, this);
            return d8 == b.e() ? d8 : s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$m, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2418m extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f25009a;

        /* renamed from: b, reason: collision with root package name */
        Object f25010b;

        /* renamed from: c, reason: collision with root package name */
        Object f25011c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f25012d;

        /* renamed from: f, reason: collision with root package name */
        int f25014f;

        C2418m(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25012d = obj;
            this.f25014f |= Integer.MIN_VALUE;
            Object s8 = a.this.s(null, null, null, this);
            return s8 == b.e() ? s8 : s.a(s8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$n, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2419n extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25015a;

        /* renamed from: c, reason: collision with root package name */
        int f25017c;

        C2419n(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25015a = obj;
            this.f25017c |= Integer.MIN_VALUE;
            Object M8 = a.this.M(null, null, null, this);
            return M8 == b.e() ? M8 : s.a(M8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$o, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2420o extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.b f25018a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f25019b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2420o(com.stripe.android.model.b bVar, a aVar) {
            super(1);
            this.f25018a = bVar;
            this.f25019b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5505invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5505invoke(Object obj) {
            String type;
            p f8 = this.f25018a.f();
            if (f8 == null || (type = f8.o()) == null) {
                w k8 = this.f25018a.k();
                type = k8 != null ? k8.getType() : null;
            }
            a aVar = this.f25019b;
            aVar.S(aVar.f24902k.r(type, this.f25019b.V(obj)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$p, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2421p extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25020a;

        /* renamed from: c, reason: collision with root package name */
        int f25022c;

        C2421p(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25020a = obj;
            this.f25022c |= Integer.MIN_VALUE;
            Object e8 = a.this.e(null, null, null, this);
            return e8 == b.e() ? e8 : s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$q, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2422q extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f25024b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2422q(c cVar) {
            super(1);
            this.f25024b = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5506invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5506invoke(Object obj) {
            a aVar = a.this;
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = aVar.f24902k;
            p f8 = this.f25024b.f();
            aVar.S(paymentAnalyticsRequestFactory.w(f8 != null ? f8.o() : null, a.this.V(obj)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$r, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2423r extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25025a;

        /* renamed from: c, reason: collision with root package name */
        int f25027c;

        C2423r(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25025a = obj;
            this.f25027c |= Integer.MIN_VALUE;
            Object i8 = a.this.i(null, null, this);
            return i8 == b.e() ? i8 : s.a(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$s, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2424s extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2424s f25028a = new C2424s();

        C2424s() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5507invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5507invoke(((s) obj).k());
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$t, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2425t extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25029a;

        /* renamed from: c, reason: collision with root package name */
        int f25031c;

        C2425t(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25029a = obj;
            this.f25031c |= Integer.MIN_VALUE;
            Object m8 = a.this.m(null, null, null, this);
            return m8 == b.e() ? m8 : s.a(m8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$u, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2426u extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2426u f25032a = new C2426u();

        C2426u() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5508invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5508invoke(((s) obj).k());
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$v, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2427v extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25033a;

        /* renamed from: c, reason: collision with root package name */
        int f25035c;

        C2427v(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25033a = obj;
            this.f25035c |= Integer.MIN_VALUE;
            Object B8 = a.this.B(null, null, this);
            return B8 == b.e() ? B8 : s.a(B8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$w, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2428w extends AbstractC3160z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f25037b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2428w(p pVar) {
            super(1);
            this.f25037b = pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5509invoke(((s) obj).k());
            return L5.I.f6487a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5509invoke(Object obj) {
            a aVar = a.this;
            aVar.S(aVar.f24902k.s(this.f25037b.k(), this.f25037b.i()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$x, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2429x extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25038a;

        /* renamed from: c, reason: collision with root package name */
        int f25040c;

        C2429x(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25038a = obj;
            this.f25040c |= Integer.MIN_VALUE;
            Object a8 = a.this.a(null, null, null, this);
            return a8 == b.e() ? a8 : s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$y, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2430y extends AbstractC3160z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2430y f25041a = new C2430y();

        C2430y() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5510invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5510invoke(((s) obj).k());
            return L5.I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$z, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2431z extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25042a;

        /* renamed from: c, reason: collision with root package name */
        int f25044c;

        C2431z(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25042a = obj;
            this.f25044c |= Integer.MIN_VALUE;
            Object A8 = a.this.A(null, null, null, this);
            return A8 == b.e() ? A8 : s.a(A8);
        }
    }

    public a(Context context, Function0 publishableKeyProvider, C3683c c3683c, InterfaceC3684d logger, g workContext, Set productUsageTokens, InterfaceC3868F stripeNetworkClient, InterfaceC3873c analyticsRequestExecutor, InterfaceC3069i fraudDetectionDataRepository, InterfaceC3167b.a cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, C2583e fraudDetectionDataParamsUtils, Set betas, String apiVersion, String sdkVersion) {
        AbstractC3159y.i(context, "context");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(logger, "logger");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(productUsageTokens, "productUsageTokens");
        AbstractC3159y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        AbstractC3159y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        AbstractC3159y.i(betas, "betas");
        AbstractC3159y.i(apiVersion, "apiVersion");
        AbstractC3159y.i(sdkVersion, "sdkVersion");
        this.f24892a = context;
        this.f24893b = publishableKeyProvider;
        this.f24894c = c3683c;
        this.f24895d = logger;
        this.f24896e = workContext;
        this.f24897f = productUsageTokens;
        this.f24898g = stripeNetworkClient;
        this.f24899h = analyticsRequestExecutor;
        this.f24900i = fraudDetectionDataRepository;
        this.f24901j = cardAccountRangeRepositoryFactory;
        this.f24902k = paymentAnalyticsRequestFactory;
        this.f24903l = fraudDetectionDataParamsUtils;
        this.f24904m = new j.b(c3683c, apiVersion, sdkVersion);
        T();
        AbstractC2829k.d(i6.N.a(workContext), null, null, new C0533a(null), 3, null);
    }

    private final r K(Set set) {
        return x.a("payment_user_agent", o(set));
    }

    static /* synthetic */ r L(a aVar, Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = M5.a0.f();
        }
        return aVar.K(set);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(com.stripe.android.model.b r12, x2.j.c r13, java.util.List r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2419n
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$n r0 = (com.stripe.android.networking.a.C2419n) r0
            int r1 = r0.f25017c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25017c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$n r0 = new com.stripe.android.networking.a$n
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f25015a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25017c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto Lb9
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            L5.t.b(r15)
            e3.e r15 = r11.f24903l
            java.util.Map r2 = r12.y()
            boolean r4 = r13.f()
            if (r4 == 0) goto L4d
            java.lang.String r4 = "client_secret"
            java.util.Map r2 = M5.Q.l(r2, r4)
        L4d:
            com.stripe.android.model.p r4 = r12.f()
            com.stripe.android.model.w r5 = r12.k()
            java.util.Map r2 = r11.b0(r2, r4, r5)
            com.stripe.android.networking.a$b r4 = com.stripe.android.networking.a.f24890n
            java.util.Map r14 = com.stripe.android.networking.a.C2407b.a(r4, r14)
            java.util.Map r14 = M5.Q.q(r2, r14)
            e3.d r2 = r11.W()
            java.util.Map r7 = r15.b(r14, r2)
            L5.s$a r14 = L5.s.f6511b     // Catch: java.lang.Throwable -> L7f
            com.stripe.android.model.n$c r14 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L7f
            java.lang.String r15 = r12.d()     // Catch: java.lang.Throwable -> L7f
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r14 = L5.s.b(r14)     // Catch: java.lang.Throwable -> L7f
            goto L8a
        L7f:
            r14 = move-exception
            L5.s$a r15 = L5.s.f6511b
            java.lang.Object r14 = L5.t.a(r14)
            java.lang.Object r14 = L5.s.b(r14)
        L8a:
            java.lang.Throwable r15 = L5.s.e(r14)
            if (r15 != 0) goto Lba
            java.lang.String r14 = (java.lang.String) r14
            r11.T()
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r15.l(r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            x2.j r13 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.u r14 = new c3.u
            r14.<init>()
            com.stripe.android.networking.a$o r15 = new com.stripe.android.networking.a$o
            r15.<init>(r12, r11)
            r0.f25017c = r3
            java.lang.Object r12 = r11.P(r13, r14, r15, r0)
            if (r12 != r1) goto Lb9
            return r1
        Lb9:
            return r12
        Lba:
            java.lang.Object r12 = L5.t.a(r15)
            java.lang.Object r12 = L5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.M(com.stripe.android.model.b, x2.j$c, java.util.List, P5.d):java.lang.Object");
    }

    private final Map N(String str, List list) {
        return M5.Q.q(M5.Q.e(x.a("client_secret", str)), f24890n.e(list));
    }

    private final AbstractC2408c O() {
        Object b8;
        try {
            s.a aVar = s.f6511b;
            String property = Security.getProperty("networkaddress.cache.ttl");
            Security.setProperty("networkaddress.cache.ttl", MBridgeConstans.ENDCARD_URL_TYPE_PL);
            b8 = s.b(new AbstractC2408c.b(property));
        } catch (Throwable th) {
            s.a aVar2 = s.f6511b;
            b8 = s.b(t.a(th));
        }
        AbstractC2408c.C0534a c0534a = AbstractC2408c.C0534a.f24982a;
        if (s.g(b8)) {
            b8 = c0534a;
        }
        return (AbstractC2408c) b8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x0054, B:17:0x0059, B:18:0x007f, B:22:0x003b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:12:0x0048, B:14:0x0054, B:17:0x0059, B:18:0x007f, B:22:0x003b), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P(x2.j r9, w2.InterfaceC3845a r10, kotlin.jvm.functions.Function1 r11, P5.d r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.stripe.android.networking.a.B
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.networking.a$B r0 = (com.stripe.android.networking.a.B) r0
            int r1 = r0.f24910d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24910d = r1
            goto L18
        L13:
            com.stripe.android.networking.a$B r0 = new com.stripe.android.networking.a$B
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f24908b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24910d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f24907a
            r10 = r9
            w2.a r10 = (w2.InterfaceC3845a) r10
            L5.t.b(r12)     // Catch: java.lang.Throwable -> L2e
            goto L48
        L2e:
            r9 = move-exception
            goto L80
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            L5.t.b(r12)
            L5.s$a r12 = L5.s.f6511b     // Catch: java.lang.Throwable -> L2e
            r0.f24907a = r10     // Catch: java.lang.Throwable -> L2e
            r0.f24910d = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r12 = r8.a0(r9, r11, r0)     // Catch: java.lang.Throwable -> L2e
            if (r12 != r1) goto L48
            return r1
        L48:
            x2.H r12 = (x2.C3870H) r12     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r9 = x2.AbstractC3863A.a(r12)     // Catch: java.lang.Throwable -> L2e
            v2.f r9 = r10.a(r9)     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L59
            java.lang.Object r9 = L5.s.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L8a
        L59:
            t2.b r9 = new t2.b     // Catch: java.lang.Throwable -> L2e
            java.lang.Class r10 = r10.getClass()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = r10.getSimpleName()     // Catch: java.lang.Throwable -> L2e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r11.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r12 = "Unable to parse response with "
            r11.append(r12)     // Catch: java.lang.Throwable -> L2e
            r11.append(r10)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r11.toString()     // Catch: java.lang.Throwable -> L2e
            r6 = 23
            r7 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L80:
            L5.s$a r10 = L5.s.f6511b
            java.lang.Object r9 = L5.t.a(r9)
            java.lang.Object r9 = L5.s.b(r9)
        L8a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.P(x2.j, w2.a, kotlin.jvm.functions.Function1, P5.d):java.lang.Object");
    }

    static /* synthetic */ Object Q(a aVar, j jVar, InterfaceC3845a interfaceC3845a, Function1 function1, P5.d dVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            function1 = C.f24911a;
        }
        return aVar.P(jVar, interfaceC3845a, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(PaymentAnalyticsEvent paymentAnalyticsEvent) {
        S(PaymentAnalyticsRequestFactory.v(this.f24902k, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    private final void T() {
        this.f24900i.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String V(Object obj) {
        Object obj2;
        Object b8;
        if (s.g(obj)) {
            obj2 = null;
        } else {
            obj2 = obj;
        }
        C3870H c3870h = (C3870H) obj2;
        Throwable e8 = s.e(obj);
        if (e8 != null) {
            return AbstractC3783d.a(e8);
        }
        if (c3870h == null || !c3870h.e()) {
            return null;
        }
        try {
            Z(c3870h);
            b8 = s.b(L5.I.f6487a);
        } catch (Throwable th) {
            s.a aVar = s.f6511b;
            b8 = s.b(t.a(th));
        }
        Throwable e9 = s.e(b8);
        if (e9 == null) {
            return null;
        }
        return AbstractC3783d.a(e9);
    }

    private final C2582d W() {
        return this.f24900i.a();
    }

    private final void Z(C3870H c3870h) {
        String str;
        z d8 = c3870h.d();
        if (d8 != null) {
            str = d8.a();
        } else {
            str = null;
        }
        String str2 = str;
        int b8 = c3870h.b();
        f e8 = e3.l.e(new w2.b().a(AbstractC3863A.a(c3870h)), this.f24892a);
        if (b8 != 429) {
            switch (b8) {
                case 400:
                case MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR /* 404 */:
                    throw new C3785f(e8, str2, b8, null, null, 24, null);
                case 401:
                    throw new C3782c(e8, str2);
                case 402:
                    throw new H2.a(e8, str2);
                case 403:
                    throw new C3788i(e8, str2);
                default:
                    throw new C3781b(e8, str2, b8, null, null, 24, null);
            }
        }
        throw new C3789j(e8, str2, null, null, 12, null);
    }

    private final Map b0(Map map, p pVar, w wVar) {
        Map map2;
        Set f8;
        Set f9;
        Object obj = map.get("payment_method_data");
        Map map3 = null;
        if (obj instanceof Map) {
            map2 = (Map) obj;
        } else {
            map2 = null;
        }
        if (map2 != null) {
            if (pVar == null || (f9 = pVar.i()) == null) {
                f9 = M5.a0.f();
            }
            Map o8 = M5.Q.o(map, x.a("payment_method_data", M5.Q.o(map2, K(f9))));
            if (o8 != null) {
                return o8;
            }
        }
        Object obj2 = map.get("source_data");
        if (obj2 instanceof Map) {
            map3 = (Map) obj2;
        }
        if (map3 != null) {
            if (wVar == null || (f8 = wVar.b()) == null) {
                f8 = M5.a0.f();
            }
            return M5.Q.o(map, x.a("source_data", M5.Q.o(map3, K(f8))));
        }
        return map;
    }

    static /* synthetic */ Map c0(a aVar, Map map, p pVar, w wVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            wVar = null;
        }
        return aVar.b0(map, pVar, wVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d0(com.stripe.android.model.b r5, x2.j.c r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.networking.a.K
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.networking.a$K r0 = (com.stripe.android.networking.a.K) r0
            int r1 = r0.f24938d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24938d = r1
            goto L18
        L13:
            com.stripe.android.networking.a$K r0 = new com.stripe.android.networking.a$K
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f24936b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24938d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f24935a
            com.stripe.android.model.b r5 = (com.stripe.android.model.b) r5
            L5.t.b(r7)
            L5.s r7 = (L5.s) r7
            java.lang.Object r6 = r7.k()
            goto L5a
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            L5.t.b(r7)
            boolean r7 = r6.f()
            if (r7 == 0) goto L8b
            com.stripe.android.model.p r7 = r5.f()
            if (r7 != 0) goto L4b
            goto L8b
        L4b:
            com.stripe.android.model.p r7 = r5.f()
            r0.f24935a = r5
            r0.f24938d = r3
            java.lang.Object r6 = r4.B(r7, r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            boolean r7 = L5.s.h(r6)
            if (r7 == 0) goto L86
            com.stripe.android.model.o r6 = (com.stripe.android.model.o) r6     // Catch: java.lang.Throwable -> L7a
            com.stripe.android.model.b$a r7 = com.stripe.android.model.b.f24213o     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r5.d()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r6.f24408a     // Catch: java.lang.Throwable -> L7a
            kotlin.jvm.internal.AbstractC3159y.f(r6)     // Catch: java.lang.Throwable -> L7a
            com.stripe.android.model.r r5 = r5.i()     // Catch: java.lang.Throwable -> L7a
            com.stripe.android.model.b r5 = r7.a(r0, r6, r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r5 = L5.s.b(r5)     // Catch: java.lang.Throwable -> L7a
            goto L8a
        L7a:
            r5 = move-exception
            L5.s$a r6 = L5.s.f6511b
            java.lang.Object r5 = L5.t.a(r5)
            java.lang.Object r5 = L5.s.b(r5)
            goto L8a
        L86:
            java.lang.Object r5 = L5.s.b(r6)
        L8a:
            return r5
        L8b:
            java.lang.Object r5 = L5.s.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.d0(com.stripe.android.model.b, x2.j$c, P5.d):java.lang.Object");
    }

    private final void e0(AbstractC2408c abstractC2408c) {
        if (abstractC2408c instanceof AbstractC2408c.b) {
            String a8 = ((AbstractC2408c.b) abstractC2408c).a();
            if (a8 == null) {
                a8 = "-1";
            }
            Security.setProperty("networkaddress.cache.ttl", a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f0(b3.v r12, x2.j.c r13, com.stripe.android.networking.PaymentAnalyticsEvent r14, P5.d r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.f0(b3.v, x2.j$c, com.stripe.android.networking.PaymentAnalyticsEvent, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(java.util.Set r12, java.lang.String r13, x2.j.c r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2431z
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$z r0 = (com.stripe.android.networking.a.C2431z) r0
            int r1 = r0.f25044c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25044c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$z r0 = new com.stripe.android.networking.a$z
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f25042a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25044c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto L5d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r15)
            x2.j$b r4 = r11.f24904m
            java.lang.String r5 = r11.U(r13)
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r6 = r14
            x2.j r13 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.v r14 = new c3.v
            r14.<init>()
            com.stripe.android.networking.a$A r15 = new com.stripe.android.networking.a$A
            r15.<init>(r12)
            r0.f25044c = r3
            java.lang.Object r12 = r11.P(r13, r14, r15, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.A(java.util.Set, java.lang.String, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(com.stripe.android.model.p r12, x2.j.c r13, P5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.C2427v
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$v r0 = (com.stripe.android.networking.a.C2427v) r0
            int r1 = r0.f25035c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25035c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$v r0 = new com.stripe.android.networking.a$v
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f25033a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25035c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r14)
            L5.s r14 = (L5.s) r14
            java.lang.Object r12 = r14.k()
            goto L87
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r14)
            r11.T()
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r14.t()
            java.util.Map r14 = r12.y()
            java.util.Set r2 = r12.i()
            L5.r r2 = r11.K(r2)
            java.util.Map r14 = M5.Q.o(r14, r2)
            e3.d r2 = r11.W()
            if (r2 == 0) goto L60
            java.util.Map r2 = r2.e()
            goto L61
        L60:
            r2 = 0
        L61:
            if (r2 != 0) goto L67
            java.util.Map r2 = M5.Q.h()
        L67:
            java.util.Map r7 = M5.Q.q(r14, r2)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            x2.j r13 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.v r14 = new c3.v
            r14.<init>()
            com.stripe.android.networking.a$w r2 = new com.stripe.android.networking.a$w
            r2.<init>(r12)
            r0.f25035c = r3
            java.lang.Object r12 = r11.P(r13, r14, r2, r0)
            if (r12 != r1) goto L87
            return r1
        L87:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.B(com.stripe.android.model.p, x2.j$c, P5.d):java.lang.Object");
    }

    public final void S(C3872b params) {
        AbstractC3159y.i(params, "params");
        this.f24899h.a(params);
    }

    public final String U(String paymentMethodId) {
        AbstractC3159y.i(paymentMethodId, "paymentMethodId");
        return f24890n.g("payment_methods/%s/detach", paymentMethodId);
    }

    public final /* synthetic */ String X(String paymentIntentId) {
        AbstractC3159y.i(paymentIntentId, "paymentIntentId");
        return f24890n.g("payment_intents/%s/link_account_sessions", paymentIntentId);
    }

    public final /* synthetic */ String Y(String setupIntentId) {
        AbstractC3159y.i(setupIntentId, "setupIntentId");
        return f24890n.g("setup_intents/%s/link_account_sessions", setupIntentId);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r12, com.stripe.android.model.d r13, x2.j.c r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2429x
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$x r0 = (com.stripe.android.networking.a.C2429x) r0
            int r1 = r0.f25040c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25040c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$x r0 = new com.stripe.android.networking.a$x
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f25038a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25040c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto L5d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r15)
            x2.j$b r4 = r11.f24904m
            java.lang.String r5 = r11.Y(r12)
            java.util.Map r7 = r13.a()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            x2.j r12 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.p r13 = new c3.p
            r13.<init>()
            com.stripe.android.networking.a$y r14 = com.stripe.android.networking.a.C2430y.f25041a
            r0.f25040c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.a(java.lang.String, com.stripe.android.model.d, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(4:9|10|11|12)(2:34|35))(4:36|37|38|(1:40)(1:41))|13|14|15|(4:17|(1:19)|20|21)(2:23|(2:25|26)(1:27))))|45|6|(0)(0)|13|14|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a0(x2.j r6, kotlin.jvm.functions.Function1 r7, P5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.networking.a.J
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.networking.a$J r0 = (com.stripe.android.networking.a.J) r0
            int r1 = r0.f24934g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24934g = r1
            goto L18
        L13:
            com.stripe.android.networking.a$J r0 = new com.stripe.android.networking.a$J
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f24932e
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24934g
            r3 = 1
            if (r2 == 0) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r6 = r0.f24931d
            com.stripe.android.networking.a$c r6 = (com.stripe.android.networking.a.AbstractC2408c) r6
            java.lang.Object r7 = r0.f24930c
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r1 = r0.f24929b
            x2.j r1 = (x2.j) r1
            java.lang.Object r0 = r0.f24928a
            com.stripe.android.networking.a r0 = (com.stripe.android.networking.a) r0
            L5.t.b(r8)     // Catch: java.lang.Throwable -> L3e
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L6a
        L3e:
            r8 = move-exception
            r4 = r8
            r8 = r6
            r6 = r1
            r1 = r0
            r0 = r4
            goto L75
        L45:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L4d:
            L5.t.b(r8)
            com.stripe.android.networking.a$c r8 = r5.O()
            L5.s$a r2 = L5.s.f6511b     // Catch: java.lang.Throwable -> L73
            x2.F r2 = r5.f24898g     // Catch: java.lang.Throwable -> L73
            r0.f24928a = r5     // Catch: java.lang.Throwable -> L73
            r0.f24929b = r6     // Catch: java.lang.Throwable -> L73
            r0.f24930c = r7     // Catch: java.lang.Throwable -> L73
            r0.f24931d = r8     // Catch: java.lang.Throwable -> L73
            r0.f24934g = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r2.a(r6, r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r1) goto L69
            return r1
        L69:
            r1 = r5
        L6a:
            x2.H r0 = (x2.C3870H) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = L5.s.b(r0)     // Catch: java.lang.Throwable -> L71
            goto L7f
        L71:
            r0 = move-exception
            goto L75
        L73:
            r0 = move-exception
            r1 = r5
        L75:
            L5.s$a r2 = L5.s.f6511b
            java.lang.Object r0 = L5.t.a(r0)
            java.lang.Object r0 = L5.s.b(r0)
        L7f:
            L5.s r2 = L5.s.a(r0)
            r7.invoke(r2)
            java.lang.Throwable r7 = L5.s.e(r0)
            if (r7 != 0) goto L9b
            x2.H r0 = (x2.C3870H) r0
            boolean r6 = r0.e()
            if (r6 == 0) goto L97
            r1.Z(r0)
        L97:
            r1.e0(r8)
            return r0
        L9b:
            boolean r8 = r7 instanceof java.io.IOException
            if (r8 == 0) goto Lab
            t2.a$a r8 = t2.C3780a.f38225f
            java.io.IOException r7 = (java.io.IOException) r7
            java.lang.String r6 = r6.h()
            t2.a r7 = r8.a(r7, r6)
        Lab:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.a0(x2.j, kotlin.jvm.functions.Function1, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(b3.C1861F r12, x2.j.c r13, P5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.b0
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$b0 r0 = (com.stripe.android.networking.a.b0) r0
            int r1 = r0.f24981c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24981c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$b0 r0 = new com.stripe.android.networking.a$b0
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f24979a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24981c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r14)
            L5.s r14 = (L5.s) r14
            java.lang.Object r12 = r14.k()
            goto L64
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r14)
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f24890n
            java.lang.String r2 = "3ds2/authenticate"
            java.lang.String r5 = com.stripe.android.networking.a.C2407b.b(r14, r2)
            java.util.Map r7 = r12.y()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            x2.j r12 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.D r13 = new c3.D
            r13.<init>()
            com.stripe.android.networking.a$c0 r14 = new com.stripe.android.networking.a$c0
            r14.<init>()
            r0.f24981c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L64
            return r1
        L64:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.b(b3.F, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r14, java.lang.String r15, java.lang.String r16, x2.j.c r17, java.util.List r18, P5.d r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r19
            boolean r2 = r1 instanceof com.stripe.android.networking.a.C2411f
            if (r2 == 0) goto L16
            r2 = r1
            com.stripe.android.networking.a$f r2 = (com.stripe.android.networking.a.C2411f) r2
            int r3 = r2.f24996c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f24996c = r3
            goto L1b
        L16:
            com.stripe.android.networking.a$f r2 = new com.stripe.android.networking.a$f
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f24994a
            java.lang.Object r3 = Q5.b.e()
            int r4 = r2.f24996c
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            L5.t.b(r1)
            L5.s r1 = (L5.s) r1
            java.lang.Object r1 = r1.k()
            goto L77
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            L5.t.b(r1)
            x2.j$b r6 = r0.f24904m
            com.stripe.android.networking.a$b r1 = com.stripe.android.networking.a.f24890n
            r4 = r15
            r7 = r16
            java.lang.String r7 = r1.i(r15, r7)
            java.lang.String r4 = "client_secret"
            r8 = r14
            L5.r r4 = L5.x.a(r4, r14)
            java.util.Map r4 = M5.Q.e(r4)
            r8 = r18
            java.util.Map r1 = com.stripe.android.networking.a.C2407b.a(r1, r8)
            java.util.Map r9 = M5.Q.q(r4, r1)
            r11 = 8
            r12 = 0
            r10 = 0
            r8 = r17
            x2.j r1 = x2.j.b.d(r6, r7, r8, r9, r10, r11, r12)
            c3.x r4 = new c3.x
            r4.<init>()
            com.stripe.android.networking.a$g r6 = com.stripe.android.networking.a.C2412g.f24997a
            r2.f24996c = r5
            java.lang.Object r1 = r13.P(r1, r4, r6, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.c(java.lang.String, java.lang.String, java.lang.String, x2.j$c, java.util.List, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r17, x2.j.c r18, P5.d r19) {
        /*
            r16 = this;
            r7 = r16
            r0 = r19
            boolean r1 = r0 instanceof com.stripe.android.networking.a.C2417l
            if (r1 == 0) goto L18
            r1 = r0
            com.stripe.android.networking.a$l r1 = (com.stripe.android.networking.a.C2417l) r1
            int r2 = r1.f25008c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f25008c = r2
        L16:
            r4 = r1
            goto L1e
        L18:
            com.stripe.android.networking.a$l r1 = new com.stripe.android.networking.a$l
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r4.f25006a
            java.lang.Object r8 = Q5.b.e()
            int r1 = r4.f25008c
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            L5.t.b(r0)
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            goto L77
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            L5.t.b(r0)
            x2.j$b r9 = r7.f24904m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f24890n
            java.lang.String r1 = "3ds2/challenge_complete"
            java.lang.String r10 = com.stripe.android.networking.a.C2407b.b(r0, r1)
            java.lang.String r0 = "source"
            r1 = r17
            L5.r r0 = L5.x.a(r0, r1)
            java.util.Map r12 = M5.Q.e(r0)
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r18
            x2.j r1 = x2.j.b.d(r9, r10, r11, r12, r13, r14, r15)
            c3.D r3 = new c3.D
            r3.<init>()
            r4.f25008c = r2
            r5 = 0
            r6 = 4
            r9 = 0
            r0 = r16
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = Q(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L77
            return r8
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.d(java.lang.String, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(com.stripe.android.model.c r19, x2.j.c r20, java.util.List r21, P5.d r22) {
        /*
            r18 = this;
            r7 = r18
            r0 = r22
            boolean r1 = r0 instanceof com.stripe.android.networking.a.C2421p
            if (r1 == 0) goto L18
            r1 = r0
            com.stripe.android.networking.a$p r1 = (com.stripe.android.networking.a.C2421p) r1
            int r2 = r1.f25022c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f25022c = r2
        L16:
            r8 = r1
            goto L1e
        L18:
            com.stripe.android.networking.a$p r1 = new com.stripe.android.networking.a$p
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r8.f25020a
            java.lang.Object r9 = Q5.b.e()
            int r1 = r8.f25022c
            r10 = 1
            if (r1 == 0) goto L3e
            if (r1 != r10) goto L36
            L5.t.b(r0)
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            goto Lb9
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            L5.t.b(r0)
            L5.s$a r0 = L5.s.f6511b     // Catch: java.lang.Throwable -> L55
            com.stripe.android.model.u$b r0 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r19.d()     // Catch: java.lang.Throwable -> L55
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = L5.s.b(r0)     // Catch: java.lang.Throwable -> L55
            goto L60
        L55:
            r0 = move-exception
            L5.s$a r1 = L5.s.f6511b
            java.lang.Object r0 = L5.t.a(r0)
            java.lang.Object r0 = L5.s.b(r0)
        L60:
            java.lang.Throwable r1 = L5.s.e(r0)
            if (r1 != 0) goto Lba
            java.lang.String r0 = (java.lang.String) r0
            r18.T()
            x2.j$b r11 = r7.f24904m
            com.stripe.android.networking.a$b r12 = com.stripe.android.networking.a.f24890n
            java.lang.String r0 = r12.m(r0)
            e3.e r13 = r7.f24903l
            java.util.Map r2 = r19.y()
            com.stripe.android.model.p r3 = r19.f()
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r18
            java.util.Map r1 = c0(r1, r2, r3, r4, r5, r6)
            r2 = r21
            java.util.Map r2 = com.stripe.android.networking.a.C2407b.a(r12, r2)
            java.util.Map r1 = M5.Q.q(r1, r2)
            e3.d r2 = r18.W()
            java.util.Map r14 = r13.b(r1, r2)
            r16 = 8
            r17 = 0
            r15 = 0
            r12 = r0
            r13 = r20
            x2.j r0 = x2.j.b.d(r11, r12, r13, r14, r15, r16, r17)
            c3.x r1 = new c3.x
            r1.<init>()
            com.stripe.android.networking.a$q r2 = new com.stripe.android.networking.a$q
            r3 = r19
            r2.<init>(r3)
            r8.f25022c = r10
            java.lang.Object r0 = r7.P(r0, r1, r2, r8)
            if (r0 != r9) goto Lb9
            return r9
        Lb9:
            return r0
        Lba:
            java.lang.Object r0 = L5.t.a(r1)
            java.lang.Object r0 = L5.s.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.e(com.stripe.android.model.c, x2.j$c, java.util.List, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.String r12, x2.j.c r13, P5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.N
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$N r0 = (com.stripe.android.networking.a.N) r0
            int r1 = r0.f24945c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24945c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$N r0 = new com.stripe.android.networking.a$N
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f24943a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24945c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r14)
            L5.s r14 = (L5.s) r14
            java.lang.Object r12 = r14.k()
            goto L8c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r14)
            L5.s$a r14 = L5.s.f6511b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.u$b r14 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L4a
            r14.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r14 = L5.s.b(r14)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r14 = move-exception
            L5.s$a r2 = L5.s.f6511b
            java.lang.Object r14 = L5.t.a(r14)
            java.lang.Object r14 = L5.s.b(r14)
        L55:
            java.lang.Throwable r2 = L5.s.e(r14)
            if (r2 != 0) goto L8d
            java.lang.String r14 = (java.lang.String) r14
            r11.T()
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r2 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r2.v(r14)
            java.util.List r14 = M5.AbstractC1246t.m()
            java.util.Map r7 = r11.N(r12, r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            x2.j r12 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.x r13 = new c3.x
            r13.<init>()
            com.stripe.android.networking.a$O r14 = new com.stripe.android.networking.a$O
            r14.<init>()
            r0.f24945c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L8c
            return r1
        L8c:
            return r12
        L8d:
            java.lang.Object r12 = L5.t.a(r2)
            java.lang.Object r12 = L5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.f(java.lang.String, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.String r12, java.util.Set r13, x2.j.c r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.Q
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$Q r0 = (com.stripe.android.networking.a.Q) r0
            int r1 = r0.f24952c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24952c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$Q r0 = new com.stripe.android.networking.a$Q
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f24950a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24952c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto L5f
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r15)
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r15.w(r12)
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r6 = r14
            x2.j r12 = x2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            c3.k r14 = new c3.k
            r14.<init>()
            com.stripe.android.networking.a$R r15 = new com.stripe.android.networking.a$R
            r15.<init>(r13)
            r0.f24952c = r3
            java.lang.Object r12 = r11.P(r12, r14, r15, r0)
            if (r12 != r1) goto L5f
            return r1
        L5f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.g(java.lang.String, java.util.Set, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r12, x2.j.c r13, java.util.List r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.X
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$X r0 = (com.stripe.android.networking.a.X) r0
            int r1 = r0.f24969c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24969c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$X r0 = new com.stripe.android.networking.a$X
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f24967a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24969c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto L88
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r15)
            L5.s$a r15 = L5.s.f6511b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.u$b r15 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L4a
            r15.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r15 = r15.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r15 = L5.s.b(r15)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r15 = move-exception
            L5.s$a r2 = L5.s.f6511b
            java.lang.Object r15 = L5.t.a(r15)
            java.lang.Object r15 = L5.s.b(r15)
        L55:
            java.lang.Throwable r2 = L5.s.e(r15)
            if (r2 != 0) goto L89
            java.lang.String r15 = (java.lang.String) r15
            r11.T()
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r2 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r2.y(r15)
            java.util.Map r7 = r11.N(r12, r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            x2.j r12 = x2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            c3.x r13 = new c3.x
            r13.<init>()
            com.stripe.android.networking.a$Y r14 = new com.stripe.android.networking.a$Y
            r14.<init>()
            r0.f24969c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L88
            return r1
        L88:
            return r12
        L89:
            java.lang.Object r12 = L5.t.a(r2)
            java.lang.Object r12 = L5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.h(java.lang.String, x2.j$c, java.util.List, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(b3.s r12, x2.j.c r13, P5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.C2423r
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$r r0 = (com.stripe.android.networking.a.C2423r) r0
            int r1 = r0.f25027c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25027c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$r r0 = new com.stripe.android.networking.a$r
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f25025a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25027c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r14)
            L5.s r14 = (L5.s) r14
            java.lang.Object r12 = r14.k()
            goto L5f
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r14)
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r14.n()
            java.util.Map r7 = r12.a()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            x2.j r12 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.p r13 = new c3.p
            r13.<init>()
            com.stripe.android.networking.a$s r14 = com.stripe.android.networking.a.C2424s.f25028a
            r0.f25027c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L5f
            return r1
        L5f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.i(b3.s, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.String r12, com.stripe.android.model.t r13, x2.j.c r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.d0
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$d0 r0 = (com.stripe.android.networking.a.d0) r0
            int r1 = r0.f24990c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24990c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$d0 r0 = new com.stripe.android.networking.a$d0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f24988a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24990c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto L65
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r15)
            r11.T()
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r15.s(r12)
            java.util.Map r7 = r13.y()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            x2.j r12 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.v r14 = new c3.v
            r14.<init>()
            com.stripe.android.networking.a$e0 r15 = new com.stripe.android.networking.a$e0
            r15.<init>(r13)
            r0.f24990c = r3
            java.lang.Object r12 = r11.P(r12, r14, r15, r0)
            if (r12 != r1) goto L65
            return r1
        L65:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.j(java.lang.String, com.stripe.android.model.t, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.String r14, java.lang.String r15, java.lang.String r16, x2.j.c r17, java.util.List r18, P5.d r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r19
            boolean r2 = r1 instanceof com.stripe.android.networking.a.C2409d
            if (r2 == 0) goto L16
            r2 = r1
            com.stripe.android.networking.a$d r2 = (com.stripe.android.networking.a.C2409d) r2
            int r3 = r2.f24987c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f24987c = r3
            goto L1b
        L16:
            com.stripe.android.networking.a$d r2 = new com.stripe.android.networking.a$d
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f24985a
            java.lang.Object r3 = Q5.b.e()
            int r4 = r2.f24987c
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            L5.t.b(r1)
            L5.s r1 = (L5.s) r1
            java.lang.Object r1 = r1.k()
            goto L77
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            L5.t.b(r1)
            x2.j$b r6 = r0.f24904m
            com.stripe.android.networking.a$b r1 = com.stripe.android.networking.a.f24890n
            r4 = r15
            r7 = r16
            java.lang.String r7 = r1.h(r15, r7)
            java.lang.String r4 = "client_secret"
            r8 = r14
            L5.r r4 = L5.x.a(r4, r14)
            java.util.Map r4 = M5.Q.e(r4)
            r8 = r18
            java.util.Map r1 = com.stripe.android.networking.a.C2407b.a(r1, r8)
            java.util.Map r9 = M5.Q.q(r4, r1)
            r11 = 8
            r12 = 0
            r10 = 0
            r8 = r17
            x2.j r1 = x2.j.b.d(r6, r7, r8, r9, r10, r11, r12)
            c3.u r4 = new c3.u
            r4.<init>()
            com.stripe.android.networking.a$e r6 = com.stripe.android.networking.a.C2410e.f24991a
            r2.f24987c = r5
            java.lang.Object r1 = r13.P(r1, r4, r6, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.k(java.lang.String, java.lang.String, java.lang.String, x2.j$c, java.util.List, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(java.lang.String r17, java.lang.String r18, x2.j.c r19, P5.d r20) {
        /*
            r16 = this;
            r7 = r16
            r0 = r20
            r1 = 1
            boolean r2 = r0 instanceof com.stripe.android.networking.a.I
            if (r2 == 0) goto L19
            r2 = r0
            com.stripe.android.networking.a$I r2 = (com.stripe.android.networking.a.I) r2
            int r3 = r2.f24927c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f24927c = r3
        L17:
            r4 = r2
            goto L1f
        L19:
            com.stripe.android.networking.a$I r2 = new com.stripe.android.networking.a$I
            r2.<init>(r0)
            goto L17
        L1f:
            java.lang.Object r0 = r4.f24925a
            java.lang.Object r8 = Q5.b.e()
            int r2 = r4.f24927c
            if (r2 == 0) goto L3d
            if (r2 != r1) goto L35
            L5.t.b(r0)
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            goto L90
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            L5.t.b(r0)
            x2.j$b r9 = r7.f24904m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f24890n
            java.lang.String r10 = r0.p()
            java.lang.String r0 = "request_surface"
            java.lang.String r2 = "android_payment_element"
            L5.r r0 = L5.x.a(r0, r2)
            java.lang.String r2 = "consumer_session_client_secret"
            r3 = r17
            L5.r r2 = L5.x.a(r2, r3)
            java.util.Map r2 = M5.Q.e(r2)
            java.lang.String r3 = "credentials"
            L5.r r2 = L5.x.a(r3, r2)
            r3 = 2
            L5.r[] r3 = new L5.r[r3]
            r5 = 0
            r3[r5] = r0
            r3[r1] = r2
            java.util.Map r12 = M5.Q.k(r3)
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r19
            x2.j r2 = x2.j.b.d(r9, r10, r11, r12, r13, r14, r15)
            c3.h r3 = new c3.h
            r3.<init>()
            r4.f24927c = r1
            r5 = 0
            r6 = 4
            r9 = 0
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = Q(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L90
            return r8
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.l(java.lang.String, java.lang.String, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(java.lang.String r12, com.stripe.android.model.d r13, x2.j.c r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2425t
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$t r0 = (com.stripe.android.networking.a.C2425t) r0
            int r1 = r0.f25031c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25031c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$t r0 = new com.stripe.android.networking.a$t
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f25029a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25031c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto L5d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r15)
            x2.j$b r4 = r11.f24904m
            java.lang.String r5 = r11.X(r12)
            java.util.Map r7 = r13.a()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            x2.j r12 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.p r13 = new c3.p
            r13.<init>()
            com.stripe.android.networking.a$u r14 = com.stripe.android.networking.a.C2426u.f25032a
            r0.f25031c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.m(java.lang.String, com.stripe.android.model.d, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(l2.C3166a r18, x2.j.c r19, P5.d r20) {
        /*
            r17 = this;
            r7 = r17
            r0 = r20
            r1 = 1
            boolean r2 = r0 instanceof com.stripe.android.networking.a.D
            if (r2 == 0) goto L19
            r2 = r0
            com.stripe.android.networking.a$D r2 = (com.stripe.android.networking.a.D) r2
            int r3 = r2.f24915d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f24915d = r3
        L17:
            r4 = r2
            goto L1f
        L19:
            com.stripe.android.networking.a$D r2 = new com.stripe.android.networking.a$D
            r2.<init>(r0)
            goto L17
        L1f:
            java.lang.Object r0 = r4.f24913b
            java.lang.Object r8 = Q5.b.e()
            int r2 = r4.f24915d
            if (r2 == 0) goto L41
            if (r2 != r1) goto L39
            java.lang.Object r1 = r4.f24912a
            com.stripe.android.networking.a r1 = (com.stripe.android.networking.a) r1
            L5.t.b(r0)
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            goto L9f
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            L5.t.b(r0)
            x2.j$b r9 = r7.f24904m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f24890n
            java.lang.String r2 = "card-metadata"
            java.lang.String r10 = com.stripe.android.networking.a.C2407b.d(r0, r2)
            r15 = 5
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11 = r19
            x2.j$c r11 = x2.j.c.c(r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = "key"
            java.lang.String r2 = r19.e()
            L5.r r0 = L5.x.a(r0, r2)
            java.lang.String r2 = r18.b()
            java.lang.String r3 = "bin_prefix"
            L5.r r2 = L5.x.a(r3, r2)
            r3 = 2
            L5.r[] r3 = new L5.r[r3]
            r5 = 0
            r3[r5] = r0
            r3[r1] = r2
            java.util.Map r12 = M5.Q.k(r3)
            r14 = 8
            r15 = 0
            r13 = 0
            x2.j r2 = x2.j.b.b(r9, r10, r11, r12, r13, r14, r15)
            c3.e r3 = new c3.e
            r0 = r18
            r3.<init>(r0)
            r4.f24912a = r7
            r4.f24915d = r1
            r5 = 0
            r6 = 4
            r9 = 0
            r0 = r17
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = Q(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L9e
            return r8
        L9e:
            r1 = r7
        L9f:
            java.lang.Throwable r2 = L5.s.e(r0)
            if (r2 == 0) goto Laa
            com.stripe.android.networking.PaymentAnalyticsEvent r2 = com.stripe.android.networking.PaymentAnalyticsEvent.f24811C0
            r1.R(r2)
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.n(l2.a, x2.j$c, P5.d):java.lang.Object");
    }

    @Override // e3.m
    public String o(Set attribution) {
        AbstractC3159y.i(attribution, "attribution");
        return AbstractC1246t.w0(M5.a0.m(M5.a0.m(M5.a0.d("stripe-android/20.49.0"), this.f24897f), attribution), ";", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.String r17, java.lang.String r18, java.util.Map r19, x2.j.c r20, P5.d r21) {
        /*
            r16 = this;
            r7 = r16
            r0 = r21
            r1 = 1
            boolean r2 = r0 instanceof com.stripe.android.networking.a.a0
            if (r2 == 0) goto L19
            r2 = r0
            com.stripe.android.networking.a$a0 r2 = (com.stripe.android.networking.a.a0) r2
            int r3 = r2.f24978c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f24978c = r3
        L17:
            r4 = r2
            goto L1f
        L19:
            com.stripe.android.networking.a$a0 r2 = new com.stripe.android.networking.a$a0
            r2.<init>(r0)
            goto L17
        L1f:
            java.lang.Object r0 = r4.f24976a
            java.lang.Object r8 = Q5.b.e()
            int r2 = r4.f24978c
            if (r2 == 0) goto L3e
            if (r2 != r1) goto L36
            L5.t.b(r0)
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            goto Lae
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            L5.t.b(r0)
            x2.j$b r9 = r7.f24904m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f24890n
            java.lang.String r10 = r0.z()
            java.lang.String r0 = "request_surface"
            java.lang.String r2 = "android_payment_element"
            L5.r r0 = L5.x.a(r0, r2)
            java.lang.String r2 = "consumer_session_client_secret"
            r3 = r17
            L5.r r2 = L5.x.a(r2, r3)
            java.util.Map r2 = M5.Q.e(r2)
            java.lang.String r3 = "credentials"
            L5.r r2 = L5.x.a(r3, r2)
            java.lang.String r3 = "id"
            r5 = r18
            L5.r r3 = L5.x.a(r3, r5)
            r5 = 0
            L5.r r5 = L(r7, r5, r1, r5)
            r6 = 4
            L5.r[] r6 = new L5.r[r6]
            r11 = 0
            r6[r11] = r0
            r6[r1] = r2
            r0 = 2
            r6[r0] = r3
            r0 = 3
            r6[r0] = r5
            java.util.Map r0 = M5.Q.k(r6)
            if (r19 != 0) goto L89
            java.util.Map r2 = M5.Q.h()
            goto L8b
        L89:
            r2 = r19
        L8b:
            java.util.Map r12 = M5.Q.q(r0, r2)
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r20
            x2.j r2 = x2.j.b.d(r9, r10, r11, r12, r13, r14, r15)
            c3.g r3 = c3.C1921g.f14915b
            r4.f24978c = r1
            r5 = 0
            r6 = 4
            r9 = 0
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = Q(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto Lae
            return r8
        Lae:
            boolean r1 = L5.s.h(r0)
            if (r1 == 0) goto Lba
            b3.n r0 = (b3.n) r0
            java.lang.String r0 = r0.getId()
        Lba:
            java.lang.Object r0 = L5.s.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.p(java.lang.String, java.lang.String, java.util.Map, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(java.lang.String r6, x2.j.c r7, java.util.List r8, P5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.a.Z
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.networking.a$Z r0 = (com.stripe.android.networking.a.Z) r0
            int r1 = r0.f24973c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24973c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$Z r0 = new com.stripe.android.networking.a$Z
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f24971a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24973c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            L5.t.b(r9)
            L5.s r9 = (L5.s) r9
            java.lang.Object r6 = r9.k()
            goto L71
        L3b:
            L5.t.b(r9)
            com.stripe.android.model.n$c$a r9 = com.stripe.android.model.n.c.f24369c
            boolean r9 = r9.a(r6)
            if (r9 == 0) goto L4f
            r0.f24973c = r4
            java.lang.Object r6 = r5.y(r6, r7, r8, r0)
            if (r6 != r1) goto L71
            return r1
        L4f:
            com.stripe.android.model.u$b$a r9 = com.stripe.android.model.u.b.f24714c
            boolean r9 = r9.a(r6)
            if (r9 == 0) goto L60
            r0.f24973c = r3
            java.lang.Object r6 = r5.h(r6, r7, r8, r0)
            if (r6 != r1) goto L71
            return r1
        L60:
            L5.s$a r6 = L5.s.f6511b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid client secret."
            r6.<init>(r7)
            java.lang.Object r6 = L5.t.a(r6)
            java.lang.Object r6 = L5.s.b(r6)
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.q(java.lang.String, x2.j$c, java.util.List, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(x2.j.c r17, java.util.Map r18, P5.d r19) {
        /*
            r16 = this;
            r7 = r16
            r0 = r19
            boolean r1 = r0 instanceof com.stripe.android.networking.a.P
            if (r1 == 0) goto L18
            r1 = r0
            com.stripe.android.networking.a$P r1 = (com.stripe.android.networking.a.P) r1
            int r2 = r1.f24949c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f24949c = r2
        L16:
            r4 = r1
            goto L1e
        L18:
            com.stripe.android.networking.a$P r1 = new com.stripe.android.networking.a$P
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r4.f24947a
            java.lang.Object r8 = Q5.b.e()
            int r1 = r4.f24949c
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            L5.t.b(r0)
            L5.s r0 = (L5.s) r0
            java.lang.Object r0 = r0.k()
            goto L6b
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            L5.t.b(r0)
            x2.j$b r9 = r7.f24904m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f24890n
            java.lang.String r10 = r0.r()
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r17
            r12 = r18
            x2.j r1 = x2.j.b.b(r9, r10, r11, r12, r13, r14, r15)
            c3.s r3 = new c3.s
            r3.<init>()
            r4.f24949c = r2
            r5 = 0
            r6 = 4
            r9 = 0
            r0 = r16
            r2 = r3
            r3 = r5
            r5 = r6
            r6 = r9
            java.lang.Object r0 = Q(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto L6b
            return r8
        L6b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.r(x2.j$c, java.util.Map, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(com.stripe.android.model.b r6, x2.j.c r7, java.util.List r8, P5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.a.C2418m
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.networking.a$m r0 = (com.stripe.android.networking.a.C2418m) r0
            int r1 = r0.f25014f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25014f = r1
            goto L18
        L13:
            com.stripe.android.networking.a$m r0 = new com.stripe.android.networking.a$m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f25012d
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25014f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            L5.t.b(r9)
            L5.s r9 = (L5.s) r9
            java.lang.Object r6 = r9.k()
            goto L85
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f25011c
            r8 = r6
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r6 = r0.f25010b
            r7 = r6
            x2.j$c r7 = (x2.j.c) r7
            java.lang.Object r6 = r0.f25009a
            com.stripe.android.networking.a r6 = (com.stripe.android.networking.a) r6
            L5.t.b(r9)
            L5.s r9 = (L5.s) r9
            java.lang.Object r9 = r9.k()
            goto L65
        L52:
            L5.t.b(r9)
            r0.f25009a = r5
            r0.f25010b = r7
            r0.f25011c = r8
            r0.f25014f = r4
            java.lang.Object r9 = r5.d0(r6, r7, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            r6 = r5
        L65:
            java.lang.Throwable r2 = L5.s.e(r9)
            if (r2 != 0) goto L7d
            com.stripe.android.model.b r9 = (com.stripe.android.model.b) r9
            r2 = 0
            r0.f25009a = r2
            r0.f25010b = r2
            r0.f25011c = r2
            r0.f25014f = r3
            java.lang.Object r6 = r6.M(r9, r7, r8, r0)
            if (r6 != r1) goto L85
            return r1
        L7d:
            java.lang.Object r6 = L5.t.a(r2)
            java.lang.Object r6 = L5.s.b(r6)
        L85:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.s(com.stripe.android.model.b, x2.j$c, java.util.List, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(java.lang.String r12, x2.j.c r13, P5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.L
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$L r0 = (com.stripe.android.networking.a.L) r0
            int r1 = r0.f24941c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24941c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$L r0 = new com.stripe.android.networking.a$L
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f24939a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24941c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r14)
            L5.s r14 = (L5.s) r14
            java.lang.Object r12 = r14.k()
            goto L8c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r14)
            L5.s$a r14 = L5.s.f6511b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.n$c r14 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L4a
            r14.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r14 = L5.s.b(r14)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r14 = move-exception
            L5.s$a r2 = L5.s.f6511b
            java.lang.Object r14 = L5.t.a(r14)
            java.lang.Object r14 = L5.s.b(r14)
        L55:
            java.lang.Throwable r2 = L5.s.e(r14)
            if (r2 != 0) goto L8d
            java.lang.String r14 = (java.lang.String) r14
            r11.T()
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r2 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r2.u(r14)
            java.util.List r14 = M5.AbstractC1246t.m()
            java.util.Map r7 = r11.N(r12, r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            x2.j r12 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.u r13 = new c3.u
            r13.<init>()
            com.stripe.android.networking.a$M r14 = new com.stripe.android.networking.a$M
            r14.<init>()
            r0.f24941c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L8c
            return r1
        L8c:
            return r12
        L8d:
            java.lang.Object r12 = L5.t.a(r2)
            java.lang.Object r12 = L5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.t(java.lang.String, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(com.stripe.android.model.l r12, java.util.Set r13, x2.j.c r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.G
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$G r0 = (com.stripe.android.networking.a.G) r0
            int r1 = r0.f24922c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24922c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$G r0 = new com.stripe.android.networking.a$G
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f24920a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24922c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto L62
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r15)
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r15.t()
            java.util.Map r7 = r12.y()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            x2.j r12 = x2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            c3.w r14 = new c3.w
            r14.<init>()
            com.stripe.android.networking.a$H r15 = new com.stripe.android.networking.a$H
            r15.<init>(r13)
            r0.f24922c = r3
            java.lang.Object r12 = r11.P(r12, r14, r15, r0)
            if (r12 != r1) goto L62
            return r1
        L62:
            boolean r13 = L5.s.h(r12)
            if (r13 == 0) goto L6e
            b3.B r12 = (b3.C1857B) r12
            java.util.List r12 = r12.b()
        L6e:
            java.lang.Object r12 = L5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.u(com.stripe.android.model.l, java.util.Set, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(java.lang.String r12, java.lang.String r13, x2.j.c r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2413h
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$h r0 = (com.stripe.android.networking.a.C2413h) r0
            int r1 = r0.f25000c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25000c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$h r0 = new com.stripe.android.networking.a$h
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f24998a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25000c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto L6b
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r15)
            r11.T()
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r15.j(r12)
            java.lang.String r12 = "source"
            L5.r r12 = L5.x.a(r12, r13)
            java.util.Map r7 = M5.Q.e(r12)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            x2.j r12 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.u r13 = new c3.u
            r13.<init>()
            com.stripe.android.networking.a$i r14 = new com.stripe.android.networking.a$i
            r14.<init>()
            r0.f25000c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L6b
            return r1
        L6b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.v(java.lang.String, java.lang.String, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(b3.v r5, x2.j.c r6, P5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.networking.a.S
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.networking.a$S r0 = (com.stripe.android.networking.a.S) r0
            int r1 = r0.f24957c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24957c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$S r0 = new com.stripe.android.networking.a$S
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f24955a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24957c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r7)
            L5.s r7 = (L5.s) r7
            java.lang.Object r5 = r7.k()
            goto L44
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            L5.t.b(r7)
            r0.f24957c = r3
            r7 = 0
            java.lang.Object r5 = r4.f0(r5, r6, r7, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.w(b3.v, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(x2.j.c r13, P5.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.E
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$E r0 = (com.stripe.android.networking.a.E) r0
            int r1 = r0.f24918c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24918c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$E r0 = new com.stripe.android.networking.a$E
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f24916a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24918c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r14)
            L5.s r14 = (L5.s) r14
            java.lang.Object r13 = r14.k()
            goto L75
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            L5.t.b(r14)
            x2.j$b r4 = r12.f24904m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f24890n
            java.lang.String r2 = "fpx/bank_statuses"
            java.lang.String r5 = com.stripe.android.networking.a.C2407b.b(r14, r2)
            r10 = 5
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            x2.j$c r6 = x2.j.c.c(r6, r7, r8, r9, r10, r11)
            java.lang.String r13 = "account_holder_type"
            java.lang.String r14 = "individual"
            L5.r r13 = L5.x.a(r13, r14)
            java.util.Map r7 = M5.Q.e(r13)
            r9 = 8
            r10 = 0
            r8 = 0
            x2.j r13 = x2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            c3.q r14 = new c3.q
            r14.<init>()
            com.stripe.android.networking.a$F r2 = new com.stripe.android.networking.a$F
            r2.<init>()
            r0.f24918c = r3
            java.lang.Object r13 = r12.P(r13, r14, r2, r0)
            if (r13 != r1) goto L75
            return r1
        L75:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.x(x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(java.lang.String r12, x2.j.c r13, java.util.List r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.V
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$V r0 = (com.stripe.android.networking.a.V) r0
            int r1 = r0.f24965c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24965c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$V r0 = new com.stripe.android.networking.a$V
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f24963a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f24965c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto L97
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r15)
            L5.s$a r15 = L5.s.f6511b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.n$c r15 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L4a
            r15.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r15 = r15.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r15 = L5.s.b(r15)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r15 = move-exception
            L5.s$a r2 = L5.s.f6511b
            java.lang.Object r15 = L5.t.a(r15)
            java.lang.Object r15 = L5.s.b(r15)
        L55:
            java.lang.Throwable r2 = L5.s.e(r15)
            if (r2 != 0) goto L98
            java.lang.String r15 = (java.lang.String) r15
            boolean r2 = r13.f()
            if (r2 == 0) goto L6b
            com.stripe.android.networking.a$b r12 = com.stripe.android.networking.a.f24890n
            java.util.Map r12 = com.stripe.android.networking.a.C2407b.a(r12, r14)
        L69:
            r7 = r12
            goto L70
        L6b:
            java.util.Map r12 = r11.N(r12, r14)
            goto L69
        L70:
            r11.T()
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r12 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r12.x(r15)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            x2.j r12 = x2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            c3.u r13 = new c3.u
            r13.<init>()
            com.stripe.android.networking.a$W r14 = new com.stripe.android.networking.a$W
            r14.<init>()
            r0.f24965c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L97
            return r1
        L97:
            return r12
        L98:
            java.lang.Object r12 = L5.t.a(r2)
            java.lang.Object r12 = L5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.y(java.lang.String, x2.j$c, java.util.List, P5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // e3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(java.lang.String r12, java.lang.String r13, x2.j.c r14, P5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2415j
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$j r0 = (com.stripe.android.networking.a.C2415j) r0
            int r1 = r0.f25004c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25004c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$j r0 = new com.stripe.android.networking.a$j
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f25002a
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f25004c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            L5.t.b(r15)
            L5.s r15 = (L5.s) r15
            java.lang.Object r12 = r15.k()
            goto L68
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            L5.t.b(r15)
            x2.j$b r4 = r11.f24904m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f24890n
            java.lang.String r5 = r15.k(r12)
            java.lang.String r12 = "source"
            L5.r r12 = L5.x.a(r12, r13)
            java.util.Map r7 = M5.Q.e(r12)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            x2.j r12 = x2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            c3.x r13 = new c3.x
            r13.<init>()
            com.stripe.android.networking.a$k r14 = new com.stripe.android.networking.a$k
            r14.<init>()
            r0.f25004c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L68
            return r1
        L68:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.z(java.lang.String, java.lang.String, x2.j$c, P5.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(android.content.Context r20, kotlin.jvm.functions.Function0 r21, r2.C3683c r22, r2.InterfaceC3684d r23, P5.g r24, java.util.Set r25, x2.InterfaceC3868F r26, x2.InterfaceC3873c r27, j2.InterfaceC3069i r28, l2.InterfaceC3167b.a r29, com.stripe.android.networking.PaymentAnalyticsRequestFactory r30, e3.C2583e r31, java.util.Set r32, java.lang.String r33, java.lang.String r34, int r35, kotlin.jvm.internal.AbstractC3151p r36) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.<init>(android.content.Context, kotlin.jvm.functions.Function0, r2.c, r2.d, P5.g, java.util.Set, x2.F, x2.c, j2.i, l2.b$a, com.stripe.android.networking.PaymentAnalyticsRequestFactory, e3.e, java.util.Set, java.lang.String, java.lang.String, int, kotlin.jvm.internal.p):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context appContext, Function0 publishableKeyProvider, g workContext, Set productUsageTokens, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC3873c analyticsRequestExecutor, InterfaceC3684d logger) {
        this(appContext, publishableKeyProvider, null, logger, workContext, productUsageTokens, null, analyticsRequestExecutor, null, null, paymentAnalyticsRequestFactory, null, null, null, null, 31556, null);
        AbstractC3159y.i(appContext, "appContext");
        AbstractC3159y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3159y.i(workContext, "workContext");
        AbstractC3159y.i(productUsageTokens, "productUsageTokens");
        AbstractC3159y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3159y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3159y.i(logger, "logger");
    }
}
