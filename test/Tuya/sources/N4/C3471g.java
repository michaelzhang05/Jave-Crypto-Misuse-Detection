package n4;

import L5.I;
import L5.t;
import X5.n;
import androidx.compose.material.ModalBottomSheetState;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* renamed from: n4.g, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3471g {

    /* renamed from: e, reason: collision with root package name */
    public static final int f36159e = 8;

    /* renamed from: a, reason: collision with root package name */
    private final ModalBottomSheetState f36160a;

    /* renamed from: b, reason: collision with root package name */
    private final C3466b f36161b;

    /* renamed from: c, reason: collision with root package name */
    private a f36162c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36163d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: n4.g$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36164a = new a("Programmatically", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final a f36165b = new a("SwipedDownByUser", 1);

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f36166c;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ R5.a f36167d;

        static {
            a[] a8 = a();
            f36166c = a8;
            f36167d = R5.b.a(a8);
        }

        private a(String str, int i8) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f36164a, f36165b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f36166c.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.g$b */
    /* loaded from: classes4.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36168a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36169b;

        /* renamed from: d, reason: collision with root package name */
        int f36171d;

        b(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36169b = obj;
            this.f36171d |= Integer.MIN_VALUE;
            return C3471g.this.a(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.g$c */
    /* loaded from: classes4.dex */
    public static final class c extends AbstractC3160z implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C3471g.this.b().isVisible());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.g$d */
    /* loaded from: classes4.dex */
    public static final class d extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f36173a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f36174b;

        d(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            d dVar2 = new d(dVar);
            dVar2.f36174b = ((Boolean) obj).booleanValue();
            return dVar2;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (P5.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f36173a == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!this.f36174b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z8, P5.d dVar) {
            return ((d) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f6487a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.g$e */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36175a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36176b;

        /* renamed from: d, reason: collision with root package name */
        int f36178d;

        e(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36176b = obj;
            this.f36178d |= Integer.MIN_VALUE;
            return C3471g.this.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.g$f */
    /* loaded from: classes4.dex */
    public static final class f extends l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f36179a;

        f(P5.d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(P5.d dVar) {
            return new f(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(P5.d dVar) {
            return ((f) create(dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f36179a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ModalBottomSheetState b8 = C3471g.this.b();
                this.f36179a = 1;
                if (b8.hide(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.g$g, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0834g extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a, reason: collision with root package name */
        Object f36181a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36182b;

        /* renamed from: d, reason: collision with root package name */
        int f36184d;

        C0834g(P5.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36182b = obj;
            this.f36184d |= Integer.MIN_VALUE;
            return C3471g.this.e(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.g$h */
    /* loaded from: classes4.dex */
    public static final class h extends l implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        int f36185a;

        h(P5.d dVar) {
            super(1, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(P5.d dVar) {
            return new h(dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(P5.d dVar) {
            return ((h) create(dVar)).invokeSuspend(I.f6487a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = Q5.b.e();
            int i8 = this.f36185a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                ModalBottomSheetState b8 = C3471g.this.b();
                this.f36185a = 1;
                if (b8.show(this) == e8) {
                    return e8;
                }
            }
            return I.f6487a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.g$i */
    /* loaded from: classes4.dex */
    public static final class i extends AbstractC3160z implements Function0 {
        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(C3471g.this.b().isVisible());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n4.g$j */
    /* loaded from: classes4.dex */
    public static final class j extends l implements n {

        /* renamed from: a, reason: collision with root package name */
        int f36188a;

        /* renamed from: b, reason: collision with root package name */
        /* synthetic */ boolean f36189b;

        j(P5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final P5.d create(Object obj, P5.d dVar) {
            j jVar = new j(dVar);
            jVar.f36189b = ((Boolean) obj).booleanValue();
            return jVar;
        }

        @Override // X5.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (P5.d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Q5.b.e();
            if (this.f36188a == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f36189b);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z8, P5.d dVar) {
            return ((j) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f6487a);
        }
    }

    public C3471g(ModalBottomSheetState modalBottomSheetState, C3466b keyboardHandler) {
        AbstractC3159y.i(modalBottomSheetState, "modalBottomSheetState");
        AbstractC3159y.i(keyboardHandler, "keyboardHandler");
        this.f36160a = modalBottomSheetState;
        this.f36161b = keyboardHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(P5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof n4.C3471g.b
            if (r0 == 0) goto L13
            r0 = r6
            n4.g$b r0 = (n4.C3471g.b) r0
            int r1 = r0.f36171d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36171d = r1
            goto L18
        L13:
            n4.g$b r0 = new n4.g$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36169b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f36171d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r0 = r0.f36168a
            n4.g r0 = (n4.C3471g) r0
            L5.t.b(r6)
            goto L53
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L35:
            L5.t.b(r6)
            n4.g$c r6 = new n4.g$c
            r6.<init>()
            l6.f r6 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r6)
            n4.g$d r2 = new n4.g$d
            r4 = 0
            r2.<init>(r4)
            r0.f36168a = r5
            r0.f36171d = r3
            java.lang.Object r6 = l6.AbstractC3360h.v(r6, r2, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            r0 = r5
        L53:
            n4.g$a r6 = r0.f36162c
            if (r6 != 0) goto L59
            n4.g$a r6 = n4.C3471g.a.f36165b
        L59:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.C3471g.a(P5.d):java.lang.Object");
    }

    public final ModalBottomSheetState b() {
        return this.f36160a;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(P5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof n4.C3471g.e
            if (r0 == 0) goto L13
            r0 = r6
            n4.g$e r0 = (n4.C3471g.e) r0
            int r1 = r0.f36178d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36178d = r1
            goto L18
        L13:
            n4.g$e r0 = new n4.g$e
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f36176b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f36178d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            L5.t.b(r6)
            goto L73
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f36175a
            n4.g r2 = (n4.C3471g) r2
            L5.t.b(r6)
            goto L58
        L3c:
            L5.t.b(r6)
            boolean r6 = r5.f36163d
            if (r6 == 0) goto L46
            L5.I r6 = L5.I.f6487a
            return r6
        L46:
            n4.g$a r6 = n4.C3471g.a.f36164a
            r5.f36162c = r6
            n4.b r6 = r5.f36161b
            r0.f36175a = r5
            r0.f36178d = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            r2 = r5
        L58:
            androidx.compose.material.ModalBottomSheetState r6 = r2.f36160a
            boolean r6 = r6.isVisible()
            if (r6 == 0) goto L76
            n4.g$f r6 = new n4.g$f
            r4 = 0
            r6.<init>(r4)
            r0.f36175a = r4
            r0.f36178d = r3
            r2 = 10
            java.lang.Object r6 = n4.AbstractC3472h.a(r2, r6, r0)
            if (r6 != r1) goto L73
            return r1
        L73:
            L5.I r6 = L5.I.f6487a
            return r6
        L76:
            L5.I r6 = L5.I.f6487a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.C3471g.c(P5.d):java.lang.Object");
    }

    public final void d(boolean z8) {
        this.f36163d = z8;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(P5.d r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof n4.C3471g.C0834g
            if (r0 == 0) goto L13
            r0 = r7
            n4.g$g r0 = (n4.C3471g.C0834g) r0
            int r1 = r0.f36184d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36184d = r1
            goto L18
        L13:
            n4.g$g r0 = new n4.g$g
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36182b
            java.lang.Object r1 = Q5.b.e()
            int r2 = r0.f36184d
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            L5.t.b(r7)
            goto L6c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            java.lang.Object r2 = r0.f36181a
            n4.g r2 = (n4.C3471g) r2
            L5.t.b(r7)
            goto L53
        L3d:
            L5.t.b(r7)
            n4.g$h r7 = new n4.g$h
            r7.<init>(r5)
            r0.f36181a = r6
            r0.f36184d = r4
            r2 = 10
            java.lang.Object r7 = n4.AbstractC3472h.a(r2, r7, r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            r2 = r6
        L53:
            n4.g$i r7 = new n4.g$i
            r7.<init>()
            l6.f r7 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r7)
            n4.g$j r2 = new n4.g$j
            r2.<init>(r5)
            r0.f36181a = r5
            r0.f36184d = r3
            java.lang.Object r7 = l6.AbstractC3360h.v(r7, r2, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            L5.I r7 = L5.I.f6487a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.C3471g.e(P5.d):java.lang.Object");
    }
}
