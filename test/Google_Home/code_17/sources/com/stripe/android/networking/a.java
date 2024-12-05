package com.stripe.android.networking;

import A2.C0944b;
import A2.InterfaceC0945c;
import A2.j;
import A2.z;
import O5.r;
import O5.s;
import O5.t;
import O5.x;
import P5.AbstractC1378t;
import S5.g;
import T5.b;
import a6.InterfaceC1668n;
import android.content.Context;
import android.net.http.HttpResponseCache;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import com.stripe.android.model.c;
import com.stripe.android.model.p;
import com.stripe.android.model.w;
import h3.C2902d;
import h3.C2903e;
import h3.m;
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
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import l6.AbstractC3364k;
import m2.InterfaceC3423i;
import o2.InterfaceC3515b;
import u2.C4056c;
import u2.InterfaceC4057d;
import u2.f;
import w2.AbstractC4137d;
import w2.C4135b;
import w2.C4136c;
import w2.C4139f;
import w2.C4142i;
import w2.C4143j;
import z2.InterfaceC4225a;

/* loaded from: classes4.dex */
public final class a implements m {

    /* renamed from: n, reason: collision with root package name */
    public static final C2601b f25945n = new C2601b(null);

    /* renamed from: o, reason: collision with root package name */
    public static final int f25946o = 8;

    /* renamed from: a, reason: collision with root package name */
    private final Context f25947a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f25948b;

    /* renamed from: c, reason: collision with root package name */
    private final C4056c f25949c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4057d f25950d;

    /* renamed from: e, reason: collision with root package name */
    private final g f25951e;

    /* renamed from: f, reason: collision with root package name */
    private final Set f25952f;

    /* renamed from: g, reason: collision with root package name */
    private final A2.F f25953g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC0945c f25954h;

    /* renamed from: i, reason: collision with root package name */
    private final InterfaceC3423i f25955i;

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC3515b.a f25956j;

    /* renamed from: k, reason: collision with root package name */
    private final PaymentAnalyticsRequestFactory f25957k;

    /* renamed from: l, reason: collision with root package name */
    private final C2903e f25958l;

