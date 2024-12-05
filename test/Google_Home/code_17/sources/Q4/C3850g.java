package q4;

import O5.I;
import O5.t;
import a6.InterfaceC1668n;
import androidx.compose.material.ModalBottomSheetState;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* renamed from: q4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3850g {

    /* renamed from: e, reason: collision with root package name */
    public static final int f38287e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final ModalBottomSheetState f38288a;

    /* renamed from: b, reason: collision with root package name */
    private final C3845b f38289b;

    /* renamed from: c, reason: collision with root package name */
    private a f38290c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f38291d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: q4.g$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f38292a = new a("Programmatically", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f38293b = new a("SwipedDownByUser", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f38294c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ U5.a f38295d;

        static {
            a[] a8 = a();
            f38294c = a8;
            f38295d = U5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f38292a, f38293b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f38294c.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f38296a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38297b;

        /* renamed from: d, reason: collision with root package name */
        int f38299d;

        b(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38297b = obj;
            this.f38299d |= Integer.MIN_VALUE;
            return C3850g.this.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3256z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C3850g.this.b().isVisible());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f38301a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f38302b;

        d(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f38302b = ((Boolean) obj).booleanValue();
            return dVar2;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (S5.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f38301a == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!this.f38302b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z8, S5.d dVar) {
            return ((d) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.g$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f38303a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38304b;

        /* renamed from: d, reason: collision with root package name */
        int f38306d;

        e(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38304b = obj;
            this.f38306d |= Integer.MIN_VALUE;
            return C3850g.this.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.g$f */
    /* loaded from: classes4.dex */
    public static final class f extends l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f38307a;

        f(S5.d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(S5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(S5.d dVar) {
            return ((f) create(dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f38307a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ModalBottomSheetState b8 = C3850g.this.b();
                this.f38307a = 1;
                if (b8.hide(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0864g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f38309a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f38310b;

        /* renamed from: d, reason: collision with root package name */
        int f38312d;

        C0864g(S5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f38310b = obj;
            this.f38312d |= Integer.MIN_VALUE;
            return C3850g.this.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.g$h */
    /* loaded from: classes4.dex */
    public static final class h extends l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f38313a;

        h(S5.d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(S5.d dVar) {
            return new h(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(S5.d dVar) {
            return ((h) create(dVar)).invokeSuspend(I.f8278a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f38313a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ModalBottomSheetState b8 = C3850g.this.b();
                this.f38313a = 1;
                if (b8.show(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.g$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3256z implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C3850g.this.b().isVisible());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q4.g$j */
    /* loaded from: classes4.dex */
    public static final class j extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f38316a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f38317b;

        j(S5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final S5.d create(Object obj, S5.d dVar) {
            j jVar = new j(dVar);
            jVar.f38317b = ((Boolean) obj).booleanValue();
            return jVar;
        }

        @Override // a6.InterfaceC1668n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (S5.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T5.b.e();
            if (this.f38316a == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f38317b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z8, S5.d dVar) {
            return ((j) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8278a);
        }
    }

    public C3850g(ModalBottomSheetState modalBottomSheetState, C3845b keyboardHandler) {
        AbstractC3255y.i(modalBottomSheetState, "modalBottomSheetState");
        AbstractC3255y.i(keyboardHandler, "keyboardHandler");
        this.f38288a = modalBottomSheetState;
        this.f38289b = keyboardHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(S5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q4.C3850g.b
            if (r0 == 0) goto L13
            r0 = r6
            q4.g$b r0 = (q4.C3850g.b) r0
            int r1 = r0.f38299d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38299d = r1
            goto L18
        L13:
            q4.g$b r0 = new q4.g$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38297b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f38299d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f38296a
            q4.g r0 = (q4.C3850g) r0
            O5.t.b(r6)
            goto L53
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            O5.t.b(r6)
            q4.g$c r6 = new q4.g$c
            r6.<init>()
            o6.f r6 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r6)
            q4.g$d r2 = new q4.g$d
            r4 = 0
            r2.<init>(r4)
            r0.f38296a = r5
            r0.f38299d = r3
            java.lang.Object r6 = o6.AbstractC3708h.x(r6, r2, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            r0 = r5
        L53:
            q4.g$a r6 = r0.f38290c
            if (r6 != 0) goto L59
            q4.g$a r6 = q4.C3850g.a.f38293b
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C3850g.a(S5.d):java.lang.Object");
    }

    public final ModalBottomSheetState b() {
        return this.f38288a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(S5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof q4.C3850g.e
            if (r0 == 0) goto L13
            r0 = r6
            q4.g$e r0 = (q4.C3850g.e) r0
            int r1 = r0.f38306d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38306d = r1
            goto L18
        L13:
            q4.g$e r0 = new q4.g$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f38304b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f38306d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            O5.t.b(r6)
            goto L73
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f38303a
            q4.g r2 = (q4.C3850g) r2
            O5.t.b(r6)
            goto L58
        L3c:
            O5.t.b(r6)
            boolean r6 = r5.f38291d
            if (r6 == 0) goto L46
            O5.I r6 = O5.I.f8278a
            return r6
        L46:
            q4.g$a r6 = q4.C3850g.a.f38292a
            r5.f38290c = r6
            q4.b r6 = r5.f38289b
            r0.f38303a = r5
            r0.f38306d = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r2 = r5
        L58:
            androidx.compose.material.ModalBottomSheetState r6 = r2.f38288a
            boolean r6 = r6.isVisible()
            if (r6 == 0) goto L76
            q4.g$f r6 = new q4.g$f
            r4 = 0
            r6.<init>(r4)
            r0.f38303a = r4
            r0.f38306d = r3
            r2 = 10
            java.lang.Object r6 = q4.AbstractC3851h.a(r2, r6, r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            O5.I r6 = O5.I.f8278a
            return r6
        L76:
            O5.I r6 = O5.I.f8278a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C3850g.c(S5.d):java.lang.Object");
    }

    public final void d(boolean z8) {
        this.f38291d = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(S5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof q4.C3850g.C0864g
            if (r0 == 0) goto L13
            r0 = r7
            q4.g$g r0 = (q4.C3850g.C0864g) r0
            int r1 = r0.f38312d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38312d = r1
            goto L18
        L13:
            q4.g$g r0 = new q4.g$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f38310b
            java.lang.Object r1 = T5.b.e()
            int r2 = r0.f38312d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            O5.t.b(r7)
            goto L6c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f38309a
            q4.g r2 = (q4.C3850g) r2
            O5.t.b(r7)
            goto L53
        L3d:
            O5.t.b(r7)
            q4.g$h r7 = new q4.g$h
            r7.<init>(r5)
            r0.f38309a = r6
            r0.f38312d = r4
            r2 = 10
            java.lang.Object r7 = q4.AbstractC3851h.a(r2, r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            q4.g$i r7 = new q4.g$i
            r7.<init>()
            o6.f r7 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r7)
            q4.g$j r2 = new q4.g$j
            r2.<init>(r5)
            r0.f38309a = r5
            r0.f38312d = r3
            java.lang.Object r7 = o6.AbstractC3708h.x(r7, r2, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            O5.I r7 = O5.I.f8278a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C3850g.e(S5.d):java.lang.Object");
    }
}
