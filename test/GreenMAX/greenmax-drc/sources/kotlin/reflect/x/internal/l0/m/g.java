package kotlin.reflect.x.internal.l0.m;

import kotlin.jvm.internal.l;

/* compiled from: modifierChecks.kt */
/* loaded from: classes2.dex */
public abstract class g {
    private final boolean a;

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class a extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final a f21403b = new a();

        private a() {
            super(false, null);
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class b extends g {

        /* renamed from: b, reason: collision with root package name */
        private final String f21404b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(false, null);
            l.f(str, "error");
            this.f21404b = str;
        }
    }

    /* compiled from: modifierChecks.kt */
    /* loaded from: classes2.dex */
    public static final class c extends g {

        /* renamed from: b, reason: collision with root package name */
        public static final c f21405b = new c();

        private c() {
            super(true, null);
        }
    }

    private g(boolean z) {
        this.a = z;
    }

    public /* synthetic */ g(boolean z, kotlin.jvm.internal.g gVar) {
        this(z);
    }

    public final boolean a() {
        return this.a;
    }
}