    /* renamed from: m, reason: collision with root package name */
    private final j.b f25959m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class A extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f25961b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        A(Set set) {
            super(1);
            this.f25961b = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5493invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5493invoke(Object obj) {
            a aVar = a.this;
            aVar.S(aVar.f25957k.q(this.f25961b));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class B extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f25962a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25963b;

        /* renamed from: d, reason: collision with root package name */
        int f25965d;

        B(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25963b = obj;
            this.f25965d |= Integer.MIN_VALUE;
            Object P8 = a.this.P(null, null, null, this);
            return P8 == b.e() ? P8 : s.a(P8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class C extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C f25966a = new C();

        C() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5494invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5494invoke(((s) obj).j());
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class D extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f25967a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25968b;

        /* renamed from: d, reason: collision with root package name */
        int f25970d;

        D(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25968b = obj;
            this.f25970d |= Integer.MIN_VALUE;
            Object f8 = a.this.f(null, null, this);
            return f8 == b.e() ? f8 : s.a(f8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class E extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25971a;

        /* renamed from: c, reason: collision with root package name */
        int f25973c;

        E(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25971a = obj;
            this.f25973c |= Integer.MIN_VALUE;
            Object g8 = a.this.g(null, this);
            return g8 == b.e() ? g8 : s.a(g8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class F extends AbstractC3256z implements Function1 {
        F() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5495invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5495invoke(Object obj) {
            a.this.R(PaymentAnalyticsEvent.f25883Q);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class G extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25975a;

        /* renamed from: c, reason: collision with root package name */
        int f25977c;

        G(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25975a = obj;
            this.f25977c |= Integer.MIN_VALUE;
            Object o8 = a.this.o(null, null, null, this);
            return o8 == b.e() ? o8 : s.a(o8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class H extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f25979b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        H(Set set) {
            super(1);
            this.f25979b = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5496invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5496invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f25957k, PaymentAnalyticsEvent.f25898g, this.f25979b, null, null, null, null, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class I extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25980a;

        /* renamed from: c, reason: collision with root package name */
        int f25982c;

        I(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25980a = obj;
            this.f25982c |= Integer.MIN_VALUE;
            Object t8 = a.this.t(null, null, null, this);
            return t8 == b.e() ? t8 : s.a(t8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class J extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f25983a;

        /* renamed from: b, reason: collision with root package name */
        Object f25984b;

        /* renamed from: c, reason: collision with root package name */
        Object f25985c;

        /* renamed from: d, reason: collision with root package name */
        Object f25986d;

        /* renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f25987e;

        /* renamed from: g, reason: collision with root package name */
        int f25989g;

        J(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25987e = obj;
            this.f25989g |= Integer.MIN_VALUE;
            return a.this.a0(null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class K extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f25990a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f25991b;

        /* renamed from: d, reason: collision with root package name */
        int f25993d;

        K(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25991b = obj;
            this.f25993d |= Integer.MIN_VALUE;
            Object d02 = a.this.d0(null, null, this);
            return d02 == b.e() ? d02 : s.a(d02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class L extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25994a;

        /* renamed from: c, reason: collision with root package name */
        int f25996c;

        L(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25994a = obj;
            this.f25996c |= Integer.MIN_VALUE;
            Object x8 = a.this.x(null, null, this);
            return x8 == b.e() ? x8 : s.a(x8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class M extends AbstractC3256z implements Function1 {
        M() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5497invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5497invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f25957k, PaymentAnalyticsEvent.f25919v, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class N extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25998a;

        /* renamed from: c, reason: collision with root package name */
        int f26000c;

        N(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f25998a = obj;
            this.f26000c |= Integer.MIN_VALUE;
            Object B8 = a.this.B(null, null, this);
            return B8 == b.e() ? B8 : s.a(B8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class O extends AbstractC3256z implements Function1 {
        O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5498invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5498invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f25957k, PaymentAnalyticsEvent.f25861A, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class P extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26002a;

        /* renamed from: c, reason: collision with root package name */
        int f26004c;

        P(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26002a = obj;
            this.f26004c |= Integer.MIN_VALUE;
            Object a8 = a.this.a(null, null, this);
            return a8 == b.e() ? a8 : s.a(a8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Q extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26005a;

        /* renamed from: c, reason: collision with root package name */
        int f26007c;

        Q(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26005a = obj;
            this.f26007c |= Integer.MIN_VALUE;
            Object r8 = a.this.r(null, null, null, this);
            return r8 == b.e() ? r8 : s.a(r8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class R extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f26009b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        R(Set set) {
            super(1);
            this.f26009b = set;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5499invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5499invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f25957k, PaymentAnalyticsEvent.f25897f, this.f26009b, null, null, null, null, 60, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class S extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26010a;

        /* renamed from: c, reason: collision with root package name */
        int f26012c;

        S(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26010a = obj;
            this.f26012c |= Integer.MIN_VALUE;
            Object y8 = a.this.y(null, null, this);
            return y8 == b.e() ? y8 : s.a(y8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class T extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26013a;

        /* renamed from: c, reason: collision with root package name */
        int f26015c;

        T(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26013a = obj;
            this.f26015c |= Integer.MIN_VALUE;
            Object f02 = a.this.f0(null, null, null, this);
            return f02 == b.e() ? f02 : s.a(f02);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class U extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ PaymentAnalyticsEvent f26016a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f26017b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        U(PaymentAnalyticsEvent paymentAnalyticsEvent, a aVar) {
            super(1);
            this.f26016a = paymentAnalyticsEvent;
            this.f26017b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5500invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5500invoke(Object obj) {
            PaymentAnalyticsEvent paymentAnalyticsEvent = this.f26016a;
            if (paymentAnalyticsEvent != null) {
                a aVar = this.f26017b;
                aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f25957k, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class V extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26018a;

        /* renamed from: c, reason: collision with root package name */
        int f26020c;

        V(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26018a = obj;
            this.f26020c |= Integer.MIN_VALUE;
            Object i8 = a.this.i(null, null, null, this);
            return i8 == b.e() ? i8 : s.a(i8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class W extends AbstractC3256z implements Function1 {
        W() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5501invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5501invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f25957k, PaymentAnalyticsEvent.f25913s, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class X extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26022a;

        /* renamed from: c, reason: collision with root package name */
        int f26024c;

        X(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26022a = obj;
            this.f26024c |= Integer.MIN_VALUE;
            Object b8 = a.this.b(null, null, null, this);
            return b8 == b.e() ? b8 : s.a(b8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Y extends AbstractC3256z implements Function1 {
        Y() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5502invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5502invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f25957k, PaymentAnalyticsEvent.f25923x, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class Z extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26026a;

        /* renamed from: c, reason: collision with root package name */
        int f26028c;

        Z(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26026a = obj;
            this.f26028c |= Integer.MIN_VALUE;
            Object l8 = a.this.l(null, null, null, this);
            return l8 == b.e() ? l8 : s.a(l8);
        }
    }

    /* renamed from: com.stripe.android.networking.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static final class C0529a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f26029a;

        C0529a(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            return new C0529a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.f26029a == 0) {
                t.b(obj);
                HttpResponseCache.install(new File(a.this.f25947a.getCacheDir(), "stripe_api_repository_cache"), 10485760L);
                return O5.I.f8278a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(l6.M m8, S5.d dVar) {
            return ((C0529a) create(m8, dVar)).invokeSuspend(O5.I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class a0 extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26031a;

        /* renamed from: c, reason: collision with root package name */
        int f26033c;

        a0(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26031a = obj;
            this.f26033c |= Integer.MIN_VALUE;
            Object m8 = a.this.m(null, null, null, null, this);
            return m8 == b.e() ? m8 : s.a(m8);
        }
    }

    /* renamed from: com.stripe.android.networking.a$b, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2601b {
        private C2601b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map e(List list) {
            Map map = null;
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                map = P5.Q.e(x.a("expand", list));
            }
            if (map == null) {
                return P5.Q.h();
            }
            return map;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String f(String str) {
            return "https://api.stripe.com/v1/" + str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String g(String str, Object... objArr) {
            kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34167a;
            Locale locale = Locale.ENGLISH;
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(locale, str, Arrays.copyOf(copyOf, copyOf.length));
            AbstractC3255y.h(format, "format(...)");
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
            AbstractC3255y.i(paymentIntentId, "paymentIntentId");
            AbstractC3255y.i(financialConnectionsSessionId, "financialConnectionsSessionId");
            return g("payment_intents/%s/link_account_sessions/%s/attach", paymentIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String i(String setupIntentId, String financialConnectionsSessionId) {
            AbstractC3255y.i(setupIntentId, "setupIntentId");
            AbstractC3255y.i(financialConnectionsSessionId, "financialConnectionsSessionId");
            return g("setup_intents/%s/link_account_sessions/%s/attach", setupIntentId, financialConnectionsSessionId);
        }

        public final /* synthetic */ String j(String paymentIntentId) {
            AbstractC3255y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/source_cancel", paymentIntentId);
        }

        public final /* synthetic */ String k(String setupIntentId) {
            AbstractC3255y.i(setupIntentId, "setupIntentId");
            return g("setup_intents/%s/source_cancel", setupIntentId);
        }

        public final /* synthetic */ String l(String paymentIntentId) {
            AbstractC3255y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/confirm", paymentIntentId);
        }

        public final /* synthetic */ String m(String setupIntentId) {
            AbstractC3255y.i(setupIntentId, "setupIntentId");
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
            AbstractC3255y.i(paymentMethodId, "paymentMethodId");
            return f("payment_methods/" + paymentMethodId);
        }

        public final /* synthetic */ String t() {
            return f("payment_methods");
        }

        public final /* synthetic */ String u(String paymentIntentId) {
            AbstractC3255y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String v(String paymentIntentId) {
            AbstractC3255y.i(paymentIntentId, "paymentIntentId");
            return g("setup_intents/%s/refresh", paymentIntentId);
        }

        public final /* synthetic */ String w(String customerId) {
            AbstractC3255y.i(customerId, "customerId");
            return g("customers/%s", customerId);
        }

        public final /* synthetic */ String x(String paymentIntentId) {
            AbstractC3255y.i(paymentIntentId, "paymentIntentId");
            return g("payment_intents/%s", paymentIntentId);
        }

        public final /* synthetic */ String y(String setupIntentId) {
            AbstractC3255y.i(setupIntentId, "setupIntentId");
            return g("setup_intents/%s", setupIntentId);
        }

        public final /* synthetic */ String z() {
            return f("consumers/payment_details/share");
        }

        public /* synthetic */ C2601b(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b0 extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26034a;

        /* renamed from: c, reason: collision with root package name */
        int f26036c;

        b0(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26034a = obj;
            this.f26036c |= Integer.MIN_VALUE;
            Object s8 = a.this.s(null, null, this);
            return s8 == b.e() ? s8 : s.a(s8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.stripe.android.networking.a$c, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static abstract class AbstractC2602c {

        /* renamed from: com.stripe.android.networking.a$c$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0530a extends AbstractC2602c {

            /* renamed from: a, reason: collision with root package name */
            public static final C0530a f26037a = new C0530a();

            private C0530a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0530a);
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
        public static final class b extends AbstractC2602c {

            /* renamed from: a, reason: collision with root package name */
            private final String f26038a;

            public b(String str) {
                super(null);
                this.f26038a = str;
            }

            public final String a() {
                return this.f26038a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && AbstractC3255y.d(this.f26038a, ((b) obj).f26038a);
            }

            public int hashCode() {
                String str = this.f26038a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Success(originalDnsCacheTtl=" + this.f26038a + ")";
            }
        }

        private AbstractC2602c() {
        }

        public /* synthetic */ AbstractC2602c(AbstractC3247p abstractC3247p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class c0 extends AbstractC3256z implements Function1 {
        c0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5503invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5503invoke(Object obj) {
            a aVar = a.this;
            aVar.S(PaymentAnalyticsRequestFactory.v(aVar.f25957k, PaymentAnalyticsEvent.f25887U, null, null, null, null, null, 62, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$d, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2603d extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26040a;

        /* renamed from: c, reason: collision with root package name */
        int f26042c;

        C2603d(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26040a = obj;
            this.f26042c |= Integer.MIN_VALUE;
            Object j8 = a.this.j(null, null, null, null, null, this);
            return j8 == b.e() ? j8 : s.a(j8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d0 extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26043a;

        /* renamed from: c, reason: collision with root package name */
        int f26045c;

        d0(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26043a = obj;
            this.f26045c |= Integer.MIN_VALUE;
            Object e8 = a.this.e(null, null, null, this);
            return e8 == b.e() ? e8 : s.a(e8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$e, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2604e extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2604e f26046a = new C2604e();

        C2604e() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5504invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5504invoke(((s) obj).j());
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e0 extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.t f26048b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e0(com.stripe.android.model.t tVar) {
            super(1);
            this.f26048b = tVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5505invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5505invoke(Object obj) {
            a aVar = a.this;
            aVar.S(aVar.f25957k.t(this.f26048b.i().f25605a, this.f26048b.h()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$f, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2605f extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26049a;

        /* renamed from: c, reason: collision with root package name */
        int f26051c;

        C2605f(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26049a = obj;
            this.f26051c |= Integer.MIN_VALUE;
            Object c8 = a.this.c(null, null, null, null, null, this);
            return c8 == b.e() ? c8 : s.a(c8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$g, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2606g extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2606g f26052a = new C2606g();

        C2606g() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5506invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5506invoke(((s) obj).j());
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$h, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2607h extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26053a;

        /* renamed from: c, reason: collision with root package name */
        int f26055c;

        C2607h(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26053a = obj;
            this.f26055c |= Integer.MIN_VALUE;
            Object h8 = a.this.h(null, null, null, this);
            return h8 == b.e() ? h8 : s.a(h8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$i, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2608i extends AbstractC3256z implements Function1 {
        C2608i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5507invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5507invoke(Object obj) {
            a.this.R(PaymentAnalyticsEvent.f25917u);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$j, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2609j extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26057a;

        /* renamed from: c, reason: collision with root package name */
        int f26059c;

        C2609j(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26057a = obj;
            this.f26059c |= Integer.MIN_VALUE;
            Object p8 = a.this.p(null, null, null, this);
            return p8 == b.e() ? p8 : s.a(p8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$k, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2610k extends AbstractC3256z implements Function1 {
        C2610k() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5508invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5508invoke(Object obj) {
            a.this.R(PaymentAnalyticsEvent.f25927z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$l, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2611l extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26061a;

        /* renamed from: c, reason: collision with root package name */
        int f26063c;

        C2611l(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26061a = obj;
            this.f26063c |= Integer.MIN_VALUE;
            Object z8 = a.this.z(null, null, this);
            return z8 == b.e() ? z8 : s.a(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$m, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2612m extends d {

        /* renamed from: a, reason: collision with root package name */
        Object f26064a;

        /* renamed from: b, reason: collision with root package name */
        Object f26065b;

        /* renamed from: c, reason: collision with root package name */
        Object f26066c;

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f26067d;

        /* renamed from: f, reason: collision with root package name */
        int f26069f;

        C2612m(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26067d = obj;
            this.f26069f |= Integer.MIN_VALUE;
            Object v8 = a.this.v(null, null, null, this);
            return v8 == b.e() ? v8 : s.a(v8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$n, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2613n extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26070a;

        /* renamed from: c, reason: collision with root package name */
        int f26072c;

        C2613n(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26070a = obj;
            this.f26072c |= Integer.MIN_VALUE;
            Object M8 = a.this.M(null, null, null, this);
            return M8 == b.e() ? M8 : s.a(M8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$o, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2614o extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.stripe.android.model.b f26073a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a f26074b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2614o(com.stripe.android.model.b bVar, a aVar) {
            super(1);
            this.f26073a = bVar;
            this.f26074b = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5509invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5509invoke(Object obj) {
            String type;
            p h8 = this.f26073a.h();
            if (h8 == null || (type = h8.u()) == null) {
                w p8 = this.f26073a.p();
                type = p8 != null ? p8.getType() : null;
            }
            a aVar = this.f26074b;
            aVar.S(aVar.f25957k.r(type, this.f26074b.V(obj)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$p, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2615p extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26075a;

        /* renamed from: c, reason: collision with root package name */
        int f26077c;

        C2615p(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26075a = obj;
            this.f26077c |= Integer.MIN_VALUE;
            Object A8 = a.this.A(null, null, null, this);
            return A8 == b.e() ? A8 : s.a(A8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$q, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2616q extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c f26079b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2616q(c cVar) {
            super(1);
            this.f26079b = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5510invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5510invoke(Object obj) {
            a aVar = a.this;
            PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory = aVar.f25957k;
            p h8 = this.f26079b.h();
            aVar.S(paymentAnalyticsRequestFactory.w(h8 != null ? h8.u() : null, a.this.V(obj)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$r, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2617r extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26080a;

        /* renamed from: c, reason: collision with root package name */
        int f26082c;

        C2617r(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26080a = obj;
            this.f26082c |= Integer.MIN_VALUE;
            Object w8 = a.this.w(null, null, this);
            return w8 == b.e() ? w8 : s.a(w8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$s, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2618s extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2618s f26083a = new C2618s();

        C2618s() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5511invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5511invoke(((s) obj).j());
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$t, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2619t extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26084a;

        /* renamed from: c, reason: collision with root package name */
        int f26086c;

        C2619t(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26084a = obj;
            this.f26086c |= Integer.MIN_VALUE;
            Object d8 = a.this.d(null, null, null, this);
            return d8 == b.e() ? d8 : s.a(d8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$u, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2620u extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2620u f26087a = new C2620u();

        C2620u() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5512invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5512invoke(((s) obj).j());
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$v, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2621v extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26088a;

        /* renamed from: c, reason: collision with root package name */
        int f26090c;

        C2621v(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26088a = obj;
            this.f26090c |= Integer.MIN_VALUE;
            Object n8 = a.this.n(null, null, this);
            return n8 == b.e() ? n8 : s.a(n8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$w, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2622w extends AbstractC3256z implements Function1 {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f26092b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2622w(p pVar) {
            super(1);
            this.f26092b = pVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5513invoke(((s) obj).j());
            return O5.I.f8278a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5513invoke(Object obj) {
            a aVar = a.this;
            aVar.S(aVar.f25957k.s(this.f26092b.p(), this.f26092b.i()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$x, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2623x extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26093a;

        /* renamed from: c, reason: collision with root package name */
        int f26095c;

        C2623x(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26093a = obj;
            this.f26095c |= Integer.MIN_VALUE;
            Object k8 = a.this.k(null, null, null, this);
            return k8 == b.e() ? k8 : s.a(k8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$y, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2624y extends AbstractC3256z implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final C2624y f26096a = new C2624y();

        C2624y() {
            super(1);
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5514invoke(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5514invoke(((s) obj).j());
            return O5.I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.networking.a$z, reason: case insensitive filesystem */
    /* loaded from: classes4.dex */
    public static final class C2625z extends d {

        /* renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f26097a;

        /* renamed from: c, reason: collision with root package name */
        int f26099c;

        C2625z(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f26097a = obj;
            this.f26099c |= Integer.MIN_VALUE;
            Object u8 = a.this.u(null, null, null, this);
            return u8 == b.e() ? u8 : s.a(u8);
        }
    }

    public a(Context context, Function0 publishableKeyProvider, C4056c c4056c, InterfaceC4057d logger, g workContext, Set productUsageTokens, A2.F stripeNetworkClient, InterfaceC0945c analyticsRequestExecutor, InterfaceC3423i fraudDetectionDataRepository, InterfaceC3515b.a cardAccountRangeRepositoryFactory, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, C2903e fraudDetectionDataParamsUtils, Set betas, String apiVersion, String sdkVersion) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(logger, "logger");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(productUsageTokens, "productUsageTokens");
        AbstractC3255y.i(stripeNetworkClient, "stripeNetworkClient");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(fraudDetectionDataRepository, "fraudDetectionDataRepository");
        AbstractC3255y.i(cardAccountRangeRepositoryFactory, "cardAccountRangeRepositoryFactory");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(fraudDetectionDataParamsUtils, "fraudDetectionDataParamsUtils");
        AbstractC3255y.i(betas, "betas");
        AbstractC3255y.i(apiVersion, "apiVersion");
        AbstractC3255y.i(sdkVersion, "sdkVersion");
        this.f25947a = context;
        this.f25948b = publishableKeyProvider;
        this.f25949c = c4056c;
        this.f25950d = logger;
        this.f25951e = workContext;
        this.f25952f = productUsageTokens;
        this.f25953g = stripeNetworkClient;
        this.f25954h = analyticsRequestExecutor;
        this.f25955i = fraudDetectionDataRepository;
        this.f25956j = cardAccountRangeRepositoryFactory;
        this.f25957k = paymentAnalyticsRequestFactory;
        this.f25958l = fraudDetectionDataParamsUtils;
        this.f25959m = new j.b(c4056c, apiVersion, sdkVersion);
        T();
        AbstractC3364k.d(l6.N.a(workContext), null, null, new C0529a(null), 3, null);
    }

    private final r K(Set set) {
        return x.a("payment_user_agent", q(set));
    }

    static /* synthetic */ r L(a aVar, Set set, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            set = P5.a0.f();
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
    public final java.lang.Object M(com.stripe.android.model.b r12, A2.j.c r13, java.util.List r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2613n
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$n r0 = (com.stripe.android.networking.a.C2613n) r0
            int r1 = r0.f26072c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26072c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$n r0 = new com.stripe.android.networking.a$n
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26070a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26072c
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto Lb9
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            O5.t.b(r15)
            h3.e r15 = r11.f25958l
            java.util.Map r2 = r12.B()
            boolean r4 = r13.h()
            if (r4 == 0) goto L4d
            java.lang.String r4 = "client_secret"
            java.util.Map r2 = P5.Q.l(r2, r4)
        L4d:
            com.stripe.android.model.p r4 = r12.h()
            com.stripe.android.model.w r5 = r12.p()
            java.util.Map r2 = r11.b0(r2, r4, r5)
            com.stripe.android.networking.a$b r4 = com.stripe.android.networking.a.f25945n
            java.util.Map r14 = com.stripe.android.networking.a.C2601b.a(r4, r14)
            java.util.Map r14 = P5.Q.q(r2, r14)
            h3.d r2 = r11.W()
            java.util.Map r7 = r15.b(r14, r2)
            O5.s$a r14 = O5.s.f8302b     // Catch: java.lang.Throwable -> L7f
            com.stripe.android.model.n$c r14 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L7f
            java.lang.String r15 = r12.d()     // Catch: java.lang.Throwable -> L7f
            r14.<init>(r15)     // Catch: java.lang.Throwable -> L7f
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r14 = O5.s.b(r14)     // Catch: java.lang.Throwable -> L7f
            goto L8a
        L7f:
            r14 = move-exception
            O5.s$a r15 = O5.s.f8302b
            java.lang.Object r14 = O5.t.a(r14)
            java.lang.Object r14 = O5.s.b(r14)
        L8a:
            java.lang.Throwable r15 = O5.s.e(r14)
            if (r15 != 0) goto Lba
            java.lang.String r14 = (java.lang.String) r14
            r11.T()
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r15.l(r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            A2.j r13 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.u r14 = new f3.u
            r14.<init>()
            com.stripe.android.networking.a$o r15 = new com.stripe.android.networking.a$o
            r15.<init>(r12, r11)
            r0.f26072c = r3
            java.lang.Object r12 = r11.P(r13, r14, r15, r0)
            if (r12 != r1) goto Lb9
            return r1
        Lb9:
            return r12
        Lba:
            java.lang.Object r12 = O5.t.a(r15)
            java.lang.Object r12 = O5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.M(com.stripe.android.model.b, A2.j$c, java.util.List, S5.d):java.lang.Object");
    }

    private final Map N(String str, List list) {
        return P5.Q.q(P5.Q.e(x.a("client_secret", str)), f25945n.e(list));
    }

    private final AbstractC2602c O() {
        Object b8;
        try {
            s.a aVar = s.f8302b;
            String property = Security.getProperty("networkaddress.cache.ttl");
            Security.setProperty("networkaddress.cache.ttl", MBridgeConstans.ENDCARD_URL_TYPE_PL);
            b8 = s.b(new AbstractC2602c.b(property));
        } catch (Throwable th) {
            s.a aVar2 = s.f8302b;
            b8 = s.b(t.a(th));
        }
        AbstractC2602c.C0530a c0530a = AbstractC2602c.C0530a.f26037a;
        if (s.g(b8)) {
            b8 = c0530a;
        }
        return (AbstractC2602c) b8;
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
    public final java.lang.Object P(A2.j r9, z2.InterfaceC4225a r10, kotlin.jvm.functions.Function1 r11, S5.d r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof com.stripe.android.networking.a.B
            if (r0 == 0) goto L13
            r0 = r12
            com.stripe.android.networking.a$B r0 = (com.stripe.android.networking.a.B) r0
            int r1 = r0.f25965d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25965d = r1
            goto L18
        L13:
            com.stripe.android.networking.a$B r0 = new com.stripe.android.networking.a$B
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f25963b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f25965d
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f25962a
            r10 = r9
            z2.a r10 = (z2.InterfaceC4225a) r10
            O5.t.b(r12)     // Catch: java.lang.Throwable -> L2e
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
            O5.t.b(r12)
            O5.s$a r12 = O5.s.f8302b     // Catch: java.lang.Throwable -> L2e
            r0.f25962a = r10     // Catch: java.lang.Throwable -> L2e
            r0.f25965d = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r12 = r8.a0(r9, r11, r0)     // Catch: java.lang.Throwable -> L2e
            if (r12 != r1) goto L48
            return r1
        L48:
            A2.H r12 = (A2.H) r12     // Catch: java.lang.Throwable -> L2e
            org.json.JSONObject r9 = A2.A.a(r12)     // Catch: java.lang.Throwable -> L2e
            y2.f r9 = r10.a(r9)     // Catch: java.lang.Throwable -> L2e
            if (r9 == 0) goto L59
            java.lang.Object r9 = O5.s.b(r9)     // Catch: java.lang.Throwable -> L2e
            goto L8a
        L59:
            w2.b r9 = new w2.b     // Catch: java.lang.Throwable -> L2e
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
            O5.s$a r10 = O5.s.f8302b
            java.lang.Object r9 = O5.t.a(r9)
            java.lang.Object r9 = O5.s.b(r9)
        L8a:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.P(A2.j, z2.a, kotlin.jvm.functions.Function1, S5.d):java.lang.Object");
    }

    static /* synthetic */ Object Q(a aVar, j jVar, InterfaceC4225a interfaceC4225a, Function1 function1, S5.d dVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            function1 = C.f25966a;
        }
        return aVar.P(jVar, interfaceC4225a, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(PaymentAnalyticsEvent paymentAnalyticsEvent) {
        S(PaymentAnalyticsRequestFactory.v(this.f25957k, paymentAnalyticsEvent, null, null, null, null, null, 62, null));
    }

    private final void T() {
        this.f25955i.b();
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
        A2.H h8 = (A2.H) obj2;
        Throwable e8 = s.e(obj);
        if (e8 != null) {
            return AbstractC4137d.a(e8);
        }
        if (h8 == null || !h8.e()) {
            return null;
        }
        try {
            Z(h8);
            b8 = s.b(O5.I.f8278a);
        } catch (Throwable th) {
            s.a aVar = s.f8302b;
            b8 = s.b(t.a(th));
        }
        Throwable e9 = s.e(b8);
        if (e9 == null) {
            return null;
        }
        return AbstractC4137d.a(e9);
    }

    private final C2902d W() {
        return this.f25955i.a();
    }

    private final void Z(A2.H h8) {
        String str;
        z d8 = h8.d();
        if (d8 != null) {
            str = d8.a();
        } else {
            str = null;
        }
        String str2 = str;
        int b8 = h8.b();
        f e8 = h3.l.e(new z2.b().a(A2.A.a(h8)), this.f25947a);
        if (b8 != 429) {
            switch (b8) {
                case 400:
                case MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR /* 404 */:
                    throw new C4139f(e8, str2, b8, null, null, 24, null);
                case 401:
                    throw new C4136c(e8, str2);
                case 402:
                    throw new K2.a(e8, str2);
                case 403:
                    throw new C4142i(e8, str2);
                default:
                    throw new C4135b(e8, str2, b8, null, null, 24, null);
            }
        }
        throw new C4143j(e8, str2, null, null, 12, null);
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
                f9 = P5.a0.f();
            }
            Map o8 = P5.Q.o(map, x.a("payment_method_data", P5.Q.o(map2, K(f9))));
            if (o8 != null) {
                return o8;
            }
        }
        Object obj2 = map.get("source_data");
        if (obj2 instanceof Map) {
            map3 = (Map) obj2;
        }
        if (map3 != null) {
            if (wVar == null || (f8 = wVar.a()) == null) {
                f8 = P5.a0.f();
            }
            return P5.Q.o(map, x.a("source_data", P5.Q.o(map3, K(f8))));
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
    public final java.lang.Object d0(com.stripe.android.model.b r5, A2.j.c r6, S5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.networking.a.K
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.networking.a$K r0 = (com.stripe.android.networking.a.K) r0
            int r1 = r0.f25993d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25993d = r1
            goto L18
        L13:
            com.stripe.android.networking.a$K r0 = new com.stripe.android.networking.a$K
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f25991b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f25993d
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f25990a
            com.stripe.android.model.b r5 = (com.stripe.android.model.b) r5
            O5.t.b(r7)
            O5.s r7 = (O5.s) r7
            java.lang.Object r6 = r7.j()
            goto L5a
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            O5.t.b(r7)
            boolean r7 = r6.h()
            if (r7 == 0) goto L8b
            com.stripe.android.model.p r7 = r5.h()
            if (r7 != 0) goto L4b
            goto L8b
        L4b:
            com.stripe.android.model.p r7 = r5.h()
            r0.f25990a = r5
            r0.f25993d = r3
            java.lang.Object r6 = r4.n(r7, r6, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            boolean r7 = O5.s.h(r6)
            if (r7 == 0) goto L86
            com.stripe.android.model.o r6 = (com.stripe.android.model.o) r6     // Catch: java.lang.Throwable -> L7a
            com.stripe.android.model.b$a r7 = com.stripe.android.model.b.f25268o     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = r5.d()     // Catch: java.lang.Throwable -> L7a
            java.lang.String r6 = r6.f25463a     // Catch: java.lang.Throwable -> L7a
            kotlin.jvm.internal.AbstractC3255y.f(r6)     // Catch: java.lang.Throwable -> L7a
            com.stripe.android.model.r r5 = r5.i()     // Catch: java.lang.Throwable -> L7a
            com.stripe.android.model.b r5 = r7.a(r0, r6, r5)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r5 = O5.s.b(r5)     // Catch: java.lang.Throwable -> L7a
            goto L8a
        L7a:
            r5 = move-exception
            O5.s$a r6 = O5.s.f8302b
            java.lang.Object r5 = O5.t.a(r5)
            java.lang.Object r5 = O5.s.b(r5)
            goto L8a
        L86:
            java.lang.Object r5 = O5.s.b(r6)
        L8a:
            return r5
        L8b:
            java.lang.Object r5 = O5.s.b(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.d0(com.stripe.android.model.b, A2.j$c, S5.d):java.lang.Object");
    }

    private final void e0(AbstractC2602c abstractC2602c) {
        if (abstractC2602c instanceof AbstractC2602c.b) {
            String a8 = ((AbstractC2602c.b) abstractC2602c).a();
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
    public final java.lang.Object f0(e3.v r12, A2.j.c r13, com.stripe.android.networking.PaymentAnalyticsEvent r14, S5.d r15) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.f0(e3.v, A2.j$c, com.stripe.android.networking.PaymentAnalyticsEvent, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(com.stripe.android.model.c r19, A2.j.c r20, java.util.List r21, S5.d r22) {
        /*
            r18 = this;
            r7 = r18
            r0 = r22
            boolean r1 = r0 instanceof com.stripe.android.networking.a.C2615p
            if (r1 == 0) goto L18
            r1 = r0
            com.stripe.android.networking.a$p r1 = (com.stripe.android.networking.a.C2615p) r1
            int r2 = r1.f26077c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f26077c = r2
        L16:
            r8 = r1
            goto L1e
        L18:
            com.stripe.android.networking.a$p r1 = new com.stripe.android.networking.a$p
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r8.f26075a
            java.lang.Object r9 = T5.b.e()
            int r1 = r8.f26077c
            r10 = 1
            if (r1 == 0) goto L3e
            if (r1 != r10) goto L36
            O5.t.b(r0)
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            goto Lb9
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            O5.t.b(r0)
            O5.s$a r0 = O5.s.f8302b     // Catch: java.lang.Throwable -> L55
            com.stripe.android.model.u$b r0 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L55
            java.lang.String r1 = r19.d()     // Catch: java.lang.Throwable -> L55
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = r0.b()     // Catch: java.lang.Throwable -> L55
            java.lang.Object r0 = O5.s.b(r0)     // Catch: java.lang.Throwable -> L55
            goto L60
        L55:
            r0 = move-exception
            O5.s$a r1 = O5.s.f8302b
            java.lang.Object r0 = O5.t.a(r0)
            java.lang.Object r0 = O5.s.b(r0)
        L60:
            java.lang.Throwable r1 = O5.s.e(r0)
            if (r1 != 0) goto Lba
            java.lang.String r0 = (java.lang.String) r0
            r18.T()
            A2.j$b r11 = r7.f25959m
            com.stripe.android.networking.a$b r12 = com.stripe.android.networking.a.f25945n
            java.lang.String r0 = r12.m(r0)
            h3.e r13 = r7.f25958l
            java.util.Map r2 = r19.B()
            com.stripe.android.model.p r3 = r19.h()
            r5 = 4
            r6 = 0
            r4 = 0
            r1 = r18
            java.util.Map r1 = c0(r1, r2, r3, r4, r5, r6)
            r2 = r21
            java.util.Map r2 = com.stripe.android.networking.a.C2601b.a(r12, r2)
            java.util.Map r1 = P5.Q.q(r1, r2)
            h3.d r2 = r18.W()
            java.util.Map r14 = r13.b(r1, r2)
            r16 = 8
            r17 = 0
            r15 = 0
            r12 = r0
            r13 = r20
            A2.j r0 = A2.j.b.d(r11, r12, r13, r14, r15, r16, r17)
            f3.x r1 = new f3.x
            r1.<init>()
            com.stripe.android.networking.a$q r2 = new com.stripe.android.networking.a$q
            r3 = r19
            r2.<init>(r3)
            r8.f26077c = r10
            java.lang.Object r0 = r7.P(r0, r1, r2, r8)
            if (r0 != r9) goto Lb9
            return r9
        Lb9:
            return r0
        Lba:
            java.lang.Object r0 = O5.t.a(r1)
            java.lang.Object r0 = O5.s.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.A(com.stripe.android.model.c, A2.j$c, java.util.List, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.lang.String r12, A2.j.c r13, S5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.N
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$N r0 = (com.stripe.android.networking.a.N) r0
            int r1 = r0.f26000c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26000c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$N r0 = new com.stripe.android.networking.a$N
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f25998a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26000c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r14)
            O5.s r14 = (O5.s) r14
            java.lang.Object r12 = r14.j()
            goto L8c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r14)
            O5.s$a r14 = O5.s.f8302b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.u$b r14 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L4a
            r14.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r14 = O5.s.b(r14)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r14 = move-exception
            O5.s$a r2 = O5.s.f8302b
            java.lang.Object r14 = O5.t.a(r14)
            java.lang.Object r14 = O5.s.b(r14)
        L55:
            java.lang.Throwable r2 = O5.s.e(r14)
            if (r2 != 0) goto L8d
            java.lang.String r14 = (java.lang.String) r14
            r11.T()
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r2 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r2.v(r14)
            java.util.List r14 = P5.AbstractC1378t.m()
            java.util.Map r7 = r11.N(r12, r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            A2.j r12 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.x r13 = new f3.x
            r13.<init>()
            com.stripe.android.networking.a$O r14 = new com.stripe.android.networking.a$O
            r14.<init>()
            r0.f26000c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L8c
            return r1
        L8c:
            return r12
        L8d:
            java.lang.Object r12 = O5.t.a(r2)
            java.lang.Object r12 = O5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.B(java.lang.String, A2.j$c, S5.d):java.lang.Object");
    }

    public final void S(C0944b params) {
        AbstractC3255y.i(params, "params");
        this.f25954h.a(params);
    }

    public final String U(String paymentMethodId) {
        AbstractC3255y.i(paymentMethodId, "paymentMethodId");
        return f25945n.g("payment_methods/%s/detach", paymentMethodId);
    }

    public final /* synthetic */ String X(String paymentIntentId) {
        AbstractC3255y.i(paymentIntentId, "paymentIntentId");
        return f25945n.g("payment_intents/%s/link_account_sessions", paymentIntentId);
    }

    public final /* synthetic */ String Y(String setupIntentId) {
        AbstractC3255y.i(setupIntentId, "setupIntentId");
        return f25945n.g("setup_intents/%s/link_account_sessions", setupIntentId);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(A2.j.c r17, java.util.Map r18, S5.d r19) {
        /*
            r16 = this;
            r7 = r16
            r0 = r19
            boolean r1 = r0 instanceof com.stripe.android.networking.a.P
            if (r1 == 0) goto L18
            r1 = r0
            com.stripe.android.networking.a$P r1 = (com.stripe.android.networking.a.P) r1
            int r2 = r1.f26004c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f26004c = r2
        L16:
            r4 = r1
            goto L1e
        L18:
            com.stripe.android.networking.a$P r1 = new com.stripe.android.networking.a$P
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r4.f26002a
            java.lang.Object r8 = T5.b.e()
            int r1 = r4.f26004c
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            O5.t.b(r0)
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            goto L6b
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            O5.t.b(r0)
            A2.j$b r9 = r7.f25959m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f25945n
            java.lang.String r10 = r0.r()
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r17
            r12 = r18
            A2.j r1 = A2.j.b.b(r9, r10, r11, r12, r13, r14, r15)
            f3.s r3 = new f3.s
            r3.<init>()
            r4.f26004c = r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.a(A2.j$c, java.util.Map, S5.d):java.lang.Object");
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
    public final java.lang.Object a0(A2.j r6, kotlin.jvm.functions.Function1 r7, S5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.stripe.android.networking.a.J
            if (r0 == 0) goto L13
            r0 = r8
            com.stripe.android.networking.a$J r0 = (com.stripe.android.networking.a.J) r0
            int r1 = r0.f25989g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25989g = r1
            goto L18
        L13:
            com.stripe.android.networking.a$J r0 = new com.stripe.android.networking.a$J
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f25987e
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f25989g
            r3 = 1
            if (r2 == 0) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r6 = r0.f25986d
            com.stripe.android.networking.a$c r6 = (com.stripe.android.networking.a.AbstractC2602c) r6
            java.lang.Object r7 = r0.f25985c
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            java.lang.Object r1 = r0.f25984b
            A2.j r1 = (A2.j) r1
            java.lang.Object r0 = r0.f25983a
            com.stripe.android.networking.a r0 = (com.stripe.android.networking.a) r0
            O5.t.b(r8)     // Catch: java.lang.Throwable -> L3e
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
            O5.t.b(r8)
            com.stripe.android.networking.a$c r8 = r5.O()
            O5.s$a r2 = O5.s.f8302b     // Catch: java.lang.Throwable -> L73
            A2.F r2 = r5.f25953g     // Catch: java.lang.Throwable -> L73
            r0.f25983a = r5     // Catch: java.lang.Throwable -> L73
            r0.f25984b = r6     // Catch: java.lang.Throwable -> L73
            r0.f25985c = r7     // Catch: java.lang.Throwable -> L73
            r0.f25986d = r8     // Catch: java.lang.Throwable -> L73
            r0.f25989g = r3     // Catch: java.lang.Throwable -> L73
            java.lang.Object r0 = r2.a(r6, r0)     // Catch: java.lang.Throwable -> L73
            if (r0 != r1) goto L69
            return r1
        L69:
            r1 = r5
        L6a:
            A2.H r0 = (A2.H) r0     // Catch: java.lang.Throwable -> L71
            java.lang.Object r0 = O5.s.b(r0)     // Catch: java.lang.Throwable -> L71
            goto L7f
        L71:
            r0 = move-exception
            goto L75
        L73:
            r0 = move-exception
            r1 = r5
        L75:
            O5.s$a r2 = O5.s.f8302b
            java.lang.Object r0 = O5.t.a(r0)
            java.lang.Object r0 = O5.s.b(r0)
        L7f:
            O5.s r2 = O5.s.a(r0)
            r7.invoke(r2)
            java.lang.Throwable r7 = O5.s.e(r0)
            if (r7 != 0) goto L9b
            A2.H r0 = (A2.H) r0
            boolean r6 = r0.e()
            if (r6 == 0) goto L97
            r1.Z(r0)
        L97:
            r1.e0(r8)
            return r0
        L9b:
            boolean r8 = r7 instanceof java.io.IOException
            if (r8 == 0) goto Lab
            w2.a$a r8 = w2.C4134a.f40352f
            java.io.IOException r7 = (java.io.IOException) r7
            java.lang.String r6 = r6.h()
            w2.a r7 = r8.a(r7, r6)
        Lab:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.a0(A2.j, kotlin.jvm.functions.Function1, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r12, A2.j.c r13, java.util.List r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.X
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$X r0 = (com.stripe.android.networking.a.X) r0
            int r1 = r0.f26024c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26024c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$X r0 = new com.stripe.android.networking.a$X
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26022a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26024c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto L88
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r15)
            O5.s$a r15 = O5.s.f8302b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.u$b r15 = new com.stripe.android.model.u$b     // Catch: java.lang.Throwable -> L4a
            r15.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r15 = r15.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r15 = O5.s.b(r15)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r15 = move-exception
            O5.s$a r2 = O5.s.f8302b
            java.lang.Object r15 = O5.t.a(r15)
            java.lang.Object r15 = O5.s.b(r15)
        L55:
            java.lang.Throwable r2 = O5.s.e(r15)
            if (r2 != 0) goto L89
            java.lang.String r15 = (java.lang.String) r15
            r11.T()
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r2 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r2.y(r15)
            java.util.Map r7 = r11.N(r12, r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            A2.j r12 = A2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            f3.x r13 = new f3.x
            r13.<init>()
            com.stripe.android.networking.a$Y r14 = new com.stripe.android.networking.a$Y
            r14.<init>()
            r0.f26024c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L88
            return r1
        L88:
            return r12
        L89:
            java.lang.Object r12 = O5.t.a(r2)
            java.lang.Object r12 = O5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.b(java.lang.String, A2.j$c, java.util.List, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(java.lang.String r14, java.lang.String r15, java.lang.String r16, A2.j.c r17, java.util.List r18, S5.d r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r19
            boolean r2 = r1 instanceof com.stripe.android.networking.a.C2605f
            if (r2 == 0) goto L16
            r2 = r1
            com.stripe.android.networking.a$f r2 = (com.stripe.android.networking.a.C2605f) r2
            int r3 = r2.f26051c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f26051c = r3
            goto L1b
        L16:
            com.stripe.android.networking.a$f r2 = new com.stripe.android.networking.a$f
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f26049a
            java.lang.Object r3 = T5.b.e()
            int r4 = r2.f26051c
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            O5.t.b(r1)
            O5.s r1 = (O5.s) r1
            java.lang.Object r1 = r1.j()
            goto L77
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            O5.t.b(r1)
            A2.j$b r6 = r0.f25959m
            com.stripe.android.networking.a$b r1 = com.stripe.android.networking.a.f25945n
            r4 = r15
            r7 = r16
            java.lang.String r7 = r1.i(r15, r7)
            java.lang.String r4 = "client_secret"
            r8 = r14
            O5.r r4 = O5.x.a(r4, r14)
            java.util.Map r4 = P5.Q.e(r4)
            r8 = r18
            java.util.Map r1 = com.stripe.android.networking.a.C2601b.a(r1, r8)
            java.util.Map r9 = P5.Q.q(r4, r1)
            r11 = 8
            r12 = 0
            r10 = 0
            r8 = r17
            A2.j r1 = A2.j.b.d(r6, r7, r8, r9, r10, r11, r12)
            f3.x r4 = new f3.x
            r4.<init>()
            com.stripe.android.networking.a$g r6 = com.stripe.android.networking.a.C2606g.f26052a
            r2.f26051c = r5
            java.lang.Object r1 = r13.P(r1, r4, r6, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.c(java.lang.String, java.lang.String, java.lang.String, A2.j$c, java.util.List, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(java.lang.String r12, com.stripe.android.model.d r13, A2.j.c r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2619t
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$t r0 = (com.stripe.android.networking.a.C2619t) r0
            int r1 = r0.f26086c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26086c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$t r0 = new com.stripe.android.networking.a$t
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26084a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26086c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto L5d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r15)
            A2.j$b r4 = r11.f25959m
            java.lang.String r5 = r11.X(r12)
            java.util.Map r7 = r13.a()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            A2.j r12 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.p r13 = new f3.p
            r13.<init>()
            com.stripe.android.networking.a$u r14 = com.stripe.android.networking.a.C2620u.f26087a
            r0.f26086c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.d(java.lang.String, com.stripe.android.model.d, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r12, com.stripe.android.model.t r13, A2.j.c r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.d0
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$d0 r0 = (com.stripe.android.networking.a.d0) r0
            int r1 = r0.f26045c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26045c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$d0 r0 = new com.stripe.android.networking.a$d0
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26043a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26045c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto L65
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r15)
            r11.T()
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r15.s(r12)
            java.util.Map r7 = r13.B()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            A2.j r12 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.v r14 = new f3.v
            r14.<init>()
            com.stripe.android.networking.a$e0 r15 = new com.stripe.android.networking.a$e0
            r15.<init>(r13)
            r0.f26045c = r3
            java.lang.Object r12 = r11.P(r12, r14, r15, r0)
            if (r12 != r1) goto L65
            return r1
        L65:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.e(java.lang.String, com.stripe.android.model.t, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(o2.C3514a r18, A2.j.c r19, S5.d r20) {
        /*
            r17 = this;
            r7 = r17
            r0 = r20
            r1 = 1
            boolean r2 = r0 instanceof com.stripe.android.networking.a.D
            if (r2 == 0) goto L19
            r2 = r0
            com.stripe.android.networking.a$D r2 = (com.stripe.android.networking.a.D) r2
            int r3 = r2.f25970d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f25970d = r3
        L17:
            r4 = r2
            goto L1f
        L19:
            com.stripe.android.networking.a$D r2 = new com.stripe.android.networking.a$D
            r2.<init>(r0)
            goto L17
        L1f:
            java.lang.Object r0 = r4.f25968b
            java.lang.Object r8 = T5.b.e()
            int r2 = r4.f25970d
            if (r2 == 0) goto L41
            if (r2 != r1) goto L39
            java.lang.Object r1 = r4.f25967a
            com.stripe.android.networking.a r1 = (com.stripe.android.networking.a) r1
            O5.t.b(r0)
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            goto L9f
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L41:
            O5.t.b(r0)
            A2.j$b r9 = r7.f25959m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f25945n
            java.lang.String r2 = "card-metadata"
            java.lang.String r10 = com.stripe.android.networking.a.C2601b.d(r0, r2)
            r15 = 5
            r16 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r11 = r19
            A2.j$c r11 = A2.j.c.b(r11, r12, r13, r14, r15, r16)
            java.lang.String r0 = "key"
            java.lang.String r2 = r19.g()
            O5.r r0 = O5.x.a(r0, r2)
            java.lang.String r2 = r18.a()
            java.lang.String r3 = "bin_prefix"
            O5.r r2 = O5.x.a(r3, r2)
            r3 = 2
            O5.r[] r3 = new O5.r[r3]
            r5 = 0
            r3[r5] = r0
            r3[r1] = r2
            java.util.Map r12 = P5.Q.k(r3)
            r14 = 8
            r15 = 0
            r13 = 0
            A2.j r2 = A2.j.b.b(r9, r10, r11, r12, r13, r14, r15)
            f3.e r3 = new f3.e
            r0 = r18
            r3.<init>(r0)
            r4.f25967a = r7
            r4.f25970d = r1
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
            java.lang.Throwable r2 = O5.s.e(r0)
            if (r2 == 0) goto Laa
            com.stripe.android.networking.PaymentAnalyticsEvent r2 = com.stripe.android.networking.PaymentAnalyticsEvent.f25866C0
            r1.R(r2)
        Laa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.f(o2.a, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(A2.j.c r13, S5.d r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.E
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$E r0 = (com.stripe.android.networking.a.E) r0
            int r1 = r0.f25973c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25973c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$E r0 = new com.stripe.android.networking.a$E
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f25971a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f25973c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r14)
            O5.s r14 = (O5.s) r14
            java.lang.Object r13 = r14.j()
            goto L75
        L2f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L37:
            O5.t.b(r14)
            A2.j$b r4 = r12.f25959m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f25945n
            java.lang.String r2 = "fpx/bank_statuses"
            java.lang.String r5 = com.stripe.android.networking.a.C2601b.b(r14, r2)
            r10 = 5
            r11 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r6 = r13
            A2.j$c r6 = A2.j.c.b(r6, r7, r8, r9, r10, r11)
            java.lang.String r13 = "account_holder_type"
            java.lang.String r14 = "individual"
            O5.r r13 = O5.x.a(r13, r14)
            java.util.Map r7 = P5.Q.e(r13)
            r9 = 8
            r10 = 0
            r8 = 0
            A2.j r13 = A2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            f3.q r14 = new f3.q
            r14.<init>()
            com.stripe.android.networking.a$F r2 = new com.stripe.android.networking.a$F
            r2.<init>()
            r0.f25973c = r3
            java.lang.Object r13 = r12.P(r13, r14, r2, r0)
            if (r13 != r1) goto L75
            return r1
        L75:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.g(A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r12, java.lang.String r13, A2.j.c r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2607h
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$h r0 = (com.stripe.android.networking.a.C2607h) r0
            int r1 = r0.f26055c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26055c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$h r0 = new com.stripe.android.networking.a$h
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26053a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26055c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto L6b
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r15)
            r11.T()
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r15.j(r12)
            java.lang.String r12 = "source"
            O5.r r12 = O5.x.a(r12, r13)
            java.util.Map r7 = P5.Q.e(r12)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            A2.j r12 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.u r13 = new f3.u
            r13.<init>()
            com.stripe.android.networking.a$i r14 = new com.stripe.android.networking.a$i
            r14.<init>()
            r0.f26055c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L6b
            return r1
        L6b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.h(java.lang.String, java.lang.String, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.String r12, A2.j.c r13, java.util.List r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.V
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$V r0 = (com.stripe.android.networking.a.V) r0
            int r1 = r0.f26020c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26020c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$V r0 = new com.stripe.android.networking.a$V
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26018a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26020c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto L97
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r15)
            O5.s$a r15 = O5.s.f8302b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.n$c r15 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L4a
            r15.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r15 = r15.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r15 = O5.s.b(r15)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r15 = move-exception
            O5.s$a r2 = O5.s.f8302b
            java.lang.Object r15 = O5.t.a(r15)
            java.lang.Object r15 = O5.s.b(r15)
        L55:
            java.lang.Throwable r2 = O5.s.e(r15)
            if (r2 != 0) goto L98
            java.lang.String r15 = (java.lang.String) r15
            boolean r2 = r13.h()
            if (r2 == 0) goto L6b
            com.stripe.android.networking.a$b r12 = com.stripe.android.networking.a.f25945n
            java.util.Map r12 = com.stripe.android.networking.a.C2601b.a(r12, r14)
        L69:
            r7 = r12
            goto L70
        L6b:
            java.util.Map r12 = r11.N(r12, r14)
            goto L69
        L70:
            r11.T()
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r12 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r12.x(r15)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            A2.j r12 = A2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            f3.u r13 = new f3.u
            r13.<init>()
            com.stripe.android.networking.a$W r14 = new com.stripe.android.networking.a$W
            r14.<init>()
            r0.f26020c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L97
            return r1
        L97:
            return r12
        L98:
            java.lang.Object r12 = O5.t.a(r2)
            java.lang.Object r12 = O5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.i(java.lang.String, A2.j$c, java.util.List, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.String r14, java.lang.String r15, java.lang.String r16, A2.j.c r17, java.util.List r18, S5.d r19) {
        /*
            r13 = this;
            r0 = r13
            r1 = r19
            boolean r2 = r1 instanceof com.stripe.android.networking.a.C2603d
            if (r2 == 0) goto L16
            r2 = r1
            com.stripe.android.networking.a$d r2 = (com.stripe.android.networking.a.C2603d) r2
            int r3 = r2.f26042c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f26042c = r3
            goto L1b
        L16:
            com.stripe.android.networking.a$d r2 = new com.stripe.android.networking.a$d
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f26040a
            java.lang.Object r3 = T5.b.e()
            int r4 = r2.f26042c
            r5 = 1
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L32
            O5.t.b(r1)
            O5.s r1 = (O5.s) r1
            java.lang.Object r1 = r1.j()
            goto L77
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            O5.t.b(r1)
            A2.j$b r6 = r0.f25959m
            com.stripe.android.networking.a$b r1 = com.stripe.android.networking.a.f25945n
            r4 = r15
            r7 = r16
            java.lang.String r7 = r1.h(r15, r7)
            java.lang.String r4 = "client_secret"
            r8 = r14
            O5.r r4 = O5.x.a(r4, r14)
            java.util.Map r4 = P5.Q.e(r4)
            r8 = r18
            java.util.Map r1 = com.stripe.android.networking.a.C2601b.a(r1, r8)
            java.util.Map r9 = P5.Q.q(r4, r1)
            r11 = 8
            r12 = 0
            r10 = 0
            r8 = r17
            A2.j r1 = A2.j.b.d(r6, r7, r8, r9, r10, r11, r12)
            f3.u r4 = new f3.u
            r4.<init>()
            com.stripe.android.networking.a$e r6 = com.stripe.android.networking.a.C2604e.f26046a
            r2.f26042c = r5
            java.lang.Object r1 = r13.P(r1, r4, r6, r2)
            if (r1 != r3) goto L77
            return r3
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.j(java.lang.String, java.lang.String, java.lang.String, A2.j$c, java.util.List, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.String r12, com.stripe.android.model.d r13, A2.j.c r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2623x
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$x r0 = (com.stripe.android.networking.a.C2623x) r0
            int r1 = r0.f26095c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26095c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$x r0 = new com.stripe.android.networking.a$x
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26093a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26095c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto L5d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r15)
            A2.j$b r4 = r11.f25959m
            java.lang.String r5 = r11.Y(r12)
            java.util.Map r7 = r13.a()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            A2.j r12 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.p r13 = new f3.p
            r13.<init>()
            com.stripe.android.networking.a$y r14 = com.stripe.android.networking.a.C2624y.f26096a
            r0.f26095c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.k(java.lang.String, com.stripe.android.model.d, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(java.lang.String r6, A2.j.c r7, java.util.List r8, S5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.a.Z
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.networking.a$Z r0 = (com.stripe.android.networking.a.Z) r0
            int r1 = r0.f26028c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26028c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$Z r0 = new com.stripe.android.networking.a$Z
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26026a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26028c
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
            O5.t.b(r9)
            O5.s r9 = (O5.s) r9
            java.lang.Object r6 = r9.j()
            goto L71
        L3b:
            O5.t.b(r9)
            com.stripe.android.model.n$c$a r9 = com.stripe.android.model.n.c.f25424c
            boolean r9 = r9.a(r6)
            if (r9 == 0) goto L4f
            r0.f26028c = r4
            java.lang.Object r6 = r5.i(r6, r7, r8, r0)
            if (r6 != r1) goto L71
            return r1
        L4f:
            com.stripe.android.model.u$b$a r9 = com.stripe.android.model.u.b.f25769c
            boolean r9 = r9.a(r6)
            if (r9 == 0) goto L60
            r0.f26028c = r3
            java.lang.Object r6 = r5.b(r6, r7, r8, r0)
            if (r6 != r1) goto L71
            return r1
        L60:
            O5.s$a r6 = O5.s.f8302b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Invalid client secret."
            r6.<init>(r7)
            java.lang.Object r6 = O5.t.a(r6)
            java.lang.Object r6 = O5.s.b(r6)
        L71:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.l(java.lang.String, A2.j$c, java.util.List, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(java.lang.String r17, java.lang.String r18, java.util.Map r19, A2.j.c r20, S5.d r21) {
        /*
            r16 = this;
            r7 = r16
            r0 = r21
            r1 = 1
            boolean r2 = r0 instanceof com.stripe.android.networking.a.a0
            if (r2 == 0) goto L19
            r2 = r0
            com.stripe.android.networking.a$a0 r2 = (com.stripe.android.networking.a.a0) r2
            int r3 = r2.f26033c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f26033c = r3
        L17:
            r4 = r2
            goto L1f
        L19:
            com.stripe.android.networking.a$a0 r2 = new com.stripe.android.networking.a$a0
            r2.<init>(r0)
            goto L17
        L1f:
            java.lang.Object r0 = r4.f26031a
            java.lang.Object r8 = T5.b.e()
            int r2 = r4.f26033c
            if (r2 == 0) goto L3e
            if (r2 != r1) goto L36
            O5.t.b(r0)
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            goto Lae
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            O5.t.b(r0)
            A2.j$b r9 = r7.f25959m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f25945n
            java.lang.String r10 = r0.z()
            java.lang.String r0 = "request_surface"
            java.lang.String r2 = "android_payment_element"
            O5.r r0 = O5.x.a(r0, r2)
            java.lang.String r2 = "consumer_session_client_secret"
            r3 = r17
            O5.r r2 = O5.x.a(r2, r3)
            java.util.Map r2 = P5.Q.e(r2)
            java.lang.String r3 = "credentials"
            O5.r r2 = O5.x.a(r3, r2)
            java.lang.String r3 = "id"
            r5 = r18
            O5.r r3 = O5.x.a(r3, r5)
            r5 = 0
            O5.r r5 = L(r7, r5, r1, r5)
            r6 = 4
            O5.r[] r6 = new O5.r[r6]
            r11 = 0
            r6[r11] = r0
            r6[r1] = r2
            r0 = 2
            r6[r0] = r3
            r0 = 3
            r6[r0] = r5
            java.util.Map r0 = P5.Q.k(r6)
            if (r19 != 0) goto L89
            java.util.Map r2 = P5.Q.h()
            goto L8b
        L89:
            r2 = r19
        L8b:
            java.util.Map r12 = P5.Q.q(r0, r2)
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r20
            A2.j r2 = A2.j.b.d(r9, r10, r11, r12, r13, r14, r15)
            f3.g r3 = f3.C2831g.f31890b
            r4.f26033c = r1
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
            boolean r1 = O5.s.h(r0)
            if (r1 == 0) goto Lba
            e3.n r0 = (e3.n) r0
            java.lang.String r0 = r0.getId()
        Lba:
            java.lang.Object r0 = O5.s.b(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.m(java.lang.String, java.lang.String, java.util.Map, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(com.stripe.android.model.p r12, A2.j.c r13, S5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.C2621v
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$v r0 = (com.stripe.android.networking.a.C2621v) r0
            int r1 = r0.f26090c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26090c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$v r0 = new com.stripe.android.networking.a$v
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26088a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26090c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r14)
            O5.s r14 = (O5.s) r14
            java.lang.Object r12 = r14.j()
            goto L87
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r14)
            r11.T()
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r14.t()
            java.util.Map r14 = r12.B()
            java.util.Set r2 = r12.i()
            O5.r r2 = r11.K(r2)
            java.util.Map r14 = P5.Q.o(r14, r2)
            h3.d r2 = r11.W()
            if (r2 == 0) goto L60
            java.util.Map r2 = r2.g()
            goto L61
        L60:
            r2 = 0
        L61:
            if (r2 != 0) goto L67
            java.util.Map r2 = P5.Q.h()
        L67:
            java.util.Map r7 = P5.Q.q(r14, r2)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            A2.j r13 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.v r14 = new f3.v
            r14.<init>()
            com.stripe.android.networking.a$w r2 = new com.stripe.android.networking.a$w
            r2.<init>(r12)
            r0.f26090c = r3
            java.lang.Object r12 = r11.P(r13, r14, r2, r0)
            if (r12 != r1) goto L87
            return r1
        L87:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.n(com.stripe.android.model.p, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(com.stripe.android.model.l r12, java.util.Set r13, A2.j.c r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.G
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$G r0 = (com.stripe.android.networking.a.G) r0
            int r1 = r0.f25977c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25977c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$G r0 = new com.stripe.android.networking.a$G
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f25975a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f25977c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto L62
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r15)
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r15.t()
            java.util.Map r7 = r12.B()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            A2.j r12 = A2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            f3.w r14 = new f3.w
            r14.<init>()
            com.stripe.android.networking.a$H r15 = new com.stripe.android.networking.a$H
            r15.<init>(r13)
            r0.f25977c = r3
            java.lang.Object r12 = r11.P(r12, r14, r15, r0)
            if (r12 != r1) goto L62
            return r1
        L62:
            boolean r13 = O5.s.h(r12)
            if (r13 == 0) goto L6e
            e3.B r12 = (e3.C2778B) r12
            java.util.List r12 = r12.a()
        L6e:
            java.lang.Object r12 = O5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.o(com.stripe.android.model.l, java.util.Set, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(java.lang.String r12, java.lang.String r13, A2.j.c r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2609j
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$j r0 = (com.stripe.android.networking.a.C2609j) r0
            int r1 = r0.f26059c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26059c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$j r0 = new com.stripe.android.networking.a$j
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26057a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26059c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto L68
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r15)
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r15.k(r12)
            java.lang.String r12 = "source"
            O5.r r12 = O5.x.a(r12, r13)
            java.util.Map r7 = P5.Q.e(r12)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r14
            A2.j r12 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.x r13 = new f3.x
            r13.<init>()
            com.stripe.android.networking.a$k r14 = new com.stripe.android.networking.a$k
            r14.<init>()
            r0.f26059c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L68
            return r1
        L68:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.p(java.lang.String, java.lang.String, A2.j$c, S5.d):java.lang.Object");
    }

    @Override // h3.m
    public String q(Set attribution) {
        AbstractC3255y.i(attribution, "attribution");
        return AbstractC1378t.w0(P5.a0.m(P5.a0.m(P5.a0.d("stripe-android/20.49.0"), this.f25952f), attribution), ";", null, null, 0, null, null, 62, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(java.lang.String r12, java.util.Set r13, A2.j.c r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.Q
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$Q r0 = (com.stripe.android.networking.a.Q) r0
            int r1 = r0.f26007c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26007c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$Q r0 = new com.stripe.android.networking.a$Q
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26005a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26007c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto L5f
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r15)
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r15 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r15.w(r12)
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r6 = r14
            A2.j r12 = A2.j.b.b(r4, r5, r6, r7, r8, r9, r10)
            f3.k r14 = new f3.k
            r14.<init>()
            com.stripe.android.networking.a$R r15 = new com.stripe.android.networking.a$R
            r15.<init>(r13)
            r0.f26007c = r3
            java.lang.Object r12 = r11.P(r12, r14, r15, r0)
            if (r12 != r1) goto L5f
            return r1
        L5f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.r(java.lang.String, java.util.Set, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object s(e3.C2782F r12, A2.j.c r13, S5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.b0
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$b0 r0 = (com.stripe.android.networking.a.b0) r0
            int r1 = r0.f26036c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26036c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$b0 r0 = new com.stripe.android.networking.a$b0
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26034a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26036c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r14)
            O5.s r14 = (O5.s) r14
            java.lang.Object r12 = r14.j()
            goto L64
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r14)
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f25945n
            java.lang.String r2 = "3ds2/authenticate"
            java.lang.String r5 = com.stripe.android.networking.a.C2601b.b(r14, r2)
            java.util.Map r7 = r12.B()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            A2.j r12 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.D r13 = new f3.D
            r13.<init>()
            com.stripe.android.networking.a$c0 r14 = new com.stripe.android.networking.a$c0
            r14.<init>()
            r0.f26036c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L64
            return r1
        L64:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.s(e3.F, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(java.lang.String r17, java.lang.String r18, A2.j.c r19, S5.d r20) {
        /*
            r16 = this;
            r7 = r16
            r0 = r20
            r1 = 1
            boolean r2 = r0 instanceof com.stripe.android.networking.a.I
            if (r2 == 0) goto L19
            r2 = r0
            com.stripe.android.networking.a$I r2 = (com.stripe.android.networking.a.I) r2
            int r3 = r2.f25982c
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L19
            int r3 = r3 - r4
            r2.f25982c = r3
        L17:
            r4 = r2
            goto L1f
        L19:
            com.stripe.android.networking.a$I r2 = new com.stripe.android.networking.a$I
            r2.<init>(r0)
            goto L17
        L1f:
            java.lang.Object r0 = r4.f25980a
            java.lang.Object r8 = T5.b.e()
            int r2 = r4.f25982c
            if (r2 == 0) goto L3d
            if (r2 != r1) goto L35
            O5.t.b(r0)
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            goto L90
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            O5.t.b(r0)
            A2.j$b r9 = r7.f25959m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f25945n
            java.lang.String r10 = r0.p()
            java.lang.String r0 = "request_surface"
            java.lang.String r2 = "android_payment_element"
            O5.r r0 = O5.x.a(r0, r2)
            java.lang.String r2 = "consumer_session_client_secret"
            r3 = r17
            O5.r r2 = O5.x.a(r2, r3)
            java.util.Map r2 = P5.Q.e(r2)
            java.lang.String r3 = "credentials"
            O5.r r2 = O5.x.a(r3, r2)
            r3 = 2
            O5.r[] r3 = new O5.r[r3]
            r5 = 0
            r3[r5] = r0
            r3[r1] = r2
            java.util.Map r12 = P5.Q.k(r3)
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r19
            A2.j r2 = A2.j.b.d(r9, r10, r11, r12, r13, r14, r15)
            f3.h r3 = new f3.h
            r3.<init>()
            r4.f25982c = r1
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
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.t(java.lang.String, java.lang.String, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(java.util.Set r12, java.lang.String r13, A2.j.c r14, S5.d r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.stripe.android.networking.a.C2625z
            if (r0 == 0) goto L13
            r0 = r15
            com.stripe.android.networking.a$z r0 = (com.stripe.android.networking.a.C2625z) r0
            int r1 = r0.f26099c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26099c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$z r0 = new com.stripe.android.networking.a$z
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f26097a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26099c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r15)
            O5.s r15 = (O5.s) r15
            java.lang.Object r12 = r15.j()
            goto L5d
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r15)
            A2.j$b r4 = r11.f25959m
            java.lang.String r5 = r11.U(r13)
            r9 = 12
            r10 = 0
            r7 = 0
            r8 = 0
            r6 = r14
            A2.j r13 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.v r14 = new f3.v
            r14.<init>()
            com.stripe.android.networking.a$A r15 = new com.stripe.android.networking.a$A
            r15.<init>(r12)
            r0.f26099c = r3
            java.lang.Object r12 = r11.P(r13, r14, r15, r0)
            if (r12 != r1) goto L5d
            return r1
        L5d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.u(java.util.Set, java.lang.String, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(com.stripe.android.model.b r6, A2.j.c r7, java.util.List r8, S5.d r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.stripe.android.networking.a.C2612m
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.networking.a$m r0 = (com.stripe.android.networking.a.C2612m) r0
            int r1 = r0.f26069f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26069f = r1
            goto L18
        L13:
            com.stripe.android.networking.a$m r0 = new com.stripe.android.networking.a$m
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f26067d
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26069f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L52
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            O5.t.b(r9)
            O5.s r9 = (O5.s) r9
            java.lang.Object r6 = r9.j()
            goto L85
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3a:
            java.lang.Object r6 = r0.f26066c
            r8 = r6
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r6 = r0.f26065b
            r7 = r6
            A2.j$c r7 = (A2.j.c) r7
            java.lang.Object r6 = r0.f26064a
            com.stripe.android.networking.a r6 = (com.stripe.android.networking.a) r6
            O5.t.b(r9)
            O5.s r9 = (O5.s) r9
            java.lang.Object r9 = r9.j()
            goto L65
        L52:
            O5.t.b(r9)
            r0.f26064a = r5
            r0.f26065b = r7
            r0.f26066c = r8
            r0.f26069f = r4
            java.lang.Object r9 = r5.d0(r6, r7, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            r6 = r5
        L65:
            java.lang.Throwable r2 = O5.s.e(r9)
            if (r2 != 0) goto L7d
            com.stripe.android.model.b r9 = (com.stripe.android.model.b) r9
            r2 = 0
            r0.f26064a = r2
            r0.f26065b = r2
            r0.f26066c = r2
            r0.f26069f = r3
            java.lang.Object r6 = r6.M(r9, r7, r8, r0)
            if (r6 != r1) goto L85
            return r1
        L7d:
            java.lang.Object r6 = O5.t.a(r2)
            java.lang.Object r6 = O5.s.b(r6)
        L85:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.v(com.stripe.android.model.b, A2.j$c, java.util.List, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(e3.s r12, A2.j.c r13, S5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.C2617r
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$r r0 = (com.stripe.android.networking.a.C2617r) r0
            int r1 = r0.f26082c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26082c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$r r0 = new com.stripe.android.networking.a$r
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f26080a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26082c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r14)
            O5.s r14 = (O5.s) r14
            java.lang.Object r12 = r14.j()
            goto L5f
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r14)
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r14 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r14.n()
            java.util.Map r7 = r12.a()
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            A2.j r12 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.p r13 = new f3.p
            r13.<init>()
            com.stripe.android.networking.a$s r14 = com.stripe.android.networking.a.C2618s.f26083a
            r0.f26082c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L5f
            return r1
        L5f:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.w(e3.s, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(java.lang.String r12, A2.j.c r13, S5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.stripe.android.networking.a.L
            if (r0 == 0) goto L13
            r0 = r14
            com.stripe.android.networking.a$L r0 = (com.stripe.android.networking.a.L) r0
            int r1 = r0.f25996c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25996c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$L r0 = new com.stripe.android.networking.a$L
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f25994a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f25996c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r14)
            O5.s r14 = (O5.s) r14
            java.lang.Object r12 = r14.j()
            goto L8c
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            O5.t.b(r14)
            O5.s$a r14 = O5.s.f8302b     // Catch: java.lang.Throwable -> L4a
            com.stripe.android.model.n$c r14 = new com.stripe.android.model.n$c     // Catch: java.lang.Throwable -> L4a
            r14.<init>(r12)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r14 = r14.b()     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r14 = O5.s.b(r14)     // Catch: java.lang.Throwable -> L4a
            goto L55
        L4a:
            r14 = move-exception
            O5.s$a r2 = O5.s.f8302b
            java.lang.Object r14 = O5.t.a(r14)
            java.lang.Object r14 = O5.s.b(r14)
        L55:
            java.lang.Throwable r2 = O5.s.e(r14)
            if (r2 != 0) goto L8d
            java.lang.String r14 = (java.lang.String) r14
            r11.T()
            A2.j$b r4 = r11.f25959m
            com.stripe.android.networking.a$b r2 = com.stripe.android.networking.a.f25945n
            java.lang.String r5 = r2.u(r14)
            java.util.List r14 = P5.AbstractC1378t.m()
            java.util.Map r7 = r11.N(r12, r14)
            r9 = 8
            r10 = 0
            r8 = 0
            r6 = r13
            A2.j r12 = A2.j.b.d(r4, r5, r6, r7, r8, r9, r10)
            f3.u r13 = new f3.u
            r13.<init>()
            com.stripe.android.networking.a$M r14 = new com.stripe.android.networking.a$M
            r14.<init>()
            r0.f25996c = r3
            java.lang.Object r12 = r11.P(r12, r13, r14, r0)
            if (r12 != r1) goto L8c
            return r1
        L8c:
            return r12
        L8d:
            java.lang.Object r12 = O5.t.a(r2)
            java.lang.Object r12 = O5.s.b(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.x(java.lang.String, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object y(e3.v r5, A2.j.c r6, S5.d r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.stripe.android.networking.a.S
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.networking.a$S r0 = (com.stripe.android.networking.a.S) r0
            int r1 = r0.f26012c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26012c = r1
            goto L18
        L13:
            com.stripe.android.networking.a$S r0 = new com.stripe.android.networking.a$S
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26010a
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f26012c
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            O5.t.b(r7)
            O5.s r7 = (O5.s) r7
            java.lang.Object r5 = r7.j()
            goto L44
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            O5.t.b(r7)
            r0.f26012c = r3
            r7 = 0
            java.lang.Object r5 = r4.f0(r5, r6, r7, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.y(e3.v, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // h3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object z(java.lang.String r17, A2.j.c r18, S5.d r19) {
        /*
            r16 = this;
            r7 = r16
            r0 = r19
            boolean r1 = r0 instanceof com.stripe.android.networking.a.C2611l
            if (r1 == 0) goto L18
            r1 = r0
            com.stripe.android.networking.a$l r1 = (com.stripe.android.networking.a.C2611l) r1
            int r2 = r1.f26063c
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f26063c = r2
        L16:
            r4 = r1
            goto L1e
        L18:
            com.stripe.android.networking.a$l r1 = new com.stripe.android.networking.a$l
            r1.<init>(r0)
            goto L16
        L1e:
            java.lang.Object r0 = r4.f26061a
            java.lang.Object r8 = T5.b.e()
            int r1 = r4.f26063c
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 != r2) goto L35
            O5.t.b(r0)
            O5.s r0 = (O5.s) r0
            java.lang.Object r0 = r0.j()
            goto L77
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            O5.t.b(r0)
            A2.j$b r9 = r7.f25959m
            com.stripe.android.networking.a$b r0 = com.stripe.android.networking.a.f25945n
            java.lang.String r1 = "3ds2/challenge_complete"
            java.lang.String r10 = com.stripe.android.networking.a.C2601b.b(r0, r1)
            java.lang.String r0 = "source"
            r1 = r17
            O5.r r0 = O5.x.a(r0, r1)
            java.util.Map r12 = P5.Q.e(r0)
            r14 = 8
            r15 = 0
            r13 = 0
            r11 = r18
            A2.j r1 = A2.j.b.d(r9, r10, r11, r12, r13, r14, r15)
            f3.D r3 = new f3.D
            r3.<init>()
            r4.f26063c = r2
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
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.z(java.lang.String, A2.j$c, S5.d):java.lang.Object");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(android.content.Context r20, kotlin.jvm.functions.Function0 r21, u2.C4056c r22, u2.InterfaceC4057d r23, S5.g r24, java.util.Set r25, A2.F r26, A2.InterfaceC0945c r27, m2.InterfaceC3423i r28, o2.InterfaceC3515b.a r29, com.stripe.android.networking.PaymentAnalyticsRequestFactory r30, h3.C2903e r31, java.util.Set r32, java.lang.String r33, java.lang.String r34, int r35, kotlin.jvm.internal.AbstractC3247p r36) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.networking.a.<init>(android.content.Context, kotlin.jvm.functions.Function0, u2.c, u2.d, S5.g, java.util.Set, A2.F, A2.c, m2.i, o2.b$a, com.stripe.android.networking.PaymentAnalyticsRequestFactory, h3.e, java.util.Set, java.lang.String, java.lang.String, int, kotlin.jvm.internal.p):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context appContext, Function0 publishableKeyProvider, g workContext, Set productUsageTokens, PaymentAnalyticsRequestFactory paymentAnalyticsRequestFactory, InterfaceC0945c analyticsRequestExecutor, InterfaceC4057d logger) {
        this(appContext, publishableKeyProvider, null, logger, workContext, productUsageTokens, null, analyticsRequestExecutor, null, null, paymentAnalyticsRequestFactory, null, null, null, null, 31556, null);
        AbstractC3255y.i(appContext, "appContext");
        AbstractC3255y.i(publishableKeyProvider, "publishableKeyProvider");
        AbstractC3255y.i(workContext, "workContext");
        AbstractC3255y.i(productUsageTokens, "productUsageTokens");
        AbstractC3255y.i(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC3255y.i(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC3255y.i(logger, "logger");
    }
}
