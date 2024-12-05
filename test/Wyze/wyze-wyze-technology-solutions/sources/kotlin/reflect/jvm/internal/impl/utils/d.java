package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.u;

/* compiled from: functions.kt */
/* loaded from: classes2.dex */
public final class d {
    private static final Function1<Object, Object> a = f.f22012f;

    /* renamed from: b, reason: collision with root package name */
    private static final Function1<Object, Boolean> f22002b = b.f22008f;

    /* renamed from: c, reason: collision with root package name */
    private static final Function1<Object, Object> f22003c = a.f22007f;

    /* renamed from: d, reason: collision with root package name */
    private static final Function1<Object, u> f22004d = c.f22009f;

    /* renamed from: e, reason: collision with root package name */
    private static final Function2<Object, Object, u> f22005e = C0377d.f22010f;

    /* renamed from: f, reason: collision with root package name */
    private static final Function3<Object, Object, Object, u> f22006f = e.f22011f;

    /* compiled from: functions.kt */
    /* loaded from: classes2.dex */
    static final class a extends Lambda implements Function1 {

        /* renamed from: f, reason: collision with root package name */
        public static final a f22007f = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: functions.kt */
    /* loaded from: classes2.dex */
    static final class b extends Lambda implements Function1<Object, Boolean> {

        /* renamed from: f, reason: collision with root package name */
        public static final b f22008f = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* compiled from: functions.kt */
    /* loaded from: classes2.dex */
    static final class c extends Lambda implements Function1<Object, u> {

        /* renamed from: f, reason: collision with root package name */
        public static final c f22009f = new c();

        c() {
            super(1);
        }

        public final void b(Object obj) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ u invoke(Object obj) {
            b(obj);
            return u.a;
        }
    }

    /* compiled from: functions.kt */
    /* renamed from: kotlin.reflect.jvm.internal.impl.utils.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static final class C0377d extends Lambda implements Function2<Object, Object, u> {

        /* renamed from: f, reason: collision with root package name */
        public static final C0377d f22010f = new C0377d();

        C0377d() {
            super(2);
        }

        public final void b(Object obj, Object obj2) {
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ u invoke(Object obj, Object obj2) {
            b(obj, obj2);
            return u.a;
        }
    }

    /* compiled from: functions.kt */
    /* loaded from: classes2.dex */
    static final class e extends Lambda implements Function3<Object, Object, Object, u> {

        /* renamed from: f, reason: collision with root package name */
        public static final e f22011f = new e();

        e() {
            super(3);
        }

        public final void b(Object obj, Object obj2, Object obj3) {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ u c(Object obj, Object obj2, Object obj3) {
            b(obj, obj2, obj3);
            return u.a;
        }
    }

    /* compiled from: functions.kt */
    /* loaded from: classes2.dex */
    static final class f extends Lambda implements Function1<Object, Object> {

        /* renamed from: f, reason: collision with root package name */
        public static final f f22012f = new f();

        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    public static final <T> Function1<T, Boolean> a() {
        return (Function1<T, Boolean>) f22002b;
    }

    public static final Function3<Object, Object, Object, u> b() {
        return f22006f;
    }
}
