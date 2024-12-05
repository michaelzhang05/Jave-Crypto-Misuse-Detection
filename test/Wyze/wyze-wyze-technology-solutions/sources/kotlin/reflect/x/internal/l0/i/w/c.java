package kotlin.reflect.x.internal.l0.i.w;

import kotlin.reflect.x.internal.l0.i.w.d;

/* compiled from: MemberScope.kt */
/* loaded from: classes2.dex */
public abstract class c {

    /* compiled from: MemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class a extends c {
        public static final a a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final int f20909b;

        static {
            d.a aVar = d.a;
            f20909b = ((aVar.i() | aVar.d()) ^ (-1)) & aVar.b();
        }

        private a() {
        }

        @Override // kotlin.reflect.x.internal.l0.i.w.c
        public int a() {
            return f20909b;
        }
    }

    /* compiled from: MemberScope.kt */
    /* loaded from: classes2.dex */
    public static final class b extends c {
        public static final b a = new b();

        private b() {
        }

        @Override // kotlin.reflect.x.internal.l0.i.w.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
